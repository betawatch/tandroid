package o4;

import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import j3.h2;
import j3.r1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import l7.w0;
import mh.m2;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e0 implements t, r3.m, g5.h0, g5.k0, j0 {
    public static final Map Z;
    public static final j3.n0 a0;
    public s D;
    public i4.b E;
    public boolean H;
    public boolean I;
    public boolean J;
    public com.google.firebase.messaging.s K;
    public r3.s L;
    public boolean N;
    public boolean P;
    public boolean Q;
    public int R;
    public boolean S;
    public long T;
    public boolean V;
    public int W;
    public boolean X;
    public boolean Y;
    public final Uri a;
    public final g5.m b;
    public final o3.o c;
    public final ab.a d;
    public final b4.e0 e;
    public final o3.l f;
    public final f0 h;
    public final g5.q n;
    public final String r;
    public final long s;
    public final w0 w;
    public final g5.m0 v = new g5.m0("ProgressiveMediaPeriod");
    public final h5.c x = new h5.c();
    public final a0 y = new a0(this, 0);
    public final a0 B = new a0(this, 1);
    public final Handler C = h5.d0.l(null);
    public d0[] G = new d0[0];
    public k0[] F = new k0[0];
    public long U = -9223372036854775807L;
    public long M = -9223372036854775807L;
    public int O = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        Z = DesugarCollections.unmodifiableMap(hashMap);
        j3.m0 m0Var = new j3.m0();
        m0Var.a = "icy";
        m0Var.o = "application/x-icy";
        a0 = new j3.n0(m0Var);
    }

    public e0(Uri uri, g5.m mVar, w0 w0Var, o3.o oVar, o3.l lVar, ab.a aVar, b4.e0 e0Var, f0 f0Var, g5.q qVar, String str, int i10) {
        this.a = uri;
        this.b = mVar;
        this.c = oVar;
        this.f = lVar;
        this.d = aVar;
        this.e = e0Var;
        this.h = f0Var;
        this.n = qVar;
        this.r = str;
        this.s = i10;
        this.w = w0Var;
    }

    public final void A() {
        b0 b0Var = new b0(this, this.a, this.b, this.w, this, this.x);
        if (this.I) {
            h5.a.i(s());
            long j10 = this.M;
            if (j10 != -9223372036854775807L && this.U > j10) {
                this.X = true;
                this.U = -9223372036854775807L;
                return;
            }
            r3.s sVar = this.L;
            sVar.getClass();
            long j11 = sVar.f(this.U).a.b;
            long j12 = this.U;
            b0Var.f.a = j11;
            b0Var.r = j12;
            b0Var.n = true;
            b0Var.w = false;
            for (k0 k0Var : this.F) {
                k0Var.t = this.U;
            }
            this.U = -9223372036854775807L;
        }
        this.W = l();
        this.v.f(b0Var, this, this.d.n3(this.O));
        this.e.u(new j(b0Var.s), 1, -1, null, 0, null, b0Var.r, this.M);
    }

    public final boolean B() {
        return this.Q || s();
    }

    @Override // o4.j0
    public final void a() {
        this.C.post(this.y);
    }

    @Override // o4.n0
    public final boolean b() {
        boolean z4;
        if (!this.v.d()) {
            return false;
        }
        h5.c cVar = this.x;
        synchronized (cVar) {
            z4 = cVar.a;
        }
        return z4;
    }

    @Override // g5.k0
    public final void c() {
        for (k0 k0Var : this.F) {
            k0Var.A(true);
            o3.i iVar = k0Var.h;
            if (iVar != null) {
                iVar.c(k0Var.e);
                k0Var.h = null;
                k0Var.g = null;
            }
        }
        w0 w0Var = this.w;
        r3.k kVar = (r3.k) w0Var.c;
        if (kVar != null) {
            kVar.release();
            w0Var.c = null;
        }
        w0Var.d = null;
    }

    @Override // o4.t
    public final long d(long j10, h2 h2Var) {
        h();
        if (!this.L.c()) {
            return 0L;
        }
        r3.r f10 = this.L.f(j10);
        return h2Var.a(j10, f10.a.a, f10.b.a);
    }

    @Override // o4.n0
    public final long e() {
        return r();
    }

    @Override // o4.t
    public final void f(s sVar, long j10) {
        this.D = sVar;
        this.x.c();
        A();
    }

    @Override // o4.t
    public final long g(f5.c[] cVarArr, boolean[] zArr, l0[] l0VarArr, boolean[] zArr2, long j10) {
        f5.c cVar;
        h();
        com.google.firebase.messaging.s sVar = this.K;
        t0 t0Var = (t0) sVar.a;
        boolean[] zArr3 = (boolean[]) sVar.c;
        int i10 = this.R;
        int i11 = 0;
        for (int i12 = 0; i12 < cVarArr.length; i12++) {
            l0 l0Var = l0VarArr[i12];
            if (l0Var != null && (cVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((c0) l0Var).a;
                h5.a.i(zArr3[i13]);
                this.R--;
                zArr3[i13] = false;
                l0VarArr[i12] = null;
            }
        }
        boolean z4 = !this.P ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < cVarArr.length; i14++) {
            if (l0VarArr[i14] == null && (cVar = cVarArr[i14]) != null) {
                h5.a.i(cVar.p() == 1);
                h5.a.i(cVar.f(0) == 0);
                int b10 = t0Var.b(cVar.l());
                h5.a.i(!zArr3[b10]);
                this.R++;
                zArr3[b10] = true;
                l0VarArr[i14] = new c0(this, b10);
                zArr2[i14] = true;
                if (!z4) {
                    k0 k0Var = this.F[b10];
                    z4 = (k0Var.D(j10, true) || k0Var.q() == 0) ? false : true;
                }
            }
        }
        if (this.R == 0) {
            this.V = false;
            this.Q = false;
            g5.m0 m0Var = this.v;
            if (m0Var.d()) {
                k0[] k0VarArr = this.F;
                int length = k0VarArr.length;
                while (i11 < length) {
                    k0VarArr[i11].i();
                    i11++;
                }
                m0Var.b();
            } else {
                for (k0 k0Var2 : this.F) {
                    k0Var2.A(false);
                }
            }
        } else if (z4) {
            j10 = j(j10);
            while (i11 < l0VarArr.length) {
                if (l0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.P = true;
        return j10;
    }

    public final void h() {
        h5.a.i(this.I);
        this.K.getClass();
        this.L.getClass();
    }

    @Override // o4.t
    public final void i() {
        int n32 = this.d.n3(this.O);
        g5.m0 m0Var = this.v;
        IOException iOException = m0Var.c;
        if (iOException != null) {
            throw iOException;
        }
        g5.i0 i0Var = m0Var.b;
        if (i0Var != null) {
            if (n32 == Integer.MIN_VALUE) {
                n32 = i0Var.a;
            }
            IOException iOException2 = i0Var.e;
            if (iOException2 != null && i0Var.f > n32) {
                throw iOException2;
            }
        }
        if (this.X && !this.I) {
            throw r1.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // r3.m
    public final void i1() {
        this.H = true;
        this.C.post(this.y);
    }

    @Override // r3.m
    public final r3.v i2(int i10, int i11) {
        return z(new d0(i10, false));
    }

    @Override // o4.t
    public final long j(long j10) {
        int i10;
        h();
        boolean[] zArr = (boolean[]) this.K.b;
        if (!this.L.c()) {
            j10 = 0;
        }
        this.Q = false;
        this.T = j10;
        if (s()) {
            this.U = j10;
            return j10;
        }
        if (this.O != 7) {
            int length = this.F.length;
            while (i10 < length) {
                i10 = (this.F[i10].D(j10, false) || (!zArr[i10] && this.J)) ? i10 + 1 : 0;
            }
            return j10;
        }
        this.V = false;
        this.U = j10;
        this.X = false;
        g5.m0 m0Var = this.v;
        if (m0Var.d()) {
            for (k0 k0Var : this.F) {
                k0Var.i();
            }
            m0Var.b();
            return j10;
        }
        m0Var.c = null;
        for (k0 k0Var2 : this.F) {
            k0Var2.A(false);
        }
        return j10;
    }

    @Override // o4.t
    public final void k(long j10) {
        h();
        if (s()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.K.c;
        int length = this.F.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.F[i10].h(j10, zArr[i10]);
        }
    }

    public final int l() {
        int i10 = 0;
        for (k0 k0Var : this.F) {
            i10 += k0Var.q + k0Var.p;
        }
        return i10;
    }

    @Override // o4.n0
    public final boolean m(long j10) {
        if (this.X) {
            return false;
        }
        g5.m0 m0Var = this.v;
        if (m0Var.c() || this.V) {
            return false;
        }
        if (this.I && this.R == 0) {
            return false;
        }
        boolean c3 = this.x.c();
        if (m0Var.d()) {
            return c3;
        }
        A();
        return true;
    }

    @Override // r3.m
    public final void m2(r3.s sVar) {
        this.C.post(new m2(23, this, sVar));
    }

    @Override // o4.t
    public final long n() {
        if (!this.Q) {
            return -9223372036854775807L;
        }
        if (!this.X && l() <= this.W) {
            return -9223372036854775807L;
        }
        this.Q = false;
        return this.T;
    }

    @Override // o4.t
    public final t0 o() {
        h();
        return (t0) this.K.a;
    }

    public final long p(boolean z4) {
        int i10;
        long j10 = Long.MIN_VALUE;
        while (i10 < this.F.length) {
            if (!z4) {
                com.google.firebase.messaging.s sVar = this.K;
                sVar.getClass();
                i10 = ((boolean[]) sVar.c)[i10] ? 0 : i10 + 1;
            }
            j10 = Math.max(j10, this.F[i10].n());
        }
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    @Override // g5.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c4.e q(g5.j0 j0Var, IOException iOException, int i10) {
        long j10;
        c4.e eVar;
        r3.s sVar;
        b0 b0Var = (b0) j0Var;
        Uri uri = b0Var.b.c;
        j jVar = new j();
        int i11 = h5.d0.a;
        this.d.getClass();
        if (!(iOException instanceof r1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof g5.b0) && !(iOException instanceof g5.l0)) {
            int i12 = g5.n.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof g5.n) || ((g5.n) th2).a != 2008) {
                }
            }
            j10 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            if (j10 != -9223372036854775807L) {
                eVar = g5.m0.f;
            } else {
                int l10 = l();
                int i13 = l10 > this.W ? 1 : 0;
                if (this.S || !((sVar = this.L) == null || sVar.g() == -9223372036854775807L)) {
                    this.W = l10;
                } else if (!this.I || B()) {
                    this.Q = this.I;
                    this.T = 0L;
                    this.W = 0;
                    for (k0 k0Var : this.F) {
                        k0Var.A(false);
                    }
                    b0Var.f.a = 0L;
                    b0Var.r = 0L;
                    b0Var.n = true;
                    b0Var.w = false;
                } else {
                    this.V = true;
                    eVar = g5.m0.e;
                }
                eVar = new c4.e(i13, j10, false);
            }
            c4.e eVar2 = eVar;
            this.e.r(jVar, 1, -1, null, 0, null, b0Var.r, this.M, iOException, !eVar2.a());
            return eVar2;
        }
        j10 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
        }
        c4.e eVar22 = eVar;
        this.e.r(jVar, 1, -1, null, 0, null, b0Var.r, this.M, iOException, !eVar22.a());
        return eVar22;
    }

    @Override // o4.n0
    public final long r() {
        long j10;
        boolean z4;
        h();
        if (this.X || this.R == 0) {
            return Long.MIN_VALUE;
        }
        if (s()) {
            return this.U;
        }
        if (this.J) {
            int length = this.F.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                com.google.firebase.messaging.s sVar = this.K;
                if (((boolean[]) sVar.b)[i10] && ((boolean[]) sVar.c)[i10]) {
                    k0 k0Var = this.F[i10];
                    synchronized (k0Var) {
                        z4 = k0Var.w;
                    }
                    if (!z4) {
                        j10 = Math.min(j10, this.F[i10].n());
                    }
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = p(false);
        }
        return j10 == Long.MIN_VALUE ? this.T : j10;
    }

    public final boolean s() {
        return this.U != -9223372036854775807L;
    }

    @Override // g5.h0
    public final void u(g5.j0 j0Var, long j10, long j11, boolean z4) {
        b0 b0Var = (b0) j0Var;
        Uri uri = b0Var.b.c;
        j jVar = new j();
        this.d.getClass();
        this.e.m(jVar, 1, -1, null, 0, null, b0Var.r, this.M);
        if (z4) {
            return;
        }
        for (k0 k0Var : this.F) {
            k0Var.A(false);
        }
        if (this.R > 0) {
            s sVar = this.D;
            sVar.getClass();
            sVar.s(this);
        }
    }

    public final void v() {
        if (this.Y || this.I || !this.H || this.L == null) {
            return;
        }
        for (k0 k0Var : this.F) {
            if (k0Var.t() == null) {
                return;
            }
        }
        this.x.b();
        int length = this.F.length;
        s0[] s0VarArr = new s0[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            j3.n0 t6 = this.F[i10].t();
            t6.getClass();
            String str = t6.C;
            boolean h = h5.o.h(str);
            boolean z4 = h || h5.o.j(str);
            zArr[i10] = z4;
            this.J = z4 | this.J;
            i4.b bVar = this.E;
            if (bVar != null) {
                int i11 = bVar.a;
                if (h || this.G[i10].b) {
                    e4.c cVar = t6.s;
                    e4.c cVar2 = cVar == null ? new e4.c(bVar) : cVar.a(bVar);
                    j3.m0 a2 = t6.a();
                    a2.i = cVar2;
                    t6 = new j3.n0(a2);
                }
                if (h && t6.f == -1 && t6.h == -1 && i11 != -1) {
                    j3.m0 a10 = t6.a();
                    a10.f = i11;
                    t6 = new j3.n0(a10);
                }
            }
            int b10 = this.c.b(t6);
            j3.m0 a11 = t6.a();
            a11.J = b10;
            s0VarArr[i10] = new s0(Integer.toString(i10), new j3.n0(a11));
        }
        t0 t0Var = new t0(s0VarArr);
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s();
        sVar.a = t0Var;
        sVar.b = zArr;
        int i12 = t0Var.a;
        sVar.c = new boolean[i12];
        sVar.d = new boolean[i12];
        this.K = sVar;
        this.I = true;
        s sVar2 = this.D;
        sVar2.getClass();
        sVar2.a(this);
    }

    public final void w(int i10) {
        h();
        com.google.firebase.messaging.s sVar = this.K;
        boolean[] zArr = (boolean[]) sVar.d;
        if (zArr[i10]) {
            return;
        }
        j3.n0 n0Var = ((t0) sVar.a).a(i10).d[0];
        this.e.h(h5.o.g(n0Var.C), n0Var, 0, null, this.T);
        zArr[i10] = true;
    }

    @Override // g5.h0
    public final void x(g5.j0 j0Var, long j10, long j11) {
        r3.s sVar;
        b0 b0Var = (b0) j0Var;
        if (this.M == -9223372036854775807L && (sVar = this.L) != null) {
            boolean c3 = sVar.c();
            long p10 = p(true);
            long j12 = p10 == Long.MIN_VALUE ? 0L : p10 + 10000;
            this.M = j12;
            this.h.t(j12, c3, this.N);
        }
        Uri uri = b0Var.b.c;
        j jVar = new j();
        this.d.getClass();
        this.e.p(jVar, 1, -1, null, 0, null, b0Var.r, this.M);
        this.X = true;
        s sVar2 = this.D;
        sVar2.getClass();
        sVar2.s(this);
    }

    public final void y(int i10) {
        h();
        boolean[] zArr = (boolean[]) this.K.b;
        if (this.V && zArr[i10] && !this.F[i10].u(false)) {
            this.U = 0L;
            this.V = false;
            this.Q = true;
            this.T = 0L;
            this.W = 0;
            for (k0 k0Var : this.F) {
                k0Var.A(false);
            }
            s sVar = this.D;
            sVar.getClass();
            sVar.s(this);
        }
    }

    public final k0 z(d0 d0Var) {
        int length = this.F.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (d0Var.equals(this.G[i10])) {
                return this.F[i10];
            }
        }
        o3.o oVar = this.c;
        oVar.getClass();
        k0 k0Var = new k0(this.n, oVar, this.f);
        k0Var.f = this;
        int i11 = length + 1;
        d0[] d0VarArr = (d0[]) Arrays.copyOf(this.G, i11);
        d0VarArr[length] = d0Var;
        this.G = d0VarArr;
        k0[] k0VarArr = (k0[]) Arrays.copyOf(this.F, i11);
        k0VarArr[length] = k0Var;
        this.F = k0VarArr;
        return k0Var;
    }

    @Override // o4.n0
    public final void t(long j10) {
    }
}
