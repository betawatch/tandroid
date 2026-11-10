package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
