package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class qq0 extends v4.o0 {
    public final /* synthetic */ kq0 a;

    public qq0(kq0 kq0Var) {
        this.a = kq0Var;
    }

    @Override // v4.o0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        if (!(view instanceof org.telegram.ui.Cells.p7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
        kq0 kq0Var = this.a;
        kq0Var.n.getClass();
        int R = RecyclerView.R(p7Var);
        int i7 = kq0Var.r.J;
        p7Var.b0 = R < i7;
        int i10 = R % i7;
        p7Var.W = i10 == 0;
        p7Var.a0 = i10 == i7 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
