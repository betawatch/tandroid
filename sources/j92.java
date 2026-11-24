// default package

import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j92 extends gb {
    public final /* synthetic */ su x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j92(su suVar, su suVar2) {
        super(suVar2);
        this.x = suVar;
    }

    @Override // gb
    public final boolean b() {
        boolean z;
        boolean z2;
        n92 n92Var = (n92) this.x.c;
        tk5 parentLayout = n92Var.getParentLayout();
        z = ((d) n92Var).inPreviewMode;
        if (z || gm.O1()) {
            return false;
        }
        z2 = ((d) n92Var).inBubbleMode;
        return (z2 || gm.E || parentLayout == null) ? false : true;
    }

    @Override // gb
    public final void e(float f, float f2, boolean z) {
        n92 n92Var = (n92) this.x.c;
        if (n92Var.getParentLayout() != null) {
            boolean z2 = ((ActionBarLayout) n92Var.getParentLayout()).n;
        }
    }

    @Override // gb
    public final void g(int i, boolean z) {
        n92 n92Var = (n92) this.x.c;
        n92Var.w.setVisibility(0);
        n92Var.w.animate().alpha(!z ? 1.0f : 0.0f).withEndAction(new y8c((byte) 10, this, z)).start();
    }
}
