package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class NotificationCallbackReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            a.v();
            int intExtra = intent.getIntExtra("currentAccount", yac.t0);
            if (yac.q(intExtra)) {
                long longExtra = intent.getLongExtra("did", 777000L);
                byte[] byteArrayExtra = intent.getByteArrayExtra("data");
                hl.c3(new r77((Object) r7a.B(intExtra), longExtra, intent.getIntExtra("mid", 0), (Object) byteArrayExtra, (byte) 17));
            }
        }
    }
}
