package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class CallReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    public static void a() {
        String str = null;
        String string = tz.q().getString("last_call_phone_number", null);
        if (string != null && System.currentTimeMillis() - tz.q().getLong("last_call_time", 0L) < 54000000) {
            str = string;
        }
        if (str != null) {
            zs.e().k(zs.h4, str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PHONE_STATE") && TelephonyManager.EXTRA_STATE_RINGING.equals(intent.getStringExtra("state"))) {
            String d = af.b.d(intent.getStringExtra("incoming_number"), false);
            tz.q().edit().putString("last_call_phone_number", d).putLong("last_call_time", System.currentTimeMillis()).apply();
            zs.e().k(zs.h4, d);
        }
    }
}
