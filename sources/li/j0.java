package li;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ef;
import org.telegram.messenger.x20;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.kz0;
import org.telegram.ui.Components.lz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ x0 b;
    public final /* synthetic */ t0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ File e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ j0(x0 x0Var, t0 t0Var, long j10, File file, boolean z10) {
        this.b = x0Var;
        this.c = t0Var;
        this.d = j10;
        this.e = file;
        this.f = z10;
    }

    private final void a() {
        x0 x0Var = this.b;
        t0 t0Var = this.c;
        File file = this.e;
        long j10 = this.d;
        boolean z10 = this.f;
        synchronized (x0Var.g) {
            if (!x0Var.G && !t0Var.d && !t0Var.e) {
                t0Var.e = true;
                ((lz0) x0Var.e).b(t0Var.a, file.length(), file);
                x0Var.i.post(new j0(x0Var, t0Var, j10, file, z10));
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        kz0 kz0Var;
        kz0 kz0Var2;
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                x0 x0Var = this.b;
                t0 t0Var = this.c;
                long j10 = this.d;
                File file = this.e;
                boolean z10 = this.f;
                int i10 = x0Var.Z;
                if (i10 == 10 || i10 == 9) {
                    return;
                }
                x0Var.w(8);
                x0Var.m.b("output completed: generation=" + t0Var.a + ", durationMs=" + j10 + ", size=" + file.length() + ", hasAudio=" + z10);
                x0Var.m("completed");
                k2.m0 m0Var = x0Var.d;
                long j11 = t0Var.a;
                d50 d50Var = (d50) m0Var.a;
                c50 c50Var = d50Var.U;
                if (c50Var == null) {
                    return;
                }
                d50Var.U = null;
                d50Var.j0 = true;
                lz0 lz0Var = d50Var.S;
                if (lz0Var == null) {
                    kz0Var2 = null;
                } else {
                    synchronized (lz0Var) {
                        jz0 jz0Var = (jz0) lz0Var.c.get(Long.valueOf(j11));
                        if (jz0Var != null && !jz0Var.e) {
                            kz0Var = new kz0(Math.max(jz0Var.c, file.length()), jz0Var.f, jz0Var.g, jz0Var.h, jz0Var.i);
                        }
                        kz0Var = new kz0(file.length(), null, null, null, null);
                    }
                    kz0Var2 = kz0Var;
                }
                x20 s10 = d50Var.s(file, j10, kz0Var2);
                s10.t = !z10;
                ef efVar = new ef(0, file.getAbsolutePath(), 0, true, 0, 0);
                efVar.x = c50Var.c;
                efVar.y = c50Var.d;
                d50Var.e.t(efVar, s10, c50Var.a, c50Var.b, 0, false, c50Var.e);
                lz0 lz0Var2 = d50Var.S;
                if (lz0Var2 != null) {
                    lz0Var2.d(false);
                }
                d50Var.S = null;
                MediaController.B().Y(false);
                return;
        }
    }

    public /* synthetic */ j0(x0 x0Var, t0 t0Var, File file, long j10, boolean z10) {
        this.b = x0Var;
        this.c = t0Var;
        this.e = file;
        this.d = j10;
        this.f = z10;
    }
}
