package ih;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.tc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j1 extends e6 {
    public final /* synthetic */ h2 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(h2 h2Var, Context context, int i10, TL_stars.StarGift starGift, long j10, y0 y0Var, boolean z10, boolean z11) {
        super(context, i10, starGift, null, j10, y0Var, z10, z11);
        this.t0 = h2Var;
    }

    @Override // ih.e6
    public final tc X() {
        org.telegram.ui.ActionBar.c6 c6Var;
        h2 h2Var = this.t0;
        org.telegram.ui.ActionBar.d3 d3Var = h2Var.container;
        c6Var = h2Var.resourcesProvider;
        return new tc(d3Var, c6Var);
    }
}
