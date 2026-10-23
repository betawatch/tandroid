package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class j41 extends s4.r0 {
    public final /* synthetic */ y41 a;

    public j41(y41 y41Var) {
        this.a = y41Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        y41 y41Var = this.a;
        i41 i41Var = y41Var.M;
        if (i10 == 0) {
            y41Var.L = false;
        }
        if ((i10 == 0 || i10 == 2) && y41Var.K(false) > 0.0f && y41Var.K(false) < AndroidUtilities.dp(96.0f) && i41Var.canScrollVertically(1) && y41.E(y41Var)) {
            y41Var.L = true;
            i41Var.v0(0, (int) y41Var.K(false), null);
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        y41 y41Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) y41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = y41Var.M.canScrollVertically(1);
        View view = y41Var.Q;
        Boolean bool = y41Var.W;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            y41Var.W = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.sl.t(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), bs.h, 320L);
        }
    }
}
