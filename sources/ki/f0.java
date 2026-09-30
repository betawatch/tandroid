package ki;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.q01;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ o0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ File e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ f0(s0 s0Var, o0 o0Var, long j3, File file, boolean z10) {
        this.b = s0Var;
        this.c = o0Var;
        this.d = j3;
        this.e = file;
        this.f = z10;
    }

    private final void a() {
        s0 s0Var = this.b;
        o0 o0Var = this.c;
        File file = this.e;
        long j3 = this.d;
        boolean z10 = this.f;
        synchronized (s0Var.g) {
            if (!s0Var.D && !o0Var.d && !o0Var.e) {
                o0Var.e = true;
                ((q01) s0Var.e).b(o0Var.a, file.length(), file);
                s0Var.i.post(new f0(s0Var, o0Var, j3, file, z10));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        p01 p01Var;
        p01 p01Var2;
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                s0 s0Var = this.b;
                o0 o0Var = this.c;
                long j3 = this.d;
                File file = this.e;
                boolean z10 = this.f;
                int i10 = s0Var.W;
                if (i10 == 10 || i10 == 9) {
                    return;
                }
                s0Var.v(8);
                s0Var.m.b("output completed: generation=" + o0Var.a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                s0Var.m("completed");
                l.d dVar = s0Var.d;
                long j10 = o0Var.a;
                d60 d60Var = (d60) dVar.a;
                c60 c60Var = d60Var.V;
                if (c60Var == null) {
                    return;
                }
                d60Var.V = null;
                d60Var.i0 = true;
                q01 q01Var = d60Var.T;
                if (q01Var == null) {
                    p01Var2 = null;
                } else {
                    synchronized (q01Var) {
                        o01 o01Var = (o01) q01Var.c.get(Long.valueOf(j10));
                        if (o01Var != null && !o01Var.e) {
                            p01Var = new p01(Math.max(o01Var.c, file.length()), o01Var.f, o01Var.g, o01Var.h, o01Var.i);
                        }
                        p01Var = new p01(file.length(), null, null, null, null);
                    }
                    p01Var2 = p01Var;
                }
                VideoEditedInfo p5 = d60Var.p(file, j3, p01Var2);
                p5.muted = !z10;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = c60Var.c;
                photoEntry.effectId = c60Var.d;
                d60Var.f.q(photoEntry, p5, c60Var.a, c60Var.b, 0, false, c60Var.e);
                q01 q01Var2 = d60Var.T;
                if (q01Var2 != null) {
                    q01Var2.d(false);
                }
                d60Var.T = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
        }
    }

    public /* synthetic */ f0(s0 s0Var, o0 o0Var, File file, long j3, boolean z10) {
        this.b = s0Var;
        this.c = o0Var;
        this.e = file;
        this.d = j3;
        this.f = z10;
    }
}
