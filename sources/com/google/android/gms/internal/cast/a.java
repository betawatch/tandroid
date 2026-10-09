package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.k81;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.x9;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
    public /* bridge */ /* synthetic */ void g(d6.f fVar, int i10) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void h(d6.f fVar, boolean z10) {
    }

    @Override // d6.h
    public void j(d6.f fVar, int i10) {
        b5.d.d(false);
        b5.d.C();
    }

    @Override // y6.c
    public int m(Context context, String str, boolean z10) {
        return 0;
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void o(d6.f fVar) {
    }

    @Override // y6.c
    public int q(Context context, String str) {
        return this.a;
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void u(d6.f fVar, int i10) {
    }

    @Override // d6.h
    public void v(d6.f fVar) {
        b5.d.d(false);
        b5.d.C();
    }

    @Override // d6.h
    public void x(d6.f fVar, String str) {
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
            k81 k81Var = PhotoViewer.t1().F2;
            if (k81Var != null) {
                j3 = k81Var.n();
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
    public /* bridge */ /* synthetic */ void y(d6.f fVar, int i10) {
    }

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }
}
