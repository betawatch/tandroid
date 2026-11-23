package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
