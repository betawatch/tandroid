package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class RefererReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            na7 q1 = na7.q1(y6c.t0);
            String string = intent.getExtras().getString("referrer");
            if (string != null) {
                q1.t3 = string;
                q1.X3.edit().putString("installReferer", string).commit();
            }
        } catch (Exception unused) {
        }
    }
}
