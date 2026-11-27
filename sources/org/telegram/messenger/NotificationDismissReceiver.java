package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
                    uc7.s1(intExtra).W3.edit().putInt("dismissDate", intExtra2).commit();
                    return;
                }
                cc4.b("set dismissDate of " + longExtra + " to " + intExtra2);
                SharedPreferences.Editor edit = uc7.s1(intExtra).W3.edit();
                StringBuilder sb = new StringBuilder("dismissDate");
                sb.append(longExtra);
                edit.putInt(sb.toString(), intExtra2).commit();
            }
        }
    }
}
