package mh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class c1 extends x51 {
    public final /* synthetic */ i1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(i1 i1Var, tl0 tl0Var, Context context, int i10, eg.p1 p1Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(tl0Var, context, i10, 0, true, p1Var, g6Var);
        this.K = i1Var;
    }

    @Override // org.telegram.ui.Components.x51, f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        super.v(m1Var, i10);
        View view = m1Var.a;
        if (view instanceof g1) {
            g1 g1Var = (g1) view;
            e1 e1Var = g1Var.v;
            boolean R = this.K.R(e1Var);
            g1Var.c.f(R, false);
            g1Var.r.a(R, false);
            g1Var.setOnClickListener(new dg.n(20, this, e1Var));
        }
    }
}
