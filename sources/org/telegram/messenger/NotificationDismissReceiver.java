package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class NotificationDismissReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("currentAccount", z8c.t0);
            if (z8c.q(intExtra)) {
                long longExtra = intent.getLongExtra("dialogId", 0L);
                int intExtra2 = intent.getIntExtra("messageDate", 0);
                if (intent.hasExtra("story") && intent.getBooleanExtra("story", false)) {
                    lo7.l0.c(new zn7(lo7.n(intExtra), (byte) 10));
                    return;
                }
                if (intent.hasExtra("storyReaction") && intent.getBooleanExtra("storyReaction", false)) {
                    lo7.l0.c(new zn7(lo7.n(intExtra), (byte) 7));
                    return;
                }
                if (longExtra == 0) {
                    fc4.b("set dismissDate of global to " + intExtra2);
                    oc7.r1(intExtra).W3.edit().putInt("dismissDate", intExtra2).commit();
                    return;
                }
                fc4.b("set dismissDate of " + longExtra + " to " + intExtra2);
                SharedPreferences.Editor edit = oc7.r1(intExtra).W3.edit();
                StringBuilder sb = new StringBuilder("dismissDate");
                sb.append(longExtra);
                edit.putInt(sb.toString(), intExtra2).commit();
            }
        }
    }
}
