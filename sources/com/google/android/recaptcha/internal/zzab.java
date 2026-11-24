package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzab extends eeb implements fs4 {
    final /* synthetic */ zzxp zza;
    final /* synthetic */ zzad zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzab(zzxp zzxpVar, zzad zzadVar, px2 px2Var) {
        super(2, px2Var);
        this.zza = zzxpVar;
        this.zzb = zzadVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzab(this.zza, this.zzb, px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzab) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        tue.b(obj);
        zzxp zzxpVar = this.zza;
        int length = zzxpVar.zzl().length();
        zzad zzadVar = this.zzb;
        if (length == 0) {
            zzadVar.zzj(false);
            throw new zzcg(zzce.zzb, zzcd.zzab, null, null, 12, null);
        }
        zzci zzb = zzad.zzb(zzadVar);
        Map singletonMap = Collections.singletonMap("_GRECAPTCHA_KC", zzxpVar.zzl());
        singletonMap.getClass();
        zzb.zzb(singletonMap);
        return g7c.a;
    }
}
