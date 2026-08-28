package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public static void zzc(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(zzmg.zza(str, Character.valueOf(c10)));
        }
    }

    public static void zzd(int i9, int i10, int i11) {
        if (i9 < 0 || i10 < i9 || i10 > i11) {
            throw new IndexOutOfBoundsException((i9 < 0 || i9 > i11) ? zzf(i9, i11, "start index") : (i10 < 0 || i10 > i11) ? zzf(i10, i11, "end index") : zzmg.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i9)));
        }
    }

    public static void zze(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i9, int i10, String str) {
        return i9 < 0 ? zzmg.zza("%s (%s) must not be negative", str, Integer.valueOf(i9)) : zzmg.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
    }
}
