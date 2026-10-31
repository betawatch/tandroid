package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class RefererReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            vp r12 = vp.r1(d20.s0);
            String string = intent.getExtras().getString("referrer");
            if (string == null) {
                return;
            }
            r12.T3 = string;
            r12.f7.edit().putString("installReferer", string).commit();
        } catch (Exception unused) {
        }
    }
}
