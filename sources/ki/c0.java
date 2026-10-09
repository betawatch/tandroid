package ki;

import ai.t4;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ c0(t0 t0Var, int i10) {
        this.a = i10;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                u uVar = t0Var.Q;
                File file = t0Var.R;
                if (uVar != null) {
                    try {
                        synchronized (uVar) {
                            uVar.v = true;
                            try {
                                uVar.g();
                            } finally {
                                uVar.v = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    w7.j.c(uVar.a);
                }
                if (file != null) {
                    w7.j.c(file);
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.b;
                if (t0Var2.W == 3) {
                    t0Var2.p();
                    return;
                }
                return;
            case 2:
                t0 t0Var3 = this.b;
                int i10 = t0Var3.W;
                if (i10 == 2 || i10 == 6) {
                    t0Var3.F = SystemClock.elapsedRealtime();
                    t0Var3.m.b("recording started: retainedDurationMs=" + t0Var3.E);
                    t0Var3.v(3);
                    long j3 = t0Var3.o - t0Var3.E;
                    if (j3 <= 0) {
                        t0Var3.p();
                        return;
                    } else {
                        t0Var3.i.postDelayed(t0Var3.T, j3);
                        return;
                    }
                }
                return;
            default:
                t0 t0Var4 = this.b;
                t0Var4.B = false;
                t0Var4.m.b("recording segment stopped: state=" + hg.c.C(t0Var4.W) + ", retainedDurationMs=" + t0Var4.E);
                if (t0Var4.A) {
                    t0Var4.A = false;
                    t0Var4.i();
                    return;
                }
                if (t0Var4.y) {
                    t0Var4.y = false;
                    t0Var4.j.execute(new t4(t0Var4, t0Var4.Q, t0Var4.z, t0Var4.P, 6));
                    return;
                }
                if (t0Var4.W != 4) {
                    return;
                }
                try {
                    File d = t0Var4.d("round_video_preview_");
                    t0Var4.R = d;
                    t0Var4.J = System.nanoTime();
                    t0Var4.m.b("preview snapshot started: file=" + d.getName());
                    t0Var4.j.execute(new gg.t(t0Var4, t0Var4.Q, d, 23));
                    return;
                } catch (IOException e7) {
                    t0Var4.h(e7);
                    return;
                }
        }
    }
}
