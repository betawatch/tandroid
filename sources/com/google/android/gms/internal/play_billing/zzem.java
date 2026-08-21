package com.google.android.gms.internal.play_billing;

import java.util.Locale;

/* loaded from: classes.dex */
final class zzem extends zzep {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzem(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzb(byte b) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.zze;
        try {
            int i2 = i + 1;
            try {
                this.zzc[i] = b;
                this.zze = i2;
            } catch (IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                i = i2;
                throw new zzen(i, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
        }
    }

    public final void zzc(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzen(this.zze, this.zzd, i2, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzd(int i, boolean z) {
        zzv(i << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zze(int i, zzei zzeiVar) {
        zzv((i << 3) | 2);
        zzf(zzeiVar);
    }

    public final void zzf(zzei zzeiVar) {
        zzv(zzeiVar.zzd());
        zzeiVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzg(int i, int i2) {
        zzv((i << 3) | 5);
        zzh(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzh(int i) {
        int i2 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zze = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzen(i2, this.zzd, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzi(int i, long j) {
        zzv((i << 3) | 1);
        zzj(j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzj(long j) {
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
            throw new zzen(i, this.zzd, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzk(int i, int i2) {
        zzv(i << 3);
        zzl(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzl(int i) {
        if (i >= 0) {
            zzv(i);
        } else {
            zzx(i);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzm(byte[] bArr, int i, int i2) {
        zzc(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    final void zzn(int i, zzgl zzglVar, zzgv zzgvVar) {
        zzv((i << 3) | 2);
        zzv(((zzds) zzglVar).zze(zzgvVar));
        zzgvVar.zzi(zzglVar, this.zza);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzr(int i, String str) {
        zzv((i << 3) | 2);
        zzs(str);
    }

    public final void zzs(String str) {
        int i = this.zze;
        try {
            int zzC = zzep.zzC(str.length() * 3);
            int zzC2 = zzep.zzC(str.length());
            if (zzC2 != zzC) {
                zzv(zzhr.zzc(str));
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = zzhr.zzb(str, bArr, i2, this.zzd - i2);
                return;
            }
            int i3 = i + zzC2;
            this.zze = i3;
            int zzb = zzhr.zzb(str, this.zzc, i3, this.zzd - i3);
            this.zze = i;
            zzv((zzb - i) - zzC2);
            this.zze = zzb;
        } catch (zzhq e) {
            this.zze = i;
            zzF(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzen(e2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzt(int i, int i2) {
        zzv((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzu(int i, int i2) {
        zzv(i << 3);
        zzv(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzw(int i, long j) {
        zzv(i << 3);
        zzx(j);
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzv(int i) {
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = this.zze;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.zzc[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                    i3 = i2;
                    throw new zzen(i3, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                throw new zzen(i3, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i2 = i3 + 1;
        this.zzc[i3] = (byte) i;
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final void zzx(long j) {
        boolean z;
        int i;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.zze;
        z = zzep.zzd;
        if (!z || this.zzd - i2 < 10) {
            int i3 = i2;
            while ((j & (-128)) != 0) {
                try {
                    int i4 = i3 + 1;
                    try {
                        this.zzc[i3] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i3 = i4;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i3 = i4;
                        throw new zzen(i3, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                }
            }
            i = i3 + 1;
            try {
                this.zzc[i3] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i3 = i;
                throw new zzen(i3, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                zzho.zzn(this.zzc, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            zzho.zzn(this.zzc, i2, (byte) j);
        }
        this.zze = i;
    }
}
