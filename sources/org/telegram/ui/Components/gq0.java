package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class gq0 extends v4.n0 {
    public final /* synthetic */ aq0 a;

    public gq0(aq0 aq0Var) {
        this.a = aq0Var;
    }

    @Override // v4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        if (!(view instanceof org.telegram.ui.Cells.n7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
        aq0 aq0Var = this.a;
        aq0Var.n.getClass();
        int R = RecyclerView.R(n7Var);
        int i7 = aq0Var.r.J;
        n7Var.b0 = R < i7;
        int i10 = R % i7;
        n7Var.W = i10 == 0;
        n7Var.a0 = i10 == i7 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
