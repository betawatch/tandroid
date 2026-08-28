package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.y51;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6 b;

    public /* synthetic */ o6(r6 r6Var, int i9) {
        this.a = i9;
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
                o6 o6Var = r6Var.G;
                k61 k61Var = r6Var.e;
                if (k61Var != null && r6Var.B != null) {
                    long o6 = k61Var.o();
                    if (r6Var.getDuration() > 1) {
                        float duration = o6 / r6Var.getDuration();
                        if (!r6Var.B.i1) {
                            a8 a8Var = r6Var.d;
                            if ((duration < a8Var.Z || duration > a8Var.a0) && System.currentTimeMillis() - r6Var.F > 500) {
                                r6Var.F = System.currentTimeMillis();
                                k61 k61Var2 = r6Var.e;
                                long duration2 = (long) (r6Var.d.Z * r6Var.getDuration());
                                k61Var2.M(duration2, false);
                                r6Var.w(true);
                                r6Var.y(true);
                                o6 = duration2;
                                r6Var.B.setProgress(r6Var.e.o());
                            }
                        }
                        r6Var.w(o6 < r6Var.E);
                        r6Var.y(o6 < r6Var.E);
                        r6Var.B.setProgress(r6Var.e.o());
                    } else {
                        r6Var.B.setProgress(r6Var.e.o());
                    }
                    if (r6Var.e.z()) {
                        AndroidUtilities.cancelRunOnUIThread(o6Var);
                        AndroidUtilities.runOnUIThread(o6Var, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    }
                    r6Var.E = o6;
                    break;
                }
                break;
            case 4:
                r6 r6Var2 = this.b;
                o6 o6Var2 = r6Var2.H;
                if (r6Var2.y != null && r6Var2.e == null && r6Var2.x == null && r6Var2.B != null && !r6Var2.j()) {
                    long o9 = r6Var2.y.o();
                    a8 a8Var2 = r6Var2.d;
                    if (a8Var2 != null) {
                        float f10 = o9;
                        float f11 = a8Var2.E;
                        float f12 = a8Var2.C;
                        if ((f10 < f11 * f12 || f10 > a8Var2.F * f12) && System.currentTimeMillis() - r6Var2.F > 500) {
                            r6Var2.F = System.currentTimeMillis();
                            k61 k61Var3 = r6Var2.y;
                            long j10 = (long) (r6Var2.d.E * r3.C);
                            k61Var3.M(j10, false);
                            o9 = j10;
                        }
                    }
                    r6Var2.B.setProgress(o9);
                    if (r6Var2.y.z()) {
                        AndroidUtilities.cancelRunOnUIThread(o6Var2);
                        AndroidUtilities.runOnUIThread(o6Var2, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            case 5:
                r6 r6Var3 = this.b;
                o6 o6Var3 = r6Var3.I;
                if (r6Var3.x != null && r6Var3.e == null && !r6Var3.j() && r6Var3.B != null) {
                    long o10 = r6Var3.x.o();
                    a8 a8Var3 = r6Var3.d;
                    if (a8Var3 != null) {
                        float f13 = o10;
                        float f14 = a8Var3.s0;
                        float f15 = a8Var3.q0;
                        if ((f13 < f14 * f15 || f13 > a8Var3.t0 * f15) && System.currentTimeMillis() - r6Var3.F > 500) {
                            r6Var3.F = System.currentTimeMillis();
                            k61 k61Var4 = r6Var3.x;
                            long j11 = (long) (r6Var3.d.s0 * r3.q0);
                            k61Var4.M(j11, false);
                            r6Var3.w(true);
                            o10 = j11;
                        }
                    }
                    r6Var3.B.setProgress(o10);
                    if (r6Var3.x.z()) {
                        AndroidUtilities.cancelRunOnUIThread(o6Var3);
                        AndroidUtilities.runOnUIThread(o6Var3, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            default:
                r6 r6Var4 = this.b;
                y51 y51Var = r6Var4.n;
                if (y51Var != null) {
                    hz hzVar = y51Var.b;
                    if (hzVar != null) {
                        hzVar.postRunnable(new ez(hzVar, 0));
                    }
                    y51Var.a = null;
                    r6Var4.removeView(r6Var4.n);
                    r6Var4.n = null;
                    break;
                }
                break;
        }
    }
}
