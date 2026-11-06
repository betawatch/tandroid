package jg;

import di.h7;
import org.telegram.messenger.qp;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.an;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class j1 implements p2 {
    public final /* synthetic */ m1 a;

    public j1(m1 m1Var) {
        this.a = m1Var;
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Cells.p2
    public final void u(t2 t2Var) {
        m1 m1Var = this.a;
        an anVar = m1Var.f;
        if (qp.s1(m1Var.r).P1().K(t2Var.getDialogId())) {
            anVar.getOrCreateStoryViewer().getClass();
            anVar.getOrCreateStoryViewer().J(m1Var.c, t2Var.getDialogId(), h7.a((pj0) t2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.p2
    public final void l(t2 t2Var) {
    }

    @Override // org.telegram.ui.Cells.p2
    public final void r(t2 t2Var) {
    }

    @Override // org.telegram.ui.Cells.p2
    public final void w(t2 t2Var) {
    }

    @Override // org.telegram.ui.Cells.p2
    public final void q() {
    }
}
