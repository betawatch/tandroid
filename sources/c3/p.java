package c3;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import b8.zb;
import g2.n0;
import g9.s1;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p implements l0 {
    public g9.i0 a;
    public d2.v b;
    public long c;
    public long d;
    public int e;
    public Executor f;
    public final /* synthetic */ u g;

    public p(u uVar, Context context) {
        this.g = uVar;
        n0.N(context);
        g9.g0 g0Var = g9.i0.b;
        this.a = s1.e;
        this.d = -9223372036854775807L;
        this.f = u.q;
    }

    @Override // c3.l0
    public final boolean a() {
        return false;
    }

    @Override // c3.l0
    public final void b(float f10) {
        u uVar = this.g;
        uVar.i.c(f10);
        uVar.e.b(f10);
    }

    @Override // c3.l0
    public final Surface c() {
        zb.p(false);
        throw null;
    }

    @Override // c3.l0
    public final void d() {
        u uVar = this.g;
        if (uVar.d) {
            uVar.e.d();
        }
    }

    @Override // c3.l0
    public final boolean e(d2.v vVar) {
        u uVar = this.g;
        boolean z10 = true;
        zb.p(uVar.n == 0);
        d2.n nVar = vVar.I;
        if (nVar == null || !nVar.d()) {
            nVar = d2.n.h;
        }
        int i3 = nVar.c;
        if (i3 == 7) {
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 34) {
                    if (i10 >= 33 && g2.f.d("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        g2.h0 h0Var = uVar.f;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        uVar.k = h0Var.a(myLooper, null);
                        uVar.b.a();
                        throw null;
                    }
                }
            } catch (g2.n e10) {
                throw new k0(e10, vVar);
            }
        }
        if (i3 == 6) {
            if (Build.VERSION.SDK_INT < 33 || !g2.f.d("EGL_EXT_gl_colorspace_bt2020_pq")) {
                z10 = false;
            }
        } else if (i3 == 7) {
            z10 = g2.f.d("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        if (!z10 && Build.VERSION.SDK_INT >= 29) {
            Locale locale = Locale.US;
            g2.a.l("PlaybackVidGraphWrapper", "Color transfer " + i3 + " is not supported. Falling back to OpenGl tone mapping.");
            d2.n nVar2 = d2.n.h;
            g2.h0 h0Var2 = uVar.f;
            Looper myLooper2 = Looper.myLooper();
            myLooper2.getClass();
            uVar.k = h0Var2.a(myLooper2, null);
            uVar.b.a();
            throw null;
        }
        if (i3 == 2 || i3 == 10) {
            d2.n nVar3 = d2.n.h;
        }
        g2.h0 h0Var22 = uVar.f;
        Looper myLooper22 = Looper.myLooper();
        myLooper22.getClass();
        uVar.k = h0Var22.a(myLooper22, null);
        uVar.b.a();
        throw null;
    }

    @Override // c3.l0
    public final void f(d2.v vVar, long j10, int i3, List list) {
        zb.p(false);
        this.a = g9.i0.q(list);
        this.b = vVar;
        d2.u a10 = vVar.a();
        d2.n nVar = vVar.I;
        if (nVar == null || !nVar.d()) {
            nVar = d2.n.h;
        }
        a10.H = nVar;
        a10.a();
        throw null;
    }

    @Override // c3.l0
    public final void g() {
        u uVar = this.g;
        if (uVar.d) {
            uVar.e.g();
        }
    }

    @Override // c3.l0
    public final void h(long j10) {
        this.c = j10;
    }

    @Override // c3.l0
    public final void i() {
        long j10 = this.d;
        u uVar = this.g;
        if (uVar.o >= j10) {
            uVar.e.i();
        }
    }

    @Override // c3.l0
    public final void j(int i3) {
        this.g.e.j(i3);
    }

    @Override // c3.l0
    public final void k() {
        u uVar = this.g;
        uVar.getClass();
        int i3 = g2.z.c.a;
        uVar.l = null;
    }

    @Override // c3.l0
    public final void l(boolean z10) {
        this.d = -9223372036854775807L;
        u uVar = this.g;
        e eVar = uVar.e;
        if (uVar.n == 1) {
            uVar.m++;
            eVar.l(z10);
            while (uVar.j.p() > 1) {
                uVar.j.i();
            }
            if (uVar.j.p() == 1) {
                ((t) uVar.j.i()).getClass();
                throw null;
            }
            uVar.o = -9223372036854775807L;
            g2.j0 j0Var = uVar.k;
            j0Var.getClass();
            j0Var.d(new ai.s(uVar, 20));
        }
    }

    @Override // c3.l0
    public final void m(List list) {
        if (this.a.equals(list)) {
            return;
        }
        this.a = g9.i0.q(list);
        d2.v vVar = this.b;
        if (vVar == null) {
            return;
        }
        d2.u a10 = vVar.a();
        d2.n nVar = vVar.I;
        if (nVar == null || !nVar.d()) {
            nVar = d2.n.h;
        }
        a10.H = nVar;
        a10.a();
        throw null;
    }

    @Override // c3.l0
    public final void n(long j10, long j11) {
        this.g.e.n(j10 + this.c, j11);
    }

    @Override // c3.l0
    public final void o(Surface surface, g2.z zVar) {
        u uVar = this.g;
        Pair pair = uVar.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((g2.z) uVar.l.second).equals(zVar)) {
            return;
        }
        uVar.l = Pair.create(surface, zVar);
        int i3 = zVar.a;
    }

    @Override // c3.l0
    public final void p(w wVar) {
        this.g.e.j = wVar;
    }

    @Override // c3.l0
    public final void q(boolean z10) {
        u uVar = this.g;
        if (uVar.d) {
            uVar.e.q(z10);
        }
    }

    @Override // c3.l0
    public final boolean r(boolean z10) {
        return this.g.e.a.b(false);
    }

    @Override // c3.l0
    public final void release() {
        u uVar = this.g;
        if (uVar.n == 2) {
            return;
        }
        g2.j0 j0Var = uVar.k;
        if (j0Var != null) {
            j0Var.a.removeCallbacksAndMessages(null);
        }
        uVar.l = null;
        uVar.n = 2;
    }

    @Override // c3.l0
    public final boolean t(long j10, i iVar) {
        int i3;
        zb.p(false);
        long j11 = j10 + this.c;
        u uVar = this.g;
        z zVar = uVar.i;
        long j12 = zVar.a == -9223372036854775807L ? -9223372036854775807L : (long) (((j11 - r3) * zVar.c) + zVar.b);
        if (j12 != -9223372036854775807L) {
            long j13 = uVar.h;
            if (j13 != -9223372036854775807L && j12 < j13 && (i3 = this.e) < 2) {
                this.e = i3 + 1;
                l lVar = iVar.c;
                t2.l lVar2 = iVar.a;
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

    @Override // c3.l0
    public final boolean u() {
        return false;
    }

    @Override // c3.l0
    public final void v() {
        u uVar = this.g;
        if (uVar.j.p() == 0) {
            uVar.e.v();
            return;
        }
        g2.k0 k0Var = new g2.k0();
        if (uVar.j.p() <= 0) {
            uVar.j = k0Var;
        } else {
            ((t) uVar.j.i()).getClass();
            throw null;
        }
    }

    @Override // c3.l0
    public final void w(c6.i iVar) {
        this.f = l9.r.a;
    }

    @Override // c3.l0
    public final void s() {
    }
}
