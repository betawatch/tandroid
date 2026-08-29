package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t7 extends f2.b0 {
    public final /* synthetic */ g8 d;

    public t7(g8 g8Var) {
        this.d = g8Var;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.n1 n1Var) {
        super.a(recyclerView, n1Var);
        View view = n1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.n1 n1Var) {
        if (n1Var.f != 0) {
            return 0;
        }
        return f2.b0.l(3, 0);
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        int b10 = n1Var.b();
        int b11 = n1Var2.b();
        g8 g8Var = this.d;
        if (!g8Var.r0) {
            g8Var.s0.move(b10, b11);
        } else {
            if (b10 <= 0 || b11 <= 0) {
                return false;
            }
            g8Var.s0.move(b10 - 1, b11 - 1);
        }
        g8Var.t0.clear();
        g8Var.t0.addAll(g8Var.s0.list);
        g8Var.s.p(b10, b11);
        return true;
    }

    @Override // f2.b0
    public final void p(f2.n1 n1Var, int i10) {
        s7 s7Var = this.d.n;
        if (n1Var != null) {
            s7Var.d1(false);
        }
        if (i10 != 0) {
            s7Var.I0(false);
            if (n1Var != null) {
                n1Var.a.setPressed(true);
            }
        }
        if (n1Var != null) {
            n1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // f2.b0
    public final void q(f2.n1 n1Var) {
    }
}
