package bg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f3 extends f2.y0 {
    public final /* synthetic */ g3 a;

    public f3(g3 g3Var) {
        this.a = g3Var;
    }

    @Override // f2.y0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        super.a(rect, view, recyclerView, n1Var);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        g3 g3Var = this.a;
        if (R == g3Var.c0.size()) {
            rect.bottom = g3Var.m0;
        }
    }
}
