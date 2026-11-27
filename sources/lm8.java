// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lm8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mm8 b;

    public /* synthetic */ lm8(mm8 mm8Var, byte b) {
        this.a = b;
        this.b = mm8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        mm8 mm8Var = this.b;
        switch (b) {
            case 0:
                mm8Var.r();
                break;
            case 1:
                mm8Var.m(0L);
                break;
            case 2:
                lm8 lm8Var = mm8Var.L;
                kfc kfcVar = mm8Var.e;
                if (kfcVar != null && mm8Var.G != null) {
                    long S = kfcVar.S();
                    if (mm8Var.getDuration() > 1) {
                        float duration = S / mm8Var.getDuration();
                        if (!mm8Var.G.n1) {
                            c8b c8bVar = mm8Var.d;
                            if ((duration < c8bVar.Z || duration > c8bVar.a0) && System.currentTimeMillis() - mm8Var.K > 500) {
                                mm8Var.K = System.currentTimeMillis();
                                kfc kfcVar2 = mm8Var.e;
                                S = (long) (mm8Var.d.Z * mm8Var.getDuration());
                                kfcVar2.p0(S, false);
                                mm8Var.w(true);
                                mm8Var.y(true);
                                mm8Var.G.setProgress(mm8Var.e.S());
                            }
                        }
                        mm8Var.w(S < mm8Var.J);
                        mm8Var.y(S < mm8Var.J);
                        mm8Var.G.setProgress(mm8Var.e.S());
                    } else {
                        mm8Var.G.setProgress(mm8Var.e.S());
                    }
                    if (mm8Var.e.c0()) {
                        hl.r(lm8Var);
                        hl.d3(lm8Var, (long) (1000.0f / hl.r));
                    }
                    mm8Var.J = S;
                    break;
                }
                break;
            case 3:
                lm8 lm8Var2 = mm8Var.M;
                if (mm8Var.E != null && mm8Var.e == null && mm8Var.y == null && mm8Var.G != null && !mm8Var.i()) {
                    long S2 = mm8Var.E.S();
                    c8b c8bVar2 = mm8Var.d;
                    if (c8bVar2 != null) {
                        float f = S2;
                        float f2 = c8bVar2.E;
                        float f3 = c8bVar2.C;
                        if ((f < f2 * f3 || f > c8bVar2.F * f3) && System.currentTimeMillis() - mm8Var.K > 500) {
                            mm8Var.K = System.currentTimeMillis();
                            kfc kfcVar3 = mm8Var.E;
                            S2 = (long) (mm8Var.d.E * r3.C);
                            kfcVar3.p0(S2, false);
                        }
                    }
                    mm8Var.G.setProgress(S2);
                    if (mm8Var.E.c0()) {
                        hl.r(lm8Var2);
                        hl.d3(lm8Var2, (long) (1000.0f / hl.r));
                        break;
                    }
                }
                break;
            case 4:
                lm8 lm8Var3 = mm8Var.N;
                if (mm8Var.y != null && mm8Var.e == null && !mm8Var.i() && mm8Var.G != null) {
                    long S3 = mm8Var.y.S();
                    c8b c8bVar3 = mm8Var.d;
                    if (c8bVar3 != null) {
                        float f4 = S3;
                        float f5 = c8bVar3.s0;
                        float f6 = c8bVar3.q0;
                        if ((f4 < f5 * f6 || f4 > c8bVar3.t0 * f6) && System.currentTimeMillis() - mm8Var.K > 500) {
                            mm8Var.K = System.currentTimeMillis();
                            kfc kfcVar4 = mm8Var.y;
                            S3 = (long) (mm8Var.d.s0 * r4.q0);
                            kfcVar4.p0(S3, false);
                            mm8Var.w(true);
                        }
                    }
                    mm8Var.G.setProgress(S3);
                    if (mm8Var.y.c0()) {
                        hl.r(lm8Var3);
                        hl.d3(lm8Var3, (long) (1000.0f / hl.r));
                        break;
                    }
                }
                break;
            default:
                kec kecVar = mm8Var.n;
                if (kecVar != null) {
                    rf4 rf4Var = kecVar.b;
                    if (rf4Var != null) {
                        rf4Var.postRunnable(new pf4(rf4Var, b2));
                    }
                    kecVar.a = null;
                    mm8Var.removeView(mm8Var.n);
                    mm8Var.n = null;
                    break;
                }
                break;
        }
    }
}
