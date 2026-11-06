package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class RefererReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            qp s12 = qp.s1(p10.s0);
            String string = intent.getExtras().getString("referrer");
            if (string == null) {
                return;
            }
            s12.R3 = string;
            s12.e7.edit().putString("installReferer", string).commit();
        } catch (Exception unused) {
        }
    }
}
