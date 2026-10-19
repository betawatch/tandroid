package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ws0 extends s4.m0 {
    public final /* synthetic */ ps0 a;
    public final /* synthetic */ tv0 b;

    public ws0(tv0 tv0Var, ps0 ps0Var) {
        this.b = tv0Var;
        this.a = ps0Var;
    }

    @Override // s4.m0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        ps0 ps0Var = this.a;
        if (ps0Var.h.getAdapter() == this.b.O) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            qs0 qs0Var = ps0Var.x;
            qs0Var.B1();
            if (R <= qs0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            rect.right = ps0Var.x.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
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
        ps0Var.h.getClass();
        int R2 = RecyclerView.R(s7Var);
        int i10 = ps0Var.x.J;
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
