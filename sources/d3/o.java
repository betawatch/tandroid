package d3;

import a8.ma;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import h2.l0;
import h9.s1;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class o implements k0 {
    public h9.i0 a;
    public e2.u b;
    public long c;
    public long d;
    public int e;
    public Executor f;
    public final /* synthetic */ t g;

    public o(t tVar, Context context) {
        this.g = tVar;
        l0.N(context);
        h9.g0 g0Var = h9.i0.b;
        this.a = s1.e;
        this.d = -9223372036854775807L;
        this.f = t.q;
    }

    @Override // d3.k0
    public final boolean a() {
        return false;
    }

    @Override // d3.k0
    public final Surface b() {
        ma.p(false);
        throw null;
    }

    @Override // d3.k0
    public final void c(v vVar) {
        this.g.e.j = vVar;
    }

    @Override // d3.k0
    public final void d(float f10) {
        t tVar = this.g;
        tVar.i.c(f10);
        tVar.e.d(f10);
    }

    @Override // d3.k0
    public final void e() {
        t tVar = this.g;
        if (tVar.d) {
            tVar.e.e();
        }
    }

    @Override // d3.k0
    public final void f(Surface surface, h2.y yVar) {
        t tVar = this.g;
        Pair pair = tVar.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((h2.y) tVar.l.second).equals(yVar)) {
            return;
        }
        tVar.l = Pair.create(surface, yVar);
        int i7 = yVar.a;
    }

    @Override // d3.k0
    public final void g(d6.i iVar) {
        this.f = m9.r.a;
    }

    @Override // d3.k0
    public final void h() {
        t tVar = this.g;
        if (tVar.d) {
            tVar.e.h();
        }
    }

    @Override // d3.k0
    public final void i(long j3) {
        this.c = j3;
    }

    @Override // d3.k0
    public final boolean j(e2.u uVar) {
        t tVar = this.g;
        boolean z10 = true;
        ma.p(tVar.n == 0);
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
                        h2.g0 g0Var = tVar.f;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        tVar.k = g0Var.a(myLooper, null);
                        tVar.b.a();
                        throw null;
                    }
                }
            } catch (h2.m e10) {
                throw new j0(e10, uVar);
            }
        }
        if (i7 == 6) {
            if (Build.VERSION.SDK_INT < 33 || !h2.e.d("EGL_EXT_gl_colorspace_bt2020_pq")) {
                z10 = false;
            }
        } else if (i7 == 7) {
            z10 = h2.e.d("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        if (!z10 && Build.VERSION.SDK_INT >= 29) {
            Locale locale = Locale.US;
            h2.a.l("PlaybackVidGraphWrapper", "Color transfer " + i7 + " is not supported. Falling back to OpenGl tone mapping.");
            e2.m mVar2 = e2.m.h;
            h2.g0 g0Var2 = tVar.f;
            Looper myLooper2 = Looper.myLooper();
            myLooper2.getClass();
            tVar.k = g0Var2.a(myLooper2, null);
            tVar.b.a();
            throw null;
        }
        if (i7 == 2 || i7 == 10) {
            e2.m mVar3 = e2.m.h;
        }
        h2.g0 g0Var22 = tVar.f;
        Looper myLooper22 = Looper.myLooper();
        myLooper22.getClass();
        tVar.k = g0Var22.a(myLooper22, null);
        tVar.b.a();
        throw null;
    }

    @Override // d3.k0
    public final void k() {
        long j3 = this.d;
        t tVar = this.g;
        if (tVar.o >= j3) {
            tVar.e.k();
        }
    }

    @Override // d3.k0
    public final void l(int i7) {
        this.g.e.l(i7);
    }

    @Override // d3.k0
    public final void m() {
        t tVar = this.g;
        tVar.getClass();
        int i7 = h2.y.c.a;
        tVar.l = null;
    }

    @Override // d3.k0
    public final boolean n(long j3, i iVar) {
        int i7;
        ma.p(false);
        long j10 = j3 + this.c;
        t tVar = this.g;
        y yVar = tVar.i;
        long j11 = yVar.a == -9223372036854775807L ? -9223372036854775807L : (long) (((j10 - r3) * yVar.c) + yVar.b);
        if (j11 != -9223372036854775807L) {
            long j12 = tVar.h;
            if (j12 != -9223372036854775807L && j11 < j12 && (i7 = this.e) < 2) {
                this.e = i7 + 1;
                l lVar = iVar.c;
                u2.l lVar2 = iVar.a;
                int i10 = iVar.b;
                Trace.beginSection("dropVideoBuffer");
                lVar2.i(i10);
                Trace.endSection();
                lVar.R0(0, 1);
                return true;
            }
        }
        int i11 = tVar.p;
        if (i11 == -1 || i11 != 0) {
            return false;
        }
        throw null;
    }

    @Override // d3.k0
    public final void o(boolean z10) {
        this.d = -9223372036854775807L;
        t tVar = this.g;
        e eVar = tVar.e;
        if (tVar.n == 1) {
            tVar.m++;
            eVar.o(z10);
            while (tVar.j.p() > 1) {
                tVar.j.i();
            }
            if (tVar.j.p() == 1) {
                ((s) tVar.j.i()).getClass();
                throw null;
            }
            tVar.o = -9223372036854775807L;
            h2.i0 i0Var = tVar.k;
            i0Var.getClass();
            i0Var.d(new ca.r(tVar, 6));
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
    public final void r(boolean z10) {
        t tVar = this.g;
        if (tVar.d) {
            tVar.e.r(z10);
        }
    }

    @Override // d3.k0
    public final void release() {
        t tVar = this.g;
        if (tVar.n == 2) {
            return;
        }
        h2.i0 i0Var = tVar.k;
        if (i0Var != null) {
            i0Var.a.removeCallbacksAndMessages(null);
        }
        tVar.l = null;
        tVar.n = 2;
    }

    @Override // d3.k0
    public final boolean s(boolean z10) {
        return this.g.e.a.b(false);
    }

    @Override // d3.k0
    public final void u(e2.u uVar, long j3, int i7, List list) {
        ma.p(false);
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
        t tVar = this.g;
        if (tVar.j.p() == 0) {
            tVar.e.w();
            return;
        }
        h2.j0 j0Var = new h2.j0();
        if (tVar.j.p() <= 0) {
            tVar.j = j0Var;
        } else {
            ((s) tVar.j.i()).getClass();
            throw null;
        }
    }

    @Override // d3.k0
    public final void t() {
    }
}
