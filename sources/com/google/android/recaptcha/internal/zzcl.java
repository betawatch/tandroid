package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
final class zzcl extends ccb implements eq4 {
    public zzcl(fw2 fw2Var) {
        super(2, fw2Var);
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzcl(fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcl) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        qse.b(obj);
        Thread.currentThread().setPriority(8);
        return g5c.a;
    }
}
