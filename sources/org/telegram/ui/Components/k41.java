package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class k41 extends s4.r0 {
    public final /* synthetic */ x41 a;

    public k41(x41 x41Var) {
        this.a = x41Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        x41 x41Var = this.a;
        j41 j41Var = x41Var.H;
        if (i10 == 0) {
            x41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && x41Var.C(false) > 0.0f && x41Var.C(false) < AndroidUtilities.dp(96.0f) && j41Var.canScrollVertically(1) && x41.w(x41Var)) {
            x41Var.G = true;
            j41Var.v0(0, (int) x41Var.C(false), null);
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        x41 x41Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.e3) x41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = x41Var.H.canScrollVertically(1);
        View view = x41Var.L;
        Boolean bool = x41Var.Q;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            x41Var.Q = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.sk.t(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), es.h, 320L);
        }
    }
}
