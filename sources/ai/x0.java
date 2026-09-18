package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.l61;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class x0 extends l61 {
    public final /* synthetic */ r3 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(r3 r3Var, w0 w0Var, Context context, int i10, t0 t0Var, d dVar) {
        super(w0Var, context, i10, 0, false, t0Var, dVar);
        this.N = r3Var;
    }

    @Override // org.telegram.ui.Components.l61, s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        h1 h1Var;
        m1 m1Var;
        super.v(c1Var, i10);
        r3 r3Var = this.N;
        if (r3Var.y) {
            View view = c1Var.a;
            if ((view instanceof h1) && (m1Var = (h1Var = (h1) view).K) != null && m1Var.a == r3Var.x) {
                h1Var.c();
                r3Var.y = false;
            }
        }
    }

    @Override // org.telegram.ui.Components.l61, s4.h0
    public final void y(s4.c1 c1Var) {
        h1 h1Var;
        m1 m1Var;
        super.y(c1Var);
        r3 r3Var = this.N;
        if (r3Var.y) {
            View view = c1Var.a;
            if ((view instanceof h1) && (m1Var = (h1Var = (h1) view).K) != null && m1Var.a == r3Var.x) {
                h1Var.c();
                r3Var.y = false;
            }
        }
    }
}
