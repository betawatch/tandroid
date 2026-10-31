package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class SmsReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z10;
        if (intent == null) {
            return;
        }
        try {
            String str = "";
            SharedPreferences sharedPreferences = w0.b.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("sms_hash", null);
            if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
                synchronized (i0.k) {
                    z10 = i0.j;
                }
                if (!z10) {
                    return;
                } else {
                    str = (String) intent.getExtras().get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                }
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
                    i0.g3(new o4(replace, 5));
                }
            }
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }
}
