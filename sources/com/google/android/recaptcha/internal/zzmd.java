package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zzmd {
    public static void zza(boolean z) {
        if (z) {
            return;
        }
        sc8.e();
    }

    public static void zzb(boolean z, Object obj) {
        if (z) {
            return;
        }
        w26.j((String) obj);
    }

    public static void zzc(boolean z, String str, char c) {
        if (z) {
            return;
        }
        w26.j(zzmg.zza(str, Character.valueOf(c)));
    }

    public static void zzd(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zzf(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzf(i2, i3, "end index") : zzmg.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void zze(boolean z, Object obj) {
        if (z) {
            return;
        }
        sc8.j((String) obj);
    }

    private static String zzf(int i, int i2, String str) {
        return i < 0 ? zzmg.zza("%s (%s) must not be negative", str, Integer.valueOf(i)) : zzmg.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }
}
