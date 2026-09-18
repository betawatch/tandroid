package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ua0 extends s4.n0 {
    public final /* synthetic */ va0 a;

    public ua0(va0 va0Var) {
        this.a = va0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int S;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.o0 layoutManager = recyclerView.getLayoutManager();
        wa0 wa0Var = this.a.b3;
        if (layoutManager != wa0Var.d || (S = RecyclerView.S(view)) == 0 || wa0Var.f.N()) {
            return;
        }
        if (wa0Var.f.I() == null && wa0Var.f.U == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (S == 0) {
                return;
            }
            S--;
            pa0 pa0Var = wa0Var.d;
            pa0Var.B1();
            if (S > pa0Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = wa0Var.d.E1(S) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
