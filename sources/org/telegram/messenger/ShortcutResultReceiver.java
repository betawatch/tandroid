package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", p10.s0);
        c20 c20Var = (c20) ui.b0(intExtra).o1.remove(intent.getStringExtra("req_id"));
        if (c20Var != null) {
            g0.h3(new rf(c20Var, 9));
        }
    }
}
