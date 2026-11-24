package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzeg extends eeb implements fs4 {
    final /* synthetic */ zzeq zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeg(zzeq zzeqVar, String str, px2 px2Var) {
        super(2, px2Var);
        this.zza = zzeqVar;
        this.zzb = str;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzeg(this.zza, this.zzb, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeg) create((zzgr) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        tue.b(obj);
        zzeq zzeqVar = this.zza;
        if (rr5.a(zzeqVar.zzc(), this.zzb)) {
            return zzeqVar;
        }
        throw new zzcg(zzce.zzd, zzcd.zzam, null, null, 12, null);
    }
}
