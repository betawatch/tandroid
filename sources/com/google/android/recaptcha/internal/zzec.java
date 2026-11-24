package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzec extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzeh zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdw zzd;
    final /* synthetic */ zzdq zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ zzhh zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(zzeh zzehVar, String str, zzdw zzdwVar, zzdq zzdqVar, long j, zzhh zzhhVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzehVar;
        this.zzc = str;
        this.zzd = zzdwVar;
        this.zze = zzdqVar;
        this.zzf = j;
        this.zzg = zzhhVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        zzec zzecVar = new zzec(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, fw2Var);
        zzecVar.zzh = obj;
        return zzecVar;
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzec) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        try {
            if (this.zza != 0) {
                qse.b(obj);
            } else {
                qse.b(obj);
                zzhk zzhkVar = (zzhk) this.zzh;
                zzeb zzebVar = new zzeb(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, null);
                this.zza = 1;
                obj = zzhj.zze(zzhkVar, 6, zzebVar, this);
                bx2 bx2Var = bx2.a;
                if (obj == bx2Var) {
                    return bx2Var;
                }
            }
            return (zzeq) obj;
        } catch (zzcg e) {
            throw e.zzc();
        } catch (Exception e2) {
            throw new zzcg(zzce.zzb, zzcd.zza, e2.getMessage(), null, 8, null).zzc();
        }
    }
}
