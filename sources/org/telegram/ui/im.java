package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class im extends vf.b {
    public final /* synthetic */ org.telegram.ui.Cells.q1 d;
    public final /* synthetic */ mm e;

    public im(mm mmVar, org.telegram.ui.Cells.q1 q1Var) {
        this.e = mmVar;
        this.d = q1Var;
    }

    @Override // vf.b
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        org.telegram.messenger.g0.h3(new fj(this.e.a, 9), 250L);
    }

    @Override // vf.b
    public final void d() {
        mm mmVar = this.e;
        bn bnVar = mmVar.a;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        bnVar.ac = q1Var.getMessageObject().e1();
        bn bnVar2 = mmVar.a;
        bnVar2.bc = 2;
        bnVar2.cc = null;
        q1Var.invalidate();
    }
}
