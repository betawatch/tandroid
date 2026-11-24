package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class WidgetConformanceActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.a.v();
        super.onCreate(bundle);
        boolean z = e21.a;
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
                if (z8c.h(i).o()) {
                    cf7 Y = cf7.Y(i);
                    Y.a.c(new xd7(Y, (byte) 1));
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
            oc7.r1(z8c.t0).b2(stringExtra);
        }
        boolean z = e21.a;
    }
}
