package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class va0 extends s4.n0 {
    public final /* synthetic */ wa0 a;

    public va0(wa0 wa0Var) {
        this.a = wa0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.o0 layoutManager = recyclerView.getLayoutManager();
        xa0 xa0Var = this.a.b3;
        if (layoutManager != xa0Var.d || (R = RecyclerView.R(view)) == 0 || xa0Var.f.N()) {
            return;
        }
        if (xa0Var.f.I() == null && xa0Var.f.U == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            qa0 qa0Var = xa0Var.d;
            qa0Var.B1();
            if (R > qa0Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = xa0Var.d.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
