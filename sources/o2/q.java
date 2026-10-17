package o2;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import b2.p1;
import b2.t0;
import b2.v;
import b2.v0;
import b2.w;
import c3.c0;
import c3.j0;
import e2.k0;
import e2.m0;
import e9.n0;
import e9.x1;
import g2.b0;
import g2.x;
import i2.s0;
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
import ki.t1;
import ki.u;
import org.telegram.ui.Wallet.x5;
import u2.b1;
import u2.f1;
import u2.r1;
import v7.u6;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class q implements y2.g, y2.j, f1, c3.q, b1 {
    public static final Set p0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
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
    public w V;
    public w W;
    public boolean X;
    public r1 Y;
    public Set Z;
    public final String a;
    public int[] a0;
    public final int b;
    public int b0;
    public final le.b c;
    public boolean c0;
    public final i d;
    public boolean[] d0;
    public final androidx.biometric.e e;
    public boolean[] e0;
    public final w f;
    public long f0;
    public long g0;
    public final n2.n h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public long k0;
    public boolean l0;
    public long m0;
    public final n2.k n;
    public b2.s n0;
    public j o0;
    public final oa.d r;
    public final y2.l s;
    public final a5.a v;
    public final int w;
    public final androidx.activity.o x;
    public final ArrayList y;

    /* JADX WARN: Type inference failed for: r2v13, types: [o2.n] */
    /* JADX WARN: Type inference failed for: r2v14, types: [o2.n] */
    public q(String str, int i10, le.b bVar, i iVar, Map map, androidx.biometric.e eVar, long j10, w wVar, n2.n nVar, n2.k kVar, oa.d dVar, a5.a aVar, int i11, z2.a aVar2) {
        this.a = str;
        this.b = i10;
        this.c = bVar;
        this.d = iVar;
        this.J = map;
        this.e = eVar;
        this.f = wVar;
        this.h = nVar;
        this.n = kVar;
        this.r = dVar;
        this.v = aVar;
        this.w = i11;
        this.s = aVar2 != null ? new y2.l(aVar2) : new y2.l("Loader:HlsSampleStreamWrapper");
        androidx.activity.o oVar = new androidx.activity.o();
        oVar.b = null;
        final int i12 = 0;
        oVar.a = false;
        oVar.c = null;
        this.x = oVar;
        this.M = new int[0];
        Set set = p0;
        this.N = new HashSet(set.size());
        this.O = new SparseIntArray(set.size());
        this.L = new p[0];
        this.e0 = new boolean[0];
        this.d0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.y = arrayList;
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
        this.H = m0.q(null);
        this.f0 = j10;
        this.g0 = j10;
        this.k0 = Long.MIN_VALUE;
    }

    public static c3.n h(int i10, int i11) {
        e2.a.l("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new c3.n();
    }

    public static w w(w wVar, w wVar2, boolean z10) {
        String b10;
        if (wVar == null) {
            return wVar2;
        }
        String str = wVar.k;
        String str2 = wVar2.s;
        int h = v0.h(str2);
        if (m0.v(h, str) == 1) {
            b10 = m0.w(h, str);
            str2 = v0.d(b10);
        } else {
            b10 = v0.b(str, str2);
        }
        wVar2.n = wVar.n;
        wVar2.o = wVar.o;
        wVar2.p = wVar.p;
        wVar2.q = wVar.q;
        v a2 = wVar2.a();
        a2.a = wVar.a;
        a2.b = wVar.b;
        a2.c = n0.u(wVar.c);
        a2.d = wVar.d;
        a2.e = wVar.e;
        a2.f = wVar.f;
        a2.h = z10 ? wVar.h : -1;
        a2.i = z10 ? wVar.i : -1;
        a2.j = b10;
        a2.p = wVar.p;
        a2.n = wVar.o;
        a2.m = wVar.n;
        a2.o = wVar.q;
        if (h == 2) {
            a2.y = wVar.z;
            a2.z = wVar.A;
            a2.C = wVar.D;
        }
        if (str2 != null) {
            a2.r = v0.n(str2);
        }
        int i10 = wVar.K;
        if (i10 != -1 && h == 1) {
            a2.J = i10;
        }
        t0 t0Var = wVar.l;
        if (t0Var != null) {
            t0 t0Var2 = wVar2.l;
            if (t0Var2 != null) {
                t0Var = t0Var2.b(t0Var);
            }
            a2.k = t0Var;
        }
        return new w(a2);
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
                            w y3 = pVarArr[i14].y();
                            y3.getClass();
                            w wVar = this.Y.a(i13).d[0];
                            String str = y3.s;
                            String str2 = wVar.s;
                            int h = v0.h(str);
                            if (h == 3) {
                                if (Objects.equals(str, str2)) {
                                    if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || y3.P == wVar.P) {
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
                w y10 = this.L[i15].y();
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
                w y11 = this.L[i21].y();
                y11.getClass();
                w wVar2 = this.f;
                String str4 = this.a;
                if (i21 == i16) {
                    w[] wVarArr = new w[i19];
                    for (int i22 = i11; i22 < i19; i22++) {
                        w wVar3 = p1Var.d[i22];
                        if (i17 == 1 && wVar2 != null) {
                            wVar3 = wVar3.d(wVar2);
                        }
                        wVarArr[i22] = i19 == 1 ? y11.d(wVar3) : w(wVar3, y11, true);
                    }
                    p1VarArr[i21] = new p1(str4, wVarArr);
                    this.b0 = i21;
                    i10 = 0;
                } else {
                    if (i17 != 2 || !v0.i(y11.s)) {
                        wVar2 = null;
                    }
                    StringBuilder i23 = r.c.i(str4, ":muxed:");
                    i23.append(i21 < i16 ? i21 : i21 - 1);
                    String sb2 = i23.toString();
                    i10 = 0;
                    v a2 = w(wVar2, y11, false).a();
                    a2.l = str4;
                    p1VarArr[i21] = new p1(sb2, new w(a2));
                }
                i21++;
                i11 = i10;
            }
            int i24 = i11;
            this.Y = v(p1VarArr);
            u6.p(this.Z == null ? 1 : i24);
            this.Z = Collections.EMPTY_SET;
            this.T = true;
            this.c.g0();
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
        this.H.post(new u(this.c, 10));
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
        ArrayList arrayList = this.y;
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
                    long d = d();
                    J = pVar.J(j10, d == Long.MIN_VALUE || j10 < d);
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

    @Override // c3.q
    public final void H() {
        this.l0 = true;
        this.H.post(this.G);
    }

    @Override // y2.g
    public final void I(y2.i iVar, long j10, long j11, boolean z10) {
        v2.f fVar = (v2.f) iVar;
        this.K = null;
        long j12 = fVar.a;
        g2.m mVar = fVar.b;
        b0 b0Var = fVar.r;
        u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        this.r.getClass();
        this.v.q(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (z10) {
            return;
        }
        if (A() || this.U == 0) {
            E();
        }
        if (this.U > 0) {
            this.c.v(this);
        }
    }

    @Override // u2.b1
    public final void a() {
        this.H.post(this.F);
    }

    @Override // y2.j
    public final void b() {
        for (p pVar : this.L) {
            pVar.G(true);
            n2.h hVar = pVar.h;
            if (hVar != null) {
                hVar.a(pVar.e);
                pVar.h = null;
                pVar.g = null;
            }
        }
    }

    @Override // u2.f1
    public final boolean c() {
        return this.s.d();
    }

    @Override // u2.f1
    public final long d() {
        if (A()) {
            return this.g0;
        }
        if (this.j0) {
            return Long.MIN_VALUE;
        }
        return y().n;
    }

    public final void e() {
        u6.p(this.T);
        this.Y.getClass();
        this.Z.getClass();
    }

    public final boolean f(int i10) {
        int i11 = i10;
        while (true) {
            ArrayList arrayList = this.y;
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
    public final k4.d j(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        boolean c10;
        boolean z10;
        int u10;
        k4.d dVar;
        boolean a2;
        int i11;
        v2.f fVar = (v2.f) iVar;
        boolean z11 = fVar instanceof j;
        if (z11 && !((j) fVar).g() && (iOException instanceof x) && ((i11 = ((x) iOException).c) == 410 || i11 == 404)) {
            return y2.l.d;
        }
        long j12 = fVar.r.b;
        g2.m mVar = fVar.b;
        b0 b0Var = fVar.r;
        u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, j12);
        m0.h0(fVar.h);
        m0.h0(fVar.n);
        c5.b0 b0Var2 = new c5.b0(iOException, i10, 16);
        boolean z12 = fVar instanceof j;
        i iVar2 = this.d;
        x5 a10 = z12 ? iVar2.a(((j) fVar).x) : new x5(1, 0, iVar2.r.length(), iVar2.d(SystemClock.elapsedRealtime()));
        this.r.getClass();
        k4.d x32 = oa.d.x3(a10, b0Var2);
        if (x32 != null) {
            int i12 = x32.a;
            long j13 = x32.b;
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException(i0.a.j(i12, "Invalid fallback selection type: "));
                }
                int a11 = iVar2.h.a(fVar.d);
                if (a11 != -1 && (u10 = iVar2.r.u(a11)) != -1) {
                    c10 = iVar2.r.o(u10, j13);
                    z10 = c10;
                }
            } else if (z12) {
                p2.e eVar = iVar2.g;
                Uri uri = ((j) fVar).x;
                p2.d dVar2 = (p2.d) eVar.d.get(uri);
                c10 = dVar2 != null ? p2.d.c(dVar2, uri, j13) : false;
                z10 = c10;
            }
            if (z10) {
                long z32 = oa.d.z3(b0Var2);
                dVar = z32 != -9223372036854775807L ? new k4.d(0, z32, false) : y2.l.f;
            } else {
                if (z11 && j12 == 0) {
                    ArrayList arrayList = this.y;
                    u6.p(((j) i0.a.z(1, arrayList)) == fVar);
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
            this.v.s(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
            if (!a2) {
                this.K = null;
            }
            if (z10) {
                if (!this.T) {
                    s0 s0Var = new s0();
                    s0Var.a = this.f0;
                    p(new i2.t0(s0Var));
                    return dVar3;
                }
                this.c.v(this);
            }
            return dVar3;
        }
        z10 = false;
        if (z10) {
        }
        k4.d dVar32 = dVar;
        a2 = dVar32.a();
        this.v.s(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
        if (!a2) {
        }
        if (z10) {
        }
        return dVar32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [o2.p[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o2.p[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [c3.j0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [o2.p, u2.c1] */
    /* JADX WARN: Type inference failed for: r5v6, types: [c3.n] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // c3.q
    public final j0 j0(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i11);
        Set set = p0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.N;
        SparseIntArray sparseIntArray = this.O;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            u6.g(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.M[i12] = i10;
                }
                r52 = this.M[i12] == i10 ? this.L[i12] : h(i10, i11);
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
                return h(i10, i11);
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
                r52.E = r6.v;
            }
            r52.f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.M, i14);
            this.M = copyOf;
            copyOf[length] = i10;
            p[] pVarArr = this.L;
            String str = m0.a;
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
            this.P = new o(r52, this.w);
        }
        return this.P;
    }

    @Override // y2.g
    public final void l(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        v2.f fVar = (v2.f) iVar;
        if (i10 == 0) {
            long j12 = fVar.a;
            uVar = new u2.u(fVar.b, j10);
        } else {
            long j13 = fVar.a;
            g2.m mVar = fVar.b;
            b0 b0Var = fVar.r;
            uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        }
        this.v.v(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y2.g
    public final void n(y2.i iVar, long j10, long j11) {
        v2.f fVar = (v2.f) iVar;
        this.K = null;
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            byte[] bArr = eVar.s;
            i iVar2 = this.d;
            iVar2.m = bArr;
            t1 t1Var = iVar2.j;
            Uri uri = eVar.b.a;
            byte[] bArr2 = eVar.w;
            bArr2.getClass();
            d dVar = (d) t1Var.b;
            uri.getClass();
        }
        long j12 = fVar.a;
        g2.m mVar = fVar.b;
        b0 b0Var = fVar.r;
        u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        this.r.getClass();
        this.v.r(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (this.T) {
            this.c.v(this);
            return;
        }
        s0 s0Var = new s0();
        s0Var.a = this.f0;
        p(new i2.t0(s0Var));
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
    public final boolean p(i2.t0 t0Var) {
        long max;
        long j10;
        List list;
        long j11;
        int a2;
        i2.t0 t0Var2;
        t1 t1Var;
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
        t1 t1Var2;
        byte[] bArr;
        y2.l lVar;
        boolean z14;
        byte[] bArr2;
        g2.h hVar;
        p2.k kVar;
        j2.k kVar2;
        g2.m mVar;
        g2.h hVar2;
        boolean z15;
        q3.h hVar3;
        e2.x xVar;
        b bVar;
        k0 k0Var;
        byte[] bArr3;
        g2.h hVar4;
        String str;
        boolean z16;
        p2.d dVar;
        if (!this.j0) {
            y2.l lVar2 = this.s;
            if (!lVar2.d() && !lVar2.c()) {
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
                androidx.activity.o oVar2 = this.x;
                oVar2.b = null;
                oVar2.a = false;
                oVar2.c = null;
                boolean z19 = this.T || !list.isEmpty();
                i iVar3 = this.d;
                t1 t1Var3 = iVar3.j;
                p2.x[] xVarArr = iVar3.e;
                p2.e eVar = iVar3.g;
                j jVar2 = list.isEmpty() ? null : (j) e9.s.m(list);
                if (jVar2 == null) {
                    j11 = -9223372036854775807L;
                    a2 = -1;
                    t1Var = t1Var3;
                    t0Var2 = t0Var;
                } else {
                    j11 = -9223372036854775807L;
                    a2 = iVar3.h.a(jVar2.d);
                    t0Var2 = t0Var;
                    t1Var = t1Var3;
                }
                long j20 = t0Var2.a;
                long j21 = max - j20;
                long j22 = iVar3.s;
                long j23 = j22 != j11 ? j22 - j20 : j11;
                if (jVar2 == null || iVar3.q) {
                    j12 = j23;
                    iVar = iVar3;
                } else {
                    iVar = iVar3;
                    j12 = j23;
                    long j24 = jVar2.n - jVar2.h;
                    j21 = Math.max(0L, j21 - j24);
                    if (j12 != j11) {
                        j12 = Math.max(0L, j12 - j24);
                    }
                }
                v2.m[] b10 = iVar.b(jVar2, max);
                if (a2 != -1) {
                    x2.p pVar3 = iVar.r;
                    if (pVar3.a(pVar3.u(a2), SystemClock.elapsedRealtime())) {
                        z10 = true;
                        long j25 = max;
                        j jVar3 = jVar2;
                        iVar.r.k(j20, j21, j12, list, b10);
                        int l4 = iVar.r.l();
                        boolean z20 = a2 == l4;
                        c10 = xVarArr[l4].c();
                        if (eVar.f(c10)) {
                            oVar2.c = c10;
                            iVar.p = c10;
                            lVar = lVar2;
                            oVar = oVar2;
                        } else {
                            p2.n b11 = eVar.b(c10, true);
                            b11.getClass();
                            long j26 = b11.h;
                            iVar.q = b11.c;
                            if (b11.o) {
                                j13 = j26;
                                j14 = j11;
                            } else {
                                j13 = j26;
                                j14 = (j13 + b11.u) - eVar.I;
                            }
                            iVar.s = j14;
                            long j27 = j13 - eVar.I;
                            i iVar4 = iVar;
                            Pair e = iVar4.e(jVar3, z20, b11, j27, j25);
                            boolean z21 = z10;
                            long longValue = ((Long) e.first).longValue();
                            int intValue = ((Integer) e.second).intValue();
                            if (!z20 || z21 || jVar3 == null) {
                                j15 = j27;
                            } else {
                                j15 = j27;
                                if (longValue < b11.k || ((f7 = i.f(b11, longValue, intValue)) != null && j15 + f7.a.e < j10)) {
                                    c10 = xVarArr[a2].c();
                                    b11 = eVar.b(c10, true);
                                    b11.getClass();
                                    long j28 = b11.h - eVar.I;
                                    Pair e7 = iVar4.e(jVar3, false, b11, j28, j25);
                                    jVar = jVar3;
                                    long longValue2 = ((Long) e7.first).longValue();
                                    intValue = ((Integer) e7.second).intValue();
                                    l4 = a2;
                                    j15 = j28;
                                    iVar2 = iVar4;
                                    longValue = longValue2;
                                    String str2 = b11.a;
                                    boolean z22 = b11.c;
                                    j16 = b11.k;
                                    n0 n0Var = b11.r;
                                    if (l4 == a2) {
                                        if (a2 != -1) {
                                            Uri c11 = xVarArr[a2].c();
                                            p2.d dVar2 = (p2.d) eVar.d.get(c11);
                                            if (dVar2 != null) {
                                                p2.c cVar2 = (p2.c) i0.a.i(dVar2.b, c11, c11);
                                                cVar2.getClass();
                                                cVar2.w = false;
                                            }
                                        }
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                    }
                                    if (longValue >= j16) {
                                        iVar2.n = new u2.b();
                                        lVar = lVar2;
                                        oVar = oVar2;
                                    } else {
                                        h f10 = i.f(b11, longValue, intValue);
                                        if (f10 == null) {
                                            if (b11.o) {
                                                oVar = oVar2;
                                                if (z19 || n0Var.isEmpty()) {
                                                    oVar.a = z11;
                                                } else {
                                                    f10 = new h((p2.l) e9.s.m(n0Var), (j16 + n0Var.size()) - 1, -1);
                                                }
                                            } else {
                                                oVar = oVar2;
                                                oVar.c = c10;
                                                iVar2.p = c10;
                                            }
                                            lVar = lVar2;
                                        } else {
                                            oVar = oVar2;
                                        }
                                        boolean z23 = f10.d;
                                        p2.l lVar3 = f10.a;
                                        iVar2.p = null;
                                        SystemClock.elapsedRealtime();
                                        p2.k kVar3 = lVar3.b;
                                        long j29 = lVar3.e;
                                        Uri g10 = (kVar3 == null || (str = kVar3.h) == null) ? null : e2.e.g(str2, str);
                                        e g11 = iVar2.g(l4, g10, true);
                                        oVar.b = g11;
                                        if (g11 == null) {
                                            String str3 = lVar3.h;
                                            Uri g12 = str3 == null ? null : e2.e.g(str2, str3);
                                            e g13 = iVar2.g(l4, g12, false);
                                            oVar.b = g13;
                                            if (g13 == null) {
                                                boolean z24 = lVar3 instanceof p2.i ? ((p2.i) lVar3).w || (f10.c == 0 && z22) : z22;
                                                if (jVar == null) {
                                                    AtomicInteger atomicInteger = j.c0;
                                                } else if (!c10.equals(jVar.x) || !jVar.X) {
                                                    long j30 = j15 + j29;
                                                    if (!z24 || j30 < j25) {
                                                        z12 = true;
                                                        if (z12 || !z23) {
                                                            c cVar3 = iVar2.a;
                                                            g2.h hVar5 = iVar2.b;
                                                            w wVar = iVar2.f[l4];
                                                            List list4 = iVar2.i;
                                                            int n10 = iVar2.r.n();
                                                            Object q6 = iVar2.r.q();
                                                            boolean z25 = iVar2.l;
                                                            k0.b bVar2 = iVar2.d;
                                                            if (g12 != null) {
                                                                t1Var.getClass();
                                                                cVar = cVar3;
                                                                z13 = z25;
                                                                t1Var2 = t1Var;
                                                                bArr = null;
                                                            } else {
                                                                cVar = cVar3;
                                                                z13 = z25;
                                                                t1Var2 = t1Var;
                                                                bArr = (byte[]) ((d) t1Var2.b).get(g12);
                                                            }
                                                            byte[] bArr4 = g10 != null ? null : (byte[]) ((d) t1Var2.b).get(g10);
                                                            j2.k kVar4 = iVar2.k;
                                                            AtomicInteger atomicInteger2 = j.c0;
                                                            Map map = Collections.EMPTY_MAP;
                                                            Uri g14 = e2.e.g(str2, lVar3.a);
                                                            lVar = lVar2;
                                                            long j31 = lVar3.r;
                                                            long j32 = lVar3.s;
                                                            int i10 = !z23 ? 8 : 0;
                                                            u6.l(g14, "The uri must be set.");
                                                            g2.m mVar2 = new g2.m(g14, 1, null, map, j31, j32, null, i10);
                                                            z14 = bArr == null;
                                                            if (z14) {
                                                                bArr2 = null;
                                                            } else {
                                                                String str4 = lVar3.n;
                                                                str4.getClass();
                                                                bArr2 = j.e(str4);
                                                            }
                                                            if (bArr == null) {
                                                                bArr2.getClass();
                                                                hVar = new a(hVar5, bArr, bArr2);
                                                            } else {
                                                                hVar = hVar5;
                                                            }
                                                            kVar = lVar3.b;
                                                            if (kVar == null) {
                                                                boolean z26 = bArr4 != null;
                                                                if (z26) {
                                                                    String str5 = kVar.n;
                                                                    str5.getClass();
                                                                    bArr3 = j.e(str5);
                                                                } else {
                                                                    bArr3 = null;
                                                                }
                                                                boolean z27 = z26;
                                                                Uri g15 = e2.e.g(str2, kVar.a);
                                                                kVar2 = kVar4;
                                                                long j33 = kVar.r;
                                                                long j34 = kVar.s;
                                                                u6.l(g15, "The uri must be set.");
                                                                g2.m mVar3 = new g2.m(g15, 1, null, map, j33, j34, null, 0);
                                                                if (bArr4 != null) {
                                                                    bArr3.getClass();
                                                                    hVar4 = new a(hVar5, bArr4, bArr3);
                                                                } else {
                                                                    hVar4 = hVar5;
                                                                }
                                                                hVar2 = hVar4;
                                                                z15 = z27;
                                                                mVar = mVar3;
                                                            } else {
                                                                kVar2 = kVar4;
                                                                mVar = null;
                                                                hVar2 = null;
                                                                z15 = false;
                                                            }
                                                            long j35 = j15 + j29;
                                                            long j36 = j35 + lVar3.c;
                                                            int i11 = b11.j + lVar3.d;
                                                            if (jVar == null) {
                                                                g2.m mVar4 = jVar.G;
                                                                boolean z28 = mVar == mVar4 || (mVar != null && mVar4 != null && mVar.a.equals(mVar4.a) && mVar.e == mVar4.e);
                                                                boolean z29 = c10.equals(jVar.x) && jVar.X;
                                                                hVar3 = jVar.O;
                                                                xVar = jVar.P;
                                                                bVar = (z28 && z29 && !jVar.Z && jVar.w == i11) ? jVar.S : null;
                                                            } else {
                                                                hVar3 = new q3.h(null);
                                                                xVar = new e2.x(10);
                                                                bVar = null;
                                                            }
                                                            q3.h hVar6 = hVar3;
                                                            e2.x xVar2 = xVar;
                                                            long j37 = f10.b;
                                                            int i12 = f10.c;
                                                            boolean z30 = !z23;
                                                            boolean z31 = lVar3.v;
                                                            SparseArray sparseArray = (SparseArray) bVar2.b;
                                                            k0Var = (k0) sparseArray.get(i11);
                                                            if (k0Var == null) {
                                                                k0Var = new k0(9223372036854775806L);
                                                                sparseArray.put(i11, k0Var);
                                                            }
                                                            oVar.b = new j(cVar, hVar, mVar2, wVar, z14, hVar2, mVar, z15, c10, list4, n10, q6, j35, j36, j37, i12, z30, i11, z31, z13, k0Var, lVar3.f, bVar, hVar6, xVar2, z12, z24, kVar2);
                                                        }
                                                    }
                                                }
                                                z12 = false;
                                                if (z12) {
                                                }
                                                c cVar32 = iVar2.a;
                                                g2.h hVar52 = iVar2.b;
                                                w wVar2 = iVar2.f[l4];
                                                List list42 = iVar2.i;
                                                int n102 = iVar2.r.n();
                                                Object q62 = iVar2.r.q();
                                                boolean z252 = iVar2.l;
                                                k0.b bVar22 = iVar2.d;
                                                if (g12 != null) {
                                                }
                                                if (g10 != null) {
                                                }
                                                j2.k kVar42 = iVar2.k;
                                                AtomicInteger atomicInteger22 = j.c0;
                                                Map map2 = Collections.EMPTY_MAP;
                                                Uri g142 = e2.e.g(str2, lVar3.a);
                                                lVar = lVar2;
                                                long j312 = lVar3.r;
                                                long j322 = lVar3.s;
                                                if (!z23) {
                                                }
                                                u6.l(g142, "The uri must be set.");
                                                g2.m mVar22 = new g2.m(g142, 1, null, map2, j312, j322, null, i10);
                                                if (bArr == null) {
                                                }
                                                if (z14) {
                                                }
                                                if (bArr == null) {
                                                }
                                                kVar = lVar3.b;
                                                if (kVar == null) {
                                                }
                                                long j352 = j15 + j29;
                                                long j362 = j352 + lVar3.c;
                                                int i112 = b11.j + lVar3.d;
                                                if (jVar == null) {
                                                }
                                                q3.h hVar62 = hVar3;
                                                e2.x xVar22 = xVar;
                                                long j372 = f10.b;
                                                int i122 = f10.c;
                                                boolean z302 = !z23;
                                                boolean z312 = lVar3.v;
                                                SparseArray sparseArray2 = (SparseArray) bVar22.b;
                                                k0Var = (k0) sparseArray2.get(i112);
                                                if (k0Var == null) {
                                                }
                                                oVar.b = new j(cVar, hVar, mVar22, wVar2, z14, hVar2, mVar, z15, c10, list42, n102, q62, j352, j362, j372, i122, z302, i112, z312, z13, k0Var, lVar3.f, bVar, hVar62, xVar22, z12, z24, kVar2);
                                            }
                                        }
                                        lVar = lVar2;
                                    }
                                }
                            }
                            jVar = jVar3;
                            iVar2 = iVar4;
                            String str22 = b11.a;
                            boolean z222 = b11.c;
                            j16 = b11.k;
                            n0 n0Var2 = b11.r;
                            if (l4 == a2) {
                            }
                            if (longValue >= j16) {
                            }
                        }
                        z16 = oVar.a;
                        v2.f fVar = (v2.f) oVar.b;
                        Uri uri = (Uri) oVar.c;
                        if (!z16) {
                            this.g0 = j11;
                            this.j0 = true;
                            return true;
                        }
                        if (fVar == null) {
                            if (uri == null || (dVar = (p2.d) ((k) this.c.b).b.d.get(uri)) == null) {
                                return false;
                            }
                            p2.d.b(dVar, uri, true);
                            return false;
                        }
                        if (fVar instanceof j) {
                            j jVar4 = (j) fVar;
                            ArrayList arrayList = this.y;
                            if (!arrayList.isEmpty()) {
                                if (!y().g()) {
                                    x(arrayList.size() - 1);
                                }
                                if (jVar4.y && jVar4.b0) {
                                    int size = arrayList.size() - 1;
                                    while (true) {
                                        if (size < 0) {
                                            break;
                                        }
                                        long j38 = ((j) arrayList.get(size)).h;
                                        long j39 = jVar4.h;
                                        if (j38 < j39) {
                                            break;
                                        }
                                        if (j38 == j39 && f(size)) {
                                            x(size);
                                            jVar4.b0 = false;
                                            break;
                                        }
                                        size--;
                                    }
                                }
                            }
                            this.o0 = jVar4;
                            this.V = jVar4.d;
                            this.g0 = -9223372036854775807L;
                            arrayList.add(jVar4);
                            e9.k0 t10 = n0.t();
                            for (p pVar4 : this.L) {
                                t10.c(Integer.valueOf(pVar4.q + pVar4.p));
                            }
                            x1 f11 = t10.f();
                            jVar4.T = this;
                            jVar4.Y = f11;
                            for (p pVar5 : this.L) {
                                pVar5.getClass();
                                pVar5.E = jVar4.v;
                                if (jVar4.b0) {
                                    pVar5.I = true;
                                }
                            }
                        }
                        this.K = fVar;
                        lVar.f(fVar, this, this.r.y3(fVar.c));
                        return true;
                    }
                }
                z10 = false;
                long j252 = max;
                j jVar32 = jVar2;
                iVar.r.k(j20, j21, j12, list, b10);
                int l42 = iVar.r.l();
                if (a2 == l42) {
                }
                c10 = xVarArr[l42].c();
                if (eVar.f(c10)) {
                }
                z16 = oVar.a;
                v2.f fVar2 = (v2.f) oVar.b;
                Uri uri2 = (Uri) oVar.c;
                if (!z16) {
                }
            }
        }
        return false;
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
            ArrayList arrayList = this.y;
            y3 = arrayList.size() > 1 ? (j) i0.a.h(2, arrayList) : null;
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
        if (size2 < this.y.size()) {
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
            w[] wVarArr = new w[p1Var.a];
            for (int i11 = 0; i11 < p1Var.a; i11++) {
                w wVar = p1Var.d[i11];
                int I0 = this.h.I0(wVar);
                v a2 = wVar.a();
                a2.S = I0;
                wVarArr[i11] = new w(a2);
            }
            p1VarArr[i10] = new p1(p1Var.b, wVarArr);
        }
        return new r1(p1VarArr);
    }

    public final void x(int i10) {
        ArrayList arrayList;
        u6.p(!this.s.d());
        while (true) {
            arrayList = this.y;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (f(i10)) {
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
        m0.X(i10, arrayList.size(), arrayList);
        for (int i11 = 0; i11 < this.L.length; i11++) {
            this.L[i11].o(jVar.f(i11));
        }
        if (arrayList.isEmpty()) {
            this.g0 = this.f0;
        } else {
            ((j) e9.s.m(arrayList)).Z = true;
        }
        this.j0 = false;
        this.v.C(this.Q, jVar.h, j10);
    }

    public final j y() {
        return (j) i0.a.h(1, this.y);
    }

    @Override // c3.q
    public final void g0(c0 c0Var) {
    }
}
