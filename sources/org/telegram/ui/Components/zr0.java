package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zr0 extends f2.u0 {
    public final /* synthetic */ tr0 a;

    public zr0(tr0 tr0Var) {
        this.a = tr0Var;
    }

    @Override // f2.u0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        if (!(view instanceof org.telegram.ui.Cells.q7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
        tr0 tr0Var = this.a;
        tr0Var.r.getClass();
        int R = RecyclerView.R(q7Var);
        int i10 = tr0Var.s.J;
        q7Var.U = R < i10;
        int i11 = R % i10;
        q7Var.S = i11 == 0;
        q7Var.T = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
