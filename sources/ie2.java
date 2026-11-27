// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ie2 implements hqb {
    public final /* synthetic */ oe2 a;

    public ie2(oe2 oe2Var) {
        this.a = oe2Var;
    }

    @Override // hqb
    public final boolean a() {
        return this.a.G1;
    }

    @Override // hqb
    public final boolean s() {
        return true;
    }

    @Override // hqb
    public final void w(boolean z) {
        oe2 oe2Var = this.a;
        zu1 zu1Var = oe2Var.u1;
        oe2Var.G1 = !oe2Var.G1;
        if (oe2Var.F1 != null) {
            oe2Var.I1 = true;
            zu1Var.w7 = true;
            TLRPC.WallPaper wallPaper = oe2Var.K0() ? null : oe2Var.r1.g;
            ez3 ez3Var = oe2Var.F1.a;
            boolean z2 = ez3Var.a;
            xu1 xu1Var = oe2Var.r1;
            if (z2) {
                xu1Var.q(null, wallPaper, z, Boolean.valueOf(oe2Var.G1), false);
            } else {
                xu1Var.q(ez3Var, wallPaper, z, Boolean.valueOf(oe2Var.G1), false);
            }
            zu1Var.w7 = false;
        }
    }
}
