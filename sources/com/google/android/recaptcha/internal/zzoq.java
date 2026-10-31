package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
