package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class h0 extends s61 {
    public final /* synthetic */ n2 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(n2 n2Var, ai.u1 u1Var, Context context, int i10, f0 f0Var, b bVar) {
        super(u1Var, context, i10, 0, false, f0Var, bVar);
        this.N = n2Var;
    }

    @Override // org.telegram.ui.Components.s61, s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        q0 q0Var;
        v0 v0Var;
        super.v(b1Var, i10);
        n2 n2Var = this.N;
        if (n2Var.y) {
            View view = b1Var.a;
            if ((view instanceof q0) && (v0Var = (q0Var = (q0) view).K) != null && v0Var.a == n2Var.x) {
                q0Var.b();
                n2Var.y = false;
            }
        }
    }

    @Override // org.telegram.ui.Components.s61, s4.g0
    public final void y(s4.b1 b1Var) {
        q0 q0Var;
        v0 v0Var;
        super.y(b1Var);
        n2 n2Var = this.N;
        if (n2Var.y) {
            View view = b1Var.a;
            if ((view instanceof q0) && (v0Var = (q0Var = (q0) view).K) != null && v0Var.a == n2Var.x) {
                q0Var.b();
                n2Var.y = false;
            }
        }
    }
}
