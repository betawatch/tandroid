package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class WidgetConformanceActivity extends Activity {
    public TextView a;
    public ScrollView b;
    public Thread c;

    public static boolean a(Intent intent) {
        if (!intent.getBooleanExtra("clearHeights", false)) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                MessagesStorage.getInstance(i10).clearWidgetHeights();
            }
        }
        Log.i("WidgetConformance", "widget heights cleared");
        return true;
    }

    public final void b(Intent intent) {
        WidgetConformanceActivity widgetConformanceActivity;
        vh1 vh1Var;
        if (this.b == null) {
            this.a.setTypeface(Typeface.MONOSPACE);
            this.a.setTextSize(11.0f);
            int dp = AndroidUtilities.dp(12.0f);
            this.a.setPadding(dp, dp, dp, dp);
            ScrollView scrollView = new ScrollView(this);
            this.b = scrollView;
            scrollView.addView(this.a);
            setContentView(this.b);
        }
        int intExtra = intent.getIntExtra("width", 390);
        boolean booleanExtra = intent.getBooleanExtra("dark", false);
        String stringExtra = intent.getStringExtra("filter");
        String str = "attacks";
        boolean booleanExtra2 = intent.getBooleanExtra("attacks", false);
        TextView textView = this.a;
        StringBuilder sb2 = new StringBuilder();
        if (!booleanExtra2) {
            StringBuilder k10 = ic.a.k(intExtra, "conformance · width ", " · ");
            k10.append(booleanExtra ? "dark" : "light");
            str = k10.toString();
        }
        sb2.append(str);
        sb2.append(stringExtra != null ? " · ".concat(stringExtra) : "");
        sb2.append("\n");
        textView.setText(sb2.toString());
        hl0 hl0Var = new hl0(this, 27);
        if (booleanExtra2) {
            vh1Var = new vh1(new org.telegram.ui.Components.qa1(this, stringExtra, hl0Var), 1);
            widgetConformanceActivity = this;
        } else {
            widgetConformanceActivity = this;
            vh1Var = new vh1(new org.telegram.ui.Components.za1(widgetConformanceActivity, intExtra, booleanExtra, stringExtra, hl0Var), 2);
        }
        Thread thread = new Thread(vh1Var, "WidgetConformance");
        widgetConformanceActivity.c = thread;
        thread.start();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        ApplicationLoader.postInitApplication();
        super.onCreate(bundle);
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            finish();
        } else if (a(getIntent())) {
            finish();
        } else {
            this.a = new TextView(this);
            b(getIntent());
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        Thread thread = this.c;
        if (thread != null) {
            thread.interrupt();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (a(intent) || this.a == null) {
            return;
        }
        Thread thread = this.c;
        if (thread == null || !thread.isAlive()) {
            b(intent);
        }
    }
}
