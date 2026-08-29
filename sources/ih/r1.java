package ih;

import android.content.Context;
import org.telegram.ui.Components.tc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r1 extends e6 {
    public final /* synthetic */ h2 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(h2 h2Var, Context context, int i10, cg.n nVar, long j10, y0 y0Var) {
        super(context, i10, null, nVar, j10, y0Var, false, false);
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
