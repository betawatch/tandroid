package eg;

import org.telegram.ui.ht0;
import org.telegram.ui.oq0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class r0 implements dg.n1 {
    public final /* synthetic */ oq0 a;
    public final /* synthetic */ ht0 b;

    public r0(ht0 ht0Var, oq0 oq0Var) {
        this.b = ht0Var;
        this.a = oq0Var;
    }

    @Override // dg.n1
    public final void a() {
        this.a.run();
    }

    @Override // dg.n1
    public final void b() {
        s0 s0Var = this.b.U0;
        if (s0Var != null) {
            s0Var.invalidate();
        }
    }

    @Override // dg.n1
    public final void c() {
        ht0 ht0Var = this.b;
        if (ht0Var.h1) {
            ht0Var.h1 = false;
        } else {
            ht0Var.q1.b(1);
            ht0Var.g((dg.m) dg.m.a.get(0));
        }
    }

    @Override // dg.n1
    public final boolean d() {
        ht0 ht0Var = this.b;
        boolean z4 = ht0Var.P0 == null;
        if (!z4) {
            ht0Var.r0(null, true);
        }
        return z4;
    }

    @Override // dg.n1
    public final void e() {
        ht0 ht0Var = this.b;
        ht0Var.C0.a.e();
        ht0Var.i1.setViewHidden(false);
    }

    @Override // dg.n1
    public final void f() {
        ht0 ht0Var = this.b;
        if (ht0Var.P0 != null) {
            ht0Var.r0(null, true);
        }
        ht0Var.i1.setViewHidden(true);
    }
}
