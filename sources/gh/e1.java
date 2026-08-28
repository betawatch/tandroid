package gh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e1 extends z41 {
    public final /* synthetic */ l1 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(l1 l1Var, wk0 wk0Var, Context context, int i9, bh.c cVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(wk0Var, context, i9, 0, true, cVar, b6Var);
        this.J = l1Var;
    }

    @Override // org.telegram.ui.Components.z41, f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        super.v(q1Var, i9);
        View view = q1Var.a;
        if (view instanceof j1) {
            j1 j1Var = (j1) view;
            g1 g1Var = j1Var.v;
            boolean Q = this.J.Q(g1Var);
            j1Var.c.f(Q, false);
            j1Var.r.a(Q, false);
            j1Var.setOnClickListener(new bg.u1(16, this, g1Var));
        }
    }
}
