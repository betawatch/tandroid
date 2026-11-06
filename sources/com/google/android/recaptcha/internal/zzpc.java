package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        int i7 = zze[0] & 255;
        for (int i10 = 1; i10 < zze.length; i10++) {
            i7 |= (zze[i10] & 255) << (i10 * 8);
        }
        return i7;
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
