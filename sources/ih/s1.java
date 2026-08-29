package ih;

import android.content.Context;
import org.telegram.ui.Components.tc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s1 extends jh.h5 {
    public final /* synthetic */ h2 n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(h2 h2Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, j10, c6Var, null);
        this.n1 = h2Var;
    }

    @Override // jh.h5, org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.k2
    public final tc getBulletinFactory() {
        org.telegram.ui.ActionBar.c6 c6Var;
        h2 h2Var = this.n1;
        org.telegram.ui.ActionBar.d3 d3Var = h2Var.container;
        c6Var = h2Var.resourcesProvider;
        return new tc(d3Var, c6Var);
    }
}
