package li;

import java.util.ArrayList;
import org.telegram.ui.Cells.i9;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class g3 extends i9 {
    public final /* synthetic */ r3 F0;
    public final /* synthetic */ t3 G0;

    public g3(t3 t3Var, r3 r3Var) {
        this.G0 = t3Var;
        this.F0 = r3Var;
    }

    @Override // org.telegram.ui.Cells.v9
    public final boolean C() {
        t3 t3Var = this.G0;
        CharSequence r10 = t3Var.u3.r();
        if (r10 == null || r10.length() == 0) {
            return true;
        }
        t3Var.f5(r10);
        return true;
    }

    @Override // org.telegram.ui.Cells.v9
    public final void D() {
        t3 t3Var = this.G0;
        CharSequence r10 = t3Var.u3.r();
        if (r10 != null && r10.length() > 0) {
            t3Var.f5(r10);
        }
        t3Var.H2();
    }

    @Override // org.telegram.ui.Cells.i9, org.telegram.ui.Cells.v9
    public final void F() {
        super.F();
        this.F0.h();
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
        t3Var.z3 = true;
        t3Var.A3 = f10;
        t3Var.B3 = f11;
    }

    @Override // org.telegram.ui.Cells.v9
    public final boolean j() {
        boolean z9;
        int size;
        t3 t3Var = this.G0;
        g3 g3Var = t3Var.u3;
        ArrayList arrayList = t3Var.s3;
        if (!arrayList.isEmpty() && g3Var.x() && g3Var.p0 == 0 && g3Var.q0 == 0 && g3Var.r0 <= 0 && g3Var.s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String l10 = a6.p(aVar.b) ? c6.l(a6.j(aVar.b)) : "";
            boolean z10 = !l10.isEmpty();
            if (g3Var.t0 == z10) {
                if (g3Var.u0 >= (z10 ? l10.length() : a6.z(aVar.b).length())) {
                    z9 = true;
                    return !z9;
                }
            }
        }
        z9 = false;
        return !z9;
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
