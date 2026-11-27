// default package

import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class or0 {
    public final /* synthetic */ rr0 a;

    public or0(rr0 rr0Var) {
        this.a = rr0Var;
    }

    public final void a() {
        vy4 vy4Var;
        rr0 rr0Var = this.a;
        lr0 lr0Var = rr0Var.n;
        vy4Var = ((e) rr0Var).glassEngine;
        vy4Var.g();
        tt ttVar = rr0Var.c;
        if (ttVar != null) {
            ttVar.invalidate();
        }
        if (rr0Var.s == null) {
            hl.r(lr0Var);
            hl.d3(lr0Var, 300L);
        }
    }
}
