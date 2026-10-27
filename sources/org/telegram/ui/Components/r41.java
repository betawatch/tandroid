package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class r41 extends s4.u0 {
    public final /* synthetic */ g51 a;

    public r41(g51 g51Var) {
        this.a = g51Var;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        g51 g51Var = this.a;
        q41 q41Var = g51Var.M;
        if (i10 == 0) {
            g51Var.L = false;
        }
        if ((i10 == 0 || i10 == 2) && g51Var.K(false) > 0.0f && g51Var.K(false) < AndroidUtilities.dp(96.0f) && q41Var.canScrollVertically(1) && g51.F(g51Var)) {
            g51Var.L = true;
            q41Var.w0(0, (int) g51Var.K(false), null);
        }
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        g51 g51Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.k3) g51Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = g51Var.M.canScrollVertically(1);
        View view = g51Var.Q;
        Boolean bool = g51Var.W;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            g51Var.W = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.wh.q(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), ds.h, 320L);
        }
    }
}
