package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class bs0 extends f2.v0 {
    public final /* synthetic */ ur0 a;
    public final /* synthetic */ zu0 b;

    public bs0(zu0 zu0Var, ur0 ur0Var) {
        this.b = zu0Var;
        this.a = ur0Var;
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.j1 j1Var) {
        ur0 ur0Var = this.a;
        if (ur0Var.h.getAdapter() == this.b.L) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            vr0 vr0Var = ur0Var.x;
            vr0Var.B1();
            if (R <= vr0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            rect.right = ur0Var.x.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
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
        ur0Var.h.getClass();
        int R2 = RecyclerView.R(r7Var);
        int i10 = ur0Var.x.J;
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
