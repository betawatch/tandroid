package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class CallReceiver extends BroadcastReceiver {
    public static void checkLastReceivedCall() {
        String lastReceivedCall = getLastReceivedCall();
        if (lastReceivedCall != null) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReceiveCall, lastReceivedCall);
        }
    }

    public static void clearLastCall() {
        SharedConfig.getPreferences().edit().remove("last_call_phone_number").remove("last_call_time").apply();
    }

    public static String getLastReceivedCall() {
        String string = SharedConfig.getPreferences().getString("last_call_phone_number", null);
        if (string == null) {
            return null;
        }
        if (System.currentTimeMillis() - SharedConfig.getPreferences().getLong("last_call_time", 0L) < 54000000) {
            return string;
        }
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PHONE_STATE") && TelephonyManager.EXTRA_STATE_RINGING.equals(intent.getStringExtra("state"))) {
            String d = se.b.d(intent.getStringExtra("incoming_number"), false);
            SharedConfig.getPreferences().edit().putString("last_call_phone_number", d).putLong("last_call_time", System.currentTimeMillis()).apply();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReceiveCall, d);
        }
    }
}
