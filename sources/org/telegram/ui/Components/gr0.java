package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gr0 extends s4.m0 {
    public final /* synthetic */ ar0 a;

    public gr0(ar0 ar0Var) {
        this.a = ar0Var;
    }

    @Override // s4.m0
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        if (!(view instanceof org.telegram.ui.Cells.s7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        ar0 ar0Var = this.a;
        ar0Var.n.getClass();
        int R = RecyclerView.R(s7Var);
        int i10 = ar0Var.r.J;
        s7Var.a0 = R < i10;
        int i11 = R % i10;
        s7Var.V = i11 == 0;
        s7Var.W = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
