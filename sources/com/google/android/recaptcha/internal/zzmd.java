package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class zzmd {
    public static void zza(boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z9, Object obj) {
        if (!z9) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z9, String str, char c10) {
        if (!z9) {
            throw new IllegalArgumentException(zzmg.zza(str, Character.valueOf(c10)));
        }
    }

    public static void zzd(int i7, int i10, int i11) {
        if (i7 < 0 || i10 < i7 || i10 > i11) {
            throw new IndexOutOfBoundsException((i7 < 0 || i7 > i11) ? zzf(i7, i11, "start index") : (i10 < 0 || i10 > i11) ? zzf(i10, i11, "end index") : zzmg.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7)));
        }
    }

    public static void zze(boolean z9, Object obj) {
        if (!z9) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i7, int i10, String str) {
        return i7 < 0 ? zzmg.zza("%s (%s) must not be negative", str, Integer.valueOf(i7)) : zzmg.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
    }
}
