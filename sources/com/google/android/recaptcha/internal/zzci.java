package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
