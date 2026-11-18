package ch;

import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.j1;
import org.telegram.ui.ActionBar.s4;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l extends j1 {
    public final /* synthetic */ ai.k0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ai.k0 k0Var, ai.k0 k0Var2) {
        super(k0Var2);
        this.x = k0Var;
    }

    @Override // org.telegram.ui.ActionBar.j1
    public final boolean b() {
        boolean z10;
        boolean z11;
        p pVar = (p) this.x.c;
        s4 parentLayout = pVar.getParentLayout();
        z10 = ((h2) pVar).inPreviewMode;
        if (z10 || org.telegram.messenger.g0.Q1()) {
            return false;
        }
        z11 = ((h2) pVar).inBubbleMode;
        return (z11 || org.telegram.messenger.g0.E || parentLayout == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.j1
    public final void e(float f10, float f11, boolean z10) {
        p pVar = (p) this.x.c;
        if (pVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) pVar.getParentLayout()).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.j1
    public final void g(int i7, boolean z10) {
        p pVar = (p) this.x.c;
        pVar.w.setVisibility(0);
        pVar.w.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new k(0, this, z10)).start();
    }

    @Override // org.telegram.ui.ActionBar.j1
    public final void f() {
    }
}
