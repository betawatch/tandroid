package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hr0 extends s4.m0 {
    public final /* synthetic */ ar0 a;
    public final /* synthetic */ zt0 b;

    public hr0(zt0 zt0Var, ar0 ar0Var) {
        this.b = zt0Var;
        this.a = ar0Var;
    }

    @Override // s4.m0
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        ar0 ar0Var = this.a;
        if (ar0Var.h.getAdapter() == this.b.Q) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            br0 br0Var = ar0Var.x;
            br0Var.B1();
            if (R <= br0Var.U) {
                rect.top = 0;
            } else {
                rect.top = org.telegram.messenger.i0.L(2.0f);
            }
            rect.right = ar0Var.x.E1(R) ? 0 : org.telegram.messenger.i0.L(2.0f);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.s7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        ar0Var.h.getClass();
        int R2 = RecyclerView.R(s7Var);
        int i10 = ar0Var.x.J;
        s7Var.a0 = R2 < i10;
        int i11 = R2 % i10;
        s7Var.V = i11 == 0;
        s7Var.W = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
