package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.j81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.y9;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a implements d6.h, y6.c {
    public int a;

    public a() {
        this.a = 3;
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void d(d6.f fVar, String str) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void h(d6.f fVar, int i10) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void i(d6.f fVar, boolean z10) {
    }

    @Override // d6.h
    public void n(d6.f fVar, int i10) {
        b5.d.d(false);
        b5.d.C();
    }

    @Override // y6.c
    public int o(Context context, String str, boolean z10) {
        return 0;
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void p(d6.f fVar) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void r(d6.f fVar, int i10) {
    }

    @Override // d6.h
    public void u(d6.f fVar) {
        b5.d.d(false);
        b5.d.C();
    }

    @Override // d6.h
    public void w(d6.f fVar, String str) {
        d6.c cVar = (d6.c) fVar;
        if (cVar == null) {
            return;
        }
        n6.l.e("Must be called from the main thread.");
        e6.h hVar = cVar.j;
        if (hVar == null) {
            return;
        }
        AtomicInteger atomicInteger = b5.d.b;
        if (atomicInteger != null) {
            atomicInteger.set(0);
        }
        hVar.p(new y9());
        n6.l.e("Must be called from the main thread.");
        if (hVar.w()) {
            e6.h.x(new e6.j(hVar, 3));
        } else {
            e6.h.t();
        }
        int i10 = this.a;
        long j10 = -1;
        if (i10 == 0) {
            j81 j81Var = PhotoViewer.u1().F2;
            if (j81Var != null) {
                j10 = j81Var.n();
            }
        } else if (i10 == 1) {
            j10 = MediaController.getInstance().getCurrentPosition();
        }
        if (j10 >= 0) {
            b5.d.v(j10);
        }
        b5.d.d(true);
    }

    @Override // y6.c
    public int y(Context context, String str) {
        return this.a;
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void z(d6.f fVar, int i10) {
    }

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }
}
