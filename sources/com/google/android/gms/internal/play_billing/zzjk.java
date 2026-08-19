package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzjk {
    private static final zzjk zza = new zzjk(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze = -1;
    private boolean zzf;

    private zzjk(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzjk zzc() {
        return zza;
    }

    static zzjk zze(zzjk zzjkVar, zzjk zzjkVar2) {
        int i = zzjkVar.zzb + zzjkVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzjkVar.zzc, i);
        System.arraycopy(zzjkVar2.zzc, 0, copyOf, zzjkVar.zzb, zzjkVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzjkVar.zzd, i);
        System.arraycopy(zzjkVar2.zzd, 0, copyOf2, zzjkVar.zzb, zzjkVar2.zzb);
        return new zzjk(i, copyOf, copyOf2, true);
    }

    static zzjk zzf() {
        return new zzjk(0, new int[8], new Object[8], true);
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
        if (obj == null || !(obj instanceof zzjk)) {
            return false;
        }
        zzjk zzjkVar = (zzjk) obj;
        int i = this.zzb;
        if (i == zzjkVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzjkVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzjkVar.zzd;
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
        int zzz;
        int zzA;
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
                    ((Long) this.zzd[i4]).getClass();
                    i = zzgr.zzz(i6 << 3) + 8;
                } else if (i7 == 2) {
                    int i8 = i6 << 3;
                    zzgk zzgkVar = (zzgk) this.zzd[i4];
                    int zzz2 = zzgr.zzz(i8);
                    int zzd = zzgkVar.zzd();
                    i = zzz2 + zzgr.zzz(zzd) + zzd;
                } else if (i7 == 3) {
                    int zzz3 = zzgr.zzz(i6 << 3);
                    zzz = zzz3 + zzz3;
                    zzA = ((zzjk) this.zzd[i4]).zza();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(new zzhq("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i4]).getClass();
                    i = zzgr.zzz(i6 << 3) + 4;
                }
                i3 += i;
            } else {
                int i9 = i6 << 3;
                long longValue = ((Long) this.zzd[i4]).longValue();
                zzz = zzgr.zzz(i9);
                zzA = zzgr.zzA(longValue);
            }
            i = zzz + zzA;
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
            zzgk zzgkVar = (zzgk) this.zzd[i3];
            int zzz = zzgr.zzz(8);
            int zzz2 = zzgr.zzz(16) + zzgr.zzz(i4);
            int zzz3 = zzgr.zzz(24);
            int zzd = zzgkVar.zzd();
            i2 += zzz + zzz + zzz2 + zzz3 + zzgr.zzz(zzd) + zzd;
        }
        this.zze = i2;
        return i2;
    }

    final zzjk zzd(zzjk zzjkVar) {
        if (zzjkVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzjkVar.zzb;
        zzm(i);
        System.arraycopy(zzjkVar.zzc, 0, this.zzc, this.zzb, zzjkVar.zzb);
        System.arraycopy(zzjkVar.zzd, 0, this.zzd, this.zzb, zzjkVar.zzb);
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
            zzio.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
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

    public final void zzl(zzjw zzjwVar) {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzjwVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzjwVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzjwVar.zzd(i4, (zzgk) obj);
                } else if (i3 == 3) {
                    zzjwVar.zzF(i4);
                    ((zzjk) obj).zzl(zzjwVar);
                    zzjwVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new zzhq("Protocol message tag had invalid wire type."));
                    }
                    zzjwVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
