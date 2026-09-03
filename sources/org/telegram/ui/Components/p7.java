package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class p7 extends f2.b0 {
    public final /* synthetic */ c8 d;

    public p7(c8 c8Var) {
        this.d = c8Var;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.m1 m1Var) {
        super.a(recyclerView, m1Var);
        View view = m1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.m1 m1Var) {
        if (m1Var.f != 0) {
            return 0;
        }
        return f2.b0.l(3, 0);
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        int b10 = m1Var.b();
        int b11 = m1Var2.b();
        c8 c8Var = this.d;
        if (!c8Var.s0) {
            c8Var.t0.move(b10, b11);
        } else {
            if (b10 <= 0 || b11 <= 0) {
                return false;
            }
            c8Var.t0.move(b10 - 1, b11 - 1);
        }
        c8Var.u0.clear();
        c8Var.u0.addAll(c8Var.t0.list);
        c8Var.s.p(b10, b11);
        return true;
    }

    @Override // f2.b0
    public final void p(f2.m1 m1Var, int i10) {
        o7 o7Var = this.d.n;
        if (m1Var != null) {
            o7Var.c1(false);
        }
        if (i10 != 0) {
            o7Var.I0(false);
            if (m1Var != null) {
                m1Var.a.setPressed(true);
            }
        }
        if (m1Var != null) {
            m1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // f2.b0
    public final void q(f2.m1 m1Var) {
    }
}
