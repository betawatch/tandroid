package lh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class k9 extends w51 {
    public final /* synthetic */ ja K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(ja jaVar, rl0 rl0Var, Activity activity, int i10, int i11, dg.r1 r1Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(rl0Var, activity, i10, i11, true, r1Var, f6Var);
        this.K = jaVar;
    }

    @Override // org.telegram.ui.Components.w51, f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        ja jaVar = this.K;
        Activity parentActivity = jaVar.getParentActivity();
        int i11 = org.telegram.ui.ActionBar.j6.L6;
        f6Var = ((org.telegram.ui.ActionBar.p2) jaVar).resourceProvider;
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(parentActivity, i11, 21, 0, false, f6Var);
        l4Var.setHeight(25);
        return new dl0(l4Var);
    }
}
