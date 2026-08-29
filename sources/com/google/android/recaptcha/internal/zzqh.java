package com.google.android.recaptcha.internal;

import a4.w;
import j7.l1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
            throw new ArrayIndexOutOfBoundsException(l1.k(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(w.k(i10, i11, "Index > length: ", ", "));
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
