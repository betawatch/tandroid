package ag;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.t81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.aa;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class j implements e6.h, z6.c {
    public int a;

    public j() {
        this.a = 3;
    }

    @Override // z6.c
    public int U(Context context, String str) {
        return this.a;
    }

    @Override // e6.h
    public void a(e6.f fVar, String str) {
        e6.c cVar = (e6.c) fVar;
        if (cVar == null) {
            return;
        }
        o6.l.e("Must be called from the main thread.");
        f6.h hVar = cVar.j;
        if (hVar == null) {
            return;
        }
        AtomicInteger atomicInteger = c5.d.b;
        if (atomicInteger != null) {
            atomicInteger.set(0);
        }
        hVar.p(new aa());
        o6.l.e("Must be called from the main thread.");
        if (hVar.w()) {
            f6.h.x(new f6.j(hVar, 3));
        } else {
            f6.h.t();
        }
        int i10 = this.a;
        long j10 = -1;
        if (i10 == 0) {
            t81 t81Var = PhotoViewer.v1().F2;
            if (t81Var != null) {
                j10 = t81Var.n();
            }
        } else if (i10 == 1) {
            j10 = MediaController.getInstance().getCurrentPosition();
        }
        if (j10 >= 0) {
            c5.d.v(j10);
        }
        c5.d.d(true);
    }

    @Override // e6.h
    public /* bridge */ /* synthetic */ void b(e6.f fVar, int i10) {
    }

    @Override // e6.h
    public /* bridge */ /* synthetic */ void d(e6.f fVar, int i10) {
    }

    @Override // e6.h
    public /* bridge */ /* synthetic */ void e(e6.f fVar, int i10) {
    }

    @Override // e6.h
    public /* bridge */ /* synthetic */ void g(e6.f fVar, String str) {
    }

    @Override // e6.h
    public /* bridge */ /* synthetic */ void l(e6.f fVar) {
    }

    @Override // e6.h
    public void r(e6.f fVar) {
        c5.d.d(false);
        c5.d.C();
    }

    @Override // z6.c
    public int t(Context context, String str, boolean z10) {
        return 0;
    }

    @Override // e6.h
    public /* bridge */ /* synthetic */ void v(e6.f fVar, boolean z10) {
    }

    @Override // e6.h
    public void x(e6.f fVar, int i10) {
        c5.d.d(false);
        c5.d.C();
    }

    public /* synthetic */ j(int i10) {
        this.a = i10;
    }
}
