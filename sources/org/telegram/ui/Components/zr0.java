package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class zr0 extends f2.u0 {
    public final /* synthetic */ tr0 a;

    public zr0(tr0 tr0Var) {
        this.a = tr0Var;
    }

    @Override // f2.u0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        if (!(view instanceof org.telegram.ui.Cells.r7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
        tr0 tr0Var = this.a;
        tr0Var.r.getClass();
        int R = RecyclerView.R(r7Var);
        int i10 = tr0Var.s.J;
        r7Var.U = R < i10;
        int i11 = R % i10;
        r7Var.S = i11 == 0;
        r7Var.T = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
