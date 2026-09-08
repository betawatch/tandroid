package ji;

import java.util.ArrayList;
import org.telegram.ui.Cells.q9;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class i3 extends q9 {
    public final /* synthetic */ t3 K0;
    public final /* synthetic */ v3 L0;

    public i3(v3 v3Var, t3 t3Var) {
        this.L0 = v3Var;
        this.K0 = t3Var;
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean D() {
        v3 v3Var = this.L0;
        CharSequence s10 = v3Var.n3.s();
        if (s10 == null || s10.length() == 0) {
            return true;
        }
        v3Var.a5(s10);
        return true;
    }

    @Override // org.telegram.ui.Cells.da
    public final void E() {
        v3 v3Var = this.L0;
        CharSequence s10 = v3Var.n3.s();
        if (s10 != null && s10.length() > 0) {
            v3Var.a5(s10);
        }
        v3Var.D2();
    }

    @Override // org.telegram.ui.Cells.q9, org.telegram.ui.Cells.da
    public final void G() {
        super.G();
        this.K0.f();
    }

    @Override // org.telegram.ui.Cells.da
    public final void I() {
        this.L0.b4();
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean K() {
        if (b0()) {
            return true;
        }
        return this.L0.R4();
    }

    @Override // org.telegram.ui.Cells.da
    public final void L(float f7, float f10) {
        v3 v3Var = this.L0;
        v3Var.s3 = true;
        v3Var.t3 = f7;
        v3Var.u3 = f10;
    }

    @Override // org.telegram.ui.Cells.da
    public final boolean k() {
        boolean z10;
        int size;
        v3 v3Var = this.L0;
        i3 i3Var = v3Var.n3;
        ArrayList arrayList = v3Var.l3;
        if (!arrayList.isEmpty() && i3Var.y() && i3Var.u0 == 0 && i3Var.v0 == 0 && i3Var.w0 <= 0 && i3Var.x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String l4 = g6.p(aVar.b) ? i6.l(g6.k(aVar.b)) : "";
            boolean z11 = !l4.isEmpty();
            if (i3Var.y0 == z11) {
                if (i3Var.z0 >= (z11 ? l4.length() : g6.z(aVar.b).length())) {
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
