package kg;

import bg.d1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.q1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o extends q1 {
    public final /* synthetic */ d1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(d1 d1Var, d1 d1Var2) {
        super(d1Var2);
        this.x = d1Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final boolean b() {
        boolean z10;
        boolean z11;
        s sVar = (s) this.x.c;
        b5 parentLayout = sVar.getParentLayout();
        z10 = ((o2) sVar).inPreviewMode;
        if (z10 || AndroidUtilities.isTablet()) {
            return false;
        }
        z11 = ((o2) sVar).inBubbleMode;
        return (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void e(float f9, float f10, boolean z10) {
        s sVar = (s) this.x.c;
        if (sVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) sVar.getParentLayout()).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void g(int i10, boolean z10) {
        s sVar = (s) this.x.c;
        sVar.w.setVisibility(0);
        sVar.w.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new hh.f(4, this, z10)).start();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void f() {
    }
}
