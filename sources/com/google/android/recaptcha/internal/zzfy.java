package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
final class zzfy extends yfb implements ur4 {
    int zza;
    final /* synthetic */ zzhk zzb;
    final /* synthetic */ zzgb zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ up2 zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfy(zzhk zzhkVar, zzgb zzgbVar, long j, up2 up2Var, zw2 zw2Var) {
        super(1, zw2Var);
        this.zzb = zzhkVar;
        this.zzc = zzgbVar;
        this.zzd = j;
        this.zze = up2Var;
    }

    @Override // qf0
    public final zw2 create(zw2 zw2Var) {
        return new zzfy(this.zzb, this.zzc, this.zzd, this.zze, zw2Var);
    }

    @Override // ur4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzfy) create((zw2) obj)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        ixe.b(obj);
        if (i != 0) {
            return obj;
        }
        zzhk zzhkVar = this.zzb;
        zzfx zzfxVar = new zzfx(this.zzc, this.zzd, this.zze, null);
        this.zza = 1;
        Object zze = zzhj.zze(zzhkVar, 41, zzfxVar, this);
        vx2 vx2Var = vx2.a;
        return zze == vx2Var ? vx2Var : zze;
    }
}
