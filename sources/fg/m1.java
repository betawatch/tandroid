package fg;

import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.eo;
import zh.s5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class m1 implements n2 {
    public final /* synthetic */ p1 a;

    public m1(p1 p1Var) {
        this.a = p1Var;
    }

    @Override // org.telegram.ui.Cells.n2
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Cells.n2
    public final void e(r2 r2Var) {
        p1 p1Var = this.a;
        eo eoVar = p1Var.f;
        if (MessagesController.getInstance(p1Var.r).getStoriesController().I(r2Var.getDialogId())) {
            eoVar.getOrCreateStoryViewer().getClass();
            eoVar.getOrCreateStoryViewer().D(p1Var.c, r2Var.getDialogId(), s5.a((vl0) r2Var.getParent()));
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
