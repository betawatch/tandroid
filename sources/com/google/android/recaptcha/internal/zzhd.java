package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
