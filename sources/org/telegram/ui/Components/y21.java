package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y21 extends f2.a1 {
    public final /* synthetic */ k31 a;

    public y21(k31 k31Var) {
        this.a = k31Var;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        k31 k31Var = this.a;
        x21 x21Var = k31Var.D;
        if (i10 == 0) {
            k31Var.C = false;
        }
        if ((i10 == 0 || i10 == 2) && k31Var.A(false) > 0.0f && k31Var.A(false) < AndroidUtilities.dp(96.0f) && x21Var.canScrollVertically(1) && k31.u(k31Var)) {
            k31Var.C = true;
            x21Var.v0(0, (int) k31Var.A(false), null);
        }
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        k31 k31Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) k31Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = k31Var.D.canScrollVertically(1);
        View view = k31Var.H;
        Boolean bool = k31Var.M;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            k31Var.M = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.ui.b.q(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), jr.h, 320L);
        }
    }
}
