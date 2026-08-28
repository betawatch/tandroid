package o4;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.o0;
import com.google.android.exoplayer2.upstream.q0;
import d5.e0;
import d5.f0;
import d5.y;
import f7.g0;
import h3.s0;
import h3.t0;
import j$.util.DesugarCollections;
import j3.r0;
import j4.d1;
import j4.h0;
import j4.i1;
import j4.j1;
import j4.z0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import m3.w;
import m5.c0;
import mh.m2;
import n5.a0;
import o8.x;
import o8.z;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r implements l0, o0, d1, m3.m, z0 {
    public static final Set k0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final List A;
    public final o B;
    public final o C;
    public final Handler D;
    public final ArrayList E;
    public final Map F;
    public l4.e G;
    public q[] H;
    public int[] I;
    public final HashSet J;
    public final SparseIntArray K;
    public p L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public int Q;
    public t0 R;
    public t0 S;
    public boolean T;
    public j1 U;
    public Set V;
    public int[] W;
    public int X;
    public boolean Y;
    public boolean[] Z;
    public final String a;
    public boolean[] a0;
    public final int b;
    public long b0;
    public final a0 c;
    public long c0;
    public final i d;
    public boolean d0;
    public final com.google.android.exoplayer2.upstream.r e;
    public boolean e0;
    public final t0 f;
    public boolean f0;
    public boolean g0;
    public final l3.i h;
    public long h0;
    public l3.c i0;
    public k j0;
    public final a6.a n;
    public final v9.d r;
    public final q0 s = new q0("Loader:HlsSampleStreamWrapper");
    public final h0 v;
    public final int w;
    public final androidx.activity.o x;
    public final ArrayList y;

    /* JADX WARN: Type inference failed for: r1v12, types: [o4.o] */
    /* JADX WARN: Type inference failed for: r1v13, types: [o4.o] */
    public r(String str, int i9, a0 a0Var, i iVar, Map map, com.google.android.exoplayer2.upstream.r rVar, long j10, t0 t0Var, l3.i iVar2, a6.a aVar, v9.d dVar, h0 h0Var, int i10) {
        this.a = str;
        this.b = i9;
        this.c = a0Var;
        this.d = iVar;
        this.F = map;
        this.e = rVar;
        this.f = t0Var;
        this.h = iVar2;
        this.n = aVar;
        this.r = dVar;
        this.v = h0Var;
        this.w = i10;
        androidx.activity.o oVar = new androidx.activity.o();
        oVar.b = null;
        final int i11 = 0;
        oVar.a = false;
        oVar.c = null;
        this.x = oVar;
        this.I = new int[0];
        Set set = k0;
        this.J = new HashSet(set.size());
        this.K = new SparseIntArray(set.size());
        this.H = new q[0];
        this.a0 = new boolean[0];
        this.Z = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.y = arrayList;
        this.A = DesugarCollections.unmodifiableList(arrayList);
        this.E = new ArrayList();
        this.B = new Runnable(this) { // from class: o4.o
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.C();
                        break;
                    default:
                        r rVar2 = this.b;
                        rVar2.O = true;
                        rVar2.C();
                        break;
                }
            }
        };
        final int i12 = 1;
        this.C = new Runnable(this) { // from class: o4.o
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.C();
                        break;
                    default:
                        r rVar2 = this.b;
                        rVar2.O = true;
                        rVar2.C();
                        break;
                }
            }
        };
        this.D = f0.k(null);
        this.b0 = j10;
        this.c0 = j10;
    }

    public static m3.j j(int i9, int i10) {
        d5.a.K("HlsSampleStreamWrapper", "Unmapped track with id " + i9 + " of type " + i10);
        return new m3.j();
    }

    public static t0 p(t0 t0Var, t0 t0Var2, boolean z10) {
        String a2;
        if (t0Var == null) {
            return t0Var2;
        }
        String str = t0Var.r;
        String str2 = t0Var2.B;
        int g10 = d5.q.g(str2);
        if (f0.n(g10, str) == 1) {
            a2 = f0.o(g10, str);
            str2 = d5.q.c(a2);
        } else {
            a2 = d5.q.a(str, str2);
        }
        t0Var2.v = t0Var.v;
        t0Var2.w = t0Var.w;
        t0Var2.x = t0Var.x;
        t0Var2.y = t0Var.y;
        s0 a3 = t0Var2.a();
        a3.a = t0Var.a;
        a3.b = t0Var.b;
        a3.c = t0Var.c;
        a3.d = t0Var.d;
        a3.e = t0Var.e;
        a3.f = z10 ? t0Var.f : -1;
        a3.g = z10 ? t0Var.h : -1;
        a3.h = a2;
        a3.m = t0Var.x;
        a3.k = t0Var.w;
        a3.j = t0Var.v;
        a3.l = t0Var.y;
        if (g10 == 2) {
            a3.t = t0Var.G;
            a3.u = t0Var.H;
            a3.v = t0Var.I;
        }
        if (str2 != null) {
            a3.o = str2;
        }
        int i9 = t0Var.O;
        if (i9 != -1 && g10 == 1) {
            a3.B = i9;
        }
        z3.c cVar = t0Var.s;
        if (cVar != null) {
            z3.c cVar2 = t0Var2.s;
            if (cVar2 != null) {
                cVar = cVar2.a(cVar);
            }
            a3.i = cVar;
        }
        return new t0(a3);
    }

    public static int t(int i9) {
        if (i9 == 1) {
            return 2;
        }
        if (i9 != 2) {
            return i9 != 3 ? 0 : 1;
        }
        return 3;
    }

    public final boolean A() {
        return this.c0 != -9223372036854775807L;
    }

    @Override // m3.m
    public final void B() {
        this.g0 = true;
        this.D.post(this.C);
    }

    public final void C() {
        if (!this.T && this.W == null && this.O) {
            int i9 = 0;
            for (q qVar : this.H) {
                if (qVar.t() == null) {
                    return;
                }
            }
            j1 j1Var = this.U;
            if (j1Var != null) {
                int i10 = j1Var.a;
                int[] iArr = new int[i10];
                this.W = iArr;
                Arrays.fill(iArr, -1);
                for (int i11 = 0; i11 < i10; i11++) {
                    int i12 = 0;
                    while (true) {
                        q[] qVarArr = this.H;
                        if (i12 < qVarArr.length) {
                            t0 t10 = qVarArr[i12].t();
                            d5.a.j(t10);
                            t0 t0Var = this.U.a(i11).d[0];
                            String str = t10.B;
                            String str2 = t0Var.B;
                            int g10 = d5.q.g(str);
                            if (g10 == 3) {
                                if (f0.a(str, str2)) {
                                    if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || t10.T == t0Var.T) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i12++;
                            } else if (g10 == d5.q.g(str2)) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    this.W[i11] = i12;
                }
                ArrayList arrayList = this.E;
                int size = arrayList.size();
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((n) obj).b();
                }
                return;
            }
            int length = this.H.length;
            int i13 = 0;
            int i14 = -2;
            int i15 = -1;
            while (true) {
                int i16 = 1;
                if (i13 >= length) {
                    break;
                }
                t0 t11 = this.H[i13].t();
                d5.a.j(t11);
                String str3 = t11.B;
                if (d5.q.j(str3)) {
                    i16 = 2;
                } else if (!d5.q.h(str3)) {
                    i16 = d5.q.i(str3) ? 3 : -2;
                }
                if (t(i16) > t(i14)) {
                    i15 = i13;
                    i14 = i16;
                } else if (i16 == i14 && i15 != -1) {
                    i15 = -1;
                }
                i13++;
            }
            i1 i1Var = this.d.h;
            int i17 = i1Var.a;
            this.X = -1;
            this.W = new int[length];
            for (int i18 = 0; i18 < length; i18++) {
                this.W[i18] = i18;
            }
            i1[] i1VarArr = new i1[length];
            int i19 = 0;
            while (i19 < length) {
                t0 t12 = this.H[i19].t();
                d5.a.j(t12);
                String str4 = this.a;
                t0 t0Var2 = this.f;
                if (i19 == i15) {
                    t0[] t0VarArr = new t0[i17];
                    for (int i20 = 0; i20 < i17; i20++) {
                        t0 t0Var3 = i1Var.d[i20];
                        if (i14 == 1 && t0Var2 != null) {
                            t0Var3 = t0Var3.c(t0Var2);
                        }
                        t0VarArr[i20] = i17 == 1 ? t12.c(t0Var3) : p(t0Var3, t12, true);
                    }
                    i1VarArr[i19] = new i1(str4, t0VarArr);
                    this.X = i19;
                } else {
                    if (i14 != 2 || !d5.q.h(t12.B)) {
                        t0Var2 = null;
                    }
                    StringBuilder e10 = ta.b.e(str4, ":muxed:");
                    e10.append(i19 < i15 ? i19 : i19 - 1);
                    i1VarArr[i19] = new i1(e10.toString(), p(t0Var2, t12, false));
                }
                i19++;
            }
            this.U = l(i1VarArr);
            d5.a.i(this.V == null);
            this.V = Collections.EMPTY_SET;
            this.P = true;
            this.c.g();
        }
    }

    public final void D() {
        this.s.a();
        i iVar = this.d;
        j4.b bVar = iVar.n;
        if (bVar != null) {
            throw bVar;
        }
        Uri uri = iVar.o;
        if (uri == null || !iVar.s) {
            return;
        }
        p4.b bVar2 = (p4.b) iVar.g.d.get(uri);
        bVar2.b.a();
        IOException iOException = bVar2.s;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void E(i1[] i1VarArr, int... iArr) {
        this.U = l(i1VarArr);
        this.V = new HashSet();
        for (int i9 : iArr) {
            this.V.add(this.U.a(i9));
        }
        this.X = 0;
        this.D.post(new m2(this.c, 2));
        this.P = true;
    }

    public final void F() {
        for (q qVar : this.H) {
            qVar.A(this.d0);
        }
        this.d0 = false;
    }

    public final boolean G(long j10, boolean z10) {
        int i9;
        this.b0 = j10;
        if (A()) {
            this.c0 = j10;
            return true;
        }
        if (this.O && !z10) {
            int length = this.H.length;
            while (i9 < length) {
                i9 = (this.H[i9].D(j10, false) || (!this.a0[i9] && this.Y)) ? i9 + 1 : 0;
            }
            return false;
        }
        this.c0 = j10;
        this.f0 = false;
        this.y.clear();
        q0 q0Var = this.s;
        if (!q0Var.d()) {
            q0Var.c = null;
            F();
            return true;
        }
        if (this.O) {
            for (q qVar : this.H) {
                qVar.i();
            }
        }
        q0Var.b();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [o4.q[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o4.q[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [m3.w] */
    /* JADX WARN: Type inference failed for: r5v4, types: [j4.a1, o4.q] */
    /* JADX WARN: Type inference failed for: r5v6, types: [m3.j] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // m3.m
    public final w I(int i9, int i10) {
        Integer valueOf = Integer.valueOf(i10);
        Set set = k0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.J;
        SparseIntArray sparseIntArray = this.K;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            d5.a.f(set.contains(Integer.valueOf(i10)));
            int i11 = sparseIntArray.get(i10, -1);
            if (i11 != -1) {
                if (hashSet.add(Integer.valueOf(i10))) {
                    this.I[i11] = i9;
                }
                r52 = this.I[i11] == i9 ? this.H[i11] : j(i9, i10);
            }
        } else {
            int i12 = 0;
            while (true) {
                ?? r12 = this.H;
                if (i12 >= r12.length) {
                    break;
                }
                if (this.I[i12] == i9) {
                    r52 = r12[i12];
                    break;
                }
                i12++;
            }
        }
        if (r52 == 0) {
            if (this.g0) {
                return j(i9, i10);
            }
            int length = this.H.length;
            boolean z10 = i10 == 1 || i10 == 2;
            r52 = new q(this.e, this.h, this.n, this.F);
            r52.t = this.b0;
            if (z10) {
                r52.I = this.i0;
                r52.z = true;
            }
            long j10 = this.h0;
            if (r52.F != j10) {
                r52.F = j10;
                r52.z = true;
            }
            k kVar = this.j0;
            if (kVar != null) {
                r52.C = kVar.v;
            }
            r52.f = this;
            int i13 = length + 1;
            int[] copyOf = Arrays.copyOf(this.I, i13);
            this.I = copyOf;
            copyOf[length] = i9;
            q[] qVarArr = this.H;
            int i14 = f0.a;
            ?? copyOf2 = Arrays.copyOf(qVarArr, qVarArr.length + 1);
            copyOf2[qVarArr.length] = r52;
            this.H = (q[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.a0, i13);
            this.a0 = copyOf3;
            copyOf3[length] = z10;
            this.Y |= z10;
            hashSet.add(Integer.valueOf(i10));
            sparseIntArray.append(i10, length);
            if (t(i10) > t(this.M)) {
                this.N = length;
                this.M = i10;
            }
            this.Z = Arrays.copyOf(this.Z, i13);
        }
        if (i10 != 5) {
            return r52;
        }
        if (this.L == null) {
            this.L = new p(r52, this.w);
        }
        return this.L;
    }

    @Override // j4.z0
    public final void a() {
        this.D.post(this.B);
    }

    @Override // j4.d1
    public final boolean b() {
        return this.s.d();
    }

    @Override // com.google.android.exoplayer2.upstream.o0
    public final void c() {
        for (q qVar : this.H) {
            qVar.A(true);
            l3.e eVar = qVar.h;
            if (eVar != null) {
                eVar.k(qVar.e);
                qVar.h = null;
                qVar.g = null;
            }
        }
    }

    @Override // j4.d1
    public final long d() {
        if (A()) {
            return this.c0;
        }
        if (this.f0) {
            return Long.MIN_VALUE;
        }
        return s().n;
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final void e(n0 n0Var, long j10, long j11, boolean z10) {
        l4.e eVar = (l4.e) n0Var;
        this.G = null;
        long j12 = eVar.a;
        Uri uri = eVar.r.c;
        j4.q qVar = new j4.q();
        this.r.getClass();
        this.v.d(qVar, eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        if (z10) {
            return;
        }
        if (A() || this.Q == 0) {
            F();
        }
        if (this.Q > 0) {
            this.c.c(this);
        }
    }

    public final void f() {
        d5.a.i(this.P);
        this.U.getClass();
        this.V.getClass();
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final k0 h(n0 n0Var, IOException iOException, int i9) {
        boolean z10;
        k0 k0Var;
        int i10;
        l4.e eVar = (l4.e) n0Var;
        boolean z11 = eVar instanceof k;
        if (z11 && !((k) eVar).W && (iOException instanceof com.google.android.exoplayer2.upstream.h0) && ((i10 = ((com.google.android.exoplayer2.upstream.h0) iOException).d) == 410 || i10 == 404)) {
            return q0.d;
        }
        long j10 = eVar.r.b;
        Uri uri = eVar.r.c;
        j4.q qVar = new j4.q();
        f0.S(eVar.h);
        f0.S(eVar.n);
        n2.w wVar = new n2.w(iOException, i9, 1);
        i iVar = this.d;
        j0 a2 = g0.a(iVar.q);
        this.r.getClass();
        k0 k32 = v9.d.k3(a2, wVar);
        if (k32 == null || k32.a != 2) {
            z10 = false;
        } else {
            long j11 = k32.b;
            b5.t tVar = iVar.q;
            z10 = tVar.e(tVar.u(iVar.h.a(eVar.d)), j11);
        }
        if (z10) {
            if (z11 && j10 == 0) {
                ArrayList arrayList = this.y;
                d5.a.i(((k) e2.c.k(1, arrayList)) == eVar);
                if (arrayList.isEmpty()) {
                    this.c0 = this.b0;
                } else {
                    ((k) o8.l.g(arrayList)).V = true;
                }
            }
            k0Var = q0.e;
        } else {
            long m32 = v9.d.m3(wVar);
            k0Var = m32 != -9223372036854775807L ? new k0(0, m32, false) : q0.f;
        }
        k0 k0Var2 = k0Var;
        boolean a3 = k0Var2.a();
        this.v.h(qVar, eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a3);
        if (!a3) {
            this.G = null;
        }
        if (z10) {
            if (!this.P) {
                n(this.b0);
                return k0Var2;
            }
            this.c.c(this);
        }
        return k0Var2;
    }

    public final j1 l(i1[] i1VarArr) {
        for (int i9 = 0; i9 < i1VarArr.length; i9++) {
            i1 i1Var = i1VarArr[i9];
            t0[] t0VarArr = new t0[i1Var.a];
            for (int i10 = 0; i10 < i1Var.a; i10++) {
                t0 t0Var = i1Var.d[i10];
                int G = this.h.G(t0Var);
                s0 a2 = t0Var.a();
                a2.J = G;
                t0VarArr[i10] = new t0(a2);
            }
            i1VarArr[i9] = new i1(i1Var.b, t0VarArr);
        }
        return new j1(i1VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.upstream.l0
    public final void m(n0 n0Var, long j10, long j11) {
        l4.e eVar = (l4.e) n0Var;
        this.G = null;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            byte[] bArr = eVar2.s;
            i iVar = this.d;
            iVar.m = bArr;
            n2.p pVar = iVar.j;
            Uri uri = eVar2.b.a;
            byte[] bArr2 = eVar2.w;
            bArr2.getClass();
            d dVar = (d) pVar.b;
            uri.getClass();
        }
        long j12 = eVar.a;
        Uri uri2 = eVar.r.c;
        j4.q qVar = new j4.q();
        this.r.getClass();
        this.v.f(qVar, eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        if (this.P) {
            this.c.c(this);
        } else {
            n(this.b0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x02e1, code lost:
    
        if (r27 < r4.n) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0237  */
    @Override // j4.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(long j10) {
        long max;
        List list;
        long j11;
        androidx.activity.o oVar;
        int i9;
        androidx.activity.o oVar2;
        k kVar;
        long j12;
        i iVar;
        int i10;
        int i11;
        Uri uri;
        h hVar;
        e d;
        long j13;
        boolean z10;
        List list2;
        boolean z11;
        n2.p pVar;
        byte[] bArr;
        q0 q0Var;
        boolean z12;
        byte[] bArr2;
        com.google.android.exoplayer2.upstream.m mVar;
        p4.g gVar;
        androidx.activity.o oVar3;
        com.google.android.exoplayer2.upstream.q qVar;
        com.google.android.exoplayer2.upstream.m mVar2;
        boolean z13;
        e4.i iVar2;
        y yVar;
        b bVar;
        e0 e0Var;
        byte[] bArr3;
        String str;
        boolean z14;
        if (this.f0) {
            return false;
        }
        q0 q0Var2 = this.s;
        if (q0Var2.d() || q0Var2.c()) {
            return false;
        }
        if (A()) {
            list = Collections.EMPTY_LIST;
            max = this.c0;
            for (q qVar2 : this.H) {
                qVar2.t = this.c0;
            }
        } else {
            k s10 = s();
            max = s10.T ? s10.n : Math.max(this.b0, s10.h);
            list = this.A;
        }
        List list3 = list;
        androidx.activity.o oVar4 = this.x;
        oVar4.b = null;
        oVar4.a = false;
        oVar4.c = null;
        boolean z15 = this.P || !list3.isEmpty();
        i iVar3 = this.d;
        n2.p pVar2 = iVar3.j;
        Uri[] uriArr = iVar3.e;
        p4.c cVar = iVar3.g;
        k kVar2 = list3.isEmpty() ? null : (k) o8.l.g(list3);
        int a2 = kVar2 == null ? -1 : iVar3.h.a(kVar2.d);
        long j14 = max - j10;
        long j15 = iVar3.r;
        long j16 = j15 != -9223372036854775807L ? j15 - j10 : -9223372036854775807L;
        if (kVar2 == null) {
            j11 = max;
            oVar = oVar4;
            i9 = a2;
        } else if (iVar3.p) {
            j11 = max;
            i9 = a2;
            oVar = oVar4;
        } else {
            i9 = a2;
            oVar = oVar4;
            long j17 = kVar2.n - kVar2.h;
            j11 = max;
            j14 = Math.max(0L, j14 - j17);
            if (j16 != -9223372036854775807L) {
                j16 = Math.max(0L, j16 - j17);
            }
        }
        long j18 = j11;
        k kVar3 = kVar2;
        int i12 = i9;
        iVar3.q.m(j10, j14, j16, list3, iVar3.a(kVar2, j18));
        int n10 = iVar3.q.n();
        boolean z16 = i12 != n10;
        Uri uri2 = uriArr[n10];
        if (cVar.c(uri2)) {
            oVar2 = oVar;
            p4.j a3 = cVar.a(uri2, true);
            a3.getClass();
            long j19 = a3.h;
            iVar3.p = a3.c;
            if (a3.o) {
                kVar = kVar3;
                j12 = -9223372036854775807L;
            } else {
                kVar = kVar3;
                j12 = (a3.u + j19) - cVar.y;
            }
            iVar3.r = j12;
            boolean z17 = z16;
            long j20 = j19 - cVar.y;
            k kVar4 = kVar;
            Pair c10 = iVar3.c(kVar4, z17, a3, j20, j18);
            long longValue = ((Long) c10.first).longValue();
            int intValue = ((Integer) c10.second).intValue();
            if (longValue >= a3.k || kVar4 == null || !z17) {
                iVar = iVar3;
                i10 = n10;
                i11 = intValue;
                uri = uri2;
            } else {
                uri = uriArr[i12];
                a3 = cVar.a(uri, true);
                a3.getClass();
                j20 = a3.h - cVar.y;
                iVar = iVar3;
                Pair c11 = iVar.c(kVar4, false, a3, j20, j18);
                longValue = ((Long) c11.first).longValue();
                i11 = ((Integer) c11.second).intValue();
                i10 = i12;
            }
            long j21 = j20;
            long j22 = longValue;
            String str2 = a3.a;
            boolean z18 = a3.c;
            long j23 = a3.k;
            z zVar = a3.r;
            if (j22 < j23) {
                iVar.n = new j4.b();
            } else {
                z zVar2 = a3.s;
                boolean z19 = z18;
                int i13 = (int) (j22 - j23);
                if (i13 == zVar.size()) {
                    if (i11 == -1) {
                        i11 = 0;
                    }
                    if (i11 < zVar2.size()) {
                        hVar = new h((p4.h) zVar2.get(i11), j22, i11);
                        if (hVar == null) {
                            if (!a3.o) {
                                oVar2.c = uri;
                                iVar.s &= uri.equals(iVar.o);
                                iVar.o = uri;
                            } else if (z15 || zVar.isEmpty()) {
                                oVar2.a = true;
                            } else {
                                hVar = new h((p4.h) o8.l.g(zVar), (j23 + zVar.size()) - 1, -1);
                            }
                        }
                        boolean z20 = hVar.d;
                        p4.h hVar2 = hVar.a;
                        iVar.s = false;
                        iVar.o = null;
                        p4.g gVar2 = hVar2.b;
                        long j24 = hVar2.e;
                        Uri H = (gVar2 != null || (str = gVar2.h) == null) ? null : d5.a.H(str2, str);
                        d = iVar.d(H, i10);
                        oVar2.b = d;
                        if (d == null) {
                            String str3 = hVar2.h;
                            Uri H2 = str3 == null ? null : d5.a.H(str2, str3);
                            e d9 = iVar.d(H2, i10);
                            oVar2.b = d9;
                            if (d9 == null) {
                                if (kVar4 == null) {
                                    AtomicInteger atomicInteger = k.X;
                                } else if (!uri.equals(kVar4.x) || !kVar4.T) {
                                    long j25 = j21 + j24;
                                    if (hVar2 instanceof p4.e) {
                                        z19 = ((p4.e) hVar2).w || (hVar.c == 0 && z19);
                                    }
                                    if (z19) {
                                        j13 = j24;
                                    } else {
                                        j13 = j24;
                                    }
                                    z10 = true;
                                    if (z10 || !z20) {
                                        j jVar = iVar.a;
                                        com.google.android.exoplayer2.upstream.m mVar3 = iVar.b;
                                        t0 t0Var = iVar.f[i10];
                                        List list4 = iVar.i;
                                        int p6 = iVar.q.p();
                                        Object r10 = iVar.q.r();
                                        boolean z21 = iVar.l;
                                        c0 c0Var = iVar.d;
                                        if (H2 != null) {
                                            pVar2.getClass();
                                            list2 = list4;
                                            z11 = z21;
                                            pVar = pVar2;
                                            bArr = null;
                                        } else {
                                            list2 = list4;
                                            z11 = z21;
                                            pVar = pVar2;
                                            bArr = (byte[]) ((d) pVar.b).get(H2);
                                        }
                                        byte[] bArr4 = H != null ? null : (byte[]) ((d) pVar.b).get(H);
                                        i3.l lVar = iVar.k;
                                        AtomicInteger atomicInteger2 = k.X;
                                        Map map = Collections.EMPTY_MAP;
                                        Uri H3 = d5.a.H(str2, hVar2.a);
                                        q0Var = q0Var2;
                                        long j26 = hVar2.r;
                                        long j27 = hVar2.s;
                                        int i14 = !z20 ? 8 : 0;
                                        d5.a.k(H3, "The uri must be set.");
                                        com.google.android.exoplayer2.upstream.q qVar3 = new com.google.android.exoplayer2.upstream.q(H3, 1, null, map, j26, j27, null, i14);
                                        z12 = bArr == null;
                                        if (z12) {
                                            bArr2 = null;
                                        } else {
                                            String str4 = hVar2.n;
                                            str4.getClass();
                                            bArr2 = k.e(str4);
                                        }
                                        if (bArr == null) {
                                            bArr2.getClass();
                                            mVar = new a(mVar3, bArr, bArr2);
                                        } else {
                                            mVar = mVar3;
                                        }
                                        gVar = hVar2.b;
                                        if (gVar == null) {
                                            boolean z22 = bArr4 != null;
                                            if (z22) {
                                                String str5 = gVar.n;
                                                str5.getClass();
                                                bArr3 = k.e(str5);
                                            } else {
                                                bArr3 = null;
                                            }
                                            oVar3 = oVar2;
                                            boolean z23 = z22;
                                            com.google.android.exoplayer2.upstream.q qVar4 = new com.google.android.exoplayer2.upstream.q(d5.a.H(str2, gVar.a), 1, null, map, gVar.r, gVar.s, null, 0);
                                            if (bArr4 != null) {
                                                bArr3.getClass();
                                                mVar3 = new a(mVar3, bArr4, bArr3);
                                            }
                                            z13 = z23;
                                            mVar2 = mVar3;
                                            qVar = qVar4;
                                        } else {
                                            oVar3 = oVar2;
                                            qVar = null;
                                            mVar2 = null;
                                            z13 = false;
                                        }
                                        long j28 = j21 + j13;
                                        long j29 = j28 + hVar2.c;
                                        int i15 = a3.j + hVar2.d;
                                        if (kVar4 == null) {
                                            com.google.android.exoplayer2.upstream.q qVar5 = kVar4.C;
                                            boolean z24 = qVar == qVar5 || (qVar != null && qVar5 != null && qVar.a.equals(qVar5.a) && qVar.e == qVar5.e);
                                            boolean z25 = uri.equals(kVar4.x) && kVar4.T;
                                            iVar2 = kVar4.K;
                                            yVar = kVar4.L;
                                            bVar = (z24 && z25 && !kVar4.V && kVar4.w == i15) ? kVar4.O : null;
                                        } else {
                                            iVar2 = new e4.i(null);
                                            yVar = new y(10);
                                            bVar = null;
                                        }
                                        e4.i iVar4 = iVar2;
                                        y yVar2 = yVar;
                                        long j30 = hVar.b;
                                        int i16 = hVar.c;
                                        boolean z26 = !z20;
                                        boolean z27 = hVar2.v;
                                        SparseArray sparseArray = (SparseArray) c0Var.b;
                                        e0Var = (e0) sparseArray.get(i15);
                                        if (e0Var == null) {
                                            e0Var = new e0(9223372036854775806L);
                                            sparseArray.put(i15, e0Var);
                                        }
                                        oVar2 = oVar3;
                                        oVar2.b = new k(jVar, mVar, qVar3, t0Var, z12, mVar2, qVar, z13, uri, list2, p6, r10, j28, j29, j30, i16, z26, i15, z27, z11, e0Var, hVar2.f, bVar, iVar4, yVar2, z10, lVar);
                                        z14 = oVar2.a;
                                        l4.e eVar = (l4.e) oVar2.b;
                                        Uri uri3 = (Uri) oVar2.c;
                                        if (z14) {
                                            this.c0 = -9223372036854775807L;
                                            this.f0 = true;
                                            return true;
                                        }
                                        if (eVar == null) {
                                            if (uri3 == null) {
                                                return false;
                                            }
                                            p4.b bVar2 = (p4.b) ((l) this.c.b).b.d.get(uri3);
                                            bVar2.c(bVar2.a);
                                            return false;
                                        }
                                        if (eVar instanceof k) {
                                            k kVar5 = (k) eVar;
                                            this.j0 = kVar5;
                                            this.R = kVar5.d;
                                            this.c0 = -9223372036854775807L;
                                            this.y.add(kVar5);
                                            x xVar = z.b;
                                            o8.l.a(4, "initialCapacity");
                                            Object[] objArr = new Object[4];
                                            q[] qVarArr = this.H;
                                            int length = qVarArr.length;
                                            int i17 = 0;
                                            int i18 = 0;
                                            while (i18 < length) {
                                                q qVar6 = qVarArr[i18];
                                                Integer valueOf = Integer.valueOf(qVar6.q + qVar6.p);
                                                int i19 = i17 + 1;
                                                if (objArr.length < i19) {
                                                    objArr = Arrays.copyOf(objArr, o8.w.d(objArr.length, i19));
                                                }
                                                objArr[i17] = valueOf;
                                                i18++;
                                                i17 = i19;
                                            }
                                            o8.l0 s11 = z.s(i17, objArr);
                                            kVar5.P = this;
                                            kVar5.U = s11;
                                            for (q qVar7 : this.H) {
                                                qVar7.getClass();
                                                qVar7.C = kVar5.v;
                                                if (kVar5.y) {
                                                    qVar7.G = true;
                                                }
                                            }
                                        }
                                        this.G = eVar;
                                        q0Var.f(eVar, this, this.r.l3(eVar.c));
                                        this.v.k(new j4.q(eVar.b), eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
                                        return true;
                                    }
                                }
                                j13 = j24;
                                z10 = false;
                                if (z10) {
                                }
                                j jVar2 = iVar.a;
                                com.google.android.exoplayer2.upstream.m mVar32 = iVar.b;
                                t0 t0Var2 = iVar.f[i10];
                                List list42 = iVar.i;
                                int p62 = iVar.q.p();
                                Object r102 = iVar.q.r();
                                boolean z212 = iVar.l;
                                c0 c0Var2 = iVar.d;
                                if (H2 != null) {
                                }
                                if (H != null) {
                                }
                                i3.l lVar2 = iVar.k;
                                AtomicInteger atomicInteger22 = k.X;
                                Map map2 = Collections.EMPTY_MAP;
                                Uri H32 = d5.a.H(str2, hVar2.a);
                                q0Var = q0Var2;
                                long j262 = hVar2.r;
                                long j272 = hVar2.s;
                                if (!z20) {
                                }
                                d5.a.k(H32, "The uri must be set.");
                                com.google.android.exoplayer2.upstream.q qVar32 = new com.google.android.exoplayer2.upstream.q(H32, 1, null, map2, j262, j272, null, i14);
                                if (bArr == null) {
                                }
                                if (z12) {
                                }
                                if (bArr == null) {
                                }
                                gVar = hVar2.b;
                                if (gVar == null) {
                                }
                                long j282 = j21 + j13;
                                long j292 = j282 + hVar2.c;
                                int i152 = a3.j + hVar2.d;
                                if (kVar4 == null) {
                                }
                                e4.i iVar42 = iVar2;
                                y yVar22 = yVar;
                                long j302 = hVar.b;
                                int i162 = hVar.c;
                                boolean z262 = !z20;
                                boolean z272 = hVar2.v;
                                SparseArray sparseArray2 = (SparseArray) c0Var2.b;
                                e0Var = (e0) sparseArray2.get(i152);
                                if (e0Var == null) {
                                }
                                oVar2 = oVar3;
                                oVar2.b = new k(jVar2, mVar, qVar32, t0Var2, z12, mVar2, qVar, z13, uri, list2, p62, r102, j282, j292, j302, i162, z262, i152, z272, z11, e0Var, hVar2.f, bVar, iVar42, yVar22, z10, lVar2);
                                z14 = oVar2.a;
                                l4.e eVar2 = (l4.e) oVar2.b;
                                Uri uri32 = (Uri) oVar2.c;
                                if (z14) {
                                }
                            }
                        }
                    }
                    hVar = null;
                    if (hVar == null) {
                    }
                    boolean z202 = hVar.d;
                    p4.h hVar22 = hVar.a;
                    iVar.s = false;
                    iVar.o = null;
                    p4.g gVar22 = hVar22.b;
                    long j242 = hVar22.e;
                    if (gVar22 != null) {
                    }
                    d = iVar.d(H, i10);
                    oVar2.b = d;
                    if (d == null) {
                    }
                } else {
                    p4.g gVar3 = (p4.g) zVar.get(i13);
                    if (i11 == -1) {
                        hVar = new h(gVar3, j22, -1);
                    } else if (i11 < gVar3.x.size()) {
                        hVar = new h((p4.h) gVar3.x.get(i11), j22, i11);
                    } else {
                        int i20 = i13 + 1;
                        if (i20 < zVar.size()) {
                            hVar = new h((p4.h) zVar.get(i20), j22 + 1, -1);
                        } else {
                            if (!zVar2.isEmpty()) {
                                hVar = new h((p4.h) zVar2.get(0), j22 + 1, 0);
                            }
                            hVar = null;
                        }
                    }
                    if (hVar == null) {
                    }
                    boolean z2022 = hVar.d;
                    p4.h hVar222 = hVar.a;
                    iVar.s = false;
                    iVar.o = null;
                    p4.g gVar222 = hVar222.b;
                    long j2422 = hVar222.e;
                    if (gVar222 != null) {
                    }
                    d = iVar.d(H, i10);
                    oVar2.b = d;
                    if (d == null) {
                    }
                }
            }
        } else {
            oVar2 = oVar;
            oVar2.c = uri2;
            iVar3.s &= uri2.equals(iVar3.o);
            iVar3.o = uri2;
        }
        q0Var = q0Var2;
        z14 = oVar2.a;
        l4.e eVar22 = (l4.e) oVar2.b;
        Uri uri322 = (Uri) oVar2.c;
        if (z14) {
        }
    }

    public final void r(int i9) {
        ArrayList arrayList;
        d5.a.i(!this.s.d());
        int i10 = i9;
        loop0: while (true) {
            arrayList = this.y;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            }
            int i11 = i10;
            while (true) {
                if (i11 >= arrayList.size()) {
                    k kVar = (k) arrayList.get(i10);
                    for (int i12 = 0; i12 < this.H.length; i12++) {
                        if (this.H[i12].q() > kVar.f(i12)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((k) arrayList.get(i11)).y) {
                    break;
                } else {
                    i11++;
                }
            }
            i10++;
        }
        if (i10 == -1) {
            return;
        }
        long j10 = s().n;
        k kVar2 = (k) arrayList.get(i10);
        f0.N(i10, arrayList.size(), arrayList);
        for (int i13 = 0; i13 < this.H.length; i13++) {
            this.H[i13].k(kVar2.f(i13));
        }
        if (arrayList.isEmpty()) {
            this.c0 = this.b0;
        } else {
            ((k) o8.l.g(arrayList)).V = true;
        }
        this.f0 = false;
        int i14 = this.M;
        long j11 = kVar2.h;
        h0 h0Var = this.v;
        h0Var.m(new j4.y(1, i14, null, 3, null, h0Var.a(j11), h0Var.a(j10)));
    }

    public final k s() {
        return (k) r0.j(1, this.y);
    }

    @Override // j4.d1
    public final long v() {
        if (this.f0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.c0;
        }
        long j10 = this.b0;
        k s10 = s();
        if (!s10.T) {
            ArrayList arrayList = this.y;
            s10 = arrayList.size() > 1 ? (k) r0.j(2, arrayList) : null;
        }
        if (s10 != null) {
            j10 = Math.max(j10, s10.n);
        }
        if (this.O) {
            for (q qVar : this.H) {
                j10 = Math.max(j10, qVar.n());
            }
        }
        return j10;
    }

    @Override // j4.d1
    public final void z(long j10) {
        q0 q0Var = this.s;
        if (q0Var.c() || A()) {
            return;
        }
        boolean d = q0Var.d();
        i iVar = this.d;
        List list = this.A;
        if (d) {
            this.G.getClass();
            if (iVar.n != null ? false : iVar.q.c(j10, this.G, list)) {
                q0Var.b();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && iVar.b((k) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            r(size);
        }
        int size2 = (iVar.n != null || iVar.q.length() < 2) ? list.size() : iVar.q.k(j10, list);
        if (size2 < this.y.size()) {
            r(size2);
        }
    }

    @Override // m3.m
    public final void y(m3.t tVar) {
    }
}
