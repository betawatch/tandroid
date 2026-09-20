package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ta0 extends s4.n0 {
    public final /* synthetic */ ua0 a;

    public ta0(ua0 ua0Var) {
        this.a = ua0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int S;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.o0 layoutManager = recyclerView.getLayoutManager();
        va0 va0Var = this.a.b3;
        if (layoutManager != va0Var.d || (S = RecyclerView.S(view)) == 0 || va0Var.f.N()) {
            return;
        }
        if (va0Var.f.I() == null && va0Var.f.U == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (S == 0) {
                return;
            }
            S--;
            oa0 oa0Var = va0Var.d;
            oa0Var.B1();
            if (S > oa0Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = va0Var.d.E1(S) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
