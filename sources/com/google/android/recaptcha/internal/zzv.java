package com.google.android.recaptcha.internal;

import android.os.Build;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzv extends eeb implements fs4 {
    final /* synthetic */ zzx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzv(zzx zzxVar, px2 px2Var) {
        super(2, px2Var);
        this.zza = zzxVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzv(this.zza, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzv) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        tue.b(obj);
        zzx zzxVar = this.zza;
        String zza = zzbs.zza(zzx.zzb(zzxVar));
        if (zza.length() == 0) {
            if (Build.VERSION.SDK_INT > 34) {
                throw new zzcg(zzce.zzb, zzcd.zzaE, null, null, 12, null);
            }
            throw new zzcg(zzce.zzb, zzcd.zzaF, null, null, 12, null);
        }
        zzyu zzf = zzyx.zzf();
        zzyv zzf2 = zzyw.zzf();
        zzf2.zzw(zza);
        zzf.zze(lm2.a(zzf2.zzk()));
        return zzas.zzb(zzxVar, (zzyx) zzf.zzk());
    }
}
