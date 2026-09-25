package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
