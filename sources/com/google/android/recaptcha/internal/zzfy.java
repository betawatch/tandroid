package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzfy extends ccb implements qp4 {
    int zza;
    final /* synthetic */ zzhk zzb;
    final /* synthetic */ zzgb zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ bp2 zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfy(zzhk zzhkVar, zzgb zzgbVar, long j, bp2 bp2Var, fw2 fw2Var) {
        super(1, fw2Var);
        this.zzb = zzhkVar;
        this.zzc = zzgbVar;
        this.zzd = j;
        this.zze = bp2Var;
    }

    @Override // of0
    public final fw2 create(fw2 fw2Var) {
        return new zzfy(this.zzb, this.zzc, this.zzd, this.zze, fw2Var);
    }

    @Override // qp4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzfy) create((fw2) obj)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        qse.b(obj);
        if (i != 0) {
            return obj;
        }
        zzhk zzhkVar = this.zzb;
        zzfx zzfxVar = new zzfx(this.zzc, this.zzd, this.zze, null);
        this.zza = 1;
        Object zze = zzhj.zze(zzhkVar, 41, zzfxVar, this);
        bx2 bx2Var = bx2.a;
        return zze == bx2Var ? bx2Var : zze;
    }
}
