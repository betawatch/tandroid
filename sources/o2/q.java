package o2;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import b2.l1;
import b2.p0;
import b2.r0;
import c3.h0;
import c5.b0;
import e2.d0;
import e2.v;
import e9.a1;
import e9.f0;
import e9.i0;
import g2.x;
import gg.v1;
import i2.q0;
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
import m.g3;
import u2.b1;
import u2.f1;
import u2.q1;
import u2.u;
import w7.f8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class q implements y2.i, y2.l, f1, c3.q, b1 {
    public static final Set o0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final List E;
    public final n F;
    public final n G;
    public final Handler H;
    public final ArrayList I;
    public final Map J;
    public v2.e K;
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
    public b2.s V;
    public b2.s W;
    public boolean X;
    public q1 Y;
    public Set Z;
    public final String a;
    public int[] a0;
    public final int b;
    public int b0;
    public final o0.b c;
    public boolean c0;
    public final i d;
    public boolean[] d0;
    public final y2.d e;
    public boolean[] e0;
    public final b2.s f;
    public long f0;
    public long g0;
    public final n2.n h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public long l0;
    public b2.o m0;
    public final n2.j n;
    public j n0;
    public final rb.a r;
    public final y2.n s = new y2.n("Loader:HlsSampleStreamWrapper");
    public final a5.a v;
    public final int w;
    public final androidx.activity.o x;
    public final ArrayList y;

    /* JADX WARN: Type inference failed for: r1v12, types: [o2.n] */
    /* JADX WARN: Type inference failed for: r1v13, types: [o2.n] */
    public q(String str, int i10, o0.b bVar, i iVar, Map map, y2.d dVar, long j3, b2.s sVar, n2.n nVar, n2.j jVar, rb.a aVar, a5.a aVar2, int i11) {
        this.a = str;
        this.b = i10;
        this.c = bVar;
        this.d = iVar;
        this.J = map;
        this.e = dVar;
        this.f = sVar;
        this.h = nVar;
        this.n = jVar;
        this.r = aVar;
        this.v = aVar2;
        this.w = i11;
        androidx.activity.o oVar = new androidx.activity.o();
        oVar.c = null;
        final int i12 = 0;
        oVar.b = false;
        oVar.d = null;
        this.x = oVar;
        this.M = new int[0];
        Set set = o0;
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
                        this.b.D();
                        break;
                    default:
                        q qVar = this.b;
                        qVar.S = true;
                        qVar.D();
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
                        this.b.D();
                        break;
                    default:
                        q qVar = this.b;
                        qVar.S = true;
                        qVar.D();
                        break;
                }
            }
        };
        this.H = d0.o(null);
        this.f0 = j3;
        this.g0 = j3;
    }

    public static c3.n t(int i10, int i11) {
        e2.a.n("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new c3.n();
    }

    public static b2.s w(b2.s sVar, b2.s sVar2, boolean z10) {
        String b10;
        if (sVar == null) {
            return sVar2;
        }
        String str = sVar.k;
        String str2 = sVar2.r;
        int h = r0.h(str2);
        if (d0.u(h, str) == 1) {
            b10 = d0.v(h, str);
            str2 = r0.d(b10);
        } else {
            b10 = r0.b(str, str2);
        }
        sVar2.m = sVar.m;
        sVar2.n = sVar.n;
        sVar2.o = sVar.o;
        sVar2.p = sVar.p;
        b2.r a2 = sVar2.a();
        a2.a = sVar.a;
        a2.b = sVar.b;
        a2.c = i0.v(sVar.c);
        a2.d = sVar.d;
        a2.e = sVar.e;
        a2.f = sVar.f;
        a2.h = z10 ? sVar.h : -1;
        a2.i = z10 ? sVar.i : -1;
        a2.j = b10;
        a2.o = sVar.o;
        a2.m = sVar.n;
        a2.l = sVar.m;
        a2.n = sVar.p;
        if (h == 2) {
            a2.x = sVar.y;
            a2.y = sVar.z;
            a2.B = sVar.C;
        }
        if (str2 != null) {
            a2.q = r0.n(str2);
        }
        int i10 = sVar.J;
        if (i10 != -1 && h == 1) {
            a2.I = i10;
        }
        p0 p0Var = sVar.l;
        if (p0Var != null) {
            p0 p0Var2 = sVar2.l;
            if (p0Var2 != null) {
                p0Var = p0Var2.b(p0Var);
            }
            a2.k = p0Var;
        }
        return new b2.s(a2);
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

    @Override // c3.q
    public final void B() {
        this.k0 = true;
        this.H.post(this.G);
    }

    @Override // y2.i
    public final void C(y2.k kVar, long j3, long j10, boolean z10) {
        v2.e eVar = (v2.e) kVar;
        this.K = null;
        long j11 = eVar.a;
        Uri uri = eVar.r.c;
        u uVar = new u(j10);
        this.r.getClass();
        this.v.m(uVar, eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        if (z10) {
            return;
        }
        if (A() || this.U == 0) {
            H();
        }
        if (this.U > 0) {
            this.c.g(this);
        }
    }

    public final void D() {
        if (!this.X && this.a0 == null && this.S) {
            int i10 = 0;
            for (p pVar : this.L) {
                if (pVar.w() == null) {
                    return;
                }
            }
            q1 q1Var = this.Y;
            if (q1Var != null) {
                int i11 = q1Var.a;
                int[] iArr = new int[i11];
                this.a0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        p[] pVarArr = this.L;
                        if (i13 < pVarArr.length) {
                            b2.s w10 = pVarArr[i13].w();
                            e2.d.h(w10);
                            b2.s sVar = this.Y.a(i12).d[0];
                            String str = w10.r;
                            String str2 = sVar.r;
                            int h = r0.h(str);
                            if (h == 3) {
                                if (Objects.equals(str, str2)) {
                                    if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || w10.O == sVar.O) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i13++;
                            } else if (h == r0.h(str2)) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                    this.a0[i12] = i13;
                }
                ArrayList arrayList = this.I;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((m) obj).b();
                }
                return;
            }
            int length = this.L.length;
            int i14 = 0;
            int i15 = -2;
            int i16 = -1;
            while (true) {
                int i17 = 1;
                if (i14 >= length) {
                    break;
                }
                b2.s w11 = this.L[i14].w();
                e2.d.h(w11);
                String str3 = w11.r;
                if (r0.m(str3)) {
                    i17 = 2;
                } else if (!r0.i(str3)) {
                    i17 = r0.l(str3) ? 3 : -2;
                }
                if (z(i17) > z(i15)) {
                    i16 = i14;
                    i15 = i17;
                } else if (i17 == i15 && i16 != -1) {
                    i16 = -1;
                }
                i14++;
            }
            l1 l1Var = this.d.h;
            int i18 = l1Var.a;
            this.b0 = -1;
            this.a0 = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.a0[i19] = i19;
            }
            l1[] l1VarArr = new l1[length];
            int i20 = 0;
            while (i20 < length) {
                b2.s w12 = this.L[i20].w();
                e2.d.h(w12);
                String str4 = this.a;
                b2.s sVar2 = this.f;
                if (i20 == i16) {
                    b2.s[] sVarArr = new b2.s[i18];
                    for (int i21 = 0; i21 < i18; i21++) {
                        b2.s sVar3 = l1Var.d[i21];
                        if (i15 == 1 && sVar2 != null) {
                            sVar3 = sVar3.d(sVar2);
                        }
                        sVarArr[i21] = i18 == 1 ? w12.d(sVar3) : w(sVar3, w12, true);
                    }
                    l1VarArr[i20] = new l1(str4, sVarArr);
                    this.b0 = i20;
                } else {
                    if (i15 != 2 || !r0.i(w12.r)) {
                        sVar2 = null;
                    }
                    StringBuilder g10 = w.f.g(str4, ":muxed:");
                    g10.append(i20 < i16 ? i20 : i20 - 1);
                    l1VarArr[i20] = new l1(g10.toString(), w(sVar2, w12, false));
                }
                i20++;
            }
            this.Y = v(l1VarArr);
            e2.d.g(this.Z == null);
            this.Z = Collections.EMPTY_SET;
            this.T = true;
            this.c.A();
        }
    }

    public final void E() {
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
        p2.c cVar = iVar.g;
        p2.b bVar2 = (p2.b) cVar.d.get(iVar.o);
        bVar2.b.a();
        IOException iOException = bVar2.s;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void F(l1[] l1VarArr, int... iArr) {
        this.Y = v(l1VarArr);
        this.Z = new HashSet();
        for (int i10 : iArr) {
            this.Z.add(this.Y.a(i10));
        }
        this.b0 = 0;
        this.H.post(new v1(this.c, 23));
        this.T = true;
    }

    public final void H() {
        for (p pVar : this.L) {
            pVar.D(this.h0);
        }
        this.h0 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [o2.p[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o2.p[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [c3.h0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [o2.p, u2.c1] */
    /* JADX WARN: Type inference failed for: r5v6, types: [c3.n] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // c3.q
    public final h0 I(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i11);
        Set set = o0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.N;
        SparseIntArray sparseIntArray = this.O;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            e2.d.b(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.M[i12] = i10;
                }
                r52 = this.M[i12] == i10 ? this.L[i12] : t(i10, i11);
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
            if (this.k0) {
                return t(i10, i11);
            }
            int length = this.L.length;
            boolean z10 = i11 == 1 || i11 == 2;
            r52 = new p(this.e, this.h, this.n, this.J);
            r52.t = this.f0;
            if (z10) {
                r52.I = this.m0;
                r52.z = true;
            }
            long j3 = this.l0;
            if (r52.F != j3) {
                r52.F = j3;
                r52.z = true;
            }
            if (this.n0 != null) {
                r52.C = r6.v;
            }
            r52.f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.M, i14);
            this.M = copyOf;
            copyOf[length] = i10;
            p[] pVarArr = this.L;
            String str = d0.a;
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

    public final boolean J(long j3, boolean z10) {
        j jVar;
        boolean z11;
        boolean G;
        this.f0 = j3;
        if (A()) {
            this.g0 = j3;
            return true;
        }
        boolean z12 = this.d.q;
        ArrayList arrayList = this.y;
        if (z12) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                jVar = (j) arrayList.get(i10);
                if (jVar.h == j3) {
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
                    G = pVar.F(jVar.f(i11));
                } else {
                    long d = d();
                    G = pVar.G(j3, d == Long.MIN_VALUE || j3 < d);
                }
                if (!G && (this.e0[i11] || !this.c0)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.g0 = j3;
        this.j0 = false;
        arrayList.clear();
        y2.n nVar = this.s;
        if (!nVar.d()) {
            nVar.c = null;
            H();
            return true;
        }
        if (this.S) {
            for (p pVar2 : this.L) {
                pVar2.k();
            }
        }
        nVar.b();
        return true;
    }

    @Override // u2.b1
    public final void a() {
        this.H.post(this.F);
    }

    @Override // y2.l
    public final void b() {
        for (p pVar : this.L) {
            pVar.D(true);
            n2.g gVar = pVar.h;
            if (gVar != null) {
                gVar.a(pVar.e);
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
        e2.d.g(this.T);
        this.Y.getClass();
        this.Z.getClass();
    }

    public final boolean g(int i10) {
        int i11 = i10;
        while (true) {
            ArrayList arrayList = this.y;
            if (i11 >= arrayList.size()) {
                j jVar = (j) arrayList.get(i10);
                for (int i12 = 0; i12 < this.L.length; i12++) {
                    if (this.L[i12].t() > jVar.f(i12)) {
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

    @Override // y2.i
    public final k4.d k(y2.k kVar, long j3, long j10, IOException iOException, int i10) {
        boolean z10;
        k4.d dVar;
        int i11;
        v2.e eVar = (v2.e) kVar;
        boolean z11 = eVar instanceof j;
        if (z11 && !((j) eVar).g() && (iOException instanceof x) && ((i11 = ((x) iOException).d) == 410 || i11 == 404)) {
            return y2.n.d;
        }
        long j11 = eVar.r.b;
        Uri uri = eVar.r.c;
        u uVar = new u(j10);
        d0.e0(eVar.h);
        d0.e0(eVar.n);
        b0 b0Var = new b0(iOException, i10, 11);
        i iVar = this.d;
        y2.g a2 = f8.a(iVar.r);
        this.r.getClass();
        k4.d n32 = rb.a.n3(a2, b0Var);
        if (n32 == null || n32.a != 2) {
            z10 = false;
        } else {
            long j12 = n32.b;
            x2.r rVar = iVar.r;
            z10 = rVar.o(rVar.u(iVar.h.a(eVar.d)), j12);
        }
        if (z10) {
            if (z11 && j11 == 0) {
                ArrayList arrayList = this.y;
                e2.d.g(((j) hc.b.z(1, arrayList)) == eVar);
                if (arrayList.isEmpty()) {
                    this.g0 = this.f0;
                } else {
                    ((j) e9.q.l(arrayList)).Z = true;
                }
            }
            dVar = y2.n.e;
        } else {
            long p32 = rb.a.p3(b0Var);
            dVar = p32 != -9223372036854775807L ? new k4.d(0, p32, false) : y2.n.f;
        }
        k4.d dVar2 = dVar;
        boolean a10 = dVar2.a();
        this.v.p(uVar, eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, iOException, !a10);
        if (!a10) {
            this.K = null;
        }
        if (z10) {
            if (!this.T) {
                i2.p0 p0Var = new i2.p0();
                p0Var.a = this.f0;
                n(new q0(p0Var));
                return dVar2;
            }
            this.c.g(this);
        }
        return dVar2;
    }

    @Override // y2.i
    public final void l(y2.k kVar, long j3, long j10, int i10) {
        u uVar;
        v2.e eVar = (v2.e) kVar;
        if (i10 == 0) {
            long j11 = eVar.a;
            uVar = new u(eVar.b);
        } else {
            long j12 = eVar.a;
            Uri uri = eVar.r.c;
            uVar = new u(j10);
        }
        u uVar2 = uVar;
        this.v.r(uVar2, eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02dc  */
    @Override // u2.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(q0 q0Var) {
        long max;
        long j3;
        List list;
        androidx.activity.o oVar;
        long j10;
        long j11;
        long j12;
        androidx.activity.o oVar2;
        long j13;
        j jVar;
        p2.l lVar;
        Uri uri;
        i iVar;
        h d;
        long j14;
        boolean z10;
        List list2;
        boolean z11;
        g3 g3Var;
        byte[] bArr;
        y2.n nVar;
        boolean z12;
        byte[] bArr2;
        g2.h hVar;
        p2.i iVar2;
        androidx.activity.o oVar3;
        j2.k kVar;
        g2.m mVar;
        g2.h hVar2;
        boolean z13;
        q3.i iVar3;
        v vVar;
        b bVar;
        e2.b0 b0Var;
        byte[] bArr3;
        g2.h hVar3;
        String str;
        p2.b bVar2;
        if (this.j0) {
            return false;
        }
        y2.n nVar2 = this.s;
        if (nVar2.d() || nVar2.c()) {
            return false;
        }
        if (A()) {
            List list3 = Collections.EMPTY_LIST;
            max = this.g0;
            for (p pVar : this.L) {
                pVar.t = this.g0;
            }
            list = list3;
            j3 = max;
        } else {
            j y3 = y();
            boolean z14 = y3.X;
            long j15 = y3.h;
            if (z14 && y3.g()) {
                long j16 = y3.a0;
                max = j16 != -9223372036854775807L ? j15 + j16 : -9223372036854775807L;
            } else {
                max = Math.max(this.f0, j15);
            }
            long j17 = this.f0;
            boolean z15 = this.S;
            List list4 = this.E;
            if (z15) {
                for (p pVar2 : this.L) {
                    j17 = Math.max(j17, pVar2.r());
                }
            }
            j3 = j17;
            list = list4;
        }
        androidx.activity.o oVar4 = this.x;
        oVar4.c = null;
        oVar4.b = false;
        oVar4.d = null;
        boolean z16 = this.T || !list.isEmpty();
        i iVar4 = this.d;
        g3 g3Var2 = iVar4.j;
        Uri[] uriArr = iVar4.e;
        p2.c cVar = iVar4.g;
        j jVar2 = list.isEmpty() ? null : (j) e9.q.l(list);
        int a2 = jVar2 == null ? -1 : iVar4.h.a(jVar2.d);
        long j18 = q0Var.a;
        long j19 = max - j18;
        long j20 = iVar4.s;
        long j21 = j20 != -9223372036854775807L ? j20 - j18 : -9223372036854775807L;
        if (jVar2 == null || iVar4.q) {
            oVar = oVar4;
            j10 = j18;
        } else {
            oVar = oVar4;
            long j22 = jVar2.n - jVar2.h;
            j10 = j18;
            j19 = Math.max(0L, j19 - j22);
            if (j21 != -9223372036854775807L) {
                j21 = Math.max(0L, j21 - j22);
            }
        }
        long j23 = max;
        j jVar3 = jVar2;
        iVar4.r.k(j10, j19, j21, list, iVar4.a(jVar2, max));
        int l4 = iVar4.r.l();
        int i10 = a2;
        boolean z17 = a2 != l4;
        Uri uri2 = uriArr[l4];
        if (cVar.c(uri2)) {
            androidx.activity.o oVar5 = oVar;
            p2.l a10 = cVar.a(uri2, true);
            a10.getClass();
            long j24 = a10.h;
            iVar4.q = a10.c;
            if (a10.o) {
                j11 = j23;
                j12 = -9223372036854775807L;
            } else {
                j11 = j23;
                j12 = (a10.u + j24) - cVar.y;
            }
            iVar4.s = j12;
            long j25 = j24 - cVar.y;
            oVar2 = oVar5;
            long j26 = j11;
            Pair c10 = iVar4.c(jVar3, z17, a10, j25, j26);
            long longValue = ((Long) c10.first).longValue();
            int intValue = ((Integer) c10.second).intValue();
            if (z17 && jVar3 != null) {
                j13 = j25;
                if (longValue < a10.k || ((d = i.d(a10, longValue, intValue)) != null && j13 + d.a.e < j3)) {
                    Uri uri3 = uriArr[i10];
                    p2.l a11 = cVar.a(uri3, true);
                    a11.getClass();
                    long j27 = a11.h - cVar.y;
                    Pair c11 = iVar4.c(jVar3, false, a11, j27, j26);
                    jVar = jVar3;
                    long longValue2 = ((Long) c11.first).longValue();
                    j13 = j27;
                    l4 = i10;
                    lVar = a11;
                    uri = uri3;
                    intValue = ((Integer) c11.second).intValue();
                    iVar = iVar4;
                    longValue = longValue2;
                    String str2 = lVar.a;
                    boolean z18 = lVar.c;
                    j14 = lVar.k;
                    i0 i0Var = lVar.r;
                    if (l4 != i10 && i10 != -1) {
                        bVar2 = (p2.b) cVar.d.get(uriArr[i10]);
                        if (bVar2 != null) {
                            bVar2.v = false;
                        }
                    }
                    if (longValue >= j14) {
                        iVar.n = new u2.b();
                    } else {
                        h d10 = i.d(lVar, longValue, intValue);
                        if (d10 == null) {
                            if (!lVar.o) {
                                oVar2.d = uri;
                                iVar.p = uri;
                            } else if (z16 || i0Var.isEmpty()) {
                                oVar2.b = true;
                            } else {
                                d10 = new h((p2.j) e9.q.l(i0Var), (j14 + i0Var.size()) - 1, -1);
                            }
                        }
                        boolean z19 = d10.d;
                        p2.j jVar4 = d10.a;
                        iVar.p = null;
                        SystemClock.elapsedRealtime();
                        p2.i iVar5 = jVar4.b;
                        long j28 = jVar4.e;
                        Uri m10 = (iVar5 == null || (str = iVar5.h) == null) ? null : e2.a.m(str2, str);
                        e e = iVar.e(l4, m10, true);
                        oVar2.c = e;
                        if (e == null) {
                            String str3 = jVar4.h;
                            Uri m11 = str3 == null ? null : e2.a.m(str2, str3);
                            e e7 = iVar.e(l4, m11, false);
                            oVar2.c = e7;
                            if (e7 == null) {
                                boolean z20 = jVar4 instanceof p2.g ? ((p2.g) jVar4).w || (d10.c == 0 && z18) : z18;
                                if (jVar == null) {
                                    AtomicInteger atomicInteger = j.c0;
                                } else if (!uri.equals(jVar.x) || !jVar.X) {
                                    long j29 = j13 + j28;
                                    if (!z20 || j29 < j26) {
                                        z10 = true;
                                        if (z10 || !z19) {
                                            c cVar2 = iVar.a;
                                            g2.h hVar4 = iVar.b;
                                            b2.s sVar = iVar.f[l4];
                                            List list5 = iVar.i;
                                            int n10 = iVar.r.n();
                                            Object q6 = iVar.r.q();
                                            boolean z21 = iVar.l;
                                            ji.a aVar = iVar.d;
                                            if (m11 != null) {
                                                g3Var2.getClass();
                                                list2 = list5;
                                                z11 = z21;
                                                g3Var = g3Var2;
                                                bArr = null;
                                            } else {
                                                list2 = list5;
                                                z11 = z21;
                                                g3Var = g3Var2;
                                                bArr = (byte[]) ((d) g3Var.b).get(m11);
                                            }
                                            byte[] bArr4 = m10 != null ? null : (byte[]) ((d) g3Var.b).get(m10);
                                            j2.k kVar2 = iVar.k;
                                            AtomicInteger atomicInteger2 = j.c0;
                                            Map map = Collections.EMPTY_MAP;
                                            Uri m12 = e2.a.m(str2, jVar4.a);
                                            nVar = nVar2;
                                            long j30 = jVar4.r;
                                            long j31 = jVar4.s;
                                            int i11 = !z19 ? 8 : 0;
                                            e2.d.i(m12, "The uri must be set.");
                                            g2.m mVar2 = new g2.m(m12, 1, null, map, j30, j31, null, i11);
                                            z12 = bArr == null;
                                            if (z12) {
                                                bArr2 = null;
                                            } else {
                                                String str4 = jVar4.n;
                                                str4.getClass();
                                                bArr2 = j.e(str4);
                                            }
                                            if (bArr == null) {
                                                bArr2.getClass();
                                                hVar = new a(hVar4, bArr, bArr2);
                                            } else {
                                                hVar = hVar4;
                                            }
                                            iVar2 = jVar4.b;
                                            if (iVar2 == null) {
                                                boolean z22 = bArr4 != null;
                                                if (z22) {
                                                    String str5 = iVar2.n;
                                                    str5.getClass();
                                                    bArr3 = j.e(str5);
                                                } else {
                                                    bArr3 = null;
                                                }
                                                boolean z23 = z22;
                                                Uri m13 = e2.a.m(str2, iVar2.a);
                                                oVar3 = oVar2;
                                                kVar = kVar2;
                                                long j32 = iVar2.r;
                                                long j33 = iVar2.s;
                                                e2.d.i(m13, "The uri must be set.");
                                                g2.m mVar3 = new g2.m(m13, 1, null, map, j32, j33, null, 0);
                                                if (bArr4 != null) {
                                                    bArr3.getClass();
                                                    hVar3 = new a(hVar4, bArr4, bArr3);
                                                } else {
                                                    hVar3 = hVar4;
                                                }
                                                z13 = z23;
                                                hVar2 = hVar3;
                                                mVar = mVar3;
                                            } else {
                                                oVar3 = oVar2;
                                                kVar = kVar2;
                                                mVar = null;
                                                hVar2 = null;
                                                z13 = false;
                                            }
                                            long j34 = j13 + j28;
                                            long j35 = j34 + jVar4.c;
                                            int i12 = lVar.j + jVar4.d;
                                            if (jVar == null) {
                                                g2.m mVar4 = jVar.G;
                                                boolean z24 = mVar == mVar4 || (mVar != null && mVar4 != null && mVar.a.equals(mVar4.a) && mVar.e == mVar4.e);
                                                boolean z25 = uri.equals(jVar.x) && jVar.X;
                                                iVar3 = jVar.O;
                                                vVar = jVar.P;
                                                bVar = (z24 && z25 && !jVar.Z && jVar.w == i12) ? jVar.S : null;
                                            } else {
                                                iVar3 = new q3.i(null);
                                                vVar = new v(10);
                                                bVar = null;
                                            }
                                            q3.i iVar6 = iVar3;
                                            v vVar2 = vVar;
                                            long j36 = d10.b;
                                            int i13 = d10.c;
                                            boolean z26 = !z19;
                                            boolean z27 = jVar4.v;
                                            SparseArray sparseArray = aVar.a;
                                            b0Var = (e2.b0) sparseArray.get(i12);
                                            if (b0Var == null) {
                                                b0Var = new e2.b0(9223372036854775806L);
                                                sparseArray.put(i12, b0Var);
                                            }
                                            oVar2 = oVar3;
                                            oVar2.c = new j(cVar2, hVar, mVar2, sVar, z12, hVar2, mVar, z13, uri, list2, n10, q6, j34, j35, j36, i13, z26, i12, z27, z11, b0Var, jVar4.f, bVar, iVar6, vVar2, z10, z20, kVar);
                                        }
                                    }
                                }
                                z10 = false;
                                if (z10) {
                                }
                                c cVar22 = iVar.a;
                                g2.h hVar42 = iVar.b;
                                b2.s sVar2 = iVar.f[l4];
                                List list52 = iVar.i;
                                int n102 = iVar.r.n();
                                Object q62 = iVar.r.q();
                                boolean z212 = iVar.l;
                                ji.a aVar2 = iVar.d;
                                if (m11 != null) {
                                }
                                if (m10 != null) {
                                }
                                j2.k kVar22 = iVar.k;
                                AtomicInteger atomicInteger22 = j.c0;
                                Map map2 = Collections.EMPTY_MAP;
                                Uri m122 = e2.a.m(str2, jVar4.a);
                                nVar = nVar2;
                                long j302 = jVar4.r;
                                long j312 = jVar4.s;
                                if (!z19) {
                                }
                                e2.d.i(m122, "The uri must be set.");
                                g2.m mVar22 = new g2.m(m122, 1, null, map2, j302, j312, null, i11);
                                if (bArr == null) {
                                }
                                if (z12) {
                                }
                                if (bArr == null) {
                                }
                                iVar2 = jVar4.b;
                                if (iVar2 == null) {
                                }
                                long j342 = j13 + j28;
                                long j352 = j342 + jVar4.c;
                                int i122 = lVar.j + jVar4.d;
                                if (jVar == null) {
                                }
                                q3.i iVar62 = iVar3;
                                v vVar22 = vVar;
                                long j362 = d10.b;
                                int i132 = d10.c;
                                boolean z262 = !z19;
                                boolean z272 = jVar4.v;
                                SparseArray sparseArray2 = aVar2.a;
                                b0Var = (e2.b0) sparseArray2.get(i122);
                                if (b0Var == null) {
                                }
                                oVar2 = oVar3;
                                oVar2.c = new j(cVar22, hVar, mVar22, sVar2, z12, hVar2, mVar, z13, uri, list2, n102, q62, j342, j352, j362, i132, z262, i122, z272, z11, b0Var, jVar4.f, bVar, iVar62, vVar22, z10, z20, kVar);
                            }
                        }
                    }
                    nVar = nVar2;
                }
            } else {
                j13 = j25;
            }
            jVar = jVar3;
            iVar = iVar4;
            lVar = a10;
            uri = uri2;
            String str22 = lVar.a;
            boolean z182 = lVar.c;
            j14 = lVar.k;
            i0 i0Var2 = lVar.r;
            if (l4 != i10) {
                bVar2 = (p2.b) cVar.d.get(uriArr[i10]);
                if (bVar2 != null) {
                }
            }
            if (longValue >= j14) {
            }
            nVar = nVar2;
        } else {
            androidx.activity.o oVar6 = oVar;
            oVar6.d = uri2;
            iVar4.p = uri2;
            nVar = nVar2;
            oVar2 = oVar6;
        }
        boolean z28 = oVar2.b;
        v2.e eVar = (v2.e) oVar2.c;
        Uri uri4 = (Uri) oVar2.d;
        if (z28) {
            this.g0 = -9223372036854775807L;
            this.j0 = true;
            return true;
        }
        if (eVar == null) {
            if (uri4 == null) {
                return false;
            }
            ((p2.b) ((k) this.c.a).b.d.get(uri4)).c(true);
            return false;
        }
        if (eVar instanceof j) {
            j jVar5 = (j) eVar;
            ArrayList arrayList = this.y;
            if (!arrayList.isEmpty()) {
                if (!y().g()) {
                    x(arrayList.size() - 1);
                }
                if (jVar5.y && jVar5.b0) {
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        long j37 = ((j) arrayList.get(size)).h;
                        long j38 = jVar5.h;
                        if (j37 < j38) {
                            break;
                        }
                        if (j37 == j38 && g(size)) {
                            x(size);
                            jVar5.b0 = false;
                            break;
                        }
                        size--;
                    }
                }
            }
            this.n0 = jVar5;
            this.V = jVar5.d;
            this.g0 = -9223372036854775807L;
            arrayList.add(jVar5);
            f0 u10 = i0.u();
            for (p pVar3 : this.L) {
                u10.b(Integer.valueOf(pVar3.q + pVar3.p));
            }
            a1 i14 = u10.i();
            jVar5.T = this;
            jVar5.Y = i14;
            for (p pVar4 : this.L) {
                pVar4.getClass();
                pVar4.C = jVar5.v;
                if (jVar5.b0) {
                    pVar4.G = true;
                }
            }
        }
        this.K = eVar;
        nVar.f(eVar, this, this.r.o3(eVar.c));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y2.i
    public final void p(y2.k kVar, long j3, long j10) {
        v2.e eVar = (v2.e) kVar;
        this.K = null;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            byte[] bArr = eVar2.s;
            i iVar = this.d;
            iVar.m = bArr;
            g3 g3Var = iVar.j;
            Uri uri = eVar2.b.a;
            byte[] bArr2 = eVar2.w;
            bArr2.getClass();
            d dVar = (d) g3Var.b;
            uri.getClass();
        }
        long j11 = eVar.a;
        Uri uri2 = eVar.r.c;
        u uVar = new u(j10);
        this.r.getClass();
        this.v.o(uVar, eVar.c, this.b, eVar.d, eVar.e, eVar.f, eVar.h, eVar.n);
        if (this.T) {
            this.c.g(this);
            return;
        }
        i2.p0 p0Var = new i2.p0();
        p0Var.a = this.f0;
        n(new q0(p0Var));
    }

    @Override // u2.f1
    public final long r() {
        if (this.j0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.g0;
        }
        long j3 = this.f0;
        j y3 = y();
        if (!y3.X) {
            ArrayList arrayList = this.y;
            y3 = arrayList.size() > 1 ? (j) hc.b.i(2, arrayList) : null;
        }
        if (y3 != null) {
            j3 = Math.max(j3, y3.n);
        }
        if (this.S) {
            for (p pVar : this.L) {
                j3 = Math.max(j3, pVar.q());
            }
        }
        return j3;
    }

    @Override // u2.f1
    public final void u(long j3) {
        y2.n nVar = this.s;
        if (nVar.c() || A()) {
            return;
        }
        boolean d = nVar.d();
        i iVar = this.d;
        List list = this.E;
        if (d) {
            this.K.getClass();
            if (iVar.n != null ? false : iVar.r.d(j3, this.K, list)) {
                nVar.b();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && iVar.b((j) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            x(size);
        }
        int size2 = (iVar.n != null || iVar.r.length() < 2) ? list.size() : iVar.r.i(j3, list);
        if (size2 < this.y.size()) {
            x(size2);
        }
    }

    public final q1 v(l1[] l1VarArr) {
        for (int i10 = 0; i10 < l1VarArr.length; i10++) {
            l1 l1Var = l1VarArr[i10];
            b2.s[] sVarArr = new b2.s[l1Var.a];
            for (int i11 = 0; i11 < l1Var.a; i11++) {
                b2.s sVar = l1Var.d[i11];
                int L0 = this.h.L0(sVar);
                b2.r a2 = sVar.a();
                a2.R = L0;
                sVarArr[i11] = new b2.s(a2);
            }
            l1VarArr[i10] = new l1(l1Var.b, sVarArr);
        }
        return new q1(l1VarArr);
    }

    public final void x(int i10) {
        ArrayList arrayList;
        e2.d.g(!this.s.d());
        while (true) {
            arrayList = this.y;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (g(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j3 = y().n;
        j jVar = (j) arrayList.get(i10);
        d0.V(i10, arrayList.size(), arrayList);
        for (int i11 = 0; i11 < this.L.length; i11++) {
            this.L[i11].n(jVar.f(i11));
        }
        if (arrayList.isEmpty()) {
            this.g0 = this.f0;
        } else {
            ((j) e9.q.l(arrayList)).Z = true;
        }
        this.j0 = false;
        this.v.x(this.Q, jVar.h, j3);
    }

    public final j y() {
        return (j) hc.b.i(1, this.y);
    }

    @Override // c3.q
    public final void G(c3.b0 b0Var) {
    }
}
