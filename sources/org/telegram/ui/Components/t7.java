package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class t7 extends s4.v {
    public final /* synthetic */ h8 d;

    public t7(h8 h8Var) {
        this.d = h8Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        View view = c1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (c1Var.f != 0) {
            return 0;
        }
        return s4.v.l(3, 0);
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        h8 h8Var = this.d;
        if (!h8Var.v0) {
            h8Var.w0.move(b10, b11);
        } else {
            if (b10 <= 0 || b11 <= 0) {
                return false;
            }
            h8Var.w0.move(b10 - 1, b11 - 1);
        }
        h8Var.x0.clear();
        h8Var.x0.addAll(h8Var.w0.list);
        h8Var.s.p(b10, b11);
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        s7 s7Var = this.d.n;
        if (c1Var != null) {
            s7Var.d1(false);
        }
        if (i10 != 0) {
            s7Var.I0(false);
            if (c1Var != null) {
                c1Var.a.setPressed(true);
            }
        }
        if (c1Var != null) {
            c1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}
