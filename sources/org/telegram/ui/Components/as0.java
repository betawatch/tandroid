package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        if (!(view instanceof org.telegram.ui.Cells.q7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
        tr0Var.h.getClass();
        int R2 = RecyclerView.R(q7Var);
        int i10 = tr0Var.x.J;
        q7Var.U = R2 < i10;
        int i11 = R2 % i10;
        q7Var.S = i11 == 0;
        q7Var.T = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
