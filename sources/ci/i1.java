package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i1 extends f41 {
    public final /* synthetic */ p1 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(p1 p1Var, tj0 tj0Var, Context context, int i3, ai.c cVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(tj0Var, context, i3, 0, true, cVar, e6Var);
        this.Q = p1Var;
    }

    @Override // org.telegram.ui.Components.f41, u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        super.t(d1Var, i3);
        View view = d1Var.a;
        if (view instanceof n1) {
            n1 n1Var = (n1) view;
            k1 k1Var = n1Var.w;
            boolean f12 = this.Q.f1(k1Var);
            n1Var.c.f(f12, false);
            n1Var.r.a(f12, false);
            n1Var.setOnClickListener(new ai.d(9, this, k1Var));
        }
    }
}
