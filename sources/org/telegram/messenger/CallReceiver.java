package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class CallReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    public static void a() {
        String str = null;
        String string = gba.q().getString("last_call_phone_number", null);
        if (string != null && System.currentTimeMillis() - gba.q().getLong("last_call_time", 0L) < 54000000) {
            str = string;
        }
        if (str != null) {
            kk7.e().k(kk7.j4, str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PHONE_STATE") && TelephonyManager.EXTRA_STATE_RINGING.equals(intent.getStringExtra("state"))) {
            String h = p38.h(intent.getStringExtra("incoming_number"), false);
            gba.q().edit().putString("last_call_phone_number", h).putLong("last_call_time", System.currentTimeMillis()).apply();
            kk7.e().k(kk7.j4, h);
        }
    }
}
