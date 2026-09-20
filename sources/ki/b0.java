package ki;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.z50;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ o0 b;
    public final /* synthetic */ k0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ File e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ b0(o0 o0Var, k0 k0Var, long j3, File file, boolean z10) {
        this.b = o0Var;
        this.c = k0Var;
        this.d = j3;
        this.e = file;
        this.f = z10;
    }

    private final void a() {
        o0 o0Var = this.b;
        k0 k0Var = this.c;
        File file = this.e;
        long j3 = this.d;
        boolean z10 = this.f;
        if (k0Var.d) {
            return;
        }
        l0 l0Var = o0Var.d;
        long j10 = k0Var.a;
        long length = file.length();
        p01 p01Var = (p01) l0Var;
        synchronized (p01Var) {
            n01 n01Var = (n01) p01Var.c.get(Long.valueOf(j10));
            if (!p01Var.d && n01Var != null && !n01Var.e) {
                p01Var.c(n01Var);
                n01Var.b = Math.max(n01Var.b, length);
                n01Var.c = length;
                FileLoader.getInstance(p01Var.a).checkUploadNewDataAvailable(file.getAbsolutePath(), p01Var.b, n01Var.b, length);
            }
        }
        o0Var.h.post(new b0(o0Var, k0Var, j3, file, z10));
    }

    @Override // java.lang.Runnable
    public final void run() {
        o01 o01Var;
        o01 o01Var2;
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                o0 o0Var = this.b;
                k0 k0Var = this.c;
                long j3 = this.d;
                File file = this.e;
                boolean z10 = this.f;
                int i10 = o0Var.U;
                if (i10 == 10 || i10 == 9) {
                    return;
                }
                o0Var.u(8);
                o0Var.l.b("output completed: generation=" + k0Var.a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                o0Var.l("completed");
                l.d dVar = o0Var.c;
                long j10 = k0Var.a;
                z50 z50Var = (z50) dVar.a;
                y50 y50Var = z50Var.Q;
                if (y50Var == null) {
                    return;
                }
                z50Var.Q = null;
                z50Var.d0 = true;
                p01 p01Var = z50Var.O;
                if (p01Var == null) {
                    o01Var2 = null;
                } else {
                    synchronized (p01Var) {
                        n01 n01Var = (n01) p01Var.c.get(Long.valueOf(j10));
                        if (n01Var != null && !n01Var.e) {
                            o01Var = new o01(Math.max(n01Var.c, file.length()), n01Var.f, n01Var.g, n01Var.h, n01Var.i);
                        }
                        o01Var = new o01(file.length(), null, null, null, null);
                    }
                    o01Var2 = o01Var;
                }
                VideoEditedInfo n10 = z50Var.n(file, j3, o01Var2);
                n10.muted = !z10;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = y50Var.c;
                photoEntry.effectId = y50Var.d;
                z50Var.d.q(photoEntry, n10, y50Var.a, y50Var.b, 0, false, y50Var.e);
                p01 p01Var2 = z50Var.O;
                if (p01Var2 != null) {
                    p01Var2.b(false);
                }
                z50Var.O = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
        }
    }

    public /* synthetic */ b0(o0 o0Var, k0 k0Var, File file, long j3, boolean z10) {
        this.b = o0Var;
        this.c = k0Var;
        this.e = file;
        this.d = j3;
        this.f = z10;
    }
}
