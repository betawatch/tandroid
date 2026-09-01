package lh;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class q1 extends e6 {
    public final /* synthetic */ g2 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(g2 g2Var, Context context, int i10, fg.n nVar, long j10, x0 x0Var) {
        super(context, i10, null, nVar, j10, x0Var, false, false);
        this.u0 = g2Var;
    }

    @Override // lh.e6
    public final qc X() {
        g6 g6Var;
        g2 g2Var = this.u0;
        org.telegram.ui.ActionBar.f3 f3Var = g2Var.container;
        g6Var = g2Var.resourcesProvider;
        return new qc(f3Var, g6Var);
    }
}
