package ig;

import ag.y1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.p1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o extends p1 {
    public final /* synthetic */ y1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(y1 y1Var, y1 y1Var2) {
        super(y1Var2);
        this.x = y1Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        boolean z10;
        boolean z11;
        s sVar = (s) this.x.c;
        b5 parentLayout = sVar.getParentLayout();
        z10 = ((n2) sVar).inPreviewMode;
        if (z10 || AndroidUtilities.isTablet()) {
            return false;
        }
        z11 = ((n2) sVar).inBubbleMode;
        return (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void e(float f10, float f11, boolean z10) {
        s sVar = (s) this.x.c;
        if (sVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) sVar.getParentLayout()).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        s sVar = (s) this.x.c;
        sVar.w.setVisibility(0);
        sVar.w.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new fh.f(4, this, z10)).start();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
    }
}
