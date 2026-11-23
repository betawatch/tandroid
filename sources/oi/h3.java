package oi;

import java.util.ArrayList;
import org.telegram.ui.Cells.i9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class h3 extends i9 {
    public final /* synthetic */ r3 F0;
    public final /* synthetic */ t3 G0;

    public h3(t3 t3Var, r3 r3Var) {
        this.G0 = t3Var;
        this.F0 = r3Var;
    }

    @Override // org.telegram.ui.Cells.v9
    public final boolean C() {
        t3 t3Var = this.G0;
        CharSequence r10 = t3Var.v3.r();
        if (r10 == null || r10.length() == 0) {
            return true;
        }
        t3Var.f5(r10);
        return true;
    }

    @Override // org.telegram.ui.Cells.v9
    public final void D() {
        t3 t3Var = this.G0;
        CharSequence r10 = t3Var.v3.r();
        if (r10 != null && r10.length() > 0) {
            t3Var.f5(r10);
        }
        t3Var.H2();
    }

    @Override // org.telegram.ui.Cells.i9, org.telegram.ui.Cells.v9
    public final void F() {
        super.F();
        this.F0.y();
    }

    @Override // org.telegram.ui.Cells.v9
    public final void H() {
        this.G0.f4();
    }

    @Override // org.telegram.ui.Cells.v9
    public final boolean J() {
        if (a0()) {
            return true;
        }
        return this.G0.V4();
    }

    @Override // org.telegram.ui.Cells.v9
    public final void K(float f10, float f11) {
        t3 t3Var = this.G0;
        t3Var.A3 = true;
        t3Var.B3 = f10;
        t3Var.C3 = f11;
    }

    @Override // org.telegram.ui.Cells.v9
    public final boolean j() {
        boolean z10;
        int size;
        t3 t3Var = this.G0;
        h3 h3Var = t3Var.v3;
        ArrayList arrayList = t3Var.t3;
        if (!arrayList.isEmpty() && h3Var.x() && h3Var.p0 == 0 && h3Var.q0 == 0 && h3Var.r0 <= 0 && h3Var.s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String l10 = a6.p(aVar.b) ? c6.l(a6.j(aVar.b)) : "";
            boolean z11 = !l10.isEmpty();
            if (h3Var.t0 == z11) {
                if (h3Var.u0 >= (z11 ? l10.length() : a6.z(aVar.b).length())) {
                    z10 = true;
                    return !z10;
                }
            }
        }
        z10 = false;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.v9
    public final int o() {
        return this.G0.getPaddingBottom();
    }

    @Override // org.telegram.ui.Cells.v9
    public final int p() {
        return this.G0.getPaddingTop();
    }
}
