package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class as0 extends f2.u0 {
    public final /* synthetic */ tr0 a;
    public final /* synthetic */ yu0 b;

    public as0(yu0 yu0Var, tr0 tr0Var) {
        this.b = yu0Var;
        this.a = tr0Var;
    }

    @Override // f2.u0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        tr0 tr0Var = this.a;
        if (tr0Var.h.getAdapter() == this.b.L) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            ur0 ur0Var = tr0Var.x;
            ur0Var.B1();
            if (R <= ur0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            rect.right = tr0Var.x.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.r7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
        tr0Var.h.getClass();
        int R2 = RecyclerView.R(r7Var);
        int i10 = tr0Var.x.J;
        r7Var.U = R2 < i10;
        int i11 = R2 % i10;
        r7Var.S = i11 == 0;
        r7Var.T = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
