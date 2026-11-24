package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
            if (split.length >= 3) {
                a.v();
                int intValue = Utilities.z(split[0]).intValue();
                if (intValue < 0 || intValue >= 4) {
                    return;
                }
                if (w01.a) {
                    fa4.b("received disabled notification channel event for " + stringExtra + " state = " + booleanExtra);
                }
                if (SystemClock.elapsedRealtime() - im7.n(j5.a(intValue).a).P <= 1000) {
                    if (w01.a) {
                        fa4.b("received disable notification event right after creating notification channel, ignoring");
                        return;
                    }
                    return;
                }
                SharedPreferences d = j5.a(intValue).d();
                boolean startsWith = split[1].startsWith("channel");
                int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (startsWith) {
                    if (!stringExtra.equals(d.getString("channels", null))) {
                        return;
                    }
                    if (w01.a) {
                        fa4.b("apply channel{channel} " + stringExtra + " state");
                    }
                    d.edit().putInt(im7.k(2), booleanExtra ? Integer.MAX_VALUE : 0).commit();
                    im7.n(j5.a(intValue).a).b0(2);
                } else if (split[1].startsWith("groups")) {
                    if (!stringExtra.equals(d.getString("groups", null))) {
                        return;
                    }
                    if (w01.a) {
                        fa4.b("apply channel{groups} " + stringExtra + " state");
                    }
                    SharedPreferences.Editor edit = d.edit();
                    String k = im7.k(0);
                    if (!booleanExtra) {
                        i = 0;
                    }
                    edit.putInt(k, i).commit();
                    im7.n(j5.a(intValue).a).b0(0);
                } else if (split[1].startsWith("private")) {
                    if (!stringExtra.equals(d.getString("private", null))) {
                        return;
                    }
                    if (w01.a) {
                        fa4.b("apply channel{private} " + stringExtra + " state");
                    }
                    d.edit().putInt(im7.k(1), booleanExtra ? Integer.MAX_VALUE : 0).commit();
                    im7.n(j5.a(intValue).a).b0(1);
                } else if (!split[1].startsWith("stories")) {
                    long longValue = Utilities.A(split[1]).longValue();
                    if (longValue == 0) {
                        return;
                    }
                    String p = im7.p(longValue, 0L, false);
                    if (!stringExtra.equals(d.getString("org.telegram.key" + longValue, null))) {
                        return;
                    }
                    if (w01.a) {
                        fa4.b("apply channel{else} " + stringExtra + " state");
                    }
                    SharedPreferences.Editor edit2 = d.edit();
                    edit2.putInt(b00.h("notify2_", p), booleanExtra ? 2 : 0);
                    if (!booleanExtra) {
                        edit2.remove("notifyuntil_" + p);
                    }
                    edit2.commit();
                    im7.n(j5.a(intValue).a).c0(longValue, 0L, true);
                } else {
                    if (!stringExtra.equals(d.getString("stories", null))) {
                        return;
                    }
                    if (w01.a) {
                        fa4.b("apply channel{stories} " + stringExtra + " state");
                    }
                    d.edit().putBoolean(im7.k(3), !booleanExtra).commit();
                    im7.n(j5.a(intValue).a).b0(1);
                }
                ConnectionsManager.getInstance(j5.a(intValue).a).resumeNetworkMaybe();
            }
        }
    }
}
