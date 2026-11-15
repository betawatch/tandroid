package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", m10.t0);
        z10 z10Var = (z10) si.b0(intExtra).p1.remove(intent.getStringExtra("req_id"));
        if (z10Var != null) {
            g0.h3(new qf(z10Var, 9));
        }
    }
}
