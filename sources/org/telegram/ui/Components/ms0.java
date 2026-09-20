package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ms0 extends s4.n0 {
    public final /* synthetic */ fs0 a;
    public final /* synthetic */ jv0 b;

    public ms0(jv0 jv0Var, fs0 fs0Var) {
        this.b = jv0Var;
        this.a = fs0Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        fs0 fs0Var = this.a;
        if (fs0Var.h.getAdapter() == this.b.O) {
            recyclerView.getClass();
            int S = RecyclerView.S(view);
            rect.left = 0;
            rect.bottom = 0;
            gs0 gs0Var = fs0Var.x;
            gs0Var.B1();
            if (S <= gs0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            rect.right = fs0Var.x.E1(S) ? 0 : AndroidUtilities.dp(2.0f);
            return;
        }
        if (!(view instanceof org.telegram.ui.Cells.u7)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
        fs0Var.h.getClass();
        int S2 = RecyclerView.S(u7Var);
        int i10 = fs0Var.x.J;
        u7Var.a0 = S2 < i10;
        int i11 = S2 % i10;
        u7Var.V = i11 == 0;
        u7Var.W = i11 == i10 - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
