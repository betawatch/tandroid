package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class zzaq extends eeb implements fs4 {
    public zzaq(px2 px2Var) {
        super(2, px2Var);
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new zzaq(px2Var);
    }

    @Override // fs4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaq) create((zzhk) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        tue.b(obj);
        return g7c.a;
    }
}
