package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class w7 extends s4.v {
    public final /* synthetic */ k8 d;

    public w7(k8 k8Var) {
        this.d = k8Var;
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
        k8 k8Var = this.d;
        if (!k8Var.v0) {
            k8Var.w0.move(b10, b11);
        } else {
            if (b10 <= 0 || b11 <= 0) {
                return false;
            }
            k8Var.w0.move(b10 - 1, b11 - 1);
        }
        k8Var.x0.clear();
        k8Var.x0.addAll(k8Var.w0.list);
        k8Var.s.p(b10, b11);
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        v7 v7Var = this.d.n;
        if (c1Var != null) {
            v7Var.c1(false);
        }
        if (i10 != 0) {
            v7Var.I0(false);
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
