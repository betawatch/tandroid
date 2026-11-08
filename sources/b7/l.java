package b7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.t51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.u9;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class l implements c, g6.h {
    public int a;

    public l() {
        this.a = 3;
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void b(g6.f fVar, boolean z9) {
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void c(g6.f fVar, int i7) {
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void e(g6.f fVar, int i7) {
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void f(g6.f fVar, int i7) {
    }

    @Override // g6.h
    public void i(g6.f fVar, String str) {
        MediaController B;
        ij ijVar;
        g6.c cVar = (g6.c) fVar;
        if (cVar == null) {
            return;
        }
        q6.m.d("Must be called from the main thread.");
        h6.h hVar = cVar.j;
        if (hVar == null) {
            return;
        }
        AtomicInteger atomicInteger = d1.f.b;
        if (atomicInteger != null) {
            atomicInteger.set(0);
        }
        hVar.p(new u9());
        q6.m.d("Must be called from the main thread.");
        if (hVar.w()) {
            h6.h.x(new h6.i(hVar, 3));
        } else {
            h6.h.t();
        }
        int i7 = this.a;
        long j3 = -1;
        if (i7 == 0) {
            t51 t51Var = PhotoViewer.p1().F2;
            if (t51Var != null) {
                j3 = t51Var.S();
            }
        } else if (i7 == 1 && (ijVar = (B = MediaController.B()).u0) != null) {
            j3 = B.D(ijVar);
        }
        if (j3 >= 0) {
            d1.f.v(j3);
        }
        d1.f.d(true);
    }

    @Override // g6.h
    public void j(g6.f fVar, int i7) {
        d1.f.d(false);
        d1.f.C();
    }

    @Override // b7.c
    public int m(Context context, String str, boolean z9) {
        return 0;
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void p(g6.f fVar, String str) {
    }

    @Override // b7.c
    public int q(Context context, String str) {
        return this.a;
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void s(g6.f fVar) {
    }

    @Override // g6.h
    public void t(g6.f fVar) {
        d1.f.d(false);
        d1.f.C();
    }

    public /* synthetic */ l(int i7) {
        this.a = i7;
    }
}
