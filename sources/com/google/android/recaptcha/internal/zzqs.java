package com.google.android.recaptcha.internal;

import a8.p0;
import java.util.Locale;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
final class zzqs extends zzqv {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzqs(byte[] bArr, int i7, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(p0.m(length, i10, "Array range is invalid. Buffer.length=", ", offset=0, length="));
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
        int i7 = this.zze;
        try {
            int i10 = i7 + 1;
            try {
                this.zzc[i7] = b10;
                this.zze = i10;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i7 = i10;
                throw new zzqt(i7, this.zzd, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    public final void zzc(byte[] bArr, int i7, int i10) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i10);
            this.zze += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzqt(this.zze, this.zzd, i10, e10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzd(int i7, boolean z9) {
        zzt(i7 << 3);
        zzb(z9 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zze(int i7, zzqm zzqmVar) {
        zzt((i7 << 3) | 2);
        zzt(zzqmVar.zzd());
        zzqmVar.zzi(this);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzf(int i7, int i10) {
        zzt((i7 << 3) | 5);
        zzg(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzg(int i7) {
        int i10 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i10] = (byte) i7;
            bArr[i10 + 1] = (byte) (i7 >> 8);
            bArr[i10 + 2] = (byte) (i7 >> 16);
            bArr[i10 + 3] = (byte) (i7 >> 24);
            this.zze = i10 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzqt(i10, this.zzd, 4, e10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzh(int i7, long j3) {
        zzt((i7 << 3) | 1);
        zzi(j3);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzi(long j3) {
        int i7 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i7] = (byte) j3;
            bArr[i7 + 1] = (byte) (j3 >> 8);
            bArr[i7 + 2] = (byte) (j3 >> 16);
            bArr[i7 + 3] = (byte) (j3 >> 24);
            bArr[i7 + 4] = (byte) (j3 >> 32);
            bArr[i7 + 5] = (byte) (j3 >> 40);
            bArr[i7 + 6] = (byte) (j3 >> 48);
            bArr[i7 + 7] = (byte) (j3 >> 56);
            this.zze = i7 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzqt(i7, this.zzd, 8, e10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzj(int i7, int i10) {
        zzt(i7 << 3);
        zzk(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzk(int i7) {
        if (i7 >= 0) {
            zzt(i7);
        } else {
            zzv(i7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzl(byte[] bArr, int i7, int i10) {
        zzc(bArr, 0, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzm(int i7, zzts zztsVar, zzug zzugVar) {
        zzt((i7 << 3) | 2);
        zzt(((zzpw) zztsVar).zza(zzugVar));
        zzugVar.zzj(zztsVar, this.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzn(int i7, zzts zztsVar) {
        zzt(11);
        zzs(2, i7);
        zzt(26);
        zzt(zztsVar.zzo());
        zztsVar.zze(this);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzo(int i7, zzqm zzqmVar) {
        zzt(11);
        zzs(2, i7);
        zze(3, zzqmVar);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzp(int i7, String str) {
        zzt((i7 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) {
        int i7 = this.zze;
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
            int i11 = i7 + zzA2;
            this.zze = i11;
            int zzb = zzvf.zzb(str, this.zzc, i11, this.zzd - i11);
            this.zze = i7;
            zzt((zzb - i7) - zzA2);
            this.zze = zzb;
        } catch (zzve e10) {
            this.zze = i7;
            zzD(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzqt(e11);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzr(int i7, int i10) {
        zzt((i7 << 3) | i10);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzs(int i7, int i10) {
        zzt(i7 << 3);
        zzt(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzt(int i7) {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11 = this.zze;
        while ((i7 & (-128)) != 0) {
            try {
                i10 = i11 + 1;
                try {
                    this.zzc[i11] = (byte) (i7 | 128);
                    i7 >>>= 7;
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
        this.zzc[i11] = (byte) i7;
        this.zze = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzu(int i7, long j3) {
        zzt(i7 << 3);
        zzv(j3);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzv(long j3) {
        boolean z9;
        int i7;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i10 = this.zze;
        z9 = zzqv.zzd;
        if (!z9 || this.zzd - i10 < 10) {
            int i11 = i10;
            while ((j3 & (-128)) != 0) {
                try {
                    int i12 = i11 + 1;
                    try {
                        this.zzc[i11] = (byte) (((int) j3) | 128);
                        j3 >>>= 7;
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
            i7 = i11 + 1;
            try {
                this.zzc[i11] = (byte) j3;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i11 = i7;
                throw new zzqt(i11, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j3 & (-128)) != 0) {
                zzvc.zzn(this.zzc, i10, (byte) (((int) j3) | 128));
                j3 >>>= 7;
                i10++;
            }
            i7 = i10 + 1;
            zzvc.zzn(this.zzc, i10, (byte) j3);
        }
        this.zze = i7;
    }
}
