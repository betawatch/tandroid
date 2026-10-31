package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class PopupReplyReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        w0.w();
        int intExtra = intent.getIntExtra("currentAccount", d20.s0);
        if (d20.r(intExtra)) {
            ot.k0.c(new at(ot.t(intExtra), 1));
        }
    }
}
