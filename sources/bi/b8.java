package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class b8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8 b;

    public /* synthetic */ b8(e8 e8Var, int i10) {
        this.a = i10;
        this.b = e8Var;
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
                e8 e8Var = this.b;
                b8 b8Var = e8Var.K;
                t71 t71Var = e8Var.e;
                if (t71Var != null && e8Var.F != null) {
                    long n10 = t71Var.n();
                    if (e8Var.getDuration() > 1) {
                        float duration = n10 / e8Var.getDuration();
                        if (!e8Var.F.m1) {
                            r9 r9Var = e8Var.d;
                            if ((duration < r9Var.Z || duration > r9Var.a0) && System.currentTimeMillis() - e8Var.J > 500) {
                                e8Var.J = System.currentTimeMillis();
                                t71 t71Var2 = e8Var.e;
                                long duration2 = (long) (e8Var.d.Z * e8Var.getDuration());
                                t71Var2.L(duration2, false);
                                e8Var.w(true);
                                e8Var.y(true);
                                n10 = duration2;
                                e8Var.F.setProgress(e8Var.e.n());
                            }
                        }
                        e8Var.w(n10 < e8Var.I);
                        e8Var.y(n10 < e8Var.I);
                        e8Var.F.setProgress(e8Var.e.n());
                    } else {
                        e8Var.F.setProgress(e8Var.e.n());
                    }
                    if (e8Var.e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(b8Var);
                        AndroidUtilities.runOnUIThread(b8Var, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    }
                    e8Var.I = n10;
                    break;
                }
                break;
            case 4:
                e8 e8Var2 = this.b;
                b8 b8Var2 = e8Var2.L;
                if (e8Var2.y != null && e8Var2.e == null && e8Var2.x == null && e8Var2.F != null && !e8Var2.j()) {
                    long n11 = e8Var2.y.n();
                    r9 r9Var2 = e8Var2.d;
                    if (r9Var2 != null) {
                        float f7 = n11;
                        float f10 = r9Var2.E;
                        float f11 = r9Var2.C;
                        if ((f7 < f10 * f11 || f7 > r9Var2.F * f11) && System.currentTimeMillis() - e8Var2.J > 500) {
                            e8Var2.J = System.currentTimeMillis();
                            t71 t71Var3 = e8Var2.y;
                            long j3 = (long) (e8Var2.d.E * r3.C);
                            t71Var3.L(j3, false);
                            n11 = j3;
                        }
                    }
                    e8Var2.F.setProgress(n11);
                    if (e8Var2.y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(b8Var2);
                        AndroidUtilities.runOnUIThread(b8Var2, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            case 5:
                e8 e8Var3 = this.b;
                b8 b8Var3 = e8Var3.M;
                if (e8Var3.x != null && e8Var3.e == null && !e8Var3.j() && e8Var3.F != null) {
                    long n12 = e8Var3.x.n();
                    r9 r9Var3 = e8Var3.d;
                    if (r9Var3 != null) {
                        float f12 = n12;
                        float f13 = r9Var3.s0;
                        float f14 = r9Var3.q0;
                        if ((f12 < f13 * f14 || f12 > r9Var3.t0 * f14) && System.currentTimeMillis() - e8Var3.J > 500) {
                            e8Var3.J = System.currentTimeMillis();
                            t71 t71Var4 = e8Var3.x;
                            long j10 = (long) (e8Var3.d.s0 * r3.q0);
                            t71Var4.L(j10, false);
                            e8Var3.w(true);
                            n12 = j10;
                        }
                    }
                    e8Var3.F.setProgress(n12);
                    if (e8Var3.x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(b8Var3);
                        AndroidUtilities.runOnUIThread(b8Var3, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            default:
                e8 e8Var4 = this.b;
                h71 h71Var = e8Var4.n;
                if (h71Var != null) {
                    c00 c00Var = h71Var.b;
                    if (c00Var != null) {
                        c00Var.postRunnable(new zz(c00Var, 0));
                    }
                    h71Var.a = null;
                    e8Var4.removeView(e8Var4.n);
                    e8Var4.n = null;
                    break;
                }
                break;
        }
    }
}
