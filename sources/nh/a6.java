package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.x61;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ a6(f6 f6Var, int i10) {
        this.a = i10;
        this.b = f6Var;
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
                f6 f6Var = this.b;
                a6 a6Var = f6Var.G;
                x61 x61Var = f6Var.e;
                if (x61Var != null && f6Var.B != null) {
                    long o10 = x61Var.o();
                    if (f6Var.getDuration() > 1) {
                        float duration = o10 / f6Var.getDuration();
                        if (!f6Var.B.i1) {
                            o7 o7Var = f6Var.d;
                            if ((duration < o7Var.Z || duration > o7Var.a0) && System.currentTimeMillis() - f6Var.F > 500) {
                                f6Var.F = System.currentTimeMillis();
                                x61 x61Var2 = f6Var.e;
                                long duration2 = (long) (f6Var.d.Z * f6Var.getDuration());
                                x61Var2.M(duration2, false);
                                f6Var.w(true);
                                f6Var.y(true);
                                o10 = duration2;
                                f6Var.B.setProgress(f6Var.e.o());
                            }
                        }
                        f6Var.w(o10 < f6Var.E);
                        f6Var.y(o10 < f6Var.E);
                        f6Var.B.setProgress(f6Var.e.o());
                    } else {
                        f6Var.B.setProgress(f6Var.e.o());
                    }
                    if (f6Var.e.z()) {
                        AndroidUtilities.cancelRunOnUIThread(a6Var);
                        AndroidUtilities.runOnUIThread(a6Var, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    }
                    f6Var.E = o10;
                    break;
                }
                break;
            case 4:
                f6 f6Var2 = this.b;
                a6 a6Var2 = f6Var2.H;
                if (f6Var2.y != null && f6Var2.e == null && f6Var2.x == null && f6Var2.B != null && !f6Var2.j()) {
                    long o11 = f6Var2.y.o();
                    o7 o7Var2 = f6Var2.d;
                    if (o7Var2 != null) {
                        float f9 = o11;
                        float f10 = o7Var2.E;
                        float f11 = o7Var2.C;
                        if ((f9 < f10 * f11 || f9 > o7Var2.F * f11) && System.currentTimeMillis() - f6Var2.F > 500) {
                            f6Var2.F = System.currentTimeMillis();
                            x61 x61Var3 = f6Var2.y;
                            long j10 = (long) (f6Var2.d.E * r3.C);
                            x61Var3.M(j10, false);
                            o11 = j10;
                        }
                    }
                    f6Var2.B.setProgress(o11);
                    if (f6Var2.y.z()) {
                        AndroidUtilities.cancelRunOnUIThread(a6Var2);
                        AndroidUtilities.runOnUIThread(a6Var2, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            case 5:
                f6 f6Var3 = this.b;
                a6 a6Var3 = f6Var3.I;
                if (f6Var3.x != null && f6Var3.e == null && !f6Var3.j() && f6Var3.B != null) {
                    long o12 = f6Var3.x.o();
                    o7 o7Var3 = f6Var3.d;
                    if (o7Var3 != null) {
                        float f12 = o12;
                        float f13 = o7Var3.s0;
                        float f14 = o7Var3.q0;
                        if ((f12 < f13 * f14 || f12 > o7Var3.t0 * f14) && System.currentTimeMillis() - f6Var3.F > 500) {
                            f6Var3.F = System.currentTimeMillis();
                            x61 x61Var4 = f6Var3.x;
                            long j11 = (long) (f6Var3.d.s0 * r3.q0);
                            x61Var4.M(j11, false);
                            f6Var3.w(true);
                            o12 = j11;
                        }
                    }
                    f6Var3.B.setProgress(o12);
                    if (f6Var3.x.z()) {
                        AndroidUtilities.cancelRunOnUIThread(a6Var3);
                        AndroidUtilities.runOnUIThread(a6Var3, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            default:
                f6 f6Var4 = this.b;
                l61 l61Var = f6Var4.n;
                if (l61Var != null) {
                    qz qzVar = l61Var.b;
                    if (qzVar != null) {
                        qzVar.postRunnable(new nz(qzVar, 0));
                    }
                    l61Var.a = null;
                    f6Var4.removeView(f6Var4.n);
                    f6Var4.n = null;
                    break;
                }
                break;
        }
    }
}
