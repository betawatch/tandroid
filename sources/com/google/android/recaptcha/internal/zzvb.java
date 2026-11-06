package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
abstract class zzvb {
    final Unsafe zza;

    public zzvb(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j3);

    public abstract float zzb(Object obj, long j3);

    public abstract void zzc(Object obj, long j3, boolean z9);

    public abstract void zzd(Object obj, long j3, byte b10);

    public abstract void zze(Object obj, long j3, double d);

    public abstract void zzf(Object obj, long j3, float f10);

    public abstract boolean zzg(Object obj, long j3);
}
