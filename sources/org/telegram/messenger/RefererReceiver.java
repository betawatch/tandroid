package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class RefererReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            np s12 = np.s1(m10.t0);
            String string = intent.getExtras().getString("referrer");
            if (string == null) {
                return;
            }
            s12.S3 = string;
            s12.f7.edit().putString("installReferer", string).commit();
        } catch (Exception unused) {
        }
    }
}
