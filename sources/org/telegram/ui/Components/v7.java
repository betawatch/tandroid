package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v7 extends s4.v {
    public final /* synthetic */ j8 d;

    public v7(j8 j8Var) {
        this.d = j8Var;
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
        j8 j8Var = this.d;
        if (!j8Var.v0) {
            j8Var.w0.move(b10, b11);
        } else {
            if (b10 <= 0 || b11 <= 0) {
                return false;
            }
            j8Var.w0.move(b10 - 1, b11 - 1);
        }
        j8Var.x0.clear();
        j8Var.x0.addAll(j8Var.w0.list);
        j8Var.s.p(b10, b11);
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        u7 u7Var = this.d.n;
        if (c1Var != null) {
            u7Var.c1(false);
        }
        if (i10 != 0) {
            u7Var.I0(false);
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
