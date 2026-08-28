package com.google.android.recaptcha.internal;

import java.io.IOException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class zzpp {
    private static final zzpp zza = new zzpm("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzpp zzb = new zzpm("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    static {
        char[] cArr;
        new zzpo("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzpo("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        int i9 = zzpl.zza;
        zzpk zzpkVar = new zzpk("base16()", "0123456789ABCDEF".toCharArray());
        new zzpo(zzpkVar, null);
        char[] cArr2 = new char[512];
        cArr = zzpkVar.zzf;
        zzmd.zza(cArr.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            cArr2[i10] = zzpkVar.zza(i10 >>> 4);
            cArr2[i10 | 256] = zzpkVar.zza(i10 & 15);
        }
    }

    public static zzpp zzg() {
        return zza;
    }

    public static zzpp zzh() {
        return zzb;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence);

    public abstract void zzb(Appendable appendable, byte[] bArr, int i9, int i10);

    public abstract int zzc(int i9);

    public abstract int zzd(int i9);

    public CharSequence zze(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i9, int i10) {
        zzmd.zzd(0, i10, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzd(i10));
        try {
            zzb(sb2, bArr, 0, i10);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence zze = zze(charSequence);
            int zzc = zzc(zze.length());
            byte[] bArr = new byte[zzc];
            int zza2 = zza(bArr, zze);
            if (zza2 == zzc) {
                return bArr;
            }
            byte[] bArr2 = new byte[zza2];
            System.arraycopy(bArr, 0, bArr2, 0, zza2);
            return bArr2;
        } catch (zzpn e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
