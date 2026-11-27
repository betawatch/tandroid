package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
                    jf7 Y = jf7.Y(i);
                    Y.a.c(new be7(Y, (byte) 1));
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
