package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzax extends eeb implements fs4 {
    int zza;
    final /* synthetic */ zzba zzb;
    private /* synthetic */ Object zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzax(zzba zzbaVar, px2 px2Var) {
        super(2, px2Var);
        this.zzb = zzbaVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzax zzaxVar = new zzax(this.zzb, px2Var);
        zzaxVar.zzc = obj;
        return zzaxVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzax) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        tue.b(obj);
        if (i != 0) {
            return obj;
        }
        zzaw zzawVar = new zzaw((zzhk) this.zzc, this.zzb, null);
        this.zza = 1;
        Object b = ibe.b(zzawVar, this);
        ly2 ly2Var = ly2.a;
        return b == ly2Var ? ly2Var : b;
    }
}
