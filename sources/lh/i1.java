package lh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class i1 extends e6 {
    public final /* synthetic */ g2 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(g2 g2Var, Context context, int i10, TL_stars.StarGift starGift, long j10, x0 x0Var, boolean z4, boolean z10) {
        super(context, i10, starGift, null, j10, x0Var, z4, z10);
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
