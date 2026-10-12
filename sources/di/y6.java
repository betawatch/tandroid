package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.x71;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class y6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a7 b;

    public /* synthetic */ y6(a7 a7Var, int i10) {
        this.a = i10;
        this.b = a7Var;
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
                a7 a7Var = this.b;
                y6 y6Var = a7Var.K;
                h81 h81Var = a7Var.e;
                if (h81Var != null && a7Var.F != null) {
                    long n10 = h81Var.n();
                    if (a7Var.getDuration() > 1) {
                        float duration = n10 / a7Var.getDuration();
                        if (!a7Var.F.m1) {
                            k8 k8Var = a7Var.d;
                            if ((duration < k8Var.Z || duration > k8Var.a0) && System.currentTimeMillis() - a7Var.J > 500) {
                                a7Var.J = System.currentTimeMillis();
                                h81 h81Var2 = a7Var.e;
                                long duration2 = (long) (a7Var.d.Z * a7Var.getDuration());
                                h81Var2.L(duration2, false);
                                a7Var.w(true);
                                a7Var.y(true);
                                n10 = duration2;
                                a7Var.F.setProgress(a7Var.e.n());
                            }
                        }
                        a7Var.w(n10 < a7Var.I);
                        a7Var.y(n10 < a7Var.I);
                        a7Var.F.setProgress(a7Var.e.n());
                    } else {
                        a7Var.F.setProgress(a7Var.e.n());
                    }
                    if (a7Var.e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(y6Var);
                        AndroidUtilities.runOnUIThread(y6Var, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    }
                    a7Var.I = n10;
                    break;
                }
                break;
            case 3:
                a7 a7Var2 = this.b;
                y6 y6Var2 = a7Var2.L;
                if (a7Var2.y != null && a7Var2.e == null && a7Var2.x == null && a7Var2.F != null && !a7Var2.j()) {
                    long n11 = a7Var2.y.n();
                    k8 k8Var2 = a7Var2.d;
                    if (k8Var2 != null) {
                        float f7 = n11;
                        float f10 = k8Var2.E;
                        float f11 = k8Var2.C;
                        if ((f7 < f10 * f11 || f7 > k8Var2.F * f11) && System.currentTimeMillis() - a7Var2.J > 500) {
                            a7Var2.J = System.currentTimeMillis();
                            h81 h81Var3 = a7Var2.y;
                            long j10 = (long) (a7Var2.d.E * r3.C);
                            h81Var3.L(j10, false);
                            n11 = j10;
                        }
                    }
                    a7Var2.F.setProgress(n11);
                    if (a7Var2.y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(y6Var2);
                        AndroidUtilities.runOnUIThread(y6Var2, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            case 4:
                a7 a7Var3 = this.b;
                y6 y6Var3 = a7Var3.M;
                if (a7Var3.x != null && a7Var3.e == null && !a7Var3.j() && a7Var3.F != null) {
                    long n12 = a7Var3.x.n();
                    k8 k8Var3 = a7Var3.d;
                    if (k8Var3 != null) {
                        float f12 = n12;
                        float f13 = k8Var3.s0;
                        float f14 = k8Var3.q0;
                        if ((f12 < f13 * f14 || f12 > k8Var3.t0 * f14) && System.currentTimeMillis() - a7Var3.J > 500) {
                            a7Var3.J = System.currentTimeMillis();
                            h81 h81Var4 = a7Var3.x;
                            long j11 = (long) (a7Var3.d.s0 * r3.q0);
                            h81Var4.L(j11, false);
                            a7Var3.w(true);
                            n12 = j11;
                        }
                    }
                    a7Var3.F.setProgress(n12);
                    if (a7Var3.x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(y6Var3);
                        AndroidUtilities.runOnUIThread(y6Var3, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            default:
                a7 a7Var4 = this.b;
                x71 x71Var = a7Var4.n;
                if (x71Var != null) {
                    h00 h00Var = x71Var.b;
                    if (h00Var != null) {
                        h00Var.postRunnable(new e00(h00Var, 0));
                    }
                    x71Var.a = null;
                    a7Var4.removeView(a7Var4.n);
                    a7Var4.n = null;
                    break;
                }
                break;
        }
    }
}
