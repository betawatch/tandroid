package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
            w0.w();
            int intValue = Utilities.z(split[0]).intValue();
            if (intValue < 0 || intValue >= 4) {
                return;
            }
            if (v2.a) {
                f8.b("received disabled notification channel event for " + stringExtra + " state = " + booleanExtra);
            }
            if (SystemClock.elapsedRealtime() - pt.t(c.a(intValue).a).O <= 1000) {
                if (v2.a) {
                    f8.b("received disable notification event right after creating notification channel, ignoring");
                    return;
                }
                return;
            }
            SharedPreferences c10 = c.a(intValue).c();
            boolean startsWith = split[1].startsWith("channel");
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (startsWith) {
                if (!stringExtra.equals(c10.getString("channels", null))) {
                    return;
                }
                if (v2.a) {
                    f8.b("apply channel{channel} " + stringExtra + " state");
                }
                c10.edit().putInt(pt.q(2), booleanExtra ? Integer.MAX_VALUE : 0).commit();
                pt.t(c.a(intValue).a).b0(2);
            } else if (split[1].startsWith("groups")) {
                if (!stringExtra.equals(c10.getString("groups", null))) {
                    return;
                }
                if (v2.a) {
                    f8.b("apply channel{groups} " + stringExtra + " state");
                }
                SharedPreferences.Editor edit = c10.edit();
                String q6 = pt.q(0);
                if (!booleanExtra) {
                    i10 = 0;
                }
                edit.putInt(q6, i10).commit();
                pt.t(c.a(intValue).a).b0(0);
            } else if (split[1].startsWith("private")) {
                if (!stringExtra.equals(c10.getString("private", null))) {
                    return;
                }
                if (v2.a) {
                    f8.b("apply channel{private} " + stringExtra + " state");
                }
                c10.edit().putInt(pt.q(1), booleanExtra ? Integer.MAX_VALUE : 0).commit();
                pt.t(c.a(intValue).a).b0(1);
            } else if (!split[1].startsWith("stories")) {
                long longValue = Utilities.A(split[1]).longValue();
                if (longValue == 0) {
                    return;
                }
                String v = pt.v(longValue, 0, false);
                if (!stringExtra.equals(c10.getString("org.telegram.key" + longValue, null))) {
                    return;
                }
                if (v2.a) {
                    f8.b("apply channel{else} " + stringExtra + " state");
                }
                SharedPreferences.Editor edit2 = c10.edit();
                edit2.putInt(sc.e.h("notify2_", v), booleanExtra ? 2 : 0);
                if (!booleanExtra) {
                    edit2.remove("notifyuntil_" + v);
                }
                edit2.commit();
                pt.t(c.a(intValue).a).c0(longValue, 0L, true);
            } else {
                if (!stringExtra.equals(c10.getString("stories", null))) {
                    return;
                }
                if (v2.a) {
                    f8.b("apply channel{stories} " + stringExtra + " state");
                }
                c10.edit().putBoolean(pt.q(3), !booleanExtra).commit();
                pt.t(c.a(intValue).a).b0(1);
            }
            ConnectionsManager.getInstance(c.a(intValue).a).resumeNetworkMaybe();
        }
    }
}
