package ki;

import ai.s4;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;

    public /* synthetic */ y(o0 o0Var, int i10) {
        this.a = i10;
        this.b = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o0 o0Var = this.b;
                q qVar = o0Var.O;
                File file = o0Var.P;
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
                o0 o0Var2 = this.b;
                if (o0Var2.U == 3) {
                    o0Var2.o();
                    return;
                }
                return;
            case 2:
                o0 o0Var3 = this.b;
                o0Var3.A = false;
                o0Var3.l.b("recording segment stopped: state=" + hg.k0.C(o0Var3.U) + ", retainedDurationMs=" + o0Var3.D);
                if (o0Var3.z) {
                    o0Var3.z = false;
                    o0Var3.h();
                    return;
                }
                if (o0Var3.x) {
                    o0Var3.x = false;
                    o0Var3.i.execute(new s4(o0Var3, o0Var3.O, o0Var3.y, o0Var3.N, 6));
                    return;
                }
                if (o0Var3.U != 4) {
                    return;
                }
                try {
                    File createTempFile = File.createTempFile("round_video_preview_", ".mp4", o0Var3.a.getCacheDir());
                    o0Var3.P = createTempFile;
                    o0Var3.I = System.nanoTime();
                    o0Var3.l.b("preview snapshot started: file=" + createTempFile.getName());
                    o0Var3.i.execute(new gg.t(o0Var3, o0Var3.O, createTempFile, 23));
                    return;
                } catch (IOException e) {
                    o0Var3.g(e);
                    return;
                }
            default:
                o0 o0Var4 = this.b;
                int i10 = o0Var4.U;
                if (i10 == 2 || i10 == 6) {
                    o0Var4.E = SystemClock.elapsedRealtime();
                    o0Var4.l.b("recording started: retainedDurationMs=" + o0Var4.D);
                    o0Var4.u(3);
                    long j3 = o0Var4.n - o0Var4.D;
                    if (j3 <= 0) {
                        o0Var4.o();
                        return;
                    } else {
                        o0Var4.h.postDelayed(o0Var4.R, j3);
                        return;
                    }
                }
                return;
        }
    }
}
