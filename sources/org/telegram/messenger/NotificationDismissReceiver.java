package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class NotificationDismissReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", e20.s0);
        if (e20.r(intExtra)) {
            long longExtra = intent.getLongExtra("dialogId", 0L);
            int intExtra2 = intent.getIntExtra("messageDate", 0);
            if (intent.hasExtra("story") && intent.getBooleanExtra("story", false)) {
                pt.k0.c(new bt(pt.t(intExtra), 11));
                return;
            }
            if (intent.hasExtra("storyReaction") && intent.getBooleanExtra("storyReaction", false)) {
                pt.k0.c(new bt(pt.t(intExtra), 8));
                return;
            }
            if (longExtra == 0) {
                f8.b("set dismissDate of global to " + intExtra2);
                wp.r1(intExtra).e7.edit().putInt("dismissDate", intExtra2).commit();
                return;
            }
            f8.b("set dismissDate of " + longExtra + " to " + intExtra2);
            SharedPreferences.Editor edit = wp.r1(intExtra).e7.edit();
            StringBuilder sb2 = new StringBuilder("dismissDate");
            sb2.append(longExtra);
            edit.putInt(sb2.toString(), intExtra2).commit();
        }
    }
}
