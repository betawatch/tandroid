package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hq0 extends v4.n0 {
    public final /* synthetic */ aq0 a;
    public final /* synthetic */ ys0 b;

    public hq0(ys0 ys0Var, aq0 aq0Var) {
        this.b = ys0Var;
        this.a = aq0Var;
    }

    @Override // v4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        aq0 aq0Var = this.a;
        if (aq0Var.h.getAdapter() == this.b.R) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            bq0 bq0Var = aq0Var.x;
            bq0Var.B1();
            if (R <= bq0Var.U) {
                rect.top = 0;
            } else {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = aq0Var.x.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.n7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
        aq0Var.h.getClass();
        int R2 = RecyclerView.R(n7Var);
        int i7 = aq0Var.x.J;
        n7Var.b0 = R2 < i7;
        int i10 = R2 % i7;
        n7Var.W = i10 == 0;
        n7Var.a0 = i10 == i7 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
