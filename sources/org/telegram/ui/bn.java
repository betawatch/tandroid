package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bn extends gf.e {
    public final /* synthetic */ org.telegram.ui.Cells.q1 d;
    public final /* synthetic */ fn e;

    public bn(fn fnVar, org.telegram.ui.Cells.q1 q1Var) {
        this.e = fnVar;
        this.d = q1Var;
    }

    @Override // gf.e
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        org.telegram.messenger.i0.h3(new zj(this.e.a, 9), 250L);
    }

    @Override // gf.e
    public final void d() {
        fn fnVar = this.e;
        un unVar = fnVar.a;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        unVar.Rb = q1Var.getMessageObject().f1();
        un unVar2 = fnVar.a;
        unVar2.Sb = 2;
        unVar2.Tb = null;
        q1Var.invalidate();
    }
}
