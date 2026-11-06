package com.google.android.recaptcha.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class zzuw {
    private static final zzuw zza = new zzuw(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzuw(int i7, int[] iArr, Object[] objArr, boolean z9) {
        this.zze = -1;
        this.zzb = i7;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z9;
    }

    public static zzuw zzc() {
        return zza;
    }

    public static zzuw zze(zzuw zzuwVar, zzuw zzuwVar2) {
        int i7 = zzuwVar.zzb + zzuwVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzuwVar.zzc, i7);
        System.arraycopy(zzuwVar2.zzc, 0, copyOf, zzuwVar.zzb, zzuwVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzuwVar.zzd, i7);
        System.arraycopy(zzuwVar2.zzd, 0, copyOf2, zzuwVar.zzb, zzuwVar2.zzb);
        return new zzuw(i7, copyOf, copyOf2, true);
    }

    public static zzuw zzf() {
        return new zzuw(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i7) {
        int[] iArr = this.zzc;
        if (i7 > iArr.length) {
            int i10 = this.zzb;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i7) {
                i7 = i11;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i7);
            this.zzd = Arrays.copyOf(this.zzd, i7);
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
        int i7 = this.zzb;
        if (i7 == zzuwVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzuwVar.zzc;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzuwVar.zzd;
                    int i11 = this.zzb;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzb;
        int i10 = i7 + 527;
        int[] iArr = this.zzc;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i7; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i10 * 31) + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }

    public final int zza() {
        int zzA;
        int zzB;
        int zzA2;
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.zzd[i11]).getClass();
                    zzA2 = zzqv.zzA(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    zzqm zzqmVar = (zzqm) this.zzd[i11];
                    int zzA3 = zzqv.zzA(i15);
                    int zzd = zzqmVar.zzd();
                    i10 = zzqv.zzA(zzd) + zzd + zzA3 + i10;
                } else if (i14 == 3) {
                    int zzA4 = zzqv.zzA(i13 << 3);
                    zzA = zzA4 + zzA4;
                    zzB = ((zzuw) this.zzd[i11]).zza();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(new zzsw("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i11]).getClass();
                    zzA2 = zzqv.zzA(i13 << 3) + 4;
                }
                i10 = zzA2 + i10;
            } else {
                int i16 = i13 << 3;
                long longValue = ((Long) this.zzd[i11]).longValue();
                zzA = zzqv.zzA(i16);
                zzB = zzqv.zzB(longValue);
            }
            i10 = zzB + zzA + i10;
        }
        this.zze = i10;
        return i10;
    }

    public final int zzb() {
        int i7 = this.zze;
        if (i7 != -1) {
            return i7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zzqm zzqmVar = (zzqm) this.zzd[i11];
            int zzA = zzqv.zzA(8);
            int zzA2 = zzqv.zzA(i12) + zzqv.zzA(16);
            int zzA3 = zzqv.zzA(24);
            int zzd = zzqmVar.zzd();
            i10 += zzA + zzA + zzA2 + a.d(zzd, zzd, zzA3);
        }
        this.zze = i10;
        return i10;
    }

    public final zzuw zzd(zzuw zzuwVar) {
        if (zzuwVar.equals(zza)) {
            return this;
        }
        zzg();
        int i7 = this.zzb + zzuwVar.zzb;
        zzm(i7);
        System.arraycopy(zzuwVar.zzc, 0, this.zzc, this.zzb, zzuwVar.zzb);
        System.arraycopy(zzuwVar.zzd, 0, this.zzd, this.zzb, zzuwVar.zzb);
        this.zzb = i7;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb2, int i7) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zztu.zzb(sb2, i7, String.valueOf(this.zzc[i10] >>> 3), this.zzd[i10]);
        }
    }

    public final void zzj(int i7, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i10 = this.zzb;
        iArr[i10] = i7;
        this.zzd[i10] = obj;
        this.zzb = i10 + 1;
    }

    public final void zzk(zzvi zzviVar) {
        for (int i7 = 0; i7 < this.zzb; i7++) {
            zzviVar.zzw(this.zzc[i7] >>> 3, this.zzd[i7]);
        }
    }

    public final void zzl(zzvi zzviVar) {
        if (this.zzb != 0) {
            for (int i7 = 0; i7 < this.zzb; i7++) {
                int i10 = this.zzc[i7];
                Object obj = this.zzd[i7];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    zzviVar.zzt(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    zzviVar.zzm(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    zzviVar.zzd(i12, (zzqm) obj);
                } else if (i11 == 3) {
                    zzviVar.zzF(i12);
                    ((zzuw) obj).zzl(zzviVar);
                    zzviVar.zzh(i12);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new zzsw("Protocol message tag had invalid wire type."));
                    }
                    zzviVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzuw() {
        this(0, new int[8], new Object[8], true);
    }
}
