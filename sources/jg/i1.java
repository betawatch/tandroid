package jg;

import fi.y6;
import org.telegram.messenger.np;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class i1 implements q2 {
    public final /* synthetic */ l1 a;

    public i1(l1 l1Var) {
        this.a = l1Var;
    }

    @Override // org.telegram.ui.Cells.q2
    public final boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Cells.q2
    public final void u(u2 u2Var) {
        l1 l1Var = this.a;
        bn bnVar = l1Var.f;
        if (np.u1(l1Var.r).R1().K(u2Var.getDialogId())) {
            bnVar.getOrCreateStoryViewer().getClass();
            bnVar.getOrCreateStoryViewer().J(l1Var.c, u2Var.getDialogId(), y6.a((ek0) u2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.q2
    public final void l(u2 u2Var) {
    }

    @Override // org.telegram.ui.Cells.q2
    public final void r(u2 u2Var) {
    }

    @Override // org.telegram.ui.Cells.q2
    public final void w(u2 u2Var) {
    }

    @Override // org.telegram.ui.Cells.q2
    public final void q() {
    }
}
