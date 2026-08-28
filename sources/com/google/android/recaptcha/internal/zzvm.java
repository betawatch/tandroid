package com.google.android.recaptcha.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public static int zza(int i9, int i10) {
        if (i9 % 2 != 0) {
            return (i9 | i10) - (i9 & i10);
        }
        return ((~i9) & i10) | ((~i10) & i9);
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

    private static final int zzg(byte[] bArr, int i9) {
        int i10 = bArr[i9] & 255;
        int i11 = bArr[i9 + 1] & 255;
        int i12 = bArr[i9 + 2] & 255;
        return ((bArr[i9 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final void zzb(int i9, int i10, int i11, int i12) {
        zzc(i9, i10, i12, 16);
        zzc(i11, i12, i10, 12);
        zzc(i9, i10, i12, 8);
        zzc(i11, i12, i10, 7);
    }

    public final void zzc(int i9, int i10, int i11, int i12) {
        int[] iArr = this.zzb;
        int i13 = iArr[i9] + iArr[i10];
        iArr[i9] = i13;
        int zza2 = zza(iArr[i11], i13);
        iArr[i11] = zza2;
        iArr[i11] = (zza2 << i12) | (zza2 >>> (32 - i12));
    }

    public final byte[] zzd(byte[] bArr) {
        if (this.zzg != 1) {
            throw new IllegalStateException();
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i9 = 0;
        while (length > 0) {
            int[] iArr = this.zzc;
            int[] iArr2 = this.zzb;
            int length2 = iArr.length;
            System.arraycopy(iArr, 0, iArr2, 0, 16);
            this.zzb[12] = this.zzg;
            for (int i10 = 0; i10 < 10; i10++) {
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
            for (int i11 = 0; i11 < 16; i11++) {
                int i12 = this.zzb[i11];
                int i13 = i11 * 4;
                bArr3[i13] = (byte) (i12 & 255);
                bArr3[i13 + 1] = (byte) ((i12 >> 8) & 255);
                bArr3[i13 + 2] = (byte) ((i12 >> 16) & 255);
                bArr3[i13 + 3] = (byte) ((i12 >> 24) & 255);
            }
            for (int i14 = 0; i14 < Math.min(64, length); i14++) {
                int i15 = i9 + i14;
                bArr2[i15] = (byte) zza(bArr3[i14], bArr[i15]);
            }
            this.zzg++;
            length -= 64;
            i9 += 64;
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
        for (int i9 = 0; i9 < 4; i9++) {
            this.zzb[i9] = zza(this.zzd[i9], 2131181306);
        }
        for (int i10 = 4; i10 < 12; i10++) {
            this.zzb[i10] = zzg(this.zze, (i10 - 4) * 4);
        }
        this.zzb[12] = this.zzg;
        for (int i11 = 13; i11 < 16; i11++) {
            this.zzb[i11] = zzg(this.zzf, (i11 - 13) * 4);
        }
        int[] iArr = new int[16];
        this.zzc = iArr;
        int[] iArr2 = this.zzb;
        int length = iArr2.length;
        System.arraycopy(iArr2, 0, iArr, 0, 16);
    }
}
