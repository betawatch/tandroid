package a5;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.x61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.t9;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements k6.c, p5.h {
    public int a;

    public c() {
        this.a = 3;
    }

    @Override // p5.h
    public /* bridge */ /* synthetic */ void a(p5.f fVar, String str) {
    }

    @Override // p5.h
    public /* bridge */ /* synthetic */ void b(p5.f fVar) {
    }

    @Override // p5.h
    public /* bridge */ /* synthetic */ void c(p5.f fVar, int i10) {
    }

    @Override // p5.h
    public void d(p5.f fVar) {
        d1.f.d(false);
        d1.f.C();
    }

    @Override // p5.h
    public /* bridge */ /* synthetic */ void e(p5.f fVar, int i10) {
    }

    @Override // p5.h
    public void f(p5.f fVar, String str) {
        p5.c cVar = (p5.c) fVar;
        if (cVar == null) {
            return;
        }
        l.e("Must be called from the main thread.");
        q5.h hVar = cVar.j;
        if (hVar == null) {
            return;
        }
        AtomicInteger atomicInteger = d1.f.b;
        if (atomicInteger != null) {
            atomicInteger.set(0);
        }
        hVar.p(new t9());
        l.e("Must be called from the main thread.");
        if (hVar.w()) {
            q5.h.x(new q5.i(hVar, 3));
        } else {
            q5.h.t();
        }
        int i10 = this.a;
        long j10 = -1;
        if (i10 == 0) {
            x61 x61Var = PhotoViewer.t1().B2;
            if (x61Var != null) {
                j10 = x61Var.o();
            }
        } else if (i10 == 1) {
            j10 = MediaController.getInstance().getCurrentPosition();
        }
        if (j10 >= 0) {
            d1.f.v(j10);
        }
        d1.f.d(true);
    }

    @Override // p5.h
    public void g(p5.f fVar, int i10) {
        d1.f.d(false);
        d1.f.C();
    }

    @Override // p5.h
    public /* bridge */ /* synthetic */ void h(p5.f fVar, boolean z10) {
    }

    @Override // k6.c
    public int i(Context context, String str, boolean z10) {
        return 0;
    }

    @Override // p5.h
    public /* bridge */ /* synthetic */ void j(p5.f fVar, int i10) {
    }

    @Override // k6.c
    public int l(Context context, String str) {
        return this.a;
    }

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }
}
