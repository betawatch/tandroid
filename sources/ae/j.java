package ae;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.kj;
import org.telegram.ui.Components.v61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.w9;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class j implements d6.h, y6.c {
    public int a;

    public j() {
        this.a = 3;
    }

    @Override // d6.h
    public void A(d6.f fVar) {
        b5.d.d(false);
        b5.d.C();
    }

    @Override // d6.h
    public void F(d6.f fVar, String str) {
        MediaController B;
        kj kjVar;
        d6.c cVar = (d6.c) fVar;
        if (cVar == null) {
            return;
        }
        n6.l.d("Must be called from the main thread.");
        e6.h hVar = cVar.j;
        if (hVar == null) {
            return;
        }
        AtomicInteger atomicInteger = b5.d.b;
        if (atomicInteger != null) {
            atomicInteger.set(0);
        }
        hVar.p(new w9());
        n6.l.d("Must be called from the main thread.");
        if (hVar.w()) {
            e6.h.x(new e6.i(hVar, 3));
        } else {
            e6.h.t();
        }
        int i10 = this.a;
        long j10 = -1;
        if (i10 == 0) {
            v61 v61Var = PhotoViewer.v1().F2;
            if (v61Var != null) {
                j10 = v61Var.S();
            }
        } else if (i10 == 1 && (kjVar = (B = MediaController.B()).u0) != null) {
            j10 = B.D(kjVar);
        }
        if (j10 >= 0) {
            b5.d.v(j10);
        }
        b5.d.d(true);
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void G(d6.f fVar, int i10) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void j(d6.f fVar, String str) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void k(d6.f fVar, int i10) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void o(d6.f fVar, boolean z10) {
    }

    @Override // y6.c
    public int p0(Context context, String str, boolean z10) {
        return 0;
    }

    @Override // d6.h
    public void q(d6.f fVar, int i10) {
        b5.d.d(false);
        b5.d.C();
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void t(d6.f fVar) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void u(d6.f fVar, int i10) {
    }

    @Override // y6.c
    public int x1(Context context, String str) {
        return this.a;
    }

    public /* synthetic */ j(int i10) {
        this.a = i10;
    }
}
