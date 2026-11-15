package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class hm extends vf.b {
    public final /* synthetic */ org.telegram.ui.Cells.q1 d;
    public final /* synthetic */ lm e;

    public hm(lm lmVar, org.telegram.ui.Cells.q1 q1Var) {
        this.e = lmVar;
        this.d = q1Var;
    }

    @Override // vf.b
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        org.telegram.messenger.g0.i3(new ej(this.e.a, 9), 250L);
    }

    @Override // vf.b
    public final void d() {
        lm lmVar = this.e;
        an anVar = lmVar.a;
        org.telegram.ui.Cells.q1 q1Var = this.d;
        anVar.Zb = q1Var.getMessageObject().e1();
        an anVar2 = lmVar.a;
        anVar2.ac = 2;
        anVar2.bc = null;
        q1Var.invalidate();
    }
}
