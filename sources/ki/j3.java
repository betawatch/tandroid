package ki;

import java.util.ArrayList;
import org.telegram.ui.Cells.n9;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class j3 extends n9 {
    public final /* synthetic */ u3 F0;
    public final /* synthetic */ w3 G0;

    public j3(w3 w3Var, u3 u3Var) {
        this.G0 = w3Var;
        this.F0 = u3Var;
    }

    @Override // org.telegram.ui.Cells.aa
    public final boolean C() {
        w3 w3Var = this.G0;
        CharSequence r10 = w3Var.l3.r();
        if (r10 == null || r10.length() == 0) {
            return true;
        }
        w3Var.c5(r10);
        return true;
    }

    @Override // org.telegram.ui.Cells.aa
    public final void D() {
        w3 w3Var = this.G0;
        CharSequence r10 = w3Var.l3.r();
        if (r10 != null && r10.length() > 0) {
            w3Var.c5(r10);
        }
        w3Var.F2();
    }

    @Override // org.telegram.ui.Cells.n9, org.telegram.ui.Cells.aa
    public final void F() {
        super.F();
        this.F0.o();
    }

    @Override // org.telegram.ui.Cells.aa
    public final void H() {
        this.G0.d4();
    }

    @Override // org.telegram.ui.Cells.aa
    public final boolean J() {
        if (a0()) {
            return true;
        }
        return this.G0.T4();
    }

    @Override // org.telegram.ui.Cells.aa
    public final void K(float f7, float f10) {
        w3 w3Var = this.G0;
        w3Var.q3 = true;
        w3Var.r3 = f7;
        w3Var.s3 = f10;
    }

    @Override // org.telegram.ui.Cells.aa
    public final boolean j() {
        boolean z10;
        int size;
        w3 w3Var = this.G0;
        j3 j3Var = w3Var.l3;
        ArrayList arrayList = w3Var.j3;
        if (!arrayList.isEmpty() && j3Var.x() && j3Var.p0 == 0 && j3Var.q0 == 0 && j3Var.r0 <= 0 && j3Var.s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String l4 = c6.p(aVar.b) ? e6.l(c6.k(aVar.b)) : "";
            boolean z11 = !l4.isEmpty();
            if (j3Var.t0 == z11) {
                if (j3Var.u0 >= (z11 ? l4.length() : c6.z(aVar.b).length())) {
                    z10 = true;
                    return !z10;
                }
            }
        }
        z10 = false;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.aa
    public final int o() {
        return this.G0.getPaddingBottom();
    }

    @Override // org.telegram.ui.Cells.aa
    public final int p() {
        return this.G0.getPaddingTop();
    }
}
