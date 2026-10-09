package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class et0 extends s4.o0 {
    public final /* synthetic */ xs0 a;
    public final /* synthetic */ bw0 b;

    public et0(bw0 bw0Var, xs0 xs0Var) {
        this.b = bw0Var;
        this.a = xs0Var;
    }

    @Override // s4.o0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        xs0 xs0Var = this.a;
        if (xs0Var.h.getAdapter() == this.b.O) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            ys0 ys0Var = xs0Var.x;
            ys0Var.B1();
            if (R <= ys0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            rect.right = xs0Var.x.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.t7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        xs0Var.h.getClass();
        int R2 = RecyclerView.R(t7Var);
        int i10 = xs0Var.x.J;
        t7Var.a0 = R2 < i10;
        int i11 = R2 % i10;
        t7Var.V = i11 == 0;
        t7Var.W = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
