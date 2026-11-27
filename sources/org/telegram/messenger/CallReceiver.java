package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class CallReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    public static void a() {
        String str = null;
        String string = xea.q().getString("last_call_phone_number", null);
        if (string != null && System.currentTimeMillis() - xea.q().getLong("last_call_time", 0L) < 54000000) {
            str = string;
        }
        if (str != null) {
            jn7.e().k(jn7.k4, str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PHONE_STATE") && TelephonyManager.EXTRA_STATE_RINGING.equals(intent.getStringExtra("state"))) {
            String h = f78.h(intent.getStringExtra("incoming_number"), false);
            xea.q().edit().putString("last_call_phone_number", h).putLong("last_call_time", System.currentTimeMillis()).apply();
            jn7.e().k(jn7.k4, h);
        }
    }
}
