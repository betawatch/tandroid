package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gq0 extends u4.n0 {
    public final /* synthetic */ zp0 a;
    public final /* synthetic */ ws0 b;

    public gq0(ws0 ws0Var, zp0 zp0Var) {
        this.b = ws0Var;
        this.a = zp0Var;
    }

    @Override // u4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        zp0 zp0Var = this.a;
        if (zp0Var.h.getAdapter() == this.b.R) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            aq0 aq0Var = zp0Var.x;
            aq0Var.B1();
            if (R <= aq0Var.U) {
                rect.top = 0;
            } else {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = zp0Var.x.E1(R) ? 0 : org.telegram.messenger.g0.L(2.0f);
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
        zp0Var.h.getClass();
        int R2 = RecyclerView.R(n7Var);
        int i3 = zp0Var.x.J;
        n7Var.b0 = R2 < i3;
        int i10 = R2 % i3;
        n7Var.W = i10 == 0;
        n7Var.a0 = i10 == i3 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
