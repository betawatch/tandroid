package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class gq0 extends v4.m0 {
    public final /* synthetic */ zp0 a;
    public final /* synthetic */ xs0 b;

    public gq0(xs0 xs0Var, zp0 zp0Var) {
        this.b = xs0Var;
        this.a = zp0Var;
    }

    @Override // v4.m0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        zp0 zp0Var = this.a;
        if (zp0Var.h.getAdapter() == this.b.Q) {
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
        if (!(view instanceof org.telegram.ui.Cells.o7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        zp0Var.h.getClass();
        int R2 = RecyclerView.R(o7Var);
        int i7 = zp0Var.x.J;
        o7Var.a0 = R2 < i7;
        int i10 = R2 % i7;
        o7Var.V = i10 == 0;
        o7Var.W = i10 == i7 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
