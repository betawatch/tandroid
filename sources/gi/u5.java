package gi;

import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.py;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ u5(y5 y5Var, int i3) {
        this.a = i3;
        this.b = y5Var;
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
                y5 y5Var = this.b;
                u5 u5Var = y5Var.L;
                m51 m51Var = y5Var.e;
                if (m51Var != null && y5Var.G != null) {
                    long S = m51Var.S();
                    if (y5Var.getDuration() > 1) {
                        float duration = S / y5Var.getDuration();
                        if (!y5Var.G.n1) {
                            f7 f7Var = y5Var.d;
                            if ((duration < f7Var.Z || duration > f7Var.a0) && System.currentTimeMillis() - y5Var.K > 500) {
                                y5Var.K = System.currentTimeMillis();
                                m51 m51Var2 = y5Var.e;
                                long duration2 = (long) (y5Var.d.Z * y5Var.getDuration());
                                m51Var2.q0(duration2, false);
                                y5Var.w(true);
                                y5Var.y(true);
                                S = duration2;
                                y5Var.G.setProgress(y5Var.e.S());
                            }
                        }
                        y5Var.w(S < y5Var.J);
                        y5Var.y(S < y5Var.J);
                        y5Var.G.setProgress(y5Var.e.S());
                    } else {
                        y5Var.G.setProgress(y5Var.e.S());
                    }
                    if (y5Var.e.d0()) {
                        org.telegram.messenger.g0.r(u5Var);
                        org.telegram.messenger.g0.i3(u5Var, (long) (1000.0f / org.telegram.messenger.g0.r));
                    }
                    y5Var.J = S;
                    break;
                }
                break;
            case 4:
                y5 y5Var2 = this.b;
                u5 u5Var2 = y5Var2.M;
                if (y5Var2.E != null && y5Var2.e == null && y5Var2.y == null && y5Var2.G != null && !y5Var2.j()) {
                    long S2 = y5Var2.E.S();
                    f7 f7Var2 = y5Var2.d;
                    if (f7Var2 != null) {
                        float f10 = S2;
                        float f11 = f7Var2.E;
                        float f12 = f7Var2.C;
                        if ((f10 < f11 * f12 || f10 > f7Var2.F * f12) && System.currentTimeMillis() - y5Var2.K > 500) {
                            y5Var2.K = System.currentTimeMillis();
                            m51 m51Var3 = y5Var2.E;
                            long j10 = (long) (y5Var2.d.E * r3.C);
                            m51Var3.q0(j10, false);
                            S2 = j10;
                        }
                    }
                    y5Var2.G.setProgress(S2);
                    if (y5Var2.E.d0()) {
                        org.telegram.messenger.g0.r(u5Var2);
                        org.telegram.messenger.g0.i3(u5Var2, (long) (1000.0f / org.telegram.messenger.g0.r));
                        break;
                    }
                }
                break;
            case 5:
                y5 y5Var3 = this.b;
                u5 u5Var3 = y5Var3.N;
                if (y5Var3.y != null && y5Var3.e == null && !y5Var3.j() && y5Var3.G != null) {
                    long S3 = y5Var3.y.S();
                    f7 f7Var3 = y5Var3.d;
                    if (f7Var3 != null) {
                        float f13 = S3;
                        float f14 = f7Var3.s0;
                        float f15 = f7Var3.q0;
                        if ((f13 < f14 * f15 || f13 > f7Var3.t0 * f15) && System.currentTimeMillis() - y5Var3.K > 500) {
                            y5Var3.K = System.currentTimeMillis();
                            m51 m51Var4 = y5Var3.y;
                            long j11 = (long) (y5Var3.d.s0 * r3.q0);
                            m51Var4.q0(j11, false);
                            y5Var3.w(true);
                            S3 = j11;
                        }
                    }
                    y5Var3.G.setProgress(S3);
                    if (y5Var3.y.d0()) {
                        org.telegram.messenger.g0.r(u5Var3);
                        org.telegram.messenger.g0.i3(u5Var3, (long) (1000.0f / org.telegram.messenger.g0.r));
                        break;
                    }
                }
                break;
            default:
                y5 y5Var4 = this.b;
                b51 b51Var = y5Var4.n;
                if (b51Var != null) {
                    py pyVar = b51Var.b;
                    if (pyVar != null) {
                        pyVar.postRunnable(new my(pyVar, 0));
                    }
                    b51Var.a = null;
                    y5Var4.removeView(y5Var4.n);
                    y5Var4.n = null;
                    break;
                }
                break;
        }
    }
}
