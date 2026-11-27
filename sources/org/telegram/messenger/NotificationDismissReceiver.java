package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class NotificationDismissReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("currentAccount", yac.t0);
            if (yac.q(intExtra)) {
                long longExtra = intent.getLongExtra("dialogId", 0L);
                int intExtra2 = intent.getIntExtra("messageDate", 0);
                if (intent.hasExtra("story") && intent.getBooleanExtra("story", false)) {
                    ip7.l0.c(new vo7(ip7.n(intExtra), (byte) 8));
                    return;
                }
                if (intent.hasExtra("storyReaction") && intent.getBooleanExtra("storyReaction", false)) {
                    ip7.l0.c(new vo7(ip7.n(intExtra), (byte) 6));
                    return;
                }
                if (longExtra == 0) {
                    cc4.b("set dismissDate of global to " + intExtra2);
                    uc7.s1(intExtra).X3.edit().putInt("dismissDate", intExtra2).commit();
                    return;
                }
                cc4.b("set dismissDate of " + longExtra + " to " + intExtra2);
                SharedPreferences.Editor edit = uc7.s1(intExtra).X3.edit();
                StringBuilder sb = new StringBuilder("dismissDate");
                sb.append(longExtra);
                edit.putInt(sb.toString(), intExtra2).commit();
            }
        }
    }
}
