package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", i10.t0);
        w10 w10Var = (w10) ri.d0(intExtra).p1.remove(intent.getStringExtra("req_id"));
        if (w10Var != null) {
            g0.g3(new fg(w10Var, 9));
        }
    }
}
