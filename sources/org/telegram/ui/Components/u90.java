package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u90 extends f2.y0 {
    public final /* synthetic */ v90 a;

    public u90(v90 v90Var) {
        this.a = v90Var;
    }

    @Override // f2.y0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        int R;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        f2.z0 layoutManager = recyclerView.getLayoutManager();
        w90 w90Var = this.a.X2;
        if (layoutManager != w90Var.d || (R = RecyclerView.R(view)) == 0 || w90Var.f.N()) {
            return;
        }
        if (w90Var.f.I() == null && w90Var.f.Q == null) {
            rect.top = AndroidUtilities.dp(2.0f);
        } else {
            if (R == 0) {
                return;
            }
            R--;
            p90 p90Var = w90Var.d;
            p90Var.B1();
            if (R > p90Var.U) {
                rect.top = AndroidUtilities.dp(2.0f);
            }
        }
        rect.right = w90Var.d.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
