package ch;

import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.i1;
import org.telegram.ui.ActionBar.o4;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class k extends i1 {
    public final /* synthetic */ ai.j0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ai.j0 j0Var, ai.j0 j0Var2) {
        super(j0Var2);
        this.x = j0Var;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final boolean b() {
        boolean z10;
        boolean z11;
        o oVar = (o) this.x.c;
        o4 parentLayout = oVar.getParentLayout();
        z10 = ((e2) oVar).inPreviewMode;
        if (z10 || org.telegram.messenger.g0.Q1()) {
            return false;
        }
        z11 = ((e2) oVar).inBubbleMode;
        return (z11 || org.telegram.messenger.g0.E || parentLayout == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void e(float f10, float f11, boolean z10) {
        o oVar = (o) this.x.c;
        if (oVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) oVar.getParentLayout()).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void g(int i7, boolean z10) {
        o oVar = (o) this.x.c;
        oVar.w.setVisibility(0);
        oVar.w.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new ai.q(1, this, z10)).start();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void f() {
    }
}
