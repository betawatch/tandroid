package li;

import android.os.SystemClock;
import bi.n4;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x0 b;

    public /* synthetic */ l0(x0 x0Var, int i10) {
        this.a = i10;
        this.b = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x0 x0Var = this.b;
                if (x0Var.Z == 3) {
                    x0Var.q();
                    return;
                }
                return;
            case 1:
                x0 x0Var2 = this.b;
                z zVar = x0Var2.T;
                File file = x0Var2.U;
                if (zVar != null) {
                    try {
                        synchronized (zVar) {
                            zVar.w = true;
                            try {
                                zVar.g();
                            } finally {
                                zVar.w = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    w7.q.c(zVar.a);
                }
                if (file != null) {
                    w7.q.c(file);
                    return;
                }
                return;
            case 2:
                x0 x0Var3 = this.b;
                int i10 = x0Var3.Z;
                if (i10 == 2 || i10 == 6) {
                    x0Var3.I = SystemClock.elapsedRealtime();
                    x0Var3.m.b("recording started: retainedDurationMs=" + x0Var3.H);
                    x0Var3.w(3);
                    long j10 = x0Var3.q - x0Var3.H;
                    if (j10 > 0 && !x0Var3.D) {
                        x0Var3.i.postDelayed(x0Var3.W, j10);
                        return;
                    } else {
                        x0Var3.D = false;
                        x0Var3.q();
                        return;
                    }
                }
                return;
            default:
                x0 x0Var4 = this.b;
                x0Var4.E = false;
                x0Var4.m.b("recording segment stopped: state=" + i0.a.A(x0Var4.Z) + ", retainedDurationMs=" + x0Var4.H);
                if (x0Var4.C) {
                    x0Var4.C = false;
                    x0Var4.i();
                    return;
                }
                if (x0Var4.A) {
                    x0Var4.A = false;
                    x0Var4.j.execute(new n4(x0Var4, x0Var4.T, x0Var4.B, x0Var4.S, 3));
                    return;
                }
                if (x0Var4.Z != 4) {
                    return;
                }
                try {
                    File d = x0Var4.d("round_video_preview_");
                    x0Var4.U = d;
                    x0Var4.M = System.nanoTime();
                    x0Var4.m.b("preview snapshot started: file=" + d.getName());
                    x0Var4.j.execute(new s(x0Var4, x0Var4.T, d, 1));
                    return;
                } catch (IOException e) {
                    x0Var4.h(e);
                    return;
                }
        }
    }
}
