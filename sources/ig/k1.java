package ig;

import di.q7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class k1 implements l2 {
    public final /* synthetic */ n1 a;

    public k1(n1 n1Var) {
        this.a = n1Var;
    }

    @Override // org.telegram.ui.Cells.l2
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l2
    public final void e(p2 p2Var) {
        n1 n1Var = this.a;
        un unVar = n1Var.f;
        if (MessagesController.getInstance(n1Var.r).getStoriesController().I(p2Var.getDialogId())) {
            unVar.getOrCreateStoryViewer().getClass();
            unVar.getOrCreateStoryViewer().D(n1Var.c, p2Var.getDialogId(), q7.a((mm0) p2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.l2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.l2
    public final void a(p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.l2
    public final void d(p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.l2
    public final void f(p2 p2Var) {
    }
}
