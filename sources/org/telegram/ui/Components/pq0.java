package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        if (!(view instanceof org.telegram.ui.Cells.p7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
        iq0Var.h.getClass();
        int R2 = RecyclerView.R(p7Var);
        int i7 = iq0Var.x.J;
        p7Var.b0 = R2 < i7;
        int i10 = R2 % i7;
        p7Var.W = i10 == 0;
        p7Var.a0 = i10 == i7 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
