package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
final class zztj implements zztq {
    private final zztq[] zza;

    public zztj(zztq... zztqVarArr) {
        this.zza = zztqVarArr;
    }

    @Override // com.google.android.recaptcha.internal.zztq
    public final zztp zzb(Class cls) {
        for (int i9 = 0; i9 < 2; i9++) {
            zztq zztqVar = this.zza[i9];
            if (zztqVar.zzc(cls)) {
                return zztqVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.recaptcha.internal.zztq
    public final boolean zzc(Class cls) {
        for (int i9 = 0; i9 < 2; i9++) {
            if (this.zza[i9].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
