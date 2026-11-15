package oi;

import java.util.ArrayList;
import org.telegram.ui.Cells.h9;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class e3 extends h9 {
    public final /* synthetic */ o3 F0;
    public final /* synthetic */ q3 G0;

    public e3(q3 q3Var, o3 o3Var) {
        this.G0 = q3Var;
        this.F0 = o3Var;
    }

    @Override // org.telegram.ui.Cells.u9
    public final boolean C() {
        q3 q3Var = this.G0;
        CharSequence r10 = q3Var.v3.r();
        if (r10 == null || r10.length() == 0) {
            return true;
        }
        q3Var.f5(r10);
        return true;
    }

    @Override // org.telegram.ui.Cells.u9
    public final void D() {
        q3 q3Var = this.G0;
        CharSequence r10 = q3Var.v3.r();
        if (r10 != null && r10.length() > 0) {
            q3Var.f5(r10);
        }
        q3Var.H2();
    }

    @Override // org.telegram.ui.Cells.h9, org.telegram.ui.Cells.u9
    public final void F() {
        super.F();
        this.F0.v();
    }

    @Override // org.telegram.ui.Cells.u9
    public final void H() {
        this.G0.f4();
    }

    @Override // org.telegram.ui.Cells.u9
    public final boolean J() {
        if (a0()) {
            return true;
        }
        return this.G0.V4();
    }

    @Override // org.telegram.ui.Cells.u9
    public final void K(float f10, float f11) {
        q3 q3Var = this.G0;
        q3Var.A3 = true;
        q3Var.B3 = f10;
        q3Var.C3 = f11;
    }

    @Override // org.telegram.ui.Cells.u9
    public final boolean j() {
        boolean z10;
        int size;
        q3 q3Var = this.G0;
        e3 e3Var = q3Var.v3;
        ArrayList arrayList = q3Var.t3;
        if (!arrayList.isEmpty() && e3Var.x() && e3Var.p0 == 0 && e3Var.q0 == 0 && e3Var.r0 <= 0 && e3Var.s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String l10 = y5.p(aVar.b) ? a6.l(y5.j(aVar.b)) : "";
            boolean z11 = !l10.isEmpty();
            if (e3Var.t0 == z11) {
                if (e3Var.u0 >= (z11 ? l10.length() : y5.z(aVar.b).length())) {
                    z10 = true;
                    return !z10;
                }
            }
        }
        z10 = false;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.u9
    public final int o() {
        return this.G0.getPaddingBottom();
    }

    @Override // org.telegram.ui.Cells.u9
    public final int p() {
        return this.G0.getPaddingTop();
    }
}
