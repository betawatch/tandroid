package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ia0 extends f2.v0 {
    public final /* synthetic */ ja0 a;

    public ia0(ja0 ja0Var) {
        this.a = ja0Var;
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        f2.w0 layoutManager = recyclerView.getLayoutManager();
        ka0 ka0Var = this.a.X2;
        if (layoutManager != ka0Var.d || (R = RecyclerView.R(view)) == 0 || ka0Var.f.N()) {
            return;
        }
        if (ka0Var.f.I() == null && ka0Var.f.Q == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            da0 da0Var = ka0Var.d;
            da0Var.B1();
            if (R > da0Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = ka0Var.d.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
