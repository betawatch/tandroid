package lh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.k51;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class e0 extends k51 {
    public final /* synthetic */ f2 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f2 f2Var, jh.e1 e1Var, Context context, int i10, c0 c0Var, b bVar) {
        super(e1Var, context, i10, 0, false, c0Var, bVar);
        this.J = f2Var;
    }

    @Override // org.telegram.ui.Components.k51, f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        n0 n0Var;
        s0 s0Var;
        super.v(n1Var, i10);
        f2 f2Var = this.J;
        if (f2Var.y) {
            View view = n1Var.a;
            if ((view instanceof n0) && (s0Var = (n0Var = (n0) view).G) != null && s0Var.a == f2Var.x) {
                n0Var.c();
                f2Var.y = false;
            }
        }
    }

    @Override // org.telegram.ui.Components.k51, f2.p0
    public final void y(f2.n1 n1Var) {
        n0 n0Var;
        s0 s0Var;
        super.y(n1Var);
        f2 f2Var = this.J;
        if (f2Var.y) {
            View view = n1Var.a;
            if ((view instanceof n0) && (s0Var = (n0Var = (n0) view).G) != null && s0Var.a == f2Var.x) {
                n0Var.c();
                f2Var.y = false;
            }
        }
    }
}
