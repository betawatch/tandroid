package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.m61;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q6 b;

    public /* synthetic */ m6(q6 q6Var, int i10) {
        this.a = i10;
        this.b = q6Var;
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
                q6 q6Var = this.b;
                m6 m6Var = q6Var.G;
                m61 m61Var = q6Var.e;
                if (m61Var != null && q6Var.B != null) {
                    long o10 = m61Var.o();
                    if (q6Var.getDuration() > 1) {
                        float duration = o10 / q6Var.getDuration();
                        if (!q6Var.B.i1) {
                            z7 z7Var = q6Var.d;
                            if ((duration < z7Var.Z || duration > z7Var.a0) && System.currentTimeMillis() - q6Var.F > 500) {
                                q6Var.F = System.currentTimeMillis();
                                m61 m61Var2 = q6Var.e;
                                long duration2 = (long) (q6Var.d.Z * q6Var.getDuration());
                                m61Var2.M(duration2, false);
                                q6Var.w(true);
                                q6Var.y(true);
                                o10 = duration2;
                                q6Var.B.setProgress(q6Var.e.o());
                            }
                        }
                        q6Var.w(o10 < q6Var.E);
                        q6Var.y(o10 < q6Var.E);
                        q6Var.B.setProgress(q6Var.e.o());
                    } else {
                        q6Var.B.setProgress(q6Var.e.o());
                    }
                    if (q6Var.e.z()) {
                        AndroidUtilities.cancelRunOnUIThread(m6Var);
                        AndroidUtilities.runOnUIThread(m6Var, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    }
                    q6Var.E = o10;
                    break;
                }
                break;
            case 4:
                q6 q6Var2 = this.b;
                m6 m6Var2 = q6Var2.H;
                if (q6Var2.y != null && q6Var2.e == null && q6Var2.x == null && q6Var2.B != null && !q6Var2.j()) {
                    long o11 = q6Var2.y.o();
                    z7 z7Var2 = q6Var2.d;
                    if (z7Var2 != null) {
                        float f10 = o11;
                        float f11 = z7Var2.E;
                        float f12 = z7Var2.C;
                        if ((f10 < f11 * f12 || f10 > z7Var2.F * f12) && System.currentTimeMillis() - q6Var2.F > 500) {
                            q6Var2.F = System.currentTimeMillis();
                            m61 m61Var3 = q6Var2.y;
                            long j10 = (long) (q6Var2.d.E * r3.C);
                            m61Var3.M(j10, false);
                            o11 = j10;
                        }
                    }
                    q6Var2.B.setProgress(o11);
                    if (q6Var2.y.z()) {
                        AndroidUtilities.cancelRunOnUIThread(m6Var2);
                        AndroidUtilities.runOnUIThread(m6Var2, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            case 5:
                q6 q6Var3 = this.b;
                m6 m6Var3 = q6Var3.I;
                if (q6Var3.x != null && q6Var3.e == null && !q6Var3.j() && q6Var3.B != null) {
                    long o12 = q6Var3.x.o();
                    z7 z7Var3 = q6Var3.d;
                    if (z7Var3 != null) {
                        float f13 = o12;
                        float f14 = z7Var3.s0;
                        float f15 = z7Var3.q0;
                        if ((f13 < f14 * f15 || f13 > z7Var3.t0 * f15) && System.currentTimeMillis() - q6Var3.F > 500) {
                            q6Var3.F = System.currentTimeMillis();
                            m61 m61Var4 = q6Var3.x;
                            long j11 = (long) (q6Var3.d.s0 * r3.q0);
                            m61Var4.M(j11, false);
                            q6Var3.w(true);
                            o12 = j11;
                        }
                    }
                    q6Var3.B.setProgress(o12);
                    if (q6Var3.x.z()) {
                        AndroidUtilities.cancelRunOnUIThread(m6Var3);
                        AndroidUtilities.runOnUIThread(m6Var3, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                        break;
                    }
                }
                break;
            default:
                q6 q6Var4 = this.b;
                a61 a61Var = q6Var4.n;
                if (a61Var != null) {
                    jz jzVar = a61Var.b;
                    if (jzVar != null) {
                        jzVar.postRunnable(new gz(jzVar, 0));
                    }
                    a61Var.a = null;
                    q6Var4.removeView(q6Var4.n);
                    q6Var4.n = null;
                    break;
                }
                break;
        }
    }
}
