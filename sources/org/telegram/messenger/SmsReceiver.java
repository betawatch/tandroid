package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class SmsReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceive$0(String str) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didReceiveSmsCode, str);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent == null) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("sms_hash", null);
            if (!"com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
                str = "";
            } else if (!AndroidUtilities.isWaitingForSms()) {
                return;
            } else {
                str = (String) intent.getExtras().get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Matcher matcher = Pattern.compile("[0-9\\-]+").matcher(str);
            if (matcher.find()) {
                String replace = matcher.group(0).replace("-", "");
                if (replace.length() >= 3) {
                    if (string != null) {
                        sharedPreferences.edit().putString("sms_hash_code", string + "|" + replace).commit();
                    }
                    AndroidUtilities.runOnUIThread(new v1(replace, 5));
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }
}
