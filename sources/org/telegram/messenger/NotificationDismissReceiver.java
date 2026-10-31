package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class NotificationDismissReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", d20.s0);
        if (d20.r(intExtra)) {
            long longExtra = intent.getLongExtra("dialogId", 0L);
            int intExtra2 = intent.getIntExtra("messageDate", 0);
            if (intent.hasExtra("story") && intent.getBooleanExtra("story", false)) {
                ot.k0.c(new at(ot.t(intExtra), 11));
                return;
            }
            if (intent.hasExtra("storyReaction") && intent.getBooleanExtra("storyReaction", false)) {
                ot.k0.c(new at(ot.t(intExtra), 8));
                return;
            }
            if (longExtra == 0) {
                f8.b("set dismissDate of global to " + intExtra2);
                vp.r1(intExtra).e7.edit().putInt("dismissDate", intExtra2).commit();
                return;
            }
            f8.b("set dismissDate of " + longExtra + " to " + intExtra2);
            SharedPreferences.Editor edit = vp.r1(intExtra).e7.edit();
            StringBuilder sb2 = new StringBuilder("dismissDate");
            sb2.append(longExtra);
            edit.putInt(sb2.toString(), intExtra2).commit();
        }
    }
}
