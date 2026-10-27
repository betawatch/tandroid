package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class it0 extends s4.n0 {
    public final /* synthetic */ bt0 a;
    public final /* synthetic */ bw0 b;

    public it0(bw0 bw0Var, bt0 bt0Var) {
        this.b = bw0Var;
        this.a = bt0Var;
    }

    @Override // s4.n0
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        bt0 bt0Var = this.a;
        if (bt0Var.h.getAdapter() == this.b.Q) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            ct0 ct0Var = bt0Var.w;
            ct0Var.C1();
            if (R <= ct0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            rect.right = bt0Var.w.F1(R) ? 0 : AndroidUtilities.dp(2.0f);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.w7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
        bt0Var.h.getClass();
        int R2 = RecyclerView.R(w7Var);
        int i10 = bt0Var.w.J;
        w7Var.a0 = R2 < i10;
        int i11 = R2 % i10;
        w7Var.V = i11 == 0;
        w7Var.W = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
