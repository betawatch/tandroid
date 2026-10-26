package o2;

import a8.h0;
import a8.ng;
import a8.yb;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import b2.q1;
import b2.u0;
import b2.w;
import b2.w0;
import b2.x;
import c3.j0;
import d5.z;
import e2.k0;
import e2.n0;
import f9.f0;
import f9.i0;
import f9.s1;
import g2.b0;
import i2.v0;
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
import jg.s0;
import li.h5;
import org.telegram.ui.Components.b10;
import u2.b1;
import u2.f1;
import u2.r1;
import u2.u;
import vi.y;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
    public x V;
    public x W;
    public boolean X;
    public r1 Y;
    public Set Z;
    public final String a;
    public int[] a0;
    public final int b;
    public int b0;
    public final jg.i c;
    public boolean c0;
    public final i d;
    public boolean[] d0;
    public final h0 e;
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
    public final u7.s r;
    public final y2.l s;
    public final ng v;
    public final int w;
    public final androidx.activity.n x;
    public final ArrayList y;

    /* JADX WARN: Type inference failed for: r2v13, types: [o2.n] */
    /* JADX WARN: Type inference failed for: r2v14, types: [o2.n] */
    public q(String str, int i10, jg.i iVar, i iVar2, Map map, h0 h0Var, long j10, x xVar, n2.m mVar, n2.j jVar, u7.s sVar, ng ngVar, int i11, z2.a aVar) {
        this.a = str;
        this.b = i10;
        this.c = iVar;
        this.d = iVar2;
        this.J = map;
        this.e = h0Var;
        this.f = xVar;
        this.h = mVar;
        this.n = jVar;
        this.r = sVar;
        this.v = ngVar;
        this.w = i11;
        this.s = aVar != null ? new y2.l(aVar) : new y2.l("Loader:HlsSampleStreamWrapper");
        androidx.activity.n nVar = new androidx.activity.n();
        nVar.b = null;
        final int i12 = 0;
        nVar.a = false;
        nVar.c = null;
        this.x = nVar;
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
                        this.b.A();
                        break;
                    default:
                        q qVar = this.b;
                        for (p pVar : qVar.L) {
                            pVar.K(qVar.k0);
                        }
                        qVar.S = true;
                        qVar.A();
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
                        this.b.A();
                        break;
                    default:
                        q qVar = this.b;
                        for (p pVar : qVar.L) {
                            pVar.K(qVar.k0);
                        }
                        qVar.S = true;
                        qVar.A();
                        break;
                }
            }
        };
        this.H = n0.q(null);
        this.f0 = j10;
        this.g0 = j10;
        this.k0 = Long.MIN_VALUE;
    }

    public static c3.n j(int i10, int i11) {
        e2.a.l("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new c3.n();
    }

    public static x t(x xVar, x xVar2, boolean z10) {
        String b10;
        if (xVar == null) {
            return xVar2;
        }
        String str = xVar.k;
        String str2 = xVar2.s;
        int h = w0.h(str2);
        if (n0.v(h, str) == 1) {
            b10 = n0.w(h, str);
            str2 = w0.d(b10);
        } else {
            b10 = w0.b(str, str2);
        }
        xVar2.n = xVar.n;
        xVar2.o = xVar.o;
        xVar2.p = xVar.p;
        xVar2.q = xVar.q;
        w a2 = xVar2.a();
        a2.a = xVar.a;
        a2.b = xVar.b;
        a2.c = i0.u(xVar.c);
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
            a2.r = w0.n(str2);
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

    public static int x(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A() {
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
                            int h = w0.h(str);
                            if (h == 3) {
                                if (Objects.equals(str, str2)) {
                                    if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || y3.P == xVar.P) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i14++;
                            } else if (h == w0.h(str2)) {
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
                    ((m) obj).a();
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
                if (w0.m(str3)) {
                    i18 = 2;
                } else if (!w0.i(str3)) {
                    i18 = w0.l(str3) ? 3 : -2;
                }
                if (x(i18) > x(i17)) {
                    i16 = i15;
                    i17 = i18;
                } else if (i18 == i17 && i16 != -1) {
                    i16 = -1;
                }
                i15++;
            }
            q1 q1Var = this.d.h;
            int i19 = q1Var.a;
            this.b0 = -1;
            this.a0 = new int[length];
            for (int i20 = 0; i20 < length; i20++) {
                this.a0[i20] = i20;
            }
            q1[] q1VarArr = new q1[length];
            int i21 = 0;
            while (i21 < length) {
                x y11 = this.L[i21].y();
                y11.getClass();
                x xVar2 = this.f;
                String str4 = this.a;
                if (i21 == i16) {
                    x[] xVarArr = new x[i19];
                    for (int i22 = i11; i22 < i19; i22++) {
                        x xVar3 = q1Var.d[i22];
                        if (i17 == 1 && xVar2 != null) {
                            xVar3 = xVar3.d(xVar2);
                        }
                        xVarArr[i22] = i19 == 1 ? y11.d(xVar3) : t(xVar3, y11, true);
                    }
                    q1VarArr[i21] = new q1(str4, xVarArr);
                    this.b0 = i21;
                    i10 = 0;
                } else {
                    if (i17 != 2 || !w0.i(y11.s)) {
                        xVar2 = null;
                    }
                    StringBuilder l4 = b10.l(str4, ":muxed:");
                    l4.append(i21 < i16 ? i21 : i21 - 1);
                    String sb2 = l4.toString();
                    i10 = 0;
                    w a2 = t(xVar2, y11, false).a();
                    a2.l = str4;
                    q1VarArr[i21] = new q1(sb2, new x(a2));
                }
                i21++;
                i11 = i10;
            }
            int i23 = i11;
            this.Y = n(q1VarArr);
            yb.p(this.Z == null ? 1 : i23);
            this.Z = Collections.EMPTY_SET;
            this.T = true;
            this.c.f0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y2.g
    public final void B(y2.i iVar, long j10, long j11) {
        v2.f fVar = (v2.f) iVar;
        this.K = null;
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            byte[] bArr = eVar.s;
            i iVar2 = this.d;
            iVar2.m = bArr;
            h5 h5Var = iVar2.j;
            Uri uri = eVar.b.a;
            byte[] bArr2 = eVar.w;
            bArr2.getClass();
            d dVar = (d) h5Var.a;
            uri.getClass();
        }
        long j12 = fVar.a;
        g2.m mVar = fVar.b;
        b0 b0Var = fVar.r;
        u uVar = new u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        this.r.getClass();
        this.v.q(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (this.T) {
            this.c.u(this);
            return;
        }
        v0 v0Var = new v0();
        v0Var.a = this.f0;
        m(new i2.w0(v0Var));
    }

    public final void C() {
        this.s.d();
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

    public final void D(q1[] q1VarArr, int... iArr) {
        this.Y = n(q1VarArr);
        this.Z = new HashSet();
        for (int i10 : iArr) {
            this.Z.add(this.Y.a(i10));
        }
        this.b0 = 0;
        this.H.post(new k2.c(this.c, 13));
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
        if (y()) {
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
                    long b10 = b();
                    J = pVar.J(j10, b10 == Long.MIN_VALUE || j10 < b10);
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
        if (!lVar.c()) {
            lVar.c = null;
            E();
            return true;
        }
        if (this.S) {
            for (p pVar2 : this.L) {
                pVar2.l();
            }
        }
        lVar.a();
        return true;
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
    public final j0 F1(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i11);
        Set set = p0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.N;
        SparseIntArray sparseIntArray = this.O;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            yb.g(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.M[i12] = i10;
                }
                r52 = this.M[i12] == i10 ? this.L[i12] : j(i10, i11);
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
                return j(i10, i11);
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
            String str = n0.a;
            ?? copyOf2 = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            copyOf2[pVarArr.length] = r52;
            this.L = (p[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.e0, i14);
            this.e0 = copyOf3;
            copyOf3[length] = z10;
            this.c0 |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (x(i11) > x(this.Q)) {
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

    @Override // c3.q
    public final void Q0() {
        this.l0 = true;
        this.H.post(this.G);
    }

    @Override // y2.j
    public final void a() {
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
    public final long b() {
        if (y()) {
            return this.g0;
        }
        if (this.j0) {
            return Long.MIN_VALUE;
        }
        return v().n;
    }

    @Override // u2.f1
    public final boolean c() {
        return this.s.c();
    }

    @Override // u2.b1
    public final void d() {
        this.H.post(this.F);
    }

    public final void e() {
        yb.p(this.T);
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

    @Override // y2.g
    public final void l0(y2.i iVar, long j10, long j11, boolean z10) {
        v2.f fVar = (v2.f) iVar;
        this.K = null;
        long j12 = fVar.a;
        g2.m mVar = fVar.b;
        b0 b0Var = fVar.r;
        u uVar = new u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        this.r.getClass();
        this.v.p(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n);
        if (z10) {
            return;
        }
        if (y() || this.U == 0) {
            E();
        }
        if (this.U > 0) {
            this.c.u(this);
        }
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
    public final boolean m(i2.w0 w0Var) {
        long max;
        long j10;
        List list;
        long j11;
        int a2;
        i2.w0 w0Var2;
        h5 h5Var;
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
        androidx.activity.n nVar;
        boolean z12;
        c cVar;
        boolean z13;
        h5 h5Var2;
        byte[] bArr;
        y2.l lVar;
        boolean z14;
        byte[] bArr2;
        g2.h hVar;
        p2.j jVar2;
        j2.j jVar3;
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
        p2.c cVar2;
        if (!this.j0) {
            y2.l lVar2 = this.s;
            if (!lVar2.c() && !lVar2.b()) {
                if (y()) {
                    List list2 = Collections.EMPTY_LIST;
                    max = this.g0;
                    for (p pVar : this.L) {
                        pVar.t = this.g0;
                    }
                    list = list2;
                    j10 = max;
                } else {
                    j v = v();
                    boolean z17 = v.X;
                    long j17 = v.h;
                    if (z17 && v.g()) {
                        long j18 = v.a0;
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
                androidx.activity.n nVar2 = this.x;
                nVar2.b = null;
                nVar2.a = false;
                nVar2.c = null;
                boolean z19 = this.T || !list.isEmpty();
                i iVar3 = this.d;
                h5 h5Var3 = iVar3.j;
                p2.w[] wVarArr = iVar3.e;
                p2.d dVar = iVar3.g;
                j jVar4 = list.isEmpty() ? null : (j) f9.o.m(list);
                if (jVar4 == null) {
                    j11 = -9223372036854775807L;
                    a2 = -1;
                    h5Var = h5Var3;
                    w0Var2 = w0Var;
                } else {
                    j11 = -9223372036854775807L;
                    a2 = iVar3.h.a(jVar4.d);
                    w0Var2 = w0Var;
                    h5Var = h5Var3;
                }
                long j20 = w0Var2.a;
                long j21 = max - j20;
                long j22 = iVar3.s;
                long j23 = j22 != j11 ? j22 - j20 : j11;
                if (jVar4 == null || iVar3.q) {
                    j12 = j23;
                    iVar = iVar3;
                } else {
                    iVar = iVar3;
                    j12 = j23;
                    long j24 = jVar4.n - jVar4.h;
                    j21 = Math.max(0L, j21 - j24);
                    if (j12 != j11) {
                        j12 = Math.max(0L, j12 - j24);
                    }
                }
                v2.m[] b10 = iVar.b(jVar4, max);
                if (a2 != -1) {
                    x2.q qVar = iVar.r;
                    if (qVar.a(qVar.u(a2), SystemClock.elapsedRealtime())) {
                        z10 = true;
                        long j25 = max;
                        j jVar5 = jVar4;
                        iVar.r.k(j20, j21, j12, list, b10);
                        int l4 = iVar.r.l();
                        boolean z20 = a2 == l4;
                        c10 = wVarArr[l4].c();
                        if (dVar.f(c10)) {
                            nVar2.c = c10;
                            iVar.p = c10;
                            lVar = lVar2;
                            nVar = nVar2;
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
                            i iVar4 = iVar;
                            Pair e = iVar4.e(jVar5, z20, b11, j27, j25);
                            boolean z21 = z10;
                            long longValue = ((Long) e.first).longValue();
                            int intValue = ((Integer) e.second).intValue();
                            if (!z20 || z21 || jVar5 == null) {
                                j15 = j27;
                            } else {
                                j15 = j27;
                                if (longValue < b11.k || ((f7 = i.f(b11, longValue, intValue)) != null && j15 + f7.a.e < j10)) {
                                    c10 = wVarArr[a2].c();
                                    b11 = dVar.b(c10, true);
                                    b11.getClass();
                                    long j28 = b11.h - dVar.I;
                                    Pair e10 = iVar4.e(jVar5, false, b11, j28, j25);
                                    jVar = jVar5;
                                    long longValue2 = ((Long) e10.first).longValue();
                                    intValue = ((Integer) e10.second).intValue();
                                    l4 = a2;
                                    j15 = j28;
                                    iVar2 = iVar4;
                                    longValue = longValue2;
                                    String str2 = b11.a;
                                    boolean z22 = b11.c;
                                    j16 = b11.k;
                                    i0 i0Var = b11.r;
                                    if (l4 == a2) {
                                        if (a2 != -1) {
                                            Uri c11 = wVarArr[a2].c();
                                            p2.c cVar3 = (p2.c) dVar.d.get(c11);
                                            if (cVar3 != null) {
                                                p2.b bVar2 = (p2.b) ic.a.h(cVar3.b, c11, c11);
                                                bVar2.getClass();
                                                bVar2.w = false;
                                            }
                                        }
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                    }
                                    if (longValue >= j16) {
                                        iVar2.n = new u2.b();
                                        lVar = lVar2;
                                        nVar = nVar2;
                                    } else {
                                        h f10 = i.f(b11, longValue, intValue);
                                        if (f10 == null) {
                                            if (b11.o) {
                                                nVar = nVar2;
                                                if (z19 || i0Var.isEmpty()) {
                                                    nVar.a = z11;
                                                } else {
                                                    f10 = new h((p2.k) f9.o.m(i0Var), (j16 + i0Var.size()) - 1, -1);
                                                }
                                            } else {
                                                nVar = nVar2;
                                                nVar.c = c10;
                                                iVar2.p = c10;
                                            }
                                            lVar = lVar2;
                                        } else {
                                            nVar = nVar2;
                                        }
                                        boolean z23 = f10.d;
                                        p2.k kVar = f10.a;
                                        iVar2.p = null;
                                        SystemClock.elapsedRealtime();
                                        p2.j jVar6 = kVar.b;
                                        long j29 = kVar.e;
                                        Uri g7 = (jVar6 == null || (str = jVar6.h) == null) ? null : e2.e.g(str2, str);
                                        e g10 = iVar2.g(g7, l4, true);
                                        nVar.b = g10;
                                        if (g10 == null) {
                                            String str3 = kVar.h;
                                            Uri g11 = str3 == null ? null : e2.e.g(str2, str3);
                                            e g12 = iVar2.g(g11, l4, false);
                                            nVar.b = g12;
                                            if (g12 == null) {
                                                boolean z24 = kVar instanceof p2.h ? ((p2.h) kVar).w || (f10.c == 0 && z22) : z22;
                                                if (jVar == null) {
                                                    AtomicInteger atomicInteger = j.c0;
                                                } else if (!c10.equals(jVar.x) || !jVar.X) {
                                                    long j30 = j15 + j29;
                                                    if (!z24 || j30 < j25) {
                                                        z12 = true;
                                                        if (z12 || !z23) {
                                                            c cVar4 = iVar2.a;
                                                            g2.h hVar5 = iVar2.b;
                                                            x xVar2 = iVar2.f[l4];
                                                            List list4 = iVar2.i;
                                                            int n10 = iVar2.r.n();
                                                            Object q5 = iVar2.r.q();
                                                            boolean z25 = iVar2.l;
                                                            s0 s0Var = iVar2.d;
                                                            if (g11 != null) {
                                                                h5Var.getClass();
                                                                cVar = cVar4;
                                                                z13 = z25;
                                                                h5Var2 = h5Var;
                                                                bArr = null;
                                                            } else {
                                                                cVar = cVar4;
                                                                z13 = z25;
                                                                h5Var2 = h5Var;
                                                                bArr = (byte[]) ((d) h5Var2.a).get(g11);
                                                            }
                                                            byte[] bArr4 = g7 != null ? null : (byte[]) ((d) h5Var2.a).get(g7);
                                                            j2.j jVar7 = iVar2.k;
                                                            AtomicInteger atomicInteger2 = j.c0;
                                                            Map map = Collections.EMPTY_MAP;
                                                            Uri g13 = e2.e.g(str2, kVar.a);
                                                            lVar = lVar2;
                                                            long j31 = kVar.r;
                                                            long j32 = kVar.s;
                                                            int i10 = !z23 ? 8 : 0;
                                                            yb.l(g13, "The uri must be set.");
                                                            g2.m mVar2 = new g2.m(g13, 1, null, map, j31, j32, null, i10);
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
                                                                hVar = new a(hVar5, bArr, bArr2);
                                                            } else {
                                                                hVar = hVar5;
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
                                                                Uri g14 = e2.e.g(str2, jVar2.a);
                                                                jVar3 = jVar7;
                                                                long j33 = jVar2.r;
                                                                long j34 = jVar2.s;
                                                                yb.l(g14, "The uri must be set.");
                                                                g2.m mVar3 = new g2.m(g14, 1, null, map, j33, j34, null, 0);
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
                                                                jVar3 = jVar7;
                                                                mVar = null;
                                                                hVar2 = null;
                                                                z15 = false;
                                                            }
                                                            long j35 = j15 + j29;
                                                            long j36 = j35 + kVar.c;
                                                            int i11 = b11.j + kVar.d;
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
                                                            e2.x xVar3 = xVar;
                                                            long j37 = f10.b;
                                                            int i12 = f10.c;
                                                            boolean z30 = !z23;
                                                            boolean z31 = kVar.v;
                                                            SparseArray sparseArray = (SparseArray) s0Var.b;
                                                            k0Var = (k0) sparseArray.get(i11);
                                                            if (k0Var == null) {
                                                                k0Var = new k0(9223372036854775806L);
                                                                sparseArray.put(i11, k0Var);
                                                            }
                                                            nVar.b = new j(cVar, hVar, mVar2, xVar2, z14, hVar2, mVar, z15, c10, list4, n10, q5, j35, j36, j37, i12, z30, i11, z31, z13, k0Var, kVar.f, bVar, hVar6, xVar3, z12, z24, jVar3);
                                                        }
                                                    }
                                                }
                                                z12 = false;
                                                if (z12) {
                                                }
                                                c cVar42 = iVar2.a;
                                                g2.h hVar52 = iVar2.b;
                                                x xVar22 = iVar2.f[l4];
                                                List list42 = iVar2.i;
                                                int n102 = iVar2.r.n();
                                                Object q52 = iVar2.r.q();
                                                boolean z252 = iVar2.l;
                                                s0 s0Var2 = iVar2.d;
                                                if (g11 != null) {
                                                }
                                                if (g7 != null) {
                                                }
                                                j2.j jVar72 = iVar2.k;
                                                AtomicInteger atomicInteger22 = j.c0;
                                                Map map2 = Collections.EMPTY_MAP;
                                                Uri g132 = e2.e.g(str2, kVar.a);
                                                lVar = lVar2;
                                                long j312 = kVar.r;
                                                long j322 = kVar.s;
                                                if (!z23) {
                                                }
                                                yb.l(g132, "The uri must be set.");
                                                g2.m mVar22 = new g2.m(g132, 1, null, map2, j312, j322, null, i10);
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
                                                q3.h hVar62 = hVar3;
                                                e2.x xVar32 = xVar;
                                                long j372 = f10.b;
                                                int i122 = f10.c;
                                                boolean z302 = !z23;
                                                boolean z312 = kVar.v;
                                                SparseArray sparseArray2 = (SparseArray) s0Var2.b;
                                                k0Var = (k0) sparseArray2.get(i112);
                                                if (k0Var == null) {
                                                }
                                                nVar.b = new j(cVar, hVar, mVar22, xVar22, z14, hVar2, mVar, z15, c10, list42, n102, q52, j352, j362, j372, i122, z302, i112, z312, z13, k0Var, kVar.f, bVar, hVar62, xVar32, z12, z24, jVar3);
                                            }
                                        }
                                        lVar = lVar2;
                                    }
                                }
                            }
                            jVar = jVar5;
                            iVar2 = iVar4;
                            String str22 = b11.a;
                            boolean z222 = b11.c;
                            j16 = b11.k;
                            i0 i0Var2 = b11.r;
                            if (l4 == a2) {
                            }
                            if (longValue >= j16) {
                            }
                        }
                        z16 = nVar.a;
                        v2.f fVar = (v2.f) nVar.b;
                        Uri uri = (Uri) nVar.c;
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
                            j jVar8 = (j) fVar;
                            ArrayList arrayList = this.y;
                            if (!arrayList.isEmpty()) {
                                if (!v().g()) {
                                    u(arrayList.size() - 1);
                                }
                                if (jVar8.y && jVar8.b0) {
                                    int size = arrayList.size() - 1;
                                    while (true) {
                                        if (size < 0) {
                                            break;
                                        }
                                        long j38 = ((j) arrayList.get(size)).h;
                                        long j39 = jVar8.h;
                                        if (j38 < j39) {
                                            break;
                                        }
                                        if (j38 == j39 && f(size)) {
                                            u(size);
                                            jVar8.b0 = false;
                                            break;
                                        }
                                        size--;
                                    }
                                }
                            }
                            this.o0 = jVar8;
                            this.V = jVar8.d;
                            this.g0 = -9223372036854775807L;
                            arrayList.add(jVar8);
                            f0 t10 = i0.t();
                            for (p pVar3 : this.L) {
                                t10.c(Integer.valueOf(pVar3.q + pVar3.p));
                            }
                            s1 f11 = t10.f();
                            jVar8.T = this;
                            jVar8.Y = f11;
                            for (p pVar4 : this.L) {
                                pVar4.getClass();
                                pVar4.E = jVar8.v;
                                if (jVar8.b0) {
                                    pVar4.I = true;
                                }
                            }
                        }
                        this.K = fVar;
                        lVar.f(fVar, this, this.r.B0(fVar.c));
                        return true;
                    }
                }
                z10 = false;
                long j252 = max;
                j jVar52 = jVar4;
                iVar.r.k(j20, j21, j12, list, b10);
                int l42 = iVar.r.l();
                if (a2 == l42) {
                }
                c10 = wVarArr[l42].c();
                if (dVar.f(c10)) {
                }
                z16 = nVar.a;
                v2.f fVar2 = (v2.f) nVar.b;
                Uri uri2 = (Uri) nVar.c;
                if (!z16) {
                }
            }
        }
        return false;
    }

    public final r1 n(q1[] q1VarArr) {
        for (int i10 = 0; i10 < q1VarArr.length; i10++) {
            q1 q1Var = q1VarArr[i10];
            x[] xVarArr = new x[q1Var.a];
            for (int i11 = 0; i11 < q1Var.a; i11++) {
                x xVar = q1Var.d[i11];
                int w10 = this.h.w(xVar);
                w a2 = xVar.a();
                a2.S = w10;
                xVarArr[i11] = new x(a2);
            }
            q1VarArr[i10] = new q1(q1Var.b, xVarArr);
        }
        return new r1(q1VarArr);
    }

    @Override // u2.f1
    public final long q() {
        if (this.j0) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.g0;
        }
        long j10 = this.f0;
        j v = v();
        if (!v.X) {
            ArrayList arrayList = this.y;
            v = arrayList.size() > 1 ? (j) ic.a.g(2, arrayList) : null;
        }
        if (v != null) {
            j10 = Math.max(j10, v.n);
        }
        if (this.S) {
            for (p pVar : this.L) {
                j10 = Math.max(j10, pVar.s());
            }
        }
        return j10;
    }

    @Override // u2.f1
    public final void s(long j10) {
        y2.l lVar = this.s;
        if (lVar.b() || y()) {
            return;
        }
        boolean c10 = lVar.c();
        boolean z10 = false;
        int i10 = 0;
        z10 = false;
        i iVar = this.d;
        List list = this.E;
        if (c10) {
            this.K.getClass();
            if (iVar.n == null ? iVar.r.d(j10, this.K, list) : false) {
                lVar.a();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && iVar.c((j) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            u(size);
        }
        int size2 = (iVar.n != null || iVar.r.length() < 2) ? list.size() : iVar.r.i(j10, list);
        if (size2 < this.y.size()) {
            u(size2);
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

    public final void u(int i10) {
        ArrayList arrayList;
        yb.p(!this.s.c());
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
        long j10 = v().n;
        j jVar = (j) arrayList.get(i10);
        n0.X(i10, arrayList.size(), arrayList);
        for (int i11 = 0; i11 < this.L.length; i11++) {
            this.L[i11].o(jVar.f(i11));
        }
        if (arrayList.isEmpty()) {
            this.g0 = this.f0;
        } else {
            ((j) f9.o.m(arrayList)).Z = true;
        }
        this.j0 = false;
        this.v.C(this.Q, jVar.h, j10);
    }

    public final j v() {
        return (j) ic.a.g(1, this.y);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    @Override // y2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        boolean c10;
        boolean z10;
        int u10;
        k4.d dVar;
        boolean a2;
        int i11;
        v2.f fVar = (v2.f) iVar;
        boolean z11 = fVar instanceof j;
        if (z11 && !((j) fVar).g() && (iOException instanceof g2.x) && ((i11 = ((g2.x) iOException).c) == 410 || i11 == 404)) {
            return y2.l.d;
        }
        long j12 = fVar.r.b;
        g2.m mVar = fVar.b;
        b0 b0Var = fVar.r;
        u uVar = new u(mVar, b0Var.c, b0Var.d, j10, j11, j12);
        n0.h0(fVar.h);
        n0.h0(fVar.n);
        z zVar = new z(iOException, i10, 17);
        boolean z12 = fVar instanceof j;
        i iVar2 = this.d;
        y a10 = z12 ? iVar2.a(((j) fVar).x) : new y(1, 0, iVar2.r.length(), iVar2.d(SystemClock.elapsedRealtime()));
        this.r.getClass();
        k4.d z02 = u7.s.z0(a10, zVar);
        if (z02 != null) {
            int i12 = z02.a;
            long j13 = z02.b;
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException(ic.a.i(i12, "Invalid fallback selection type: "));
                }
                int a11 = iVar2.h.a(fVar.d);
                if (a11 != -1 && (u10 = iVar2.r.u(a11)) != -1) {
                    c10 = iVar2.r.o(u10, j13);
                    z10 = c10;
                }
            } else if (z12) {
                p2.d dVar2 = iVar2.g;
                Uri uri = ((j) fVar).x;
                p2.c cVar = (p2.c) dVar2.d.get(uri);
                c10 = cVar != null ? p2.c.c(cVar, uri, j13) : false;
                z10 = c10;
            }
            if (z10) {
                long H0 = u7.s.H0(zVar);
                dVar = H0 != -9223372036854775807L ? new k4.d(0, H0, false) : y2.l.f;
            } else {
                if (z11 && j12 == 0) {
                    ArrayList arrayList = this.y;
                    yb.p(((j) ic.a.y(1, arrayList)) == fVar);
                    if (arrayList.isEmpty()) {
                        this.g0 = this.f0;
                    } else {
                        ((j) f9.o.m(arrayList)).Z = true;
                    }
                }
                dVar = y2.l.e;
            }
            k4.d dVar3 = dVar;
            a2 = dVar3.a();
            this.v.r(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
            if (!a2) {
                this.K = null;
            }
            if (z10) {
                if (!this.T) {
                    v0 v0Var = new v0();
                    v0Var.a = this.f0;
                    m(new i2.w0(v0Var));
                    return dVar3;
                }
                this.c.u(this);
            }
            return dVar3;
        }
        z10 = false;
        if (z10) {
        }
        k4.d dVar32 = dVar;
        a2 = dVar32.a();
        this.v.r(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, iOException, !a2);
        if (!a2) {
        }
        if (z10) {
        }
        return dVar32;
    }

    public final boolean y() {
        return this.g0 != -9223372036854775807L;
    }

    @Override // y2.g
    public final void z(y2.i iVar, long j10, long j11, int i10) {
        u uVar;
        v2.f fVar = (v2.f) iVar;
        if (i10 == 0) {
            long j12 = fVar.a;
            uVar = new u(fVar.b, j10);
        } else {
            long j13 = fVar.a;
            g2.m mVar = fVar.b;
            b0 b0Var = fVar.r;
            uVar = new u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        }
        this.v.u(uVar, fVar.c, this.b, fVar.d, fVar.e, fVar.f, fVar.h, fVar.n, i10);
    }

    @Override // c3.q
    public final void D1(c3.b0 b0Var) {
    }
}
