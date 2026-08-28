package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hr0 extends f2.y0 {
    public final /* synthetic */ ar0 a;
    public final /* synthetic */ eu0 b;

    public hr0(eu0 eu0Var, ar0 ar0Var) {
        this.b = eu0Var;
        this.a = ar0Var;
    }

    @Override // f2.y0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        ar0 ar0Var = this.a;
        if (ar0Var.h.getAdapter() == this.b.K) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            br0 br0Var = ar0Var.x;
            br0Var.B1();
            if (R <= br0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            rect.right = ar0Var.x.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.r7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
        ar0Var.h.getClass();
        int R2 = RecyclerView.R(r7Var);
        int i9 = ar0Var.x.J;
        r7Var.T = R2 < i9;
        int i10 = R2 % i9;
        r7Var.R = i10 == 0;
        r7Var.S = i10 == i9 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
