package hg;

import ci.q7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.im0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        sn snVar = n1Var.f;
        if (MessagesController.getInstance(n1Var.r).getStoriesController().I(r2Var.getDialogId())) {
            snVar.getOrCreateStoryViewer().getClass();
            snVar.getOrCreateStoryViewer().D(n1Var.c, r2Var.getDialogId(), q7.a((im0) r2Var.getParent()));
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
