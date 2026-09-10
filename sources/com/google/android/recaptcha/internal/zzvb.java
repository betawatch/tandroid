package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
abstract class zzvb {
    final Unsafe zza;

    public zzvb(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j3);

    public abstract float zzb(Object obj, long j3);

    public abstract void zzc(Object obj, long j3, boolean z10);

    public abstract void zzd(Object obj, long j3, byte b10);

    public abstract void zze(Object obj, long j3, double d);

    public abstract void zzf(Object obj, long j3, float f7);

    public abstract boolean zzg(Object obj, long j3);
}
