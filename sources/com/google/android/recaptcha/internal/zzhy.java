package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzhy extends eeb implements fs4 {
    final /* synthetic */ zzib zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhy(zzib zzibVar, String str, String str2, px2 px2Var) {
        super(2, px2Var);
        this.zza = zzibVar;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzhy(this.zza, this.zzb, this.zzc, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhy) create((zzgr) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        tue.b(obj);
        try {
            zzib.zza(this.zza).zzc(this.zzb, this.zzc);
            return g7c.a;
        } catch (Exception e) {
            throw new zzcg(zzce.zzk, zzcd.zzT, e.getMessage(), null, 8, null);
        }
    }
}
