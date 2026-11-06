package com.google.android.recaptcha.internal;

import a8.p0;
import jg.g;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
final class zzqh extends zzqk {
    private final int zzc;

    public zzqh(byte[] bArr, int i7, int i10) {
        super(bArr);
        zzqm.zzj(0, i10, bArr.length);
        this.zzc = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzqk, com.google.android.recaptcha.internal.zzqm
    public final byte zza(int i7) {
        int i10 = this.zzc;
        if (((i10 - (i7 + 1)) | i7) >= 0) {
            return ((zzqk) this).zza[i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(g.j(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(p0.m(i7, i10, "Index > length: ", ", "));
    }

    @Override // com.google.android.recaptcha.internal.zzqk, com.google.android.recaptcha.internal.zzqm
    public final byte zzb(int i7) {
        return ((zzqk) this).zza[i7];
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
    public final void zze(byte[] bArr, int i7, int i10, int i11) {
        System.arraycopy(((zzqk) this).zza, 0, bArr, 0, i11);
    }
}
