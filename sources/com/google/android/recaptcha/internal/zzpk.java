package com.google.android.recaptcha.internal;

import i2.g;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c10 = cArr[i10];
            boolean z10 = true;
            zzmd.zzc(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z10 = false;
            }
            zzmd.zzc(z10, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i10;
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

    public final char zza(int i10) {
        return this.zzf[i10];
    }

    public final int zzb(char c10) {
        if (c10 > 127) {
            throw new zzpn("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        byte b10 = this.zzg[c10];
        if (b10 != -1) {
            return b10;
        }
        if (c10 <= ' ' || c10 == 127) {
            throw new zzpn("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
        }
        throw new zzpn("Unrecognized character: " + c10);
    }

    public final boolean zzc(int i10) {
        return this.zzh[i10 % this.zzc];
    }

    public final boolean zzd(char c10) {
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
            int i10 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i10;
            this.zzd = zzb >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.zzd; i11++) {
                zArr[zzpr.zza(i11 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = false;
        } catch (ArithmeticException e7) {
            throw new IllegalArgumentException(g.i(cArr.length, "Illegal alphabet length "), e7);
        }
    }
}
