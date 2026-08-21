package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzfd implements zzgj {
    private static final zzfd zza = new zzfd();

    private zzfd() {
    }

    public static zzfd zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgj
    public final zzgi zzb(Class cls) {
        if (!zzfi.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzgi) zzfi.zzn(cls.asSubclass(zzfi.class)).zzb(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgj
    public final boolean zzc(Class cls) {
        return zzfi.class.isAssignableFrom(cls);
    }
}
