package kh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class r1 extends lh.g5 {
    public final /* synthetic */ g2 o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(g2 g2Var, Context context, int i10, long j10, f6 f6Var) {
        super(context, i10, j10, f6Var, null);
        this.o1 = g2Var;
    }

    @Override // lh.g5, org.telegram.ui.ActionBar.g3, org.telegram.ui.ActionBar.l2
    public final qc getBulletinFactory() {
        f6 f6Var;
        g2 g2Var = this.o1;
        org.telegram.ui.ActionBar.e3 e3Var = g2Var.container;
        f6Var = g2Var.resourcesProvider;
        return new qc(e3Var, f6Var);
    }
}
