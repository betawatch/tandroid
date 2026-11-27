// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class di9 extends amb {
    public final /* synthetic */ ni9 F0;
    public final /* synthetic */ pi9 G0;

    public di9(pi9 pi9Var, ni9 ni9Var) {
        this.G0 = pi9Var;
        this.F0 = ni9Var;
    }

    @Override // mmb
    public final boolean B() {
        pi9 pi9Var = this.G0;
        CharSequence q = pi9Var.v3.q();
        if (q == null || q.length() == 0) {
            return true;
        }
        pi9Var.g5(q);
        return true;
    }

    @Override // mmb
    public final void C() {
        pi9 pi9Var = this.G0;
        CharSequence q = pi9Var.v3.q();
        if (q != null && q.length() > 0) {
            pi9Var.g5(q);
        }
        pi9Var.B2();
    }

    @Override // amb, mmb
    public final void E() {
        super.E();
        this.F0.f();
    }

    @Override // mmb
    public final void G() {
        this.G0.d4();
    }

    @Override // mmb
    public final boolean I() {
        if (Z()) {
            return true;
        }
        return this.G0.W4();
    }

    @Override // mmb
    public final void J(float f, float f2) {
        pi9 pi9Var = this.G0;
        pi9Var.A3 = true;
        pi9Var.B3 = f;
        pi9Var.C3 = f2;
    }

    @Override // mmb
    public final boolean i() {
        int size;
        pi9 pi9Var = this.G0;
        di9 di9Var = pi9Var.v3;
        ArrayList arrayList = pi9Var.t3;
        boolean z = false;
        if (!arrayList.isEmpty() && di9Var.w() && di9Var.p0 == 0 && di9Var.q0 == 0 && di9Var.r0 <= 0 && di9Var.s0 == (size = arrayList.size() - 1)) {
            mk0 mk0Var = (mk0) arrayList.get(size);
            String l = km9.n(mk0Var.b) ? mm9.l(km9.h(mk0Var.b)) : "";
            boolean z2 = !l.isEmpty();
            if (di9Var.t0 == z2) {
                if (di9Var.u0 >= (z2 ? l.length() : km9.y(mk0Var.b).length())) {
                    z = true;
                }
            }
        }
        return !z;
    }

    @Override // mmb
    public final int n() {
        return this.G0.getPaddingBottom();
    }

    @Override // mmb
    public final int o() {
        return this.G0.getPaddingTop();
    }
}
