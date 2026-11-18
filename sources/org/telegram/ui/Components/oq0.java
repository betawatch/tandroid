package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class oq0 extends v4.o0 {
    public final /* synthetic */ iq0 a;

    public oq0(iq0 iq0Var) {
        this.a = iq0Var;
    }

    @Override // v4.o0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        if (!(view instanceof org.telegram.ui.Cells.o7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        iq0 iq0Var = this.a;
        iq0Var.n.getClass();
        int R = RecyclerView.R(o7Var);
        int i7 = iq0Var.r.J;
        o7Var.b0 = R < i7;
        int i10 = R % i7;
        o7Var.W = i10 == 0;
        o7Var.a0 = i10 == i7 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
