package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b1 extends p41 {
    public final /* synthetic */ i1 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(i1 i1Var, uj0 uj0Var, Context context, int i7, bi.b bVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(uj0Var, context, i7, 0, true, bVar, e6Var);
        this.Q = i1Var;
    }

    @Override // org.telegram.ui.Components.p41, v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        super.t(e1Var, i7);
        View view = e1Var.a;
        if (view instanceof g1) {
            g1 g1Var = (g1) view;
            d1 d1Var = g1Var.w;
            boolean f12 = this.Q.f1(d1Var);
            g1Var.c.f(f12, false);
            g1Var.r.a(f12, false);
            g1Var.setOnClickListener(new ai.v2(11, this, d1Var));
        }
    }
}
