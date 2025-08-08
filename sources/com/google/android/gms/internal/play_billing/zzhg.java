package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public abstract class zzhg extends zzfu {
    protected zzhk zza;
    private final zzhk zzb;

    protected zzhg(zzhk zzhkVar) {
        this.zzb = zzhkVar;
        if (zzhkVar.zzA()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zzhkVar.zzp();
    }

    private static void zza(Object obj, Object obj2) {
        zziu.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzhg clone() {
        zzhg zzhgVar = (zzhg) this.zzb.zzd(5, null, null);
        zzhgVar.zza = zzh();
        return zzhgVar;
    }

    public final zzhg zze(zzhk zzhkVar) {
        if (!this.zzb.equals(zzhkVar)) {
            if (!this.zza.zzA()) {
                zzk();
            }
            zza(this.zza, zzhkVar);
        }
        return this;
    }

    public final zzhk zzf() {
        zzhk zzh = zzh();
        if (zzhk.zzz(zzh, true)) {
            return zzh;
        }
        throw new zzji(zzh);
    }

    @Override // com.google.android.gms.internal.play_billing.zzil
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public zzhk zzh() {
        if (!this.zza.zzA()) {
            return this.zza;
        }
        this.zza.zzv();
        return this.zza;
    }

    protected final void zzj() {
        if (this.zza.zzA()) {
            return;
        }
        zzk();
    }

    protected void zzk() {
        zzhk zzp = this.zzb.zzp();
        zza(zzp, this.zza);
        this.zza = zzp;
    }
}
