package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
