// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class bl8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cl8 b;

    public /* synthetic */ bl8(cl8 cl8Var, byte b) {
        this.a = b;
        this.b = cl8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        cl8 cl8Var = this.b;
        switch (b) {
            case 0:
                cl8Var.r();
                break;
            case 1:
                cl8Var.m(0L);
                break;
            case 2:
                bl8 bl8Var = cl8Var.L;
                ndc ndcVar = cl8Var.e;
                if (ndcVar != null && cl8Var.G != null) {
                    long S = ndcVar.S();
                    if (cl8Var.getDuration() > 1) {
                        float duration = S / cl8Var.getDuration();
                        if (!cl8Var.G.n1) {
                            g6b g6bVar = cl8Var.d;
                            if ((duration < g6bVar.Z || duration > g6bVar.a0) && System.currentTimeMillis() - cl8Var.K > 500) {
                                cl8Var.K = System.currentTimeMillis();
                                ndc ndcVar2 = cl8Var.e;
                                S = (long) (cl8Var.d.Z * cl8Var.getDuration());
                                ndcVar2.p0(S, false);
                                cl8Var.w(true);
                                cl8Var.y(true);
                                cl8Var.G.setProgress(cl8Var.e.S());
                            }
                        }
                        cl8Var.w(S < cl8Var.J);
                        cl8Var.y(S < cl8Var.J);
                        cl8Var.G.setProgress(cl8Var.e.S());
                    } else {
                        cl8Var.G.setProgress(cl8Var.e.S());
                    }
                    if (cl8Var.e.c0()) {
                        gm.r(bl8Var);
                        gm.d3(bl8Var, (long) (1000.0f / gm.r));
                    }
                    cl8Var.J = S;
                    break;
                }
                break;
            case 3:
                bl8 bl8Var2 = cl8Var.M;
                if (cl8Var.E != null && cl8Var.e == null && cl8Var.y == null && cl8Var.G != null && !cl8Var.i()) {
                    long S2 = cl8Var.E.S();
                    g6b g6bVar2 = cl8Var.d;
                    if (g6bVar2 != null) {
                        float f = S2;
                        float f2 = g6bVar2.E;
                        float f3 = g6bVar2.C;
                        if ((f < f2 * f3 || f > g6bVar2.F * f3) && System.currentTimeMillis() - cl8Var.K > 500) {
                            cl8Var.K = System.currentTimeMillis();
                            ndc ndcVar3 = cl8Var.E;
                            S2 = (long) (cl8Var.d.E * r3.C);
                            ndcVar3.p0(S2, false);
                        }
                    }
                    cl8Var.G.setProgress(S2);
                    if (cl8Var.E.c0()) {
                        gm.r(bl8Var2);
                        gm.d3(bl8Var2, (long) (1000.0f / gm.r));
                        break;
                    }
                }
                break;
            case 4:
                bl8 bl8Var3 = cl8Var.N;
                if (cl8Var.y != null && cl8Var.e == null && !cl8Var.i() && cl8Var.G != null) {
                    long S3 = cl8Var.y.S();
                    g6b g6bVar3 = cl8Var.d;
                    if (g6bVar3 != null) {
                        float f4 = S3;
                        float f5 = g6bVar3.s0;
                        float f6 = g6bVar3.q0;
                        if ((f4 < f5 * f6 || f4 > g6bVar3.t0 * f6) && System.currentTimeMillis() - cl8Var.K > 500) {
                            cl8Var.K = System.currentTimeMillis();
                            ndc ndcVar4 = cl8Var.y;
                            S3 = (long) (cl8Var.d.s0 * r4.q0);
                            ndcVar4.p0(S3, false);
                            cl8Var.w(true);
                        }
                    }
                    cl8Var.G.setProgress(S3);
                    if (cl8Var.y.c0()) {
                        gm.r(bl8Var3);
                        gm.d3(bl8Var3, (long) (1000.0f / gm.r));
                        break;
                    }
                }
                break;
            default:
                ncc nccVar = cl8Var.n;
                if (nccVar != null) {
                    uf4 uf4Var = nccVar.b;
                    if (uf4Var != null) {
                        uf4Var.postRunnable(new sf4(uf4Var, b2));
                    }
                    nccVar.a = null;
                    cl8Var.removeView(cl8Var.n);
                    cl8Var.n = null;
                    break;
                }
                break;
        }
    }
}
