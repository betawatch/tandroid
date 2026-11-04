package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a90 extends u4.n0 {
    public final /* synthetic */ b90 a;

    public a90(b90 b90Var) {
        this.a = b90Var;
    }

    @Override // u4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        u4.o0 layoutManager = recyclerView.getLayoutManager();
        c90 c90Var = this.a.j3;
        if (layoutManager != c90Var.d || (R = RecyclerView.R(view)) == 0 || c90Var.f.N()) {
            return;
        }
        if (c90Var.f.I() == null && c90Var.f.V == null) {
            rect.top = org.telegram.messenger.g0.L(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            v80 v80Var = c90Var.d;
            v80Var.B1();
            if (R > v80Var.U) {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
        }
        rect.right = c90Var.d.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
    }
}
