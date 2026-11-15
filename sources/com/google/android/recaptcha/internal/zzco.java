package com.google.android.recaptcha.internal;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
