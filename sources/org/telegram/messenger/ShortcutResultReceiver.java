package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", d20.s0);
        q20 q20Var = (q20) ui.b0(intExtra).o1.remove(intent.getStringExtra("req_id"));
        if (q20Var != null) {
            i0.g3(new pf(q20Var, 9));
        }
    }
}
