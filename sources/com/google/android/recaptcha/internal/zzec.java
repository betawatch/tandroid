package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzec extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzeh zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdw zzd;
    final /* synthetic */ zzdq zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ zzhh zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(zzeh zzehVar, String str, zzdw zzdwVar, zzdq zzdqVar, long j, zzhh zzhhVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzehVar;
        this.zzc = str;
        this.zzd = zzdwVar;
        this.zze = zzdqVar;
        this.zzf = j;
        this.zzg = zzhhVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        zzec zzecVar = new zzec(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zw2Var);
        zzecVar.zzh = obj;
        return zzecVar;
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzec) create((zzhk) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        try {
            if (this.zza != 0) {
                ixe.b(obj);
            } else {
                ixe.b(obj);
                zzhk zzhkVar = (zzhk) this.zzh;
                zzeb zzebVar = new zzeb(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, null);
                this.zza = 1;
                obj = zzhj.zze(zzhkVar, 6, zzebVar, this);
                vx2 vx2Var = vx2.a;
                if (obj == vx2Var) {
                    return vx2Var;
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
