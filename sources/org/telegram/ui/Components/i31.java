package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class i31 extends s4.s0 {
    public final /* synthetic */ u31 a;

    public i31(u31 u31Var) {
        this.a = u31Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        u31 u31Var = this.a;
        h31 h31Var = u31Var.H;
        if (i10 == 0) {
            u31Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && u31Var.A(false) > 0.0f && u31Var.A(false) < AndroidUtilities.dp(96.0f) && h31Var.canScrollVertically(1) && u31.u(u31Var)) {
            u31Var.G = true;
            h31Var.v0(0, (int) u31Var.A(false), null);
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        u31 u31Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) u31Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = u31Var.H.canScrollVertically(1);
        View view = u31Var.L;
        Boolean bool = u31Var.Q;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            u31Var.Q = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.vl.q(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), pr.h, 320L);
        }
    }
}
