package mg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.r1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o extends r1 {
    public final /* synthetic */ ah.e x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ah.e eVar, ah.e eVar2) {
        super(eVar2);
        this.x = eVar;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final boolean b() {
        boolean z4;
        boolean z10;
        s sVar = (s) this.x.c;
        e5 parentLayout = sVar.getParentLayout();
        z4 = ((p2) sVar).inPreviewMode;
        if (z4 || AndroidUtilities.isTablet()) {
            return false;
        }
        z10 = ((p2) sVar).inBubbleMode;
        return (z10 || AndroidUtilities.isInMultiwindow || parentLayout == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void e(float f10, float f11, boolean z4) {
        s sVar = (s) this.x.c;
        if (sVar.getParentLayout() != null) {
            boolean z10 = ((ActionBarLayout) sVar.getParentLayout()).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(int i10, boolean z4) {
        s sVar = (s) this.x.c;
        sVar.w.setVisibility(0);
        sVar.w.animate().alpha(!z4 ? 1.0f : 0.0f).withEndAction(new jh.f(5, this, z4)).start();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void f() {
    }
}
