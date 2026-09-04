package com.google.android.recaptcha.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class zzvm {
    protected static final Charset zza = StandardCharsets.UTF_16;
    protected int[] zzb;
    protected int[] zzc;
    private final int[] zzd = {511133343, 1277647508, 107287496, 338123662};
    private byte[] zze;
    private byte[] zzf;
    private int zzg;

    public zzvm() {
    }

    public static int zza(int i10, int i11) {
        if (i10 % 2 != 0) {
            return (i10 | i11) - (i10 & i11);
        }
        return ((~i10) & i11) | ((~i11) & i10);
    }

    public static String zze(String str, byte[] bArr, zzvn zzvnVar) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr2 = new byte[12];
        int length = decode.length - 12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(decode, 0, bArr2, 0, 12);
        System.arraycopy(decode, 12, bArr3, 0, length);
        return new String(new zzvm(bArr, bArr2).zzd(bArr3), zza);
    }

    public static String zzf(String str, byte[] bArr, zzvn zzvnVar) {
        byte[] bArr2 = new byte[12];
        new SecureRandom().nextBytes(bArr2);
        byte[] zzd = new zzvm(bArr, bArr2).zzd(str.getBytes(zza));
        int length = zzd.length;
        byte[] bArr3 = new byte[length + 12];
        System.arraycopy(bArr2, 0, bArr3, 0, 12);
        System.arraycopy(zzd, 0, bArr3, 12, length);
        return Base64.encodeToString(bArr3, 2);
    }

    private static final int zzg(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final void zzb(int i10, int i11, int i12, int i13) {
        zzc(i10, i11, i13, 16);
        zzc(i12, i13, i11, 12);
        zzc(i10, i11, i13, 8);
        zzc(i12, i13, i11, 7);
    }

    public final void zzc(int i10, int i11, int i12, int i13) {
        int[] iArr = this.zzb;
        int i14 = iArr[i10] + iArr[i11];
        iArr[i10] = i14;
        int zza2 = zza(iArr[i12], i14);
        iArr[i12] = zza2;
        iArr[i12] = (zza2 << i13) | (zza2 >>> (32 - i13));
    }

    public final byte[] zzd(byte[] bArr) {
        if (this.zzg != 1) {
            throw new IllegalStateException();
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i10 = 0;
        while (length > 0) {
            int[] iArr = this.zzc;
            int[] iArr2 = this.zzb;
            int length2 = iArr.length;
            System.arraycopy(iArr, 0, iArr2, 0, 16);
            this.zzb[12] = this.zzg;
            for (int i11 = 0; i11 < 10; i11++) {
                zzb(0, 4, 8, 12);
                zzb(1, 5, 9, 13);
                zzb(2, 6, 10, 14);
                zzb(3, 7, 11, 15);
                zzb(0, 5, 10, 15);
                zzb(1, 6, 11, 12);
                zzb(2, 7, 8, 13);
                zzb(3, 4, 9, 14);
            }
            byte[] bArr3 = new byte[64];
            for (int i12 = 0; i12 < 16; i12++) {
                int i13 = this.zzb[i12];
                int i14 = i12 * 4;
                bArr3[i14] = (byte) (i13 & 255);
                bArr3[i14 + 1] = (byte) ((i13 >> 8) & 255);
                bArr3[i14 + 2] = (byte) ((i13 >> 16) & 255);
                bArr3[i14 + 3] = (byte) ((i13 >> 24) & 255);
            }
            for (int i15 = 0; i15 < Math.min(64, length); i15++) {
                int i16 = i10 + i15;
                bArr2[i16] = (byte) zza(bArr3[i15], bArr[i16]);
            }
            this.zzg++;
            length -= 64;
            i10 += 64;
        }
        return bArr2;
    }

    public zzvm(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException();
        }
        this.zze = bArr;
        this.zzg = 1;
        this.zzf = bArr2;
        this.zzb = new int[16];
        for (int i10 = 0; i10 < 4; i10++) {
            this.zzb[i10] = zza(this.zzd[i10], 2131181306);
        }
        for (int i11 = 4; i11 < 12; i11++) {
            this.zzb[i11] = zzg(this.zze, (i11 - 4) * 4);
        }
        this.zzb[12] = this.zzg;
        for (int i12 = 13; i12 < 16; i12++) {
            this.zzb[i12] = zzg(this.zzf, (i12 - 13) * 4);
        }
        int[] iArr = new int[16];
        this.zzc = iArr;
        int[] iArr2 = this.zzb;
        int length = iArr2.length;
        System.arraycopy(iArr2, 0, iArr, 0, 16);
    }
}
