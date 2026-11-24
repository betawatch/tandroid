package com.google.android.recaptcha;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class Recaptcha$getClient$1 extends qx2 {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, px2 px2Var) {
        super(px2Var);
        this.zzb = recaptcha;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= TLObject.FLAG_31;
        Object obj2 = this.zzb.getClient-BWLJW6A(null, null, 0L, this);
        return obj2 == ly2.a ? obj2 : new tc9(obj2);
    }
}
