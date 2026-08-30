package gg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class u2 extends f2.u0 {
    public final /* synthetic */ v2 a;

    public u2(v2 v2Var) {
        this.a = v2Var;
    }

    @Override // f2.u0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        super.a(rect, view, recyclerView, i1Var);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        v2 v2Var = this.a;
        if (R == v2Var.d0.size()) {
            rect.bottom = v2Var.n0;
        }
    }
}
