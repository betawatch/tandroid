package ki;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.z50;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ h0 b;
    public final /* synthetic */ e0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ File e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ z(h0 h0Var, e0 e0Var, long j3, File file, boolean z10) {
        this.b = h0Var;
        this.c = e0Var;
        this.d = j3;
        this.e = file;
        this.f = z10;
    }

    private final void a() {
        h0 h0Var = this.b;
        e0 e0Var = this.c;
        File file = this.e;
        long j3 = this.d;
        boolean z10 = this.f;
        if (e0Var.d) {
            return;
        }
        f0 f0Var = h0Var.d;
        long j10 = e0Var.a;
        long length = file.length();
        q01 q01Var = (q01) f0Var;
        synchronized (q01Var) {
            o01 o01Var = (o01) q01Var.c.get(Long.valueOf(j10));
            if (!q01Var.d && o01Var != null && !o01Var.e) {
                q01Var.c(o01Var);
                o01Var.b = Math.max(o01Var.b, length);
                o01Var.c = length;
                FileLoader.getInstance(q01Var.a).checkUploadNewDataAvailable(file.getAbsolutePath(), q01Var.b, o01Var.b, length);
            }
        }
        h0Var.h.post(new z(h0Var, e0Var, j3, file, z10));
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
                h0 h0Var = this.b;
                e0 e0Var = this.c;
                long j3 = this.d;
                File file = this.e;
                boolean z10 = this.f;
                int i10 = h0Var.Q;
                if (i10 == 10 || i10 == 9) {
                    return;
                }
                h0Var.u(8);
                h0Var.l.b("output completed: generation=" + e0Var.a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                h0Var.l("completed");
                l.d dVar = h0Var.c;
                long j10 = e0Var.a;
                a60 a60Var = (a60) dVar.a;
                z50 z50Var = a60Var.O;
                if (z50Var == null) {
                    return;
                }
                a60Var.O = null;
                a60Var.b0 = true;
                q01 q01Var = a60Var.M;
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
                VideoEditedInfo o9 = a60.o(file, j3, p01Var2);
                o9.muted = !z10;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = z50Var.c;
                photoEntry.effectId = z50Var.d;
                a60Var.d.q(photoEntry, o9, z50Var.a, z50Var.b, 0, false, z50Var.e);
                q01 q01Var2 = a60Var.M;
                if (q01Var2 != null) {
                    q01Var2.b(false);
                }
                a60Var.M = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
        }
    }

    public /* synthetic */ z(h0 h0Var, e0 e0Var, File file, long j3, boolean z10) {
        this.b = h0Var;
        this.c = e0Var;
        this.e = file;
        this.d = j3;
        this.f = z10;
    }
}
