package com.google.android.recaptcha.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
public final class zzvm {
    protected static final Charset zza = StandardCharsets.UTF_16;
    protected int[] zzb;
    protected int[] zzc;
    private final int[] zzd = {511133343, 1277647508, 107287496, 338123662};
    private byte[] zze;
    private byte[] zzf;
    private int zzg;

    protected zzvm() {
    }

    protected zzvm(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException();
        }
        this.zze = bArr;
        this.zzg = 1;
        this.zzf = bArr2;
        this.zzb = new int[16];
        for (int i = 0; i < 4; i++) {
            this.zzb[i] = zza(this.zzd[i], 2131181306);
        }
        for (int i2 = 4; i2 < 12; i2++) {
            this.zzb[i2] = zzg(this.zze, (i2 - 4) * 4);
        }
        this.zzb[12] = this.zzg;
        for (int i3 = 13; i3 < 16; i3++) {
            this.zzb[i3] = zzg(this.zzf, (i3 - 13) * 4);
        }
        int[] iArr = new int[16];
        this.zzc = iArr;
        int[] iArr2 = this.zzb;
        int length = iArr2.length;
        System.arraycopy(iArr2, 0, iArr, 0, 16);
    }

    protected static int zza(int i, int i2) {
        if (i % 2 != 0) {
            return (i | i2) - (i & i2);
        }
        return ((~i) & i2) | ((~i2) & i);
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

    private static final int zzg(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    protected final void zzb(int i, int i2, int i3, int i4) {
        zzc(i, i2, i4, 16);
        zzc(i3, i4, i2, 12);
        zzc(i, i2, i4, 8);
        zzc(i3, i4, i2, 7);
    }

    protected final void zzc(int i, int i2, int i3, int i4) {
        int[] iArr = this.zzb;
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int zza2 = zza(iArr[i3], i5);
        iArr[i3] = zza2;
        iArr[i3] = (zza2 << i4) | (zza2 >>> (32 - i4));
    }

    protected final byte[] zzd(byte[] bArr) {
        if (this.zzg != 1) {
            throw new IllegalStateException();
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i = 0;
        while (length > 0) {
            int[] iArr = this.zzc;
            int[] iArr2 = this.zzb;
            int length2 = iArr.length;
            System.arraycopy(iArr, 0, iArr2, 0, 16);
            this.zzb[12] = this.zzg;
            for (int i2 = 0; i2 < 10; i2++) {
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
            for (int i3 = 0; i3 < 16; i3++) {
                int i4 = this.zzb[i3];
                int i5 = i3 * 4;
                bArr3[i5] = (byte) (i4 & NotificationCenter.closeOtherAppActivities);
                bArr3[i5 + 1] = (byte) ((i4 >> 8) & NotificationCenter.closeOtherAppActivities);
                bArr3[i5 + 2] = (byte) ((i4 >> 16) & NotificationCenter.closeOtherAppActivities);
                bArr3[i5 + 3] = (byte) ((i4 >> 24) & NotificationCenter.closeOtherAppActivities);
            }
            for (int i6 = 0; i6 < Math.min(64, length); i6++) {
                int i7 = i + i6;
                bArr2[i7] = (byte) zza(bArr3[i6], bArr[i7]);
            }
            this.zzg++;
            length -= 64;
            i += 64;
        }
        return bArr2;
    }
}
