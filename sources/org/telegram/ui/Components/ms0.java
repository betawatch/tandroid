package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ms0 extends s4.n0 {
    public final /* synthetic */ fs0 a;
    public final /* synthetic */ jv0 b;

    public ms0(jv0 jv0Var, fs0 fs0Var) {
        this.b = jv0Var;
        this.a = fs0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        fs0 fs0Var = this.a;
        if (fs0Var.h.getAdapter() == this.b.O) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            gs0 gs0Var = fs0Var.x;
            gs0Var.B1();
            if (R <= gs0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            rect.right = fs0Var.x.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
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
        fs0Var.h.getClass();
        int R2 = RecyclerView.R(t7Var);
        int i10 = fs0Var.x.J;
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
