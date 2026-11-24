package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzqh extends zzqk {
    private final int zzc;

    public zzqh(byte[] bArr, int i, int i2) {
        super(bArr);
        zzqm.zzj(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.recaptcha.internal.zzqk, com.google.android.recaptcha.internal.zzqm
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return ((zzqk) this).zza[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(hg9.j(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(b10.g(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.android.recaptcha.internal.zzqk, com.google.android.recaptcha.internal.zzqm
    public final byte zzb(int i) {
        return ((zzqk) this).zza[i];
    }

    @Override // com.google.android.recaptcha.internal.zzqk
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzqk, com.google.android.recaptcha.internal.zzqm
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzqk, com.google.android.recaptcha.internal.zzqm
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(((zzqk) this).zza, 0, bArr, 0, i3);
    }
}
