package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
