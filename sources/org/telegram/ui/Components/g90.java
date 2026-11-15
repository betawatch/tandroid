package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g90 extends v4.n0 {
    public final /* synthetic */ h90 a;

    public g90(h90 h90Var) {
        this.a = h90Var;
    }

    @Override // v4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        v4.o0 layoutManager = recyclerView.getLayoutManager();
        i90 i90Var = this.a.j3;
        if (layoutManager != i90Var.d || (R = RecyclerView.R(view)) == 0 || i90Var.f.N()) {
            return;
        }
        if (i90Var.f.I() == null && i90Var.f.V == null) {
            rect.top = org.telegram.messenger.g0.L(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            b90 b90Var = i90Var.d;
            b90Var.B1();
            if (R > b90Var.U) {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
        }
        rect.right = i90Var.d.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
    }
}
