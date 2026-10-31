package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z21 extends s4.s0 {
    public final /* synthetic */ m31 a;

    public z21(m31 m31Var) {
        this.a = m31Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        m31 m31Var = this.a;
        y21 y21Var = m31Var.D1;
        if (i10 == 0) {
            m31Var.C1 = false;
        }
        if ((i10 == 0 || i10 == 2) && m31Var.L0(false) > 0.0f && m31Var.L0(false) < org.telegram.messenger.i0.L(96.0f) && y21Var.canScrollVertically(1) && m31.I0(m31Var)) {
            m31Var.C1 = true;
            y21Var.w0(0, (int) m31Var.L0(false), null);
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        m31 m31Var = this.a;
        m31Var.b.invalidate();
        boolean canScrollVertically = m31Var.D1.canScrollVertically(1);
        View view = m31Var.H1;
        Boolean bool = m31Var.N1;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            m31Var.N1 = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            org.telegram.messenger.z20.m(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), gr.h, 320L);
        }
    }
}
