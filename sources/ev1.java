// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ev1 extends k11 {
    public final /* synthetic */ rc2 d;
    public final /* synthetic */ iv1 e;

    public ev1(iv1 iv1Var, rc2 rc2Var) {
        this.e = iv1Var;
        this.d = rc2Var;
    }

    @Override // k11
    public final void c(boolean z) {
        if (z) {
            return;
        }
        gm.d3(new pp1(this.e.a, (byte) 15), 250L);
    }

    @Override // k11
    public final void d() {
        yv1 yv1Var = this.e.a;
        rc2 rc2Var = this.d;
        yv1Var.kc = rc2Var.getMessageObject().e1();
        yv1Var.lc = 2;
        yv1Var.mc = null;
        rc2Var.invalidate();
    }
}
