package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class NotificationCallbackReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        w0.w();
        int intExtra = intent.getIntExtra("currentAccount", d20.s0);
        if (d20.r(intExtra)) {
            long longExtra = intent.getLongExtra("did", 777000L);
            byte[] byteArrayExtra = intent.getByteArrayExtra("data");
            i0.g3(new rk(qz.C(intExtra), longExtra, intent.getIntExtra("mid", 0), byteArrayExtra, 10));
        }
    }
}
