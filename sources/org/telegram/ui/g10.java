package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g10 extends v4.s0 {
    public final /* synthetic */ e40 a;

    public g10(e40 e40Var) {
        this.a = e40Var;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Components.yi0 yi0Var;
        e40 e40Var = this.a;
        m30 m30Var = e40Var.H1;
        if (i7 != 0) {
            org.telegram.ui.Components.z20 z20Var = e40Var.d2;
            if (z20Var != null) {
                z20Var.a();
            }
            org.telegram.ui.Components.z20 z20Var2 = e40Var.e2;
            if (z20Var2 != null) {
                z20Var2.a();
                return;
            }
            return;
        }
        float L = e40Var.p2 - org.telegram.messenger.g0.L(74.0f);
        m30Var.getChildAt(0);
        if (L + e40Var.s0 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !m30Var.canScrollVertically(1) || (yi0Var = (org.telegram.ui.Components.yi0) m30Var.K(0)) == null) {
            return;
        }
        View view = yi0Var.a;
        if (view.getTop() > 0) {
            m30Var.w0(0, view.getTop(), null);
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.r3 r3Var;
        e40 e40Var = this.a;
        if (e40Var.H1.getChildCount() <= 0 || (r3Var = e40Var.R2) == null) {
            return;
        }
        if (!r3Var.u && !r3Var.t && e40Var.P1.N0() > e40Var.G1.F - 5) {
            e40Var.R2.k(false);
        }
        e40.P0(e40Var);
        t30 t30Var = e40Var.L2;
        if (t30Var != null) {
            t30Var.invalidate();
        }
        e40Var.b.invalidate();
    }
}
