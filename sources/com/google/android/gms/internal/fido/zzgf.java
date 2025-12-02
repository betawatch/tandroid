package com.google.android.gms.internal.fido;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zzgf {
    private static final zzgf zza = new zzgd("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzgf zzb = new zzgd("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzgf zzc = new zzge("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final zzgf zzd = new zzge("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final zzgf zze = new zzgc("base16()", "0123456789ABCDEF");

    zzgf() {
    }

    public static zzgf zzf() {
        return zze;
    }

    abstract void zzb(Appendable appendable, byte[] bArr, int i, int i2);

    abstract int zzc(int i);

    public abstract zzgf zzd();

    public final String zzg(byte[] bArr, int i, int i2) {
        zzbm.zze(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zzc(i2));
        try {
            zzb(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
