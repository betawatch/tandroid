package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
final class zzva extends zzvb {
    public zzva(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final double zza(Object obj, long j3) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j3));
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final float zzb(Object obj, long j3) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j3));
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final void zzc(Object obj, long j3, boolean z9) {
        if (zzvc.zzb) {
            zzvc.zzD(obj, j3, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzvc.zzE(obj, j3, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final void zzd(Object obj, long j3, byte b10) {
        if (zzvc.zzb) {
            zzvc.zzD(obj, j3, b10);
        } else {
            zzvc.zzE(obj, j3, b10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final void zze(Object obj, long j3, double d) {
        this.zza.putLong(obj, j3, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final void zzf(Object obj, long j3, float f10) {
        this.zza.putInt(obj, j3, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final boolean zzg(Object obj, long j3) {
        return zzvc.zzb ? zzvc.zzt(obj, j3) : zzvc.zzu(obj, j3);
    }
}
