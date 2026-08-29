package bg;

import org.telegram.ui.gq0;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u0 implements ag.s1 {
    public final /* synthetic */ gq0 a;
    public final /* synthetic */ ws0 b;

    public u0(ws0 ws0Var, gq0 gq0Var) {
        this.b = ws0Var;
        this.a = gq0Var;
    }

    @Override // ag.s1
    public final void a() {
        this.a.run();
    }

    @Override // ag.s1
    public final void b() {
        v0 v0Var = this.b.T0;
        if (v0Var != null) {
            v0Var.invalidate();
        }
    }

    @Override // ag.s1
    public final void c() {
        ws0 ws0Var = this.b;
        if (ws0Var.g1) {
            ws0Var.g1 = false;
        } else {
            ws0Var.p1.b(1);
            ws0Var.q((ag.m) ag.m.a.get(0));
        }
    }

    @Override // ag.s1
    public final boolean d() {
        ws0 ws0Var = this.b;
        boolean z10 = ws0Var.O0 == null;
        if (!z10) {
            ws0Var.r0(null, true);
        }
        return z10;
    }

    @Override // ag.s1
    public final void e() {
        ws0 ws0Var = this.b;
        ws0Var.B0.a.e();
        ws0Var.h1.setViewHidden(false);
    }

    @Override // ag.s1
    public final void f() {
        ws0 ws0Var = this.b;
        if (ws0Var.O0 != null) {
            ws0Var.r0(null, true);
        }
        ws0Var.h1.setViewHidden(true);
    }
}
