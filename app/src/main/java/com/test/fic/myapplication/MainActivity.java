package com.test.fic.myapplication;


import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public  static  final String EXTRA_MESSAGE  = "com.example.myfirstapp.MESSAGE";

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


//                Toast.makeText(MainActivity.this, "1111", Toast.LENGTH_LONG).show();
//
//                Intent intent = new Intent(MainActivity.this,DisplayMessageActivity.class);
//                EditText editText = (EditText) findViewById(R.id.editText);
//                String message = editText.getText().toString();
//                intent.putExtra(EXTRA_MESSAGE, message);
//                startActivity(intent);


//                /*intent 查看地图*/
//                Uri location = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California");
//                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
//                PackageManager packageManager = getPackageManager();
//                List<ResolveInfo> activities = packageManager.queryIntentActivities(mapIntent, 0);
//                boolean isIntentSafe = activities.size() > 0;
//                if (isIntentSafe){
//                    startActivity(mapIntent);
//                }

                /*显示分享app的选择界面*/
//                Intent intent = new Intent(Intent.ACTION_SEND);
//
//                String title = getResources().getString(R.string.chooser_title);
//                Intent chooser = Intent.createChooser(intent, title);
//                startActivity(chooser);

                /*分享文本内容*/
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });




    }



}
