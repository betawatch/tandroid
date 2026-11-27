package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
        return ((zzaq) create((zzhk) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        ixe.b(obj);
        return g9c.a;
    }
}
