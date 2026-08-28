package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n21 extends f2.d1 {
    public final /* synthetic */ z21 a;

    public n21(z21 z21Var) {
        this.a = z21Var;
    }

    @Override // f2.d1
    public final void a(RecyclerView recyclerView, int i9) {
        z21 z21Var = this.a;
        m21 m21Var = z21Var.D;
        if (i9 == 0) {
            z21Var.C = false;
        }
        if ((i9 == 0 || i9 == 2) && z21Var.z(false) > 0.0f && z21Var.z(false) < AndroidUtilities.dp(96.0f) && m21Var.canScrollVertically(1) && z21.u(z21Var)) {
            z21Var.C = true;
            m21Var.v0(0, (int) z21Var.z(false), null);
        }
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ViewGroup viewGroup;
        z21 z21Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) z21Var).containerView;
        viewGroup.invalidate();
        boolean canScrollVertically = z21Var.D.canScrollVertically(1);
        View view = z21Var.H;
        Boolean bool = z21Var.M;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            z21Var.M = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.ll.r(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), gr.h, 320L);
        }
    }
}
