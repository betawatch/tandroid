package com.google.android.recaptcha.internal;

import java.util.Locale;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzqs extends zzqv {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzqs(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            Locale locale = Locale.US;
            w26.j(b00.g(length, i2, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i2;
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzb(byte b) {
        int i = this.zze;
        try {
            int i2 = i + 1;
            try {
                this.zzc[i] = b;
                this.zze = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzqt(i, this.zzd, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    public final void zzc(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzqt(this.zze, this.zzd, i2, e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzd(int i, boolean z) {
        zzt(i << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zze(int i, zzqm zzqmVar) {
        zzt((i << 3) | 2);
        zzt(zzqmVar.zzd());
        zzqmVar.zzi(this);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzf(int i, int i2) {
        zzt((i << 3) | 5);
        zzg(i2);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzg(int i) {
        int i2 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zze = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzqt(i2, this.zzd, 4, e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzh(int i, long j) {
        zzt((i << 3) | 1);
        zzi(j);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzi(long j) {
        int i = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zze = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzqt(i, this.zzd, 8, e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzj(int i, int i2) {
        zzt(i << 3);
        zzk(i2);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzk(int i) {
        if (i >= 0) {
            zzt(i);
        } else {
            zzv(i);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzl(byte[] bArr, int i, int i2) {
        zzc(bArr, 0, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzm(int i, zzts zztsVar, zzug zzugVar) {
        zzt((i << 3) | 2);
        zzt(((zzpw) zztsVar).zza(zzugVar));
        zzugVar.zzj(zztsVar, this.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzn(int i, zzts zztsVar) {
        zzt(11);
        zzs(2, i);
        zzt(26);
        zzt(zztsVar.zzo());
        zztsVar.zze(this);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzo(int i, zzqm zzqmVar) {
        zzt(11);
        zzs(2, i);
        zze(3, zzqmVar);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzp(int i, String str) {
        zzt((i << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) {
        int i = this.zze;
        try {
            int zzA = zzqv.zzA(str.length() * 3);
            int zzA2 = zzqv.zzA(str.length());
            if (zzA2 != zzA) {
                zzt(zzvf.zzc(str));
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = zzvf.zzb(str, bArr, i2, this.zzd - i2);
                return;
            }
            int i3 = i + zzA2;
            this.zze = i3;
            int zzb = zzvf.zzb(str, this.zzc, i3, this.zzd - i3);
            this.zze = i;
            zzt((zzb - i) - zzA2);
            this.zze = zzb;
        } catch (zzve e) {
            this.zze = i;
            zzD(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzqt(e2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzr(int i, int i2) {
        zzt((i << 3) | i2);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzs(int i, int i2) {
        zzt(i << 3);
        zzt(i2);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzt(int i) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.zze;
        while (true) {
            int i3 = i & (-128);
            try {
                byte[] bArr = this.zzc;
                int i4 = i2 + 1;
                if (i3 == 0) {
                    bArr[i2] = (byte) i;
                    this.zze = i4;
                    return;
                }
                try {
                    bArr[i2] = (byte) (i | 128);
                    i >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                    i2 = i4;
                }
                indexOutOfBoundsException = e;
                i2 = i4;
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
            }
            throw new zzqt(i2, this.zzd, 1, indexOutOfBoundsException);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzu(int i, long j) {
        zzt(i << 3);
        zzv(j);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzv(long j) {
        boolean z;
        IndexOutOfBoundsException indexOutOfBoundsException;
        IndexOutOfBoundsException indexOutOfBoundsException2;
        byte[] bArr;
        int i;
        byte[] bArr2;
        int i2 = this.zze;
        z = zzqv.zzd;
        if (!z || this.zzd - i2 < 10) {
            int i3 = i2;
            while (true) {
                long j2 = j & (-128);
                try {
                    bArr = this.zzc;
                    if (j2 == 0) {
                        break;
                    }
                    int i4 = i3 + 1;
                    try {
                        bArr[i3] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i3 = i4;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i3 = i4;
                        indexOutOfBoundsException2 = indexOutOfBoundsException;
                        throw new zzqt(i3, this.zzd, 1, indexOutOfBoundsException2);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                }
            }
            int i5 = i3 + 1;
            try {
                bArr[i3] = (byte) j;
                i = i5;
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException2 = e3;
                i3 = i5;
                throw new zzqt(i3, this.zzd, 1, indexOutOfBoundsException2);
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                bArr2 = this.zzc;
                if (j3 == 0) {
                    break;
                }
                zzvc.zzn(bArr2, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            zzvc.zzn(bArr2, i2, (byte) j);
        }
        this.zze = i;
    }
}
