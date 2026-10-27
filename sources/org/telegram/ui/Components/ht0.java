package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ht0 extends s4.n0 {
    public final /* synthetic */ bt0 a;

    public ht0(bt0 bt0Var) {
        this.a = bt0Var;
    }

    @Override // s4.n0
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        if (!(view instanceof org.telegram.ui.Cells.w7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
        bt0 bt0Var = this.a;
        bt0Var.n.getClass();
        int R = RecyclerView.R(w7Var);
        int i10 = bt0Var.r.J;
        w7Var.a0 = R < i10;
        int i11 = R % i10;
        w7Var.V = i11 == 0;
        w7Var.W = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
