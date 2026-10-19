package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.q71;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class o6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;

    public /* synthetic */ o6(r6 r6Var, int i10) {
        this.a = i10;
        this.b = r6Var;
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
                r6 r6Var = this.b;
                o6 o6Var = r6Var.K;
                b81 b81Var = r6Var.e;
                if (b81Var != null && r6Var.F != null) {
                    long n10 = b81Var.n();
                    if (r6Var.getDuration() > 1) {
                        float duration = n10 / r6Var.getDuration();
                        if (!r6Var.F.m1) {
                            a8 a8Var = r6Var.d;
                            if ((duration < a8Var.Z || duration > a8Var.a0) && System.currentTimeMillis() - r6Var.J > 500) {
                                r6Var.J = System.currentTimeMillis();
                                b81 b81Var2 = r6Var.e;
                                long duration2 = (long) (r6Var.d.Z * r6Var.getDuration());
                                b81Var2.L(duration2, false);
                                r6Var.w(true);
                                r6Var.y(true);
                                n10 = duration2;
                                r6Var.F.setProgress(r6Var.e.n());
                            }
                        }
                        r6Var.w(n10 < r6Var.I);
                        r6Var.y(n10 < r6Var.I);
                        r6Var.F.setProgress(r6Var.e.n());
                    } else {
                        r6Var.F.setProgress(r6Var.e.n());
                    }
                    if (r6Var.e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(o6Var);
                        AndroidUtilities.runOnUIThread(o6Var, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    }
                    r6Var.I = n10;
                    break;
                }
                break;
            case 4:
                r6 r6Var2 = this.b;
                o6 o6Var2 = r6Var2.L;
                if (r6Var2.y != null && r6Var2.e == null && r6Var2.x == null && r6Var2.F != null && !r6Var2.j()) {
                    long n11 = r6Var2.y.n();
                    a8 a8Var2 = r6Var2.d;
                    if (a8Var2 != null) {
                        float f7 = n11;
                        float f10 = a8Var2.E;
                        float f11 = a8Var2.C;
                        if ((f7 < f10 * f11 || f7 > a8Var2.F * f11) && System.currentTimeMillis() - r6Var2.J > 500) {
                            r6Var2.J = System.currentTimeMillis();
                            b81 b81Var3 = r6Var2.y;
                            long j10 = (long) (r6Var2.d.E * r3.C);
                            b81Var3.L(j10, false);
                            n11 = j10;
                        }
                    }
                    r6Var2.F.setProgress(n11);
                    if (r6Var2.y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(o6Var2);
                        AndroidUtilities.runOnUIThread(o6Var2, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            case 5:
                r6 r6Var3 = this.b;
                o6 o6Var3 = r6Var3.M;
                if (r6Var3.x != null && r6Var3.e == null && !r6Var3.j() && r6Var3.F != null) {
                    long n12 = r6Var3.x.n();
                    a8 a8Var3 = r6Var3.d;
                    if (a8Var3 != null) {
                        float f12 = n12;
                        float f13 = a8Var3.s0;
                        float f14 = a8Var3.q0;
                        if ((f12 < f13 * f14 || f12 > a8Var3.t0 * f14) && System.currentTimeMillis() - r6Var3.J > 500) {
                            r6Var3.J = System.currentTimeMillis();
                            b81 b81Var4 = r6Var3.x;
                            long j11 = (long) (r6Var3.d.s0 * r3.q0);
                            b81Var4.L(j11, false);
                            r6Var3.w(true);
                            n12 = j11;
                        }
                    }
                    r6Var3.F.setProgress(n12);
                    if (r6Var3.x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(o6Var3);
                        AndroidUtilities.runOnUIThread(o6Var3, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            default:
                r6 r6Var4 = this.b;
                q71 q71Var = r6Var4.n;
                if (q71Var != null) {
                    e00 e00Var = q71Var.b;
                    if (e00Var != null) {
                        e00Var.postRunnable(new b00(e00Var, 0));
                    }
                    q71Var.a = null;
                    r6Var4.removeView(r6Var4.n);
                    r6Var4.n = null;
                    break;
                }
                break;
        }
    }
}
