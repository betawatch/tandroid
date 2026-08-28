package of;

import ih.e7;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g1 implements n2 {
    public final /* synthetic */ j1 a;

    public g1(j1 j1Var) {
        this.a = j1Var;
    }

    @Override // org.telegram.ui.Cells.n2
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Cells.n2
    public final void e(r2 r2Var) {
        j1 j1Var = this.a;
        qn qnVar = j1Var.f;
        if (MessagesController.getInstance(j1Var.r).getStoriesController().I(r2Var.getDialogId())) {
            qnVar.getOrCreateStoryViewer().getClass();
            qnVar.getOrCreateStoryViewer().D(j1Var.c, r2Var.getDialogId(), e7.a((wk0) r2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.n2
    public final void a(r2 r2Var) {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void d(r2 r2Var) {
    }

    @Override // org.telegram.ui.Cells.n2
    public final void f(r2 r2Var) {
    }
}
