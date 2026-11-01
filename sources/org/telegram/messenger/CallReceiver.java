package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class CallReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    public static void a() {
        String str = null;
        String string = uz.q().getString("last_call_phone_number", null);
        if (string != null && System.currentTimeMillis() - uz.q().getLong("last_call_time", 0L) < 54000000) {
            str = string;
        }
        if (str != null) {
            at.e().k(at.h4, str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PHONE_STATE") && TelephonyManager.EXTRA_STATE_RINGING.equals(intent.getStringExtra("state"))) {
            String d = af.b.d(intent.getStringExtra("incoming_number"), false);
            uz.q().edit().putString("last_call_phone_number", d).putLong("last_call_time", System.currentTimeMillis()).apply();
            at.e().k(at.h4, d);
        }
    }
}
