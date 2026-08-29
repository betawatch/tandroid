package l4;

import ag.j2;
import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import j3.t1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import jh.w2;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r0 implements z, o3.m, com.google.android.exoplayer2.upstream.l0, com.google.android.exoplayer2.upstream.o0, a1 {
    public static final Map Y;
    public static final j3.t0 Z;
    public y C;
    public f4.b D;
    public boolean G;
    public boolean H;
    public boolean I;
    public com.google.firebase.messaging.s J;
    public o3.t K;
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
    public final n3.i c;
    public final f7.v d;
    public final g0 e;
    public final j2 f;
    public final u0 h;
    public final com.google.android.exoplayer2.upstream.r n;
    public final String r;
    public final long s;
    public final l3.g0 w;
    public final com.google.android.exoplayer2.upstream.q0 v = new com.google.android.exoplayer2.upstream.q0("ProgressiveMediaPeriod");
    public final f5.c x = new f5.c();
    public final n0 y = new n0(this, 0);
    public final n0 A = new n0(this, 1);
    public final Handler B = f5.d0.k(null);
    public q0[] F = new q0[0];
    public b1[] E = new b1[0];
    public long T = -9223372036854775807L;
    public long L = -9223372036854775807L;
    public int N = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        Y = DesugarCollections.unmodifiableMap(hashMap);
        j3.s0 s0Var = new j3.s0();
        s0Var.a = "icy";
        s0Var.o = "application/x-icy";
        Z = new j3.t0(s0Var);
    }

    public r0(Uri uri, com.google.android.exoplayer2.upstream.m mVar, l3.g0 g0Var, n3.i iVar, j2 j2Var, f7.v vVar, g0 g0Var2, u0 u0Var, com.google.android.exoplayer2.upstream.r rVar, String str, int i10) {
        this.a = uri;
        this.b = mVar;
        this.c = iVar;
        this.f = j2Var;
        this.d = vVar;
        this.e = g0Var2;
        this.h = u0Var;
        this.n = rVar;
        this.r = str;
        this.s = i10;
        this.w = g0Var;
    }

    @Override // l4.z
    public final long A(d5.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        d5.r rVar;
        d();
        com.google.firebase.messaging.s sVar = this.J;
        k1 k1Var = (k1) sVar.b;
        boolean[] zArr3 = (boolean[]) sVar.d;
        int i10 = this.Q;
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            c1 c1Var = c1VarArr[i12];
            if (c1Var != null && (rVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((p0) c1Var).a;
                f5.a.i(zArr3[i13]);
                this.Q--;
                zArr3[i13] = false;
                c1VarArr[i12] = null;
            }
        }
        boolean z10 = !this.O ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < rVarArr.length; i14++) {
            if (c1VarArr[i14] == null && (rVar = rVarArr[i14]) != null) {
                f5.a.i(rVar.length() == 1);
                f5.a.i(rVar.i(0) == 0);
                int b10 = k1Var.b(rVar.a());
                f5.a.i(!zArr3[b10]);
                this.Q++;
                zArr3[b10] = true;
                c1VarArr[i14] = new p0(this, b10);
                zArr2[i14] = true;
                if (!z10) {
                    b1 b1Var = this.E[b10];
                    z10 = (b1Var.D(j10, true) || b1Var.q() == 0) ? false : true;
                }
            }
        }
        if (this.Q == 0) {
            this.U = false;
            this.P = false;
            com.google.android.exoplayer2.upstream.q0 q0Var = this.v;
            if (q0Var.d()) {
                b1[] b1VarArr = this.E;
                int length = b1VarArr.length;
                while (i11 < length) {
                    b1VarArr[i11].i();
                    i11++;
                }
                q0Var.b();
            } else {
                for (b1 b1Var2 : this.E) {
                    b1Var2.A(false);
                }
            }
        } else if (z10) {
            j10 = p(j10);
            while (i11 < c1VarArr.length) {
                if (c1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.O = true;
        return j10;
    }

    @Override // o3.m
    public final void D1(o3.t tVar) {
        this.B.post(new w2(22, this, tVar));
    }

    @Override // l4.z
    public final long E() {
        if (!this.P) {
            return -9223372036854775807L;
        }
        if (!this.W && e() <= this.V) {
            return -9223372036854775807L;
        }
        this.P = false;
        return this.S;
    }

    @Override // l4.z
    public final k1 J() {
        d();
        return (k1) this.J.b;
    }

    @Override // l4.e1
    public final long L() {
        long j10;
        boolean z10;
        d();
        if (this.W || this.Q == 0) {
            return Long.MIN_VALUE;
        }
        if (k()) {
            return this.T;
        }
        if (this.I) {
            int length = this.E.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                com.google.firebase.messaging.s sVar = this.J;
                if (((boolean[]) sVar.c)[i10] && ((boolean[]) sVar.d)[i10]) {
                    b1 b1Var = this.E[i10];
                    synchronized (b1Var) {
                        z10 = b1Var.w;
                    }
                    if (!z10) {
                        j10 = Math.min(j10, this.E[i10].n());
                    }
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = i(false);
        }
        return j10 == Long.MIN_VALUE ? this.S : j10;
    }

    @Override // o3.m
    public final o3.w Z1(int i10, int i11) {
        return u(new q0(i10, false));
    }

    @Override // l4.a1
    public final void a() {
        this.B.post(this.y);
    }

    @Override // l4.e1
    public final boolean b() {
        boolean z10;
        if (!this.v.d()) {
            return false;
        }
        f5.c cVar = this.x;
        synchronized (cVar) {
            z10 = cVar.a;
        }
        return z10;
    }

    @Override // com.google.android.exoplayer2.upstream.o0
    public final void c() {
        for (b1 b1Var : this.E) {
            b1Var.A(true);
            n3.e eVar = b1Var.h;
            if (eVar != null) {
                eVar.p(b1Var.e);
                b1Var.h = null;
                b1Var.g = null;
            }
        }
        l3.g0 g0Var = this.w;
        o3.k kVar = (o3.k) g0Var.c;
        if (kVar != null) {
            kVar.release();
            g0Var.c = null;
        }
        g0Var.d = null;
    }

    public final void d() {
        f5.a.i(this.H);
        this.J.getClass();
        this.K.getClass();
    }

    public final int e() {
        int i10 = 0;
        for (b1 b1Var : this.E) {
            i10 += b1Var.q + b1Var.p;
        }
        return i10;
    }

    @Override // o3.m
    public final void e1() {
        this.G = true;
        this.B.post(this.y);
    }

    @Override // l4.z
    public final long f(long j10, j3.j2 j2Var) {
        d();
        if (!this.K.c()) {
            return 0L;
        }
        o3.s g10 = this.K.g(j10);
        return j2Var.a(j10, g10.a.a, g10.b.a);
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final void g(com.google.android.exoplayer2.upstream.n0 n0Var, long j10, long j11, boolean z10) {
        o0 o0Var = (o0) n0Var;
        Uri uri = o0Var.b.c;
        p pVar = new p();
        this.d.getClass();
        this.e.d(pVar, 1, -1, null, 0, null, o0Var.r, this.L);
        if (z10) {
            return;
        }
        for (b1 b1Var : this.E) {
            b1Var.A(false);
        }
        if (this.Q > 0) {
            y yVar = this.C;
            yVar.getClass();
            yVar.a(this);
        }
    }

    @Override // l4.e1
    public final long h() {
        return L();
    }

    public final long i(boolean z10) {
        int i10;
        long j10 = Long.MIN_VALUE;
        while (i10 < this.E.length) {
            if (!z10) {
                com.google.firebase.messaging.s sVar = this.J;
                sVar.getClass();
                i10 = ((boolean[]) sVar.d)[i10] ? 0 : i10 + 1;
            }
            j10 = Math.max(j10, this.E[i10].n());
        }
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    @Override // com.google.android.exoplayer2.upstream.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.exoplayer2.upstream.k0 j(com.google.android.exoplayer2.upstream.n0 n0Var, IOException iOException, int i10) {
        long j10;
        com.google.android.exoplayer2.upstream.k0 k0Var;
        o3.t tVar;
        o0 o0Var = (o0) n0Var;
        Uri uri = o0Var.b.c;
        p pVar = new p();
        int i11 = f5.d0.a;
        this.d.getClass();
        if (!(iOException instanceof t1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof com.google.android.exoplayer2.upstream.e0) && !(iOException instanceof com.google.android.exoplayer2.upstream.p0)) {
            int i12 = com.google.android.exoplayer2.upstream.n.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof com.google.android.exoplayer2.upstream.n) || ((com.google.android.exoplayer2.upstream.n) th2).a != 2008) {
                }
            }
            j10 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            if (j10 != -9223372036854775807L) {
                k0Var = com.google.android.exoplayer2.upstream.q0.f;
            } else {
                int e10 = e();
                int i13 = e10 > this.V ? 1 : 0;
                if (this.R || !((tVar = this.K) == null || tVar.h() == -9223372036854775807L)) {
                    this.V = e10;
                } else if (!this.H || w()) {
                    this.P = this.H;
                    this.S = 0L;
                    this.V = 0;
                    for (b1 b1Var : this.E) {
                        b1Var.A(false);
                    }
                    o0Var.f.a = 0L;
                    o0Var.r = 0L;
                    o0Var.n = true;
                    o0Var.w = false;
                } else {
                    this.U = true;
                    k0Var = com.google.android.exoplayer2.upstream.q0.e;
                }
                k0Var = new com.google.android.exoplayer2.upstream.k0(i13, j10, false);
            }
            com.google.android.exoplayer2.upstream.k0 k0Var2 = k0Var;
            this.e.h(pVar, 1, -1, null, 0, null, o0Var.r, this.L, iOException, !k0Var2.a());
            return k0Var2;
        }
        j10 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
        }
        com.google.android.exoplayer2.upstream.k0 k0Var22 = k0Var;
        this.e.h(pVar, 1, -1, null, 0, null, o0Var.r, this.L, iOException, !k0Var22.a());
        return k0Var22;
    }

    public final boolean k() {
        return this.T != -9223372036854775807L;
    }

    public final void l() {
        b4.c cVar;
        if (this.X || this.H || !this.G || this.K == null) {
            return;
        }
        for (b1 b1Var : this.E) {
            if (b1Var.t() == null) {
                return;
            }
        }
        this.x.b();
        int length = this.E.length;
        j1[] j1VarArr = new j1[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            j3.t0 t10 = this.E[i10].t();
            t10.getClass();
            String str = t10.B;
            boolean h = f5.o.h(str);
            boolean z10 = h || f5.o.j(str);
            zArr[i10] = z10;
            this.I = z10 | this.I;
            f4.b bVar = this.D;
            if (bVar != null) {
                int i11 = bVar.a;
                if (h || this.F[i10].b) {
                    b4.c cVar2 = t10.s;
                    if (cVar2 == null) {
                        cVar = new b4.c(bVar);
                    } else {
                        long j10 = cVar2.b;
                        b4.b[] bVarArr = cVar2.a;
                        int i12 = f5.d0.a;
                        Object[] copyOf = Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        System.arraycopy(new b4.b[]{bVar}, 0, copyOf, bVarArr.length, 1);
                        cVar = new b4.c(j10, (b4.b[]) copyOf);
                    }
                    j3.s0 a2 = t10.a();
                    a2.i = cVar;
                    t10 = new j3.t0(a2);
                }
                if (h && t10.f == -1 && t10.h == -1 && i11 != -1) {
                    j3.s0 a10 = t10.a();
                    a10.f = i11;
                    t10 = new j3.t0(a10);
                }
            }
            int b10 = this.c.b(t10);
            j3.s0 a11 = t10.a();
            a11.J = b10;
            j1VarArr[i10] = new j1(Integer.toString(i10), new j3.t0(a11));
        }
        this.J = new com.google.firebase.messaging.s(new k1(j1VarArr), zArr);
        this.H = true;
        y yVar = this.C;
        yVar.getClass();
        yVar.c(this);
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final void m(com.google.android.exoplayer2.upstream.n0 n0Var, long j10, long j11) {
        o3.t tVar;
        o0 o0Var = (o0) n0Var;
        if (this.L == -9223372036854775807L && (tVar = this.K) != null) {
            boolean c3 = tVar.c();
            long i10 = i(true);
            long j12 = i10 == Long.MIN_VALUE ? 0L : i10 + 10000;
            this.L = j12;
            this.h.t(j12, c3, this.M);
        }
        Uri uri = o0Var.b.c;
        p pVar = new p();
        this.d.getClass();
        this.e.f(pVar, 1, -1, null, 0, null, o0Var.r, this.L);
        this.W = true;
        y yVar = this.C;
        yVar.getClass();
        yVar.a(this);
    }

    @Override // l4.z
    public final void n(y yVar, long j10) {
        this.C = yVar;
        this.x.c();
        v();
    }

    @Override // l4.z
    public final void o() {
        int B = this.d.B(this.N);
        com.google.android.exoplayer2.upstream.q0 q0Var = this.v;
        IOException iOException = q0Var.c;
        if (iOException != null) {
            throw iOException;
        }
        com.google.android.exoplayer2.upstream.m0 m0Var = q0Var.b;
        if (m0Var != null) {
            if (B == Integer.MIN_VALUE) {
                B = m0Var.a;
            }
            IOException iOException2 = m0Var.e;
            if (iOException2 != null && m0Var.f > B) {
                throw iOException2;
            }
        }
        if (this.W && !this.H) {
            throw t1.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // l4.z
    public final long p(long j10) {
        int i10;
        d();
        boolean[] zArr = (boolean[]) this.J.c;
        if (!this.K.c()) {
            j10 = 0;
        }
        this.P = false;
        this.S = j10;
        if (k()) {
            this.T = j10;
            return j10;
        }
        if (this.N != 7) {
            int length = this.E.length;
            while (i10 < length) {
                i10 = (this.E[i10].D(j10, false) || (!zArr[i10] && this.I)) ? i10 + 1 : 0;
            }
            return j10;
        }
        this.U = false;
        this.T = j10;
        this.W = false;
        com.google.android.exoplayer2.upstream.q0 q0Var = this.v;
        if (q0Var.d()) {
            for (b1 b1Var : this.E) {
                b1Var.i();
            }
            q0Var.b();
            return j10;
        }
        q0Var.c = null;
        for (b1 b1Var2 : this.E) {
            b1Var2.A(false);
        }
        return j10;
    }

    public final void q(int i10) {
        d();
        com.google.firebase.messaging.s sVar = this.J;
        boolean[] zArr = (boolean[]) sVar.e;
        if (zArr[i10]) {
            return;
        }
        j3.t0 t0Var = ((k1) sVar.b).a(i10).d[0];
        this.e.b(f5.o.g(t0Var.B), t0Var, 0, null, this.S);
        zArr[i10] = true;
    }

    @Override // l4.z
    public final void r(long j10) {
        d();
        if (k()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.J.d;
        int length = this.E.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.E[i10].h(j10, zArr[i10]);
        }
    }

    @Override // l4.e1
    public final boolean s(long j10) {
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
        boolean c3 = this.x.c();
        if (q0Var.d()) {
            return c3;
        }
        v();
        return true;
    }

    public final void t(int i10) {
        d();
        boolean[] zArr = (boolean[]) this.J.c;
        if (this.U && zArr[i10] && !this.E[i10].u(false)) {
            this.T = 0L;
            this.U = false;
            this.P = true;
            this.S = 0L;
            this.V = 0;
            for (b1 b1Var : this.E) {
                b1Var.A(false);
            }
            y yVar = this.C;
            yVar.getClass();
            yVar.a(this);
        }
    }

    public final b1 u(q0 q0Var) {
        int length = this.E.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (q0Var.equals(this.F[i10])) {
                return this.E[i10];
            }
        }
        n3.i iVar = this.c;
        iVar.getClass();
        b1 b1Var = new b1(this.n, iVar, this.f);
        b1Var.f = this;
        int i11 = length + 1;
        q0[] q0VarArr = (q0[]) Arrays.copyOf(this.F, i11);
        q0VarArr[length] = q0Var;
        this.F = q0VarArr;
        b1[] b1VarArr = (b1[]) Arrays.copyOf(this.E, i11);
        b1VarArr[length] = b1Var;
        this.E = b1VarArr;
        return b1Var;
    }

    public final void v() {
        o0 o0Var = new o0(this, this.a, this.b, this.w, this, this.x);
        if (this.H) {
            f5.a.i(k());
            long j10 = this.L;
            if (j10 != -9223372036854775807L && this.T > j10) {
                this.W = true;
                this.T = -9223372036854775807L;
                return;
            }
            o3.t tVar = this.K;
            tVar.getClass();
            long j11 = tVar.g(this.T).a.b;
            long j12 = this.T;
            o0Var.f.a = j11;
            o0Var.r = j12;
            o0Var.n = true;
            o0Var.w = false;
            for (b1 b1Var : this.E) {
                b1Var.t = this.T;
            }
            this.T = -9223372036854775807L;
        }
        this.V = e();
        this.v.f(o0Var, this, this.d.B(this.N));
        this.e.k(new p(o0Var.s), 1, -1, null, 0, null, o0Var.r, this.L);
    }

    public final boolean w() {
        return this.P || k();
    }

    @Override // l4.e1
    public final void U(long j10) {
    }
}
