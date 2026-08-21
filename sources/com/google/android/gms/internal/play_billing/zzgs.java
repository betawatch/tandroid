package com.google.android.gms.internal.play_billing;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class zzgs {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final zzgs zzb = new zzgs();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzgw zzc = new zzgd();

    private zzgs() {
    }

    public static zzgs zza() {
        return zzb;
    }

    public final zzgv zzb(Class cls) {
        zzfo.zzc(cls, "messageType");
        ConcurrentMap concurrentMap = this.zzd;
        zzgv zzgvVar = (zzgv) concurrentMap.get(cls);
        if (zzgvVar == null) {
            zzgvVar = this.zzc.zza(cls);
            zzfo.zzc(cls, "messageType");
            zzgv zzgvVar2 = (zzgv) concurrentMap.putIfAbsent(cls, zzgvVar);
            if (zzgvVar2 != null) {
                return zzgvVar2;
            }
        }
        return zzgvVar;
    }
}
