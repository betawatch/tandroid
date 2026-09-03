package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class oa0 extends f2.u0 {
    public final /* synthetic */ pa0 a;

    public oa0(pa0 pa0Var) {
        this.a = pa0Var;
    }

    @Override // f2.u0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        f2.v0 layoutManager = recyclerView.getLayoutManager();
        qa0 qa0Var = this.a.Y2;
        if (layoutManager != qa0Var.d || (R = RecyclerView.R(view)) == 0 || qa0Var.f.N()) {
            return;
        }
        if (qa0Var.f.I() == null && qa0Var.f.R == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            ja0 ja0Var = qa0Var.d;
            ja0Var.B1();
            if (R > ja0Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = qa0Var.d.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
