package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class zzpc {
    private static final char[] zza = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int zzb = 0;

    public final boolean equals(Object obj) {
        if (obj instanceof zzpc) {
            zzpc zzpcVar = (zzpc) obj;
            if (zzb() == zzpcVar.zzb() && zzc(zzpcVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (zzb() >= 32) {
            return zza();
        }
        byte[] zze = zze();
        int i10 = zze[0] & 255;
        for (int i11 = 1; i11 < zze.length; i11++) {
            i10 |= (zze[i11] & 255) << (i11 * 8);
        }
        return i10;
    }

    public final String toString() {
        byte[] zze = zze();
        int length = zze.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b10 : zze) {
            char[] cArr = zza;
            sb.append(cArr[(b10 >> 4) & 15]);
            sb.append(cArr[b10 & 15]);
        }
        return sb.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract boolean zzc(zzpc zzpcVar);

    public abstract byte[] zzd();

    public byte[] zze() {
        throw null;
    }
}
