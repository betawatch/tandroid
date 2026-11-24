package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzfz extends ccb implements eq4 {
    int zza;
    final /* synthetic */ zzgb zzb;
    final /* synthetic */ bp2 zzc;
    final /* synthetic */ zzhk zzd;
    final /* synthetic */ long zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfz(zzgb zzgbVar, bp2 bp2Var, zzhk zzhkVar, long j, fw2 fw2Var) {
        super(2, fw2Var);
        this.zzb = zzgbVar;
        this.zzc = bp2Var;
        this.zzd = zzhkVar;
        this.zze = j;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzfz(this.zzb, this.zzc, this.zzd, this.zze, fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfz) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
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
                qse.b(obj);
                zzfzVar = this;
            } catch (zzcg e2) {
                zzcgVar = e2;
                zzfzVar = this;
                zzgb zzgbVar = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar.zzf = zzdrVar;
                ((cp2) zzfzVar.zzc).P(zzcgVar);
                return g5c.a;
            }
        } else {
            qse.b(obj);
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
                ((cp2) zzfzVar.zzc).P(zzcgVar);
                return g5c.a;
            }
            try {
                obj = zzcxVar.zzb(zzfwVar, 100L, 1000L, 2.0d, zzfyVar, zzfzVar);
                bx2 bx2Var = bx2.a;
                if (obj == bx2Var) {
                    return bx2Var;
                }
            } catch (zzcg e4) {
                e = e4;
                zzcgVar = e;
                zzgb zzgbVar32 = zzfzVar.zzb;
                zzdrVar = zzdv.zzd;
                zzgbVar32.zzf = zzdrVar;
                ((cp2) zzfzVar.zzc).P(zzcgVar);
                return g5c.a;
            }
        }
        ((Boolean) obj).getClass();
        return g5c.a;
    }
}
