package com.google.android.gms.internal.cast;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzv {
    private final zzg zza;
    private final zzaf zzb;
    private final String zzc;
    private zzx zzd;
    private final zzs zze = new zzs(this, null);

    public zzv(zzg zzgVar, zzaf zzafVar, String str) {
        this.zza = zzgVar;
        this.zzb = zzafVar;
        this.zzc = str;
    }

    static /* bridge */ /* synthetic */ void zzf(zzv zzvVar, zzz zzzVar) {
        if (zzzVar.zzc() == 2 && zzvVar.zzd != null) {
            zzvVar.zzh();
        }
        if (zzzVar.zzc() == 2) {
            zzvVar.zzd = zzx.zza(zzvVar.zza, zzvVar.zzc);
        } else {
            zzvVar.zzd = zzvVar.zzg();
        }
        ((zzx) Preconditions.checkNotNull(zzvVar.zzd)).zzc(zzzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzx zzg() {
        if (this.zzd == null) {
            zzx zza = zzx.zza(this.zza, this.zzc);
            this.zzd = zza;
            zza.zzh(1);
        }
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh() {
        zzx zzxVar = this.zzd;
        if (zzxVar != null) {
            zzxVar.zze();
            this.zzd = null;
        }
    }
}
