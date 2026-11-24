package com.google.android.recaptcha.internal;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzic extends qx2 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzif zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzic(zzif zzifVar, px2 px2Var) {
        super(px2Var);
        this.zzb = zzifVar;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        return zzif.zzc(this.zzb, null, null, this);
    }
}
