package com.google.android.recaptcha.internal;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzco {
    public static final /* synthetic */ int zza = 0;
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    public static final void zza(int i9, long j10) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer valueOf = Integer.valueOf(i9);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            obj = new zzcn();
        }
        zzcn zzcnVar = (zzcn) obj;
        zzcnVar.zzg(zzcnVar.zzb() + 1);
        zzcnVar.zzf(zzcnVar.zzd() + j10);
        zzcnVar.zze(Math.max(j10, zzcnVar.zzc()));
        concurrentHashMap.put(valueOf, zzcnVar);
    }
}
