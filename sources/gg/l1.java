package gg;

import ai.u9;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class l1 implements o2 {
    public final /* synthetic */ o1 a;

    public l1(o1 o1Var) {
        this.a = o1Var;
    }

    @Override // org.telegram.ui.Cells.o2
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Cells.o2
    public final void e(s2 s2Var) {
        o1 o1Var = this.a;
        wn wnVar = o1Var.f;
        if (MessagesController.getInstance(o1Var.r).getStoriesController().I(s2Var.getDialogId())) {
            wnVar.getOrCreateStoryViewer().getClass();
            wnVar.getOrCreateStoryViewer().D(o1Var.c, s2Var.getDialogId(), u9.a((wl0) s2Var.getParent()));
        }
    }

    @Override // org.telegram.ui.Cells.o2
    public final void a(s2 s2Var) {
    }

    @Override // org.telegram.ui.Cells.o2
    public final void c() {
    }

    @Override // org.telegram.ui.Cells.o2
    public final void d(s2 s2Var) {
    }

    @Override // org.telegram.ui.Cells.o2
    public final void f(s2 s2Var) {
    }
}
