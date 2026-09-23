package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b7 b;

    public /* synthetic */ z6(b7 b7Var, int i10) {
        this.a = i10;
        this.b = b7Var;
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
                b7 b7Var = this.b;
                z6 z6Var = b7Var.K;
                f71 f71Var = b7Var.e;
                if (f71Var != null && b7Var.F != null) {
                    long n10 = f71Var.n();
                    if (b7Var.getDuration() > 1) {
                        float duration = n10 / b7Var.getDuration();
                        if (!b7Var.F.m1) {
                            l8 l8Var = b7Var.d;
                            if ((duration < l8Var.Z || duration > l8Var.a0) && System.currentTimeMillis() - b7Var.J > 500) {
                                b7Var.J = System.currentTimeMillis();
                                f71 f71Var2 = b7Var.e;
                                long duration2 = (long) (b7Var.d.Z * b7Var.getDuration());
                                f71Var2.L(duration2, false);
                                b7Var.w(true);
                                b7Var.y(true);
                                n10 = duration2;
                                b7Var.F.setProgress(b7Var.e.n());
                            }
                        }
                        b7Var.w(n10 < b7Var.I);
                        b7Var.y(n10 < b7Var.I);
                        b7Var.F.setProgress(b7Var.e.n());
                    } else {
                        b7Var.F.setProgress(b7Var.e.n());
                    }
                    if (b7Var.e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z6Var);
                        AndroidUtilities.runOnUIThread(z6Var, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    }
                    b7Var.I = n10;
                    break;
                }
                break;
            case 4:
                b7 b7Var2 = this.b;
                z6 z6Var2 = b7Var2.L;
                if (b7Var2.y != null && b7Var2.e == null && b7Var2.x == null && b7Var2.F != null && !b7Var2.j()) {
                    long n11 = b7Var2.y.n();
                    l8 l8Var2 = b7Var2.d;
                    if (l8Var2 != null) {
                        float f7 = n11;
                        float f10 = l8Var2.E;
                        float f11 = l8Var2.C;
                        if ((f7 < f10 * f11 || f7 > l8Var2.F * f11) && System.currentTimeMillis() - b7Var2.J > 500) {
                            b7Var2.J = System.currentTimeMillis();
                            f71 f71Var3 = b7Var2.y;
                            long j3 = (long) (b7Var2.d.E * r3.C);
                            f71Var3.L(j3, false);
                            n11 = j3;
                        }
                    }
                    b7Var2.F.setProgress(n11);
                    if (b7Var2.y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z6Var2);
                        AndroidUtilities.runOnUIThread(z6Var2, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            case 5:
                b7 b7Var3 = this.b;
                z6 z6Var3 = b7Var3.M;
                if (b7Var3.x != null && b7Var3.e == null && !b7Var3.j() && b7Var3.F != null) {
                    long n12 = b7Var3.x.n();
                    l8 l8Var3 = b7Var3.d;
                    if (l8Var3 != null) {
                        float f12 = n12;
                        float f13 = l8Var3.s0;
                        float f14 = l8Var3.q0;
                        if ((f12 < f13 * f14 || f12 > l8Var3.t0 * f14) && System.currentTimeMillis() - b7Var3.J > 500) {
                            b7Var3.J = System.currentTimeMillis();
                            f71 f71Var4 = b7Var3.x;
                            long j10 = (long) (b7Var3.d.s0 * r3.q0);
                            f71Var4.L(j10, false);
                            b7Var3.w(true);
                            n12 = j10;
                        }
                    }
                    b7Var3.F.setProgress(n12);
                    if (b7Var3.x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z6Var3);
                        AndroidUtilities.runOnUIThread(z6Var3, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            default:
                b7 b7Var4 = this.b;
                t61 t61Var = b7Var4.n;
                if (t61Var != null) {
                    wz wzVar = t61Var.b;
                    if (wzVar != null) {
                        wzVar.postRunnable(new tz(wzVar, 0));
                    }
                    t61Var.a = null;
                    b7Var4.removeView(b7Var4.n);
                    b7Var4.n = null;
                    break;
                }
                break;
        }
    }
}
