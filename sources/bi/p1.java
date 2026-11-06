package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.pj0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class p1 extends f41 {
    public final /* synthetic */ w1 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(w1 w1Var, pj0 pj0Var, Context context, int i7, ai.e eVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(pj0Var, context, i7, 0, true, eVar, f6Var);
        this.P = w1Var;
    }

    @Override // org.telegram.ui.Components.f41, v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        super.t(d1Var, i7);
        View view = d1Var.a;
        if (view instanceof u1) {
            u1 u1Var = (u1) view;
            r1 r1Var = u1Var.w;
            boolean f12 = this.P.f1(r1Var);
            u1Var.c.f(f12, false);
            u1Var.r.a(f12, false);
            u1Var.setOnClickListener(new r(4, this, r1Var));
        }
    }
}
