package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class zzfz extends yfb implements is4 {
    int zza;
    final /* synthetic */ zzgb zzb;
    final /* synthetic */ up2 zzc;
    final /* synthetic */ zzhk zzd;
    final /* synthetic */ long zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfz(zzgb zzgbVar, up2 up2Var, zzhk zzhkVar, long j, zw2 zw2Var) {
        super(2, zw2Var);
        this.zzb = zzgbVar;
        this.zzc = up2Var;
        this.zzd = zzhkVar;
        this.zze = j;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzfz(this.zzb, this.zzc, this.zzd, this.zze, zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfz) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        zzcg zzcgVar;
        zzfz zzfzVar;
        zzdr zzdrVar;
        zzcg e;
        zzcx zzcxVar;
        zzfw zzfwVar;
        zzfy zzfyVar;
        if (this.zza != 0) {
            try {
                ixe.b(obj);
                zzfzVar = this;
            } catch (zzcg e2) {
                zzcgVar = e2;
                zzfzVar = this;
                zzgb zzgbVar = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar.zzf = zzdrVar;
                ((vp2) zzfzVar.zzc).P(zzcgVar);
                return f9c.a;
            }
        } else {
            ixe.b(obj);
            try {
                zzcxVar = zzcx.zza;
                zzgb zzgbVar2 = this.zzb;
                zzfwVar = new zzfw(zzgbVar2);
                zzfyVar = new zzfy(this.zzd, zzgbVar2, this.zze, this.zzc, null);
                this.zza = 1;
                zzfzVar = this;
            } catch (zzcg e3) {
                e = e3;
                zzfzVar = this;
                zzcgVar = e;
                zzgb zzgbVar3 = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar3.zzf = zzdrVar;
                ((vp2) zzfzVar.zzc).P(zzcgVar);
                return f9c.a;
            }
            try {
                obj = zzcxVar.zzb(zzfwVar, 100L, 1000L, 2.0d, zzfyVar, zzfzVar);
                vx2 vx2Var = vx2.a;
                if (obj == vx2Var) {
                    return vx2Var;
                }
            } catch (zzcg e4) {
                e = e4;
                zzcgVar = e;
                zzgb zzgbVar32 = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar32.zzf = zzdrVar;
                ((vp2) zzfzVar.zzc).P(zzcgVar);
                return f9c.a;
            }
        }
        ((Boolean) obj).getClass();
        return f9c.a;
    }
}
