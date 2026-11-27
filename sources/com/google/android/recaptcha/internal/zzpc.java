package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class zzpc {
    private static final char[] zza = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
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
        int i = zze[0] & 255;
        for (int i2 = 1; i2 < zze.length; i2++) {
            i |= (zze[i2] & 255) << (i2 << 3);
        }
        return i;
    }

    public final String toString() {
        byte[] zze = zze();
        StringBuilder sb = new StringBuilder(zze.length << 1);
        for (byte b : zze) {
            char[] cArr = zza;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
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
