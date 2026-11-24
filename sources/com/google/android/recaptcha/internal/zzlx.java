package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzlx extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzly zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlx(zzly zzlyVar, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzlyVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzlx zzlxVar = new zzlx(this.zzb, px2Var);
        zzlxVar.zzc = obj;
        return zzlxVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzlx) create((zzgr) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        tue.b(obj);
        if (i == 0) {
            zzlw zzlwVar = new zzlw(this.zzb, (zzgr) this.zzc, null);
            this.zza = 1;
            Object b = ibe.b(zzlwVar, this);
            ly2 ly2Var = ly2.a;
            if (b == ly2Var) {
                return ly2Var;
            }
        }
        return g7c.a;
    }
}
