package jh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class d1 extends k51 {
    public final /* synthetic */ j1 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(j1 j1Var, jl0 jl0Var, Context context, int i10, bg.t1 t1Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(jl0Var, context, i10, 0, true, t1Var, c6Var);
        this.J = j1Var;
    }

    @Override // org.telegram.ui.Components.k51, f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        super.v(n1Var, i10);
        View view = n1Var.a;
        if (view instanceof h1) {
            h1 h1Var = (h1) view;
            f1 f1Var = h1Var.v;
            boolean R = this.J.R(f1Var);
            h1Var.c.f(R, false);
            h1Var.r.a(R, false);
            h1Var.setOnClickListener(new ag.n(20, this, f1Var));
        }
    }
}
