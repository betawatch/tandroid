package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class j31 extends s4.s0 {
    public final /* synthetic */ v31 a;

    public j31(v31 v31Var) {
        this.a = v31Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        v31 v31Var = this.a;
        i31 i31Var = v31Var.H;
        if (i10 == 0) {
            v31Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && v31Var.z(false) > 0.0f && v31Var.z(false) < AndroidUtilities.dp(96.0f) && i31Var.canScrollVertically(1) && v31.u(v31Var)) {
            v31Var.G = true;
            i31Var.v0(0, (int) v31Var.z(false), null);
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        v31 v31Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) v31Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = v31Var.H.canScrollVertically(1);
        View view = v31Var.L;
        Boolean bool = v31Var.Q;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            v31Var.Q = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.vl.r(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), qr.h, 320L);
        }
    }
}
