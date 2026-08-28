package hg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.q1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o extends q1 {
    public final /* synthetic */ fh.v x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(fh.v vVar, fh.v vVar2) {
        super(vVar2);
        this.x = vVar;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final boolean b() {
        boolean z10;
        boolean z11;
        s sVar = (s) this.x.b;
        b5 parentLayout = sVar.getParentLayout();
        z10 = ((o2) sVar).inPreviewMode;
        if (z10 || AndroidUtilities.isTablet()) {
            return false;
        }
        z11 = ((o2) sVar).inBubbleMode;
        return (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void e(float f10, float f11, boolean z10) {
        s sVar = (s) this.x.b;
        if (sVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) sVar.getParentLayout()).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void g(int i9, boolean z10) {
        s sVar = (s) this.x.b;
        sVar.w.setVisibility(0);
        sVar.w.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new eh.f(4, this, z10)).start();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void f() {
    }
}
