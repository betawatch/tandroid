package hi;

import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.zy;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ t5(w5 w5Var, int i7) {
        this.a = i7;
        this.b = w5Var;
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
                w5 w5Var = this.b;
                t5 t5Var = w5Var.L;
                f61 f61Var = w5Var.e;
                if (f61Var != null && w5Var.G != null) {
                    long S = f61Var.S();
                    if (w5Var.getDuration() > 1) {
                        float duration = S / w5Var.getDuration();
                        if (!w5Var.G.n1) {
                            d7 d7Var = w5Var.d;
                            if ((duration < d7Var.Z || duration > d7Var.a0) && System.currentTimeMillis() - w5Var.K > 500) {
                                w5Var.K = System.currentTimeMillis();
                                f61 f61Var2 = w5Var.e;
                                long duration2 = (long) (w5Var.d.Z * w5Var.getDuration());
                                f61Var2.q0(duration2, false);
                                w5Var.w(true);
                                w5Var.y(true);
                                S = duration2;
                                w5Var.G.setProgress(w5Var.e.S());
                            }
                        }
                        w5Var.w(S < w5Var.J);
                        w5Var.y(S < w5Var.J);
                        w5Var.G.setProgress(w5Var.e.S());
                    } else {
                        w5Var.G.setProgress(w5Var.e.S());
                    }
                    if (w5Var.e.d0()) {
                        org.telegram.messenger.g0.r(t5Var);
                        org.telegram.messenger.g0.h3(t5Var, (long) (1000.0f / org.telegram.messenger.g0.r));
                    }
                    w5Var.J = S;
                    break;
                }
                break;
            case 4:
                w5 w5Var2 = this.b;
                t5 t5Var2 = w5Var2.M;
                if (w5Var2.E != null && w5Var2.e == null && w5Var2.y == null && w5Var2.G != null && !w5Var2.j()) {
                    long S2 = w5Var2.E.S();
                    d7 d7Var2 = w5Var2.d;
                    if (d7Var2 != null) {
                        float f10 = S2;
                        float f11 = d7Var2.E;
                        float f12 = d7Var2.C;
                        if ((f10 < f11 * f12 || f10 > d7Var2.F * f12) && System.currentTimeMillis() - w5Var2.K > 500) {
                            w5Var2.K = System.currentTimeMillis();
                            f61 f61Var3 = w5Var2.E;
                            long j3 = (long) (w5Var2.d.E * r3.C);
                            f61Var3.q0(j3, false);
                            S2 = j3;
                        }
                    }
                    w5Var2.G.setProgress(S2);
                    if (w5Var2.E.d0()) {
                        org.telegram.messenger.g0.r(t5Var2);
                        org.telegram.messenger.g0.h3(t5Var2, (long) (1000.0f / org.telegram.messenger.g0.r));
                        break;
                    }
                }
                break;
            case 5:
                w5 w5Var3 = this.b;
                t5 t5Var3 = w5Var3.N;
                if (w5Var3.y != null && w5Var3.e == null && !w5Var3.j() && w5Var3.G != null) {
                    long S3 = w5Var3.y.S();
                    d7 d7Var3 = w5Var3.d;
                    if (d7Var3 != null) {
                        float f13 = S3;
                        float f14 = d7Var3.s0;
                        float f15 = d7Var3.q0;
                        if ((f13 < f14 * f15 || f13 > d7Var3.t0 * f15) && System.currentTimeMillis() - w5Var3.K > 500) {
                            w5Var3.K = System.currentTimeMillis();
                            f61 f61Var4 = w5Var3.y;
                            long j10 = (long) (w5Var3.d.s0 * r3.q0);
                            f61Var4.q0(j10, false);
                            w5Var3.w(true);
                            S3 = j10;
                        }
                    }
                    w5Var3.G.setProgress(S3);
                    if (w5Var3.y.d0()) {
                        org.telegram.messenger.g0.r(t5Var3);
                        org.telegram.messenger.g0.h3(t5Var3, (long) (1000.0f / org.telegram.messenger.g0.r));
                        break;
                    }
                }
                break;
            default:
                w5 w5Var4 = this.b;
                v51 v51Var = w5Var4.n;
                if (v51Var != null) {
                    cz czVar = v51Var.b;
                    if (czVar != null) {
                        czVar.postRunnable(new zy(czVar, 0));
                    }
                    v51Var.a = null;
                    w5Var4.removeView(w5Var4.n);
                    w5Var4.n = null;
                    break;
                }
                break;
        }
    }
}
