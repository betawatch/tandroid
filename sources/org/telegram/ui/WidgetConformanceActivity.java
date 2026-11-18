package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                if (org.telegram.messenger.j10.i(i7).p()) {
                    org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(i7);
                    a02.a.c(new org.telegram.messenger.pq(a02, 1));
                }
            }
            Log.i("WidgetConformance", "widget heights cleared");
        }
    }
}
