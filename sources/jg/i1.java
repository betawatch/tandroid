package jg;

import fi.y6;
import org.telegram.messenger.mp;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        if (mp.u1(l1Var.r).R1().K(u2Var.getDialogId())) {
            bnVar.getOrCreateStoryViewer().getClass();
            bnVar.getOrCreateStoryViewer().J(l1Var.c, u2Var.getDialogId(), y6.a((ck0) u2Var.getParent()));
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
