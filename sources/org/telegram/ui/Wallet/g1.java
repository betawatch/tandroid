package org.telegram.ui.Wallet;

import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g1 implements q20 {
    public final /* synthetic */ a2 a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ vh.d c;
    public final /* synthetic */ vh.d d;
    public final /* synthetic */ e2 e;
    public final /* synthetic */ y2 f;
    public final /* synthetic */ boolean[] g;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 h;

    public /* synthetic */ g1(a2 a2Var, boolean[] zArr, vh.d dVar, vh.d dVar2, e2 e2Var, y2 y2Var, boolean[] zArr2, org.telegram.ui.ActionBar.p6 p6Var) {
        this.a = a2Var;
        this.b = zArr;
        this.c = dVar;
        this.d = dVar2;
        this.e = e2Var;
        this.f = y2Var;
        this.g = zArr2;
        this.h = p6Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        a2 a2Var = this.a;
        if (a2Var.m || a2Var.n) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        boolean[] zArr = this.b;
        if (booleanValue || zArr[0]) {
            vh.d dVar = this.c;
            dVar.setEnabled(false);
            vh.d dVar2 = this.d;
            dVar2.setEnabled(false);
            (bool.booleanValue() ? dVar2 : dVar).setLoading(true);
            this.e.f(a2Var, bool.booleanValue(), new m1(dVar, dVar2, this.f, this.g, this.h, a2Var, zArr));
        }
    }
}
