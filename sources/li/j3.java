package li;

import java.util.ArrayList;
import org.telegram.ui.Cells.s9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class j3 extends s9 {
    public final /* synthetic */ t3 F0;
    public final /* synthetic */ v3 G0;

    public j3(v3 v3Var, t3 t3Var) {
        this.G0 = v3Var;
        this.F0 = t3Var;
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean C() {
        v3 v3Var = this.G0;
        CharSequence r6 = v3Var.v3.r();
        if (r6 == null || r6.length() == 0) {
            return true;
        }
        v3Var.h5(r6);
        return true;
    }

    @Override // org.telegram.ui.Cells.fa
    public final void D() {
        v3 v3Var = this.G0;
        CharSequence r6 = v3Var.v3.r();
        if (r6 != null && r6.length() > 0) {
            v3Var.h5(r6);
        }
        v3Var.K2();
    }

    @Override // org.telegram.ui.Cells.s9, org.telegram.ui.Cells.fa
    public final void F() {
        super.F();
        this.F0.n();
    }

    @Override // org.telegram.ui.Cells.fa
    public final void H() {
        this.G0.i4();
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean J() {
        if (a0()) {
            return true;
        }
        return this.G0.Y4();
    }

    @Override // org.telegram.ui.Cells.fa
    public final void K(float f7, float f10) {
        v3 v3Var = this.G0;
        v3Var.A3 = true;
        v3Var.B3 = f7;
        v3Var.C3 = f10;
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean j() {
        boolean z10;
        int size;
        v3 v3Var = this.G0;
        j3 j3Var = v3Var.v3;
        ArrayList arrayList = v3Var.t3;
        if (!arrayList.isEmpty() && j3Var.x() && j3Var.p0 == 0 && j3Var.q0 == 0 && j3Var.r0 <= 0 && j3Var.s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String l4 = d6.o(aVar.b) ? f6.l(d6.j(aVar.b)) : "";
            boolean z11 = !l4.isEmpty();
            if (j3Var.t0 == z11) {
                if (j3Var.u0 >= (z11 ? l4.length() : d6.y(aVar.b).length())) {
                    z10 = true;
                    return !z10;
                }
            }
        }
        z10 = false;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.fa
    public final int o() {
        return this.G0.getPaddingBottom();
    }

    @Override // org.telegram.ui.Cells.fa
    public final int p() {
        return this.G0.getPaddingTop();
    }
}
