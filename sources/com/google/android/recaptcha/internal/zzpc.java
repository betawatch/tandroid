package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        int i9 = zze[0] & 255;
        for (int i10 = 1; i10 < zze.length; i10++) {
            i9 |= (zze[i10] & 255) << (i10 * 8);
        }
        return i9;
    }

    public final String toString() {
        byte[] zze = zze();
        int length = zze.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : zze) {
            char[] cArr = zza;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract boolean zzc(zzpc zzpcVar);

    public abstract byte[] zzd();

    public byte[] zze() {
        throw null;
    }
}
