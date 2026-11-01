package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ir0 extends s4.m0 {
    public final /* synthetic */ br0 a;
    public final /* synthetic */ au0 b;

    public ir0(au0 au0Var, br0 br0Var) {
        this.b = au0Var;
        this.a = br0Var;
    }

    @Override // s4.m0
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        br0 br0Var = this.a;
        if (br0Var.h.getAdapter() == this.b.Q) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            cr0 cr0Var = br0Var.x;
            cr0Var.B1();
            if (R <= cr0Var.U) {
                rect.top = 0;
            } else {
                rect.top = org.telegram.messenger.i0.L(2.0f);
            }
            rect.right = br0Var.x.E1(R) ? 0 : org.telegram.messenger.i0.L(2.0f);
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
        br0Var.h.getClass();
        int R2 = RecyclerView.R(s7Var);
        int i10 = br0Var.x.J;
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
