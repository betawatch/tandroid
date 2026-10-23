package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class f41 extends s4.r0 {
    public final /* synthetic */ t41 a;

    public f41(t41 t41Var) {
        this.a = t41Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        t41 t41Var = this.a;
        e41 e41Var = t41Var.H;
        if (i10 == 0) {
            t41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && t41Var.B(false) > 0.0f && t41Var.B(false) < AndroidUtilities.dp(96.0f) && e41Var.canScrollVertically(1) && t41.w(t41Var)) {
            t41Var.G = true;
            e41Var.v0(0, (int) t41Var.B(false), null);
        }
    }

    @Override // s4.r0
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
            org.telegram.messenger.nk.t(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), bs.h, 320L);
        }
    }
}
