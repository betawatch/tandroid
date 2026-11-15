package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h90 extends v4.n0 {
    public final /* synthetic */ i90 a;

    public h90(i90 i90Var) {
        this.a = i90Var;
    }

    @Override // v4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        v4.o0 layoutManager = recyclerView.getLayoutManager();
        j90 j90Var = this.a.j3;
        if (layoutManager != j90Var.d || (R = RecyclerView.R(view)) == 0 || j90Var.f.N()) {
            return;
        }
        if (j90Var.f.I() == null && j90Var.f.V == null) {
            rect.top = org.telegram.messenger.g0.L(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            c90 c90Var = j90Var.d;
            c90Var.B1();
            if (R > c90Var.U) {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
        }
        rect.right = j90Var.d.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
    }
}
