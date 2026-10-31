package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class WidgetConformanceActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.w0.w();
        super.onCreate(bundle);
        boolean z10 = org.telegram.messenger.v2.a;
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
            for (int i10 = 0; i10 < 4; i10++) {
                if (org.telegram.messenger.d20.i(i10).p()) {
                    org.telegram.messenger.hs a02 = org.telegram.messenger.hs.a0(i10);
                    a02.a.c(new org.telegram.messenger.br(a02, 1));
                }
            }
            Log.i("WidgetConformance", "widget heights cleared");
        }
    }
}
