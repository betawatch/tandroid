package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class NotificationsDisabledReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_ID");
            boolean booleanExtra = intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false);
            if (TextUtils.isEmpty(stringExtra) || stringExtra.contains("_ia_")) {
                return;
            }
            String[] split = stringExtra.split("_");
            if (split.length < 3) {
                return;
            }
            t0.w();
            int intValue = Utilities.z(split[0]).intValue();
            if (intValue < 0 || intValue >= 4) {
                return;
            }
            if (r2.a) {
                a8.b("received disabled notification channel event for " + stringExtra + " state = " + booleanExtra);
            }
            if (SystemClock.elapsedRealtime() - dt.t(c.a(intValue).a).O <= 1000) {
                if (r2.a) {
                    a8.b("received disable notification event right after creating notification channel, ignoring");
                    return;
                }
                return;
            }
            SharedPreferences c10 = c.a(intValue).c();
            boolean startsWith = split[1].startsWith("channel");
            int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (startsWith) {
                if (!stringExtra.equals(c10.getString("channels", null))) {
                    return;
                }
                if (r2.a) {
                    a8.b("apply channel{channel} " + stringExtra + " state");
                }
                c10.edit().putInt(dt.q(2), booleanExtra ? Integer.MAX_VALUE : 0).commit();
                dt.t(c.a(intValue).a).b0(2);
            } else if (split[1].startsWith("groups")) {
                if (!stringExtra.equals(c10.getString("groups", null))) {
                    return;
                }
                if (r2.a) {
                    a8.b("apply channel{groups} " + stringExtra + " state");
                }
                SharedPreferences.Editor edit = c10.edit();
                String q10 = dt.q(0);
                if (!booleanExtra) {
                    i7 = 0;
                }
                edit.putInt(q10, i7).commit();
                dt.t(c.a(intValue).a).b0(0);
            } else if (split[1].startsWith("private")) {
                if (!stringExtra.equals(c10.getString("private", null))) {
                    return;
                }
                if (r2.a) {
                    a8.b("apply channel{private} " + stringExtra + " state");
                }
                c10.edit().putInt(dt.q(1), booleanExtra ? Integer.MAX_VALUE : 0).commit();
                dt.t(c.a(intValue).a).b0(1);
            } else if (!split[1].startsWith("stories")) {
                long longValue = Utilities.A(split[1]).longValue();
                if (longValue == 0) {
                    return;
                }
                String v = dt.v(longValue, 0, false);
                if (!stringExtra.equals(c10.getString("org.telegram.key" + longValue, null))) {
                    return;
                }
                if (r2.a) {
                    a8.b("apply channel{else} " + stringExtra + " state");
                }
                SharedPreferences.Editor edit2 = c10.edit();
                edit2.putInt(rf.b.i("notify2_", v), booleanExtra ? 2 : 0);
                if (!booleanExtra) {
                    edit2.remove("notifyuntil_" + v);
                }
                edit2.commit();
                dt.t(c.a(intValue).a).c0(longValue, 0L, true);
            } else {
                if (!stringExtra.equals(c10.getString("stories", null))) {
                    return;
                }
                if (r2.a) {
                    a8.b("apply channel{stories} " + stringExtra + " state");
                }
                c10.edit().putBoolean(dt.q(3), !booleanExtra).commit();
                dt.t(c.a(intValue).a).b0(1);
            }
            ConnectionsManager.getInstance(c.a(intValue).a).resumeNetworkMaybe();
        }
    }
}
