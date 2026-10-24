package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
