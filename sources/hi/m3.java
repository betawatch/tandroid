package hi;

import java.util.ArrayList;
import org.telegram.ui.Cells.s9;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class m3 extends s9 {
    public final /* synthetic */ x3 K0;
    public final /* synthetic */ z3 L0;

    public m3(z3 z3Var, x3 x3Var) {
        this.L0 = z3Var;
        this.K0 = x3Var;
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean D() {
        z3 z3Var = this.L0;
        CharSequence s10 = z3Var.n3.s();
        if (s10 == null || s10.length() == 0) {
            return true;
        }
        z3Var.a5(s10);
        return true;
    }

    @Override // org.telegram.ui.Cells.fa
    public final void E() {
        z3 z3Var = this.L0;
        CharSequence s10 = z3Var.n3.s();
        if (s10 != null && s10.length() > 0) {
            z3Var.a5(s10);
        }
        z3Var.D2();
    }

    @Override // org.telegram.ui.Cells.s9, org.telegram.ui.Cells.fa
    public final void G() {
        super.G();
        this.K0.s();
    }

    @Override // org.telegram.ui.Cells.fa
    public final void I() {
        this.L0.b4();
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean K() {
        if (b0()) {
            return true;
        }
        return this.L0.R4();
    }

    @Override // org.telegram.ui.Cells.fa
    public final void L(float f7, float f10) {
        z3 z3Var = this.L0;
        z3Var.s3 = true;
        z3Var.t3 = f7;
        z3Var.u3 = f10;
    }

    @Override // org.telegram.ui.Cells.fa
    public final boolean k() {
        boolean z10;
        int size;
        z3 z3Var = this.L0;
        m3 m3Var = z3Var.n3;
        ArrayList arrayList = z3Var.l3;
        if (!arrayList.isEmpty() && m3Var.y() && m3Var.u0 == 0 && m3Var.v0 == 0 && m3Var.w0 <= 0 && m3Var.x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String l4 = g6.p(aVar.b) ? i6.l(g6.k(aVar.b)) : "";
            boolean z11 = !l4.isEmpty();
            if (m3Var.y0 == z11) {
                if (m3Var.z0 >= (z11 ? l4.length() : g6.z(aVar.b).length())) {
                    z10 = true;
                    return !z10;
                }
            }
        }
        z10 = false;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.fa
    public final int p() {
        return this.L0.getPaddingBottom();
    }

    @Override // org.telegram.ui.Cells.fa
    public final int q() {
        return this.L0.getPaddingTop();
    }
}
