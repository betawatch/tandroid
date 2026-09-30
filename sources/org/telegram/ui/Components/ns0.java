package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class ns0 extends s4.n0 {
    public final /* synthetic */ hs0 a;

    public ns0(hs0 hs0Var) {
        this.a = hs0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        if (!(view instanceof org.telegram.ui.Cells.t7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        hs0 hs0Var = this.a;
        hs0Var.r.getClass();
        int R = RecyclerView.R(t7Var);
        int i10 = hs0Var.s.J;
        t7Var.a0 = R < i10;
        int i11 = R % i10;
        t7Var.V = i11 == 0;
        t7Var.W = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
