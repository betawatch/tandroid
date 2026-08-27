package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hr0 extends f2.w0 {
    public final /* synthetic */ br0 a;

    public hr0(br0 br0Var) {
        this.a = br0Var;
    }

    @Override // f2.w0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        if (!(view instanceof org.telegram.ui.Cells.o7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        br0 br0Var = this.a;
        br0Var.r.getClass();
        int R = RecyclerView.R(o7Var);
        int i10 = br0Var.s.J;
        o7Var.T = R < i10;
        int i11 = R % i10;
        o7Var.R = i11 == 0;
        o7Var.S = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
