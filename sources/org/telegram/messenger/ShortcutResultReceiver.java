package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", yac.t0);
        pcc pccVar = (pcc) ls6.d0(intExtra).p1.remove(intent.getStringExtra("req_id"));
        if (pccVar != null) {
            hl.c3(new jn0(pccVar, (byte) 13));
        }
    }
}
