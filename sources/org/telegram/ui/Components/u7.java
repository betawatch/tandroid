package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class u7 extends s4.v {
    public final /* synthetic */ i8 d;

    public u7(i8 i8Var) {
        this.d = i8Var;
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
        i8 i8Var = this.d;
        if (!i8Var.v0) {
            i8Var.w0.move(b10, b11);
        } else {
            if (b10 <= 0 || b11 <= 0) {
                return false;
            }
            i8Var.w0.move(b10 - 1, b11 - 1);
        }
        i8Var.x0.clear();
        i8Var.x0.addAll(i8Var.w0.list);
        i8Var.s.p(b10, b11);
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        t7 t7Var = this.d.n;
        if (c1Var != null) {
            t7Var.e1(false);
        }
        if (i10 != 0) {
            t7Var.J0(false);
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
