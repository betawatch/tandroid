package com.google.android.gms.internal.play_billing;

import j$.util.Objects;

/* loaded from: classes.dex */
final class zzs extends zzo {
    final /* synthetic */ zzt zzg;

    zzs(zzt zztVar) {
        Objects.requireNonNull(zztVar);
        this.zzg = zztVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzo
    protected final String zza() {
        zzp zzpVar = (zzp) this.zzg.zza.get();
        if (zzpVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(zzpVar.zza) + "]";
    }
}
