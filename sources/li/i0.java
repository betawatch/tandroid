package li;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.x20;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.i50;
import org.telegram.ui.Components.j71;
import org.telegram.ui.mk;
import org.telegram.ui.re;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ i0(x0 x0Var, long j10, int i10) {
        this.a = i10;
        this.b = x0Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        mk mkVar;
        j71 j71Var;
        switch (this.a) {
            case 0:
                x0 x0Var = this.b;
                long j10 = this.c;
                if (x0Var.Z == 6) {
                    x0Var.H = j10;
                    x0Var.N = 0L;
                    x0Var.J = 0L;
                    x0Var.K = j10;
                    x0Var.w(2);
                    x0Var.l.X(x0Var.T, x0Var.H * 1000, x0Var.r);
                    break;
                }
                break;
            default:
                x0 x0Var2 = this.b;
                long j11 = this.c;
                if (x0Var2.Z == 4) {
                    x0Var2.N = j11;
                    long min = Math.min(x0Var2.q, j11);
                    x0Var2.H = min;
                    x0Var2.J = 0L;
                    x0Var2.K = min;
                    x0Var2.b.setSurfaceTextureListener(null);
                    x0Var2.b.setTransform(x0Var2.h);
                    i2.i0 a2 = new i2.n(x0Var2.a).a();
                    x0Var2.V = a2;
                    a2.z1(x0Var2.b);
                    x0Var2.V.s0(b2.p0.b(Uri.fromFile(x0Var2.U)));
                    x0Var2.V.k(0);
                    x0Var2.V.S(1.0f);
                    x0Var2.V.o0(x0Var2.Y);
                    x0Var2.V.a();
                    x0Var2.V.Z0(5, x0Var2.J);
                    x0Var2.m.b("preview player prepared: durationMs=" + x0Var2.H + ", trim=" + x0Var2.J + ".." + x0Var2.K);
                    x0Var2.w(5);
                    k2.m0 m0Var = x0Var2.d;
                    long j12 = x0Var2.H;
                    long j13 = x0Var2.J;
                    long j14 = x0Var2.K;
                    ((d50) m0Var.a).w.setProgress(((float) j12) / 60000.0f);
                    d50 d50Var = (d50) m0Var.a;
                    d50Var.i0 = false;
                    d50Var.H.setAlpha(0.0f);
                    d50 d50Var2 = (d50) m0Var.a;
                    if (d50Var2.U == null) {
                        x0 x0Var3 = d50Var2.O;
                        if (x0Var3 == null) {
                            file = null;
                        } else {
                            x0.u();
                            file = x0Var3.U;
                        }
                        if (file != null) {
                            d50 d50Var3 = (d50) m0Var.a;
                            d50Var3.T = d50Var3.s(file, j12, null);
                            d50 d50Var4 = (d50) m0Var.a;
                            x20 x20Var = d50Var4.T;
                            x20Var.a = j13 > 0 ? j13 : -1L;
                            x20Var.b = j14 < j12 ? j14 : -1L;
                            zs.f(d50Var4.f).k(zs.s2, Integer.valueOf(((d50) m0Var.a).h), ((d50) m0Var.a).T, file.getAbsolutePath(), new ArrayList());
                            float max = Math.max(1L, j12);
                            d50 d50Var5 = (d50) m0Var.a;
                            float f7 = j13 / max;
                            float f10 = j14 / max;
                            i50 i50Var = d50Var5.b;
                            if (i50Var != null && (mkVar = ((re) i50Var).b.Z) != null && (j71Var = mkVar.f1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                                j71Var.b = max2;
                                j71Var.c = Math.max(max2, Math.min(1.0f, f10));
                                j71Var.invalidate();
                            }
                        }
                    }
                    x0Var2.r();
                    break;
                }
                break;
        }
    }
}
