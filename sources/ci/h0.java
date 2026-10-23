package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b71;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class h0 extends b71 {
    public final /* synthetic */ m2 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(m2 m2Var, ai.u1 u1Var, Context context, int i10, f0 f0Var, b bVar) {
        super(u1Var, context, i10, 0, false, f0Var, bVar);
        this.P = m2Var;
    }

    @Override // org.telegram.ui.Components.b71, s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        q0 q0Var;
        v0 v0Var;
        super.v(b1Var, i10);
        m2 m2Var = this.P;
        if (m2Var.y) {
            View view = b1Var.a;
            if ((view instanceof q0) && (v0Var = (q0Var = (q0) view).K) != null && v0Var.a == m2Var.x) {
                q0Var.b();
                m2Var.y = false;
            }
        }
    }

    @Override // org.telegram.ui.Components.b71, s4.g0
    public final void y(s4.b1 b1Var) {
        q0 q0Var;
        v0 v0Var;
        super.y(b1Var);
        m2 m2Var = this.P;
        if (m2Var.y) {
            View view = b1Var.a;
            if ((view instanceof q0) && (v0Var = (q0Var = (q0) view).K) != null && v0Var.a == m2Var.x) {
                q0Var.b();
                m2Var.y = false;
            }
        }
    }
}
