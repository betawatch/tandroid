package com.google.android.recaptcha.internal;

import a1.g;
import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzqs extends zzqv {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzqs(byte[] bArr, int i3, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(g.n(length, i10, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzb(byte b10) {
        int i3 = this.zze;
        try {
            int i10 = i3 + 1;
            try {
                this.zzc[i3] = b10;
                this.zze = i10;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i3 = i10;
                throw new zzqt(i3, this.zzd, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    public final void zzc(byte[] bArr, int i3, int i10) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i10);
            this.zze += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzqt(this.zze, this.zzd, i10, e10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzd(int i3, boolean z10) {
        zzt(i3 << 3);
        zzb(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zze(int i3, zzqm zzqmVar) {
        zzt((i3 << 3) | 2);
        zzt(zzqmVar.zzd());
        zzqmVar.zzi(this);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzf(int i3, int i10) {
        zzt((i3 << 3) | 5);
        zzg(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzg(int i3) {
        int i10 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i10] = (byte) i3;
            bArr[i10 + 1] = (byte) (i3 >> 8);
            bArr[i10 + 2] = (byte) (i3 >> 16);
            bArr[i10 + 3] = (byte) (i3 >> 24);
            this.zze = i10 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzqt(i10, this.zzd, 4, e10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzh(int i3, long j10) {
        zzt((i3 << 3) | 1);
        zzi(j10);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzi(long j10) {
        int i3 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i3] = (byte) j10;
            bArr[i3 + 1] = (byte) (j10 >> 8);
            bArr[i3 + 2] = (byte) (j10 >> 16);
            bArr[i3 + 3] = (byte) (j10 >> 24);
            bArr[i3 + 4] = (byte) (j10 >> 32);
            bArr[i3 + 5] = (byte) (j10 >> 40);
            bArr[i3 + 6] = (byte) (j10 >> 48);
            bArr[i3 + 7] = (byte) (j10 >> 56);
            this.zze = i3 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzqt(i3, this.zzd, 8, e10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzj(int i3, int i10) {
        zzt(i3 << 3);
        zzk(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzk(int i3) {
        if (i3 >= 0) {
            zzt(i3);
        } else {
            zzv(i3);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzl(byte[] bArr, int i3, int i10) {
        zzc(bArr, 0, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzm(int i3, zzts zztsVar, zzug zzugVar) {
        zzt((i3 << 3) | 2);
        zzt(((zzpw) zztsVar).zza(zzugVar));
        zzugVar.zzj(zztsVar, this.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzn(int i3, zzts zztsVar) {
        zzt(11);
        zzs(2, i3);
        zzt(26);
        zzt(zztsVar.zzo());
        zztsVar.zze(this);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzo(int i3, zzqm zzqmVar) {
        zzt(11);
        zzs(2, i3);
        zze(3, zzqmVar);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzp(int i3, String str) {
        zzt((i3 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) {
        int i3 = this.zze;
        try {
            int zzA = zzqv.zzA(str.length() * 3);
            int zzA2 = zzqv.zzA(str.length());
            if (zzA2 != zzA) {
                zzt(zzvf.zzc(str));
                byte[] bArr = this.zzc;
                int i10 = this.zze;
                this.zze = zzvf.zzb(str, bArr, i10, this.zzd - i10);
                return;
            }
            int i11 = i3 + zzA2;
            this.zze = i11;
            int zzb = zzvf.zzb(str, this.zzc, i11, this.zzd - i11);
            this.zze = i3;
            zzt((zzb - i3) - zzA2);
            this.zze = zzb;
        } catch (zzve e10) {
            this.zze = i3;
            zzD(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzqt(e11);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzr(int i3, int i10) {
        zzt((i3 << 3) | i10);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzs(int i3, int i10) {
        zzt(i3 << 3);
        zzt(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzt(int i3) {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11 = this.zze;
        while ((i3 & (-128)) != 0) {
            try {
                i10 = i11 + 1;
                try {
                    this.zzc[i11] = (byte) (i3 | 128);
                    i3 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i11 = i10;
                    throw new zzqt(i11, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new zzqt(i11, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i10 = i11 + 1;
        this.zzc[i11] = (byte) i3;
        this.zze = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzu(int i3, long j10) {
        zzt(i3 << 3);
        zzv(j10);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzv(long j10) {
        boolean z10;
        int i3;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i10 = this.zze;
        z10 = zzqv.zzd;
        if (!z10 || this.zzd - i10 < 10) {
            int i11 = i10;
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = i11 + 1;
                    try {
                        this.zzc[i11] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i11 = i12;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i11 = i12;
                        throw new zzqt(i11, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i3 = i11 + 1;
            try {
                this.zzc[i11] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i11 = i3;
                throw new zzqt(i11, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                zzvc.zzn(this.zzc, i10, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i10++;
            }
            i3 = i10 + 1;
            zzvc.zzn(this.zzc, i10, (byte) j10);
        }
        this.zze = i3;
    }
}
