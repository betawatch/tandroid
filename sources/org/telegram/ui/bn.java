package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        org.telegram.messenger.i0.h3(new zj(this.e.a, 8), 250L);
    }

    @Override // gf.e
    public final void d() {
        fn fnVar = this.e;
        un unVar = fnVar.a;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        unVar.Sb = q1Var.getMessageObject().f1();
        un unVar2 = fnVar.a;
        unVar2.Tb = 2;
        unVar2.Ub = null;
        q1Var.invalidate();
    }
}
