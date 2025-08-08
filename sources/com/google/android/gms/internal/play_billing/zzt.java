package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzt extends zzq {
    final /* synthetic */ zzu zzg;

    zzt(zzu zzuVar) {
        this.zzg = zzuVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzq
    protected final String zza() {
        zzr zzrVar = (zzr) this.zzg.zza.get();
        if (zzrVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(zzrVar.zza) + "]";
    }
}
