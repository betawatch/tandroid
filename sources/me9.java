// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class me9 extends fib {
    public final /* synthetic */ we9 F0;
    public final /* synthetic */ ye9 G0;

    public me9(ye9 ye9Var, we9 we9Var) {
        this.G0 = ye9Var;
        this.F0 = we9Var;
    }

    @Override // rib
    public final boolean B() {
        ye9 ye9Var = this.G0;
        CharSequence q = ye9Var.v3.q();
        if (q == null || q.length() == 0) {
            return true;
        }
        ye9Var.f5(q);
        return true;
    }

    @Override // rib
    public final void C() {
        ye9 ye9Var = this.G0;
        CharSequence q = ye9Var.v3.q();
        if (q != null && q.length() > 0) {
            ye9Var.f5(q);
        }
        ye9Var.A2();
    }

    @Override // fib, rib
    public final void E() {
        super.E();
        this.F0.e();
    }

    @Override // rib
    public final void G() {
        this.G0.c4();
    }

    @Override // rib
    public final boolean I() {
        if (Z()) {
            return true;
        }
        return this.G0.V4();
    }

    @Override // rib
    public final void J(float f, float f2) {
        ye9 ye9Var = this.G0;
        ye9Var.A3 = true;
        ye9Var.B3 = f;
        ye9Var.C3 = f2;
    }

    @Override // rib
    public final boolean i() {
        int size;
        ye9 ye9Var = this.G0;
        me9 me9Var = ye9Var.v3;
        ArrayList arrayList = ye9Var.t3;
        boolean z = false;
        if (!arrayList.isEmpty() && me9Var.w() && me9Var.p0 == 0 && me9Var.q0 == 0 && me9Var.r0 <= 0 && me9Var.s0 == (size = arrayList.size() - 1)) {
            lk0 lk0Var = (lk0) arrayList.get(size);
            String l = wi9.n(lk0Var.b) ? yi9.l(wi9.h(lk0Var.b)) : "";
            boolean z2 = !l.isEmpty();
            if (me9Var.t0 == z2) {
                if (me9Var.u0 >= (z2 ? l.length() : wi9.y(lk0Var.b).length())) {
                    z = true;
                }
            }
        }
        return !z;
    }

    @Override // rib
    public final int n() {
        return this.G0.getPaddingBottom();
    }

    @Override // rib
    public final int o() {
        return this.G0.getPaddingTop();
    }
}
