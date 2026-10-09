package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class dx extends s4.o0 {
    public final /* synthetic */ a00 a;

    public dx(a00 a00Var) {
        this.a = a00Var;
    }

    @Override // s4.o0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        a00 a00Var = this.a;
        s4.i0 adapter = a00Var.h0.getAdapter();
        ez ezVar = a00Var.n0;
        if (adapter == ezVar && R == ezVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            ezVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        fz fzVar = a00Var.i0;
        ezVar.getClass();
        rect.right = fzVar.E1(R) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
