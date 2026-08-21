package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzec extends zzeg {
    private final int zzc;

    zzec(byte[] bArr, int i, int i2) {
        super(bArr);
        zzei.zzh(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzei
    final byte zzb(int i) {
        return ((zzeg) this).zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzei
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzei
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((zzeg) this).zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }
}
