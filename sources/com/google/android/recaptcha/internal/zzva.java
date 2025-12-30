package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzva extends zzvb {
    zzva(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final void zzc(Object obj, long j, boolean z) {
        if (zzvc.zzb) {
            zzvc.zzD(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzvc.zzE(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final void zzd(Object obj, long j, byte b) {
        if (zzvc.zzb) {
            zzvc.zzD(obj, j, b);
        } else {
            zzvc.zzE(obj, j, b);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final void zze(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final void zzf(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final boolean zzg(Object obj, long j) {
        return zzvc.zzb ? zzvc.zzt(obj, j) : zzvc.zzu(obj, j);
    }
}
