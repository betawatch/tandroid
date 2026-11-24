package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzhq extends eeb implements fs4 {
    final /* synthetic */ zzht zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzzd zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhq(zzht zzhtVar, String str, zzzd zzzdVar, px2 px2Var) {
        super(2, px2Var);
        this.zza = zzhtVar;
        this.zzb = str;
        this.zzc = zzzdVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzhq(this.zza, this.zzb, this.zzc, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzhq) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        tue.b(obj);
        try {
            zzht zzhtVar = this.zza;
            zzig zzb = zzht.zzb(zzhtVar);
            String str = this.zzb;
            if (zzb.zzb(str)) {
                return zzht.zza(zzhtVar).zza(str, this.zzc);
            }
            throw new zzcg(zzce.zzc, zzcd.zzQ, null, null, 12, null);
        } catch (zzcg e) {
            throw e;
        } catch (Exception e2) {
            throw new zzcg(zzce.zzb, zzcd.zzaz, e2.getMessage(), null, 8, null);
        }
    }
}
