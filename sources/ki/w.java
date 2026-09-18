package ki;

import ai.s4;
import android.os.SystemClock;
import hg.k0;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;

    public /* synthetic */ w(h0 h0Var, int i10) {
        this.a = i10;
        this.b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h0 h0Var = this.b;
                o oVar = h0Var.J;
                File file = h0Var.K;
                if (oVar != null) {
                    try {
                        synchronized (oVar) {
                            oVar.c();
                        }
                    } catch (IOException unused) {
                    }
                    w7.k.c(oVar.a);
                }
                if (file != null) {
                    w7.k.c(file);
                    return;
                }
                return;
            case 1:
                h0 h0Var2 = this.b;
                if (h0Var2.Q == 3) {
                    h0Var2.n();
                    return;
                }
                return;
            case 2:
                h0 h0Var3 = this.b;
                h0Var3.v = false;
                h0Var3.l.b("recording segment stopped: state=" + k0.C(h0Var3.Q) + ", retainedDurationMs=" + h0Var3.y);
                if (h0Var3.u) {
                    h0Var3.u = false;
                    h0Var3.h();
                    return;
                }
                if (h0Var3.s) {
                    h0Var3.s = false;
                    h0Var3.i.execute(new s4(h0Var3, h0Var3.J, h0Var3.t, h0Var3.I, 6));
                    return;
                }
                if (h0Var3.Q != 4) {
                    return;
                }
                try {
                    File createTempFile = File.createTempFile("round_video_preview_", ".mp4", h0Var3.a.getCacheDir());
                    h0Var3.K = createTempFile;
                    h0Var3.D = System.nanoTime();
                    h0Var3.l.b("preview snapshot started: file=" + createTempFile.getName());
                    h0Var3.i.execute(new gg.t(h0Var3, h0Var3.J, createTempFile, 23));
                    return;
                } catch (IOException e) {
                    h0Var3.g(e);
                    return;
                }
            default:
                h0 h0Var4 = this.b;
                int i10 = h0Var4.Q;
                if (i10 == 2 || i10 == 6) {
                    h0Var4.z = SystemClock.elapsedRealtime();
                    h0Var4.l.b("recording started: retainedDurationMs=" + h0Var4.y);
                    h0Var4.u(3);
                    long j3 = h0Var4.m - h0Var4.y;
                    if (j3 <= 0) {
                        h0Var4.n();
                        return;
                    } else {
                        h0Var4.h.postDelayed(h0Var4.M, j3);
                        return;
                    }
                }
                return;
        }
    }
}
