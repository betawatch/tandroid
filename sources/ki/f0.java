package ki;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.o01;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ n0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ File e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ f0(r0 r0Var, n0 n0Var, long j3, File file, boolean z10) {
        this.b = r0Var;
        this.c = n0Var;
        this.d = j3;
        this.e = file;
        this.f = z10;
    }

    private final void a() {
        r0 r0Var = this.b;
        n0 n0Var = this.c;
        File file = this.e;
        long j3 = this.d;
        boolean z10 = this.f;
        synchronized (r0Var.f) {
            if (!r0Var.C && !n0Var.d && !n0Var.e) {
                n0Var.e = true;
                ((o01) r0Var.d).b(n0Var.a, file.length(), file);
                r0Var.h.post(new f0(r0Var, n0Var, j3, file, z10));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        n01 n01Var;
        n01 n01Var2;
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                r0 r0Var = this.b;
                n0 n0Var = this.c;
                long j3 = this.d;
                File file = this.e;
                boolean z10 = this.f;
                int i10 = r0Var.V;
                if (i10 == 10 || i10 == 9) {
                    return;
                }
                r0Var.u(8);
                r0Var.l.b("output completed: generation=" + n0Var.a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                r0Var.l("completed");
                l.d dVar = r0Var.c;
                long j10 = n0Var.a;
                b60 b60Var = (b60) dVar.a;
                a60 a60Var = b60Var.S;
                if (a60Var == null) {
                    return;
                }
                b60Var.S = null;
                b60Var.f0 = true;
                o01 o01Var = b60Var.Q;
                if (o01Var == null) {
                    n01Var2 = null;
                } else {
                    synchronized (o01Var) {
                        m01 m01Var = (m01) o01Var.c.get(Long.valueOf(j10));
                        if (m01Var != null && !m01Var.e) {
                            n01Var = new n01(Math.max(m01Var.c, file.length()), m01Var.f, m01Var.g, m01Var.h, m01Var.i);
                        }
                        n01Var = new n01(file.length(), null, null, null, null);
                    }
                    n01Var2 = n01Var;
                }
                VideoEditedInfo o9 = b60Var.o(file, j3, n01Var2);
                o9.muted = !z10;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = a60Var.c;
                photoEntry.effectId = a60Var.d;
                b60Var.f.q(photoEntry, o9, a60Var.a, a60Var.b, 0, false, a60Var.e);
                o01 o01Var2 = b60Var.Q;
                if (o01Var2 != null) {
                    o01Var2.d(false);
                }
                b60Var.Q = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
        }
    }

    public /* synthetic */ f0(r0 r0Var, n0 n0Var, File file, long j3, boolean z10) {
        this.b = r0Var;
        this.c = n0Var;
        this.e = file;
        this.d = j3;
        this.f = z10;
    }
}
