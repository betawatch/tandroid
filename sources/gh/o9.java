package gh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o9 extends z41 {
    public final /* synthetic */ oa J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(oa oaVar, wk0 wk0Var, Activity activity, int i9, int i10, bh.c cVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(wk0Var, activity, i9, i10, true, cVar, b6Var);
        this.J = oaVar;
    }

    @Override // org.telegram.ui.Components.z41, f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        if (i9 != 42) {
            return super.x(viewGroup, i9);
        }
        oa oaVar = this.J;
        Activity parentActivity = oaVar.getParentActivity();
        int i10 = org.telegram.ui.ActionBar.f6.L6;
        b6Var = ((org.telegram.ui.ActionBar.o2) oaVar).resourceProvider;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i10, 21, 0, false, b6Var);
        m4Var.setHeight(25);
        return new ik0(m4Var);
    }
}
