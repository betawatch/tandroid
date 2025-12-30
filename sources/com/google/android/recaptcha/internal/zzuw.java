package com.google.android.recaptcha.internal;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzuw {
    private static final zzuw zza = new zzuw(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzuw() {
        this(0, new int[8], new Object[8], true);
    }

    private zzuw(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzuw zzc() {
        return zza;
    }

    static zzuw zze(zzuw zzuwVar, zzuw zzuwVar2) {
        int i = zzuwVar.zzb + zzuwVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzuwVar.zzc, i);
        System.arraycopy(zzuwVar2.zzc, 0, copyOf, zzuwVar.zzb, zzuwVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzuwVar.zzd, i);
        System.arraycopy(zzuwVar2.zzd, 0, copyOf2, zzuwVar.zzb, zzuwVar2.zzb);
        return new zzuw(i, copyOf, copyOf2, true);
    }

    static zzuw zzf() {
        return new zzuw(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzuw)) {
            return false;
        }
        zzuw zzuwVar = (zzuw) obj;
        int i = this.zzb;
        if (i == zzuwVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzuwVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzuwVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int zza() {
        int zzA;
        int zzB;
        int i;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.zzd[i4]).longValue();
                    i = zzqv.zzA(i6 << 3) + 8;
                } else if (i7 == 2) {
                    int i8 = i6 << 3;
                    zzqm zzqmVar = (zzqm) this.zzd[i4];
                    int zzA2 = zzqv.zzA(i8);
                    int zzd = zzqmVar.zzd();
                    i = zzA2 + zzqv.zzA(zzd) + zzd;
                } else if (i7 == 3) {
                    int zzA3 = zzqv.zzA(i6 << 3);
                    zzA = zzA3 + zzA3;
                    zzB = ((zzuw) this.zzd[i4]).zza();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(new zzsw("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i4]).intValue();
                    i = zzqv.zzA(i6 << 3) + 4;
                }
                i3 += i;
            } else {
                int i9 = i6 << 3;
                long longValue = ((Long) this.zzd[i4]).longValue();
                zzA = zzqv.zzA(i9);
                zzB = zzqv.zzB(longValue);
            }
            i = zzA + zzB;
            i3 += i;
        }
        this.zze = i3;
        return i3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3] >>> 3;
            zzqm zzqmVar = (zzqm) this.zzd[i3];
            int zzA = zzqv.zzA(8);
            int zzA2 = zzqv.zzA(16) + zzqv.zzA(i4);
            int zzA3 = zzqv.zzA(24);
            int zzd = zzqmVar.zzd();
            i2 += zzA + zzA + zzA2 + zzA3 + zzqv.zzA(zzd) + zzd;
        }
        this.zze = i2;
        return i2;
    }

    final zzuw zzd(zzuw zzuwVar) {
        if (zzuwVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzuwVar.zzb;
        zzm(i);
        System.arraycopy(zzuwVar.zzc, 0, this.zzc, this.zzb, zzuwVar.zzb);
        System.arraycopy(zzuwVar.zzd, 0, this.zzd, this.zzb, zzuwVar.zzb);
        this.zzb = i;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zztu.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    final void zzk(zzvi zzviVar) {
        for (int i = 0; i < this.zzb; i++) {
            zzviVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzvi zzviVar) {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzviVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzviVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzviVar.zzd(i4, (zzqm) obj);
                } else if (i3 == 3) {
                    zzviVar.zzF(i4);
                    ((zzuw) obj).zzl(zzviVar);
                    zzviVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new zzsw("Protocol message tag had invalid wire type."));
                    }
                    zzviVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
