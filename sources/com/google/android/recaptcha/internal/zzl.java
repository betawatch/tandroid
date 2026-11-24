package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzl extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzl(zzq zzqVar, String str, long j, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzqVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzl zzlVar = new zzl(this.zzb, this.zzc, this.zzd, px2Var);
        zzlVar.zze = obj;
        return zzlVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzl) create((zzgr) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        tue.b(obj);
        if (i != 0) {
            return obj;
        }
        zzk zzkVar = new zzk(this.zzb, this.zzc, (zzgr) this.zze, this.zzd, null);
        this.zza = 1;
        Object b = ibe.b(zzkVar, this);
        ly2 ly2Var = ly2.a;
        return b == ly2Var ? ly2Var : b;
    }
}
