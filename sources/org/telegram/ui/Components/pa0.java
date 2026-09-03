package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class pa0 extends f2.v0 {
    public final /* synthetic */ qa0 a;

    public pa0(qa0 qa0Var) {
        this.a = qa0Var;
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.j1 j1Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        f2.w0 layoutManager = recyclerView.getLayoutManager();
        ra0 ra0Var = this.a.Y2;
        if (layoutManager != ra0Var.d || (R = RecyclerView.R(view)) == 0 || ra0Var.f.N()) {
            return;
        }
        if (ra0Var.f.I() == null && ra0Var.f.R == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            ka0 ka0Var = ra0Var.d;
            ka0Var.B1();
            if (R > ka0Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = ra0Var.d.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
