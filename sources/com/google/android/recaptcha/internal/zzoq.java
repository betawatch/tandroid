package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
enum zzoq {
    zza,
    zzb,
    zzc,
    zzd;

    public static /* bridge */ /* synthetic */ zzoq zza(Object obj) {
        if (obj instanceof String) {
            return zzb;
        }
        if (obj instanceof Boolean) {
            return zza;
        }
        if (obj instanceof Long) {
            return zzc;
        }
        if (obj instanceof Double) {
            return zzd;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(obj.getClass())));
    }
}
