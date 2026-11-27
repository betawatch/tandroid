package com.google.android.recaptcha.internal;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zzco {
    public static final /* synthetic */ int zza = 0;
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    public static final void zza(int i, long j) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer valueOf = Integer.valueOf(i);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            obj = new zzcn();
        }
        zzcn zzcnVar = (zzcn) obj;
        zzcnVar.zzg(zzcnVar.zzb() + 1);
        zzcnVar.zzf(zzcnVar.zzd() + j);
        zzcnVar.zze(Math.max(j, zzcnVar.zzc()));
        concurrentHashMap.put(valueOf, zzcnVar);
    }
}
