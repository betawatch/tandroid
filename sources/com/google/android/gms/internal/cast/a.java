package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.t71;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.w9;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a implements d6.h, y6.c {
    public int a;

    public a() {
        this.a = 3;
    }

    @Override // d6.h
    public void A(d6.f fVar, String str) {
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
        hVar.p(new w9());
        n6.l.e("Must be called from the main thread.");
        if (hVar.w()) {
            e6.h.x(new e6.j(hVar, 3));
        } else {
            e6.h.t();
        }
        int i10 = this.a;
        long j3 = -1;
        if (i10 == 0) {
            t71 t71Var = PhotoViewer.t1().F2;
            if (t71Var != null) {
                j3 = t71Var.n();
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
    public /* bridge */ /* synthetic */ void B(d6.f fVar, int i10) {
    }

    @Override // y6.c
    public int F(Context context, String str) {
        return this.a;
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void b(d6.f fVar, String str) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void c(d6.f fVar, int i10) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void d(d6.f fVar, boolean z10) {
    }

    @Override // y6.c
    public int h(Context context, String str, boolean z10) {
        return 0;
    }

    @Override // d6.h
    public void p(d6.f fVar, int i10) {
        b5.d.d(false);
        b5.d.C();
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void r(d6.f fVar) {
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void v(d6.f fVar, int i10) {
    }

    @Override // d6.h
    public void z(d6.f fVar) {
        b5.d.d(false);
        b5.d.C();
    }

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }
}
