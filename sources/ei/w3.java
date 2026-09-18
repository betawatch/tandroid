package ei;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class w3 extends l61 {
    public final /* synthetic */ e4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(e4 e4Var, wl0 wl0Var, Activity activity, int i10, int i11, bi.v vVar, e6 e6Var) {
        super(wl0Var, activity, i10, i11, true, vVar, e6Var);
        this.N = e4Var;
    }

    @Override // org.telegram.ui.Components.l61, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        e6 e6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        e4 e4Var = this.N;
        Activity parentActivity = e4Var.getParentActivity();
        int i11 = j6.L6;
        e6Var = ((org.telegram.ui.ActionBar.n2) e4Var).resourceProvider;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, e6Var);
        m4Var.setHeight(25);
        return new gl0(m4Var);
    }
}
