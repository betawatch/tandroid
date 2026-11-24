package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class NotificationCallbackReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            a.v();
            int intExtra = intent.getIntExtra("currentAccount", z8c.t0);
            if (z8c.q(intExtra)) {
                long longExtra = intent.getLongExtra("did", 777000L);
                byte[] byteArrayExtra = intent.getByteArrayExtra("data");
                gm.c3(new o77((Object) a6a.B(intExtra), longExtra, intent.getIntExtra("mid", 0), (Object) byteArrayExtra, (byte) 17));
            }
        }
    }
}
