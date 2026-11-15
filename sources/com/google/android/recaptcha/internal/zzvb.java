package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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

    public abstract void zzf(Object obj, long j3, float f10);

    public abstract boolean zzg(Object obj, long j3);
}
