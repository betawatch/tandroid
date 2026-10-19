package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class e41 extends s4.r0 {
    public final /* synthetic */ s41 a;

    public e41(s41 s41Var) {
        this.a = s41Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        s41 s41Var = this.a;
        d41 d41Var = s41Var.H;
        if (i10 == 0) {
            s41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && s41Var.B(false) > 0.0f && s41Var.B(false) < AndroidUtilities.dp(96.0f) && d41Var.canScrollVertically(1) && s41.w(s41Var)) {
            s41Var.G = true;
            d41Var.v0(0, (int) s41Var.B(false), null);
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        s41 s41Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) s41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = s41Var.H.canScrollVertically(1);
        View view = s41Var.L;
        Boolean bool = s41Var.Q;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            s41Var.Q = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.kk.t(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), bs.h, 320L);
        }
    }
}
