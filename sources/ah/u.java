package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.o1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class u extends o1 {
    public final /* synthetic */ v x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, v vVar2) {
        super(vVar2);
        this.x = vVar;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final boolean b() {
        boolean z10;
        boolean z11;
        a0 a0Var = (a0) this.x.c;
        b5 parentLayout = a0Var.getParentLayout();
        z10 = ((m2) a0Var).inPreviewMode;
        if (z10 || AndroidUtilities.isTablet()) {
            return false;
        }
        z11 = ((m2) a0Var).inBubbleMode;
        return (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void e(float f7, float f10, boolean z10) {
        a0 a0Var = (a0) this.x.c;
        if (a0Var.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) a0Var.getParentLayout()).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void g(int i10, boolean z10) {
        a0 a0Var = (a0) this.x.c;
        a0Var.w.setVisibility(0);
        a0Var.w.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new t(0, this, z10)).start();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void f() {
    }
}
