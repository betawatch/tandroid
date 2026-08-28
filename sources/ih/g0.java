package ih;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class g0 extends z41 {
    public final /* synthetic */ h2 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h2 h2Var, gh.f1 f1Var, Context context, int i9, e0 e0Var, b bVar) {
        super(f1Var, context, i9, 0, false, e0Var, bVar);
        this.J = h2Var;
    }

    @Override // org.telegram.ui.Components.z41, f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        p0 p0Var;
        u0 u0Var;
        super.v(q1Var, i9);
        h2 h2Var = this.J;
        if (h2Var.y) {
            View view = q1Var.a;
            if ((view instanceof p0) && (u0Var = (p0Var = (p0) view).G) != null && u0Var.a == h2Var.x) {
                p0Var.c();
                h2Var.y = false;
            }
        }
    }

    @Override // org.telegram.ui.Components.z41, f2.r0
    public final void y(f2.q1 q1Var) {
        p0 p0Var;
        u0 u0Var;
        super.y(q1Var);
        h2 h2Var = this.J;
        if (h2Var.y) {
            View view = q1Var.a;
            if ((view instanceof p0) && (u0Var = (p0Var = (p0) view).G) != null && u0Var.a == h2Var.x) {
                p0Var.c();
                h2Var.y = false;
            }
        }
    }
}
