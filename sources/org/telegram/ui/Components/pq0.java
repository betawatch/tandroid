package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class pq0 extends v4.o0 {
    public final /* synthetic */ iq0 a;
    public final /* synthetic */ gt0 b;

    public pq0(gt0 gt0Var, iq0 iq0Var) {
        this.b = gt0Var;
        this.a = iq0Var;
    }

    @Override // v4.o0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        iq0 iq0Var = this.a;
        if (iq0Var.h.getAdapter() == this.b.R) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            jq0 jq0Var = iq0Var.x;
            jq0Var.B1();
            if (R <= jq0Var.U) {
                rect.top = 0;
            } else {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = iq0Var.x.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.o7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        iq0Var.h.getClass();
        int R2 = RecyclerView.R(o7Var);
        int i7 = iq0Var.x.J;
        o7Var.b0 = R2 < i7;
        int i10 = R2 % i7;
        o7Var.W = i10 == 0;
        o7Var.a0 = i10 == i7 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
