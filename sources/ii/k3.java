package ii;

import java.util.ArrayList;
import org.telegram.ui.Cells.o9;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class k3 extends o9 {
    public final /* synthetic */ v3 F0;
    public final /* synthetic */ x3 G0;

    public k3(x3 x3Var, v3 v3Var) {
        this.G0 = x3Var;
        this.F0 = v3Var;
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean C() {
        x3 x3Var = this.G0;
        CharSequence r10 = x3Var.l3.r();
        if (r10 == null || r10.length() == 0) {
            return true;
        }
        x3Var.c5(r10);
        return true;
    }

    @Override // org.telegram.ui.Cells.ba
    public final void D() {
        x3 x3Var = this.G0;
        CharSequence r10 = x3Var.l3.r();
        if (r10 != null && r10.length() > 0) {
            x3Var.c5(r10);
        }
        x3Var.F2();
    }

    @Override // org.telegram.ui.Cells.o9, org.telegram.ui.Cells.ba
    public final void F() {
        super.F();
        this.F0.l();
    }

    @Override // org.telegram.ui.Cells.ba
    public final void H() {
        this.G0.d4();
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean J() {
        if (a0()) {
            return true;
        }
        return this.G0.T4();
    }

    @Override // org.telegram.ui.Cells.ba
    public final void K(float f7, float f10) {
        x3 x3Var = this.G0;
        x3Var.q3 = true;
        x3Var.r3 = f7;
        x3Var.s3 = f10;
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean j() {
        boolean z10;
        int size;
        x3 x3Var = this.G0;
        k3 k3Var = x3Var.l3;
        ArrayList arrayList = x3Var.j3;
        if (!arrayList.isEmpty() && k3Var.x() && k3Var.p0 == 0 && k3Var.q0 == 0 && k3Var.r0 <= 0 && k3Var.s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String l4 = f6.p(aVar.b) ? h6.l(f6.k(aVar.b)) : "";
            boolean z11 = !l4.isEmpty();
            if (k3Var.t0 == z11) {
                if (k3Var.u0 >= (z11 ? l4.length() : f6.z(aVar.b).length())) {
                    z10 = true;
                    return !z10;
                }
            }
        }
        z10 = false;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int o() {
        return this.G0.getPaddingBottom();
    }

    @Override // org.telegram.ui.Cells.ba
    public final int p() {
        return this.G0.getPaddingTop();
    }
}
