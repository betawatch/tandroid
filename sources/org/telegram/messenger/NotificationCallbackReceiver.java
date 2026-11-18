package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class NotificationCallbackReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        t0.w();
        int intExtra = intent.getIntExtra("currentAccount", j10.t0);
        if (j10.r(intExtra)) {
            long longExtra = intent.getLongExtra("did", 777000L);
            byte[] byteArrayExtra = intent.getByteArrayExtra("data");
            g0.g3(new ek(zy.C(intExtra), longExtra, intent.getIntExtra("mid", 0), byteArrayExtra, 10));
        }
    }
}
