package ki;

import java.util.ArrayList;
import org.telegram.ui.Cells.o9;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class j3 extends o9 {
    public final /* synthetic */ u3 F0;
    public final /* synthetic */ w3 G0;

    public j3(w3 w3Var, u3 u3Var) {
        this.G0 = w3Var;
        this.F0 = u3Var;
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean C() {
        w3 w3Var = this.G0;
        CharSequence r10 = w3Var.o3.r();
        if (r10 == null || r10.length() == 0) {
            return true;
        }
        w3Var.h5(r10);
        return true;
    }

    @Override // org.telegram.ui.Cells.ba
    public final void D() {
        w3 w3Var = this.G0;
        CharSequence r10 = w3Var.o3.r();
        if (r10 != null && r10.length() > 0) {
            w3Var.h5(r10);
        }
        w3Var.K2();
    }

    @Override // org.telegram.ui.Cells.o9, org.telegram.ui.Cells.ba
    public final void F() {
        super.F();
        this.F0.p();
    }

    @Override // org.telegram.ui.Cells.ba
    public final void H() {
        this.G0.i4();
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean J() {
        if (a0()) {
            return true;
        }
        return this.G0.Y4();
    }

    @Override // org.telegram.ui.Cells.ba
    public final void K(float f7, float f10) {
        w3 w3Var = this.G0;
        w3Var.t3 = true;
        w3Var.u3 = f7;
        w3Var.v3 = f10;
    }

    @Override // org.telegram.ui.Cells.ba
    public final boolean j() {
        boolean z10;
        int size;
        w3 w3Var = this.G0;
        j3 j3Var = w3Var.o3;
        ArrayList arrayList = w3Var.m3;
        if (!arrayList.isEmpty() && j3Var.x() && j3Var.p0 == 0 && j3Var.q0 == 0 && j3Var.r0 <= 0 && j3Var.s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String l4 = c6.o(aVar.b) ? e6.l(c6.j(aVar.b)) : "";
            boolean z11 = !l4.isEmpty();
            if (j3Var.t0 == z11) {
                if (j3Var.u0 >= (z11 ? l4.length() : c6.y(aVar.b).length())) {
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
