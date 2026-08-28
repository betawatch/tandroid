package fh;

import android.content.Context;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x1 extends u6 {
    public final /* synthetic */ p2 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(p2 p2Var, Context context, int i9, zf.k kVar, long j10, c1 c1Var) {
        super(context, i9, null, kVar, j10, c1Var, false, false);
        this.t0 = p2Var;
    }

    @Override // fh.u6
    public final oc W() {
        org.telegram.ui.ActionBar.b6 b6Var;
        p2 p2Var = this.t0;
        org.telegram.ui.ActionBar.d3 d3Var = p2Var.container;
        b6Var = p2Var.resourcesProvider;
        return new oc(d3Var, b6Var);
    }
}
