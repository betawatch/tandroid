package d3;

import a8.ia;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import bi.ab;
import h2.m0;
import h9.t1;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class p implements k0 {
    public h9.i0 a;
    public e2.u b;
    public long c;
    public long d;
    public int e;
    public Executor f;
    public final /* synthetic */ u g;

    public p(u uVar, Context context) {
        this.g = uVar;
        m0.N(context);
        h9.g0 g0Var = h9.i0.b;
        this.a = t1.e;
        this.d = -9223372036854775807L;
        this.f = u.q;
    }

    @Override // d3.k0
    public final boolean a() {
        return false;
    }

    @Override // d3.k0
    public final Surface b() {
        ia.p(false);
        throw null;
    }

    @Override // d3.k0
    public final void c(w wVar) {
        this.g.e.j = wVar;
    }

    @Override // d3.k0
    public final void d(float f10) {
        u uVar = this.g;
        uVar.i.c(f10);
        uVar.e.d(f10);
    }

    @Override // d3.k0
    public final void e(cb.c cVar) {
        this.f = m9.r.a;
    }

    @Override // d3.k0
    public final void f() {
        u uVar = this.g;
        if (uVar.d) {
            uVar.e.f();
        }
    }

    @Override // d3.k0
    public final void g(Surface surface, h2.y yVar) {
        u uVar = this.g;
        Pair pair = uVar.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((h2.y) uVar.l.second).equals(yVar)) {
            return;
        }
        uVar.l = Pair.create(surface, yVar);
        int i7 = yVar.a;
    }

    @Override // d3.k0
    public final void h() {
        u uVar = this.g;
        if (uVar.d) {
            uVar.e.h();
        }
    }

    @Override // d3.k0
    public final void i(long j3) {
        this.c = j3;
    }

    @Override // d3.k0
    public final boolean j(e2.u uVar) {
        u uVar2 = this.g;
        boolean z9 = true;
        ia.p(uVar2.n == 0);
        e2.m mVar = uVar.I;
        if (mVar == null || !mVar.d()) {
            mVar = e2.m.h;
        }
        int i7 = mVar.c;
        if (i7 == 7) {
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 34) {
                    if (i10 >= 33 && h2.e.d("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        h2.g0 g0Var = uVar2.f;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        uVar2.k = g0Var.a(myLooper, null);
                        uVar2.b.a();
                        throw null;
                    }
                }
            } catch (h2.m e10) {
                throw new j0(e10, uVar);
            }
        }
        if (i7 == 6) {
            if (Build.VERSION.SDK_INT < 33 || !h2.e.d("EGL_EXT_gl_colorspace_bt2020_pq")) {
                z9 = false;
            }
        } else if (i7 == 7) {
            z9 = h2.e.d("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        if (!z9 && Build.VERSION.SDK_INT >= 29) {
            Locale locale = Locale.US;
            h2.a.l("PlaybackVidGraphWrapper", "Color transfer " + i7 + " is not supported. Falling back to OpenGl tone mapping.");
            e2.m mVar2 = e2.m.h;
            h2.g0 g0Var2 = uVar2.f;
            Looper myLooper2 = Looper.myLooper();
            myLooper2.getClass();
            uVar2.k = g0Var2.a(myLooper2, null);
            uVar2.b.a();
            throw null;
        }
        if (i7 == 2 || i7 == 10) {
            e2.m mVar3 = e2.m.h;
        }
        h2.g0 g0Var22 = uVar2.f;
        Looper myLooper22 = Looper.myLooper();
        myLooper22.getClass();
        uVar2.k = g0Var22.a(myLooper22, null);
        uVar2.b.a();
        throw null;
    }

    @Override // d3.k0
    public final void k() {
        long j3 = this.d;
        u uVar = this.g;
        if (uVar.o >= j3) {
            uVar.e.k();
        }
    }

    @Override // d3.k0
    public final void l(int i7) {
        this.g.e.l(i7);
    }

    @Override // d3.k0
    public final void m() {
        u uVar = this.g;
        uVar.getClass();
        int i7 = h2.y.c.a;
        uVar.l = null;
    }

    @Override // d3.k0
    public final boolean n(long j3, i iVar) {
        int i7;
        ia.p(false);
        long j10 = j3 + this.c;
        u uVar = this.g;
        z zVar = uVar.i;
        long j11 = zVar.a == -9223372036854775807L ? -9223372036854775807L : (long) (((j10 - r3) * zVar.c) + zVar.b);
        if (j11 != -9223372036854775807L) {
            long j12 = uVar.h;
            if (j12 != -9223372036854775807L && j11 < j12 && (i7 = this.e) < 2) {
                this.e = i7 + 1;
                l lVar = iVar.c;
                u2.l lVar2 = iVar.a;
                int i10 = iVar.b;
                Trace.beginSection("dropVideoBuffer");
                lVar2.c(i10);
                Trace.endSection();
                lVar.R0(0, 1);
                return true;
            }
        }
        int i11 = uVar.p;
        if (i11 == -1 || i11 != 0) {
            return false;
        }
        throw null;
    }

    @Override // d3.k0
    public final void o(boolean z9) {
        this.d = -9223372036854775807L;
        u uVar = this.g;
        e eVar = uVar.e;
        if (uVar.n == 1) {
            uVar.m++;
            eVar.o(z9);
            while (uVar.j.p() > 1) {
                uVar.j.i();
            }
            if (uVar.j.p() == 1) {
                ((t) uVar.j.i()).getClass();
                throw null;
            }
            uVar.o = -9223372036854775807L;
            h2.i0 i0Var = uVar.k;
            i0Var.getClass();
            i0Var.d(new ab(uVar, 12));
        }
    }

    @Override // d3.k0
    public final void p(List list) {
        if (this.a.equals(list)) {
            return;
        }
        this.a = h9.i0.q(list);
        e2.u uVar = this.b;
        if (uVar == null) {
            return;
        }
        e2.t a10 = uVar.a();
        e2.m mVar = uVar.I;
        if (mVar == null || !mVar.d()) {
            mVar = e2.m.h;
        }
        a10.H = mVar;
        a10.a();
        throw null;
    }

    @Override // d3.k0
    public final void q(long j3, long j10) {
        this.g.e.q(j3 + this.c, j10);
    }

    @Override // d3.k0
    public final void r(boolean z9) {
        u uVar = this.g;
        if (uVar.d) {
            uVar.e.r(z9);
        }
    }

    @Override // d3.k0
    public final void release() {
        u uVar = this.g;
        if (uVar.n == 2) {
            return;
        }
        h2.i0 i0Var = uVar.k;
        if (i0Var != null) {
            i0Var.a.removeCallbacksAndMessages(null);
        }
        uVar.l = null;
        uVar.n = 2;
    }

    @Override // d3.k0
    public final boolean s(boolean z9) {
        return this.g.e.a.b(false);
    }

    @Override // d3.k0
    public final void u(e2.u uVar, long j3, int i7, List list) {
        ia.p(false);
        this.a = h9.i0.q(list);
        this.b = uVar;
        e2.t a10 = uVar.a();
        e2.m mVar = uVar.I;
        if (mVar == null || !mVar.d()) {
            mVar = e2.m.h;
        }
        a10.H = mVar;
        a10.a();
        throw null;
    }

    @Override // d3.k0
    public final boolean v() {
        return false;
    }

    @Override // d3.k0
    public final void w() {
        u uVar = this.g;
        if (uVar.j.p() == 0) {
            uVar.e.w();
            return;
        }
        h2.j0 j0Var = new h2.j0();
        if (uVar.j.p() <= 0) {
            uVar.j = j0Var;
        } else {
            ((t) uVar.j.i()).getClass();
            throw null;
        }
    }

    @Override // d3.k0
    public final void t() {
    }
}
