package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class h41 extends s4.s0 {
    public final /* synthetic */ t41 a;

    public h41(t41 t41Var) {
        this.a = t41Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        t41 t41Var = this.a;
        g41 g41Var = t41Var.H;
        if (i10 == 0) {
            t41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && t41Var.z(false) > 0.0f && t41Var.z(false) < AndroidUtilities.dp(96.0f) && g41Var.canScrollVertically(1) && t41.u(t41Var)) {
            t41Var.G = true;
            g41Var.w0(0, (int) t41Var.z(false), null);
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        t41 t41Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) t41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = t41Var.H.canScrollVertically(1);
        View view = t41Var.L;
        Boolean bool = t41Var.Q;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            t41Var.Q = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.ok.s(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), tr.h, 320L);
        }
    }
}
