package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
