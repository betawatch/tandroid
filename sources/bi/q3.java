package bi;

import java.util.ArrayList;
import org.telegram.ui.Cells.k9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class q3 extends k9 {
    public final /* synthetic */ b4 F0;
    public final /* synthetic */ d4 G0;

    public q3(d4 d4Var, b4 b4Var) {
        this.G0 = d4Var;
        this.F0 = b4Var;
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean C() {
        d4 d4Var = this.G0;
        CharSequence r10 = d4Var.u3.r();
        if (r10 == null || r10.length() == 0) {
            return true;
        }
        d4Var.e5(r10);
        return true;
    }

    @Override // org.telegram.ui.Cells.w9
    public final void D() {
        d4 d4Var = this.G0;
        CharSequence r10 = d4Var.u3.r();
        if (r10 != null && r10.length() > 0) {
            d4Var.e5(r10);
        }
        d4Var.H2();
    }

    @Override // org.telegram.ui.Cells.k9, org.telegram.ui.Cells.w9
    public final void F() {
        super.F();
        this.F0.r();
    }

    @Override // org.telegram.ui.Cells.w9
    public final void H() {
        this.G0.f4();
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean J() {
        if (a0()) {
            return true;
        }
        return this.G0.V4();
    }

    @Override // org.telegram.ui.Cells.w9
    public final void K(float f7, float f10) {
        d4 d4Var = this.G0;
        d4Var.z3 = true;
        d4Var.A3 = f7;
        d4Var.B3 = f10;
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean j() {
        boolean z10;
        int size;
        d4 d4Var = this.G0;
        q3 q3Var = d4Var.u3;
        ArrayList arrayList = d4Var.s3;
        if (!arrayList.isEmpty() && q3Var.x() && q3Var.p0 == 0 && q3Var.q0 == 0 && q3Var.r0 <= 0 && q3Var.s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String l4 = q6.p(aVar.b) ? s6.l(q6.k(aVar.b)) : "";
            boolean z11 = !l4.isEmpty();
            if (q3Var.t0 == z11) {
                if (q3Var.u0 >= (z11 ? l4.length() : q6.z(aVar.b).length())) {
                    z10 = true;
                    return !z10;
                }
            }
        }
        z10 = false;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int o() {
        return this.G0.getPaddingBottom();
    }

    @Override // org.telegram.ui.Cells.w9
    public final int p() {
        return this.G0.getPaddingTop();
    }
}
