package j4;

import android.net.Uri;
import android.os.Handler;
import h3.j2;
import h3.t1;
import hh.m5;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r0 implements z, m3.m, com.google.android.exoplayer2.upstream.l0, com.google.android.exoplayer2.upstream.o0, z0 {
    public static final Map X;
    public static final h3.t0 Y;
    public y B;
    public d4.b C;
    public boolean F;
    public boolean G;
    public boolean H;
    public com.google.firebase.messaging.t I;
    public m3.t J;
    public boolean L;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public long R;
    public boolean T;
    public int U;
    public boolean V;
    public boolean W;
    public final Uri a;
    public final com.google.android.exoplayer2.upstream.m b;
    public final l3.j c;
    public final ab.a d;
    public final g0 e;
    public final b6.a f;
    public final t0 h;
    public final com.google.android.exoplayer2.upstream.r n;
    public final long r;
    public final a5.n v;
    public final com.google.android.exoplayer2.upstream.q0 s = new com.google.android.exoplayer2.upstream.q0("ProgressiveMediaPeriod");
    public final d5.c w = new d5.c();
    public final n0 x = new n0(this, 0);
    public final n0 y = new n0(this, 1);
    public final Handler A = d5.g0.k(null);
    public q0[] E = new q0[0];
    public a1[] D = new a1[0];
    public long S = -9223372036854775807L;
    public long K = -9223372036854775807L;
    public int M = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        X = DesugarCollections.unmodifiableMap(hashMap);
        h3.s0 s0Var = new h3.s0();
        s0Var.a = "icy";
        s0Var.o = "application/x-icy";
        Y = new h3.t0(s0Var);
    }

    public r0(Uri uri, com.google.android.exoplayer2.upstream.m mVar, a5.n nVar, l3.j jVar, b6.a aVar, ab.a aVar2, g0 g0Var, t0 t0Var, com.google.android.exoplayer2.upstream.r rVar, int i10) {
        this.a = uri;
        this.b = mVar;
        this.c = jVar;
        this.f = aVar;
        this.d = aVar2;
        this.e = g0Var;
        this.h = t0Var;
        this.n = rVar;
        this.r = i10;
        this.v = nVar;
    }

    @Override // m3.m
    public final void A() {
        this.F = true;
        this.A.post(this.x);
    }

    @Override // j4.z
    public final long B(long j10, j2 j2Var) {
        e();
        if (!this.J.e()) {
            return 0L;
        }
        m3.s h = this.J.h(j10);
        return j2Var.a(j10, h.a.a, h.b.a);
    }

    @Override // m3.m
    public final m3.w C(int i10, int i11) {
        return t(new q0(i10, false));
    }

    @Override // j4.d1
    public final long D() {
        long j10;
        boolean z10;
        e();
        if (this.V || this.P == 0) {
            return Long.MIN_VALUE;
        }
        if (j()) {
            return this.S;
        }
        if (this.H) {
            int length = this.D.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                com.google.firebase.messaging.t tVar = this.I;
                if (((boolean[]) tVar.c)[i10] && ((boolean[]) tVar.d)[i10]) {
                    a1 a1Var = this.D[i10];
                    synchronized (a1Var) {
                        z10 = a1Var.w;
                    }
                    if (!z10) {
                        j10 = Math.min(j10, this.D[i10].n());
                    }
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = i(false);
        }
        return j10 == Long.MIN_VALUE ? this.R : j10;
    }

    @Override // j4.z
    public final void E(y yVar, long j10) {
        this.B = yVar;
        this.w.c();
        u();
    }

    @Override // j4.z
    public final long F(b5.s[] sVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        b5.s sVar;
        e();
        com.google.firebase.messaging.t tVar = this.I;
        j1 j1Var = (j1) tVar.b;
        boolean[] zArr3 = (boolean[]) tVar.d;
        int i10 = this.P;
        int i11 = 0;
        for (int i12 = 0; i12 < sVarArr.length; i12++) {
            b1 b1Var = b1VarArr[i12];
            if (b1Var != null && (sVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((p0) b1Var).a;
                d5.a.i(zArr3[i13]);
                this.P--;
                zArr3[i13] = false;
                b1VarArr[i12] = null;
            }
        }
        boolean z10 = !this.N ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < sVarArr.length; i14++) {
            if (b1VarArr[i14] == null && (sVar = sVarArr[i14]) != null) {
                d5.a.i(sVar.length() == 1);
                d5.a.i(sVar.j(0) == 0);
                int b10 = j1Var.b(sVar.b());
                d5.a.i(!zArr3[b10]);
                this.P++;
                zArr3[b10] = true;
                b1VarArr[i14] = new p0(this, b10);
                zArr2[i14] = true;
                if (!z10) {
                    a1 a1Var = this.D[b10];
                    z10 = (a1Var.D(j10, true) || a1Var.q() == 0) ? false : true;
                }
            }
        }
        if (this.P == 0) {
            this.T = false;
            this.O = false;
            com.google.android.exoplayer2.upstream.q0 q0Var = this.s;
            if (q0Var.d()) {
                a1[] a1VarArr = this.D;
                int length = a1VarArr.length;
                while (i11 < length) {
                    a1VarArr[i11].i();
                    i11++;
                }
                q0Var.b();
            } else {
                for (a1 a1Var2 : this.D) {
                    a1Var2.A(false);
                }
            }
        } else if (z10) {
            j10 = o(j10);
            while (i11 < b1VarArr.length) {
                if (b1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.N = true;
        return j10;
    }

    @Override // j4.z0
    public final void a() {
        this.A.post(this.x);
    }

    @Override // j4.d1
    public final boolean b() {
        boolean z10;
        if (!this.s.d()) {
            return false;
        }
        d5.c cVar = this.w;
        synchronized (cVar) {
            z10 = cVar.a;
        }
        return z10;
    }

    @Override // com.google.android.exoplayer2.upstream.o0
    public final void c() {
        for (a1 a1Var : this.D) {
            a1Var.A(true);
            l3.f fVar = a1Var.h;
            if (fVar != null) {
                fVar.h(a1Var.e);
                a1Var.h = null;
                a1Var.g = null;
            }
        }
        a5.n nVar = this.v;
        m3.k kVar = (m3.k) nVar.c;
        if (kVar != null) {
            kVar.release();
            nVar.c = null;
        }
        nVar.d = null;
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final void d(com.google.android.exoplayer2.upstream.n0 n0Var, long j10, long j11, boolean z10) {
        o0 o0Var = (o0) n0Var;
        Uri uri = o0Var.b.c;
        p pVar = new p();
        this.d.getClass();
        this.e.d(pVar, 1, -1, null, 0, null, o0Var.r, this.K);
        if (z10) {
            return;
        }
        for (a1 a1Var : this.D) {
            a1Var.A(false);
        }
        if (this.P > 0) {
            y yVar = this.B;
            yVar.getClass();
            yVar.a(this);
        }
    }

    public final void e() {
        d5.a.i(this.G);
        this.I.getClass();
        this.J.getClass();
    }

    public final int f() {
        int i10 = 0;
        for (a1 a1Var : this.D) {
            i10 += a1Var.q + a1Var.p;
        }
        return i10;
    }

    @Override // j4.d1
    public final long g() {
        return D();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    @Override // com.google.android.exoplayer2.upstream.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.exoplayer2.upstream.k0 h(com.google.android.exoplayer2.upstream.n0 n0Var, IOException iOException, int i10) {
        long j10;
        com.google.android.exoplayer2.upstream.k0 k0Var;
        m3.t tVar;
        o0 o0Var = (o0) n0Var;
        Uri uri = o0Var.b.c;
        p pVar = new p();
        int i11 = d5.g0.a;
        this.d.getClass();
        if (!(iOException instanceof t1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof com.google.android.exoplayer2.upstream.e0) && !(iOException instanceof com.google.android.exoplayer2.upstream.p0)) {
            int i12 = com.google.android.exoplayer2.upstream.n.b;
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof com.google.android.exoplayer2.upstream.n) || ((com.google.android.exoplayer2.upstream.n) th).a != 2008) {
                }
            }
            j10 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            if (j10 != -9223372036854775807L) {
                k0Var = com.google.android.exoplayer2.upstream.q0.f;
            } else {
                int f10 = f();
                int i13 = f10 > this.U ? 1 : 0;
                if (this.Q || !((tVar = this.J) == null || tVar.i() == -9223372036854775807L)) {
                    this.U = f10;
                } else if (!this.G || v()) {
                    this.O = this.G;
                    this.R = 0L;
                    this.U = 0;
                    for (a1 a1Var : this.D) {
                        a1Var.A(false);
                    }
                    o0Var.f.a = 0L;
                    o0Var.r = 0L;
                    o0Var.n = true;
                    o0Var.w = false;
                } else {
                    this.T = true;
                    k0Var = com.google.android.exoplayer2.upstream.q0.e;
                }
                k0Var = new com.google.android.exoplayer2.upstream.k0(i13, j10, false);
            }
            com.google.android.exoplayer2.upstream.k0 k0Var2 = k0Var;
            this.e.h(pVar, 1, -1, null, 0, null, o0Var.r, this.K, iOException, !k0Var2.a());
            return k0Var2;
        }
        j10 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
        }
        com.google.android.exoplayer2.upstream.k0 k0Var22 = k0Var;
        this.e.h(pVar, 1, -1, null, 0, null, o0Var.r, this.K, iOException, !k0Var22.a());
        return k0Var22;
    }

    public final long i(boolean z10) {
        int i10;
        long j10 = Long.MIN_VALUE;
        while (i10 < this.D.length) {
            if (!z10) {
                com.google.firebase.messaging.t tVar = this.I;
                tVar.getClass();
                i10 = ((boolean[]) tVar.d)[i10] ? 0 : i10 + 1;
            }
            j10 = Math.max(j10, this.D[i10].n());
        }
        return j10;
    }

    public final boolean j() {
        return this.S != -9223372036854775807L;
    }

    public final void k() {
        z3.c cVar;
        if (this.W || this.G || !this.F || this.J == null) {
            return;
        }
        for (a1 a1Var : this.D) {
            if (a1Var.t() == null) {
                return;
            }
        }
        this.w.b();
        int length = this.D.length;
        i1[] i1VarArr = new i1[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            h3.t0 t10 = this.D[i10].t();
            t10.getClass();
            String str = t10.B;
            boolean h = d5.q.h(str);
            boolean z10 = h || d5.q.j(str);
            zArr[i10] = z10;
            this.H = z10 | this.H;
            d4.b bVar = this.C;
            if (bVar != null) {
                int i11 = bVar.a;
                if (h || this.E[i10].b) {
                    z3.c cVar2 = t10.s;
                    if (cVar2 == null) {
                        cVar = new z3.c(bVar);
                    } else {
                        long j10 = cVar2.b;
                        z3.b[] bVarArr = cVar2.a;
                        int i12 = d5.g0.a;
                        Object[] copyOf = Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        System.arraycopy(new z3.b[]{bVar}, 0, copyOf, bVarArr.length, 1);
                        cVar = new z3.c(j10, (z3.b[]) copyOf);
                    }
                    h3.s0 a2 = t10.a();
                    a2.i = cVar;
                    t10 = new h3.t0(a2);
                }
                if (h && t10.f == -1 && t10.h == -1 && i11 != -1) {
                    h3.s0 a3 = t10.a();
                    a3.f = i11;
                    t10 = new h3.t0(a3);
                }
            }
            int m10 = this.c.m(t10);
            h3.s0 a10 = t10.a();
            a10.J = m10;
            i1VarArr[i10] = new i1(Integer.toString(i10), new h3.t0(a10));
        }
        this.I = new com.google.firebase.messaging.t(new j1(i1VarArr), zArr);
        this.G = true;
        y yVar = this.B;
        yVar.getClass();
        yVar.e(this);
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final void l(com.google.android.exoplayer2.upstream.n0 n0Var, long j10, long j11) {
        m3.t tVar;
        o0 o0Var = (o0) n0Var;
        if (this.K == -9223372036854775807L && (tVar = this.J) != null) {
            boolean e9 = tVar.e();
            long i10 = i(true);
            long j12 = i10 == Long.MIN_VALUE ? 0L : i10 + 10000;
            this.K = j12;
            this.h.t(j12, e9, this.L);
        }
        Uri uri = o0Var.b.c;
        p pVar = new p();
        this.d.getClass();
        this.e.f(pVar, 1, -1, null, 0, null, o0Var.r, this.K);
        this.V = true;
        y yVar = this.B;
        yVar.getClass();
        yVar.a(this);
    }

    @Override // j4.z
    public final void m() {
        int z32 = this.d.z3(this.M);
        com.google.android.exoplayer2.upstream.q0 q0Var = this.s;
        IOException iOException = q0Var.c;
        if (iOException != null) {
            throw iOException;
        }
        com.google.android.exoplayer2.upstream.m0 m0Var = q0Var.b;
        if (m0Var != null) {
            if (z32 == Integer.MIN_VALUE) {
                z32 = m0Var.a;
            }
            IOException iOException2 = m0Var.e;
            if (iOException2 != null && m0Var.f > z32) {
                throw iOException2;
            }
        }
        if (this.V && !this.G) {
            throw t1.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // m3.m
    public final void n(m3.t tVar) {
        this.A.post(new m5(15, this, tVar));
    }

    @Override // j4.z
    public final long o(long j10) {
        int i10;
        e();
        boolean[] zArr = (boolean[]) this.I.c;
        if (!this.J.e()) {
            j10 = 0;
        }
        this.O = false;
        this.R = j10;
        if (j()) {
            this.S = j10;
            return j10;
        }
        if (this.M != 7) {
            int length = this.D.length;
            while (i10 < length) {
                i10 = (this.D[i10].D(j10, false) || (!zArr[i10] && this.H)) ? i10 + 1 : 0;
            }
            return j10;
        }
        this.T = false;
        this.S = j10;
        this.V = false;
        com.google.android.exoplayer2.upstream.q0 q0Var = this.s;
        if (q0Var.d()) {
            for (a1 a1Var : this.D) {
                a1Var.i();
            }
            q0Var.b();
            return j10;
        }
        q0Var.c = null;
        for (a1 a1Var2 : this.D) {
            a1Var2.A(false);
        }
        return j10;
    }

    @Override // j4.z
    public final void p(long j10) {
        e();
        if (j()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.I.d;
        int length = this.D.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.D[i10].h(j10, zArr[i10]);
        }
    }

    @Override // j4.d1
    public final boolean q(long j10) {
        if (this.V) {
            return false;
        }
        com.google.android.exoplayer2.upstream.q0 q0Var = this.s;
        if (q0Var.c() || this.T) {
            return false;
        }
        if (this.G && this.P == 0) {
            return false;
        }
        boolean c10 = this.w.c();
        if (q0Var.d()) {
            return c10;
        }
        u();
        return true;
    }

    public final void r(int i10) {
        e();
        com.google.firebase.messaging.t tVar = this.I;
        boolean[] zArr = (boolean[]) tVar.e;
        if (zArr[i10]) {
            return;
        }
        h3.t0 t0Var = ((j1) tVar.b).a(i10).d[0];
        this.e.b(d5.q.g(t0Var.B), t0Var, 0, null, this.R);
        zArr[i10] = true;
    }

    public final void s(int i10) {
        e();
        boolean[] zArr = (boolean[]) this.I.c;
        if (this.T && zArr[i10] && !this.D[i10].u(false)) {
            this.S = 0L;
            this.T = false;
            this.O = true;
            this.R = 0L;
            this.U = 0;
            for (a1 a1Var : this.D) {
                a1Var.A(false);
            }
            y yVar = this.B;
            yVar.getClass();
            yVar.a(this);
        }
    }

    public final a1 t(q0 q0Var) {
        int length = this.D.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (q0Var.equals(this.E[i10])) {
                return this.D[i10];
            }
        }
        l3.j jVar = this.c;
        jVar.getClass();
        a1 a1Var = new a1(this.n, jVar, this.f);
        a1Var.f = this;
        int i11 = length + 1;
        q0[] q0VarArr = (q0[]) Arrays.copyOf(this.E, i11);
        q0VarArr[length] = q0Var;
        this.E = q0VarArr;
        a1[] a1VarArr = (a1[]) Arrays.copyOf(this.D, i11);
        a1VarArr[length] = a1Var;
        this.D = a1VarArr;
        return a1Var;
    }

    public final void u() {
        o0 o0Var = new o0(this, this.a, this.b, this.v, this, this.w);
        if (this.G) {
            d5.a.i(j());
            long j10 = this.K;
            if (j10 != -9223372036854775807L && this.S > j10) {
                this.V = true;
                this.S = -9223372036854775807L;
                return;
            }
            m3.t tVar = this.J;
            tVar.getClass();
            long j11 = tVar.h(this.S).a.b;
            long j12 = this.S;
            o0Var.f.a = j11;
            o0Var.r = j12;
            o0Var.n = true;
            o0Var.w = false;
            for (a1 a1Var : this.D) {
                a1Var.t = this.S;
            }
            this.S = -9223372036854775807L;
        }
        this.U = f();
        this.s.f(o0Var, this, this.d.z3(this.M));
        this.e.k(new p(o0Var.s), 1, -1, null, 0, null, o0Var.r, this.K);
    }

    public final boolean v() {
        return this.O || j();
    }

    @Override // j4.z
    public final long w() {
        if (!this.O) {
            return -9223372036854775807L;
        }
        if (!this.V && f() <= this.U) {
            return -9223372036854775807L;
        }
        this.O = false;
        return this.R;
    }

    @Override // j4.z
    public final j1 z() {
        e();
        return (j1) this.I.b;
    }

    @Override // j4.d1
    public final void I(long j10) {
    }
}
