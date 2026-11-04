package kg;

import ei.i7;
import org.telegram.messenger.hp;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f1 implements p2 {
    public final /* synthetic */ i1 a;

    public f1(i1 i1Var) {
        this.a = i1Var;
    }

    @Override // org.telegram.ui.Cells.p2
    public final boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Cells.p2
    public final void u(t2 t2Var) {
        i1 i1Var = this.a;
        wm wmVar = i1Var.f;
        if (hp.s1(i1Var.r).P1().K(t2Var.getDialogId())) {
            wmVar.getOrCreateStoryViewer().getClass();
            wmVar.getOrCreateStoryViewer().R(i1Var.c, t2Var.getDialogId(), i7.a((tj0) t2Var.getParent()));
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
