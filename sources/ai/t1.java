package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class t1 extends t61 {
    public final /* synthetic */ a2 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(a2 a2Var, im0 im0Var, Context context, int i10, q qVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(im0Var, context, i10, 0, true, qVar, d6Var);
        this.N = a2Var;
    }

    @Override // org.telegram.ui.Components.t61, s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        super.v(b1Var, i10);
        View view = b1Var.a;
        if (view instanceof y1) {
            y1 y1Var = (y1) view;
            v1 v1Var = y1Var.v;
            boolean S = this.N.S(v1Var);
            y1Var.c.f(S, false);
            y1Var.r.a(S, false);
            y1Var.setOnClickListener(new p(4, this, v1Var));
        }
    }
}
