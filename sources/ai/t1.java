package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class t1 extends b71 {
    public final /* synthetic */ a2 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(a2 a2Var, mm0 mm0Var, Context context, int i10, q qVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(mm0Var, context, i10, 0, true, qVar, g6Var);
        this.P = a2Var;
    }

    @Override // org.telegram.ui.Components.b71, s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        super.v(b1Var, i10);
        View view = b1Var.a;
        if (view instanceof y1) {
            y1 y1Var = (y1) view;
            v1 v1Var = y1Var.v;
            boolean S = this.P.S(v1Var);
            y1Var.c.f(S, false);
            y1Var.r.a(S, false);
            y1Var.setOnClickListener(new p(4, this, v1Var));
        }
    }
}
