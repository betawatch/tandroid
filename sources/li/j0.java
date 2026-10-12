package li;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.o60;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ q0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ File e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ j0(u0 u0Var, q0 q0Var, long j10, File file, boolean z10) {
        this.b = u0Var;
        this.c = q0Var;
        this.d = j10;
        this.e = file;
        this.f = z10;
    }

    private final void a() {
        u0 u0Var = this.b;
        q0 q0Var = this.c;
        File file = this.e;
        long j10 = this.d;
        boolean z10 = this.f;
        synchronized (u0Var.g) {
            if (!u0Var.D && !q0Var.d && !q0Var.e) {
                q0Var.e = true;
                ((c11) u0Var.e).b(q0Var.a, file.length(), file);
                u0Var.i.post(new j0(u0Var, q0Var, j10, file, z10));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        b11 b11Var;
        b11 b11Var2;
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                u0 u0Var = this.b;
                q0 q0Var = this.c;
                long j10 = this.d;
                File file = this.e;
                boolean z10 = this.f;
                int i10 = u0Var.W;
                if (i10 == 10 || i10 == 9) {
                    return;
                }
                u0Var.v(8);
                u0Var.m.b("output completed: generation=" + q0Var.a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                u0Var.m("completed");
                l2.f fVar = u0Var.d;
                long j11 = q0Var.a;
                o60 o60Var = (o60) fVar.b;
                n60 n60Var = o60Var.V;
                if (n60Var == null) {
                    return;
                }
                o60Var.V = null;
                o60Var.j0 = true;
                c11 c11Var = o60Var.T;
                if (c11Var == null) {
                    b11Var2 = null;
                } else {
                    synchronized (c11Var) {
                        a11 a11Var = (a11) c11Var.c.get(Long.valueOf(j11));
                        if (a11Var != null && !a11Var.e) {
                            b11Var = new b11(Math.max(a11Var.c, file.length()), a11Var.f, a11Var.g, a11Var.h, a11Var.i);
                        }
                        b11Var = new b11(file.length(), null, null, null, null);
                    }
                    b11Var2 = b11Var;
                }
                VideoEditedInfo r10 = o60Var.r(file, j10, b11Var2);
                r10.muted = !z10;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = n60Var.c;
                photoEntry.effectId = n60Var.d;
                o60Var.f.s(photoEntry, r10, n60Var.a, n60Var.b, 0, false, n60Var.e);
                c11 c11Var2 = o60Var.T;
                if (c11Var2 != null) {
                    c11Var2.d(false);
                }
                o60Var.T = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
        }
    }

    public /* synthetic */ j0(u0 u0Var, q0 q0Var, File file, long j10, boolean z10) {
        this.b = u0Var;
        this.c = q0Var;
        this.e = file;
        this.d = j10;
        this.f = z10;
    }
}
