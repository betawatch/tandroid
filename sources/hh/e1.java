package hh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e1 extends b51 {
    public final /* synthetic */ l1 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(l1 l1Var, zk0 zk0Var, Context context, int i10, ch.c cVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(zk0Var, context, i10, 0, true, cVar, c6Var);
        this.J = l1Var;
    }

    @Override // org.telegram.ui.Components.b51, f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        super.v(o1Var, i10);
        View view = o1Var.a;
        if (view instanceof j1) {
            j1 j1Var = (j1) view;
            g1 g1Var = j1Var.v;
            boolean R = this.J.R(g1Var);
            j1Var.c.f(R, false);
            j1Var.r.a(R, false);
            j1Var.setOnClickListener(new ag.q0(17, this, g1Var));
        }
    }
}
