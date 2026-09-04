package a3;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import e9.a1;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class q implements m0 {
    public e9.i0 a;
    public b2.s b;
    public long c;
    public long d;
    public Executor e;
    public final /* synthetic */ v f;

    public q(v vVar, Context context) {
        this.f = vVar;
        e2.d0.L(context);
        e9.g0 g0Var = e9.i0.b;
        this.a = a1.e;
        this.d = -9223372036854775807L;
        this.e = v.o;
    }

    @Override // a3.m0
    public final void a(float f7) {
        this.f.e.a(f7);
    }

    @Override // a3.m0
    public final boolean b() {
        return false;
    }

    @Override // a3.m0
    public final Surface c() {
        e2.d.g(false);
        throw null;
    }

    @Override // a3.m0
    public final boolean d(b2.s sVar) {
        v vVar = this.f;
        boolean z10 = true;
        e2.d.g(vVar.l == 0);
        b2.j jVar = sVar.H;
        if (jVar == null || !jVar.d()) {
            jVar = b2.j.h;
        }
        int i10 = jVar.c;
        if (i10 == 7) {
            try {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 34) {
                    if (i11 >= 33 && e2.a.j("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        e2.x xVar = vVar.f;
                        Looper myLooper = Looper.myLooper();
                        e2.d.h(myLooper);
                        vVar.i = xVar.a(myLooper, null);
                        vVar.b.a();
                        throw null;
                    }
                }
            } catch (e2.k e7) {
                throw new l0(e7, sVar);
            }
        }
        if (i10 == 6) {
            if (Build.VERSION.SDK_INT < 33 || !e2.a.j("EGL_EXT_gl_colorspace_bt2020_pq")) {
                z10 = false;
            }
        } else if (i10 == 7) {
            z10 = e2.a.j("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        if (!z10 && Build.VERSION.SDK_INT >= 29) {
            Locale locale = Locale.US;
            e2.a.n("PlaybackVidGraphWrapper", "Color transfer " + i10 + " is not supported. Falling back to OpenGl tone mapping.");
            b2.j jVar2 = b2.j.h;
        }
        e2.x xVar2 = vVar.f;
        Looper myLooper2 = Looper.myLooper();
        e2.d.h(myLooper2);
        vVar.i = xVar2.a(myLooper2, null);
        vVar.b.a();
        throw null;
    }

    @Override // a3.m0
    public final void e() {
        v vVar = this.f;
        if (vVar.d) {
            vVar.e.e();
        }
    }

    @Override // a3.m0
    public final void f() {
        v vVar = this.f;
        if (vVar.d) {
            vVar.e.f();
        }
    }

    @Override // a3.m0
    public final void g(a6.i iVar) {
        this.e = i9.q.a;
    }

    @Override // a3.m0
    public final void h(long j3) {
        this.c = j3;
    }

    @Override // a3.m0
    public final void i() {
        long j3 = this.d;
        v vVar = this.f;
        if (vVar.m >= j3) {
            vVar.e.i();
        }
    }

    @Override // a3.m0
    public final void j(int i10) {
        this.f.e.j(i10);
    }

    @Override // a3.m0
    public final void k() {
        v vVar = this.f;
        vVar.getClass();
        int i10 = e2.w.c.a;
        vVar.j = null;
    }

    @Override // a3.m0
    public final void l(b2.s sVar, long j3, int i10, List list) {
        e2.d.g(false);
        this.a = e9.i0.v(list);
        this.b = sVar;
        b2.r a2 = sVar.a();
        b2.j jVar = sVar.H;
        if (jVar == null || !jVar.d()) {
            jVar = b2.j.h;
        }
        a2.G = jVar;
        a2.a();
        throw null;
    }

    @Override // a3.m0
    public final void m(boolean z10) {
        this.d = -9223372036854775807L;
        v vVar = this.f;
        e eVar = vVar.e;
        if (vVar.l == 1) {
            vVar.k++;
            eVar.m(z10);
            while (vVar.h.i() > 1) {
                vVar.h.f();
            }
            if (vVar.h.i() == 1) {
                ((u) vVar.h.f()).getClass();
                throw null;
            }
            vVar.m = -9223372036854775807L;
            e2.z zVar = vVar.i;
            e2.d.h(zVar);
            zVar.c(new c(vVar, 1));
        }
    }

    @Override // a3.m0
    public final boolean n(long j3, i iVar) {
        e2.d.g(false);
        int i10 = this.f.n;
        if (i10 == -1 || i10 != 0) {
            return false;
        }
        throw null;
    }

    @Override // a3.m0
    public final void o(List list) {
        if (this.a.equals(list)) {
            return;
        }
        this.a = e9.i0.v(list);
        b2.s sVar = this.b;
        if (sVar == null) {
            return;
        }
        b2.r a2 = sVar.a();
        b2.j jVar = sVar.H;
        if (jVar == null || !jVar.d()) {
            jVar = b2.j.h;
        }
        a2.G = jVar;
        a2.a();
        throw null;
    }

    @Override // a3.m0
    public final void p(long j3, long j10) {
        this.f.e.p(j3 + this.c, j10);
    }

    @Override // a3.m0
    public final void q(boolean z10) {
        v vVar = this.f;
        if (vVar.d) {
            vVar.e.q(z10);
        }
    }

    @Override // a3.m0
    public final boolean r(boolean z10) {
        return this.f.e.a.b(false);
    }

    @Override // a3.m0
    public final void release() {
        v vVar = this.f;
        if (vVar.l == 2) {
            return;
        }
        e2.z zVar = vVar.i;
        if (zVar != null) {
            zVar.a.removeCallbacksAndMessages(null);
        }
        vVar.j = null;
        vVar.l = 2;
    }

    @Override // a3.m0
    public final void s(Surface surface, e2.w wVar) {
        v vVar = this.f;
        Pair pair = vVar.j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((e2.w) vVar.j.second).equals(wVar)) {
            return;
        }
        vVar.j = Pair.create(surface, wVar);
        int i10 = wVar.a;
    }

    @Override // a3.m0
    public final void u(x xVar) {
        this.f.e.i = xVar;
    }

    @Override // a3.m0
    public final boolean v() {
        return false;
    }

    @Override // a3.m0
    public final void w() {
        v vVar = this.f;
        if (vVar.h.i() == 0) {
            vVar.e.w();
            return;
        }
        e2.a0 a0Var = new e2.a0();
        if (vVar.h.i() <= 0) {
            vVar.h = a0Var;
        } else {
            ((u) vVar.h.f()).getClass();
            throw null;
        }
    }

    @Override // a3.m0
    public final void t() {
    }
}
