package ii;

import java.util.ArrayList;
import org.telegram.ui.Cells.q9;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class k3 extends q9 {
    public final /* synthetic */ v3 K0;
    public final /* synthetic */ x3 L0;

    public k3(x3 x3Var, v3 v3Var) {
        this.L0 = x3Var;
        this.K0 = v3Var;
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean D() {
        x3 x3Var = this.L0;
        CharSequence s10 = x3Var.u3.s();
        if (s10 == null || s10.length() == 0) {
            return true;
        }
        x3Var.c5(s10);
        return true;
    }

    @Override // org.telegram.ui.Cells.da
    public final void E() {
        x3 x3Var = this.L0;
        CharSequence s10 = x3Var.u3.s();
        if (s10 != null && s10.length() > 0) {
            x3Var.c5(s10);
        }
        x3Var.F2();
    }

    @Override // org.telegram.ui.Cells.q9, org.telegram.ui.Cells.da
    public final void G() {
        super.G();
        this.K0.t();
    }

    @Override // org.telegram.ui.Cells.da
    public final void I() {
        this.L0.d4();
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean K() {
        if (b0()) {
            return true;
        }
        return this.L0.T4();
    }

    @Override // org.telegram.ui.Cells.da
    public final void L(float f7, float f10) {
        x3 x3Var = this.L0;
        x3Var.z3 = true;
        x3Var.A3 = f7;
        x3Var.B3 = f10;
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean k() {
        boolean z10;
        int size;
        x3 x3Var = this.L0;
        k3 k3Var = x3Var.u3;
        ArrayList arrayList = x3Var.s3;
        if (!arrayList.isEmpty() && k3Var.y() && k3Var.u0 == 0 && k3Var.v0 == 0 && k3Var.w0 <= 0 && k3Var.x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String l4 = f6.p(aVar.b) ? h6.l(f6.k(aVar.b)) : "";
            boolean z11 = !l4.isEmpty();
            if (k3Var.y0 == z11) {
                if (k3Var.z0 >= (z11 ? l4.length() : f6.z(aVar.b).length())) {
                    z10 = true;
                    return !z10;
                }
            }
        }
        z10 = false;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.da
    public final int p() {
        return this.L0.getPaddingBottom();
    }

    @Override // org.telegram.ui.Cells.da
    public final int q() {
        return this.L0.getPaddingTop();
    }
}
