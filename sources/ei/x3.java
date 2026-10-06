package ei;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class x3 extends w61 {
    public final /* synthetic */ f4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(f4 f4Var, zl0 zl0Var, Activity activity, int i10, int i11, bi.v vVar, d6 d6Var) {
        super(zl0Var, activity, i10, i11, true, vVar, d6Var);
        this.N = f4Var;
    }

    @Override // org.telegram.ui.Components.w61, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        f4 f4Var = this.N;
        Activity parentActivity = f4Var.getParentActivity();
        int i11 = i6.L6;
        d6Var = ((org.telegram.ui.ActionBar.n2) f4Var).resourceProvider;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, d6Var);
        m4Var.setHeight(25);
        return new il0(m4Var);
    }
}
