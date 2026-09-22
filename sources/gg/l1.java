package gg;

import ai.u9;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        zn znVar = o1Var.f;
        if (MessagesController.getInstance(o1Var.r).getStoriesController().I(s2Var.getDialogId())) {
            znVar.getOrCreateStoryViewer().getClass();
            znVar.getOrCreateStoryViewer().D(o1Var.c, s2Var.getDialogId(), u9.a((yl0) s2Var.getParent()));
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
