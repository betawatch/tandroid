package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zztq
    public final boolean zzc(Class cls) {
        return zzsn.class.isAssignableFrom(cls);
    }
}
