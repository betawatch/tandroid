package hh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n9 extends b51 {
    public final /* synthetic */ oa J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(oa oaVar, zk0 zk0Var, Activity activity, int i10, int i11, ch.c cVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(zk0Var, activity, i10, i11, true, cVar, c6Var);
        this.J = oaVar;
    }

    @Override // org.telegram.ui.Components.b51, f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        oa oaVar = this.J;
        Activity parentActivity = oaVar.getParentActivity();
        int i11 = org.telegram.ui.ActionBar.g6.L6;
        c6Var = ((org.telegram.ui.ActionBar.n2) oaVar).resourceProvider;
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(parentActivity, i11, 21, 0, false, c6Var);
        j4Var.setHeight(25);
        return new lk0(j4Var);
    }
}
