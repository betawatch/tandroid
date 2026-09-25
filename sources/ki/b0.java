package ki;

import ai.s4;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                t tVar = s0Var.P;
                File file = s0Var.Q;
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
                s0 s0Var2 = this.b;
                if (s0Var2.V == 3) {
                    s0Var2.o();
                    return;
                }
                return;
            case 2:
                s0 s0Var3 = this.b;
                int i10 = s0Var3.V;
                if (i10 == 2 || i10 == 6) {
                    s0Var3.E = SystemClock.elapsedRealtime();
                    s0Var3.l.b("recording started: retainedDurationMs=" + s0Var3.D);
                    s0Var3.u(3);
                    long j3 = s0Var3.n - s0Var3.D;
                    if (j3 <= 0) {
                        s0Var3.o();
                        return;
                    } else {
                        s0Var3.h.postDelayed(s0Var3.S, j3);
                        return;
                    }
                }
                return;
            default:
                s0 s0Var4 = this.b;
                s0Var4.A = false;
                s0Var4.l.b("recording segment stopped: state=" + hg.c.C(s0Var4.V) + ", retainedDurationMs=" + s0Var4.D);
                if (s0Var4.z) {
                    s0Var4.z = false;
                    s0Var4.h();
                    return;
                }
                if (s0Var4.x) {
                    s0Var4.x = false;
                    s0Var4.i.execute(new s4(s0Var4, s0Var4.P, s0Var4.y, s0Var4.O, 6));
                    return;
                }
                if (s0Var4.V != 4) {
                    return;
                }
                try {
                    File createTempFile = File.createTempFile("round_video_preview_", ".mp4", s0Var4.a.getCacheDir());
                    s0Var4.Q = createTempFile;
                    s0Var4.I = System.nanoTime();
                    s0Var4.l.b("preview snapshot started: file=" + createTempFile.getName());
                    s0Var4.i.execute(new gg.t(s0Var4, s0Var4.P, createTempFile, 23));
                    return;
                } catch (IOException e) {
                    s0Var4.g(e);
                    return;
                }
        }
    }
}
