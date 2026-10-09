package ki;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.s60;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ p0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ File e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ g0(t0 t0Var, p0 p0Var, long j3, File file, boolean z10) {
        this.b = t0Var;
        this.c = p0Var;
        this.d = j3;
        this.e = file;
        this.f = z10;
    }

    private final void a() {
        t0 t0Var = this.b;
        p0 p0Var = this.c;
        File file = this.e;
        long j3 = this.d;
        boolean z10 = this.f;
        synchronized (t0Var.g) {
            if (!t0Var.D && !p0Var.d && !p0Var.e) {
                p0Var.e = true;
                ((g11) t0Var.e).b(p0Var.a, file.length(), file);
                t0Var.i.post(new g0(t0Var, p0Var, j3, file, z10));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        f11 f11Var;
        f11 f11Var2;
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                t0 t0Var = this.b;
                p0 p0Var = this.c;
                long j3 = this.d;
                File file = this.e;
                boolean z10 = this.f;
                int i10 = t0Var.W;
                if (i10 == 10 || i10 == 9) {
                    return;
                }
                t0Var.v(8);
                t0Var.m.b("output completed: generation=" + p0Var.a + ", durationMs=" + j3 + ", size=" + file.length() + ", hasAudio=" + z10);
                t0Var.m("completed");
                m2.t tVar = t0Var.d;
                long j10 = p0Var.a;
                s60 s60Var = (s60) tVar.b;
                r60 r60Var = s60Var.V;
                if (r60Var == null) {
                    return;
                }
                s60Var.V = null;
                s60Var.i0 = true;
                g11 g11Var = s60Var.T;
                if (g11Var == null) {
                    f11Var2 = null;
                } else {
                    synchronized (g11Var) {
                        e11 e11Var = (e11) g11Var.c.get(Long.valueOf(j10));
                        if (e11Var != null && !e11Var.e) {
                            f11Var = new f11(Math.max(e11Var.c, file.length()), e11Var.f, e11Var.g, e11Var.h, e11Var.i);
                        }
                        f11Var = new f11(file.length(), null, null, null, null);
                    }
                    f11Var2 = f11Var;
                }
                VideoEditedInfo q6 = s60Var.q(file, j3, f11Var2);
                q6.muted = !z10;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = r60Var.c;
                photoEntry.effectId = r60Var.d;
                s60Var.f.r(photoEntry, q6, r60Var.a, r60Var.b, 0, false, r60Var.e);
                g11 g11Var2 = s60Var.T;
                if (g11Var2 != null) {
                    g11Var2.d(false);
                }
                s60Var.T = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
        }
    }

    public /* synthetic */ g0(t0 t0Var, p0 p0Var, File file, long j3, boolean z10) {
        this.b = t0Var;
        this.c = p0Var;
        this.e = file;
        this.d = j3;
        this.f = z10;
    }
}
