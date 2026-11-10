package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class PopupReplyReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        t0.w();
        int intExtra = intent.getIntExtra("currentAccount", p10.s0);
        if (p10.r(intExtra)) {
            dt.k0.c(new rs(dt.t(intExtra), 0));
        }
    }
}
