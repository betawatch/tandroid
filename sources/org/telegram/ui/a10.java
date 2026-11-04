package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a10 extends u4.t0 {
    public final /* synthetic */ x30 a;

    public a10(x30 x30Var) {
        this.a = x30Var;
    }

    @Override // u4.t0
    public final void a(RecyclerView recyclerView, int i3) {
        org.telegram.ui.Components.bj0 bj0Var;
        x30 x30Var = this.a;
        f30 f30Var = x30Var.I1;
        if (i3 != 0) {
            org.telegram.ui.Components.u20 u20Var = x30Var.e2;
            if (u20Var != null) {
                u20Var.a();
            }
            org.telegram.ui.Components.u20 u20Var2 = x30Var.f2;
            if (u20Var2 != null) {
                u20Var2.a();
                return;
            }
            return;
        }
        float L = x30Var.q2 - org.telegram.messenger.g0.L(74.0f);
        f30Var.getChildAt(0);
        if (L + x30Var.t0 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !f30Var.canScrollVertically(1) || (bj0Var = (org.telegram.ui.Components.bj0) f30Var.K(0)) == null) {
            return;
        }
        View view = bj0Var.a;
        if (view.getTop() > 0) {
            f30Var.w0(0, view.getTop(), null);
        }
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        org.telegram.messenger.r3 r3Var;
        x30 x30Var = this.a;
        if (x30Var.I1.getChildCount() <= 0 || (r3Var = x30Var.S2) == null) {
            return;
        }
        if (!r3Var.u && !r3Var.t && x30Var.Q1.N0() > x30Var.H1.G - 5) {
            x30Var.S2.k(false);
        }
        x30.P0(x30Var);
        m30 m30Var = x30Var.M2;
        if (m30Var != null) {
            m30Var.invalidate();
        }
        x30Var.b.invalidate();
    }
}
