package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class q1 extends j71 {
    public final /* synthetic */ x1 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(x1 x1Var, mm0 mm0Var, Context context, int i10, ai.e eVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(mm0Var, context, i10, 0, true, eVar, u6Var);
        this.P = x1Var;
    }

    @Override // org.telegram.ui.Components.j71, s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        super.v(e1Var, i10);
        View view = e1Var.a;
        if (view instanceof v1) {
            v1 v1Var = (v1) view;
            s1 s1Var = v1Var.v;
            boolean S = this.P.S(s1Var);
            v1Var.c.f(S, false);
            v1Var.r.a(S, false);
            v1Var.setOnClickListener(new q(4, this, s1Var));
        }
    }
}
