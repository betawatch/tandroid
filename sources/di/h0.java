package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j71;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class h0 extends j71 {
    public final /* synthetic */ m2 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(m2 m2Var, bi.r1 r1Var, Context context, int i10, f0 f0Var, b bVar) {
        super(r1Var, context, i10, 0, false, f0Var, bVar);
        this.P = m2Var;
    }

    @Override // org.telegram.ui.Components.j71, s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        q0 q0Var;
        v0 v0Var;
        super.v(e1Var, i10);
        m2 m2Var = this.P;
        if (m2Var.y) {
            View view = e1Var.a;
            if ((view instanceof q0) && (v0Var = (q0Var = (q0) view).K) != null && v0Var.a == m2Var.x) {
                q0Var.c();
                m2Var.y = false;
            }
        }
    }

    @Override // org.telegram.ui.Components.j71, s4.h0
    public final void y(s4.e1 e1Var) {
        q0 q0Var;
        v0 v0Var;
        super.y(e1Var);
        m2 m2Var = this.P;
        if (m2Var.y) {
            View view = e1Var.a;
            if ((view instanceof q0) && (v0Var = (q0Var = (q0) view).K) != null && v0Var.a == m2Var.x) {
                q0Var.c();
                m2Var.y = false;
            }
        }
    }
}
