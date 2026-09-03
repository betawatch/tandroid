package kh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class q1 extends d6 {
    public final /* synthetic */ g2 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(g2 g2Var, Context context, int i10, eg.n nVar, long j10, x0 x0Var) {
        super(context, i10, null, nVar, j10, x0Var, false, false);
        this.u0 = g2Var;
    }

    @Override // kh.d6
    public final qc X() {
        f6 f6Var;
        g2 g2Var = this.u0;
        org.telegram.ui.ActionBar.e3 e3Var = g2Var.container;
        f6Var = g2Var.resourcesProvider;
        return new qc(e3Var, f6Var);
    }
}
