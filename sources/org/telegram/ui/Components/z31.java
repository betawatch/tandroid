package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class z31 extends s4.s0 {
    public final /* synthetic */ l41 a;

    public z31(l41 l41Var) {
        this.a = l41Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        l41 l41Var = this.a;
        y31 y31Var = l41Var.H;
        if (i10 == 0) {
            l41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && l41Var.z(false) > 0.0f && l41Var.z(false) < AndroidUtilities.dp(96.0f) && y31Var.canScrollVertically(1) && l41.u(l41Var)) {
            l41Var.G = true;
            y31Var.w0(0, (int) l41Var.z(false), null);
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        l41 l41Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) l41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = l41Var.H.canScrollVertically(1);
        View view = l41Var.L;
        Boolean bool = l41Var.Q;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            l41Var.Q = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.rk.s(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), qr.h, 320L);
        }
    }
}
