package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class qq0 extends v4.o0 {
    public final /* synthetic */ jq0 a;
    public final /* synthetic */ it0 b;

    public qq0(it0 it0Var, jq0 jq0Var) {
        this.b = it0Var;
        this.a = jq0Var;
    }

    @Override // v4.o0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        jq0 jq0Var = this.a;
        if (jq0Var.h.getAdapter() == this.b.R) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            kq0 kq0Var = jq0Var.x;
            kq0Var.B1();
            if (R <= kq0Var.U) {
                rect.top = 0;
            } else {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = jq0Var.x.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
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
        jq0Var.h.getClass();
        int R2 = RecyclerView.R(o7Var);
        int i7 = jq0Var.x.J;
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
