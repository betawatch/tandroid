package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e20 extends s4.s0 {
    public final /* synthetic */ b50 a;

    public e20(b50 b50Var) {
        this.a = b50Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Components.ck0 ck0Var;
        b50 b50Var = this.a;
        i40 i40Var = b50Var.H1;
        if (i10 != 0) {
            org.telegram.ui.Components.q30 q30Var = b50Var.d2;
            if (q30Var != null) {
                q30Var.b(true);
            }
            org.telegram.ui.Components.q30 q30Var2 = b50Var.e2;
            if (q30Var2 != null) {
                q30Var2.b(true);
                return;
            }
            return;
        }
        float L = b50Var.p2 - org.telegram.messenger.i0.L(74.0f);
        i40Var.getChildAt(0);
        if (L + b50Var.s0 >= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() || !i40Var.canScrollVertically(1) || (ck0Var = (org.telegram.ui.Components.ck0) i40Var.K(0)) == null) {
            return;
        }
        View view = ck0Var.a;
        if (view.getTop() > 0) {
            i40Var.w0(0, view.getTop(), null);
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.messenger.u3 u3Var;
        b50 b50Var = this.a;
        if (b50Var.H1.getChildCount() <= 0 || (u3Var = b50Var.R2) == null) {
            return;
        }
        if (!u3Var.u && !u3Var.t && b50Var.P1.N0() > b50Var.G1.F - 5) {
            b50Var.R2.k(false);
        }
        b50.P0(b50Var);
        q40 q40Var = b50Var.L2;
        if (q40Var != null) {
            q40Var.invalidate();
        }
        b50Var.b.invalidate();
    }
}
