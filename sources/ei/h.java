package ei;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class h extends w61 {
    public final /* synthetic */ m N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, zl0 zl0Var, Activity activity, int i10, int i11, bi.v vVar, d6 d6Var) {
        super(zl0Var, activity, i10, i11, true, vVar, d6Var);
        this.N = mVar;
    }

    @Override // org.telegram.ui.Components.w61, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        m mVar = this.N;
        Activity parentActivity = mVar.getParentActivity();
        int i11 = i6.L6;
        d6Var = ((org.telegram.ui.ActionBar.n2) mVar).resourceProvider;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, d6Var);
        m4Var.setHeight(25);
        return new il0(m4Var);
    }
}
