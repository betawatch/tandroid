package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class q41 extends s4.u0 {
    public final /* synthetic */ f51 a;

    public q41(f51 f51Var) {
        this.a = f51Var;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        f51 f51Var = this.a;
        p41 p41Var = f51Var.M;
        if (i10 == 0) {
            f51Var.L = false;
        }
        if ((i10 == 0 || i10 == 2) && f51Var.K(false) > 0.0f && f51Var.K(false) < AndroidUtilities.dp(96.0f) && p41Var.canScrollVertically(1) && f51.F(f51Var)) {
            f51Var.L = true;
            p41Var.w0(0, (int) f51Var.K(false), null);
        }
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        f51 f51Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.k3) f51Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = f51Var.M.canScrollVertically(1);
        View view = f51Var.Q;
        Boolean bool = f51Var.W;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            f51Var.W = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.vh.q(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), ds.h, 320L);
        }
    }
}
