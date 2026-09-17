package com.google.android.recaptcha.internal;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class zzco {
    public static final /* synthetic */ int zza = 0;
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    public static final void zza(int i10, long j3) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer valueOf = Integer.valueOf(i10);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            obj = new zzcn();
        }
        zzcn zzcnVar = (zzcn) obj;
        zzcnVar.zzg(zzcnVar.zzb() + 1);
        zzcnVar.zzf(zzcnVar.zzd() + j3);
        zzcnVar.zze(Math.max(j3, zzcnVar.zzc()));
        concurrentHashMap.put(valueOf, zzcnVar);
    }
}
