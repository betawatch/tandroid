package ig;

import di.q7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        wn wnVar = n1Var.f;
        if (MessagesController.getInstance(n1Var.r).getStoriesController().K(p2Var.getDialogId())) {
            wnVar.getOrCreateStoryViewer().getClass();
            wnVar.getOrCreateStoryViewer().E(n1Var.c, p2Var.getDialogId(), q7.a((nm0) p2Var.getParent()));
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
