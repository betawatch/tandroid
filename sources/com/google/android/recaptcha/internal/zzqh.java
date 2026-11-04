package com.google.android.recaptcha.internal;

import a1.g;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzqh extends zzqk {
    private final int zzc;

    public zzqh(byte[] bArr, int i3, int i10) {
        super(bArr);
        zzqm.zzj(0, i10, bArr.length);
        this.zzc = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzqk, com.google.android.recaptcha.internal.zzqm
    public final byte zza(int i3) {
        int i10 = this.zzc;
        if (((i10 - (i3 + 1)) | i3) >= 0) {
            return ((zzqk) this).zza[i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(p1.i(i3, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(g.n(i3, i10, "Index > length: ", ", "));
    }

    @Override // com.google.android.recaptcha.internal.zzqk, com.google.android.recaptcha.internal.zzqm
    public final byte zzb(int i3) {
        return ((zzqk) this).zza[i3];
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
    public final void zze(byte[] bArr, int i3, int i10, int i11) {
        System.arraycopy(((zzqk) this).zza, 0, bArr, 0, i11);
    }
}
