package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzva extends zzvb {
    public zzva(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzvc.zzb) {
            zzvc.zzD(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzvc.zzE(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final void zzd(Object obj, long j10, byte b10) {
        if (zzvc.zzb) {
            zzvc.zzD(obj, j10, b10);
        } else {
            zzvc.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final void zze(Object obj, long j10, double d) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final void zzf(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final boolean zzg(Object obj, long j10) {
        return zzvc.zzb ? zzvc.zzt(obj, j10) : zzvc.zzu(obj, j10);
    }
}
