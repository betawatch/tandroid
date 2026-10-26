package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ht0 extends s4.n0 {
    public final /* synthetic */ at0 a;
    public final /* synthetic */ aw0 b;

    public ht0(aw0 aw0Var, at0 at0Var) {
        this.b = aw0Var;
        this.a = at0Var;
    }

    @Override // s4.n0
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        at0 at0Var = this.a;
        if (at0Var.h.getAdapter() == this.b.Q) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            bt0 bt0Var = at0Var.w;
            bt0Var.C1();
            if (R <= bt0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            rect.right = at0Var.w.F1(R) ? 0 : AndroidUtilities.dp(2.0f);
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
        at0Var.h.getClass();
        int R2 = RecyclerView.R(w7Var);
        int i10 = at0Var.w.J;
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
