package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class PopupReplyReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        w0.w();
        int intExtra = intent.getIntExtra("currentAccount", e20.s0);
        if (e20.r(intExtra)) {
            pt.k0.c(new bt(pt.t(intExtra), 1));
        }
    }
}
