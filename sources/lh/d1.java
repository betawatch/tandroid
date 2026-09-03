package lh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class d1 extends w51 {
    public final /* synthetic */ j1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(j1 j1Var, rl0 rl0Var, Context context, int i10, dg.r1 r1Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(rl0Var, context, i10, 0, true, r1Var, f6Var);
        this.K = j1Var;
    }

    @Override // org.telegram.ui.Components.w51, f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        super.v(l1Var, i10);
        View view = l1Var.a;
        if (view instanceof h1) {
            h1 h1Var = (h1) view;
            f1 f1Var = h1Var.v;
            boolean R = this.K.R(f1Var);
            h1Var.c.f(R, false);
            h1Var.r.a(R, false);
            h1Var.setOnClickListener(new cg.n(20, this, f1Var));
        }
    }
}
