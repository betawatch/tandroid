package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o7 extends f2.d0 {
    public final /* synthetic */ c8 d;

    public o7(c8 c8Var) {
        this.d = c8Var;
    }

    @Override // f2.d0
    public final void a(RecyclerView recyclerView, f2.q1 q1Var) {
        super.a(recyclerView, q1Var);
        View view = q1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // f2.d0
    public final int e(RecyclerView recyclerView, f2.q1 q1Var) {
        if (q1Var.f != 0) {
            return 0;
        }
        return f2.d0.l(3, 0);
    }

    @Override // f2.d0
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        int b10 = q1Var.b();
        int b11 = q1Var2.b();
        c8 c8Var = this.d;
        if (!c8Var.r0) {
            c8Var.s0.move(b10, b11);
        } else {
            if (b10 <= 0 || b11 <= 0) {
                return false;
            }
            c8Var.s0.move(b10 - 1, b11 - 1);
        }
        c8Var.t0.clear();
        c8Var.t0.addAll(c8Var.s0.list);
        c8Var.s.p(b10, b11);
        return true;
    }

    @Override // f2.d0
    public final void p(f2.q1 q1Var, int i9) {
        n7 n7Var = this.d.n;
        if (q1Var != null) {
            n7Var.d1(false);
        }
        if (i9 != 0) {
            n7Var.I0(false);
            if (q1Var != null) {
                q1Var.a.setPressed(true);
            }
        }
        if (q1Var != null) {
            q1Var.a.setTag(R.id.dragging, i9 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // f2.d0
    public final void q(f2.q1 q1Var) {
    }
}
