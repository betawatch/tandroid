package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.k61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.u9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements i6.c, n5.h {
    public int a;

    public a() {
        this.a = 3;
    }

    @Override // i6.c
    public int H(Context context, String str) {
        return this.a;
    }

    @Override // n5.h
    public void a(n5.f fVar) {
        d1.f.d(false);
        d1.f.B();
    }

    @Override // n5.h
    public /* bridge */ /* synthetic */ void b(n5.f fVar, int i9) {
    }

    @Override // n5.h
    public void c(n5.f fVar, int i9) {
        d1.f.d(false);
        d1.f.B();
    }

    @Override // n5.h
    public /* bridge */ /* synthetic */ void d(n5.f fVar) {
    }

    @Override // n5.h
    public /* bridge */ /* synthetic */ void e(n5.f fVar, boolean z10) {
    }

    @Override // n5.h
    public /* bridge */ /* synthetic */ void f(n5.f fVar, int i9) {
    }

    @Override // n5.h
    public /* bridge */ /* synthetic */ void g(n5.f fVar, int i9) {
    }

    @Override // n5.h
    public void h(n5.f fVar, String str) {
        n5.c cVar = (n5.c) fVar;
        if (cVar == null) {
            return;
        }
        x5.l.e("Must be called from the main thread.");
        o5.h hVar = cVar.j;
        if (hVar == null) {
            return;
        }
        AtomicInteger atomicInteger = d1.f.b;
        if (atomicInteger != null) {
            atomicInteger.set(0);
        }
        hVar.p(new u9());
        x5.l.e("Must be called from the main thread.");
        if (hVar.w()) {
            o5.h.x(new o5.i(hVar, 3));
        } else {
            o5.h.t();
        }
        int i9 = this.a;
        long j10 = -1;
        if (i9 == 0) {
            k61 k61Var = PhotoViewer.t1().B2;
            if (k61Var != null) {
                j10 = k61Var.o();
            }
        } else if (i9 == 1) {
            j10 = MediaController.getInstance().getCurrentPosition();
        }
        if (j10 >= 0) {
            d1.f.u(j10);
        }
        d1.f.d(true);
    }

    @Override // n5.h
    public /* bridge */ /* synthetic */ void i(n5.f fVar, String str) {
    }

    @Override // i6.c
    public int k(Context context, String str, boolean z10) {
        return 0;
    }

    public /* synthetic */ a(int i9) {
        this.a = i9;
    }
}
