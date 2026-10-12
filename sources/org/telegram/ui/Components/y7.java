package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class y7 extends s4.v {
    public final /* synthetic */ m8 d;

    public y7(m8 m8Var) {
        this.d = m8Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        View view = b1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        if (b1Var.f != 0) {
            return 0;
        }
        return s4.v.l(3, 0);
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        m8 m8Var = this.d;
        if (!m8Var.v0) {
            m8Var.w0.move(b10, b11);
        } else {
            if (b10 <= 0 || b11 <= 0) {
                return false;
            }
            m8Var.w0.move(b10 - 1, b11 - 1);
        }
        m8Var.x0.clear();
        m8Var.x0.addAll(m8Var.w0.list);
        m8Var.s.p(b10, b11);
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        x7 x7Var = this.d.n;
        if (b1Var != null) {
            x7Var.d1(false);
        }
        if (i10 != 0) {
            x7Var.I0(false);
            if (b1Var != null) {
                b1Var.a.setPressed(true);
            }
        }
        if (b1Var != null) {
            b1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
    }
}
