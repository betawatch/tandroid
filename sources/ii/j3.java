package ii;

import java.util.ArrayList;
import org.telegram.ui.Cells.q9;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class j3 extends q9 {
    public final /* synthetic */ u3 K0;
    public final /* synthetic */ w3 L0;

    public j3(w3 w3Var, u3 u3Var) {
        this.L0 = w3Var;
        this.K0 = u3Var;
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean D() {
        w3 w3Var = this.L0;
        CharSequence s10 = w3Var.n3.s();
        if (s10 == null || s10.length() == 0) {
            return true;
        }
        w3Var.b5(s10);
        return true;
    }

    @Override // org.telegram.ui.Cells.da
    public final void E() {
        w3 w3Var = this.L0;
        CharSequence s10 = w3Var.n3.s();
        if (s10 != null && s10.length() > 0) {
            w3Var.b5(s10);
        }
        w3Var.E2();
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
        w3 w3Var = this.L0;
        w3Var.s3 = true;
        w3Var.t3 = f7;
        w3Var.u3 = f10;
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean k() {
        boolean z10;
        int size;
        w3 w3Var = this.L0;
        j3 j3Var = w3Var.n3;
        ArrayList arrayList = w3Var.l3;
        if (!arrayList.isEmpty() && j3Var.y() && j3Var.u0 == 0 && j3Var.v0 == 0 && j3Var.w0 <= 0 && j3Var.x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String l4 = d6.p(aVar.b) ? f6.l(d6.k(aVar.b)) : "";
            boolean z11 = !l4.isEmpty();
            if (j3Var.y0 == z11) {
                if (j3Var.z0 >= (z11 ? l4.length() : d6.z(aVar.b).length())) {
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
