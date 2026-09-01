package com.google.android.recaptcha.internal;

import android.support.v4.media.a;
import java.util.Locale;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
final class zzqs extends zzqv {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzqs(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(a.k(length, i11, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i11;
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzb(byte b10) {
        int i10 = this.zze;
        try {
            int i11 = i10 + 1;
            try {
                this.zzc[i10] = b10;
                this.zze = i11;
            } catch (IndexOutOfBoundsException e6) {
                e = e6;
                i10 = i11;
                throw new zzqt(i10, this.zzd, 1, e);
            }
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
        }
    }

    public final void zzc(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i11);
            this.zze += i11;
        } catch (IndexOutOfBoundsException e6) {
            throw new zzqt(this.zze, this.zzd, i11, e6);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzd(int i10, boolean z4) {
        zzt(i10 << 3);
        zzb(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zze(int i10, zzqm zzqmVar) {
        zzt((i10 << 3) | 2);
        zzt(zzqmVar.zzd());
        zzqmVar.zzi(this);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzf(int i10, int i11) {
        zzt((i10 << 3) | 5);
        zzg(i11);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzg(int i10) {
        int i11 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.zze = i11 + 4;
        } catch (IndexOutOfBoundsException e6) {
            throw new zzqt(i11, this.zzd, 4, e6);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzh(int i10, long j10) {
        zzt((i10 << 3) | 1);
        zzi(j10);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzi(long j10) {
        int i10 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.zze = i10 + 8;
        } catch (IndexOutOfBoundsException e6) {
            throw new zzqt(i10, this.zzd, 8, e6);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzj(int i10, int i11) {
        zzt(i10 << 3);
        zzk(i11);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzk(int i10) {
        if (i10 >= 0) {
            zzt(i10);
        } else {
            zzv(i10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzl(byte[] bArr, int i10, int i11) {
        zzc(bArr, 0, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzm(int i10, zzts zztsVar, zzug zzugVar) {
        zzt((i10 << 3) | 2);
        zzt(((zzpw) zztsVar).zza(zzugVar));
        zzugVar.zzj(zztsVar, this.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzn(int i10, zzts zztsVar) {
        zzt(11);
        zzs(2, i10);
        zzt(26);
        zzt(zztsVar.zzo());
        zztsVar.zze(this);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzo(int i10, zzqm zzqmVar) {
        zzt(11);
        zzs(2, i10);
        zze(3, zzqmVar);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzp(int i10, String str) {
        zzt((i10 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) {
        int i10 = this.zze;
        try {
            int zzA = zzqv.zzA(str.length() * 3);
            int zzA2 = zzqv.zzA(str.length());
            if (zzA2 != zzA) {
                zzt(zzvf.zzc(str));
                byte[] bArr = this.zzc;
                int i11 = this.zze;
                this.zze = zzvf.zzb(str, bArr, i11, this.zzd - i11);
                return;
            }
            int i12 = i10 + zzA2;
            this.zze = i12;
            int zzb = zzvf.zzb(str, this.zzc, i12, this.zzd - i12);
            this.zze = i10;
            zzt((zzb - i10) - zzA2);
            this.zze = zzb;
        } catch (zzve e6) {
            this.zze = i10;
            zzD(str, e6);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzqt(e10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzr(int i10, int i11) {
        zzt((i10 << 3) | i11);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzs(int i10, int i11) {
        zzt(i10 << 3);
        zzt(i11);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzt(int i10) {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.zze;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.zzc[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e6) {
                    indexOutOfBoundsException = e6;
                    i12 = i11;
                    throw new zzqt(i12, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                throw new zzqt(i12, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.zzc[i12] = (byte) i10;
        this.zze = i11;
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzu(int i10, long j10) {
        zzt(i10 << 3);
        zzv(j10);
    }

    @Override // com.google.android.recaptcha.internal.zzqv
    public final void zzv(long j10) {
        boolean z4;
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11 = this.zze;
        z4 = zzqv.zzd;
        if (!z4 || this.zzd - i11 < 10) {
            int i12 = i11;
            while ((j10 & (-128)) != 0) {
                try {
                    int i13 = i12 + 1;
                    try {
                        this.zzc[i12] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i12 = i13;
                    } catch (IndexOutOfBoundsException e6) {
                        indexOutOfBoundsException = e6;
                        i12 = i13;
                        throw new zzqt(i12, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                }
            }
            i10 = i12 + 1;
            try {
                this.zzc[i12] = (byte) j10;
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                i12 = i10;
                throw new zzqt(i12, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                zzvc.zzn(this.zzc, i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            zzvc.zzn(this.zzc, i11, (byte) j10);
        }
        this.zze = i10;
    }
}
