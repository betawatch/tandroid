package com.google.android.recaptcha.internal;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzbx {
    public static final zzby zza() {
        zzby zzbyVar;
        Map zzf;
        Map map;
        zzbyVar = zzby.zzb;
        if (zzbyVar != null) {
            return zzbyVar;
        }
        zzf = zzby.zzf();
        zzby zzbyVar2 = new zzby(zzf, null);
        map = zzby.zzc;
        map.clear();
        zzby.zzb = zzbyVar2;
        return zzbyVar2;
    }
}
