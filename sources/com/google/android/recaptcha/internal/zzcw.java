package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzcw extends eeb implements fs4 {
    int zza;
    final /* synthetic */ rr4 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(int i, long j, long j2, double d, rr4 rr4Var, px2 px2Var) {
        super(2, px2Var);
        this.zzb = rr4Var;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzcw(20, 100L, 1000L, 2.0d, this.zzb, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcw) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        tue.b(obj);
        if (i != 0) {
            return obj;
        }
        rr4 rr4Var = this.zzb;
        zzcx zzcxVar = zzcx.zza;
        this.zza = 1;
        Object zza = zzcxVar.zza(20, 100L, 1000L, 2.0d, rr4Var, this);
        ly2 ly2Var = ly2.a;
        return zza == ly2Var ? ly2Var : zza;
    }
}
