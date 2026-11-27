// default package

import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
