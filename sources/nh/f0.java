package nh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class f0 extends w51 {
    public final /* synthetic */ g2 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g2 g2Var, lh.e1 e1Var, Context context, int i10, d0 d0Var, b bVar) {
        super(e1Var, context, i10, 0, false, d0Var, bVar);
        this.K = g2Var;
    }

    @Override // org.telegram.ui.Components.w51, f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        o0 o0Var;
        t0 t0Var;
        super.v(l1Var, i10);
        g2 g2Var = this.K;
        if (g2Var.y) {
            View view = l1Var.a;
            if ((view instanceof o0) && (t0Var = (o0Var = (o0) view).H) != null && t0Var.a == g2Var.x) {
                o0Var.c();
                g2Var.y = false;
            }
        }
    }

    @Override // org.telegram.ui.Components.w51, f2.o0
    public final void y(f2.l1 l1Var) {
        o0 o0Var;
        t0 t0Var;
        super.y(l1Var);
        g2 g2Var = this.K;
        if (g2Var.y) {
            View view = l1Var.a;
            if ((view instanceof o0) && (t0Var = (o0Var = (o0) view).H) != null && t0Var.a == g2Var.x) {
                o0Var.c();
                g2Var.y = false;
            }
        }
    }
}
