package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ir0 extends f2.w0 {
    public final /* synthetic */ br0 a;
    public final /* synthetic */ hu0 b;

    public ir0(hu0 hu0Var, br0 br0Var) {
        this.b = hu0Var;
        this.a = br0Var;
    }

    @Override // f2.w0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        br0 br0Var = this.a;
        if (br0Var.h.getAdapter() == this.b.K) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            cr0 cr0Var = br0Var.x;
            cr0Var.B1();
            if (R <= cr0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            rect.right = br0Var.x.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.o7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
        br0Var.h.getClass();
        int R2 = RecyclerView.R(o7Var);
        int i10 = br0Var.x.J;
        o7Var.T = R2 < i10;
        int i11 = R2 % i10;
        o7Var.R = i11 == 0;
        o7Var.S = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
