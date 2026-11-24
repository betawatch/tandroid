package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class WidgetConformanceActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.a.v();
        super.onCreate(bundle);
        boolean z = w01.a;
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
                if (y6c.h(i).o()) {
                    ad7 Y = ad7.Y(i);
                    Y.a.c(new vb7(Y, (byte) 1));
                }
            }
            Log.i("WidgetConformance", "widget heights cleared");
        }
    }
}
