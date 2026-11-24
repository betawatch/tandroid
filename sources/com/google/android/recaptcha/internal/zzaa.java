package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzaa extends eeb implements fs4 {
    final /* synthetic */ zzad zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaa(zzad zzadVar, px2 px2Var) {
        super(2, px2Var);
        this.zza = zzadVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzaa(this.zza, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaa) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        tue.b(obj);
        zzad zzadVar = this.zza;
        String zza = zzad.zzb(zzadVar).zza();
        zzyu zzf = zzyx.zzf();
        zzyv zzf2 = zzyw.zzf();
        zzf2.zzw(zza);
        zzf.zze(lm2.a(zzf2.zzk()));
        return zzas.zzb(zzadVar, (zzyx) zzf.zzk());
    }
}
