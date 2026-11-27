package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
final class zzaq extends yfb implements is4 {
    public zzaq(zw2 zw2Var) {
        super(2, zw2Var);
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new zzaq(zw2Var);
    }

    @Override // is4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaq) create((zzhk) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        ixe.b(obj);
        return f9c.a;
    }
}
