package li;

import android.os.SystemClock;
import bi.h4;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ f0(u0 u0Var, int i10) {
        this.a = i10;
        this.b = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u0 u0Var = this.b;
                x xVar = u0Var.Q;
                File file = u0Var.R;
                if (xVar != null) {
                    try {
                        synchronized (xVar) {
                            xVar.v = true;
                            try {
                                xVar.g();
                            } finally {
                                xVar.v = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    w7.p.c(xVar.a);
                }
                if (file != null) {
                    w7.p.c(file);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.b;
                if (u0Var2.W == 3) {
                    u0Var2.p();
                    return;
                }
                return;
            case 2:
                u0 u0Var3 = this.b;
                int i10 = u0Var3.W;
                if (i10 == 2 || i10 == 6) {
                    u0Var3.F = SystemClock.elapsedRealtime();
                    u0Var3.m.b("recording started: retainedDurationMs=" + u0Var3.E);
                    u0Var3.v(3);
                    long j10 = u0Var3.o - u0Var3.E;
                    if (j10 <= 0) {
                        u0Var3.p();
                        return;
                    } else {
                        u0Var3.i.postDelayed(u0Var3.T, j10);
                        return;
                    }
                }
                return;
            default:
                u0 u0Var4 = this.b;
                u0Var4.B = false;
                u0Var4.m.b("recording segment stopped: state=" + i2.d.C(u0Var4.W) + ", retainedDurationMs=" + u0Var4.E);
                if (u0Var4.A) {
                    u0Var4.A = false;
                    u0Var4.i();
                    return;
                }
                if (u0Var4.y) {
                    u0Var4.y = false;
                    u0Var4.j.execute(new h4(u0Var4, u0Var4.Q, u0Var4.z, u0Var4.P, 6));
                    return;
                }
                if (u0Var4.W != 4) {
                    return;
                }
                try {
                    File d = u0Var4.d("round_video_preview_");
                    u0Var4.R = d;
                    u0Var4.J = System.nanoTime();
                    u0Var4.m.b("preview snapshot started: file=" + d.getName());
                    u0Var4.j.execute(new hg.t(u0Var4, u0Var4.Q, d, 25));
                    return;
                } catch (IOException e) {
                    u0Var4.h(e);
                    return;
                }
        }
    }
}
