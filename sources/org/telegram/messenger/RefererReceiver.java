package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
