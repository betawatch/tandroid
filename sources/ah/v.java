package ah;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.p1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class v extends p1 {
    public final /* synthetic */ w x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, w wVar2) {
        super(wVar2);
        this.x = wVar;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        boolean z10;
        boolean z11;
        b0 b0Var = (b0) this.x.c;
        d5 parentLayout = b0Var.getParentLayout();
        z10 = ((n2) b0Var).inPreviewMode;
        if (z10 || AndroidUtilities.isTablet()) {
            return false;
        }
        z11 = ((n2) b0Var).inBubbleMode;
        return (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void e(float f7, float f10, boolean z10) {
        b0 b0Var = (b0) this.x.c;
        if (b0Var.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) b0Var.getParentLayout()).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        b0 b0Var = (b0) this.x.c;
        b0Var.w.setVisibility(0);
        b0Var.w.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new u(0, this, z10)).start();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
    }
}
