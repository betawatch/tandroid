package com.google.android.recaptcha.internal;

import a4.a;
import i2.g;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class zzqh extends zzqk {
    private final int zzc;

    public zzqh(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzqm.zzj(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.recaptcha.internal.zzqk, com.google.android.recaptcha.internal.zzqm
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return ((zzqk) this).zza[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(g.i(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a.l(i10, i11, "Index > length: ", ", "));
    }

    @Override // com.google.android.recaptcha.internal.zzqk, com.google.android.recaptcha.internal.zzqm
    public final byte zzb(int i10) {
        return ((zzqk) this).zza[i10];
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
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(((zzqk) this).zza, 0, bArr, 0, i12);
    }
}
