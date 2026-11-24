package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzfy extends eeb implements rr4 {
    int zza;
    final /* synthetic */ zzhk zzb;
    final /* synthetic */ zzgb zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ mq2 zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfy(zzhk zzhkVar, zzgb zzgbVar, long j, mq2 mq2Var, px2 px2Var) {
        super(1, px2Var);
        this.zzb = zzhkVar;
        this.zzc = zzgbVar;
        this.zzd = j;
        this.zze = mq2Var;
    }

    @Override // og0
    public final px2 create(px2 px2Var) {
        return new zzfy(this.zzb, this.zzc, this.zzd, this.zze, px2Var);
    }

    @Override // rr4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzfy) create((px2) obj)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        tue.b(obj);
        if (i != 0) {
            return obj;
        }
        zzhk zzhkVar = this.zzb;
        zzfx zzfxVar = new zzfx(this.zzc, this.zzd, this.zze, null);
        this.zza = 1;
        Object zze = zzhj.zze(zzhkVar, 41, zzfxVar, this);
        ly2 ly2Var = ly2.a;
        return zze == ly2Var ? ly2Var : zze;
    }
}
