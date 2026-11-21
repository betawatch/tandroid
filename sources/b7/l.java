package b7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.i61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.v9;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class l implements c, g6.h {
    public int a;

    public l() {
        this.a = 3;
    }

    @Override // b7.c
    public int C(Context context, String str) {
        return this.a;
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void a(g6.f fVar, boolean z10) {
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void b(g6.f fVar, int i7) {
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void e(g6.f fVar, int i7) {
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void f(g6.f fVar, int i7) {
    }

    @Override // g6.h
    public void h(g6.f fVar, String str) {
        MediaController B;
        fj fjVar;
        g6.c cVar = (g6.c) fVar;
        if (cVar == null) {
            return;
        }
        q6.m.e("Must be called from the main thread.");
        h6.h hVar = cVar.j;
        if (hVar == null) {
            return;
        }
        AtomicInteger atomicInteger = d1.f.b;
        if (atomicInteger != null) {
            atomicInteger.set(0);
        }
        hVar.p(new v9());
        q6.m.e("Must be called from the main thread.");
        if (hVar.w()) {
            h6.h.x(new h6.i(hVar, 3));
        } else {
            h6.h.t();
        }
        int i7 = this.a;
        long j3 = -1;
        if (i7 == 0) {
            i61 i61Var = PhotoViewer.p1().G2;
            if (i61Var != null) {
                j3 = i61Var.S();
            }
        } else if (i7 == 1 && (fjVar = (B = MediaController.B()).v0) != null) {
            j3 = B.D(fjVar);
        }
        if (j3 >= 0) {
            d1.f.v(j3);
        }
        d1.f.d(true);
    }

    @Override // g6.h
    public void k(g6.f fVar, int i7) {
        d1.f.d(false);
        d1.f.C();
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void l(g6.f fVar, String str) {
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void m(g6.f fVar) {
    }

    @Override // g6.h
    public void n(g6.f fVar) {
        d1.f.d(false);
        d1.f.C();
    }

    @Override // b7.c
    public int o(Context context, String str, boolean z10) {
        return 0;
    }

    public /* synthetic */ l(int i7) {
        this.a = i7;
    }
}
