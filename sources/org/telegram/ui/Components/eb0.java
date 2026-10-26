package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class eb0 extends s4.n0 {
    public final /* synthetic */ fb0 a;

    public eb0(fb0 fb0Var) {
        this.a = fb0Var;
    }

    @Override // s4.n0
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.p0 layoutManager = recyclerView.getLayoutManager();
        gb0 gb0Var = this.a.j3;
        if (layoutManager != gb0Var.d || (R = RecyclerView.R(view)) == 0 || gb0Var.f.N()) {
            return;
        }
        if (gb0Var.f.I() == null && gb0Var.f.U == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            za0 za0Var = gb0Var.d;
            za0Var.C1();
            if (R > za0Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = gb0Var.d.F1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
