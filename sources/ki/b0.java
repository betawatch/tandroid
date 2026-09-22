package ki;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.x50;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ q0 b;
    public final /* synthetic */ m0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ File e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ b0(q0 q0Var, m0 m0Var, long j3, File file, boolean z10) {
        this.b = q0Var;
        this.c = m0Var;
        this.d = j3;
        this.e = file;
        this.f = z10;
    }

    private final void a() {
        q0 q0Var = this.b;
        m0 m0Var = this.c;
        File file = this.e;
        long j3 = this.d;
        boolean z10 = this.f;
        if (m0Var.d) {
            return;
        }
        n0 n0Var = q0Var.d;
        long j10 = m0Var.a;
        long length = file.length();
        r01 r01Var = (r01) n0Var;
        synchronized (r01Var) {
            p01 p01Var = (p01) r01Var.c.get(Long.valueOf(j10));
            if (!r01Var.d && p01Var != null && !p01Var.e) {
                r01Var.c(p01Var);
                p01Var.b = Math.max(p01Var.b, length);
                p01Var.c = length;
                FileLoader.getInstance(r01Var.a).checkUploadNewDataAvailable(file.getAbsolutePath(), r01Var.b, p01Var.b, length);
            }
        }
        q0Var.h.post(new b0(q0Var, m0Var, j3, file, z10));
    }

    @Override // java.lang.Runnable
    public final void run() {
        q01 q01Var;
        q01 q01Var2;
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                q0 q0Var = this.b;
                m0 m0Var = this.c;
                long j3 = this.d;
                File file = this.e;
                boolean z10 = this.f;
                int i10 = q0Var.U;
                if (i10 == 10 || i10 == 9) {
                    return;
                }
                q0Var.u(8);
                q0Var.l.b("output completed: generation=" + m0Var.a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                q0Var.l("completed");
                x50 x50Var = q0Var.c;
                long j10 = m0Var.a;
                b60 b60Var = x50Var.a;
                a60 a60Var = b60Var.S;
                if (a60Var == null) {
                    return;
                }
                b60Var.S = null;
                b60Var.f0 = true;
                r01 r01Var = b60Var.Q;
                if (r01Var == null) {
                    q01Var2 = null;
                } else {
                    synchronized (r01Var) {
                        p01 p01Var = (p01) r01Var.c.get(Long.valueOf(j10));
                        if (p01Var != null && !p01Var.e) {
                            q01Var = new q01(Math.max(p01Var.c, file.length()), p01Var.f, p01Var.g, p01Var.h, p01Var.i);
                        }
                        q01Var = new q01(file.length(), null, null, null, null);
                    }
                    q01Var2 = q01Var;
                }
                VideoEditedInfo o9 = b60Var.o(file, j3, q01Var2);
                o9.muted = !z10;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = a60Var.c;
                photoEntry.effectId = a60Var.d;
                b60Var.f.q(photoEntry, o9, a60Var.a, a60Var.b, 0, false, a60Var.e);
                r01 r01Var2 = b60Var.Q;
                if (r01Var2 != null) {
                    r01Var2.b(false);
                }
                b60Var.Q = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
        }
    }

    public /* synthetic */ b0(q0 q0Var, m0 m0Var, File file, long j3, boolean z10) {
        this.b = q0Var;
        this.c = m0Var;
        this.e = file;
        this.d = j3;
        this.f = z10;
    }
}
