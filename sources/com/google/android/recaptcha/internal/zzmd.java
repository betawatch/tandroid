package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzmd {
    public static void zza(boolean z) {
        if (z) {
            return;
        }
        iy8.d();
    }

    public static void zzb(boolean z, Object obj) {
        if (z) {
            return;
        }
        lq5.j((String) obj);
    }

    public static void zzc(boolean z, String str, char c) {
        if (z) {
            return;
        }
        lq5.j(zzmg.zza(str, Character.valueOf(c)));
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
        grb.i((String) obj);
    }

    private static String zzf(int i, int i2, String str) {
        return i < 0 ? zzmg.zza("%s (%s) must not be negative", str, Integer.valueOf(i)) : zzmg.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }
}
