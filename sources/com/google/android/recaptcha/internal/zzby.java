package com.google.android.recaptcha.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import jd.r;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class zzby {
    public static final /* synthetic */ int zza = 0;
    private static zzby zzb;
    private static final Map zzc = new LinkedHashMap();
    private final Map zzd;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map zzf() {
        Map map = zzc;
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zzbz) entry.getValue()).zzb());
        }
        return linkedHashMap;
    }

    public final Object zzb(int i10) {
        return this.zzd.get(Integer.valueOf(i10));
    }
}
