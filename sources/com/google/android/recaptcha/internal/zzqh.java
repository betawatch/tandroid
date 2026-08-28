package com.google.android.recaptcha.internal;

import aa.d;
import j3.r0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zzqh extends zzqk {
    private final int zzc;

    public zzqh(byte[] bArr, int i9, int i10) {
        super(bArr);
        zzqm.zzj(0, i10, bArr.length);
        this.zzc = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzqk, com.google.android.recaptcha.internal.zzqm
    public final byte zza(int i9) {
        int i10 = this.zzc;
        if (((i10 - (i9 + 1)) | i9) >= 0) {
            return ((zzqk) this).zza[i9];
        }
        if (i9 < 0) {
            throw new ArrayIndexOutOfBoundsException(r0.l(i9, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(d.k(i9, i10, "Index > length: ", ", "));
    }

    @Override // com.google.android.recaptcha.internal.zzqk, com.google.android.recaptcha.internal.zzqm
    public final byte zzb(int i9) {
        return ((zzqk) this).zza[i9];
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
    public final void zze(byte[] bArr, int i9, int i10, int i11) {
        System.arraycopy(((zzqk) this).zza, 0, bArr, 0, i11);
    }
}
