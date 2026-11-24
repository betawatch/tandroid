package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzai extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzxn zzb;
    final /* synthetic */ zzaj zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzai(zzxn zzxnVar, zzaj zzajVar, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzxnVar;
        this.zzc = zzajVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzai zzaiVar = new zzai(this.zzb, this.zzc, px2Var);
        zzaiVar.zzd = obj;
        return zzaiVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzai) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        tue.b(obj);
        if (i != 0) {
            return obj;
        }
        zzah zzahVar = new zzah(this.zzb, this.zzc, (zzhk) this.zzd, null);
        this.zza = 1;
        Object b = ibe.b(zzahVar, this);
        ly2 ly2Var = ly2.a;
        return b == ly2Var ? ly2Var : b;
    }
}
