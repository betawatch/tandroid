package bh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.r2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class o extends q1 {
    public final /* synthetic */ p x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, p pVar2) {
        super(pVar2);
        this.x = pVar;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final boolean b() {
        boolean z10;
        boolean z11;
        u uVar = (u) this.x.c;
        j5 parentLayout = uVar.getParentLayout();
        z10 = ((r2) uVar).inPreviewMode;
        if (z10 || AndroidUtilities.isTablet()) {
            return false;
        }
        z11 = ((r2) uVar).inBubbleMode;
        return (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void e(float f7, float f10, boolean z10) {
        u uVar = (u) this.x.c;
        if (uVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) uVar.getParentLayout()).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void g(int i10, boolean z10) {
        u uVar = (u) this.x.c;
        uVar.v.setVisibility(0);
        uVar.v.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new n(0, this, z10)).start();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void f() {
    }
}
