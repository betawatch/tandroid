package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o7 extends f2.c0 {
    public final /* synthetic */ b8 d;

    public o7(b8 b8Var) {
        this.d = b8Var;
    }

    @Override // f2.c0
    public final void a(RecyclerView recyclerView, f2.o1 o1Var) {
        super.a(recyclerView, o1Var);
        View view = o1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // f2.c0
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        if (o1Var.f != 0) {
            return 0;
        }
        return f2.c0.l(3, 0);
    }

    @Override // f2.c0
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        int b10 = o1Var.b();
        int b11 = o1Var2.b();
        b8 b8Var = this.d;
        if (!b8Var.r0) {
            b8Var.s0.move(b10, b11);
        } else {
            if (b10 <= 0 || b11 <= 0) {
                return false;
            }
            b8Var.s0.move(b10 - 1, b11 - 1);
        }
        b8Var.t0.clear();
        b8Var.t0.addAll(b8Var.s0.list);
        b8Var.s.p(b10, b11);
        return true;
    }

    @Override // f2.c0
    public final void p(f2.o1 o1Var, int i10) {
        n7 n7Var = this.d.n;
        if (o1Var != null) {
            n7Var.d1(false);
        }
        if (i10 != 0) {
            n7Var.I0(false);
            if (o1Var != null) {
                o1Var.a.setPressed(true);
            }
        }
        if (o1Var != null) {
            o1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // f2.c0
    public final void q(f2.o1 o1Var) {
    }
}
