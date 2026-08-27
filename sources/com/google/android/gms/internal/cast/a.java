package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.m61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.v9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a implements j6.c, n5.i {
    public int a;

    public a() {
        this.a = 3;
    }

    @Override // j6.c
    public int A(Context context, String str) {
        return this.a;
    }

    @Override // n5.i
    public void a(n5.g gVar) {
        d1.f.d(false);
        d1.f.B();
    }

    @Override // n5.i
    public /* bridge */ /* synthetic */ void b(n5.g gVar, int i10) {
    }

    @Override // n5.i
    public void c(n5.g gVar, int i10) {
        d1.f.d(false);
        d1.f.B();
    }

    @Override // n5.i
    public /* bridge */ /* synthetic */ void d(n5.g gVar) {
    }

    @Override // n5.i
    public /* bridge */ /* synthetic */ void e(n5.g gVar, boolean z10) {
    }

    @Override // n5.i
    public /* bridge */ /* synthetic */ void f(n5.g gVar, int i10) {
    }

    @Override // j6.c
    public int g(Context context, String str, boolean z10) {
        return 0;
    }

    @Override // n5.i
    public /* bridge */ /* synthetic */ void h(n5.g gVar, int i10) {
    }

    @Override // n5.i
    public void i(n5.g gVar, String str) {
        n5.c cVar = (n5.c) gVar;
        if (cVar == null) {
            return;
        }
        y5.l.e("Must be called from the main thread.");
        o5.h hVar = cVar.j;
        if (hVar == null) {
            return;
        }
        AtomicInteger atomicInteger = d1.f.b;
        if (atomicInteger != null) {
            atomicInteger.set(0);
        }
        hVar.p(new v9());
        y5.l.e("Must be called from the main thread.");
        if (hVar.w()) {
            o5.h.x(new o5.i(hVar, 3));
        } else {
            o5.h.t();
        }
        int i10 = this.a;
        long j10 = -1;
        if (i10 == 0) {
            m61 m61Var = PhotoViewer.t1().B2;
            if (m61Var != null) {
                j10 = m61Var.o();
            }
        } else if (i10 == 1) {
            j10 = MediaController.getInstance().getCurrentPosition();
        }
        if (j10 >= 0) {
            d1.f.u(j10);
        }
        d1.f.d(true);
    }

    @Override // n5.i
    public /* bridge */ /* synthetic */ void j(n5.g gVar, String str) {
    }

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }
}
