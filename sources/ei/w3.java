package ei;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class w3 extends v51 {
    public final /* synthetic */ e4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(e4 e4Var, ml0 ml0Var, Activity activity, int i10, int i11, bi.v vVar, d6 d6Var) {
        super(ml0Var, activity, i10, i11, true, vVar, d6Var);
        this.N = e4Var;
    }

    @Override // org.telegram.ui.Components.v51, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        e4 e4Var = this.N;
        Activity parentActivity = e4Var.getParentActivity();
        int i11 = h6.L6;
        d6Var = ((org.telegram.ui.ActionBar.n2) e4Var).resourceProvider;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, d6Var);
        m4Var.setHeight(25);
        return new wk0(m4Var);
    }
}
