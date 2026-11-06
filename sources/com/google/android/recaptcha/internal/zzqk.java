package com.google.android.recaptcha.internal;

import a8.p0;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
class zzqk extends zzqj {
    protected final byte[] zza;

    public zzqk(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzqm
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzqm) || zzd() != ((zzqm) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzqk)) {
            return obj.equals(this);
        }
        zzqk zzqkVar = (zzqk) obj;
        int zzk = zzk();
        int zzk2 = zzqkVar.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzqkVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzqkVar.zzd()) {
            throw new IllegalArgumentException(p0.m(zzd, zzqkVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzqkVar.zza;
        zzqkVar.zzc();
        int i7 = 0;
        int i10 = 0;
        while (i7 < zzd) {
            if (bArr[i7] != bArr2[i10]) {
                return false;
            }
            i7++;
            i10++;
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzqm
    public byte zza(int i7) {
        return this.zza[i7];
    }

    @Override // com.google.android.recaptcha.internal.zzqm
    public byte zzb(int i7) {
        return this.zza[i7];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzqm
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.recaptcha.internal.zzqm
    public void zze(byte[] bArr, int i7, int i10, int i11) {
        System.arraycopy(this.zza, 0, bArr, 0, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzqm
    public final int zzf(int i7, int i10, int i11) {
        return zzsv.zzb(i7, this.zza, 0, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzqm
    public final zzqm zzg(int i7, int i10) {
        int zzj = zzqm.zzj(0, i10, zzd());
        return zzj == 0 ? zzqm.zzb : new zzqh(this.zza, 0, zzj);
    }

    @Override // com.google.android.recaptcha.internal.zzqm
    public final String zzh(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.recaptcha.internal.zzqm
    public final void zzi(zzqe zzqeVar) {
        ((zzqs) zzqeVar).zzc(this.zza, 0, zzd());
    }
}
