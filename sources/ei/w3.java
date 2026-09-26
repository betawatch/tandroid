package ei;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class w3 extends j61 {
    public final /* synthetic */ e4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(e4 e4Var, wl0 wl0Var, Activity activity, int i10, int i11, bi.v vVar, d6 d6Var) {
        super(wl0Var, activity, i10, i11, true, vVar, d6Var);
        this.N = e4Var;
    }

    @Override // org.telegram.ui.Components.j61, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        e4 e4Var = this.N;
        Activity parentActivity = e4Var.getParentActivity();
        int i11 = h6.L6;
        d6Var = ((org.telegram.ui.ActionBar.m2) e4Var).resourceProvider;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, d6Var);
        m4Var.setHeight(25);
        return new gl0(m4Var);
    }
}
