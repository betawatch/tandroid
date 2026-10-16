package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class at0 extends s4.m0 {
    public final /* synthetic */ ts0 a;
    public final /* synthetic */ xv0 b;

    public at0(xv0 xv0Var, ts0 ts0Var) {
        this.b = xv0Var;
        this.a = ts0Var;
    }

    @Override // s4.m0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        ts0 ts0Var = this.a;
        if (ts0Var.h.getAdapter() == this.b.O) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            us0 us0Var = ts0Var.x;
            us0Var.B1();
            if (R <= us0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            rect.right = ts0Var.x.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
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
        ts0Var.h.getClass();
        int R2 = RecyclerView.R(t7Var);
        int i10 = ts0Var.x.J;
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
