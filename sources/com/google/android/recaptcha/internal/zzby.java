package com.google.android.recaptcha.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kd.r;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
