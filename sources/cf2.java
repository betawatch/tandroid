// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cf2 implements job {
    public final /* synthetic */ if2 a;

    public cf2(if2 if2Var) {
        this.a = if2Var;
    }

    @Override // job
    public final boolean a() {
        return this.a.G1;
    }

    @Override // job
    public final boolean s() {
        return true;
    }

    @Override // job
    public final void w(boolean z) {
        if2 if2Var = this.a;
        yv1 yv1Var = if2Var.u1;
        if2Var.G1 = !if2Var.G1;
        if (if2Var.F1 != null) {
            if2Var.I1 = true;
            yv1Var.w7 = true;
            TLRPC.WallPaper wallPaper = if2Var.J0() ? null : if2Var.r1.g;
            tz3 tz3Var = if2Var.F1.a;
            boolean z2 = tz3Var.a;
            wv1 wv1Var = if2Var.r1;
            if (z2) {
                wv1Var.q(null, wallPaper, z, Boolean.valueOf(if2Var.G1), false);
            } else {
                wv1Var.q(tz3Var, wallPaper, z, Boolean.valueOf(if2Var.G1), false);
            }
            yv1Var.w7 = false;
        }
    }
}
