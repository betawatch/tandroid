package mh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class k9 extends w51 {
    public final /* synthetic */ ja K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(ja jaVar, sl0 sl0Var, Activity activity, int i10, int i11, eg.p1 p1Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(sl0Var, activity, i10, i11, true, p1Var, g6Var);
        this.K = jaVar;
    }

    @Override // org.telegram.ui.Components.w51, f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        ja jaVar = this.K;
        Activity parentActivity = jaVar.getParentActivity();
        int i11 = org.telegram.ui.ActionBar.k6.L6;
        g6Var = ((org.telegram.ui.ActionBar.p2) jaVar).resourceProvider;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, g6Var);
        m4Var.setHeight(25);
        return new el0(m4Var);
    }
}
