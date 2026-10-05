package ki;

import ai.s4;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ b0(s0 s0Var, int i10) {
        this.a = i10;
        this.b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s0 s0Var = this.b;
                t tVar = s0Var.Q;
                File file = s0Var.R;
                if (tVar != null) {
                    try {
                        synchronized (tVar) {
                            tVar.v = true;
                            try {
                                tVar.g();
                            } finally {
                                tVar.v = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    w7.k.c(tVar.a);
                }
                if (file != null) {
                    w7.k.c(file);
                    return;
                }
                return;
            case 1:
                s0 s0Var2 = this.b;
                if (s0Var2.W == 3) {
                    s0Var2.p();
                    return;
                }
                return;
            case 2:
                s0 s0Var3 = this.b;
                int i10 = s0Var3.W;
                if (i10 == 2 || i10 == 6) {
                    s0Var3.F = SystemClock.elapsedRealtime();
                    s0Var3.m.b("recording started: retainedDurationMs=" + s0Var3.E);
                    s0Var3.v(3);
                    long j3 = s0Var3.o - s0Var3.E;
                    if (j3 <= 0) {
                        s0Var3.p();
                        return;
                    } else {
                        s0Var3.i.postDelayed(s0Var3.T, j3);
                        return;
                    }
                }
                return;
            default:
                s0 s0Var4 = this.b;
                s0Var4.B = false;
                s0Var4.m.b("recording segment stopped: state=" + hg.c.B(s0Var4.W) + ", retainedDurationMs=" + s0Var4.E);
                if (s0Var4.A) {
                    s0Var4.A = false;
                    s0Var4.i();
                    return;
                }
                if (s0Var4.y) {
                    s0Var4.y = false;
                    s0Var4.j.execute(new s4(s0Var4, s0Var4.Q, s0Var4.z, s0Var4.P, 6));
                    return;
                }
                if (s0Var4.W != 4) {
                    return;
                }
                try {
                    File d = s0Var4.d("round_video_preview_");
                    s0Var4.R = d;
                    s0Var4.J = System.nanoTime();
                    s0Var4.m.b("preview snapshot started: file=" + d.getName());
                    s0Var4.j.execute(new gg.t(s0Var4, s0Var4.Q, d, 23));
                    return;
                } catch (IOException e7) {
                    s0Var4.h(e7);
                    return;
                }
        }
    }
}
