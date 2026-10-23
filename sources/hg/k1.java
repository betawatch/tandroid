package hg;

import ci.q7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.m2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class k1 implements m2 {
    public final /* synthetic */ n1 a;

    public k1(n1 n1Var) {
        this.a = n1Var;
    }

    @Override // org.telegram.ui.Cells.m2
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m2
    public final void e(q2 q2Var) {
        n1 n1Var = this.a;
        sn snVar = n1Var.f;
        if (MessagesController.getInstance(n1Var.r).getStoriesController().I(q2Var.getDialogId())) {
            snVar.getOrCreateStoryViewer().getClass();
            snVar.getOrCreateStoryViewer().D(n1Var.c, q2Var.getDialogId(), q7.a((mm0) q2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.m2
    public final void a(q2 q2Var) {
    }

    @Override // org.telegram.ui.Cells.m2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.m2
    public final void d(q2 q2Var) {
    }

    @Override // org.telegram.ui.Cells.m2
    public final void f(q2 q2Var) {
    }
}
