package com.google.android.recaptcha.internal;

import j3.r0;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        for (int i9 = 0; i9 < cArr.length; i9++) {
            char c10 = cArr[i9];
            boolean z10 = true;
            zzmd.zzc(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z10 = false;
            }
            zzmd.zzc(z10, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i9;
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

    public final char zza(int i9) {
        return this.zzf[i9];
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

    public final boolean zzc(int i9) {
        return this.zzh[i9 % this.zzc];
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
            int i9 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i9;
            this.zzd = zzb >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i9];
            for (int i10 = 0; i10 < this.zzd; i10++) {
                zArr[zzpr.zza(i10 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = false;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(r0.l(cArr.length, "Illegal alphabet length "), e10);
        }
    }
}
