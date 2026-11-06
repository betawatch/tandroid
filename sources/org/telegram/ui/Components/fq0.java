package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class fq0 extends v4.m0 {
    public final /* synthetic */ zp0 a;

    public fq0(zp0 zp0Var) {
        this.a = zp0Var;
    }

    @Override // v4.m0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        if (!(view instanceof org.telegram.ui.Cells.o7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        zp0 zp0Var = this.a;
        zp0Var.n.getClass();
        int R = RecyclerView.R(o7Var);
        int i7 = zp0Var.r.J;
        o7Var.a0 = R < i7;
        int i10 = R % i7;
        o7Var.V = i10 == 0;
        o7Var.W = i10 == i7 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
