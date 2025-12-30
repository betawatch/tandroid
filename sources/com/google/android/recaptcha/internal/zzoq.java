package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
enum zzoq {
    zza,
    zzb,
    zzc,
    zzd;

    static /* bridge */ /* synthetic */ zzoq zza(Object obj) {
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
