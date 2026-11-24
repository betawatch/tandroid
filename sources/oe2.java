// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class oe2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qe2 b;

    public /* synthetic */ oe2(qe2 qe2Var, byte b) {
        this.a = b;
        this.b = qe2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qe2 qe2Var = this.b;
        switch (b) {
            case 0:
                qe2Var.c(true);
                break;
            default:
                qe2Var.e = qe2Var.b();
                byte b2 = qe2Var.f;
                byte b3 = qe2Var.h;
                yv1 yv1Var = qe2Var.a;
                if (qe2Var.b == null) {
                    pe2 pe2Var = new pe2((yv1Var.getUserConfig().e() > yv1Var.a() ? 1 : (yv1Var.getUserConfig().e() == yv1Var.a() ? 0 : -1)) == 0 ? 3 : 0, yv1Var.getCurrentAccount(), yv1Var.getResourceProvider(), qe2Var.getContext(), qe2Var.a);
                    pe2Var.n1 = 1.0f;
                    pe2Var.setWillNotDraw(false);
                    qe2Var.b = pe2Var;
                    int L = gm.L(4.0f) + (jb6.a0 ? (byte) 0 : b3);
                    int L2 = gm.L(4.0f);
                    int L3 = gm.L(4.0f);
                    if (!jb6.a0) {
                        b3 = 0;
                    }
                    pe2Var.setPadding(L, L2, L3 + b3, gm.L(b2));
                    qe2Var.b.setDelegate(new ni6(qe2Var, (byte) 19));
                    qe2Var.b.setClipChildren(false);
                    qe2Var.b.setClipToPadding(false);
                    qe2Var.addView(qe2Var.b, qoe.e(-2, b2 + 70, 5));
                }
                qe2Var.c(false);
                if (!qe2Var.b.isEnabled()) {
                    qe2Var.y = false;
                    qe2Var.b.setTransitionProgress(1.0f);
                    break;
                } else {
                    qe2Var.y = true;
                    qe2Var.b.m(qe2Var.e, yv1Var.r8, true);
                    qe2Var.b.p(false);
                    break;
                }
        }
    }
}
