package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f90 extends v4.m0 {
    public final /* synthetic */ g90 a;

    public f90(g90 g90Var) {
        this.a = g90Var;
    }

    @Override // v4.m0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        v4.n0 layoutManager = recyclerView.getLayoutManager();
        h90 h90Var = this.a.i3;
        if (layoutManager != h90Var.d || (R = RecyclerView.R(view)) == 0 || h90Var.f.N()) {
            return;
        }
        if (h90Var.f.I() == null && h90Var.f.U == null) {
            rect.top = org.telegram.messenger.g0.L(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            a90 a90Var = h90Var.d;
            a90Var.B1();
            if (R > a90Var.U) {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
        }
        rect.right = h90Var.d.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
    }
}
