package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class zzp {
    Object zza;
    zzt zzb;
    private zzv zzc = zzv.zze();
    private boolean zzd;

    zzp() {
    }

    protected final void finalize() {
        zzv zzvVar;
        zzt zztVar = this.zzb;
        if (zztVar != null && !zztVar.isDone()) {
            zztVar.zzc(new zzq("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.zza))));
        }
        if (this.zzd || (zzvVar = this.zzc) == null) {
            return;
        }
        zzvVar.zzd(null);
    }

    final void zza() {
        this.zza = null;
        this.zzb = null;
        this.zzc.zzd(null);
    }

    public final boolean zzb(Object obj) {
        this.zzd = true;
        zzt zztVar = this.zzb;
        boolean z = zztVar != null && zztVar.zza(obj);
        if (z) {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }
        return z;
    }
}
