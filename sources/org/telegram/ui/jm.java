package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class jm extends vf.b {
    public final /* synthetic */ org.telegram.ui.Cells.q1 d;
    public final /* synthetic */ nm e;

    public jm(nm nmVar, org.telegram.ui.Cells.q1 q1Var) {
        this.e = nmVar;
        this.d = q1Var;
    }

    @Override // vf.b
    public final void c(boolean z9) {
        if (z9) {
            return;
        }
        org.telegram.messenger.g0.i3(new gj(this.e.a, 9), 250L);
    }

    @Override // vf.b
    public final void d() {
        nm nmVar = this.e;
        cn cnVar = nmVar.a;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        cnVar.Yb = q1Var.getMessageObject().e1();
        cn cnVar2 = nmVar.a;
        cnVar2.Zb = 2;
        cnVar2.ac = null;
        q1Var.invalidate();
    }
}
