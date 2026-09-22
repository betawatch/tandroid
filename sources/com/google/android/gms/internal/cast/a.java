package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.v71;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.x9;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class a implements d6.h, y6.c {
    public int a;

    public a() {
        this.a = 3;
    }

    @Override // d6.h
    public void B(d6.f fVar) {
        b5.d.d(false);
        b5.d.C();
    }

    @Override // d6.h
    public void C(d6.f fVar, String str) {
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
        hVar.p(new x9());
        n6.l.e("Must be called from the main thread.");
        if (hVar.w()) {
            e6.h.x(new e6.j(hVar, 3));
        } else {
            e6.h.t();
        }
        int i10 = this.a;
        long j3 = -1;
        if (i10 == 0) {
            v71 v71Var = PhotoViewer.t1().F2;
            if (v71Var != null) {
                j3 = v71Var.n();
            }
        } else if (i10 == 1) {
            j3 = MediaController.getInstance().getCurrentPosition();
        }
        if (j3 >= 0) {
            b5.d.v(j3);
        }
        b5.d.d(true);
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void F(d6.f fVar, int i10) {
    }

    @Override // y6.c
    public int d(Context context, String str, boolean z10) {
        return 0;
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void f(d6.f fVar, String str) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void k(d6.f fVar, int i10) {
    }

    @Override // y6.c
    public int m(Context context, String str) {
        return this.a;
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void o(d6.f fVar, boolean z10) {
    }

    @Override // d6.h
    public void s(d6.f fVar, int i10) {
        b5.d.d(false);
        b5.d.C();
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void v(d6.f fVar) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void z(d6.f fVar, int i10) {
    }

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }
}
