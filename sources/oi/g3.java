package oi;

import java.util.ArrayList;
import org.telegram.ui.Cells.j9;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class g3 extends j9 {
    public final /* synthetic */ q3 F0;
    public final /* synthetic */ s3 G0;

    public g3(s3 s3Var, q3 q3Var) {
        this.G0 = s3Var;
        this.F0 = q3Var;
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean C() {
        s3 s3Var = this.G0;
        CharSequence r10 = s3Var.v3.r();
        if (r10 == null || r10.length() == 0) {
            return true;
        }
        s3Var.f5(r10);
        return true;
    }

    @Override // org.telegram.ui.Cells.w9
    public final void D() {
        s3 s3Var = this.G0;
        CharSequence r10 = s3Var.v3.r();
        if (r10 != null && r10.length() > 0) {
            s3Var.f5(r10);
        }
        s3Var.H2();
    }

    @Override // org.telegram.ui.Cells.j9, org.telegram.ui.Cells.w9
    public final void F() {
        super.F();
        this.F0.G();
    }

    @Override // org.telegram.ui.Cells.w9
    public final void H() {
        this.G0.f4();
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean J() {
        if (a0()) {
            return true;
        }
        return this.G0.V4();
    }

    @Override // org.telegram.ui.Cells.w9
    public final void K(float f10, float f11) {
        s3 s3Var = this.G0;
        s3Var.A3 = true;
        s3Var.B3 = f10;
        s3Var.C3 = f11;
    }

    @Override // org.telegram.ui.Cells.w9
    public final boolean j() {
        boolean z10;
        int size;
        s3 s3Var = this.G0;
        g3 g3Var = s3Var.v3;
        ArrayList arrayList = s3Var.t3;
        if (!arrayList.isEmpty() && g3Var.x() && g3Var.p0 == 0 && g3Var.q0 == 0 && g3Var.r0 <= 0 && g3Var.s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            String l10 = z5.p(aVar.b) ? b6.l(z5.j(aVar.b)) : "";
            boolean z11 = !l10.isEmpty();
            if (g3Var.t0 == z11) {
                if (g3Var.u0 >= (z11 ? l10.length() : z5.z(aVar.b).length())) {
                    z10 = true;
                    return !z10;
                }
            }
        }
        z10 = false;
        return !z10;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int o() {
        return this.G0.getPaddingBottom();
    }

    @Override // org.telegram.ui.Cells.w9
    public final int p() {
        return this.G0.getPaddingTop();
    }
}
