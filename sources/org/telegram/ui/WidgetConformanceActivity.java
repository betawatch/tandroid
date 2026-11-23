package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class WidgetConformanceActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.t0.w();
        super.onCreate(bundle);
        boolean z10 = org.telegram.messenger.s2.a;
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
            for (int i7 = 0; i7 < 4; i7++) {
                if (org.telegram.messenger.k10.i(i7).p()) {
                    org.telegram.messenger.ur a02 = org.telegram.messenger.ur.a0(i7);
                    a02.a.c(new org.telegram.messenger.qq(a02, 1));
                }
            }
            Log.i("WidgetConformance", "widget heights cleared");
        }
    }
}
