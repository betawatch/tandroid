package dg;

import org.telegram.ui.mt0;
import org.telegram.ui.tq0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t0 implements cg.o1 {
    public final /* synthetic */ tq0 a;
    public final /* synthetic */ mt0 b;

    public t0(mt0 mt0Var, tq0 tq0Var) {
        this.b = mt0Var;
        this.a = tq0Var;
    }

    @Override // cg.o1
    public final void a() {
        this.a.run();
    }

    @Override // cg.o1
    public final void b() {
        u0 u0Var = this.b.U0;
        if (u0Var != null) {
            u0Var.invalidate();
        }
    }

    @Override // cg.o1
    public final void c() {
        mt0 mt0Var = this.b;
        if (mt0Var.h1) {
            mt0Var.h1 = false;
        } else {
            mt0Var.q1.b(1);
            mt0Var.x((cg.m) cg.m.a.get(0));
        }
    }

    @Override // cg.o1
    public final boolean d() {
        mt0 mt0Var = this.b;
        boolean z4 = mt0Var.P0 == null;
        if (!z4) {
            mt0Var.r0(null, true);
        }
        return z4;
    }

    @Override // cg.o1
    public final void e() {
        mt0 mt0Var = this.b;
        mt0Var.C0.a.g();
        mt0Var.i1.setViewHidden(false);
    }

    @Override // cg.o1
    public final void f() {
        mt0 mt0Var = this.b;
        if (mt0Var.P0 != null) {
            mt0Var.r0(null, true);
        }
        mt0Var.i1.setViewHidden(true);
    }
}
