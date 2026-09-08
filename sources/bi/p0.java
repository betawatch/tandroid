package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class p0 extends v51 {
    public final /* synthetic */ e3 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(e3 e3Var, o0 o0Var, Context context, int i10, m0 m0Var, b bVar) {
        super(o0Var, context, i10, 0, false, m0Var, bVar);
        this.N = e3Var;
    }

    @Override // org.telegram.ui.Components.v51, s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        z0 z0Var;
        e1 e1Var;
        super.v(c1Var, i10);
        e3 e3Var = this.N;
        if (e3Var.y) {
            View view = c1Var.a;
            if ((view instanceof z0) && (e1Var = (z0Var = (z0) view).K) != null && e1Var.a == e3Var.x) {
                z0Var.b();
                e3Var.y = false;
            }
        }
    }

    @Override // org.telegram.ui.Components.v51, s4.h0
    public final void y(s4.c1 c1Var) {
        z0 z0Var;
        e1 e1Var;
        super.y(c1Var);
        e3 e3Var = this.N;
        if (e3Var.y) {
            View view = c1Var.a;
            if ((view instanceof z0) && (e1Var = (z0Var = (z0) view).K) != null && e1Var.a == e3Var.x) {
                z0Var.b();
                e3Var.y = false;
            }
        }
    }
}
