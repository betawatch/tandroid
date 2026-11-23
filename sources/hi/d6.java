package hi;

import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yy;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class d6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ d6(f6 f6Var, int i7) {
        this.a = i7;
        this.b = f6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r();
                break;
            case 1:
                this.b.m(0L);
                break;
            case 2:
                f6 f6Var = this.b;
                d6 d6Var = f6Var.L;
                h61 h61Var = f6Var.e;
                if (h61Var != null && f6Var.G != null) {
                    long S = h61Var.S();
                    if (f6Var.getDuration() > 1) {
                        float duration = S / f6Var.getDuration();
                        if (!f6Var.G.n1) {
                            x7 x7Var = f6Var.d;
                            if ((duration < x7Var.Z || duration > x7Var.a0) && System.currentTimeMillis() - f6Var.K > 500) {
                                f6Var.K = System.currentTimeMillis();
                                h61 h61Var2 = f6Var.e;
                                long duration2 = (long) (f6Var.d.Z * f6Var.getDuration());
                                h61Var2.q0(duration2, false);
                                f6Var.w(true);
                                f6Var.y(true);
                                S = duration2;
                                f6Var.G.setProgress(f6Var.e.S());
                            }
                        }
                        f6Var.w(S < f6Var.J);
                        f6Var.y(S < f6Var.J);
                        f6Var.G.setProgress(f6Var.e.S());
                    } else {
                        f6Var.G.setProgress(f6Var.e.S());
                    }
                    if (f6Var.e.d0()) {
                        org.telegram.messenger.g0.r(d6Var);
                        org.telegram.messenger.g0.h3(d6Var, (long) (1000.0f / org.telegram.messenger.g0.r));
                    }
                    f6Var.J = S;
                    break;
                }
                break;
            case 3:
                f6 f6Var2 = this.b;
                d6 d6Var2 = f6Var2.M;
                if (f6Var2.E != null && f6Var2.e == null && f6Var2.y == null && f6Var2.G != null && !f6Var2.j()) {
                    long S2 = f6Var2.E.S();
                    x7 x7Var2 = f6Var2.d;
                    if (x7Var2 != null) {
                        float f10 = S2;
                        float f11 = x7Var2.E;
                        float f12 = x7Var2.C;
                        if ((f10 < f11 * f12 || f10 > x7Var2.F * f12) && System.currentTimeMillis() - f6Var2.K > 500) {
                            f6Var2.K = System.currentTimeMillis();
                            h61 h61Var3 = f6Var2.E;
                            long j3 = (long) (f6Var2.d.E * r3.C);
                            h61Var3.q0(j3, false);
                            S2 = j3;
                        }
                    }
                    f6Var2.G.setProgress(S2);
                    if (f6Var2.E.d0()) {
                        org.telegram.messenger.g0.r(d6Var2);
                        org.telegram.messenger.g0.h3(d6Var2, (long) (1000.0f / org.telegram.messenger.g0.r));
                        break;
                    }
                }
                break;
            case 4:
                f6 f6Var3 = this.b;
                d6 d6Var3 = f6Var3.N;
                if (f6Var3.y != null && f6Var3.e == null && !f6Var3.j() && f6Var3.G != null) {
                    long S3 = f6Var3.y.S();
                    x7 x7Var3 = f6Var3.d;
                    if (x7Var3 != null) {
                        float f13 = S3;
                        float f14 = x7Var3.s0;
                        float f15 = x7Var3.q0;
                        if ((f13 < f14 * f15 || f13 > x7Var3.t0 * f15) && System.currentTimeMillis() - f6Var3.K > 500) {
                            f6Var3.K = System.currentTimeMillis();
                            h61 h61Var4 = f6Var3.y;
                            long j10 = (long) (f6Var3.d.s0 * r3.q0);
                            h61Var4.q0(j10, false);
                            f6Var3.w(true);
                            S3 = j10;
                        }
                    }
                    f6Var3.G.setProgress(S3);
                    if (f6Var3.y.d0()) {
                        org.telegram.messenger.g0.r(d6Var3);
                        org.telegram.messenger.g0.h3(d6Var3, (long) (1000.0f / org.telegram.messenger.g0.r));
                        break;
                    }
                }
                break;
            default:
                f6 f6Var4 = this.b;
                x51 x51Var = f6Var4.n;
                if (x51Var != null) {
                    bz bzVar = x51Var.b;
                    if (bzVar != null) {
                        bzVar.postRunnable(new yy(bzVar, 0));
                    }
                    x51Var.a = null;
                    f6Var4.removeView(f6Var4.n);
                    f6Var4.n = null;
                    break;
                }
                break;
        }
    }
}
