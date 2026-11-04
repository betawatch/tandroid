package com.google.android.recaptcha.internal;

import java.math.RoundingMode;
import java.util.Arrays;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class zzpk {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzpk(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i3 = 0; i3 < cArr.length; i3++) {
            char c2 = cArr[i3];
            boolean z10 = true;
            zzmd.zzc(c2 < 128, "Non-ASCII character: %s", c2);
            if (bArr[c2] != -1) {
                z10 = false;
            }
            zzmd.zzc(z10, "Duplicate character: %s", c2);
            bArr[c2] = (byte) i3;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzpk) && Arrays.equals(this.zzf, ((zzpk) obj).zzf);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i3) {
        return this.zzf[i3];
    }

    public final int zzb(char c2) {
        if (c2 > 127) {
            throw new zzpn("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c2))));
        }
        byte b10 = this.zzg[c2];
        if (b10 != -1) {
            return b10;
        }
        if (c2 <= ' ' || c2 == 127) {
            throw new zzpn("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c2))));
        }
        throw new zzpn("Unrecognized character: " + c2);
    }

    public final boolean zzc(int i3) {
        return this.zzh[i3 % this.zzc];
    }

    public final boolean zzd(char c2) {
        return this.zzg[61] != -1;
    }

    private zzpk(String str, char[] cArr, byte[] bArr, boolean z10) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb = zzpr.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = zzb;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzb);
            int i3 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i3;
            this.zzd = zzb >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i3];
            for (int i10 = 0; i10 < this.zzd; i10++) {
                zArr[zzpr.zza(i10 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = false;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(p1.i(cArr.length, "Illegal alphabet length "), e10);
        }
    }
}
