package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ls0 extends s4.n0 {
    public final /* synthetic */ fs0 a;

    public ls0(fs0 fs0Var) {
        this.a = fs0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        if (!(view instanceof org.telegram.ui.Cells.u7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
        fs0 fs0Var = this.a;
        fs0Var.r.getClass();
        int S = RecyclerView.S(u7Var);
        int i10 = fs0Var.s.J;
        u7Var.a0 = S < i10;
        int i11 = S % i10;
        u7Var.V = i11 == 0;
        u7Var.W = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
