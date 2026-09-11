package com.google.android.recaptcha.internal;

import hd.r;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
