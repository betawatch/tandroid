package ki;

import ai.s4;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ b0(r0 r0Var, int i10) {
        this.a = i10;
        this.b = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r0 r0Var = this.b;
                t tVar = r0Var.P;
                File file = r0Var.Q;
                if (tVar != null) {
                    try {
                        synchronized (tVar) {
                            tVar.u = true;
                            try {
                                tVar.f();
                            } finally {
                                tVar.u = false;
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
                r0 r0Var2 = this.b;
                if (r0Var2.V == 3) {
                    r0Var2.o();
                    return;
                }
                return;
            case 2:
                r0 r0Var3 = this.b;
                r0Var3.A = false;
                r0Var3.l.b("recording segment stopped: state=" + hg.c.C(r0Var3.V) + ", retainedDurationMs=" + r0Var3.D);
                if (r0Var3.z) {
                    r0Var3.z = false;
                    r0Var3.h();
                    return;
                }
                if (r0Var3.x) {
                    r0Var3.x = false;
                    r0Var3.i.execute(new s4(r0Var3, r0Var3.P, r0Var3.y, r0Var3.O, 6));
                    return;
                }
                if (r0Var3.V != 4) {
                    return;
                }
                try {
                    File createTempFile = File.createTempFile("round_video_preview_", ".mp4", r0Var3.a.getCacheDir());
                    r0Var3.Q = createTempFile;
                    r0Var3.I = System.nanoTime();
                    r0Var3.l.b("preview snapshot started: file=" + createTempFile.getName());
                    r0Var3.i.execute(new gg.t(r0Var3, r0Var3.P, createTempFile, 23));
                    return;
                } catch (IOException e) {
                    r0Var3.g(e);
                    return;
                }
            default:
                r0 r0Var4 = this.b;
                int i10 = r0Var4.V;
                if (i10 == 2 || i10 == 6) {
                    r0Var4.E = SystemClock.elapsedRealtime();
                    r0Var4.l.b("recording started: retainedDurationMs=" + r0Var4.D);
                    r0Var4.u(3);
                    long j3 = r0Var4.n - r0Var4.D;
                    if (j3 <= 0) {
                        r0Var4.o();
                        return;
                    } else {
                        r0Var4.h.postDelayed(r0Var4.S, j3);
                        return;
                    }
                }
                return;
        }
    }
}
