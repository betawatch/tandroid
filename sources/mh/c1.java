package mh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class c1 extends w51 {
    public final /* synthetic */ i1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(i1 i1Var, sl0 sl0Var, Context context, int i10, eg.p1 p1Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(sl0Var, context, i10, 0, true, p1Var, g6Var);
        this.K = i1Var;
    }

    @Override // org.telegram.ui.Components.w51, f2.p0
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
