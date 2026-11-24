// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class h04 extends e69 {
    public final /* synthetic */ e34 a;

    public h04(e34 e34Var) {
        this.a = e34Var;
    }

    @Override // e69
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        int R = RecyclerView.R(view);
        e34 e34Var = this.a;
        y59 adapter = e34Var.i0.getAdapter();
        j24 j24Var = e34Var.o0;
        if (adapter == j24Var && R == j24Var.J) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            j24Var.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = gm.L(2.0f);
        k24 k24Var = e34Var.j0;
        j24Var.getClass();
        rect.right = k24Var.C1(R) ? 0 : gm.L(2.0f);
    }
}
