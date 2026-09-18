package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class cs0 extends s4.n0 {
    public final /* synthetic */ vr0 a;
    public final /* synthetic */ zu0 b;

    public cs0(zu0 zu0Var, vr0 vr0Var) {
        this.b = zu0Var;
        this.a = vr0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        vr0 vr0Var = this.a;
        if (vr0Var.h.getAdapter() == this.b.O) {
            recyclerView.getClass();
            int S = RecyclerView.S(view);
            rect.left = 0;
            rect.bottom = 0;
            wr0 wr0Var = vr0Var.x;
            wr0Var.B1();
            if (S <= wr0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            rect.right = vr0Var.x.E1(S) ? 0 : AndroidUtilities.dp(2.0f);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.t7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        vr0Var.h.getClass();
        int S2 = RecyclerView.S(t7Var);
        int i10 = vr0Var.x.J;
        t7Var.a0 = S2 < i10;
        int i11 = S2 % i10;
        t7Var.V = i11 == 0;
        t7Var.W = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
