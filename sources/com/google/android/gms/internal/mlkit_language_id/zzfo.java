package com.google.android.gms.internal.mlkit_language_id;

/* loaded from: classes.dex */
final class zzfo implements zzfw {
    private zzfw[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfo(zzfw... zzfwVarArr) {
        this.zza = zzfwVarArr;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id.zzfw
    public final boolean zza(Class cls) {
        for (zzfw zzfwVar : this.zza) {
            if (zzfwVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_language_id.zzfw
    public final zzfx zzb(Class cls) {
        for (zzfw zzfwVar : this.zza) {
            if (zzfwVar.zza(cls)) {
                return zzfwVar.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
