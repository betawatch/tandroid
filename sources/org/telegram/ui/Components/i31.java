package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class i31 extends f2.a1 {
    public final /* synthetic */ v31 a;

    public i31(v31 v31Var) {
        this.a = v31Var;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        v31 v31Var = this.a;
        h31 h31Var = v31Var.E;
        if (i10 == 0) {
            v31Var.D = false;
        }
        if ((i10 == 0 || i10 == 2) && v31Var.A(false) > 0.0f && v31Var.A(false) < AndroidUtilities.dp(96.0f) && h31Var.canScrollVertically(1) && v31.u(v31Var)) {
            v31Var.D = true;
            h31Var.v0(0, (int) v31Var.A(false), null);
        }
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        v31 v31Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) v31Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = v31Var.E.canScrollVertically(1);
        View view = v31Var.I;
        Boolean bool = v31Var.N;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            v31Var.N = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.ui.b.p(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), pr.h, 320L);
        }
    }
}
