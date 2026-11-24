// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class h6a extends k69 {
    public final /* synthetic */ hy1 a;

    public h6a(hy1 hy1Var) {
        this.a = hy1Var;
    }

    @Override // k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        hy1 hy1Var = this.a;
        View view = hy1Var.u;
        boolean z = hy1Var.w.H0() != 0;
        Boolean bool = hy1Var.x;
        if (bool == null || z != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z ? 1.0f : 0.0f).setDuration(150L).start();
            hy1Var.x = Boolean.valueOf(z);
        }
    }
}
