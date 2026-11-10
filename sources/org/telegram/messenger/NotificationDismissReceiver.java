package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class NotificationDismissReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", p10.s0);
        if (p10.r(intExtra)) {
            long longExtra = intent.getLongExtra("dialogId", 0L);
            int intExtra2 = intent.getIntExtra("messageDate", 0);
            if (intent.hasExtra("story") && intent.getBooleanExtra("story", false)) {
                dt.k0.c(new rs(dt.t(intExtra), 10));
                return;
            }
            if (intent.hasExtra("storyReaction") && intent.getBooleanExtra("storyReaction", false)) {
                dt.k0.c(new rs(dt.t(intExtra), 6));
                return;
            }
            if (longExtra == 0) {
                a8.b("set dismissDate of global to " + intExtra2);
                qp.s1(intExtra).d7.edit().putInt("dismissDate", intExtra2).commit();
                return;
            }
            a8.b("set dismissDate of " + longExtra + " to " + intExtra2);
            SharedPreferences.Editor edit = qp.s1(intExtra).d7.edit();
            StringBuilder sb2 = new StringBuilder("dismissDate");
            sb2.append(longExtra);
            edit.putInt(sb2.toString(), intExtra2).commit();
        }
    }
}
