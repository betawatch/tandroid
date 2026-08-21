package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzgc implements zzgj {
    private final zzgj[] zza;

    zzgc(zzgj... zzgjVarArr) {
        this.zza = zzgjVarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgj
    public final zzgi zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzgj zzgjVar = this.zza[i];
            if (zzgjVar.zzc(cls)) {
                return zzgjVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.zzgj
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
