package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzec extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzeh zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdw zzd;
    final /* synthetic */ zzdq zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ zzhh zzg;
    private /* synthetic */ Object zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(zzeh zzehVar, String str, zzdw zzdwVar, zzdq zzdqVar, long j, zzhh zzhhVar, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzehVar;
        this.zzc = str;
        this.zzd = zzdwVar;
        this.zze = zzdqVar;
        this.zzf = j;
        this.zzg = zzhhVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzec zzecVar = new zzec(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, px2Var);
        zzecVar.zzh = obj;
        return zzecVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzec) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        try {
            if (this.zza != 0) {
                tue.b(obj);
            } else {
                tue.b(obj);
                zzhk zzhkVar = (zzhk) this.zzh;
                zzeb zzebVar = new zzeb(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, null);
                this.zza = 1;
                obj = zzhj.zze(zzhkVar, 6, zzebVar, this);
                ly2 ly2Var = ly2.a;
                if (obj == ly2Var) {
                    return ly2Var;
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
