package hg;

import bi.g9;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class k1 implements o2 {
    public final /* synthetic */ n1 a;

    public k1(n1 n1Var) {
        this.a = n1Var;
    }

    @Override // org.telegram.ui.Cells.o2
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Cells.o2
    public final void f(s2 s2Var) {
        n1 n1Var = this.a;
        fo foVar = n1Var.f;
        if (MessagesController.getInstance(n1Var.r).getStoriesController().I(s2Var.getDialogId())) {
            foVar.getOrCreateStoryViewer().getClass();
            foVar.getOrCreateStoryViewer().D(n1Var.c, s2Var.getDialogId(), g9.a((mm0) s2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.o2
    public final void a(s2 s2Var) {
    }

    @Override // org.telegram.ui.Cells.o2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.o2
    public final void e(s2 s2Var) {
    }

    @Override // org.telegram.ui.Cells.o2
    public final void g(s2 s2Var) {
    }
}
