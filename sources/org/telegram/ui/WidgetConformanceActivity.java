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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        xh1 xh1Var;
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
        jl0 jl0Var = new jl0(this, 27);
        if (booleanExtra2) {
            xh1Var = new xh1(new org.telegram.ui.Components.ra1(this, stringExtra, jl0Var), 1);
            widgetConformanceActivity = this;
        } else {
            widgetConformanceActivity = this;
            xh1Var = new xh1(new org.telegram.ui.Components.ab1(widgetConformanceActivity, intExtra, booleanExtra, stringExtra, jl0Var), 2);
        }
        Thread thread = new Thread(xh1Var, "WidgetConformance");
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
