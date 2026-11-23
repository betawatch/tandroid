package org.telegram.ui.Wallet;

import org.telegram.messenger.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements w10 {
    public final /* synthetic */ i2 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ hi.e c;
    public final /* synthetic */ hi.e d;
    public final /* synthetic */ m2 e;
    public final /* synthetic */ e3 f;
    public final /* synthetic */ boolean[] g;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 h;

    public /* synthetic */ p1(i2 i2Var, boolean[] zArr, hi.e eVar, hi.e eVar2, m2 m2Var, e3 e3Var, boolean[] zArr2, org.telegram.ui.ActionBar.i6 i6Var) {
        this.a = i2Var;
        this.b = zArr;
        this.c = eVar;
        this.d = eVar2;
        this.e = m2Var;
        this.f = e3Var;
        this.g = zArr2;
        this.h = i6Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        i2 i2Var = this.a;
        if (i2Var.m || i2Var.n) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        boolean[] zArr = this.b;
        if (booleanValue || zArr[0]) {
            hi.e eVar = this.c;
            eVar.setEnabled(false);
            hi.e eVar2 = this.d;
            eVar2.setEnabled(false);
            (bool.booleanValue() ? eVar2 : eVar).setLoading(true);
            this.e.f(i2Var, bool.booleanValue(), new v1(eVar, eVar2, this.f, this.g, this.h, i2Var, zArr));
        }
    }
}
