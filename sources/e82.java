// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class e82 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p82 b;

    public /* synthetic */ e82(p82 p82Var, byte b) {
        this.a = b;
        this.b = p82Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        p82 p82Var = this.b;
        switch (b) {
            case 0:
                p82 p82Var2 = this.b;
                p82Var2.K(true, 2147483646, 0, 0L, false);
                j67 j67Var = p82Var2.P;
                if (j67Var != null) {
                    j67Var.f(false);
                    p82Var2.P = null;
                    break;
                }
                break;
            case 1:
                p82 p82Var3 = this.b;
                p82Var3.K(false, 0, 0, 0L, false);
                j67 j67Var2 = p82Var3.P;
                if (j67Var2 != null) {
                    j67Var2.f(true);
                    p82Var3.P = null;
                    break;
                }
                break;
            case 2:
                if (!z8c.h(p82Var.n).p()) {
                    new kj8(p82Var.b.Z1, p82Var.getContext(), p82Var.n, 43, true).show();
                    break;
                }
                break;
            case 3:
                hh9 hh9Var = p82Var.s;
                if (hh9Var != null) {
                    hh9Var.setSendEnabled(p82Var.r.I3());
                    break;
                }
                break;
            default:
                p82Var.f0();
                break;
        }
    }
}
