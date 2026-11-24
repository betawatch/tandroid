package com.google.android.recaptcha.internal;

import java.io.IOException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class zzpp {
    private static final zzpp zza = new zzpm("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzpp zzb = new zzpm("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    static {
        char[] cArr;
        new zzpo("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzpo("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        int i = zzpl.zza;
        zzpk zzpkVar = new zzpk("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'});
        new zzpo(zzpkVar, null);
        char[] cArr2 = new char[512];
        cArr = zzpkVar.zzf;
        zzmd.zza(cArr.length == 16);
        for (int i2 = 0; i2 < 256; i2++) {
            cArr2[i2] = zzpkVar.zza(i2 >>> 4);
            cArr2[i2 | 256] = zzpkVar.zza(i2 & 15);
        }
    }

    public static zzpp zzg() {
        return zza;
    }

    public static zzpp zzh() {
        return zzb;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence);

    public abstract void zzb(Appendable appendable, byte[] bArr, int i, int i2);

    public abstract int zzc(int i);

    public abstract int zzd(int i);

    public CharSequence zze(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i, int i2) {
        zzmd.zzd(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i2));
        try {
            zzb(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            fi7.g(e);
            return null;
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
        } catch (zzpn e) {
            throw new IllegalArgumentException(e);
        }
    }
}
