package com.google.android.recaptcha.internal;

import java.util.Timer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzbj extends eeb implements fs4 {
    final /* synthetic */ zzbo zza;
    private /* synthetic */ Object zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbj(zzbo zzboVar, px2 px2Var) {
        super(2, px2Var);
        this.zza = zzboVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        zzbj zzbjVar = new zzbj(this.zza, px2Var);
        zzbjVar.zzb = obj;
        return zzbjVar;
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbj) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        tue.b(obj);
        zzhk zzhkVar = (zzhk) this.zzb;
        zzbo zzboVar = this.zza;
        z = zzboVar.zzg;
        if (!z) {
            new Timer().schedule(new zzbi(zzboVar, zzhkVar), 28800000L, 28800000L);
            zzboVar.zzg = true;
        }
        return g7c.a;
    }
}
