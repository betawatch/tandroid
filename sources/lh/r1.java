package lh;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class r1 extends mh.g5 {
    public final /* synthetic */ g2 o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(g2 g2Var, Context context, int i10, long j10, g6 g6Var) {
        super(context, i10, j10, g6Var, null);
        this.o1 = g2Var;
    }

    @Override // mh.g5, org.telegram.ui.ActionBar.h3, org.telegram.ui.ActionBar.l2
    public final qc getBulletinFactory() {
        g6 g6Var;
        g2 g2Var = this.o1;
        org.telegram.ui.ActionBar.f3 f3Var = g2Var.container;
        g6Var = g2Var.resourcesProvider;
        return new qc(f3Var, g6Var);
    }
}
