package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzbr extends zzbn {
    private final zzbt zza;

    zzbr(zzbt zzbtVar, int i) {
        super(zzbtVar.size(), i);
        this.zza = zzbtVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbn
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
