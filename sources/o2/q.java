package o2;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import b2.p1;
import b2.u0;
import b2.v0;
import b2.w;
import b2.x;
import c3.b0;
import c3.k0;
import e2.l0;
import e9.n0;
import e9.x1;
import g2.c0;
import g2.y;
import i2.w0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import k2.m0;
import u2.b1;
import u2.f1;
import u2.r1;
import u2.u;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q implements y2.g, y2.j, f1, c3.q, b1 {
    public static final Set p0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ArrayList D;
    public final List E;
    public final n F;
    public final n G;
    public final Handler H;
    public final ArrayList I;
    public final Map J;
    public v2.f K;
    public p[] L;
    public int[] M;
    public final HashSet N;
    public final SparseIntArray O;
    public o P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public int U;
    public x V;
    public x W;
    public boolean X;
    public r1 Y;
    public Set Z;
    public final String a;
    public int[] a0;
    public final int b;
    public int b0;
    public final m0 c;
    public boolean c0;
    public final i d;
    public boolean[] d0;
    public final a0 e;
    public boolean[] e0;
    public final x f;
    public long f0;
    public long g0;
    public final n2.m h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public long k0;
    public boolean l0;
    public long m0;
    public final n2.j n;
    public b2.t n0;
    public j o0;
    public final hb.a r;
    public final y2.l s;
    public final a5.a w;
    public final int x;
    public final androidx.activity.o y;

    /* JADX WARN: Type inference failed for: r2v13, types: [o2.n] */
    /* JADX WARN: Type inference failed for: r2v14, types: [o2.n] */
    public q(String str, int i10, m0 m0Var, i iVar, Map map, a0 a0Var, long j10, x xVar, n2.m mVar, n2.j jVar, hb.a aVar, a5.a aVar2, int i11, z2.a aVar3) {
        this.a = str;
        this.b = i10;
        this.c = m0Var;
        this.d = iVar;
        this.J = map;
        this.e = a0Var;
        this.f = xVar;
        this.h = mVar;
        this.n = jVar;
        this.r = aVar;
        this.w = aVar2;
        this.x = i11;
        this.s = aVar3 != null ? new y2.l(aVar3) : new y2.l("Loader:HlsSampleStreamWrapper");
        androidx.activity.o oVar = new androidx.activity.o(6);
        oVar.c = null;
        final int i12 = 0;
        oVar.b = false;
        oVar.d = null;
        this.y = oVar;
        this.M = new int[0];
        Set set = p0;
        this.N = new HashSet(set.size());
        this.O = new SparseIntArray(set.size());
        this.L = new p[0];
        this.e0 = new boolean[0];
        this.d0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.D = arrayList;
        this.E = DesugarCollections.unmodifiableList(arrayList);
        this.I = new ArrayList();
        this.F = new Runnable(this) { // from class: o2.n
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.B();
                        break;
                    default:
                        q qVar = this.b;
                        for (p pVar : qVar.L) {
                            pVar.K(qVar.k0);
                        }
                        qVar.S = true;
                        qVar.B();
                        break;
                }
            }
        };
        final int i13 = 1;
        this.G = new Runnable(this) { // from class: o2.n
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.B();
                        break;
                    default:
                        q qVar = this.b;
                        for (p pVar : qVar.L) {
                            pVar.K(qVar.k0);
                        }
                        qVar.S = true;
                        qVar.B();
                        break;
                }
            }
        };
        this.H = l0.q(null);
        this.f0 = j10;
        this.g0 = j10;
        this.k0 = Long.MIN_VALUE;
    }

    public static c3.n r(int i10, int i11) {
        e2.a.l("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new c3.n();
    }

    public static x w(x xVar, x xVar2, boolean z10) {
        String b10;
        if (xVar == null) {
            return xVar2;
        }
        String str = xVar.k;
        String str2 = xVar2.s;
        int h = v0.h(str2);
        if (l0.v(h, str) == 1) {
            b10 = l0.w(h, str);
            str2 = v0.d(b10);
        } else {
            b10 = v0.b(str, str2);
        }
        xVar2.n = xVar.n;
        xVar2.o = xVar.o;
        xVar2.p = xVar.p;
        xVar2.q = xVar.q;
        w a2 = xVar2.a();
        a2.a = xVar.a;
        a2.b = xVar.b;
        a2.c = n0.u(xVar.c);
        a2.d = xVar.d;
        a2.e = xVar.e;
        a2.f = xVar.f;
        a2.h = z10 ? xVar.h : -1;
        a2.i = z10 ? xVar.i : -1;
        a2.j = b10;
        a2.p = xVar.p;
        a2.n = xVar.o;
        a2.m = xVar.n;
        a2.o = xVar.q;
        if (h == 2) {
            a2.y = xVar.z;
            a2.z = xVar.A;
            a2.C = xVar.D;
        }
        if (str2 != null) {
            a2.r = v0.n(str2);
        }
        int i10 = xVar.K;
        if (i10 != -1 && h == 1) {
            a2.J = i10;
        }
        u0 u0Var = xVar.l;
        if (u0Var != null) {
            u0 u0Var2 = xVar2.l;
            if (u0Var2 != null) {
                u0Var = u0Var2.b(u0Var);
            }
            a2.k = u0Var;
        }
        return new x(a2);
    }

    public static int z(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    public final boolean A() {
        return this.g0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B() {
        int i10;
        if (!this.X && this.a0 == null && this.S) {
            int i11 = 0;
            for (p pVar : this.L) {
                if (pVar.y() == null) {
                    return;
                }
            }
            r1 r1Var = this.Y;
            if (r1Var != null) {
                int i12 = r1Var.a;
                int[] iArr = new int[i12];
                this.a0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = 0;
                    while (true) {
                        p[] pVarArr = this.L;
                        if (i14 < pVarArr.length) {
                            x y3 = pVarArr[i14].y();
                            y3.getClass();
                            x xVar = this.Y.a(i13).d[0];
                            String str = y3.s;
                            String str2 = xVar.s;
                            int h = v0.h(str);
                            if (h == 3) {
                                if (Objects.equals(str, str2)) {
                                    if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || y3.P == xVar.P) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i14++;
                            } else if (h == v0.h(str2)) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                    }
                    this.a0[i13] = i14;
                }
                ArrayList arrayList = this.I;
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((m) obj).b();
                }
                return;
            }
            int length = this.L.length;
            int i15 = 0;
            int i16 = -1;
            int i17 = -2;
            while (true) {
                int i18 = 1;
                if (i15 >= length) {
                    break;
                }
                x y10 = this.L[i15].y();
                y10.getClass();
                String str3 = y10.s;
                if (v0.m(str3)) {
                    i18 = 2;
                } else if (!v0.i(str3)) {
                    i18 = v0.l(str3) ? 3 : -2;
                }
                if (z(i18) > z(i17)) {
                    i16 = i15;
                    i17 = i18;
                } else if (i18 == i17 && i16 != -1) {
                    i16 = -1;
                }
                i15++;
            }
            p1 p1Var = this.d.h;
            int i19 = p1Var.a;
            this.b0 = -1;
            this.a0 = new int[length];
            for (int i20 = 0; i20 < length; i20++) {
                this.a0[i20] = i20;
            }
            p1[] p1VarArr = new p1[length];
            int i21 = 0;
            while (i21 < length) {
                x y11 = this.L[i21].y();
                y11.getClass();
                x xVar2 = this.f;
                String str4 = this.a;
                if (i21 == i16) {
                    x[] xVarArr = new x[i19];
                    for (int i22 = i11; i22 < i19; i22++) {
                        x xVar3 = p1Var.d[i22];
                        if (i17 == 1 && xVar2 != null) {
                            xVar3 = xVar3.d(xVar2);
                        }
                        xVarArr[i22] = i19 == 1 ? y11.d(xVar3) : w(xVar3, y11, true);
                    }
                    p1VarArr[i21] = new p1(str4, xVarArr);
                    this.b0 = i21;
                    i10 = 0;
                } else {
                    if (i17 != 2 || !v0.i(y11.s)) {
                        xVar2 = null;
                    }
                    StringBuilder i23 = sc.e.i(str4, ":muxed:");
                    i23.append(i21 < i16 ? i21 : i21 - 1);
                    String sb2 = i23.toString();
                    i10 = 0;
                    w a2 = w(xVar2, y11, false).a();
                    a2.l = str4;
                    p1VarArr[i21] = new p1(sb2, new x(a2));
                }
                i21++;
                i11 = i10;
            }
            int i24 = i11;
            this.Y = v(p1VarArr);
            t6.p(this.Z == null ? 1 : i24);
            this.Z = Collections.EMPTY_SET;
            this.T = true;
            this.c.n0();
        }
    }

    public final void C() {
        this.s.a();
        i iVar = this.d;
        u2.b bVar = iVar.n;
        if (bVar != null) {
            throw bVar;
        }
        Uri uri = iVar.o;
        if (uri == null || !uri.equals(iVar.p)) {
            return;
        }
        iVar.g.h(iVar.o);
    }

    public final void D(p1[] p1VarArr, int... iArr) {
        this.Y = v(p1VarArr);
        this.Z = new HashSet();
        for (int i10 : iArr) {
            this.Z.add(this.Y.a(i10));
        }
        this.b0 = 0;
        this.H.post(new lg.s(this.c, 12));
        this.T = true;
    }

    public final void E() {
        for (p pVar : this.L) {
            pVar.G(this.h0);
        }
        this.h0 = false;
    }

    public final boolean F(long j10, boolean z10) {
        j jVar;
        boolean z11;
        boolean J;
        this.f0 = j10;
        if (A()) {
            this.g0 = j10;
            return true;
        }
        boolean z12 = this.d.q;
        ArrayList arrayList = this.D;
        if (z12) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                jVar = (j) arrayList.get(i10);
                if (jVar.h == j10) {
                    break;
                }
            }
        }
        jVar = null;
        if (this.S && !z10 && !arrayList.isEmpty()) {
            int length = this.L.length;
            for (int i11 = 0; i11 < length; i11++) {
                p pVar = this.L[i11];
                if (jVar != null) {
                    J = pVar.I(jVar.f(i11));
                } else {
                    long c10 = c();
                    J = pVar.J(j10, c10 == Long.MIN_VALUE || j10 < c10);
                }
                if (!J && (this.e0[i11] || !this.c0)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.g0 = j10;
        this.j0 = false;
        arrayList.clear();
        y2.l lVar = this.s;
        if (!lVar.d()) {
            lVar.c = null;
            E();
            return true;
        }
        if (this.S) {
            for (p pVar2 : this.L) {
                pVar2.l();
            }
        }
        lVar.b();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [o2.p[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o2.p[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [c3.k0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [o2.p, u2.c1] */
    /* JADX WARN: Type inference failed for: r5v6, types: [c3.n] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // c3.q
    public final k0 I1(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i11);
        Set set = p0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.N;
        SparseIntArray sparseIntArray = this.O;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            t6.f(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.M[i12] = i10;
                }
                r52 = this.M[i12] == i10 ? this.L[i12] : r(i10, i11);
            }
        } else {
            int i13 = 0;
            while (true) {
                ?? r12 = this.L;
                if (i13 >= r12.length) {
                    break;
                }
                if (this.M[i13] == i10) {
                    r52 = r12[i13];
                    break;
                }
                i13++;
            }
        }
        if (r52 == 0) {
            if (this.l0) {
                return r(i10, i11);
            }
            int length = this.L.length;
            boolean z10 = i11 == 1 || i11 == 2;
            r52 = new p(this.e, this.h, this.n, this.J);
            r52.t = this.f0;
            if (z10) {
                r52.K = this.n0;
                r52.B = true;
            }
            long j10 = this.m0;
            if (r52.H != j10) {
                r52.H = j10;
                r52.B = true;
            }
            if (this.o0 != null) {
                r52.E = r6.w;
            }
            r52.f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.M, i14);
            this.M = copyOf;
            copyOf[length] = i10;
            p[] pVarArr = this.L;
            String str = l0.a;
            ?? copyOf2 = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            copyOf2[pVarArr.length] = r52;
            this.L = (p[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.e0, i14);
            this.e0 = copyOf3;
            copyOf3[length] = z10;
            this.c0 |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (z(i11) > z(this.Q)) {
                this.R = length;
                this.Q = i11;
            }
            this.d0 = Arrays.copyOf(this.d0, i14);
        }
        if (i11 != 5) {
            return r52;
        }
        if (this.P == null) {
            this.P = new o(r52, this.x);
        }
        return this.P;
    }

    @Override // y2.g
    public final void M(y2.i iVar, long j10, long j11, boolean z10) {
        v2.f fVar = (v2.f) iVar;
        this.K = null;
        long j12 = fVar.a;
        g2.n nVar = fVar.b;
        c0 c0Var = fVar.r;
        u uVar = new u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        this.r.getClass();
        this.w.p(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (z10) {
            return;
        }
        if (A() || this.U == 0) {
            E();
        }
        if (this.U > 0) {
            this.c.r(this);
        }
    }

    @Override // c3.q
    public final void Q0() {
        this.l0 = true;
        this.H.post(this.G);
    }

    @Override // u2.b1
    public final void a() {
        this.H.post(this.F);
    }

    @Override // y2.j
    public final void b() {
        for (p pVar : this.L) {
            pVar.G(true);
            n2.g gVar = pVar.h;
            if (gVar != null) {
                gVar.a(pVar.e);
                pVar.h = null;
                pVar.g = null;
            }
        }
    }

    @Override // u2.f1
    public final long c() {
        if (A()) {
            return this.g0;
        }
        if (this.j0) {
            return Long.MIN_VALUE;
        }
        return y().n;
    }

    @Override // u2.f1
    public final boolean d() {
        return this.s.d();
    }

    public final void e() {
        t6.p(this.T);
        this.Y.getClass();
        this.Z.getClass();
    }

    public final boolean i(int i10) {
        int i11 = i10;
        while (true) {
            ArrayList arrayList = this.D;
            if (i11 >= arrayList.size()) {
                j jVar = (j) arrayList.get(i10);
                for (int i12 = 0; i12 < this.L.length; i12++) {
                    if (this.L[i12].v() > jVar.f(i12)) {
                        return false;
                    }
                }
                return true;
            }
            if (((j) arrayList.get(i11)).b0) {
                return false;
            }
            i11++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    @Override // y2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k4.d l(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        boolean c10;
        boolean z10;
        int u10;
        k4.d dVar;
        boolean a2;
        int i11;
        v2.f fVar = (v2.f) iVar;
        boolean z11 = fVar instanceof j;
        if (z11 && !((j) fVar).g() && (iOException instanceof y) && ((i11 = ((y) iOException).c) == 410 || i11 == 404)) {
            return y2.l.d;
        }
        long j12 = fVar.r.b;
        g2.n nVar = fVar.b;
        c0 c0Var = fVar.r;
        u uVar = new u(nVar, c0Var.c, c0Var.d, j10, j11, j12);
        l0.h0(fVar.h);
        l0.h0(fVar.n);
        c5.x xVar = new c5.x(iOException, i10, 20);
        boolean z12 = fVar instanceof j;
        i iVar2 = this.d;
        li.c0 a10 = z12 ? iVar2.a(((j) fVar).y) : new li.c0(1, 0, iVar2.r.length(), iVar2.d(SystemClock.elapsedRealtime()));
        this.r.getClass();
        k4.d p02 = hb.a.p0(a10, xVar);
        if (p02 != null) {
            int i12 = p02.a;
            long j13 = p02.b;
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException(i0.a.i(i12, "Invalid fallback selection type: "));
                }
                int a11 = iVar2.h.a(fVar.d);
                if (a11 != -1 && (u10 = iVar2.r.u(a11)) != -1) {
                    c10 = iVar2.r.o(u10, j13);
                    z10 = c10;
                }
            } else if (z12) {
                p2.d dVar2 = iVar2.g;
                Uri uri = ((j) fVar).y;
                p2.c cVar = (p2.c) dVar2.d.get(uri);
                c10 = cVar != null ? p2.c.c(cVar, uri, j13) : false;
                z10 = c10;
            }
            if (z10) {
                long t02 = hb.a.t0(xVar);
                dVar = t02 != -9223372036854775807L ? new k4.d(0, t02, false) : y2.l.f;
            } else {
                if (z11 && j12 == 0) {
                    ArrayList arrayList = this.D;
                    t6.p(((j) i0.a.v(1, arrayList)) == fVar);
                    if (arrayList.isEmpty()) {
                        this.g0 = this.f0;
                    } else {
                        ((j) e9.s.m(arrayList)).Z = true;
                    }
                }
                dVar = y2.l.e;
            }
            k4.d dVar3 = dVar;
            a2 = dVar3.a();
            this.w.r(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
            if (!a2) {
                this.K = null;
            }
            if (z10) {
                if (!this.T) {
                    i2.v0 v0Var = new i2.v0();
                    v0Var.a = this.f0;
                    m(new w0(v0Var));
                    return dVar3;
                }
                this.c.r(this);
            }
            return dVar3;
        }
        z10 = false;
        if (z10) {
        }
        k4.d dVar32 = dVar;
        a2 = dVar32.a();
        this.w.r(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
        if (!a2) {
        }
        if (z10) {
        }
        return dVar32;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04a2  */
    @Override // u2.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(w0 w0Var) {
        long max;
        long j10;
        List list;
        long j11;
        int a2;
        w0 w0Var2;
        n2.u uVar;
        long j12;
        i iVar;
        boolean z10;
        Uri c10;
        long j13;
        long j14;
        long j15;
        j jVar;
        i iVar2;
        h f7;
        long j16;
        boolean z11;
        androidx.activity.o oVar;
        boolean z12;
        c cVar;
        boolean z13;
        n2.u uVar2;
        byte[] bArr;
        y2.l lVar;
        boolean z14;
        byte[] bArr2;
        g2.h hVar;
        p2.j jVar2;
        j2.l lVar2;
        g2.n nVar;
        g2.h hVar2;
        boolean z15;
        q3.i iVar3;
        e2.x xVar;
        b bVar;
        e2.k0 k0Var;
        byte[] bArr3;
        g2.h hVar3;
        String str;
        boolean z16;
        p2.c cVar2;
        if (!this.j0) {
            y2.l lVar3 = this.s;
            if (!lVar3.d() && !lVar3.c()) {
                if (A()) {
                    List list2 = Collections.EMPTY_LIST;
                    max = this.g0;
                    for (p pVar : this.L) {
                        pVar.t = this.g0;
                    }
                    list = list2;
                    j10 = max;
                } else {
                    j y3 = y();
                    boolean z17 = y3.X;
                    long j17 = y3.h;
                    if (z17 && y3.g()) {
                        long j18 = y3.a0;
                        max = j18 != -9223372036854775807L ? j17 + j18 : -9223372036854775807L;
                    } else {
                        max = Math.max(this.f0, j17);
                    }
                    long j19 = this.f0;
                    boolean z18 = this.S;
                    List list3 = this.E;
                    if (z18) {
                        for (p pVar2 : this.L) {
                            j19 = Math.max(j19, pVar2.t());
                        }
                    }
                    j10 = j19;
                    list = list3;
                }
                androidx.activity.o oVar2 = this.y;
                oVar2.c = null;
                oVar2.b = false;
                oVar2.d = null;
                boolean z19 = this.T || !list.isEmpty();
                i iVar4 = this.d;
                n2.u uVar3 = iVar4.j;
                p2.w[] wVarArr = iVar4.e;
                p2.d dVar = iVar4.g;
                j jVar3 = list.isEmpty() ? null : (j) e9.s.m(list);
                if (jVar3 == null) {
                    j11 = -9223372036854775807L;
                    a2 = -1;
                    uVar = uVar3;
                    w0Var2 = w0Var;
                } else {
                    j11 = -9223372036854775807L;
                    a2 = iVar4.h.a(jVar3.d);
                    w0Var2 = w0Var;
                    uVar = uVar3;
                }
                long j20 = w0Var2.a;
                long j21 = max - j20;
                long j22 = iVar4.s;
                long j23 = j22 != j11 ? j22 - j20 : j11;
                if (jVar3 == null || iVar4.q) {
                    j12 = j23;
                    iVar = iVar4;
                } else {
                    iVar = iVar4;
                    j12 = j23;
                    long j24 = jVar3.n - jVar3.h;
                    j21 = Math.max(0L, j21 - j24);
                    if (j12 != j11) {
                        j12 = Math.max(0L, j12 - j24);
                    }
                }
                v2.m[] b10 = iVar.b(jVar3, max);
                if (a2 != -1) {
                    x2.q qVar = iVar.r;
                    if (qVar.a(qVar.u(a2), SystemClock.elapsedRealtime())) {
                        z10 = true;
                        long j25 = max;
                        j jVar4 = jVar3;
                        iVar.r.k(j20, j21, j12, list, b10);
                        int l4 = iVar.r.l();
                        boolean z20 = a2 == l4;
                        c10 = wVarArr[l4].c();
                        if (dVar.f(c10)) {
                            oVar2.d = c10;
                            iVar.p = c10;
                            lVar = lVar3;
                            oVar = oVar2;
                        } else {
                            p2.m b11 = dVar.b(c10, true);
                            b11.getClass();
                            long j26 = b11.h;
                            iVar.q = b11.c;
                            if (b11.o) {
                                j13 = j26;
                                j14 = j11;
                            } else {
                                j13 = j26;
                                j14 = (j13 + b11.u) - dVar.I;
                            }
                            iVar.s = j14;
                            long j27 = j13 - dVar.I;
                            i iVar5 = iVar;
                            Pair e = iVar5.e(jVar4, z20, b11, j27, j25);
                            boolean z21 = z10;
                            long longValue = ((Long) e.first).longValue();
                            int intValue = ((Integer) e.second).intValue();
                            if (!z20 || z21 || jVar4 == null) {
                                j15 = j27;
                            } else {
                                j15 = j27;
                                if (longValue < b11.k || ((f7 = i.f(b11, longValue, intValue)) != null && j15 + f7.a.e < j10)) {
                                    c10 = wVarArr[a2].c();
                                    b11 = dVar.b(c10, true);
                                    b11.getClass();
                                    long j28 = b11.h - dVar.I;
                                    Pair e7 = iVar5.e(jVar4, false, b11, j28, j25);
                                    jVar = jVar4;
                                    long longValue2 = ((Long) e7.first).longValue();
                                    intValue = ((Integer) e7.second).intValue();
                                    l4 = a2;
                                    j15 = j28;
                                    iVar2 = iVar5;
                                    longValue = longValue2;
                                    String str2 = b11.a;
                                    boolean z22 = b11.c;
                                    j16 = b11.k;
                                    n0 n0Var = b11.r;
                                    if (l4 == a2) {
                                        if (a2 != -1) {
                                            Uri c11 = wVarArr[a2].c();
                                            p2.c cVar3 = (p2.c) dVar.d.get(c11);
                                            if (cVar3 != null) {
                                                p2.b bVar2 = (p2.b) i0.a.h(cVar3.b, c11, c11);
                                                bVar2.getClass();
                                                bVar2.x = false;
                                            }
                                        }
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                    }
                                    if (longValue >= j16) {
                                        iVar2.n = new u2.b();
                                        lVar = lVar3;
                                        oVar = oVar2;
                                    } else {
                                        h f10 = i.f(b11, longValue, intValue);
                                        if (f10 == null) {
                                            if (b11.o) {
                                                oVar = oVar2;
                                                if (z19 || n0Var.isEmpty()) {
                                                    oVar.b = z11;
                                                } else {
                                                    f10 = new h((p2.k) e9.s.m(n0Var), (j16 + n0Var.size()) - 1, -1);
                                                }
                                            } else {
                                                oVar = oVar2;
                                                oVar.d = c10;
                                                iVar2.p = c10;
                                            }
                                            lVar = lVar3;
                                        } else {
                                            oVar = oVar2;
                                        }
                                        boolean z23 = f10.d;
                                        p2.k kVar = f10.a;
                                        iVar2.p = null;
                                        SystemClock.elapsedRealtime();
                                        p2.j jVar5 = kVar.b;
                                        long j29 = kVar.e;
                                        Uri g10 = (jVar5 == null || (str = jVar5.h) == null) ? null : e2.e.g(str2, str);
                                        e g11 = iVar2.g(g10, l4, true);
                                        oVar.c = g11;
                                        if (g11 == null) {
                                            String str3 = kVar.h;
                                            Uri g12 = str3 == null ? null : e2.e.g(str2, str3);
                                            e g13 = iVar2.g(g12, l4, false);
                                            oVar.c = g13;
                                            if (g13 == null) {
                                                boolean z24 = kVar instanceof p2.h ? ((p2.h) kVar).x || (f10.c == 0 && z22) : z22;
                                                if (jVar == null) {
                                                    AtomicInteger atomicInteger = j.c0;
                                                } else if (!c10.equals(jVar.y) || !jVar.X) {
                                                    long j30 = j15 + j29;
                                                    if (!z24 || j30 < j25) {
                                                        z12 = true;
                                                        if (z12 || !z23) {
                                                            c cVar4 = iVar2.a;
                                                            g2.h hVar4 = iVar2.b;
                                                            x xVar2 = iVar2.f[l4];
                                                            List list4 = iVar2.i;
                                                            int n10 = iVar2.r.n();
                                                            Object q6 = iVar2.r.q();
                                                            boolean z25 = iVar2.l;
                                                            m2.t tVar = iVar2.d;
                                                            if (g12 != null) {
                                                                uVar.getClass();
                                                                cVar = cVar4;
                                                                z13 = z25;
                                                                uVar2 = uVar;
                                                                bArr = null;
                                                            } else {
                                                                cVar = cVar4;
                                                                z13 = z25;
                                                                uVar2 = uVar;
                                                                bArr = (byte[]) ((d) uVar2.b).get(g12);
                                                            }
                                                            byte[] bArr4 = g10 != null ? null : (byte[]) ((d) uVar2.b).get(g10);
                                                            j2.l lVar4 = iVar2.k;
                                                            AtomicInteger atomicInteger2 = j.c0;
                                                            Map map = Collections.EMPTY_MAP;
                                                            Uri g14 = e2.e.g(str2, kVar.a);
                                                            lVar = lVar3;
                                                            long j31 = kVar.r;
                                                            long j32 = kVar.s;
                                                            int i10 = !z23 ? 8 : 0;
                                                            t6.l(g14, "The uri must be set.");
                                                            g2.n nVar2 = new g2.n(g14, 1, null, map, j31, j32, null, i10);
                                                            z14 = bArr == null;
                                                            if (z14) {
                                                                bArr2 = null;
                                                            } else {
                                                                String str4 = kVar.n;
                                                                str4.getClass();
                                                                bArr2 = j.e(str4);
                                                            }
                                                            if (bArr == null) {
                                                                bArr2.getClass();
                                                                hVar = new a(hVar4, bArr, bArr2);
                                                            } else {
                                                                hVar = hVar4;
                                                            }
                                                            jVar2 = kVar.b;
                                                            if (jVar2 == null) {
                                                                boolean z26 = bArr4 != null;
                                                                if (z26) {
                                                                    String str5 = jVar2.n;
                                                                    str5.getClass();
                                                                    bArr3 = j.e(str5);
                                                                } else {
                                                                    bArr3 = null;
                                                                }
                                                                boolean z27 = z26;
                                                                Uri g15 = e2.e.g(str2, jVar2.a);
                                                                lVar2 = lVar4;
                                                                long j33 = jVar2.r;
                                                                long j34 = jVar2.s;
                                                                t6.l(g15, "The uri must be set.");
                                                                g2.n nVar3 = new g2.n(g15, 1, null, map, j33, j34, null, 0);
                                                                if (bArr4 != null) {
                                                                    bArr3.getClass();
                                                                    hVar3 = new a(hVar4, bArr4, bArr3);
                                                                } else {
                                                                    hVar3 = hVar4;
                                                                }
                                                                hVar2 = hVar3;
                                                                z15 = z27;
                                                                nVar = nVar3;
                                                            } else {
                                                                lVar2 = lVar4;
                                                                nVar = null;
                                                                hVar2 = null;
                                                                z15 = false;
                                                            }
                                                            long j35 = j15 + j29;
                                                            long j36 = j35 + kVar.c;
                                                            int i11 = b11.j + kVar.d;
                                                            if (jVar == null) {
                                                                g2.n nVar4 = jVar.G;
                                                                boolean z28 = nVar == nVar4 || (nVar != null && nVar4 != null && nVar.a.equals(nVar4.a) && nVar.e == nVar4.e);
                                                                boolean z29 = c10.equals(jVar.y) && jVar.X;
                                                                iVar3 = jVar.O;
                                                                xVar = jVar.P;
                                                                bVar = (z28 && z29 && !jVar.Z && jVar.x == i11) ? jVar.S : null;
                                                            } else {
                                                                iVar3 = new q3.i(null);
                                                                xVar = new e2.x(10);
                                                                bVar = null;
                                                            }
                                                            q3.i iVar6 = iVar3;
                                                            e2.x xVar3 = xVar;
                                                            long j37 = f10.b;
                                                            int i12 = f10.c;
                                                            boolean z30 = !z23;
                                                            boolean z31 = kVar.w;
                                                            SparseArray sparseArray = (SparseArray) tVar.b;
                                                            k0Var = (e2.k0) sparseArray.get(i11);
                                                            if (k0Var == null) {
                                                                k0Var = new e2.k0(9223372036854775806L);
                                                                sparseArray.put(i11, k0Var);
                                                            }
                                                            oVar.c = new j(cVar, hVar, nVar2, xVar2, z14, hVar2, nVar, z15, c10, list4, n10, q6, j35, j36, j37, i12, z30, i11, z31, z13, k0Var, kVar.f, bVar, iVar6, xVar3, z12, z24, lVar2);
                                                        }
                                                    }
                                                }
                                                z12 = false;
                                                if (z12) {
                                                }
                                                c cVar42 = iVar2.a;
                                                g2.h hVar42 = iVar2.b;
                                                x xVar22 = iVar2.f[l4];
                                                List list42 = iVar2.i;
                                                int n102 = iVar2.r.n();
                                                Object q62 = iVar2.r.q();
                                                boolean z252 = iVar2.l;
                                                m2.t tVar2 = iVar2.d;
                                                if (g12 != null) {
                                                }
                                                if (g10 != null) {
                                                }
                                                j2.l lVar42 = iVar2.k;
                                                AtomicInteger atomicInteger22 = j.c0;
                                                Map map2 = Collections.EMPTY_MAP;
                                                Uri g142 = e2.e.g(str2, kVar.a);
                                                lVar = lVar3;
                                                long j312 = kVar.r;
                                                long j322 = kVar.s;
                                                if (!z23) {
                                                }
                                                t6.l(g142, "The uri must be set.");
                                                g2.n nVar22 = new g2.n(g142, 1, null, map2, j312, j322, null, i10);
                                                if (bArr == null) {
                                                }
                                                if (z14) {
                                                }
                                                if (bArr == null) {
                                                }
                                                jVar2 = kVar.b;
                                                if (jVar2 == null) {
                                                }
                                                long j352 = j15 + j29;
                                                long j362 = j352 + kVar.c;
                                                int i112 = b11.j + kVar.d;
                                                if (jVar == null) {
                                                }
                                                q3.i iVar62 = iVar3;
                                                e2.x xVar32 = xVar;
                                                long j372 = f10.b;
                                                int i122 = f10.c;
                                                boolean z302 = !z23;
                                                boolean z312 = kVar.w;
                                                SparseArray sparseArray2 = (SparseArray) tVar2.b;
                                                k0Var = (e2.k0) sparseArray2.get(i112);
                                                if (k0Var == null) {
                                                }
                                                oVar.c = new j(cVar, hVar, nVar22, xVar22, z14, hVar2, nVar, z15, c10, list42, n102, q62, j352, j362, j372, i122, z302, i112, z312, z13, k0Var, kVar.f, bVar, iVar62, xVar32, z12, z24, lVar2);
                                            }
                                        }
                                        lVar = lVar3;
                                    }
                                }
                            }
                            jVar = jVar4;
                            iVar2 = iVar5;
                            String str22 = b11.a;
                            boolean z222 = b11.c;
                            j16 = b11.k;
                            n0 n0Var2 = b11.r;
                            if (l4 == a2) {
                            }
                            if (longValue >= j16) {
                            }
                        }
                        z16 = oVar.b;
                        v2.f fVar = (v2.f) oVar.c;
                        Uri uri = (Uri) oVar.d;
                        if (!z16) {
                            this.g0 = j11;
                            this.j0 = true;
                            return true;
                        }
                        if (fVar == null) {
                            if (uri == null || (cVar2 = (p2.c) ((k) this.c.a).b.d.get(uri)) == null) {
                                return false;
                            }
                            p2.c.b(cVar2, uri, true);
                            return false;
                        }
                        if (fVar instanceof j) {
                            j jVar6 = (j) fVar;
                            ArrayList arrayList = this.D;
                            if (!arrayList.isEmpty()) {
                                if (!y().g()) {
                                    x(arrayList.size() - 1);
                                }
                                if (jVar6.D && jVar6.b0) {
                                    int size = arrayList.size() - 1;
                                    while (true) {
                                        if (size < 0) {
                                            break;
                                        }
                                        long j38 = ((j) arrayList.get(size)).h;
                                        long j39 = jVar6.h;
                                        if (j38 < j39) {
                                            break;
                                        }
                                        if (j38 == j39 && i(size)) {
                                            x(size);
                                            jVar6.b0 = false;
                                            break;
                                        }
                                        size--;
                                    }
                                }
                            }
                            this.o0 = jVar6;
                            this.V = jVar6.d;
                            this.g0 = -9223372036854775807L;
                            arrayList.add(jVar6);
                            e9.k0 t10 = n0.t();
                            for (p pVar3 : this.L) {
                                t10.c(Integer.valueOf(pVar3.q + pVar3.p));
                            }
                            x1 f11 = t10.f();
                            jVar6.T = this;
                            jVar6.Y = f11;
                            for (p pVar4 : this.L) {
                                pVar4.getClass();
                                pVar4.E = jVar6.w;
                                if (jVar6.b0) {
                                    pVar4.I = true;
                                }
                            }
                        }
                        this.K = fVar;
                        lVar.f(fVar, this, this.r.q0(fVar.c));
                        return true;
                    }
                }
                z10 = false;
                long j252 = max;
                j jVar42 = jVar3;
                iVar.r.k(j20, j21, j12, list, b10);
                int l42 = iVar.r.l();
                if (a2 == l42) {
                }
                c10 = wVarArr[l42].c();
                if (dVar.f(c10)) {
                }
                z16 = oVar.b;
                v2.f fVar2 = (v2.f) oVar.c;
                Uri uri2 = (Uri) oVar.d;
                if (!z16) {
                }
            }
        }
        return false;
    }

    @Override // y2.g
    public final void n(y2.i iVar, long j10, long j11, int i10) {
        u uVar;
        v2.f fVar = (v2.f) iVar;
        if (i10 == 0) {
            long j12 = fVar.a;
            uVar = new u(fVar.b, j10);
        } else {
            long j13 = fVar.a;
            g2.n nVar = fVar.b;
            c0 c0Var = fVar.r;
            uVar = new u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        }
        this.w.u(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y2.g
    public final void o(y2.i iVar, long j10, long j11) {
        v2.f fVar = (v2.f) iVar;
        this.K = null;
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            byte[] bArr = eVar.s;
            i iVar2 = this.d;
            iVar2.m = bArr;
            n2.u uVar = iVar2.j;
            Uri uri = eVar.b.a;
            byte[] bArr2 = eVar.x;
            bArr2.getClass();
            d dVar = (d) uVar.b;
            uri.getClass();
        }
        long j12 = fVar.a;
        g2.n nVar = fVar.b;
        c0 c0Var = fVar.r;
        u uVar2 = new u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        this.r.getClass();
        this.w.q(uVar2, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (this.T) {
            this.c.r(this);
            return;
        }
        i2.v0 v0Var = new i2.v0();
        v0Var.a = this.f0;
        m(new w0(v0Var));
    }

    @Override // u2.f1
    public final long s() {
        if (this.j0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.g0;
        }
        long j10 = this.f0;
        j y3 = y();
        if (!y3.X) {
            ArrayList arrayList = this.D;
            y3 = arrayList.size() > 1 ? (j) i0.a.g(2, arrayList) : null;
        }
        if (y3 != null) {
            j10 = Math.max(j10, y3.n);
        }
        if (this.S) {
            for (p pVar : this.L) {
                j10 = Math.max(j10, pVar.s());
            }
        }
        return j10;
    }

    @Override // u2.f1
    public final void u(long j10) {
        y2.l lVar = this.s;
        if (lVar.c() || A()) {
            return;
        }
        boolean d = lVar.d();
        boolean z10 = false;
        int i10 = 0;
        z10 = false;
        i iVar = this.d;
        List list = this.E;
        if (d) {
            this.K.getClass();
            if (iVar.n == null ? iVar.r.d(j10, this.K, list) : false) {
                lVar.b();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && iVar.c((j) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            x(size);
        }
        int size2 = (iVar.n != null || iVar.r.length() < 2) ? list.size() : iVar.r.i(j10, list);
        if (size2 < this.D.size()) {
            x(size2);
        }
        if (this.S && this.k0 != Long.MIN_VALUE) {
            boolean z11 = true;
            while (true) {
                p[] pVarArr = this.L;
                if (i10 >= pVarArr.length) {
                    break;
                }
                if (this.d0[i10] && (this.e0[i10] || !this.c0)) {
                    z11 &= pVarArr[i10].z();
                }
                i10++;
            }
            z10 = z11;
        }
        if (z10) {
            this.j0 = true;
        }
    }

    public final r1 v(p1[] p1VarArr) {
        for (int i10 = 0; i10 < p1VarArr.length; i10++) {
            p1 p1Var = p1VarArr[i10];
            x[] xVarArr = new x[p1Var.a];
            for (int i11 = 0; i11 < p1Var.a; i11++) {
                x xVar = p1Var.d[i11];
                int t02 = this.h.t0(xVar);
                w a2 = xVar.a();
                a2.S = t02;
                xVarArr[i11] = new x(a2);
            }
            p1VarArr[i10] = new p1(p1Var.b, xVarArr);
        }
        return new r1(p1VarArr);
    }

    public final void x(int i10) {
        ArrayList arrayList;
        t6.p(!this.s.d());
        while (true) {
            arrayList = this.D;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (i(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = y().n;
        j jVar = (j) arrayList.get(i10);
        l0.X(i10, arrayList.size(), arrayList);
        for (int i11 = 0; i11 < this.L.length; i11++) {
            this.L[i11].o(jVar.f(i11));
        }
        if (arrayList.isEmpty()) {
            this.g0 = this.f0;
        } else {
            ((j) e9.s.m(arrayList)).Z = true;
        }
        this.j0 = false;
        this.w.B(jVar.h, this.Q, j10);
    }

    public final j y() {
        return (j) i0.a.g(1, this.D);
    }

    @Override // c3.q
    public final void G1(b0 b0Var) {
    }
}
