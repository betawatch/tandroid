package ii;

import java.util.ArrayList;
import org.telegram.ui.Cells.q9;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
        CharSequence s10 = x3Var.n3.s();
        if (s10 == null || s10.length() == 0) {
            return true;
        }
        x3Var.b5(s10);
        return true;
    }

    @Override // org.telegram.ui.Cells.da
    public final void E() {
        x3 x3Var = this.L0;
        CharSequence s10 = x3Var.n3.s();
        if (s10 != null && s10.length() > 0) {
            x3Var.b5(s10);
        }
        x3Var.E2();
    }

    @Override // org.telegram.ui.Cells.q9, org.telegram.ui.Cells.da
    public final void G() {
        super.G();
        this.K0.l();
    }

    @Override // org.telegram.ui.Cells.da
    public final void I() {
        this.L0.c4();
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean K() {
        if (b0()) {
            return true;
        }
        return this.L0.S4();
    }

    @Override // org.telegram.ui.Cells.da
    public final void L(float f7, float f10) {
        x3 x3Var = this.L0;
        x3Var.s3 = true;
        x3Var.t3 = f7;
        x3Var.u3 = f10;
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean k() {
        boolean z10;
        int size;
        x3 x3Var = this.L0;
        k3 k3Var = x3Var.n3;
        ArrayList arrayList = x3Var.l3;
        if (!arrayList.isEmpty() && k3Var.y() && k3Var.u0 == 0 && k3Var.v0 == 0 && k3Var.w0 <= 0 && k3Var.x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String l4 = e6.p(aVar.b) ? g6.l(e6.k(aVar.b)) : "";
            boolean z11 = !l4.isEmpty();
            if (k3Var.y0 == z11) {
                if (k3Var.z0 >= (z11 ? l4.length() : e6.z(aVar.b).length())) {
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
