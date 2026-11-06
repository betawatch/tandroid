package ch;

import bi.k1;
import bi.x5;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.i1;
import org.telegram.ui.ActionBar.q4;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class k extends i1 {
    public final /* synthetic */ x5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(x5 x5Var, x5 x5Var2) {
        super(x5Var2);
        this.x = x5Var;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final boolean b() {
        boolean z9;
        boolean z10;
        o oVar = (o) this.x.c;
        q4 parentLayout = oVar.getParentLayout();
        z9 = ((f2) oVar).inPreviewMode;
        if (z9 || org.telegram.messenger.g0.Q1()) {
            return false;
        }
        z10 = ((f2) oVar).inBubbleMode;
        return (z10 || org.telegram.messenger.g0.E || parentLayout == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void e(float f10, float f11, boolean z9) {
        o oVar = (o) this.x.c;
        if (oVar.getParentLayout() != null) {
            boolean z10 = ((ActionBarLayout) oVar.getParentLayout()).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void g(int i7, boolean z9) {
        o oVar = (o) this.x.c;
        oVar.w.setVisibility(0);
        oVar.w.animate().alpha(!z9 ? 1.0f : 0.0f).withEndAction(new k1(3, this, z9)).start();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void f() {
    }
}
