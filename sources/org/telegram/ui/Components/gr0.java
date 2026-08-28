package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gr0 extends f2.y0 {
    public final /* synthetic */ ar0 a;

    public gr0(ar0 ar0Var) {
        this.a = ar0Var;
    }

    @Override // f2.y0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        if (!(view instanceof org.telegram.ui.Cells.r7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
        ar0 ar0Var = this.a;
        ar0Var.r.getClass();
        int R = RecyclerView.R(r7Var);
        int i9 = ar0Var.s.J;
        r7Var.T = R < i9;
        int i10 = R % i9;
        r7Var.R = i10 == 0;
        r7Var.S = i10 == i9 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
