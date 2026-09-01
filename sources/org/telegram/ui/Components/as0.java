package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class as0 extends f2.v0 {
    public final /* synthetic */ ur0 a;

    public as0(ur0 ur0Var) {
        this.a = ur0Var;
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.j1 j1Var) {
        if (!(view instanceof org.telegram.ui.Cells.r7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
        ur0 ur0Var = this.a;
        ur0Var.r.getClass();
        int R = RecyclerView.R(r7Var);
        int i10 = ur0Var.s.J;
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
