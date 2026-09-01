package oh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class e0 extends x51 {
    public final /* synthetic */ h2 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h2 h2Var, mh.d1 d1Var, Context context, int i10, c0 c0Var, b bVar) {
        super(d1Var, context, i10, 0, false, c0Var, bVar);
        this.K = h2Var;
    }

    @Override // org.telegram.ui.Components.x51, f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        o0 o0Var;
        t0 t0Var;
        super.v(m1Var, i10);
        h2 h2Var = this.K;
        if (h2Var.y) {
            View view = m1Var.a;
            if ((view instanceof o0) && (t0Var = (o0Var = (o0) view).H) != null && t0Var.a == h2Var.x) {
                o0Var.c();
                h2Var.y = false;
            }
        }
    }

    @Override // org.telegram.ui.Components.x51, f2.p0
    public final void y(f2.m1 m1Var) {
        o0 o0Var;
        t0 t0Var;
        super.y(m1Var);
        h2 h2Var = this.K;
        if (h2Var.y) {
            View view = m1Var.a;
            if ((view instanceof o0) && (t0Var = (o0Var = (o0) view).H) != null && t0Var.a == h2Var.x) {
                o0Var.c();
                h2Var.y = false;
            }
        }
    }
}
