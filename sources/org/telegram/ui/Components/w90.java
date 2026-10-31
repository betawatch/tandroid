package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w90 extends s4.m0 {
    public final /* synthetic */ x90 a;

    public w90(x90 x90Var) {
        this.a = x90Var;
    }

    @Override // s4.m0
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.n0 layoutManager = recyclerView.getLayoutManager();
        y90 y90Var = this.a.i3;
        if (layoutManager != y90Var.d || (R = RecyclerView.R(view)) == 0 || y90Var.f.N()) {
            return;
        }
        if (y90Var.f.I() == null && y90Var.f.U == null) {
            rect.top = org.telegram.messenger.i0.L(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            r90 r90Var = y90Var.d;
            r90Var.B1();
            if (R > r90Var.U) {
                rect.top = org.telegram.messenger.i0.L(2.0f);
            }
        }
        rect.right = y90Var.d.E1(R) ? 0 : org.telegram.messenger.i0.L(2.0f);
    }
}
