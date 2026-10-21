package hg;

import ci.r7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class k1 implements n2 {
    public final /* synthetic */ n1 a;

    public k1(n1 n1Var) {
        this.a = n1Var;
    }

    @Override // org.telegram.ui.Cells.n2
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Cells.n2
    public final void f(r2 r2Var) {
        n1 n1Var = this.a;
        qn qnVar = n1Var.f;
        if (MessagesController.getInstance(n1Var.r).getStoriesController().I(r2Var.getDialogId())) {
            qnVar.getOrCreateStoryViewer().getClass();
            qnVar.getOrCreateStoryViewer().D(n1Var.c, r2Var.getDialogId(), r7.a((jm0) r2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.n2
    public final void a(r2 r2Var) {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void e(r2 r2Var) {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void g(r2 r2Var) {
    }
}
