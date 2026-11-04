package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class zzmd {
    public static void zza(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z10, String str, char c2) {
        if (!z10) {
            throw new IllegalArgumentException(zzmg.zza(str, Character.valueOf(c2)));
        }
    }

    public static void zzd(int i3, int i10, int i11) {
        if (i3 < 0 || i10 < i3 || i10 > i11) {
            throw new IndexOutOfBoundsException((i3 < 0 || i3 > i11) ? zzf(i3, i11, "start index") : (i10 < 0 || i10 > i11) ? zzf(i10, i11, "end index") : zzmg.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i3)));
        }
    }

    public static void zze(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i3, int i10, String str) {
        return i3 < 0 ? zzmg.zza("%s (%s) must not be negative", str, Integer.valueOf(i3)) : zzmg.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i10));
    }
}
