package ki;

import ai.s4;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ y(q0 q0Var, int i10) {
        this.a = i10;
        this.b = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q0 q0Var = this.b;
                q qVar = q0Var.O;
                File file = q0Var.P;
                if (qVar != null) {
                    try {
                        synchronized (qVar) {
                            qVar.c();
                        }
                    } catch (IOException unused) {
                    }
                    w7.k.c(qVar.a);
                }
                if (file != null) {
                    w7.k.c(file);
                    return;
                }
                return;
            case 1:
                q0 q0Var2 = this.b;
                if (q0Var2.U == 3) {
                    q0Var2.o();
                    return;
                }
                return;
            case 2:
                q0 q0Var3 = this.b;
                q0Var3.A = false;
                q0Var3.l.b("recording segment stopped: state=" + hg.k0.C(q0Var3.U) + ", retainedDurationMs=" + q0Var3.D);
                if (q0Var3.z) {
                    q0Var3.z = false;
                    q0Var3.h();
                    return;
                }
                if (q0Var3.x) {
                    q0Var3.x = false;
                    q0Var3.i.execute(new s4(q0Var3, q0Var3.O, q0Var3.y, q0Var3.N, 6));
                    return;
                }
                if (q0Var3.U != 4) {
                    return;
                }
                try {
                    File createTempFile = File.createTempFile("round_video_preview_", ".mp4", q0Var3.a.getCacheDir());
                    q0Var3.P = createTempFile;
                    q0Var3.I = System.nanoTime();
                    q0Var3.l.b("preview snapshot started: file=" + createTempFile.getName());
                    q0Var3.i.execute(new gg.t(q0Var3, q0Var3.O, createTempFile, 23));
                    return;
                } catch (IOException e) {
                    q0Var3.g(e);
                    return;
                }
            default:
                q0 q0Var4 = this.b;
                int i10 = q0Var4.U;
                if (i10 == 2 || i10 == 6) {
                    q0Var4.E = SystemClock.elapsedRealtime();
                    q0Var4.l.b("recording started: retainedDurationMs=" + q0Var4.D);
                    q0Var4.u(3);
                    long j3 = q0Var4.n - q0Var4.D;
                    if (j3 <= 0) {
                        q0Var4.o();
                        return;
                    } else {
                        q0Var4.h.postDelayed(q0Var4.R, j3);
                        return;
                    }
                }
                return;
        }
    }
}
