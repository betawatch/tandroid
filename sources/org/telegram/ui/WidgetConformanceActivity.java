package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class WidgetConformanceActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.a.v();
        super.onCreate(bundle);
        boolean z = f11.a;
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("clearHeights", false)) {
            for (int i = 0; i < 4; i++) {
                if (yac.h(i).o()) {
                    kf7 a0 = kf7.a0(i);
                    a0.a.c(new hd7(a0, (byte) 4));
                }
            }
            Log.i("WidgetConformance", "widget heights cleared");
            return;
        }
        if (intent.getStringExtra("profile") == null) {
            return;
        }
        long longExtra = intent.getLongExtra("bot", 0L);
        String stringExtra = intent.getStringExtra("botUsername");
        if (longExtra == 0 && stringExtra != null) {
            uc7.s1(yac.t0).c2(stringExtra);
        }
        boolean z = f11.a;
    }
}
