package hg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class u2 extends f2.v0 {
    public final /* synthetic */ v2 a;

    public u2(v2 v2Var) {
        this.a = v2Var;
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.j1 j1Var) {
        super.a(rect, view, recyclerView, j1Var);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        v2 v2Var = this.a;
        if (R == v2Var.d0.size()) {
            rect.bottom = v2Var.n0;
        }
    }
}
