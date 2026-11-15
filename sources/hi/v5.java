package hi;

import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.wy;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class v5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x5 b;

    public /* synthetic */ v5(x5 x5Var, int i7) {
        this.a = i7;
        this.b = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r();
                break;
            case 1:
                this.b.r();
                break;
            case 2:
                this.b.m(0L);
                break;
            case 3:
                x5 x5Var = this.b;
                v5 v5Var = x5Var.L;
                u51 u51Var = x5Var.e;
                if (u51Var != null && x5Var.G != null) {
                    long S = u51Var.S();
                    if (x5Var.getDuration() > 1) {
                        float duration = S / x5Var.getDuration();
                        if (!x5Var.G.n1) {
                            d7 d7Var = x5Var.d;
                            if ((duration < d7Var.Z || duration > d7Var.a0) && System.currentTimeMillis() - x5Var.K > 500) {
                                x5Var.K = System.currentTimeMillis();
                                u51 u51Var2 = x5Var.e;
                                long duration2 = (long) (x5Var.d.Z * x5Var.getDuration());
                                u51Var2.q0(duration2, false);
                                x5Var.w(true);
                                x5Var.y(true);
                                S = duration2;
                                x5Var.G.setProgress(x5Var.e.S());
                            }
                        }
                        x5Var.w(S < x5Var.J);
                        x5Var.y(S < x5Var.J);
                        x5Var.G.setProgress(x5Var.e.S());
                    } else {
                        x5Var.G.setProgress(x5Var.e.S());
                    }
                    if (x5Var.e.d0()) {
                        org.telegram.messenger.g0.r(v5Var);
                        org.telegram.messenger.g0.i3(v5Var, (long) (1000.0f / org.telegram.messenger.g0.r));
                    }
                    x5Var.J = S;
                    break;
                }
                break;
            case 4:
                x5 x5Var2 = this.b;
                v5 v5Var2 = x5Var2.M;
                if (x5Var2.E != null && x5Var2.e == null && x5Var2.y == null && x5Var2.G != null && !x5Var2.j()) {
                    long S2 = x5Var2.E.S();
                    d7 d7Var2 = x5Var2.d;
                    if (d7Var2 != null) {
                        float f10 = S2;
                        float f11 = d7Var2.E;
                        float f12 = d7Var2.C;
                        if ((f10 < f11 * f12 || f10 > d7Var2.F * f12) && System.currentTimeMillis() - x5Var2.K > 500) {
                            x5Var2.K = System.currentTimeMillis();
                            u51 u51Var3 = x5Var2.E;
                            long j3 = (long) (x5Var2.d.E * r3.C);
                            u51Var3.q0(j3, false);
                            S2 = j3;
                        }
                    }
                    x5Var2.G.setProgress(S2);
                    if (x5Var2.E.d0()) {
                        org.telegram.messenger.g0.r(v5Var2);
                        org.telegram.messenger.g0.i3(v5Var2, (long) (1000.0f / org.telegram.messenger.g0.r));
                        break;
                    }
                }
                break;
            case 5:
                x5 x5Var3 = this.b;
                v5 v5Var3 = x5Var3.N;
                if (x5Var3.y != null && x5Var3.e == null && !x5Var3.j() && x5Var3.G != null) {
                    long S3 = x5Var3.y.S();
                    d7 d7Var3 = x5Var3.d;
                    if (d7Var3 != null) {
                        float f13 = S3;
                        float f14 = d7Var3.s0;
                        float f15 = d7Var3.q0;
                        if ((f13 < f14 * f15 || f13 > d7Var3.t0 * f15) && System.currentTimeMillis() - x5Var3.K > 500) {
                            x5Var3.K = System.currentTimeMillis();
                            u51 u51Var4 = x5Var3.y;
                            long j10 = (long) (x5Var3.d.s0 * r3.q0);
                            u51Var4.q0(j10, false);
                            x5Var3.w(true);
                            S3 = j10;
                        }
                    }
                    x5Var3.G.setProgress(S3);
                    if (x5Var3.y.d0()) {
                        org.telegram.messenger.g0.r(v5Var3);
                        org.telegram.messenger.g0.i3(v5Var3, (long) (1000.0f / org.telegram.messenger.g0.r));
                        break;
                    }
                }
                break;
            default:
                x5 x5Var4 = this.b;
                k51 k51Var = x5Var4.n;
                if (k51Var != null) {
                    wy wyVar = k51Var.b;
                    if (wyVar != null) {
                        wyVar.postRunnable(new ty(wyVar, 0));
                    }
                    k51Var.a = null;
                    x5Var4.removeView(x5Var4.n);
                    x5Var4.n = null;
                    break;
                }
                break;
        }
    }
}
