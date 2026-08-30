package kh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i1 extends e6 {
    public final /* synthetic */ h2 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(h2 h2Var, Context context, int i10, TL_stars.StarGift starGift, long j10, x0 x0Var, boolean z4, boolean z10) {
        super(context, i10, starGift, null, j10, x0Var, z4, z10);
        this.u0 = h2Var;
    }

    @Override // kh.e6
    public final qc X() {
        org.telegram.ui.ActionBar.f6 f6Var;
        h2 h2Var = this.u0;
        org.telegram.ui.ActionBar.e3 e3Var = h2Var.container;
        f6Var = h2Var.resourcesProvider;
        return new qc(e3Var, f6Var);
    }
}
