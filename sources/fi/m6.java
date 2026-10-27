package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.t81;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6 b;

    public /* synthetic */ m6(o6 o6Var, int i10) {
        this.a = i10;
        this.b = o6Var;
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
                o6 o6Var = this.b;
                m6 m6Var = o6Var.K;
                t81 t81Var = o6Var.e;
                if (t81Var != null && o6Var.F != null) {
                    long n10 = t81Var.n();
                    if (o6Var.getDuration() > 1) {
                        float duration = n10 / o6Var.getDuration();
                        if (!o6Var.F.m1) {
                            w7 w7Var = o6Var.d;
                            if ((duration < w7Var.Z || duration > w7Var.a0) && System.currentTimeMillis() - o6Var.J > 500) {
                                o6Var.J = System.currentTimeMillis();
                                t81 t81Var2 = o6Var.e;
                                long duration2 = (long) (o6Var.d.Z * o6Var.getDuration());
                                t81Var2.L(duration2, false);
                                o6Var.w(true);
                                o6Var.y(true);
                                n10 = duration2;
                                o6Var.F.setProgress(o6Var.e.n());
                            }
                        }
                        o6Var.w(n10 < o6Var.I);
                        o6Var.y(n10 < o6Var.I);
                        o6Var.F.setProgress(o6Var.e.n());
                    } else {
                        o6Var.F.setProgress(o6Var.e.n());
                    }
                    if (o6Var.e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(m6Var);
                        AndroidUtilities.runOnUIThread(m6Var, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    }
                    o6Var.I = n10;
                    break;
                }
                break;
            case 4:
                o6 o6Var2 = this.b;
                m6 m6Var2 = o6Var2.L;
                if (o6Var2.y != null && o6Var2.e == null && o6Var2.x == null && o6Var2.F != null && !o6Var2.j()) {
                    long n11 = o6Var2.y.n();
                    w7 w7Var2 = o6Var2.d;
                    if (w7Var2 != null) {
                        float f7 = n11;
                        float f10 = w7Var2.E;
                        float f11 = w7Var2.C;
                        if ((f7 < f10 * f11 || f7 > w7Var2.F * f11) && System.currentTimeMillis() - o6Var2.J > 500) {
                            o6Var2.J = System.currentTimeMillis();
                            t81 t81Var3 = o6Var2.y;
                            long j10 = (long) (o6Var2.d.E * r3.C);
                            t81Var3.L(j10, false);
                            n11 = j10;
                        }
                    }
                    o6Var2.F.setProgress(n11);
                    if (o6Var2.y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(m6Var2);
                        AndroidUtilities.runOnUIThread(m6Var2, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            case 5:
                o6 o6Var3 = this.b;
                m6 m6Var3 = o6Var3.M;
                if (o6Var3.x != null && o6Var3.e == null && !o6Var3.j() && o6Var3.F != null) {
                    long n12 = o6Var3.x.n();
                    w7 w7Var3 = o6Var3.d;
                    if (w7Var3 != null) {
                        float f12 = n12;
                        float f13 = w7Var3.s0;
                        float f14 = w7Var3.q0;
                        if ((f12 < f13 * f14 || f12 > w7Var3.t0 * f14) && System.currentTimeMillis() - o6Var3.J > 500) {
                            o6Var3.J = System.currentTimeMillis();
                            t81 t81Var4 = o6Var3.x;
                            long j11 = (long) (o6Var3.d.s0 * r3.q0);
                            t81Var4.L(j11, false);
                            o6Var3.w(true);
                            n12 = j11;
                        }
                    }
                    o6Var3.F.setProgress(n12);
                    if (o6Var3.x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(m6Var3);
                        AndroidUtilities.runOnUIThread(m6Var3, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            default:
                o6 o6Var4 = this.b;
                i81 i81Var = o6Var4.n;
                if (i81Var != null) {
                    e00 e00Var = i81Var.b;
                    if (e00Var != null) {
                        e00Var.postRunnable(new b00(e00Var, 0));
                    }
                    i81Var.a = null;
                    o6Var4.removeView(o6Var4.n);
                    o6Var4.n = null;
                    break;
                }
                break;
        }
    }
}
