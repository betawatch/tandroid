package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a71;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class p0 extends a71 {
    public final /* synthetic */ h3 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(h3 h3Var, o0 o0Var, Context context, int i10, m0 m0Var, b bVar) {
        super(o0Var, context, i10, 0, false, m0Var, bVar);
        this.N = h3Var;
    }

    @Override // org.telegram.ui.Components.a71, s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        z0 z0Var;
        e1 e1Var;
        super.v(b1Var, i10);
        h3 h3Var = this.N;
        if (h3Var.y) {
            View view = b1Var.a;
            if ((view instanceof z0) && (e1Var = (z0Var = (z0) view).K) != null && e1Var.a == h3Var.x) {
                z0Var.b();
                h3Var.y = false;
            }
        }
    }

    @Override // org.telegram.ui.Components.a71, s4.g0
    public final void y(s4.b1 b1Var) {
        z0 z0Var;
        e1 e1Var;
        super.y(b1Var);
        h3 h3Var = this.N;
        if (h3Var.y) {
            View view = b1Var.a;
            if ((view instanceof z0) && (e1Var = (z0Var = (z0) view).K) != null && e1Var.a == h3Var.x) {
                z0Var.b();
                h3Var.y = false;
            }
        }
    }
}
