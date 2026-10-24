package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
    public final void zzf(Object obj, long j10, float f7) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final boolean zzg(Object obj, long j10) {
        return zzvc.zzb ? zzvc.zzt(obj, j10) : zzvc.zzu(obj, j10);
    }
}
