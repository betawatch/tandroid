package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class j31 extends f2.a1 {
    public final /* synthetic */ w31 a;

    public j31(w31 w31Var) {
        this.a = w31Var;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        w31 w31Var = this.a;
        i31 i31Var = w31Var.E;
        if (i10 == 0) {
            w31Var.D = false;
        }
        if ((i10 == 0 || i10 == 2) && w31Var.A(false) > 0.0f && w31Var.A(false) < AndroidUtilities.dp(96.0f) && i31Var.canScrollVertically(1) && w31.u(w31Var)) {
            w31Var.D = true;
            i31Var.v0(0, (int) w31Var.A(false), null);
        }
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        w31 w31Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) w31Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = w31Var.E.canScrollVertically(1);
        View view = w31Var.I;
        Boolean bool = w31Var.N;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            w31Var.N = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.ui.b.p(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), pr.h, 320L);
        }
    }
}
