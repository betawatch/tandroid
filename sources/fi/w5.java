package fi;

import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.u51;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                u51 u51Var = y5Var.e;
                if (u51Var != null && y5Var.F != null) {
                    long S = u51Var.S();
                    if (y5Var.getDuration() > 1) {
                        float duration = S / y5Var.getDuration();
                        if (!y5Var.F.m1) {
                            e7 e7Var = y5Var.d;
                            if ((duration < e7Var.Z || duration > e7Var.a0) && System.currentTimeMillis() - y5Var.J > 500) {
                                y5Var.J = System.currentTimeMillis();
                                u51 u51Var2 = y5Var.e;
                                long duration2 = (long) (y5Var.d.Z * y5Var.getDuration());
                                u51Var2.q0(duration2, false);
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
                            u51 u51Var3 = y5Var2.D;
                            long j3 = (long) (y5Var2.d.E * r3.C);
                            u51Var3.q0(j3, false);
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
                            u51 u51Var4 = y5Var3.y;
                            long j10 = (long) (y5Var3.d.s0 * r3.q0);
                            u51Var4.q0(j10, false);
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
                i51 i51Var = y5Var4.n;
                if (i51Var != null) {
                    sy syVar = i51Var.b;
                    if (syVar != null) {
                        syVar.postRunnable(new py(syVar, 0));
                    }
                    i51Var.a = null;
                    y5Var4.removeView(y5Var4.n);
                    y5Var4.n = null;
                    break;
                }
                break;
        }
    }
}
