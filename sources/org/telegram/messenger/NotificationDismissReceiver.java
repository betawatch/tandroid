package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
