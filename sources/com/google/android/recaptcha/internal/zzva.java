package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
    public final void zzc(Object obj, long j3, boolean z10) {
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
    public final void zzf(Object obj, long j3, float f7) {
        this.zza.putInt(obj, j3, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.recaptcha.internal.zzvb
    public final boolean zzg(Object obj, long j3) {
        return zzvc.zzb ? zzvc.zzt(obj, j3) : zzvc.zzu(obj, j3);
    }
}
