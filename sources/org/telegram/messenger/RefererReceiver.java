package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public class RefererReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            np u12 = np.u1(k10.t0);
            String string = intent.getExtras().getString("referrer");
            if (string == null) {
                return;
            }
            u12.U3 = string;
            u12.h7.edit().putString("installReferer", string).commit();
        } catch (Exception unused) {
        }
    }
}
