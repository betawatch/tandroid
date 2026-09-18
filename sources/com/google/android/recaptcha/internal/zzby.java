package com.google.android.recaptcha.internal;

import hd.r;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
