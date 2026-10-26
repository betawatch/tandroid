package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class gt0 extends s4.n0 {
    public final /* synthetic */ at0 a;

    public gt0(at0 at0Var) {
        this.a = at0Var;
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
        at0 at0Var = this.a;
        at0Var.n.getClass();
        int R = RecyclerView.R(w7Var);
        int i10 = at0Var.r.J;
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
