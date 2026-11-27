package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class RefererReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            uc7 s1 = uc7.s1(yac.t0);
            String string = intent.getExtras().getString("referrer");
            if (string != null) {
                s1.t3 = string;
                s1.X3.edit().putString("installReferer", string).commit();
            }
        } catch (Exception unused) {
        }
    }
}
