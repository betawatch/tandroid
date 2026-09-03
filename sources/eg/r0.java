package eg;

import org.telegram.ui.mt0;
import org.telegram.ui.tq0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class r0 implements dg.n1 {
    public final /* synthetic */ tq0 a;
    public final /* synthetic */ mt0 b;

    public r0(mt0 mt0Var, tq0 tq0Var) {
        this.b = mt0Var;
        this.a = tq0Var;
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
        mt0 mt0Var = this.b;
        if (mt0Var.h1) {
            mt0Var.h1 = false;
        } else {
            mt0Var.q1.b(1);
            mt0Var.g((dg.m) dg.m.a.get(0));
        }
    }

    @Override // dg.n1
    public final boolean d() {
        mt0 mt0Var = this.b;
        boolean z4 = mt0Var.P0 == null;
        if (!z4) {
            mt0Var.r0(null, true);
        }
        return z4;
    }

    @Override // dg.n1
    public final void e() {
        mt0 mt0Var = this.b;
        mt0Var.C0.a.e();
        mt0Var.i1.setViewHidden(false);
    }

    @Override // dg.n1
    public final void f() {
        mt0 mt0Var = this.b;
        if (mt0Var.P0 != null) {
            mt0Var.r0(null, true);
        }
        mt0Var.i1.setViewHidden(true);
    }
}
