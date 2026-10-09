package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class o41 extends s4.t0 {
    public final /* synthetic */ b51 a;

    public o41(b51 b51Var) {
        this.a = b51Var;
    }

    @Override // s4.t0
    public final void a(RecyclerView recyclerView, int i10) {
        b51 b51Var = this.a;
        n41 n41Var = b51Var.H;
        if (i10 == 0) {
            b51Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && b51Var.C(false) > 0.0f && b51Var.C(false) < AndroidUtilities.dp(96.0f) && n41Var.canScrollVertically(1) && b51.w(b51Var)) {
            b51Var.G = true;
            n41Var.v0(0, (int) b51Var.C(false), null);
        }
    }

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        b51 b51Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) b51Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = b51Var.H.canScrollVertically(1);
        View view = b51Var.L;
        Boolean bool = b51Var.Q;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            b51Var.Q = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.bi.t(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), hs.h, 320L);
        }
    }
}
