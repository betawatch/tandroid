package a7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.m51;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.u9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l implements c, f6.h {
    public int a;

    public l() {
        this.a = 3;
    }

    @Override // f6.h
    public void a(f6.f fVar, int i3) {
        d1.f.d(false);
        d1.f.C();
    }

    @Override // f6.h
    public /* bridge */ /* synthetic */ void d(f6.f fVar, int i3) {
    }

    @Override // a7.c
    public int e(Context context, String str, boolean z10) {
        return 0;
    }

    @Override // f6.h
    public void f(f6.f fVar, String str) {
        MediaController B;
        zi ziVar;
        f6.c cVar = (f6.c) fVar;
        if (cVar == null) {
            return;
        }
        p6.m.d("Must be called from the main thread.");
        g6.h hVar = cVar.j;
        if (hVar == null) {
            return;
        }
        AtomicInteger atomicInteger = d1.f.b;
        if (atomicInteger != null) {
            atomicInteger.set(0);
        }
        hVar.p(new u9());
        p6.m.d("Must be called from the main thread.");
        if (hVar.w()) {
            g6.h.x(new g6.i(hVar, 3));
        } else {
            g6.h.t();
        }
        int i3 = this.a;
        long j10 = -1;
        if (i3 == 0) {
            m51 m51Var = PhotoViewer.v1().G2;
            if (m51Var != null) {
                j10 = m51Var.S();
            }
        } else if (i3 == 1 && (ziVar = (B = MediaController.B()).v0) != null) {
            j10 = B.D(ziVar);
        }
        if (j10 >= 0) {
            d1.f.v(j10);
        }
        d1.f.d(true);
    }

    @Override // f6.h
    public /* bridge */ /* synthetic */ void g(f6.f fVar) {
    }

    @Override // f6.h
    public void h(f6.f fVar) {
        d1.f.d(false);
        d1.f.C();
    }

    @Override // f6.h
    public /* bridge */ /* synthetic */ void j(f6.f fVar, String str) {
    }

    @Override // a7.c
    public int k(Context context, String str) {
        return this.a;
    }

    @Override // f6.h
    public /* bridge */ /* synthetic */ void l(f6.f fVar, boolean z10) {
    }

    @Override // f6.h
    public /* bridge */ /* synthetic */ void m(f6.f fVar, int i3) {
    }

    @Override // f6.h
    public /* bridge */ /* synthetic */ void n(f6.f fVar, int i3) {
    }

    public /* synthetic */ l(int i3) {
        this.a = i3;
    }
}
