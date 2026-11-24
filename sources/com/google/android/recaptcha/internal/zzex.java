package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzex extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzfp zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzye zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzex(zzfp zzfpVar, long j, zzye zzyeVar, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzfpVar;
        this.zzc = j;
        this.zzd = zzyeVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzex zzexVar = new zzex(this.zzb, this.zzc, this.zzd, px2Var);
        zzexVar.zze = obj;
        return zzexVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzex) create((zzgr) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        tue.b(obj);
        if (i != 0) {
            return obj;
        }
        zzgr zzgrVar = (zzgr) this.zze;
        zzfp zzfpVar = this.zzb;
        cy2 c = zzfp.zzf(zzfpVar).zza().c();
        zzew zzewVar = new zzew(this.zzc, zzfpVar, zzgrVar, this.zzd, null);
        this.zza = 1;
        Object c2 = srd.c(c, zzewVar, this);
        ly2 ly2Var = ly2.a;
        return c2 == ly2Var ? ly2Var : c2;
    }
}
