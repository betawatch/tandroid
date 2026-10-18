package a3;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import e9.x1;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import v7.u6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class r implements p0 {
    public e9.n0 a;
    public b2.w b;
    public long c;
    public long d;
    public int e;
    public Executor f;
    public final /* synthetic */ w g;

    public r(w wVar, Context context) {
        this.g = wVar;
        e2.m0.N(context);
        e9.l0 l0Var = e9.n0.b;
        this.a = x1.e;
        this.d = -9223372036854775807L;
        this.f = w.q;
    }

    @Override // a3.p0
    public final void a(float f7) {
        w wVar = this.g;
        wVar.i.c(f7);
        wVar.e.a(f7);
    }

    @Override // a3.p0
    public final boolean b() {
        return false;
    }

    @Override // a3.p0
    public final Surface c() {
        u6.p(false);
        throw null;
    }

    @Override // a3.p0
    public final boolean d(b2.w wVar) {
        w wVar2 = this.g;
        boolean z10 = true;
        u6.p(wVar2.n == 0);
        b2.n nVar = wVar.I;
        if (nVar == null || !nVar.d()) {
            nVar = b2.n.h;
        }
        int i10 = nVar.c;
        if (i10 == 7) {
            try {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 34) {
                    if (i11 >= 33 && e2.e.d("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        e2.g0 g0Var = wVar2.f;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        wVar2.k = g0Var.a(myLooper, null);
                        wVar2.b.a();
                        throw null;
                    }
                }
            } catch (e2.m e) {
                throw new o0(e, wVar);
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
            b2.n nVar2 = b2.n.h;
            e2.g0 g0Var2 = wVar2.f;
            Looper myLooper2 = Looper.myLooper();
            myLooper2.getClass();
            wVar2.k = g0Var2.a(myLooper2, null);
            wVar2.b.a();
            throw null;
        }
        if (i10 == 2 || i10 == 10) {
            b2.n nVar3 = b2.n.h;
        }
        e2.g0 g0Var22 = wVar2.f;
        Looper myLooper22 = Looper.myLooper();
        myLooper22.getClass();
        wVar2.k = g0Var22.a(myLooper22, null);
        wVar2.b.a();
        throw null;
    }

    @Override // a3.p0
    public final void e() {
        w wVar = this.g;
        if (wVar.d) {
            wVar.e.e();
        }
    }

    @Override // a3.p0
    public final void f() {
        w wVar = this.g;
        if (wVar.d) {
            wVar.e.f();
        }
    }

    @Override // a3.p0
    public final void g(a6.i iVar) {
        this.f = j9.r.a;
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
    public final void l(b2.w wVar, long j10, int i10, List list) {
        u6.p(false);
        this.a = e9.n0.u(list);
        this.b = wVar;
        b2.v a2 = wVar.a();
        b2.n nVar = wVar.I;
        if (nVar == null || !nVar.d()) {
            nVar = b2.n.h;
        }
        a2.H = nVar;
        a2.a();
        throw null;
    }

    @Override // a3.p0
    public final void m(boolean z10) {
        this.d = -9223372036854775807L;
        w wVar = this.g;
        f fVar = wVar.e;
        if (wVar.n == 1) {
            wVar.m++;
            fVar.m(z10);
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
    public final boolean n(long j10, j jVar) {
        int i10;
        u6.p(false);
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
                lVar.d(i11);
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
    public final void o(List list) {
        if (this.a.equals(list)) {
            return;
        }
        this.a = e9.n0.u(list);
        b2.w wVar = this.b;
        if (wVar == null) {
            return;
        }
        b2.v a2 = wVar.a();
        b2.n nVar = wVar.I;
        if (nVar == null || !nVar.d()) {
            nVar = b2.n.h;
        }
        a2.H = nVar;
        a2.a();
        throw null;
    }

    @Override // a3.p0
    public final void p(long j10, long j11) {
        this.g.e.p(j10 + this.c, j11);
    }

    @Override // a3.p0
    public final void q(boolean z10) {
        w wVar = this.g;
        if (wVar.d) {
            wVar.e.q(z10);
        }
    }

    @Override // a3.p0
    public final boolean r(boolean z10) {
        return this.g.e.a.b(false);
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
    public final void s(Surface surface, e2.y yVar) {
        w wVar = this.g;
        Pair pair = wVar.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((e2.y) wVar.l.second).equals(yVar)) {
            return;
        }
        wVar.l = Pair.create(surface, yVar);
        int i10 = yVar.a;
    }

    @Override // a3.p0
    public final void u(y yVar) {
        this.g.e.j = yVar;
    }

    @Override // a3.p0
    public final boolean v() {
        return false;
    }

    @Override // a3.p0
    public final void w() {
        w wVar = this.g;
        if (wVar.j.j() == 0) {
            wVar.e.w();
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
    public final void t() {
    }
}
