package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class gq0 extends v4.m0 {
    public final /* synthetic */ aq0 a;

    public gq0(aq0 aq0Var) {
        this.a = aq0Var;
    }

    @Override // v4.m0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        if (!(view instanceof org.telegram.ui.Cells.o7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        aq0 aq0Var = this.a;
        aq0Var.n.getClass();
        int R = RecyclerView.R(o7Var);
        int i7 = aq0Var.r.J;
        o7Var.a0 = R < i7;
        int i10 = R % i7;
        o7Var.V = i10 == 0;
        o7Var.W = i10 == i7 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
