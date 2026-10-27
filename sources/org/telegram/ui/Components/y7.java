package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class y7 extends s4.w {
    public final /* synthetic */ m8 d;

    public y7(m8 m8Var) {
        this.d = m8Var;
    }

    @Override // s4.w
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        View view = e1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // s4.w
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        if (e1Var.f != 0) {
            return 0;
        }
        return s4.w.l(3, 0);
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        m8 m8Var = this.d;
        if (!m8Var.u0) {
            m8Var.v0.move(b10, b11);
        } else {
            if (b10 <= 0 || b11 <= 0) {
                return false;
            }
            m8Var.v0.move(b10 - 1, b11 - 1);
        }
        m8Var.w0.clear();
        m8Var.w0.addAll(m8Var.v0.list);
        m8Var.s.p(b10, b11);
        return true;
    }

    @Override // s4.w
    public final void p(s4.e1 e1Var, int i10) {
        x7 x7Var = this.d.n;
        if (e1Var != null) {
            x7Var.d1(false);
        }
        if (i10 != 0) {
            x7Var.I0(false);
            if (e1Var != null) {
                e1Var.a.setPressed(true);
            }
        }
        if (e1Var != null) {
            e1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // s4.w
    public final void q(s4.e1 e1Var) {
    }
}
