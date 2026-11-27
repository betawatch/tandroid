package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class zzsg implements zztq {
    private static final zzsg zza = new zzsg();

    private zzsg() {
    }

    public static zzsg zza() {
        return zza;
    }

    @Override // com.google.android.recaptcha.internal.zztq
    public final zztp zzb(Class cls) {
        if (!zzsn.class.isAssignableFrom(cls)) {
            lq5.j("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (zztp) zzsn.zzu(cls.asSubclass(zzsn.class)).zzh(3, null, null);
        } catch (Exception e) {
            grb.j("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // com.google.android.recaptcha.internal.zztq
    public final boolean zzc(Class cls) {
        return zzsn.class.isAssignableFrom(cls);
    }
}
