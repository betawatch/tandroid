package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                    synchronized (gl.k) {
                        try {
                            z = gl.j;
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
                        gl.d3(new xt2(replace, (byte) 6));
                    }
                }
            } catch (Throwable th2) {
                fa4.g(th2, true);
            }
        }
    }
}
