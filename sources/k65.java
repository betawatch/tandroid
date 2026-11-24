// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k65 extends e69 {
    public final /* synthetic */ g95 a;

    public k65(g95 g95Var) {
        this.a = g95Var;
    }

    @Override // e69
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            b95 b95Var = this.a.I1;
            int i = b95Var.H;
            if (R < i || R >= b95Var.I) {
                return;
            }
            int i2 = R - i;
            int i3 = g95.u5 ? 6 : 2;
            int i4 = i2 % i3;
            if (i4 == 0) {
                rect.right = gm.L(2.0f);
            } else if (i4 == i3 - 1) {
                rect.left = gm.L(2.0f);
            } else {
                rect.left = gm.L(1.0f);
            }
        }
    }
}
