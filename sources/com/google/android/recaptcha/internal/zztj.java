package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
final class zztj implements zztq {
    private final zztq[] zza;

    public zztj(zztq... zztqVarArr) {
        this.zza = zztqVarArr;
    }

    @Override // com.google.android.recaptcha.internal.zztq
    public final zztp zzb(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            zztq zztqVar = this.zza[i7];
            if (zztqVar.zzc(cls)) {
                return zztqVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.recaptcha.internal.zztq
    public final boolean zzc(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            if (this.zza[i7].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
