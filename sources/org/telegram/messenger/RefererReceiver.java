package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public class RefererReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            mp u12 = mp.u1(j10.t0);
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
