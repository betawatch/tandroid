package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class NotificationCallbackReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        t0.w();
        int intExtra = intent.getIntExtra("currentAccount", m10.t0);
        if (m10.r(intExtra)) {
            long longExtra = intent.getLongExtra("did", 777000L);
            byte[] byteArrayExtra = intent.getByteArrayExtra("data");
            g0.h3(new fk(ez.C(intExtra), longExtra, intent.getIntExtra("mid", 0), byteArrayExtra, 10));
        }
    }
}
