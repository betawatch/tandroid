package eg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v2 extends f2.v0 {
    public final /* synthetic */ w2 a;

    public v2(w2 w2Var) {
        this.a = w2Var;
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        super.a(rect, view, recyclerView, k1Var);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        w2 w2Var = this.a;
        if (R == w2Var.c0.size()) {
            rect.bottom = w2Var.m0;
        }
    }
}
