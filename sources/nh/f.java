package nh;

import android.app.Activity;
import android.view.ViewGroup;
import lh.a8;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class f extends b51 {
    public final /* synthetic */ k J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, zk0 zk0Var, Activity activity, int i10, int i11, a8 a8Var, c6 c6Var) {
        super(zk0Var, activity, i10, i11, true, a8Var, c6Var);
        this.J = kVar;
    }

    @Override // org.telegram.ui.Components.b51, f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        k kVar = this.J;
        Activity parentActivity = kVar.getParentActivity();
        int i11 = g6.L6;
        c6Var = ((org.telegram.ui.ActionBar.n2) kVar).resourceProvider;
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(parentActivity, i11, 21, 0, false, c6Var);
        j4Var.setHeight(25);
        return new lk0(j4Var);
    }
}
