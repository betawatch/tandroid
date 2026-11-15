package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class NotificationDismissReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", m10.t0);
        if (m10.r(intExtra)) {
            long longExtra = intent.getLongExtra("dialogId", 0L);
            int intExtra2 = intent.getIntExtra("messageDate", 0);
            if (intent.hasExtra("story") && intent.getBooleanExtra("story", false)) {
                at.l0.c(new os(at.t(intExtra), 10));
                return;
            }
            if (intent.hasExtra("storyReaction") && intent.getBooleanExtra("storyReaction", false)) {
                at.l0.c(new os(at.t(intExtra), 6));
                return;
            }
            if (longExtra == 0) {
                a8.b("set dismissDate of global to " + intExtra2);
                np.s1(intExtra).e7.edit().putInt("dismissDate", intExtra2).commit();
                return;
            }
            a8.b("set dismissDate of " + longExtra + " to " + intExtra2);
            SharedPreferences.Editor edit = np.s1(intExtra).e7.edit();
            StringBuilder sb2 = new StringBuilder("dismissDate");
            sb2.append(longExtra);
            edit.putInt(sb2.toString(), intExtra2).commit();
        }
    }
}
