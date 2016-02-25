package com.example.yuriyya.myapplication.test;

import com.example.yuriyya.myapplication.MainActivity;
import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


public class testSuperOne extends ActivityInstrumentationTestCase2<MainActivity> {
  	private Solo solo;
  	
  	public testSuperOne() {
		super(MainActivity.class);
  	}

  	public void setUp() throws Exception {
        super.setUp();
		solo = new Solo(getInstrumentation());
		getActivity();
  	}
  
   	@Override
   	public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
  	}
  
	public void testRun() {
        //Wait for activity: 'com.example.yuriyya.myapplication.MainActivity'
		solo.waitForActivity(com.example.yuriyya.myapplication.MainActivity.class, 2000);
        //Set default small timeout to 36111 milliseconds
		Timeout.setSmallTimeout(36111);
        //Assert that: 'Hello World!' is shown
		assertTrue("'Hello World!' is not shown!", solo.waitForView(solo.getView(com.example.yuriyya.myapplication.R.id.textView)));
        //Click on New Button
		solo.clickOnView(solo.getView(com.example.yuriyya.myapplication.R.id.button));
        //Click on New Button
		solo.clickOnView(solo.getView(com.example.yuriyya.myapplication.R.id.button));
        //Click on New RadioButton
		solo.clickOnView(solo.getView(com.example.yuriyya.myapplication.R.id.radioButton));
        //Click on New CheckBox
		solo.clickOnView(solo.getView(com.example.yuriyya.myapplication.R.id.checkBox));
        //Click on New CheckBox
		solo.clickOnView(solo.getView(com.example.yuriyya.myapplication.R.id.checkBox));
        //Click on New Switch
		solo.clickOnView(solo.getView(com.example.yuriyya.myapplication.R.id.switch1));
        //Click on New Switch
		solo.clickOnView(solo.getView(com.example.yuriyya.myapplication.R.id.switch1));
        //Click on New Switch
		solo.clickOnView(solo.getView(com.example.yuriyya.myapplication.R.id.switch1));
        //Click on Empty Text View
		solo.clickOnView(solo.getView(com.example.yuriyya.myapplication.R.id.editText));
        //Enter the text: 'testword ff'
		solo.clearEditText((android.widget.EditText) solo.getView(com.example.yuriyya.myapplication.R.id.editText));
		solo.enterText((android.widget.EditText) solo.getView(com.example.yuriyya.myapplication.R.id.editText), "testwordff");
        //Click on Empty Text View
		solo.clickOnView(solo.getView(com.example.yuriyya.myapplication.R.id.editText2));
        //                          Press menu back key
		//solo.goBack();
        //Wait for activity: 'com.example.yuriyya.myapplication.MainActivity'
		//assertTrue("com.example.yuriyya.myapplication.MainActivity is not found!", solo.waitForActivity(com.example.yuriyya.myapplication.MainActivity.class));
        //Click on Empty Text View
		solo.clickOnView(solo.getView(com.example.yuriyya.myapplication.R.id.editText));
        //Enter the text: 'restart testword'
		solo.clearEditText((android.widget.EditText) solo.getView(com.example.yuriyya.myapplication.R.id.editText));
		solo.enterText((android.widget.EditText) solo.getView(com.example.yuriyya.myapplication.R.id.editText), "restart testword");
        //Click on Empty Text View
		solo.clickOnView(solo.getView(com.example.yuriyya.myapplication.R.id.editText2));
        //Enter the text: 'ryuuj@fgh'
		solo.clearEditText((android.widget.EditText) solo.getView(com.example.yuriyya.myapplication.R.id.editText2));
		solo.enterText((android.widget.EditText) solo.getView(com.example.yuriyya.myapplication.R.id.editText2), "ryuuj@fgh");
        //Press next button
		solo.pressSoftKeyboardNextButton();
        //Click on restart testword
		solo.clickOnView(solo.getView(com.example.yuriyya.myapplication.R.id.editText));
        //Click on New Button
		solo.clickOnView(solo.getView(com.example.yuriyya.myapplication.R.id.button));
        //Press menu back key
		//solo.goBack();
        //Wait for activity: 'com.example.yuriyya.myapplication.MainActivity'
		//assertTrue("com.example.yuriyya.myapplication.MainActivity is not found!", solo.waitForActivity(com.example.yuriyya.myapplication.MainActivity.class));
        //Click on ImageView
		solo.clickOnView(solo.getView(com.example.yuriyya.myapplication.R.id.fab));
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 0));
        //Click on Settings
		solo.clickInList(1, 0);
        //Assert that: 'My Application' is shown
		assertTrue("'My Application' is not shown!", solo.waitForText(java.util.regex.Pattern.quote("My Application"), 1, 20000, true, true));
        //Press menu back key
		//solo.goBack();
        //Wait for activity: 'com.example.yuriyya.myapplication.MainActivity'
		//assertTrue("com.example.yuriyya.myapplication.MainActivity is not found!", solo.waitForActivity(com.example.yuriyya.myapplication.MainActivity.class));
        //Rotate the screen
		solo.setActivityOrientation(Solo.LANDSCAPE);
        //Rotate the screen
		solo.setActivityOrientation(Solo.PORTRAIT);
	}
}
