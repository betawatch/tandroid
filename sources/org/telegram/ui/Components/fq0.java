package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fq0 extends u4.n0 {
    public final /* synthetic */ zp0 a;

    public fq0(zp0 zp0Var) {
        this.a = zp0Var;
    }

    @Override // u4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        if (!(view instanceof org.telegram.ui.Cells.n7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
        zp0 zp0Var = this.a;
        zp0Var.n.getClass();
        int R = RecyclerView.R(n7Var);
        int i3 = zp0Var.r.J;
        n7Var.b0 = R < i3;
        int i10 = R % i3;
        n7Var.W = i10 == 0;
        n7Var.a0 = i10 == i3 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
