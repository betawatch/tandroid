package dg;

import org.telegram.ui.ft0;
import org.telegram.ui.mq0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class t0 implements cg.o1 {
    public final /* synthetic */ mq0 a;
    public final /* synthetic */ ft0 b;

    public t0(ft0 ft0Var, mq0 mq0Var) {
        this.b = ft0Var;
        this.a = mq0Var;
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
        ft0 ft0Var = this.b;
        if (ft0Var.h1) {
            ft0Var.h1 = false;
        } else {
            ft0Var.q1.b(1);
            ft0Var.x((cg.m) cg.m.a.get(0));
        }
    }

    @Override // cg.o1
    public final boolean d() {
        ft0 ft0Var = this.b;
        boolean z4 = ft0Var.P0 == null;
        if (!z4) {
            ft0Var.r0(null, true);
        }
        return z4;
    }

    @Override // cg.o1
    public final void e() {
        ft0 ft0Var = this.b;
        ft0Var.C0.a.e();
        ft0Var.i1.setViewHidden(false);
    }

    @Override // cg.o1
    public final void f() {
        ft0 ft0Var = this.b;
        if (ft0Var.P0 != null) {
            ft0Var.r0(null, true);
        }
        ft0Var.i1.setViewHidden(true);
    }
}
