package jh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b51;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class e0 extends b51 {
    public final /* synthetic */ g2 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g2 g2Var, hh.f1 f1Var, Context context, int i10, c0 c0Var, b bVar) {
        super(f1Var, context, i10, 0, false, c0Var, bVar);
        this.J = g2Var;
    }

    @Override // org.telegram.ui.Components.b51, f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        n0 n0Var;
        s0 s0Var;
        super.v(o1Var, i10);
        g2 g2Var = this.J;
        if (g2Var.y) {
            View view = o1Var.a;
            if ((view instanceof n0) && (s0Var = (n0Var = (n0) view).G) != null && s0Var.a == g2Var.x) {
                n0Var.b();
                g2Var.y = false;
            }
        }
    }

    @Override // org.telegram.ui.Components.b51, f2.q0
    public final void y(f2.o1 o1Var) {
        n0 n0Var;
        s0 s0Var;
        super.y(o1Var);
        g2 g2Var = this.J;
        if (g2Var.y) {
            View view = o1Var.a;
            if ((view instanceof n0) && (s0Var = (n0Var = (n0) view).G) != null && s0Var.a == g2Var.x) {
                n0Var.b();
                g2Var.y = false;
            }
        }
    }
}
