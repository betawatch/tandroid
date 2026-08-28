package j4;

import android.net.Uri;
import android.os.Handler;
import h3.j2;
import h3.t1;
import ih.j7;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s0 implements a0, m3.m, com.google.android.exoplayer2.upstream.l0, com.google.android.exoplayer2.upstream.o0, z0 {
    public static final Map Y;
    public static final h3.t0 Z;
    public z C;
    public d4.b D;
    public boolean G;
    public boolean H;
    public boolean I;
    public com.google.firebase.messaging.t J;
    public m3.t K;
    public boolean M;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public long S;
    public boolean U;
    public int V;
    public boolean W;
    public boolean X;
    public final Uri a;
    public final com.google.android.exoplayer2.upstream.m b;
    public final l3.i c;
    public final v9.d d;
    public final h0 e;
    public final a6.a f;
    public final u0 h;
    public final com.google.android.exoplayer2.upstream.r n;
    public final String r;
    public final long s;
    public final c w;
    public final com.google.android.exoplayer2.upstream.q0 v = new com.google.android.exoplayer2.upstream.q0("ProgressiveMediaPeriod");
    public final d5.c x = new d5.c();
    public final o0 y = new o0(this, 0);
    public final o0 A = new o0(this, 1);
    public final Handler B = d5.f0.k(null);
    public r0[] F = new r0[0];
    public a1[] E = new a1[0];
    public long T = -9223372036854775807L;
    public long L = -9223372036854775807L;
    public int N = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        Y = DesugarCollections.unmodifiableMap(hashMap);
        h3.s0 s0Var = new h3.s0();
        s0Var.a = "icy";
        s0Var.o = "application/x-icy";
        Z = new h3.t0(s0Var);
    }

    public s0(Uri uri, com.google.android.exoplayer2.upstream.m mVar, c cVar, l3.i iVar, a6.a aVar, v9.d dVar, h0 h0Var, u0 u0Var, com.google.android.exoplayer2.upstream.r rVar, String str, int i9) {
        this.a = uri;
        this.b = mVar;
        this.c = iVar;
        this.f = aVar;
        this.d = dVar;
        this.e = h0Var;
        this.h = u0Var;
        this.n = rVar;
        this.r = str;
        this.s = i9;
        this.w = cVar;
    }

    public final a1 A(r0 r0Var) {
        int length = this.E.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (r0Var.equals(this.F[i9])) {
                return this.E[i9];
            }
        }
        l3.i iVar = this.c;
        iVar.getClass();
        a1 a1Var = new a1(this.n, iVar, this.f);
        a1Var.f = this;
        int i10 = length + 1;
        r0[] r0VarArr = (r0[]) Arrays.copyOf(this.F, i10);
        r0VarArr[length] = r0Var;
        this.F = r0VarArr;
        a1[] a1VarArr = (a1[]) Arrays.copyOf(this.E, i10);
        a1VarArr[length] = a1Var;
        this.E = a1VarArr;
        return a1Var;
    }

    @Override // m3.m
    public final void B() {
        this.G = true;
        this.B.post(this.y);
    }

    public final void C() {
        p0 p0Var = new p0(this, this.a, this.b, this.w, this, this.x);
        if (this.H) {
            d5.a.i(p());
            long j10 = this.L;
            if (j10 != -9223372036854775807L && this.T > j10) {
                this.W = true;
                this.T = -9223372036854775807L;
                return;
            }
            m3.t tVar = this.K;
            tVar.getClass();
            long j11 = tVar.h(this.T).a.b;
            long j12 = this.T;
            p0Var.f.a = j11;
            p0Var.r = j12;
            p0Var.n = true;
            p0Var.w = false;
            for (a1 a1Var : this.E) {
                a1Var.t = this.T;
            }
            this.T = -9223372036854775807L;
        }
        this.V = j();
        this.v.f(p0Var, this, this.d.l3(this.N));
        this.e.k(new q(p0Var.s), 1, -1, null, 0, null, p0Var.r, this.L);
    }

    public final boolean D() {
        return this.P || p();
    }

    @Override // m3.m
    public final m3.w I(int i9, int i10) {
        return A(new r0(i9, false));
    }

    @Override // j4.z0
    public final void a() {
        this.B.post(this.y);
    }

    @Override // j4.d1
    public final boolean b() {
        boolean z10;
        if (!this.v.d()) {
            return false;
        }
        d5.c cVar = this.x;
        synchronized (cVar) {
            z10 = cVar.a;
        }
        return z10;
    }

    @Override // com.google.android.exoplayer2.upstream.o0
    public final void c() {
        for (a1 a1Var : this.E) {
            a1Var.A(true);
            l3.e eVar = a1Var.h;
            if (eVar != null) {
                eVar.k(a1Var.e);
                a1Var.h = null;
                a1Var.g = null;
            }
        }
        c cVar = this.w;
        m3.k kVar = (m3.k) cVar.c;
        if (kVar != null) {
            kVar.release();
            cVar.c = null;
        }
        cVar.d = null;
    }

    @Override // j4.d1
    public final long d() {
        return v();
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final void e(com.google.android.exoplayer2.upstream.n0 n0Var, long j10, long j11, boolean z10) {
        p0 p0Var = (p0) n0Var;
        Uri uri = p0Var.b.c;
        q qVar = new q();
        this.d.getClass();
        this.e.d(qVar, 1, -1, null, 0, null, p0Var.r, this.L);
        if (z10) {
            return;
        }
        for (a1 a1Var : this.E) {
            a1Var.A(false);
        }
        if (this.Q > 0) {
            z zVar = this.C;
            zVar.getClass();
            zVar.c(this);
        }
    }

    public final void f() {
        d5.a.i(this.H);
        this.J.getClass();
        this.K.getClass();
    }

    @Override // j4.a0
    public final void g() {
        int l32 = this.d.l3(this.N);
        com.google.android.exoplayer2.upstream.q0 q0Var = this.v;
        IOException iOException = q0Var.c;
        if (iOException != null) {
            throw iOException;
        }
        com.google.android.exoplayer2.upstream.m0 m0Var = q0Var.b;
        if (m0Var != null) {
            if (l32 == Integer.MIN_VALUE) {
                l32 = m0Var.a;
            }
            IOException iOException2 = m0Var.e;
            if (iOException2 != null && m0Var.f > l32) {
                throw iOException2;
            }
        }
        if (this.W && !this.H) {
            throw t1.a("Loading finished before preparation is complete.", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    @Override // com.google.android.exoplayer2.upstream.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.exoplayer2.upstream.k0 h(com.google.android.exoplayer2.upstream.n0 n0Var, IOException iOException, int i9) {
        long j10;
        com.google.android.exoplayer2.upstream.k0 k0Var;
        m3.t tVar;
        p0 p0Var = (p0) n0Var;
        Uri uri = p0Var.b.c;
        q qVar = new q();
        int i10 = d5.f0.a;
        this.d.getClass();
        if (!(iOException instanceof t1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof com.google.android.exoplayer2.upstream.e0) && !(iOException instanceof com.google.android.exoplayer2.upstream.p0)) {
            int i11 = com.google.android.exoplayer2.upstream.n.b;
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof com.google.android.exoplayer2.upstream.n) || ((com.google.android.exoplayer2.upstream.n) th).a != 2008) {
                }
            }
            j10 = Math.min((i9 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            if (j10 != -9223372036854775807L) {
                k0Var = com.google.android.exoplayer2.upstream.q0.f;
            } else {
                int j11 = j();
                int i12 = j11 > this.V ? 1 : 0;
                if (this.R || !((tVar = this.K) == null || tVar.i() == -9223372036854775807L)) {
                    this.V = j11;
                } else if (!this.H || D()) {
                    this.P = this.H;
                    this.S = 0L;
                    this.V = 0;
                    for (a1 a1Var : this.E) {
                        a1Var.A(false);
                    }
                    p0Var.f.a = 0L;
                    p0Var.r = 0L;
                    p0Var.n = true;
                    p0Var.w = false;
                } else {
                    this.U = true;
                    k0Var = com.google.android.exoplayer2.upstream.q0.e;
                }
                k0Var = new com.google.android.exoplayer2.upstream.k0(i12, j10, false);
            }
            com.google.android.exoplayer2.upstream.k0 k0Var2 = k0Var;
            this.e.h(qVar, 1, -1, null, 0, null, p0Var.r, this.L, iOException, !k0Var2.a());
            return k0Var2;
        }
        j10 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
        }
        com.google.android.exoplayer2.upstream.k0 k0Var22 = k0Var;
        this.e.h(qVar, 1, -1, null, 0, null, p0Var.r, this.L, iOException, !k0Var22.a());
        return k0Var22;
    }

    @Override // j4.a0
    public final long i(long j10) {
        int i9;
        f();
        boolean[] zArr = (boolean[]) this.J.c;
        if (!this.K.e()) {
            j10 = 0;
        }
        this.P = false;
        this.S = j10;
        if (p()) {
            this.T = j10;
            return j10;
        }
        if (this.N != 7) {
            int length = this.E.length;
            while (i9 < length) {
                i9 = (this.E[i9].D(j10, false) || (!zArr[i9] && this.I)) ? i9 + 1 : 0;
            }
            return j10;
        }
        this.U = false;
        this.T = j10;
        this.W = false;
        com.google.android.exoplayer2.upstream.q0 q0Var = this.v;
        if (q0Var.d()) {
            for (a1 a1Var : this.E) {
                a1Var.i();
            }
            q0Var.b();
            return j10;
        }
        q0Var.c = null;
        for (a1 a1Var2 : this.E) {
            a1Var2.A(false);
        }
        return j10;
    }

    public final int j() {
        int i9 = 0;
        for (a1 a1Var : this.E) {
            i9 += a1Var.q + a1Var.p;
        }
        return i9;
    }

    @Override // j4.a0
    public final void k(long j10) {
        f();
        if (p()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.J.d;
        int length = this.E.length;
        for (int i9 = 0; i9 < length; i9++) {
            this.E[i9].h(j10, zArr[i9]);
        }
    }

    public final long l(boolean z10) {
        int i9;
        long j10 = Long.MIN_VALUE;
        while (i9 < this.E.length) {
            if (!z10) {
                com.google.firebase.messaging.t tVar = this.J;
                tVar.getClass();
                i9 = ((boolean[]) tVar.d)[i9] ? 0 : i9 + 1;
            }
            j10 = Math.max(j10, this.E[i9].n());
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final void m(com.google.android.exoplayer2.upstream.n0 n0Var, long j10, long j11) {
        m3.t tVar;
        p0 p0Var = (p0) n0Var;
        if (this.L == -9223372036854775807L && (tVar = this.K) != null) {
            boolean e10 = tVar.e();
            long l10 = l(true);
            long j12 = l10 == Long.MIN_VALUE ? 0L : l10 + 10000;
            this.L = j12;
            this.h.t(j12, e10, this.M);
        }
        Uri uri = p0Var.b.c;
        q qVar = new q();
        this.d.getClass();
        this.e.f(qVar, 1, -1, null, 0, null, p0Var.r, this.L);
        this.W = true;
        z zVar = this.C;
        zVar.getClass();
        zVar.c(this);
    }

    @Override // j4.d1
    public final boolean n(long j10) {
        if (this.W) {
            return false;
        }
        com.google.android.exoplayer2.upstream.q0 q0Var = this.v;
        if (q0Var.c() || this.U) {
            return false;
        }
        if (this.H && this.Q == 0) {
            return false;
        }
        boolean c10 = this.x.c();
        if (q0Var.d()) {
            return c10;
        }
        C();
        return true;
    }

    @Override // j4.a0
    public final long o() {
        if (!this.P) {
            return -9223372036854775807L;
        }
        if (!this.W && j() <= this.V) {
            return -9223372036854775807L;
        }
        this.P = false;
        return this.S;
    }

    public final boolean p() {
        return this.T != -9223372036854775807L;
    }

    @Override // j4.a0
    public final j1 q() {
        f();
        return (j1) this.J.b;
    }

    public final void r() {
        z3.c cVar;
        if (this.X || this.H || !this.G || this.K == null) {
            return;
        }
        for (a1 a1Var : this.E) {
            if (a1Var.t() == null) {
                return;
            }
        }
        this.x.b();
        int length = this.E.length;
        i1[] i1VarArr = new i1[length];
        boolean[] zArr = new boolean[length];
        for (int i9 = 0; i9 < length; i9++) {
            h3.t0 t10 = this.E[i9].t();
            t10.getClass();
            String str = t10.B;
            boolean h = d5.q.h(str);
            boolean z10 = h || d5.q.j(str);
            zArr[i9] = z10;
            this.I = z10 | this.I;
            d4.b bVar = this.D;
            if (bVar != null) {
                int i10 = bVar.a;
                if (h || this.F[i9].b) {
                    z3.c cVar2 = t10.s;
                    if (cVar2 == null) {
                        cVar = new z3.c(bVar);
                    } else {
                        long j10 = cVar2.b;
                        z3.b[] bVarArr = cVar2.a;
                        int i11 = d5.f0.a;
                        Object[] copyOf = Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        System.arraycopy(new z3.b[]{bVar}, 0, copyOf, bVarArr.length, 1);
                        cVar = new z3.c(j10, (z3.b[]) copyOf);
                    }
                    h3.s0 a2 = t10.a();
                    a2.i = cVar;
                    t10 = new h3.t0(a2);
                }
                if (h && t10.f == -1 && t10.h == -1 && i10 != -1) {
                    h3.s0 a3 = t10.a();
                    a3.f = i10;
                    t10 = new h3.t0(a3);
                }
            }
            int G = this.c.G(t10);
            h3.s0 a10 = t10.a();
            a10.J = G;
            i1VarArr[i9] = new i1(Integer.toString(i9), new h3.t0(a10));
        }
        this.J = new com.google.firebase.messaging.t(new j1(i1VarArr), zArr);
        this.H = true;
        z zVar = this.C;
        zVar.getClass();
        zVar.f(this);
    }

    public final void s(int i9) {
        f();
        com.google.firebase.messaging.t tVar = this.J;
        boolean[] zArr = (boolean[]) tVar.e;
        if (zArr[i9]) {
            return;
        }
        h3.t0 t0Var = ((j1) tVar.b).a(i9).d[0];
        this.e.b(d5.q.g(t0Var.B), t0Var, 0, null, this.S);
        zArr[i9] = true;
    }

    public final void t(int i9) {
        f();
        boolean[] zArr = (boolean[]) this.J.c;
        if (this.U && zArr[i9] && !this.E[i9].u(false)) {
            this.T = 0L;
            this.U = false;
            this.P = true;
            this.S = 0L;
            this.V = 0;
            for (a1 a1Var : this.E) {
                a1Var.A(false);
            }
            z zVar = this.C;
            zVar.getClass();
            zVar.c(this);
        }
    }

    @Override // j4.a0
    public final long u(long j10, j2 j2Var) {
        f();
        if (!this.K.e()) {
            return 0L;
        }
        m3.s h = this.K.h(j10);
        return j2Var.a(j10, h.a.a, h.b.a);
    }

    @Override // j4.d1
    public final long v() {
        long j10;
        boolean z10;
        f();
        if (this.W || this.Q == 0) {
            return Long.MIN_VALUE;
        }
        if (p()) {
            return this.T;
        }
        if (this.I) {
            int length = this.E.length;
            j10 = Long.MAX_VALUE;
            for (int i9 = 0; i9 < length; i9++) {
                com.google.firebase.messaging.t tVar = this.J;
                if (((boolean[]) tVar.c)[i9] && ((boolean[]) tVar.d)[i9]) {
                    a1 a1Var = this.E[i9];
                    synchronized (a1Var) {
                        z10 = a1Var.w;
                    }
                    if (!z10) {
                        j10 = Math.min(j10, this.E[i9].n());
                    }
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = l(false);
        }
        return j10 == Long.MIN_VALUE ? this.S : j10;
    }

    @Override // j4.a0
    public final void w(z zVar, long j10) {
        this.C = zVar;
        this.x.c();
        C();
    }

    @Override // j4.a0
    public final long x(b5.t[] tVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        b5.t tVar;
        f();
        com.google.firebase.messaging.t tVar2 = this.J;
        j1 j1Var = (j1) tVar2.b;
        boolean[] zArr3 = (boolean[]) tVar2.d;
        int i9 = this.Q;
        int i10 = 0;
        for (int i11 = 0; i11 < tVarArr.length; i11++) {
            b1 b1Var = b1VarArr[i11];
            if (b1Var != null && (tVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((q0) b1Var).a;
                d5.a.i(zArr3[i12]);
                this.Q--;
                zArr3[i12] = false;
                b1VarArr[i11] = null;
            }
        }
        boolean z10 = !this.O ? j10 == 0 : i9 != 0;
        for (int i13 = 0; i13 < tVarArr.length; i13++) {
            if (b1VarArr[i13] == null && (tVar = tVarArr[i13]) != null) {
                d5.a.i(tVar.length() == 1);
                d5.a.i(tVar.j(0) == 0);
                int b10 = j1Var.b(tVar.b());
                d5.a.i(!zArr3[b10]);
                this.Q++;
                zArr3[b10] = true;
                b1VarArr[i13] = new q0(this, b10);
                zArr2[i13] = true;
                if (!z10) {
                    a1 a1Var = this.E[b10];
                    z10 = (a1Var.D(j10, true) || a1Var.q() == 0) ? false : true;
                }
            }
        }
        if (this.Q == 0) {
            this.U = false;
            this.P = false;
            com.google.android.exoplayer2.upstream.q0 q0Var = this.v;
            if (q0Var.d()) {
                a1[] a1VarArr = this.E;
                int length = a1VarArr.length;
                while (i10 < length) {
                    a1VarArr[i10].i();
                    i10++;
                }
                q0Var.b();
            } else {
                for (a1 a1Var2 : this.E) {
                    a1Var2.A(false);
                }
            }
        } else if (z10) {
            j10 = i(j10);
            while (i10 < b1VarArr.length) {
                if (b1VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.O = true;
        return j10;
    }

    @Override // m3.m
    public final void y(m3.t tVar) {
        this.B.post(new j7(8, this, tVar));
    }

    @Override // j4.d1
    public final void z(long j10) {
    }
}
