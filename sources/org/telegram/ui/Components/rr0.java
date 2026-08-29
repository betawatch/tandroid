package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class rr0 extends f2.v0 {
    public final /* synthetic */ lr0 a;

    public rr0(lr0 lr0Var) {
        this.a = lr0Var;
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        if (!(view instanceof org.telegram.ui.Cells.p7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
        lr0 lr0Var = this.a;
        lr0Var.r.getClass();
        int R = RecyclerView.R(p7Var);
        int i10 = lr0Var.s.J;
        p7Var.T = R < i10;
        int i11 = R % i10;
        p7Var.R = i11 == 0;
        p7Var.S = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
