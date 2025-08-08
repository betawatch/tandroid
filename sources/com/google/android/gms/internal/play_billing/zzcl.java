package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzcl extends zzbh {
    private final zzco zza;

    zzcl(zzco zzcoVar, int i) {
        super(zzcoVar.size(), i);
        this.zza = zzcoVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbh
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
