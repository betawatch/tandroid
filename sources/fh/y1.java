package fh;

import android.content.Context;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y1 extends gh.k5 {
    public final /* synthetic */ p2 n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(p2 p2Var, Context context, int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, j10, b6Var, null);
        this.n1 = p2Var;
    }

    @Override // gh.k5, org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.k2
    public final oc getBulletinFactory() {
        org.telegram.ui.ActionBar.b6 b6Var;
        p2 p2Var = this.n1;
        org.telegram.ui.ActionBar.d3 d3Var = p2Var.container;
        b6Var = p2Var.resourcesProvider;
        return new oc(d3Var, b6Var);
    }
}
