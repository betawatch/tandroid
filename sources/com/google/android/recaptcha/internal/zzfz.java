package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzfz extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzgb zzb;
    final /* synthetic */ mq2 zzc;
    final /* synthetic */ zzhk zzd;
    final /* synthetic */ long zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfz(zzgb zzgbVar, mq2 mq2Var, zzhk zzhkVar, long j, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzgbVar;
        this.zzc = mq2Var;
        this.zzd = zzhkVar;
        this.zze = j;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzfz(this.zzb, this.zzc, this.zzd, this.zze, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfz) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
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
                tue.b(obj);
                zzfzVar = this;
            } catch (zzcg e2) {
                zzcgVar = e2;
                zzfzVar = this;
                zzgb zzgbVar = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar.zzf = zzdrVar;
                ((nq2) zzfzVar.zzc).P(zzcgVar);
                return g7c.a;
            }
        } else {
            tue.b(obj);
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
                ((nq2) zzfzVar.zzc).P(zzcgVar);
                return g7c.a;
            }
            try {
                obj = zzcxVar.zzb(zzfwVar, 100L, 1000L, 2.0d, zzfyVar, zzfzVar);
                ly2 ly2Var = ly2.a;
                if (obj == ly2Var) {
                    return ly2Var;
                }
            } catch (zzcg e4) {
                e = e4;
                zzcgVar = e;
                zzgb zzgbVar32 = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar32.zzf = zzdrVar;
                ((nq2) zzfzVar.zzc).P(zzcgVar);
                return g7c.a;
            }
        }
        ((Boolean) obj).getClass();
        return g7c.a;
    }
}
