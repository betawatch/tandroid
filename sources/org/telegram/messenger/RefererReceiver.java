package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
