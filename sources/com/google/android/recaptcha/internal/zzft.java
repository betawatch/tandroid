package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzft extends eeb implements rr4 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzgb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzft(long j, zzgb zzgbVar, px2 px2Var) {
        super(1, px2Var);
        this.zzb = j;
        this.zzc = zzgbVar;
    }

    @Override // og0
    public final px2 create(px2 px2Var) {
        return new zzft(this.zzb, this.zzc, px2Var);
    }

    @Override // rr4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzft) create((px2) obj)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        tue.b(obj);
        if (i == 0) {
            long j = this.zzb;
            zzfs zzfsVar = new zzfs(this.zzc, null);
            this.zza = 1;
            Object a = oxe.a(j, zzfsVar, this);
            ly2 ly2Var = ly2.a;
            if (a == ly2Var) {
                return ly2Var;
            }
        }
        return g7c.a;
    }
}
