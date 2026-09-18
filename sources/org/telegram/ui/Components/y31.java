package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class y31 extends s4.s0 {
    public final /* synthetic */ k41 a;

    public y31(k41 k41Var) {
        this.a = k41Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        k41 k41Var = this.a;
        x31 x31Var = k41Var.H;
        if (i10 == 0) {
            k41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && k41Var.z(false) > 0.0f && k41Var.z(false) < AndroidUtilities.dp(96.0f) && x31Var.canScrollVertically(1) && k41.u(k41Var)) {
            k41Var.G = true;
            x31Var.w0(0, (int) k41Var.z(false), null);
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        k41 k41Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) k41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = k41Var.H.canScrollVertically(1);
        View view = k41Var.L;
        Boolean bool = k41Var.Q;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            k41Var.Q = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.wh.r(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), qr.h, 320L);
        }
    }
}
