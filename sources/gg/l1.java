package gg;

import ai.u9;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class l1 implements n2 {
    public final /* synthetic */ o1 a;

    public l1(o1 o1Var) {
        this.a = o1Var;
    }

    @Override // org.telegram.ui.Cells.n2
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Cells.n2
    public final void e(r2 r2Var) {
        o1 o1Var = this.a;
        bo boVar = o1Var.f;
        if (MessagesController.getInstance(o1Var.r).getStoriesController().I(r2Var.getDialogId())) {
            boVar.getOrCreateStoryViewer().getClass();
            boVar.getOrCreateStoryViewer().D(o1Var.c, r2Var.getDialogId(), u9.a((ml0) r2Var.getParent()));
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
