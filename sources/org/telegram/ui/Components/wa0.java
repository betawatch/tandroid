package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class wa0 extends s4.n0 {
    public final /* synthetic */ xa0 a;

    public wa0(xa0 xa0Var) {
        this.a = xa0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int S;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.o0 layoutManager = recyclerView.getLayoutManager();
        ya0 ya0Var = this.a.b3;
        if (layoutManager != ya0Var.d || (S = RecyclerView.S(view)) == 0 || ya0Var.f.N()) {
            return;
        }
        if (ya0Var.f.I() == null && ya0Var.f.U == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (S == 0) {
                return;
            }
            S--;
            ra0 ra0Var = ya0Var.d;
            ra0Var.B1();
            if (S > ra0Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = ya0Var.d.E1(S) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
