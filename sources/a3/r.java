package a3;

import a8.yb;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import f9.s1;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class r implements p0 {
    public f9.i0 a;
    public b2.x b;
    public long c;
    public long d;
    public int e;
    public Executor f;
    public final /* synthetic */ w g;

    public r(w wVar, Context context) {
        this.g = wVar;
        e2.n0.N(context);
        f9.g0 g0Var = f9.i0.b;
        this.a = s1.e;
        this.d = -9223372036854775807L;
        this.f = w.q;
    }

    @Override // a3.p0
    public final void b(float f7) {
        w wVar = this.g;
        wVar.i.c(f7);
        wVar.e.b(f7);
    }

    @Override // a3.p0
    public final boolean c() {
        return false;
    }

    @Override // a3.p0
    public final Surface d() {
        yb.p(false);
        throw null;
    }

    @Override // a3.p0
    public final boolean e(b2.x xVar) {
        w wVar = this.g;
        boolean z10 = true;
        yb.p(wVar.n == 0);
        b2.o oVar = xVar.I;
        if (oVar == null || !oVar.d()) {
            oVar = b2.o.h;
        }
        int i10 = oVar.c;
        if (i10 == 7) {
            try {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 34) {
                    if (i11 >= 33 && e2.e.d("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        e2.g0 g0Var = wVar.f;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        wVar.k = g0Var.a(myLooper, null);
                        wVar.b.a();
                        throw null;
                    }
                }
            } catch (e2.m e) {
                throw new o0(e, xVar);
            }
        }
        if (i10 == 6) {
            if (Build.VERSION.SDK_INT < 33 || !e2.e.d("EGL_EXT_gl_colorspace_bt2020_pq")) {
                z10 = false;
            }
        } else if (i10 == 7) {
            z10 = e2.e.d("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        if (!z10 && Build.VERSION.SDK_INT >= 29) {
            Locale locale = Locale.US;
            e2.a.l("PlaybackVidGraphWrapper", "Color transfer " + i10 + " is not supported. Falling back to OpenGl tone mapping.");
            b2.o oVar2 = b2.o.h;
            e2.g0 g0Var2 = wVar.f;
            Looper myLooper2 = Looper.myLooper();
            myLooper2.getClass();
            wVar.k = g0Var2.a(myLooper2, null);
            wVar.b.a();
            throw null;
        }
        if (i10 == 2 || i10 == 10) {
            b2.o oVar3 = b2.o.h;
        }
        e2.g0 g0Var22 = wVar.f;
        Looper myLooper22 = Looper.myLooper();
        myLooper22.getClass();
        wVar.k = g0Var22.a(myLooper22, null);
        wVar.b.a();
        throw null;
    }

    @Override // a3.p0
    public final void f() {
        w wVar = this.g;
        if (wVar.d) {
            wVar.e.f();
        }
    }

    @Override // a3.p0
    public final void g() {
        w wVar = this.g;
        if (wVar.d) {
            wVar.e.g();
        }
    }

    @Override // a3.p0
    public final void h(long j10) {
        this.c = j10;
    }

    @Override // a3.p0
    public final void i() {
        long j10 = this.d;
        w wVar = this.g;
        if (wVar.o >= j10) {
            wVar.e.i();
        }
    }

    @Override // a3.p0
    public final void j(int i10) {
        this.g.e.j(i10);
    }

    @Override // a3.p0
    public final void k() {
        w wVar = this.g;
        wVar.getClass();
        int i10 = e2.y.c.a;
        wVar.l = null;
    }

    @Override // a3.p0
    public final void l(b2.x xVar, long j10, int i10, List list) {
        yb.p(false);
        this.a = f9.i0.u(list);
        this.b = xVar;
        b2.w a2 = xVar.a();
        b2.o oVar = xVar.I;
        if (oVar == null || !oVar.d()) {
            oVar = b2.o.h;
        }
        a2.H = oVar;
        a2.a();
        throw null;
    }

    @Override // a3.p0
    public final void m(b6.i iVar) {
        this.f = k9.r.a;
    }

    @Override // a3.p0
    public final void n(boolean z10) {
        this.d = -9223372036854775807L;
        w wVar = this.g;
        f fVar = wVar.e;
        if (wVar.n == 1) {
            wVar.m++;
            fVar.n(z10);
            while (wVar.j.j() > 1) {
                wVar.j.f();
            }
            if (wVar.j.j() == 1) {
                ((v) wVar.j.f()).getClass();
                throw null;
            }
            wVar.o = -9223372036854775807L;
            e2.i0 i0Var = wVar.k;
            i0Var.getClass();
            i0Var.d(new d(wVar, 1));
        }
    }

    @Override // a3.p0
    public final boolean o(long j10, j jVar) {
        int i10;
        yb.p(false);
        long j11 = j10 + this.c;
        w wVar = this.g;
        b0 b0Var = wVar.i;
        long j12 = b0Var.a == -9223372036854775807L ? -9223372036854775807L : (long) (((j11 - r3) * b0Var.c) + b0Var.b);
        if (j12 != -9223372036854775807L) {
            long j13 = wVar.h;
            if (j13 != -9223372036854775807L && j12 < j13 && (i10 = this.e) < 2) {
                this.e = i10 + 1;
                n nVar = jVar.c;
                r2.l lVar = jVar.a;
                int i11 = jVar.b;
                Trace.beginSection("dropVideoBuffer");
                lVar.f(i11);
                Trace.endSection();
                nVar.R0(0, 1);
                return true;
            }
        }
        int i12 = wVar.p;
        if (i12 == -1 || i12 != 0) {
            return false;
        }
        throw null;
    }

    @Override // a3.p0
    public final void p(List list) {
        if (this.a.equals(list)) {
            return;
        }
        this.a = f9.i0.u(list);
        b2.x xVar = this.b;
        if (xVar == null) {
            return;
        }
        b2.w a2 = xVar.a();
        b2.o oVar = xVar.I;
        if (oVar == null || !oVar.d()) {
            oVar = b2.o.h;
        }
        a2.H = oVar;
        a2.a();
        throw null;
    }

    @Override // a3.p0
    public final void q(long j10, long j11) {
        this.g.e.q(j10 + this.c, j11);
    }

    @Override // a3.p0
    public final void r(boolean z10) {
        w wVar = this.g;
        if (wVar.d) {
            wVar.e.r(z10);
        }
    }

    @Override // a3.p0
    public final void release() {
        w wVar = this.g;
        if (wVar.n == 2) {
            return;
        }
        e2.i0 i0Var = wVar.k;
        if (i0Var != null) {
            i0Var.a.removeCallbacksAndMessages(null);
        }
        wVar.l = null;
        wVar.n = 2;
    }

    @Override // a3.p0
    public final boolean s(boolean z10) {
        return this.g.e.a.b(false);
    }

    @Override // a3.p0
    public final void t(Surface surface, e2.y yVar) {
        w wVar = this.g;
        Pair pair = wVar.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((e2.y) wVar.l.second).equals(yVar)) {
            return;
        }
        wVar.l = Pair.create(surface, yVar);
        int i10 = yVar.a;
    }

    @Override // a3.p0
    public final void v(y yVar) {
        this.g.e.j = yVar;
    }

    @Override // a3.p0
    public final boolean w() {
        return false;
    }

    @Override // a3.p0
    public final void x() {
        w wVar = this.g;
        if (wVar.j.j() == 0) {
            wVar.e.x();
            return;
        }
        e2.j0 j0Var = new e2.j0();
        if (wVar.j.j() <= 0) {
            wVar.j = j0Var;
        } else {
            ((v) wVar.j.f()).getClass();
            throw null;
        }
    }

    @Override // a3.p0
    public final void u() {
    }
}
