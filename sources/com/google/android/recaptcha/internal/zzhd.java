package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class zzhd {
    public static final zzww zza(zzcs zzcsVar, zzcs zzcsVar2) {
        zzwu zzf = zzww.zzf();
        zzf.zzq(zzvl.zzb(zzcsVar.zzb()));
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        zzf.zzr(zzvj.zza(zzcsVar.zza(timeUnit)));
        zzf.zze(zzvl.zzb(zzcsVar2.zzb()));
        zzf.zzf(zzvj.zza(zzcsVar2.zza(timeUnit)));
        return (zzww) zzf.zzk();
    }
}
