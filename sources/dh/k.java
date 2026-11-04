package dh;

import ci.e1;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.h1;
import org.telegram.ui.ActionBar.q4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k extends h1 {
    public final /* synthetic */ ai.c0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ai.c0 c0Var, ai.c0 c0Var2) {
        super(c0Var2);
        this.x = c0Var;
    }

    @Override // org.telegram.ui.ActionBar.h1
    public final boolean b() {
        boolean z10;
        boolean z11;
        o oVar = (o) this.x.c;
        q4 parentLayout = oVar.getParentLayout();
        z10 = ((d2) oVar).inPreviewMode;
        if (z10 || org.telegram.messenger.g0.Q1()) {
            return false;
        }
        z11 = ((d2) oVar).inBubbleMode;
        return (z11 || org.telegram.messenger.g0.E || parentLayout == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.h1
    public final void e(float f10, float f11, boolean z10) {
        o oVar = (o) this.x.c;
        if (oVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) oVar.getParentLayout()).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.h1
    public final void g(int i3, boolean z10) {
        o oVar = (o) this.x.c;
        oVar.w.setVisibility(0);
        oVar.w.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new e1(3, this, z10)).start();
    }

    @Override // org.telegram.ui.ActionBar.h1
    public final void f() {
    }
}
