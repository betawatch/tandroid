package com.google.android.recaptcha.internal;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class zzco {
    public static final /* synthetic */ int zza = 0;
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    public static final void zza(int i7, long j3) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer valueOf = Integer.valueOf(i7);
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
