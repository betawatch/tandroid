package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class w31 extends s4.s0 {
    public final /* synthetic */ i41 a;

    public w31(i41 i41Var) {
        this.a = i41Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        i41 i41Var = this.a;
        v31 v31Var = i41Var.H;
        if (i10 == 0) {
            i41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && i41Var.z(false) > 0.0f && i41Var.z(false) < AndroidUtilities.dp(96.0f) && v31Var.canScrollVertically(1) && i41.u(i41Var)) {
            i41Var.G = true;
            v31Var.v0(0, (int) i41Var.z(false), null);
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        i41 i41Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) i41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = i41Var.H.canScrollVertically(1);
        View view = i41Var.L;
        Boolean bool = i41Var.Q;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            i41Var.Q = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.em.q(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), wr.h, 320L);
        }
    }
}
