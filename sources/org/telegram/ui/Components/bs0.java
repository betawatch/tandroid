package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class bs0 extends s4.n0 {
    public final /* synthetic */ ur0 a;
    public final /* synthetic */ yu0 b;

    public bs0(yu0 yu0Var, ur0 ur0Var) {
        this.b = yu0Var;
        this.a = ur0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        ur0 ur0Var = this.a;
        if (ur0Var.h.getAdapter() == this.b.O) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            vr0 vr0Var = ur0Var.x;
            vr0Var.B1();
            if (R <= vr0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            rect.right = ur0Var.x.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
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
        ur0Var.h.getClass();
        int R2 = RecyclerView.R(t7Var);
        int i10 = ur0Var.x.J;
        t7Var.a0 = R2 < i10;
        int i11 = R2 % i10;
        t7Var.V = i11 == 0;
        t7Var.W = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
