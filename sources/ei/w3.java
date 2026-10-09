package ei;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class w3 extends c71 {
    public final /* synthetic */ e4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(e4 e4Var, qm0 qm0Var, Activity activity, int i10, int i11, bi.v vVar, e6 e6Var) {
        super(qm0Var, activity, i10, i11, true, vVar, e6Var);
        this.N = e4Var;
    }

    @Override // org.telegram.ui.Components.c71, s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        e6 e6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        e4 e4Var = this.N;
        Activity parentActivity = e4Var.getParentActivity();
        int i11 = i6.L6;
        e6Var = ((org.telegram.ui.ActionBar.n2) e4Var).resourceProvider;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, e6Var);
        m4Var.setHeight(25);
        return new am0(m4Var);
    }
}
