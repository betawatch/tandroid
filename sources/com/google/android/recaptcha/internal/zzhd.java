package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
