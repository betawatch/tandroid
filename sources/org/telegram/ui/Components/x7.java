package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class x7 extends s4.w {
    public final /* synthetic */ l8 d;

    public x7(l8 l8Var) {
        this.d = l8Var;
    }

    @Override // s4.w
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        View view = d1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // s4.w
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        if (d1Var.f != 0) {
            return 0;
        }
        return s4.w.l(3, 0);
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        l8 l8Var = this.d;
        if (!l8Var.v0) {
            l8Var.w0.move(b10, b11);
        } else {
            if (b10 <= 0 || b11 <= 0) {
                return false;
            }
            l8Var.w0.move(b10 - 1, b11 - 1);
        }
        l8Var.x0.clear();
        l8Var.x0.addAll(l8Var.w0.list);
        l8Var.s.p(b10, b11);
        return true;
    }

    @Override // s4.w
    public final void p(s4.d1 d1Var, int i10) {
        w7 w7Var = this.d.n;
        if (d1Var != null) {
            w7Var.d1(false);
        }
        if (i10 != 0) {
            w7Var.I0(false);
            if (d1Var != null) {
                d1Var.a.setPressed(true);
            }
        }
        if (d1Var != null) {
            d1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // s4.w
    public final void q(s4.d1 d1Var) {
    }
}
