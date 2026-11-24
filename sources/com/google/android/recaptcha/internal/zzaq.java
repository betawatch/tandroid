package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class zzaq extends ccb implements eq4 {
    public zzaq(fw2 fw2Var) {
        super(2, fw2Var);
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new zzaq(fw2Var);
    }

    @Override // eq4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaq) create((zzhk) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        qse.b(obj);
        return g5c.a;
    }
}
