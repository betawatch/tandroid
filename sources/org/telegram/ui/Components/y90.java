package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class y90 extends f2.w0 {
    public final /* synthetic */ z90 a;

    public y90(z90 z90Var) {
        this.a = z90Var;
    }

    @Override // f2.w0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        f2.x0 layoutManager = recyclerView.getLayoutManager();
        aa0 aa0Var = this.a.X2;
        if (layoutManager != aa0Var.d || (R = RecyclerView.R(view)) == 0 || aa0Var.f.N()) {
            return;
        }
        if (aa0Var.f.I() == null && aa0Var.f.Q == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            t90 t90Var = aa0Var.d;
            t90Var.B1();
            if (R > t90Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = aa0Var.d.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
