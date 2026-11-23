package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g10 extends v4.u0 {
    public final /* synthetic */ e40 a;

    public g10(e40 e40Var) {
        this.a = e40Var;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Components.mj0 mj0Var;
        e40 e40Var = this.a;
        m30 m30Var = e40Var.L1;
        if (i7 != 0) {
            org.telegram.ui.Components.j30 j30Var = e40Var.h2;
            if (j30Var != null) {
                j30Var.a();
            }
            org.telegram.ui.Components.j30 j30Var2 = e40Var.i2;
            if (j30Var2 != null) {
                j30Var2.a();
                return;
            }
            return;
        }
        float L = e40Var.t2 - org.telegram.messenger.g0.L(74.0f);
        m30Var.getChildAt(0);
        if (L + e40Var.t0 >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || !m30Var.canScrollVertically(1) || (mj0Var = (org.telegram.ui.Components.mj0) m30Var.K(0)) == null) {
            return;
        }
        View view = mj0Var.a;
        if (view.getTop() > 0) {
            m30Var.w0(0, view.getTop(), null);
        }
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        org.telegram.messenger.t3 t3Var;
        e40 e40Var = this.a;
        if (e40Var.L1.getChildCount() <= 0 || (t3Var = e40Var.V2) == null) {
            return;
        }
        if (!t3Var.u && !t3Var.t && e40Var.T1.N0() > e40Var.K1.G - 5) {
            e40Var.V2.k(false);
        }
        e40.Q0(e40Var);
        t30 t30Var = e40Var.P2;
        if (t30Var != null) {
            t30Var.invalidate();
        }
        e40Var.b.invalidate();
    }
}
