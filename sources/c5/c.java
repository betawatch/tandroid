package c5;

import android.content.Context;
import b6.m;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.i71;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.z9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c implements m6.c, r5.h {
    public int a;

    public c() {
        this.a = 3;
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void d(r5.f fVar, int i10) {
    }

    @Override // r5.h
    public void f(r5.f fVar, String str) {
        r5.c cVar = (r5.c) fVar;
        if (cVar == null) {
            return;
        }
        m.e("Must be called from the main thread.");
        s5.h hVar = cVar.j;
        if (hVar == null) {
            return;
        }
        AtomicInteger atomicInteger = d1.f.b;
        if (atomicInteger != null) {
            atomicInteger.set(0);
        }
        hVar.p(new z9());
        m.e("Must be called from the main thread.");
        if (hVar.w()) {
            s5.h.x(new s5.i(hVar, 3));
        } else {
            s5.h.t();
        }
        int i10 = this.a;
        long j10 = -1;
        if (i10 == 0) {
            i71 i71Var = PhotoViewer.t1().C2;
            if (i71Var != null) {
                j10 = i71Var.n();
            }
        } else if (i10 == 1) {
            j10 = MediaController.getInstance().getCurrentPosition();
        }
        if (j10 >= 0) {
            d1.f.v(j10);
        }
        d1.f.d(true);
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void g(r5.f fVar, boolean z4) {
    }

    @Override // m6.c
    public int h(Context context, String str, boolean z4) {
        return 0;
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void i(r5.f fVar, int i10) {
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void j(r5.f fVar, int i10) {
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void k(r5.f fVar) {
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void l(r5.f fVar, String str) {
    }

    @Override // r5.h
    public void m(r5.f fVar) {
        d1.f.d(false);
        d1.f.C();
    }

    @Override // r5.h
    public void o(r5.f fVar, int i10) {
        d1.f.d(false);
        d1.f.C();
    }

    @Override // m6.c
    public int z(Context context, String str) {
        return this.a;
    }

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }
}
