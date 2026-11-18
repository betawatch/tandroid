package jg;

import fi.y6;
import org.telegram.messenger.mp;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class i1 implements p2 {
    public final /* synthetic */ l1 a;

    public i1(l1 l1Var) {
        this.a = l1Var;
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Cells.p2
    public final void u(t2 t2Var) {
        l1 l1Var = this.a;
        bn bnVar = l1Var.f;
        if (mp.u1(l1Var.r).R1().K(t2Var.getDialogId())) {
            bnVar.getOrCreateStoryViewer().getClass();
            bnVar.getOrCreateStoryViewer().J(l1Var.c, t2Var.getDialogId(), y6.a((ck0) t2Var.getParent()));
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
