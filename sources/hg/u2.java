package hg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
