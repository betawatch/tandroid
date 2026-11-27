package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzci {
    private final SharedPreferences zza;

    public zzci(Context context) {
        this.zza = context.getSharedPreferences("_GRECAPTCHA", 0);
    }

    public final String zza() {
        String string = this.zza.getString("_GRECAPTCHA_KC", null);
        return string == null ? "" : string;
    }

    public final void zzb(Map map) {
        SharedPreferences.Editor edit = this.zza.edit();
        for (Map.Entry entry : map.entrySet()) {
            edit.putString((String) entry.getKey(), (String) entry.getValue());
        }
        edit.commit();
    }
}
