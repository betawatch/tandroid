package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ks0 extends s4.n0 {
    public final /* synthetic */ ds0 a;
    public final /* synthetic */ iv0 b;

    public ks0(iv0 iv0Var, ds0 ds0Var) {
        this.b = iv0Var;
        this.a = ds0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        ds0 ds0Var = this.a;
        if (ds0Var.h.getAdapter() == this.b.O) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            es0 es0Var = ds0Var.x;
            es0Var.B1();
            if (R <= es0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            rect.right = ds0Var.x.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.u7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
        ds0Var.h.getClass();
        int R2 = RecyclerView.R(u7Var);
        int i10 = ds0Var.x.J;
        u7Var.a0 = R2 < i10;
        int i11 = R2 % i10;
        u7Var.V = i11 == 0;
        u7Var.W = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
