package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class SmsReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        if (intent != null) {
            try {
                String str = "";
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("sms_hash", null);
                if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
                    synchronized (hl.k) {
                        try {
                            z = hl.j;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!z) {
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
                        hl.c3(new qu2(replace, (byte) 7));
                    }
                }
            } catch (Throwable th2) {
                cc4.g(th2, true);
            }
        }
    }
}
