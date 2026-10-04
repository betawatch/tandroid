package ki;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.y01;
import org.telegram.ui.Components.z01;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                ((z01) s0Var.e).b(o0Var.a, file.length(), file);
                s0Var.i.post(new f0(s0Var, o0Var, j3, file, z10));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        y01 y01Var;
        y01 y01Var2;
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
                l2.g gVar = s0Var.d;
                long j10 = o0Var.a;
                e60 e60Var = (e60) gVar.b;
                d60 d60Var = e60Var.V;
                if (d60Var == null) {
                    return;
                }
                e60Var.V = null;
                e60Var.i0 = true;
                z01 z01Var = e60Var.T;
                if (z01Var == null) {
                    y01Var2 = null;
                } else {
                    synchronized (z01Var) {
                        x01 x01Var = (x01) z01Var.c.get(Long.valueOf(j10));
                        if (x01Var != null && !x01Var.e) {
                            y01Var = new y01(Math.max(x01Var.c, file.length()), x01Var.f, x01Var.g, x01Var.h, x01Var.i);
                        }
                        y01Var = new y01(file.length(), null, null, null, null);
                    }
                    y01Var2 = y01Var;
                }
                VideoEditedInfo p5 = e60Var.p(file, j3, y01Var2);
                p5.muted = !z10;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = d60Var.c;
                photoEntry.effectId = d60Var.d;
                e60Var.f.q(photoEntry, p5, d60Var.a, d60Var.b, 0, false, d60Var.e);
                z01 z01Var2 = e60Var.T;
                if (z01Var2 != null) {
                    z01Var2.d(false);
                }
                e60Var.T = null;
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
