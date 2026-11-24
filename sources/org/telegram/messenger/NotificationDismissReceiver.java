package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class NotificationDismissReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("currentAccount", y6c.t0);
            if (y6c.q(intExtra)) {
                long longExtra = intent.getLongExtra("dialogId", 0L);
                int intExtra2 = intent.getIntExtra("messageDate", 0);
                if (intent.hasExtra("story") && intent.getBooleanExtra("story", false)) {
                    im7.l0.c(new wl7(im7.n(intExtra), (byte) 10));
                    return;
                }
                if (intent.hasExtra("storyReaction") && intent.getBooleanExtra("storyReaction", false)) {
                    im7.l0.c(new wl7(im7.n(intExtra), (byte) 7));
                    return;
                }
                if (longExtra == 0) {
                    fa4.b("set dismissDate of global to " + intExtra2);
                    na7.q1(intExtra).W3.edit().putInt("dismissDate", intExtra2).commit();
                    return;
                }
                fa4.b("set dismissDate of " + longExtra + " to " + intExtra2);
                SharedPreferences.Editor edit = na7.q1(intExtra).W3.edit();
                StringBuilder sb = new StringBuilder("dismissDate");
                sb.append(longExtra);
                edit.putInt(sb.toString(), intExtra2).commit();
            }
        }
    }
}
