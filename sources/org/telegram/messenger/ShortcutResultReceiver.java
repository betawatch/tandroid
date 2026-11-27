package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
