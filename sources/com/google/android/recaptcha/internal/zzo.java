package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzo extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzxn zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzo(zzq zzqVar, long j, zzxn zzxnVar, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzqVar;
        this.zzc = j;
        this.zzd = zzxnVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzo zzoVar = new zzo(this.zzb, this.zzc, this.zzd, px2Var);
        zzoVar.zze = obj;
        return zzoVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzo) create((zzgr) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        tue.b(obj);
        if (i == 0) {
            zzn zznVar = new zzn(this.zzb, (zzgr) this.zze, this.zzc, this.zzd, null);
            this.zza = 1;
            Object b = ibe.b(zznVar, this);
            ly2 ly2Var = ly2.a;
            if (b == ly2Var) {
                return ly2Var;
            }
        }
        return g7c.a;
    }
}
