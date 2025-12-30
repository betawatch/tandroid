package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
class zzqk extends zzqj {
    protected final byte[] zza;

    zzqk(byte[] bArr) {
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
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzqkVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzqkVar.zza;
        zzqkVar.zzc();
        int i = 0;
        int i2 = 0;
        while (i < zzd) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzqm
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.recaptcha.internal.zzqm
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzqm
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.recaptcha.internal.zzqm
    protected void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzqm
    protected final int zzf(int i, int i2, int i3) {
        return zzsv.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzqm
    public final zzqm zzg(int i, int i2) {
        int zzj = zzqm.zzj(0, i2, zzd());
        return zzj == 0 ? zzqm.zzb : new zzqh(this.zza, 0, zzj);
    }

    @Override // com.google.android.recaptcha.internal.zzqm
    protected final String zzh(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.recaptcha.internal.zzqm
    final void zzi(zzqe zzqeVar) {
        ((zzqs) zzqeVar).zzc(this.zza, 0, zzd());
    }
}
