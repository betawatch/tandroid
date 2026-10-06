package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class i41 extends s4.s0 {
    public final /* synthetic */ u41 a;

    public i41(u41 u41Var) {
        this.a = u41Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        u41 u41Var = this.a;
        h41 h41Var = u41Var.H;
        if (i10 == 0) {
            u41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && u41Var.z(false) > 0.0f && u41Var.z(false) < AndroidUtilities.dp(96.0f) && h41Var.canScrollVertically(1) && u41.u(u41Var)) {
            u41Var.G = true;
            h41Var.w0(0, (int) u41Var.z(false), null);
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        u41 u41Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) u41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = u41Var.H.canScrollVertically(1);
        View view = u41Var.L;
        Boolean bool = u41Var.Q;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            u41Var.Q = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.bi.r(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), tr.h, 320L);
        }
    }
}
