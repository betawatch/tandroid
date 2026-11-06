package fi;

import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.ry;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ w5(y5 y5Var, int i7) {
        this.a = i7;
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
                w5 w5Var = y5Var.K;
                n51 n51Var = y5Var.e;
                if (n51Var != null && y5Var.F != null) {
                    long S = n51Var.S();
                    if (y5Var.getDuration() > 1) {
                        float duration = S / y5Var.getDuration();
                        if (!y5Var.F.m1) {
                            e7 e7Var = y5Var.d;
                            if ((duration < e7Var.Z || duration > e7Var.a0) && System.currentTimeMillis() - y5Var.J > 500) {
                                y5Var.J = System.currentTimeMillis();
                                n51 n51Var2 = y5Var.e;
                                long duration2 = (long) (y5Var.d.Z * y5Var.getDuration());
                                n51Var2.q0(duration2, false);
                                y5Var.w(true);
                                y5Var.y(true);
                                S = duration2;
                                y5Var.F.setProgress(y5Var.e.S());
                            }
                        }
                        y5Var.w(S < y5Var.I);
                        y5Var.y(S < y5Var.I);
                        y5Var.F.setProgress(y5Var.e.S());
                    } else {
                        y5Var.F.setProgress(y5Var.e.S());
                    }
                    if (y5Var.e.d0()) {
                        org.telegram.messenger.g0.r(w5Var);
                        org.telegram.messenger.g0.i3(w5Var, (long) (1000.0f / org.telegram.messenger.g0.r));
                    }
                    y5Var.I = S;
                    break;
                }
                break;
            case 4:
                y5 y5Var2 = this.b;
                w5 w5Var2 = y5Var2.L;
                if (y5Var2.D != null && y5Var2.e == null && y5Var2.y == null && y5Var2.F != null && !y5Var2.j()) {
                    long S2 = y5Var2.D.S();
                    e7 e7Var2 = y5Var2.d;
                    if (e7Var2 != null) {
                        float f10 = S2;
                        float f11 = e7Var2.E;
                        float f12 = e7Var2.C;
                        if ((f10 < f11 * f12 || f10 > e7Var2.F * f12) && System.currentTimeMillis() - y5Var2.J > 500) {
                            y5Var2.J = System.currentTimeMillis();
                            n51 n51Var3 = y5Var2.D;
                            long j3 = (long) (y5Var2.d.E * r3.C);
                            n51Var3.q0(j3, false);
                            S2 = j3;
                        }
                    }
                    y5Var2.F.setProgress(S2);
                    if (y5Var2.D.d0()) {
                        org.telegram.messenger.g0.r(w5Var2);
                        org.telegram.messenger.g0.i3(w5Var2, (long) (1000.0f / org.telegram.messenger.g0.r));
                        break;
                    }
                }
                break;
            case 5:
                y5 y5Var3 = this.b;
                w5 w5Var3 = y5Var3.M;
                if (y5Var3.y != null && y5Var3.e == null && !y5Var3.j() && y5Var3.F != null) {
                    long S3 = y5Var3.y.S();
                    e7 e7Var3 = y5Var3.d;
                    if (e7Var3 != null) {
                        float f13 = S3;
                        float f14 = e7Var3.s0;
                        float f15 = e7Var3.q0;
                        if ((f13 < f14 * f15 || f13 > e7Var3.t0 * f15) && System.currentTimeMillis() - y5Var3.J > 500) {
                            y5Var3.J = System.currentTimeMillis();
                            n51 n51Var4 = y5Var3.y;
                            long j10 = (long) (y5Var3.d.s0 * r3.q0);
                            n51Var4.q0(j10, false);
                            y5Var3.w(true);
                            S3 = j10;
                        }
                    }
                    y5Var3.F.setProgress(S3);
                    if (y5Var3.y.d0()) {
                        org.telegram.messenger.g0.r(w5Var3);
                        org.telegram.messenger.g0.i3(w5Var3, (long) (1000.0f / org.telegram.messenger.g0.r));
                        break;
                    }
                }
                break;
            default:
                y5 y5Var4 = this.b;
                c51 c51Var = y5Var4.n;
                if (c51Var != null) {
                    ry ryVar = c51Var.b;
                    if (ryVar != null) {
                        ryVar.postRunnable(new oy(ryVar, 0));
                    }
                    c51Var.a = null;
                    y5Var4.removeView(y5Var4.n);
                    y5Var4.n = null;
                    break;
                }
                break;
        }
    }
}
