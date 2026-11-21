package ch;

import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i1;
import org.telegram.ui.ActionBar.r4;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class l extends i1 {
    public final /* synthetic */ ai.l0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ai.l0 l0Var, ai.l0 l0Var2) {
        super(l0Var2);
        this.x = l0Var;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final boolean b() {
        boolean z10;
        boolean z11;
        p pVar = (p) this.x.c;
        r4 parentLayout = pVar.getParentLayout();
        z10 = ((g2) pVar).inPreviewMode;
        if (z10 || org.telegram.messenger.g0.Q1()) {
            return false;
        }
        z11 = ((g2) pVar).inBubbleMode;
        return (z11 || org.telegram.messenger.g0.E || parentLayout == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void e(float f10, float f11, boolean z10) {
        p pVar = (p) this.x.c;
        if (pVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) pVar.getParentLayout()).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void g(int i7, boolean z10) {
        p pVar = (p) this.x.c;
        pVar.w.setVisibility(0);
        pVar.w.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new k(0, this, z10)).start();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void f() {
    }
}
