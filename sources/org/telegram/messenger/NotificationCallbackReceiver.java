package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class NotificationCallbackReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            a.v();
            int intExtra = intent.getIntExtra("currentAccount", y6c.t0);
            if (y6c.q(intExtra)) {
                long longExtra = intent.getLongExtra("did", 777000L);
                byte[] byteArrayExtra = intent.getByteArrayExtra("data");
                gl.c3(new o57((Object) z3a.B(intExtra), longExtra, intent.getIntExtra("mid", 0), (Object) byteArrayExtra, (byte) 17));
            }
        }
    }
}
