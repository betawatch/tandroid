package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class d41 extends s4.r0 {
    public final /* synthetic */ r41 a;

    public d41(r41 r41Var) {
        this.a = r41Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        r41 r41Var = this.a;
        c41 c41Var = r41Var.H;
        if (i10 == 0) {
            r41Var.G = false;
        }
        if ((i10 == 0 || i10 == 2) && r41Var.B(false) > 0.0f && r41Var.B(false) < AndroidUtilities.dp(96.0f) && c41Var.canScrollVertically(1) && r41.w(r41Var)) {
            r41Var.G = true;
            c41Var.v0(0, (int) r41Var.B(false), null);
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        r41 r41Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) r41Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = r41Var.H.canScrollVertically(1);
        View view = r41Var.L;
        Boolean bool = r41Var.Q;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            r41Var.Q = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.lk.t(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), bs.h, 320L);
        }
    }
}
