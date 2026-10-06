package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class gn extends nf.e {
    public final /* synthetic */ org.telegram.ui.Cells.u1 d;
    public final /* synthetic */ kn e;

    public gn(kn knVar, org.telegram.ui.Cells.u1 u1Var) {
        this.e = knVar;
        this.d = u1Var;
    }

    @Override // nf.e
    public final void c(boolean z10) {
        if (z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new dn(this.e.a, 5), 250L);
    }

    @Override // nf.e
    public final void d() {
        kn knVar = this.e;
        yn ynVar = knVar.a;
        org.telegram.ui.Cells.u1 u1Var = this.d;
        ynVar.tb = u1Var.getMessageObject().getId();
        yn ynVar2 = knVar.a;
        ynVar2.ub = 2;
        ynVar2.vb = null;
        u1Var.invalidate();
    }
}
