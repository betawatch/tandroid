package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zztp) zzsn.zzu(cls.asSubclass(zzsn.class)).zzh(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zztq
    public final boolean zzc(Class cls) {
        return zzsn.class.isAssignableFrom(cls);
    }
}
