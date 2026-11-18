package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class im extends vf.b {
    public final /* synthetic */ org.telegram.ui.Cells.r1 d;
    public final /* synthetic */ mm e;

    public im(mm mmVar, org.telegram.ui.Cells.r1 r1Var) {
        this.e = mmVar;
        this.d = r1Var;
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
        org.telegram.ui.Cells.r1 r1Var = this.d;
        bnVar.ac = r1Var.getMessageObject().e1();
        bn bnVar2 = mmVar.a;
        bnVar2.bc = 2;
        bnVar2.cc = null;
        r1Var.invalidate();
    }
}
