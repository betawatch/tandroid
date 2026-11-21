package hi;

import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.y51;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;

    public /* synthetic */ s5(v5 v5Var, int i7) {
        this.a = i7;
        this.b = v5Var;
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
                v5 v5Var = this.b;
                s5 s5Var = v5Var.L;
                i61 i61Var = v5Var.e;
                if (i61Var != null && v5Var.G != null) {
                    long S = i61Var.S();
                    if (v5Var.getDuration() > 1) {
                        float duration = S / v5Var.getDuration();
                        if (!v5Var.G.n1) {
                            c7 c7Var = v5Var.d;
                            if ((duration < c7Var.Z || duration > c7Var.a0) && System.currentTimeMillis() - v5Var.K > 500) {
                                v5Var.K = System.currentTimeMillis();
                                i61 i61Var2 = v5Var.e;
                                long duration2 = (long) (v5Var.d.Z * v5Var.getDuration());
                                i61Var2.q0(duration2, false);
                                v5Var.w(true);
                                v5Var.y(true);
                                S = duration2;
                                v5Var.G.setProgress(v5Var.e.S());
                            }
                        }
                        v5Var.w(S < v5Var.J);
                        v5Var.y(S < v5Var.J);
                        v5Var.G.setProgress(v5Var.e.S());
                    } else {
                        v5Var.G.setProgress(v5Var.e.S());
                    }
                    if (v5Var.e.d0()) {
                        org.telegram.messenger.g0.r(s5Var);
                        org.telegram.messenger.g0.h3(s5Var, (long) (1000.0f / org.telegram.messenger.g0.r));
                    }
                    v5Var.J = S;
                    break;
                }
                break;
            case 4:
                v5 v5Var2 = this.b;
                s5 s5Var2 = v5Var2.M;
                if (v5Var2.E != null && v5Var2.e == null && v5Var2.y == null && v5Var2.G != null && !v5Var2.j()) {
                    long S2 = v5Var2.E.S();
                    c7 c7Var2 = v5Var2.d;
                    if (c7Var2 != null) {
                        float f10 = S2;
                        float f11 = c7Var2.E;
                        float f12 = c7Var2.C;
                        if ((f10 < f11 * f12 || f10 > c7Var2.F * f12) && System.currentTimeMillis() - v5Var2.K > 500) {
                            v5Var2.K = System.currentTimeMillis();
                            i61 i61Var3 = v5Var2.E;
                            long j3 = (long) (v5Var2.d.E * r3.C);
                            i61Var3.q0(j3, false);
                            S2 = j3;
                        }
                    }
                    v5Var2.G.setProgress(S2);
                    if (v5Var2.E.d0()) {
                        org.telegram.messenger.g0.r(s5Var2);
                        org.telegram.messenger.g0.h3(s5Var2, (long) (1000.0f / org.telegram.messenger.g0.r));
                        break;
                    }
                }
                break;
            case 5:
                v5 v5Var3 = this.b;
                s5 s5Var3 = v5Var3.N;
                if (v5Var3.y != null && v5Var3.e == null && !v5Var3.j() && v5Var3.G != null) {
                    long S3 = v5Var3.y.S();
                    c7 c7Var3 = v5Var3.d;
                    if (c7Var3 != null) {
                        float f13 = S3;
                        float f14 = c7Var3.s0;
                        float f15 = c7Var3.q0;
                        if ((f13 < f14 * f15 || f13 > c7Var3.t0 * f15) && System.currentTimeMillis() - v5Var3.K > 500) {
                            v5Var3.K = System.currentTimeMillis();
                            i61 i61Var4 = v5Var3.y;
                            long j10 = (long) (v5Var3.d.s0 * r3.q0);
                            i61Var4.q0(j10, false);
                            v5Var3.w(true);
                            S3 = j10;
                        }
                    }
                    v5Var3.G.setProgress(S3);
                    if (v5Var3.y.d0()) {
                        org.telegram.messenger.g0.r(s5Var3);
                        org.telegram.messenger.g0.h3(s5Var3, (long) (1000.0f / org.telegram.messenger.g0.r));
                        break;
                    }
                }
                break;
            default:
                v5 v5Var4 = this.b;
                y51 y51Var = v5Var4.n;
                if (y51Var != null) {
                    ez ezVar = y51Var.b;
                    if (ezVar != null) {
                        ezVar.postRunnable(new bz(ezVar, 0));
                    }
                    y51Var.a = null;
                    v5Var4.removeView(v5Var4.n);
                    v5Var4.n = null;
                    break;
                }
                break;
        }
    }
}
