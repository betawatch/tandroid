package j3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class k0 implements Handler.Callback, o4.s {
    public final ArrayList B;
    public final h5.y C;
    public final u D;
    public final h1 E;
    public final q1 F;
    public final i G;
    public final long H;
    public h2 I;
    public u1 J;
    public ye.f K;
    public boolean L;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public j0 W;
    public long X;
    public int Y;
    public boolean Z;
    public final e[] a;
    public n a0;
    public final Set b;
    public final e[] c;
    public final f5.t d;
    public final f5.y e;
    public final j f;
    public final g5.f h;
    public final h5.a0 n;
    public final HandlerThread r;
    public final Looper s;
    public final n2 v;
    public final m2 w;
    public final long x;
    public final k y;
    public boolean M = false;
    public long b0 = -9223372036854775807L;

    public k0(e[] eVarArr, f5.t tVar, f5.y yVar, j jVar, g5.f fVar, int i10, boolean z4, k3.f fVar2, h2 h2Var, i iVar, long j10, Looper looper, h5.y yVar2, u uVar, k3.k kVar) {
        this.D = uVar;
        this.a = eVarArr;
        this.d = tVar;
        this.e = yVar;
        this.f = jVar;
        this.h = fVar;
        this.Q = i10;
        this.R = z4;
        this.I = h2Var;
        this.G = iVar;
        this.H = j10;
        this.C = yVar2;
        this.x = jVar.g;
        jVar.getClass();
        u1 i11 = u1.i(yVar);
        this.J = i11;
        this.K = new ye.f(i11);
        this.c = new e[eVarArr.length];
        f5.p pVar = (f5.p) tVar;
        pVar.getClass();
        for (int i12 = 0; i12 < eVarArr.length; i12++) {
            e eVar = eVarArr[i12];
            eVar.e = i12;
            eVar.f = kVar;
            this.c[i12] = eVar;
            synchronized (eVar.a) {
                eVar.y = pVar;
            }
        }
        this.y = new k(this, yVar2);
        this.B = new ArrayList();
        this.b = Collections.newSetFromMap(new IdentityHashMap());
        this.v = new n2();
        this.w = new m2();
        tVar.a = this;
        tVar.b = fVar;
        this.Z = true;
        h5.a0 a2 = yVar2.a(looper, null);
        this.E = new h1(fVar2, a2);
        this.F = new q1(this, fVar2, a2, kVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.r = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.s = looper2;
        this.n = yVar2.a(looper2, this);
    }

    public static Pair H(o2 o2Var, j0 j0Var, boolean z4, int i10, boolean z10, n2 n2Var, m2 m2Var) {
        Object I;
        o2 o2Var2 = j0Var.a;
        if (o2Var.p()) {
            return null;
        }
        o2 o2Var3 = o2Var2.p() ? o2Var : o2Var2;
        try {
            Pair i11 = o2Var3.i(n2Var, m2Var, j0Var.b, j0Var.c);
            if (!o2Var.equals(o2Var3)) {
                if (o2Var.b(i11.first) == -1) {
                    if (!z4 || (I = I(n2Var, m2Var, i10, z10, i11.first, o2Var3, o2Var)) == null) {
                        return null;
                    }
                    return o2Var.i(n2Var, m2Var, o2Var.g(I, m2Var).c, -9223372036854775807L);
                }
                if (o2Var3.g(i11.first, m2Var).f && o2Var3.m(m2Var.c, n2Var, 0L).B == o2Var3.b(i11.first)) {
                    return o2Var.i(n2Var, m2Var, o2Var.g(i11.first, m2Var).c, j0Var.c);
                }
            }
            return i11;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static Object I(n2 n2Var, m2 m2Var, int i10, boolean z4, Object obj, o2 o2Var, o2 o2Var2) {
        int b10 = o2Var.b(obj);
        int h = o2Var.h();
        int i11 = 0;
        int i12 = b10;
        int i13 = -1;
        while (i11 < h && i13 == -1) {
            n2 n2Var2 = n2Var;
            m2 m2Var2 = m2Var;
            int i14 = i10;
            boolean z10 = z4;
            o2 o2Var3 = o2Var;
            i12 = o2Var3.d(i12, m2Var2, n2Var2, i14, z10);
            if (i12 == -1) {
                break;
            }
            i13 = o2Var2.b(o2Var3.l(i12));
            i11++;
            o2Var = o2Var3;
            m2Var = m2Var2;
            n2Var = n2Var2;
            i10 = i14;
            z4 = z10;
        }
        if (i13 == -1) {
            return null;
        }
        return o2Var2.l(i13);
    }

    public static void O(e eVar, long j10) {
        eVar.w = true;
        if (eVar instanceof v4.l) {
            v4.l lVar = (v4.l) eVar;
            h5.a.i(lVar.w);
            lVar.P = j10;
        }
    }

    public static void c(c2 c2Var) {
        try {
            synchronized (c2Var) {
                synchronized (c2Var) {
                }
                c2Var.a.b(c2Var.d, c2Var.e);
                return;
            }
            c2Var.a.b(c2Var.d, c2Var.e);
            return;
        } finally {
            c2Var.b(true);
        }
    }

    public static boolean q(e eVar) {
        return eVar.h != 0;
    }

    public final void A() {
        for (int i10 = 0; i10 < this.a.length; i10++) {
            e eVar = this.c[i10];
            synchronized (eVar.a) {
                eVar.y = null;
            }
            e eVar2 = this.a[i10];
            h5.a.i(eVar2.h == 0);
            eVar2.n();
        }
    }

    public final void B(int i10, int i11, o4.q0 q0Var) {
        this.K.a(1);
        q1 q1Var = this.F;
        q1Var.getClass();
        h5.a.f(i10 >= 0 && i10 <= i11 && i11 <= q1Var.b.size());
        q1Var.j = q0Var;
        q1Var.g(i10, i11);
        l(q1Var.b(), false);
    }

    public final void C() {
        int i10;
        float f10 = this.y.d().a;
        h1 h1Var = this.E;
        f1 f1Var = h1Var.h;
        f1 f1Var2 = h1Var.i;
        boolean z4 = true;
        for (f1 f1Var3 = f1Var; f1Var3 != null && f1Var3.d; f1Var3 = f1Var3.l) {
            f5.y g10 = f1Var3.g(f10, this.J.a);
            f5.y yVar = f1Var3.n;
            f5.c[] cVarArr = g10.c;
            boolean z10 = false;
            if (yVar != null && yVar.c.length == cVarArr.length) {
                for (int i11 = 0; i11 < cVarArr.length; i11++) {
                    if (g10.a(yVar, i11)) {
                    }
                }
                if (f1Var3 == f1Var2) {
                    z4 = false;
                }
            }
            if (z4) {
                h1 h1Var2 = this.E;
                f1 f1Var4 = h1Var2.h;
                boolean l10 = h1Var2.l(f1Var4);
                boolean[] zArr = new boolean[this.a.length];
                long a2 = f1Var4.a(g10, this.J.r, l10, zArr);
                u1 u1Var = this.J;
                if (u1Var.e != 4 && a2 != u1Var.r) {
                    z10 = true;
                }
                u1 u1Var2 = this.J;
                i10 = 4;
                this.J = o(u1Var2.b, a2, u1Var2.c, u1Var2.d, z10, 5);
                if (z10) {
                    F(a2);
                }
                boolean[] zArr2 = new boolean[this.a.length];
                int i12 = 0;
                while (true) {
                    e[] eVarArr = this.a;
                    if (i12 >= eVarArr.length) {
                        break;
                    }
                    e eVar = eVarArr[i12];
                    boolean q10 = q(eVar);
                    zArr2[i12] = q10;
                    o4.l0 l0Var = f1Var4.c[i12];
                    if (q10) {
                        if (l0Var != eVar.n) {
                            d(eVar);
                        } else if (zArr[i12]) {
                            long j10 = this.X;
                            eVar.w = false;
                            eVar.v = j10;
                            eVar.m(j10, false);
                        }
                    }
                    i12++;
                }
                f(zArr2);
            } else {
                i10 = 4;
                this.E.l(f1Var3);
                if (f1Var3.d) {
                    f1Var3.a(g10, Math.max(f1Var3.f.b, this.X - f1Var3.o), false, new boolean[f1Var3.i.length]);
                }
            }
            k(true);
            if (this.J.e != i10) {
                t();
                g0();
                this.n.d(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(boolean z4, boolean z10, boolean z11, boolean z12) {
        long j10;
        long j11;
        long j12;
        boolean z13;
        o2 o2Var;
        o4.v vVar;
        o2 o2Var2;
        List list;
        this.n.a.removeMessages(2);
        this.a0 = null;
        this.O = false;
        k kVar = this.y;
        kVar.f = false;
        c2.d0 d0Var = kVar.a;
        if (d0Var.a) {
            d0Var.a(d0Var.e());
            d0Var.a = false;
        }
        this.X = 1000000000000L;
        for (e eVar : this.a) {
            try {
                d(eVar);
            } catch (n | RuntimeException e6) {
                h5.a.p("ExoPlayerImplInternal", "Disable failed.", e6);
            }
        }
        if (z4) {
            for (e eVar2 : this.a) {
                if (this.b.remove(eVar2)) {
                    try {
                        eVar2.v();
                    } catch (RuntimeException e10) {
                        h5.a.p("ExoPlayerImplInternal", "Reset failed.", e10);
                    }
                }
            }
        }
        this.V = 0;
        u1 u1Var = this.J;
        o4.v vVar2 = u1Var.b;
        long j13 = u1Var.r;
        if (!this.J.b.a()) {
            u1 u1Var2 = this.J;
            m2 m2Var = this.w;
            o4.v vVar3 = u1Var2.b;
            o2 o2Var3 = u1Var2.a;
            if (!o2Var3.p() && !o2Var3.g(vVar3.a, m2Var).f) {
                j10 = this.J.r;
                if (z10) {
                    this.W = null;
                    Pair h = h(this.J.a);
                    vVar2 = (o4.v) h.first;
                    j13 = ((Long) h.second).longValue();
                    j10 = -9223372036854775807L;
                    if (!vVar2.equals(this.J.b)) {
                        z13 = true;
                        j11 = j13;
                        j12 = -9223372036854775807L;
                        this.E.b();
                        this.P = false;
                        o2Var = this.J.a;
                        if (z11 || !(o2Var instanceof e2)) {
                            vVar = vVar2;
                            o2Var2 = o2Var;
                        } else {
                            e2 e2Var = (e2) o2Var;
                            o4.q0 q0Var = this.F.j;
                            o2[] o2VarArr = e2Var.r;
                            o2[] o2VarArr2 = new o2[o2VarArr.length];
                            for (int i10 = 0; i10 < o2VarArr.length; i10++) {
                                o2VarArr2[i10] = new d2(o2VarArr[i10]);
                            }
                            e2 e2Var2 = new e2(o2VarArr2, e2Var.s, q0Var);
                            if (vVar2.b != -1) {
                                e2Var2.g(vVar2.a, this.w);
                                int i11 = this.w.c;
                                n2 n2Var = this.v;
                                e2Var2.m(i11, n2Var, 0L);
                                if (n2Var.a()) {
                                    o2Var2 = e2Var2;
                                    vVar = new o4.v(vVar2.a, vVar2.d);
                                }
                            }
                            o2Var2 = e2Var2;
                            vVar = vVar2;
                        }
                        u1 u1Var3 = this.J;
                        int i12 = u1Var3.e;
                        n nVar = z12 ? null : u1Var3.f;
                        o4.t0 t0Var = z13 ? o4.t0.d : u1Var3.h;
                        f5.y yVar = z13 ? this.e : u1Var3.i;
                        if (z13) {
                            s8.t tVar = s8.v.b;
                            list = s8.i0.e;
                        } else {
                            list = u1Var3.j;
                        }
                        this.J = new u1(o2Var2, vVar, j12, j11, i12, nVar, false, t0Var, yVar, list, vVar, u1Var3.l, u1Var3.m, u1Var3.n, j11, 0L, j11, 0L, false);
                        if (z11) {
                            q1 q1Var = this.F;
                            HashMap hashMap = q1Var.f;
                            for (o1 o1Var : hashMap.values()) {
                                try {
                                    o1Var.a.o(o1Var.b);
                                } catch (RuntimeException e11) {
                                    h5.a.p("MediaSourceList", "Failed to release child source.", e11);
                                }
                                o4.a aVar = o1Var.a;
                                f7.b bVar = o1Var.c;
                                aVar.r(bVar);
                                o1Var.a.q(bVar);
                            }
                            hashMap.clear();
                            q1Var.g.clear();
                            q1Var.k = false;
                            return;
                        }
                        return;
                    }
                }
                j11 = j13;
                j12 = j10;
                z13 = false;
                this.E.b();
                this.P = false;
                o2Var = this.J.a;
                if (z11) {
                }
                vVar = vVar2;
                o2Var2 = o2Var;
                u1 u1Var32 = this.J;
                int i122 = u1Var32.e;
                n nVar2 = z12 ? null : u1Var32.f;
                o4.t0 t0Var2 = z13 ? o4.t0.d : u1Var32.h;
                f5.y yVar2 = z13 ? this.e : u1Var32.i;
                if (z13) {
                }
                this.J = new u1(o2Var2, vVar, j12, j11, i122, nVar2, false, t0Var2, yVar2, list, vVar, u1Var32.l, u1Var32.m, u1Var32.n, j11, 0L, j11, 0L, false);
                if (z11) {
                }
            }
        }
        j10 = this.J.c;
        if (z10) {
        }
        j11 = j13;
        j12 = j10;
        z13 = false;
        this.E.b();
        this.P = false;
        o2Var = this.J.a;
        if (z11) {
        }
        vVar = vVar2;
        o2Var2 = o2Var;
        u1 u1Var322 = this.J;
        int i1222 = u1Var322.e;
        n nVar22 = z12 ? null : u1Var322.f;
        o4.t0 t0Var22 = z13 ? o4.t0.d : u1Var322.h;
        f5.y yVar22 = z13 ? this.e : u1Var322.i;
        if (z13) {
        }
        this.J = new u1(o2Var2, vVar, j12, j11, i1222, nVar22, false, t0Var22, yVar22, list, vVar, u1Var322.l, u1Var322.m, u1Var322.n, j11, 0L, j11, 0L, false);
        if (z11) {
        }
    }

    public final void E() {
        f1 f1Var = this.E.h;
        this.N = f1Var != null && f1Var.f.h && this.M;
    }

    public final void F(long j10) {
        f1 f1Var = this.E.h;
        long j11 = j10 + (f1Var == null ? 1000000000000L : f1Var.o);
        this.X = j11;
        this.y.a.a(j11);
        for (e eVar : this.a) {
            if (q(eVar)) {
                long j12 = this.X;
                eVar.w = false;
                eVar.v = j12;
                eVar.m(j12, false);
            }
        }
        for (f1 f1Var2 = r0.h; f1Var2 != null; f1Var2 = f1Var2.l) {
            for (f5.c cVar : f1Var2.n.c) {
                if (cVar != null) {
                    cVar.getClass();
                }
            }
        }
    }

    public final void G(o2 o2Var, o2 o2Var2) {
        if (o2Var.p() && o2Var2.p()) {
            return;
        }
        ArrayList arrayList = this.B;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            android.support.v4.media.a.v(arrayList.get(size));
            throw null;
        }
    }

    public final void J(boolean z4) {
        o4.v vVar = this.E.h.f.a;
        long L = L(vVar, this.J.r, true, false);
        if (L != this.J.r) {
            u1 u1Var = this.J;
            this.J = o(vVar, L, u1Var.c, u1Var.d, z4, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:20|(7:(9:64|65|(1:83)(1:71)|72|(1:82)|79|80|11|12)(1:22)|42|43|44|10|11|12)|23|24|(1:26)(1:60)|27|(1:29)(1:59)|30|31|32|(1:34)(1:57)|35|36|37|38|39|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0153, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0154, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0155, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0157, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0159, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015a, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:6:0x0097, B:8:0x00a1, B:16:0x00ad, B:18:0x00b3, B:19:0x00b6, B:20:0x00be, B:67:0x00ce, B:71:0x00d6), top: B:5:0x0097 }] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, o4.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(j0 j0Var) {
        long longValue;
        o4.v n10;
        long j10;
        boolean z4;
        long j11;
        boolean z10;
        o4.v vVar;
        long j12;
        long d;
        long j13;
        u1 u1Var;
        int i10;
        long j14;
        o4.v vVar2;
        int i11;
        long j15;
        long L;
        u1 u1Var2;
        o4.v vVar3;
        o2 o2Var;
        long j16;
        k0 k0Var = this;
        k0Var.K.a(1);
        Pair H = H(k0Var.J.a, j0Var, true, k0Var.Q, k0Var.R, k0Var.v, k0Var.w);
        try {
            if (H == null) {
                Pair h = k0Var.h(k0Var.J.a);
                n10 = (o4.v) h.first;
                longValue = ((Long) h.second).longValue();
                z4 = !k0Var.J.a.p();
                j11 = -9223372036854775807L;
            } else {
                Object obj = H.first;
                longValue = ((Long) H.second).longValue();
                long j17 = j0Var.c == -9223372036854775807L ? -9223372036854775807L : longValue;
                n10 = k0Var.E.n(k0Var.J.a, obj, longValue);
                if (!n10.a()) {
                    j10 = 0;
                    z4 = j0Var.c == -9223372036854775807L;
                    j11 = j17;
                    if (!k0Var.J.a.p()) {
                        k0Var.W = j0Var;
                    } else if (H == null) {
                        if (k0Var.J.e != 1) {
                            k0Var.Y(4);
                        }
                        k0Var.D(false, true, false, true);
                    } else {
                        try {
                            if (n10.equals(k0Var.J.b)) {
                                try {
                                    f1 f1Var = k0Var.E.h;
                                    d = (f1Var == null || !f1Var.d || longValue == j10) ? longValue : f1Var.a.d(longValue, k0Var.I);
                                    if (h5.d0.S(d) != h5.d0.S(k0Var.J.r) || ((i10 = (u1Var = k0Var.J).e) != 2 && i10 != 3)) {
                                        z10 = z4;
                                        j13 = j11;
                                        vVar = n10;
                                    }
                                    j14 = u1Var.r;
                                    z10 = z4;
                                    vVar2 = n10;
                                    i11 = 2;
                                    j15 = j14;
                                    k0Var.J = k0Var.o(vVar2, j14, j11, j15, z10, i11);
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z10 = z4;
                                    vVar = n10;
                                    j12 = longValue;
                                    k0Var.J = k0Var.o(vVar, j12, j11, j12, z10, 2);
                                    throw th;
                                }
                            }
                            z10 = z4;
                            j13 = j11;
                            vVar = n10;
                            d = longValue;
                            k0Var.h0(o2Var, vVar3, o2Var, u1Var2.b, j16, true);
                            vVar2 = vVar3;
                            j11 = j16;
                            j14 = L;
                            i11 = 2;
                            j15 = j14;
                            k0Var = this;
                            k0Var.J = k0Var.o(vVar2, j14, j11, j15, z10, i11);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            vVar = vVar3;
                            j11 = j16;
                            j12 = L;
                            k0Var.J = k0Var.o(vVar, j12, j11, j12, z10, 2);
                            throw th;
                        }
                        boolean z11 = k0Var.J.e == 4;
                        h1 h1Var = k0Var.E;
                        L = k0Var.L(vVar, d, h1Var.h != h1Var.i, z11);
                        z10 |= longValue != L;
                        u1Var2 = k0Var.J;
                        vVar3 = vVar;
                        o2Var = u1Var2.a;
                        j16 = j13;
                    }
                    z10 = z4;
                    vVar2 = n10;
                    j14 = longValue;
                    i11 = 2;
                    j15 = j14;
                    k0Var = this;
                    k0Var.J = k0Var.o(vVar2, j14, j11, j15, z10, i11);
                    return;
                }
                k0Var.J.a.g(n10.a, k0Var.w);
                longValue = k0Var.w.f(n10.b) == n10.c ? k0Var.w.h.b : 0L;
                j11 = j17;
                z4 = true;
            }
            if (!k0Var.J.a.p()) {
            }
            z10 = z4;
            vVar2 = n10;
            j14 = longValue;
            i11 = 2;
            j15 = j14;
            k0Var = this;
            k0Var.J = k0Var.o(vVar2, j14, j11, j15, z10, i11);
            return;
        } catch (Throwable th4) {
            th = th4;
            z10 = z4;
        }
        j10 = 0;
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, o4.t] */
    public final long L(o4.v vVar, long j10, boolean z4, boolean z10) {
        d0();
        this.O = false;
        if (z10 || this.J.e == 3) {
            Y(2);
        }
        h1 h1Var = this.E;
        f1 f1Var = h1Var.h;
        f1 f1Var2 = f1Var;
        while (f1Var2 != null && !vVar.equals(f1Var2.f.a)) {
            f1Var2 = f1Var2.l;
        }
        if (z4 || f1Var != f1Var2 || (f1Var2 != null && f1Var2.o + j10 < 0)) {
            e[] eVarArr = this.a;
            for (e eVar : eVarArr) {
                d(eVar);
            }
            if (f1Var2 != null) {
                while (h1Var.h != f1Var2) {
                    h1Var.a();
                }
                h1Var.l(f1Var2);
                f1Var2.o = 1000000000000L;
                f(new boolean[eVarArr.length]);
            }
        }
        if (f1Var2 != null) {
            ?? r92 = f1Var2.a;
            h1Var.l(f1Var2);
            if (!f1Var2.d) {
                f1Var2.f = f1Var2.f.b(j10);
            } else if (f1Var2.e) {
                j10 = r92.j(j10);
                r92.k(j10 - this.x);
            }
            F(j10);
            t();
        } else {
            h1Var.b();
            F(j10);
        }
        k(false);
        this.n.d(2);
        return j10;
    }

    public final void M(c2 c2Var) {
        Looper looper = c2Var.f;
        Looper looper2 = this.s;
        h5.a0 a0Var = this.n;
        if (looper != looper2) {
            a0Var.a(15, c2Var).b();
            return;
        }
        c(c2Var);
        int i10 = this.J.e;
        if (i10 == 3 || i10 == 2) {
            a0Var.d(2);
        }
    }

    public final void N(c2 c2Var) {
        Looper looper = c2Var.f;
        if (looper.getThread().isAlive()) {
            this.C.a(looper, null).c(new eh.m(this, c2Var));
        } else {
            h5.a.K("TAG", "Trying to send message on a dead thread.");
            c2Var.b(false);
        }
    }

    public final void P(boolean z4, AtomicBoolean atomicBoolean) {
        if (this.S != z4) {
            this.S = z4;
            if (!z4) {
                for (e eVar : this.a) {
                    if (!q(eVar) && this.b.remove(eVar)) {
                        eVar.v();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void Q(h0 h0Var) {
        this.K.a(1);
        int i10 = h0Var.c;
        o4.q0 q0Var = h0Var.b;
        ArrayList arrayList = h0Var.a;
        if (i10 != -1) {
            this.W = new j0(new e2(arrayList, q0Var), h0Var.c, h0Var.d);
        }
        q1 q1Var = this.F;
        ArrayList arrayList2 = q1Var.b;
        q1Var.g(0, arrayList2.size());
        l(q1Var.a(arrayList2.size(), arrayList, q0Var), false);
    }

    public final void R(boolean z4) {
        if (z4 == this.U) {
            return;
        }
        this.U = z4;
        if (z4 || !this.J.o) {
            return;
        }
        this.n.d(2);
    }

    public final void S(boolean z4) {
        this.M = z4;
        E();
        if (this.N) {
            h1 h1Var = this.E;
            if (h1Var.i != h1Var.h) {
                J(true);
                k(false);
            }
        }
    }

    public final void T(int i10, int i11, boolean z4, boolean z10) {
        this.K.a(z10 ? 1 : 0);
        ye.f fVar = this.K;
        fVar.b = true;
        fVar.f = true;
        fVar.g = i11;
        this.J = this.J.d(i10, z4);
        this.O = false;
        for (f1 f1Var = this.E.h; f1Var != null; f1Var = f1Var.l) {
            for (f5.c cVar : f1Var.n.c) {
                if (cVar != null) {
                    cVar.getClass();
                }
            }
        }
        if (!Z()) {
            d0();
            g0();
            return;
        }
        int i12 = this.J.e;
        h5.a0 a0Var = this.n;
        if (i12 == 3) {
            b0();
            a0Var.d(2);
        } else if (i12 == 2) {
            a0Var.d(2);
        }
    }

    public final void U(v1 v1Var) {
        this.n.a.removeMessages(16);
        k kVar = this.y;
        kVar.c(v1Var);
        v1 d = kVar.d();
        n(d, d.a, true, true);
    }

    public final void V(int i10) {
        this.Q = i10;
        o2 o2Var = this.J.a;
        h1 h1Var = this.E;
        h1Var.f = i10;
        if (!h1Var.o(o2Var)) {
            J(true);
        }
        k(false);
    }

    public final void W(boolean z4) {
        this.R = z4;
        o2 o2Var = this.J.a;
        h1 h1Var = this.E;
        h1Var.g = z4;
        if (!h1Var.o(o2Var)) {
            J(true);
        }
        k(false);
    }

    public final void X(o4.q0 q0Var) {
        this.K.a(1);
        q1 q1Var = this.F;
        int size = q1Var.b.size();
        if (q0Var.getLength() != size) {
            q0Var = q0Var.g().e(size);
        }
        q1Var.j = q0Var;
        l(q1Var.b(), false);
    }

    public final void Y(int i10) {
        u1 u1Var = this.J;
        if (u1Var.e != i10) {
            if (i10 != 2) {
                this.b0 = -9223372036854775807L;
            }
            this.J = u1Var.g(i10);
        }
    }

    public final boolean Z() {
        u1 u1Var = this.J;
        return u1Var.l && u1Var.m == 0;
    }

    @Override // o4.s
    public final void a(o4.t tVar) {
        this.n.a(8, tVar).b();
    }

    public final boolean a0(o2 o2Var, o4.v vVar) {
        if (vVar.a() || o2Var.p()) {
            return false;
        }
        int i10 = o2Var.g(vVar.a, this.w).c;
        n2 n2Var = this.v;
        o2Var.n(i10, n2Var);
        return n2Var.a() && n2Var.r && n2Var.f != -9223372036854775807L;
    }

    public final void b(h0 h0Var, int i10) {
        this.K.a(1);
        q1 q1Var = this.F;
        if (i10 == -1) {
            i10 = q1Var.b.size();
        }
        l(q1Var.a(i10, h0Var.a, h0Var.b), false);
    }

    public final void b0() {
        this.O = false;
        k kVar = this.y;
        kVar.f = true;
        kVar.a.b();
        for (e eVar : this.a) {
            if (q(eVar)) {
                h5.a.i(eVar.h == 1);
                eVar.h = 2;
                eVar.p();
            }
        }
    }

    public final void c0(boolean z4, boolean z10) {
        D(z4 || !this.S, false, true, false);
        this.K.a(z10 ? 1 : 0);
        this.f.b(true);
        Y(1);
    }

    public final void d(e eVar) {
        if (q(eVar)) {
            k kVar = this.y;
            if (eVar == kVar.c) {
                kVar.d = null;
                kVar.c = null;
                kVar.e = true;
            }
            int i10 = eVar.h;
            if (i10 == 2) {
                h5.a.i(i10 == 2);
                eVar.h = 1;
                eVar.q();
            }
            h5.a.i(eVar.h == 1);
            eVar.c.l();
            eVar.h = 0;
            eVar.n = null;
            eVar.r = null;
            eVar.w = false;
            eVar.k();
            this.V--;
        }
    }

    public final void d0() {
        int i10;
        k kVar = this.y;
        kVar.f = false;
        c2.d0 d0Var = kVar.a;
        if (d0Var.a) {
            d0Var.a(d0Var.e());
            d0Var.a = false;
        }
        for (e eVar : this.a) {
            if (q(eVar) && (i10 = eVar.h) == 2) {
                h5.a.i(i10 == 2);
                eVar.h = 1;
                eVar.q();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:325:0x0536, code lost:
    
        if (r3 >= r5.h) goto L294;
     */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f9 A[EDGE_INSN: B:73:0x02f9->B:74:0x02f9 BREAK  A[LOOP:0: B:41:0x029b->B:52:0x02f6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0348  */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, o4.t] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object, o4.t] */
    /* JADX WARN: Type inference failed for: r2v77, types: [java.lang.Object, o4.n0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, o4.t] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, o4.t] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, o4.n0] */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.Object, o4.n0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        n nVar;
        long j10;
        long j11;
        boolean z4;
        int i10;
        long j12;
        long j13;
        long j14;
        boolean z10;
        boolean z11;
        boolean z12;
        long j15;
        long max;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        u1 u1Var;
        boolean z17;
        int i11;
        o4.l0 l0Var;
        long j16;
        f1 f1Var;
        g1 e6;
        long j17;
        f1 f1Var2;
        f1 f1Var3;
        h1 h1Var;
        boolean z18;
        f1 f1Var4;
        f1 f1Var5;
        f1 a2;
        boolean z19;
        boolean z20;
        int i12;
        e[] eVarArr;
        this.C.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.n.a.removeMessages(2);
        n nVar2 = null;
        if (this.J.a.p() || !this.F.k) {
            nVar = null;
            j10 = uptimeMillis;
            j11 = Long.MIN_VALUE;
            z4 = false;
            i10 = 1;
            j12 = -9223372036854775807L;
        } else {
            h1 h1Var2 = this.E;
            long j18 = this.X;
            f1 f1Var6 = h1Var2.j;
            if (f1Var6 != null) {
                h5.a.i(f1Var6.l == null);
                if (f1Var6.d) {
                    j16 = -9223372036854775807L;
                    f1Var6.a.t(j18 - f1Var6.o);
                    h1 h1Var3 = this.E;
                    f1Var = h1Var3.j;
                    if (f1Var != null || (!f1Var.f.i && f1Var.d && ((!f1Var.e || f1Var.a.r() == Long.MIN_VALUE) && h1Var3.j.f.e != j16 && h1Var3.k < 100))) {
                        h1 h1Var4 = this.E;
                        long j19 = this.X;
                        u1 u1Var2 = this.J;
                        f1 f1Var7 = h1Var4.j;
                        e6 = f1Var7 != null ? h1Var4.e(u1Var2.a, u1Var2.b, u1Var2.c, u1Var2.r) : h1Var4.d(u1Var2.a, f1Var7, j19);
                        if (e6 != null) {
                            h1 h1Var5 = this.E;
                            e[] eVarArr2 = this.c;
                            f5.t tVar = this.d;
                            g5.q qVar = this.f.a;
                            q1 q1Var = this.F;
                            f5.y yVar = this.e;
                            f1 f1Var8 = h1Var5.j;
                            if (f1Var8 == null) {
                                j17 = 1000000000000L;
                                j10 = uptimeMillis;
                                j11 = Long.MIN_VALUE;
                            } else {
                                j11 = Long.MIN_VALUE;
                                j10 = uptimeMillis;
                                j17 = (f1Var8.o + f1Var8.f.e) - e6.b;
                            }
                            f1 f1Var9 = new f1(eVarArr2, j17, tVar, qVar, q1Var, e6, yVar);
                            f1 f1Var10 = h1Var5.j;
                            if (f1Var10 == null) {
                                h1Var5.h = f1Var9;
                                h1Var5.i = f1Var9;
                            } else if (f1Var9 != f1Var10.l) {
                                f1Var10.b();
                                f1Var10.l = f1Var9;
                                f1Var10.c();
                            }
                            h1Var5.l = null;
                            h1Var5.j = f1Var9;
                            h1Var5.k++;
                            h1Var5.k();
                            f1Var9.a.f(this, e6.b);
                            if (this.E.h == f1Var9) {
                                F(e6.b);
                            }
                            k(false);
                            if (this.P) {
                                this.P = p();
                                e0();
                            } else {
                                t();
                            }
                            e[] eVarArr3 = this.a;
                            h1 h1Var6 = this.E;
                            f1Var2 = h1Var6.i;
                            if (f1Var2 != null) {
                                if (f1Var2.l == null || this.N) {
                                    j12 = j16;
                                    i10 = 1;
                                    if (f1Var2.f.i || this.N) {
                                        for (int i13 = 0; i13 < eVarArr3.length; i13++) {
                                            e eVar = eVarArr3[i13];
                                            o4.l0 l0Var2 = f1Var2.c[i13];
                                            if (l0Var2 != null && eVar.n == l0Var2 && eVar.h()) {
                                                long j20 = f1Var2.f.e;
                                                O(eVar, (j20 == j12 || j20 == j11) ? j12 : j20 + f1Var2.o);
                                            }
                                        }
                                    }
                                } else if (f1Var2.d) {
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 < eVarArr3.length) {
                                            e eVar2 = eVarArr3[i14];
                                            o4.l0 l0Var3 = f1Var2.c[i14];
                                            if (eVar2.n != l0Var3) {
                                                break;
                                            }
                                            if (l0Var3 != null && !eVar2.h()) {
                                                f1 f1Var11 = f1Var2.l;
                                                if (!f1Var2.f.f) {
                                                    break;
                                                }
                                                if (!f1Var11.d) {
                                                    break;
                                                }
                                                if (!(eVar2 instanceof v4.l) && !(eVar2 instanceof e4.f) && eVar2.v < f1Var11.e()) {
                                                    break;
                                                }
                                            }
                                            i14++;
                                        } else {
                                            f1 f1Var12 = f1Var2.l;
                                            if (f1Var12.d || this.X >= f1Var12.e()) {
                                                f5.y yVar2 = f1Var2.n;
                                                f1 f1Var13 = h1Var6.i;
                                                h5.a.i((f1Var13 == null || f1Var13.l == null) ? false : true);
                                                h1Var6.i = h1Var6.i.l;
                                                h1Var6.k();
                                                f1 f1Var14 = h1Var6.i;
                                                f5.y yVar3 = f1Var14.n;
                                                o2 o2Var = this.J.a;
                                                j12 = j16;
                                                i10 = 1;
                                                h0(o2Var, f1Var14.f.a, o2Var, f1Var2.f.a, -9223372036854775807L, false);
                                                if (!f1Var14.d || f1Var14.a.n() == j12) {
                                                    for (int i15 = 0; i15 < eVarArr3.length; i15++) {
                                                        boolean b10 = yVar2.b(i15);
                                                        boolean b11 = yVar3.b(i15);
                                                        if (b10 && !eVarArr3[i15].w) {
                                                            boolean z21 = this.c[i15].b == -2;
                                                            g2 g2Var = yVar2.b[i15];
                                                            g2 g2Var2 = yVar3.b[i15];
                                                            if (!b11 || !g2Var2.equals(g2Var) || z21) {
                                                                O(eVarArr3[i15], f1Var14.e());
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    long e10 = f1Var14.e();
                                                    for (e eVar3 : eVarArr3) {
                                                        if (eVar3.n != null) {
                                                            O(eVar3, e10);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                h1 h1Var7 = this.E;
                                f1Var3 = h1Var7.i;
                                if (f1Var3 != null && h1Var7.h != f1Var3 && !f1Var3.g) {
                                    f5.y yVar4 = f1Var3.n;
                                    o4.l0[] l0VarArr = f1Var3.c;
                                    z20 = false;
                                    i12 = 0;
                                    while (true) {
                                        eVarArr = this.a;
                                        if (i12 < eVarArr.length) {
                                            break;
                                        }
                                        e eVar4 = eVarArr[i12];
                                        if (q(eVar4)) {
                                            boolean z22 = eVar4.n != l0VarArr[i12];
                                            if (!yVar4.b(i12) || z22) {
                                                if (!eVar4.w) {
                                                    f5.c cVar = yVar4.c[i12];
                                                    int p10 = cVar != null ? cVar.p() : 0;
                                                    n0[] n0VarArr = new n0[p10];
                                                    for (int i16 = 0; i16 < p10; i16++) {
                                                        n0VarArr[i16] = cVar.e(i16);
                                                    }
                                                    eVar4.u(n0VarArr, l0VarArr[i12], f1Var3.e(), f1Var3.o);
                                                } else if (eVar4.i()) {
                                                    d(eVar4);
                                                } else {
                                                    z20 = true;
                                                }
                                            }
                                        }
                                        i12++;
                                    }
                                    if (!z20) {
                                        f(new boolean[eVarArr.length]);
                                    }
                                }
                                h1Var = this.E;
                                z18 = false;
                                while (Z() && !this.N && (f1Var4 = h1Var.h) != null && (f1Var5 = f1Var4.l) != null && this.X >= f1Var5.e() && f1Var5.g) {
                                    if (z18) {
                                        u();
                                    }
                                    a2 = h1Var.a();
                                    a2.getClass();
                                    if (this.J.b.a.equals(a2.f.a.a)) {
                                        o4.v vVar = this.J.b;
                                        if (vVar.b == -1) {
                                            o4.v vVar2 = a2.f.a;
                                            if (vVar2.b == -1 && vVar.e != vVar2.e) {
                                                z19 = true;
                                                g1 g1Var = a2.f;
                                                o4.v vVar3 = g1Var.a;
                                                long j21 = g1Var.b;
                                                this.J = o(vVar3, j21, g1Var.c, j21, !z19, 0);
                                                E();
                                                g0();
                                                nVar2 = nVar2;
                                                z18 = true;
                                            }
                                        }
                                    }
                                    z19 = false;
                                    g1 g1Var2 = a2.f;
                                    o4.v vVar32 = g1Var2.a;
                                    long j212 = g1Var2.b;
                                    this.J = o(vVar32, j212, g1Var2.c, j212, !z19, 0);
                                    E();
                                    g0();
                                    nVar2 = nVar2;
                                    z18 = true;
                                }
                                nVar = nVar2;
                                z4 = false;
                            }
                            j12 = j16;
                            i10 = 1;
                            h1 h1Var72 = this.E;
                            f1Var3 = h1Var72.i;
                            if (f1Var3 != null) {
                                f5.y yVar42 = f1Var3.n;
                                o4.l0[] l0VarArr2 = f1Var3.c;
                                z20 = false;
                                i12 = 0;
                                while (true) {
                                    eVarArr = this.a;
                                    if (i12 < eVarArr.length) {
                                    }
                                    i12++;
                                }
                                if (!z20) {
                                }
                            }
                            h1Var = this.E;
                            z18 = false;
                            while (Z()) {
                                if (z18) {
                                }
                                a2 = h1Var.a();
                                a2.getClass();
                                if (this.J.b.a.equals(a2.f.a.a)) {
                                }
                                z19 = false;
                                g1 g1Var22 = a2.f;
                                o4.v vVar322 = g1Var22.a;
                                long j2122 = g1Var22.b;
                                this.J = o(vVar322, j2122, g1Var22.c, j2122, !z19, 0);
                                E();
                                g0();
                                nVar2 = nVar2;
                                z18 = true;
                            }
                            nVar = nVar2;
                            z4 = false;
                        }
                    }
                    j10 = uptimeMillis;
                    j11 = Long.MIN_VALUE;
                    if (this.P) {
                    }
                    e[] eVarArr32 = this.a;
                    h1 h1Var62 = this.E;
                    f1Var2 = h1Var62.i;
                    if (f1Var2 != null) {
                    }
                    j12 = j16;
                    i10 = 1;
                    h1 h1Var722 = this.E;
                    f1Var3 = h1Var722.i;
                    if (f1Var3 != null) {
                    }
                    h1Var = this.E;
                    z18 = false;
                    while (Z()) {
                    }
                    nVar = nVar2;
                    z4 = false;
                }
            }
            j16 = -9223372036854775807L;
            h1 h1Var32 = this.E;
            f1Var = h1Var32.j;
            if (f1Var != null) {
            }
            h1 h1Var42 = this.E;
            long j192 = this.X;
            u1 u1Var22 = this.J;
            f1 f1Var72 = h1Var42.j;
            if (f1Var72 != null) {
            }
            if (e6 != null) {
            }
            j10 = uptimeMillis;
            j11 = Long.MIN_VALUE;
            if (this.P) {
            }
            e[] eVarArr322 = this.a;
            h1 h1Var622 = this.E;
            f1Var2 = h1Var622.i;
            if (f1Var2 != null) {
            }
            j12 = j16;
            i10 = 1;
            h1 h1Var7222 = this.E;
            f1Var3 = h1Var7222.i;
            if (f1Var3 != null) {
            }
            h1Var = this.E;
            z18 = false;
            while (Z()) {
            }
            nVar = nVar2;
            z4 = false;
        }
        int i17 = this.J.e;
        if (i17 == i10 || i17 == 4) {
            return;
        }
        f1 f1Var15 = this.E.h;
        if (f1Var15 == null) {
            this.n.a.sendEmptyMessageAtTime(2, j10 + 10);
            return;
        }
        h5.a.c("doSomeWork");
        g0();
        if (f1Var15.d) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            j13 = 10;
            j14 = 1000;
            f1Var15.a.k(this.J.r - this.x);
            z10 = true;
            z11 = true;
            int i18 = 0;
            while (true) {
                e[] eVarArr4 = this.a;
                if (i18 >= eVarArr4.length) {
                    break;
                }
                e eVar5 = eVarArr4[i18];
                if (q(eVar5)) {
                    eVar5.t(this.X, elapsedRealtime);
                    z11 = z11 && eVar5.i();
                    boolean z23 = f1Var15.c[i18] != eVar5.n;
                    boolean z24 = z23 || (!z23 && eVar5.h()) || eVar5.j() || eVar5.i();
                    z10 = z10 && z24;
                    if (!z24) {
                        o4.l0 l0Var4 = eVar5.n;
                        l0Var4.getClass();
                        l0Var4.a();
                    }
                }
                i18++;
            }
        } else {
            j13 = 10;
            j14 = 1000;
            f1Var15.a.i();
            z10 = true;
            z11 = true;
        }
        long j22 = f1Var15.f.e;
        boolean z25 = z11 && f1Var15.d && (j22 == j12 || j22 <= this.J.r);
        if (z25 && this.N) {
            this.N = z4;
            T(this.J.m, 5, z4, z4);
        }
        if (z25 && f1Var15.f.i) {
            Y(4);
            d0();
        } else {
            u1 u1Var3 = this.J;
            if (u1Var3.e == 2) {
                h1 h1Var8 = this.E;
                if (this.V == 0) {
                    z13 = r();
                    z12 = z10;
                    j15 = j12;
                } else {
                    if (z10) {
                        if (u1Var3.g) {
                            long j23 = a0(u1Var3.a, h1Var8.h.f.a) ? this.G.h : j12;
                            f1 f1Var16 = h1Var8.j;
                            boolean z26 = f1Var16.d && (!f1Var16.e || f1Var16.a.r() == j11) && f1Var16.f.i;
                            boolean z27 = f1Var16.f.a.a() && !f1Var16.d;
                            if (!z26 && !z27) {
                                j jVar = this.f;
                                u1 u1Var4 = this.J;
                                o2 o2Var2 = u1Var4.a;
                                long j24 = u1Var4.p;
                                f1 f1Var17 = this.E.j;
                                z12 = z10;
                                if (f1Var17 == null) {
                                    max = 0;
                                    j15 = j12;
                                } else {
                                    j15 = j12;
                                    max = Math.max(0L, j24 - (this.X - f1Var17.o));
                                }
                                float f10 = this.y.d().a;
                                boolean z28 = this.O;
                                jVar.getClass();
                                long y10 = h5.d0.y(max, f10);
                                long j25 = z28 ? jVar.e : jVar.d;
                                if (j23 != j15) {
                                    j25 = Math.min(j23 / 2, j25);
                                }
                                if (j25 > 0 && y10 < j25) {
                                    g5.q qVar2 = jVar.a;
                                    synchronized (qVar2) {
                                        int i19 = qVar2.d * qVar2.b;
                                    }
                                }
                                z13 = true;
                            }
                        }
                        z12 = z10;
                        j15 = j12;
                        z13 = true;
                    } else {
                        z12 = z10;
                        j15 = j12;
                    }
                    z13 = false;
                }
                if (z13) {
                    Y(3);
                    this.a0 = nVar;
                    if (Z()) {
                        b0();
                    }
                }
            } else {
                z12 = z10;
                j15 = j12;
            }
            if (this.J.e == 3 && (this.V != 0 ? !z12 : !r())) {
                this.O = Z();
                Y(2);
                if (this.O) {
                    for (f1 f1Var18 = this.E.h; f1Var18 != null; f1Var18 = f1Var18.l) {
                        for (f5.c cVar2 : f1Var18.n.c) {
                            if (cVar2 != null) {
                                cVar2.getClass();
                            }
                        }
                    }
                    i iVar = this.G;
                    long j26 = iVar.h;
                    if (j26 != j15) {
                        long j27 = j26 + iVar.b;
                        iVar.h = j27;
                        long j28 = iVar.g;
                        if (j28 != j15 && j27 > j28) {
                            iVar.h = j28;
                        }
                        iVar.l = j15;
                    }
                }
                d0();
            }
        }
        if (this.J.e == 2) {
            int i20 = 0;
            while (true) {
                e[] eVarArr5 = this.a;
                if (i20 >= eVarArr5.length) {
                    break;
                }
                if (q(eVarArr5[i20]) && (l0Var = this.a[i20].n) == f1Var15.c[i20]) {
                    l0Var.getClass();
                    l0Var.a();
                }
                i20++;
            }
            u1 u1Var5 = this.J;
            if (!u1Var5.g && u1Var5.q < 500000 && p()) {
                z14 = true;
                if (z14) {
                    this.b0 = -9223372036854775807L;
                } else if (this.b0 == -9223372036854775807L) {
                    this.C.getClass();
                    this.b0 = SystemClock.elapsedRealtime();
                } else {
                    this.C.getClass();
                    if (SystemClock.elapsedRealtime() - this.b0 >= 4000) {
                        throw new IllegalStateException("Playback stuck buffering and not loading");
                    }
                }
                z15 = !Z() && this.J.e == 3;
                z16 = !this.U && this.T && z15;
                u1Var = this.J;
                if (u1Var.o == z16) {
                    z17 = z16;
                    this.J = new u1(u1Var.a, u1Var.b, u1Var.c, u1Var.d, u1Var.e, u1Var.f, u1Var.g, u1Var.h, u1Var.i, u1Var.j, u1Var.k, u1Var.l, u1Var.m, u1Var.n, u1Var.p, u1Var.q, u1Var.r, u1Var.s, z17);
                } else {
                    z17 = z16;
                }
                this.T = false;
                if (!z17 && (i11 = this.J.e) != 4) {
                    if (!z15 || i11 == 2) {
                        this.n.a.sendEmptyMessageAtTime(2, j10 + j13);
                    } else if (i11 == 3 && this.V != 0) {
                        this.n.a.sendEmptyMessageAtTime(2, j10 + j14);
                    }
                }
                h5.a.q();
            }
        }
        z14 = false;
        if (z14) {
        }
        if (Z()) {
        }
        if (this.U) {
        }
        u1Var = this.J;
        if (u1Var.o == z16) {
        }
        this.T = false;
        if (!z17) {
            if (z15) {
            }
            this.n.a.sendEmptyMessageAtTime(2, j10 + j13);
        }
        h5.a.q();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, o4.n0] */
    public final void e0() {
        f1 f1Var = this.E.j;
        boolean z4 = this.P || (f1Var != null && f1Var.a.b());
        u1 u1Var = this.J;
        if (z4 != u1Var.g) {
            this.J = new u1(u1Var.a, u1Var.b, u1Var.c, u1Var.d, u1Var.e, u1Var.f, z4, u1Var.h, u1Var.i, u1Var.j, u1Var.k, u1Var.l, u1Var.m, u1Var.n, u1Var.p, u1Var.q, u1Var.r, u1Var.s, u1Var.o);
        }
    }

    public final void f(boolean[] zArr) {
        e[] eVarArr;
        Set set;
        f5.y yVar;
        int i10;
        e[] eVarArr2;
        h5.n nVar;
        h1 h1Var = this.E;
        f1 f1Var = h1Var.i;
        f5.y yVar2 = f1Var.n;
        int i11 = 0;
        while (true) {
            eVarArr = this.a;
            int length = eVarArr.length;
            set = this.b;
            if (i11 >= length) {
                break;
            }
            if (!yVar2.b(i11) && set.remove(eVarArr[i11])) {
                eVarArr[i11].v();
            }
            i11++;
        }
        int i12 = 0;
        while (i12 < eVarArr.length) {
            if (yVar2.b(i12)) {
                boolean z4 = zArr[i12];
                e eVar = eVarArr[i12];
                if (!q(eVar)) {
                    f1 f1Var2 = h1Var.i;
                    boolean z10 = f1Var2 == h1Var.h;
                    f5.y yVar3 = f1Var2.n;
                    g2 g2Var = yVar3.b[i12];
                    f5.c cVar = yVar3.c[i12];
                    int p10 = cVar != null ? cVar.p() : 0;
                    n0[] n0VarArr = new n0[p10];
                    for (int i13 = 0; i13 < p10; i13++) {
                        n0VarArr[i13] = cVar.e(i13);
                    }
                    boolean z11 = Z() && this.J.e == 3;
                    boolean z12 = !z4 && z11;
                    this.V++;
                    set.add(eVar);
                    o4.l0 l0Var = f1Var2.c[i12];
                    yVar = yVar2;
                    long j10 = this.X;
                    long e6 = f1Var2.e();
                    i10 = i12;
                    eVarArr2 = eVarArr;
                    long j11 = f1Var2.o;
                    h5.a.i(eVar.h == 0);
                    eVar.d = g2Var;
                    eVar.h = 1;
                    eVar.l(z12, z10);
                    eVar.u(n0VarArr, l0Var, e6, j11);
                    eVar.w = false;
                    eVar.v = j10;
                    eVar.m(j10, z12);
                    eVar.b(11, new g0(this));
                    k kVar = this.y;
                    kVar.getClass();
                    h5.n f10 = eVar.f();
                    if (f10 != null && f10 != (nVar = kVar.d)) {
                        if (nVar != null) {
                            throw new n(2, new IllegalStateException("Multiple renderer media clocks enabled."), MediaDataController.MAX_STYLE_RUNS_COUNT);
                        }
                        kVar.d = f10;
                        kVar.c = eVar;
                        f10.c((v1) kVar.a.e);
                    }
                    if (z11) {
                        h5.a.i(eVar.h == 1);
                        eVar.h = 2;
                        eVar.p();
                    }
                    i12 = i10 + 1;
                    yVar2 = yVar;
                    eVarArr = eVarArr2;
                }
            }
            yVar = yVar2;
            i10 = i12;
            eVarArr2 = eVarArr;
            i12 = i10 + 1;
            yVar2 = yVar;
            eVarArr = eVarArr2;
        }
        f1Var.g = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void f0(f5.y yVar) {
        o2 o2Var = this.J.a;
        f5.c[] cVarArr = yVar.c;
        j jVar = this.f;
        int i10 = jVar.f;
        if (i10 == -1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                e[] eVarArr = this.a;
                int i13 = 13107200;
                if (i11 < eVarArr.length) {
                    if (cVarArr[i11] != null) {
                        switch (eVarArr[i11].b) {
                            case 0:
                                i13 = 144310272;
                                i12 += i13;
                                break;
                            case 1:
                                i12 += i13;
                                break;
                            case 2:
                                i13 = 131072000;
                                i12 += i13;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i13 = 131072;
                                i12 += i13;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i11++;
                } else {
                    i10 = Math.max(13107200, i12);
                }
            }
        }
        jVar.h = i10;
        jVar.a.a(i10);
    }

    public final long g(o2 o2Var, Object obj, long j10) {
        m2 m2Var = this.w;
        int i10 = o2Var.g(obj, m2Var).c;
        n2 n2Var = this.v;
        o2Var.n(i10, n2Var);
        if (n2Var.f != -9223372036854775807L && n2Var.a() && n2Var.r) {
            return h5.d0.G(h5.d0.u(n2Var.h) - n2Var.f) - (j10 + m2Var.e);
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, o4.t] */
    public final void g0() {
        long j10;
        long max;
        char c3;
        char c10;
        long max2;
        f1 f1Var = this.E.h;
        if (f1Var == null) {
            return;
        }
        long n10 = f1Var.d ? f1Var.a.n() : -9223372036854775807L;
        if (n10 != -9223372036854775807L) {
            F(n10);
            if (n10 != this.J.r) {
                u1 u1Var = this.J;
                this.J = o(u1Var.b, n10, u1Var.c, n10, true, 5);
            }
        } else {
            k kVar = this.y;
            boolean z4 = f1Var != this.E.i;
            c2.d0 d0Var = kVar.a;
            e eVar = kVar.c;
            if (eVar == null || eVar.i() || (!kVar.c.j() && (z4 || kVar.c.h()))) {
                kVar.e = true;
                if (kVar.f) {
                    d0Var.b();
                }
            } else {
                h5.n nVar = kVar.d;
                nVar.getClass();
                long e6 = nVar.e();
                if (kVar.e) {
                    if (e6 >= d0Var.e()) {
                        kVar.e = false;
                        if (kVar.f) {
                            d0Var.b();
                        }
                    } else if (d0Var.a) {
                        d0Var.a(d0Var.e());
                        d0Var.a = false;
                    }
                }
                d0Var.a(e6);
                v1 d = nVar.d();
                if (!d.equals((v1) d0Var.e)) {
                    d0Var.c(d);
                    kVar.b.n.a(16, d).b();
                }
            }
            long e10 = kVar.e();
            this.X = e10;
            long j11 = e10 - f1Var.o;
            long j12 = this.J.r;
            ArrayList arrayList = this.B;
            if (!arrayList.isEmpty() && !this.J.b.a()) {
                if (this.Z) {
                    this.Z = false;
                }
                u1 u1Var2 = this.J;
                u1Var2.a.b(u1Var2.b.a);
                int min = Math.min(this.Y, arrayList.size());
                if (min > 0 && arrayList.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < arrayList.size() && arrayList.get(min) != null) {
                    throw new ClassCastException();
                }
                this.Y = min;
            }
            u1 u1Var3 = this.J;
            u1Var3.r = j11;
            u1Var3.s = SystemClock.elapsedRealtime();
        }
        this.J.p = this.E.j.d();
        u1 u1Var4 = this.J;
        long j13 = u1Var4.p;
        f1 f1Var2 = this.E.j;
        if (f1Var2 == null) {
            max = 0;
            j10 = -9223372036854775807L;
        } else {
            j10 = -9223372036854775807L;
            max = Math.max(0L, j13 - (this.X - f1Var2.o));
        }
        u1Var4.q = max;
        u1 u1Var5 = this.J;
        if (u1Var5.l && u1Var5.e == 3 && a0(u1Var5.a, u1Var5.b)) {
            u1 u1Var6 = this.J;
            float f10 = 1.0f;
            if (u1Var6.n.a == 1.0f) {
                i iVar = this.G;
                long g10 = g(u1Var6.a, u1Var6.b.a, u1Var6.r);
                long j14 = this.J.p;
                f1 f1Var3 = this.E.j;
                if (f1Var3 == null) {
                    max2 = 0;
                    c3 = 0;
                    c10 = 1;
                } else {
                    c3 = 0;
                    c10 = 1;
                    max2 = Math.max(0L, j14 - (this.X - f1Var3.o));
                }
                if (iVar.c != j10) {
                    long j15 = g10 - max2;
                    long j16 = iVar.m;
                    if (j16 == j10) {
                        iVar.m = j15;
                        iVar.n = 0L;
                    } else {
                        iVar.m = Math.max(j15, (long) ((j15 * 9.999871E-4f) + (j16 * 0.999f)));
                        iVar.n = (long) ((9.999871E-4f * Math.abs(j15 - r12)) + (0.999f * iVar.n));
                    }
                    if (iVar.l == j10 || SystemClock.elapsedRealtime() - iVar.l >= 1000) {
                        iVar.l = SystemClock.elapsedRealtime();
                        long j17 = (iVar.n * 3) + iVar.m;
                        if (iVar.h > j17) {
                            float G = h5.d0.G(1000L);
                            long j18 = ((long) ((iVar.k - 1.0f) * G)) + ((long) ((iVar.i - 1.0f) * G));
                            long j19 = iVar.e;
                            long j20 = iVar.h - j18;
                            long[] jArr = new long[3];
                            jArr[c3] = j17;
                            jArr[c10] = j19;
                            jArr[2] = j20;
                            long j21 = jArr[c3];
                            for (int i10 = 1; i10 < 3; i10++) {
                                long j22 = jArr[i10];
                                if (j22 > j21) {
                                    j21 = j22;
                                }
                            }
                            iVar.h = j21;
                        } else {
                            long i11 = h5.d0.i(g10 - ((long) (Math.max(0.0f, iVar.k - 1.0f) / 1.0E-7f)), iVar.h, j17);
                            iVar.h = i11;
                            long j23 = iVar.g;
                            if (j23 != j10 && i11 > j23) {
                                iVar.h = j23;
                            }
                        }
                        long j24 = g10 - iVar.h;
                        if (Math.abs(j24) < iVar.a) {
                            iVar.k = 1.0f;
                        } else {
                            iVar.k = h5.d0.g((1.0E-7f * j24) + 1.0f, iVar.j, iVar.i);
                        }
                        f10 = iVar.k;
                    } else {
                        f10 = iVar.k;
                    }
                }
                if (this.y.d().a != f10) {
                    v1 v1Var = new v1(f10, this.J.n.b);
                    this.n.a.removeMessages(16);
                    this.y.c(v1Var);
                    n(this.J.n, this.y.d().a, false, false);
                }
            }
        }
    }

    public final Pair h(o2 o2Var) {
        if (o2Var.p()) {
            return Pair.create(u1.t, 0L);
        }
        Pair i10 = o2Var.i(this.v, this.w, o2Var.a(this.R), -9223372036854775807L);
        o4.v n10 = this.E.n(o2Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (n10.a()) {
            Object obj = n10.a;
            m2 m2Var = this.w;
            o2Var.g(obj, m2Var);
            longValue = n10.c == m2Var.f(n10.b) ? m2Var.h.b : 0L;
        }
        return Pair.create(n10, Long.valueOf(longValue));
    }

    public final void h0(o2 o2Var, o4.v vVar, o2 o2Var2, o4.v vVar2, long j10, boolean z4) {
        boolean a02 = a0(o2Var, vVar);
        Object obj = vVar.a;
        if (!a02) {
            v1 v1Var = vVar.a() ? v1.d : this.J.n;
            k kVar = this.y;
            if (kVar.d().equals(v1Var)) {
                return;
            }
            this.n.a.removeMessages(16);
            kVar.c(v1Var);
            n(this.J.n, v1Var.a, false, false);
            return;
        }
        m2 m2Var = this.w;
        int i10 = o2Var.g(obj, m2Var).c;
        n2 n2Var = this.v;
        o2Var.n(i10, n2Var);
        x0 x0Var = n2Var.v;
        int i11 = h5.d0.a;
        i iVar = this.G;
        iVar.getClass();
        iVar.c = h5.d0.G(x0Var.a);
        iVar.f = h5.d0.G(x0Var.b);
        iVar.g = h5.d0.G(x0Var.c);
        float f10 = x0Var.d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        iVar.j = f10;
        float f11 = x0Var.e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        iVar.i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            iVar.c = -9223372036854775807L;
        }
        iVar.a();
        if (j10 != -9223372036854775807L) {
            iVar.d = g(o2Var, obj, j10);
            iVar.a();
            return;
        }
        if (!h5.d0.a(!o2Var2.p() ? o2Var2.m(o2Var2.g(vVar2.a, m2Var).c, n2Var, 0L).a : null, n2Var.a) || z4) {
            iVar.d = -9223372036854775807L;
            iVar.a();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        f1 f1Var;
        f1 f1Var2;
        int i10 = MediaDataController.MAX_STYLE_RUNS_COUNT;
        try {
            switch (message.what) {
                case 0:
                    x();
                    break;
                case 1:
                    T(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    K((j0) message.obj);
                    break;
                case 4:
                    U((v1) message.obj);
                    break;
                case 5:
                    this.I = (h2) message.obj;
                    break;
                case 6:
                    c0(false, true);
                    break;
                case 7:
                    z();
                    return true;
                case 8:
                    m((o4.t) message.obj);
                    break;
                case 9:
                    i((o4.t) message.obj);
                    break;
                case 10:
                    C();
                    break;
                case 11:
                    V(message.arg1);
                    break;
                case 12:
                    W(message.arg1 != 0);
                    break;
                case 13:
                    P(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    c2 c2Var = (c2) message.obj;
                    c2Var.getClass();
                    M(c2Var);
                    break;
                case 15:
                    N((c2) message.obj);
                    break;
                case 16:
                    v1 v1Var = (v1) message.obj;
                    n(v1Var, v1Var.a, true, false);
                    break;
                case 17:
                    Q((h0) message.obj);
                    break;
                case 18:
                    b((h0) message.obj, message.arg1);
                    break;
                case 19:
                    android.support.v4.media.a.v(message.obj);
                    w();
                    throw null;
                case 20:
                    B(message.arg1, message.arg2, (o4.q0) message.obj);
                    break;
                case 21:
                    X((o4.q0) message.obj);
                    break;
                case 22:
                    v();
                    break;
                case 23:
                    S(message.arg1 != 0);
                    break;
                case 24:
                    R(message.arg1 == 1);
                    break;
                case 25:
                    C();
                    J(true);
                    break;
                case 26:
                    C();
                    J(true);
                    break;
                default:
                    return false;
            }
        } catch (g5.n e6) {
            j(e6, e6.a);
        } catch (n e10) {
            e = e10;
            int i11 = e.c;
            h1 h1Var = this.E;
            if (i11 == 1 && (f1Var2 = h1Var.i) != null) {
                e = e.a(f1Var2.f.a);
            }
            if (e.r && this.a0 == null) {
                h5.a.L("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.a0 = e;
                h5.a0 a0Var = this.n;
                h5.z a2 = a0Var.a(25, e);
                Handler handler = a0Var.a;
                Message message2 = a2.a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                a2.a();
            } else {
                n nVar = this.a0;
                if (nVar != null) {
                    nVar.addSuppressed(e);
                    e = this.a0;
                }
                h5.a.p("ExoPlayerImplInternal", "Playback error", e);
                if (e.c == 1 && h1Var.h != h1Var.i) {
                    while (true) {
                        f1Var = h1Var.h;
                        if (f1Var == h1Var.i) {
                            break;
                        }
                        h1Var.a();
                    }
                    f1Var.getClass();
                    g1 g1Var = f1Var.f;
                    o4.v vVar = g1Var.a;
                    long j10 = g1Var.b;
                    this.J = o(vVar, j10, g1Var.c, j10, true, 0);
                }
                c0(true, false);
                this.J = this.J.e(e);
            }
        } catch (r1 e11) {
            boolean z4 = e11.a;
            int i12 = e11.b;
            if (i12 == 1) {
                i10 = z4 ? 3001 : 3003;
            } else if (i12 == 4) {
                i10 = z4 ? 3002 : 3004;
            }
            j(e11, i10);
        } catch (RuntimeException e12) {
            if ((e12 instanceof IllegalStateException) || (e12 instanceof IllegalArgumentException)) {
                i10 = 1004;
            }
            n nVar2 = new n(2, e12, i10);
            h5.a.p("ExoPlayerImplInternal", "Playback error", nVar2);
            c0(true, false);
            this.J = this.J.e(nVar2);
        } catch (o3.h e13) {
            j(e13, e13.a);
        } catch (o4.b e14) {
            j(e14, 1002);
        } catch (IOException e15) {
            j(e15, 2000);
        }
        u();
        return true;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, o4.n0] */
    public final void i(o4.t tVar) {
        f1 f1Var = this.E.j;
        if (f1Var == null || f1Var.a != tVar) {
            return;
        }
        long j10 = this.X;
        if (f1Var != null) {
            h5.a.i(f1Var.l == null);
            if (f1Var.d) {
                f1Var.a.t(j10 - f1Var.o);
            }
        }
        t();
    }

    public final synchronized void i0(hg.f fVar, long j10) {
        this.C.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z4 = false;
        while (!((Boolean) fVar.get()).booleanValue() && j10 > 0) {
            try {
                this.C.getClass();
                wait(j10);
            } catch (InterruptedException unused) {
                z4 = true;
            }
            this.C.getClass();
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    public final void j(IOException iOException, int i10) {
        n nVar = new n(0, iOException, i10);
        f1 f1Var = this.E.h;
        if (f1Var != null) {
            nVar = nVar.a(f1Var.f.a);
        }
        h5.a.p("ExoPlayerImplInternal", "Playback error", nVar);
        c0(false, false);
        this.J = this.J.e(nVar);
    }

    public final void k(boolean z4) {
        f1 f1Var = this.E.j;
        o4.v vVar = f1Var == null ? this.J.b : f1Var.f.a;
        boolean equals = this.J.k.equals(vVar);
        if (!equals) {
            this.J = this.J.b(vVar);
        }
        u1 u1Var = this.J;
        u1Var.p = f1Var == null ? u1Var.r : f1Var.d();
        u1 u1Var2 = this.J;
        long j10 = u1Var2.p;
        f1 f1Var2 = this.E.j;
        u1Var2.q = f1Var2 != null ? Math.max(0L, j10 - (this.X - f1Var2.o)) : 0L;
        if ((!equals || z4) && f1Var != null && f1Var.d) {
            f0(f1Var.n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03b9  */
    /* JADX WARN: Type inference failed for: r27v0, types: [j3.i0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(o2 o2Var, boolean z4) {
        n2 n2Var;
        long j10;
        Object obj;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        boolean z13;
        m2 m2Var;
        o2 o2Var2;
        long j11;
        boolean z14;
        long j12;
        ?? i0Var;
        i0 i0Var2;
        int i13;
        long longValue;
        boolean z15;
        int i14;
        boolean z16;
        boolean z17;
        long j13;
        int i15;
        boolean z18;
        long j14;
        long j15;
        o2 o2Var3;
        boolean z19;
        Object obj2;
        long j16;
        int i16;
        boolean z20;
        long j17;
        long L;
        Object obj3;
        long j18;
        int i17;
        long j19;
        long j20;
        long j21;
        long j22;
        u1 u1Var = this.J;
        j0 j0Var = this.W;
        h1 h1Var = this.E;
        int i18 = this.Q;
        boolean z21 = this.R;
        n2 n2Var2 = this.v;
        m2 m2Var2 = this.w;
        if (o2Var.p()) {
            o2Var2 = o2Var;
            i0Var2 = new i0(u1.t, 0L, -9223372036854775807L, false, true, false);
        } else {
            o4.v vVar = u1Var.b;
            Object obj4 = vVar.a;
            o2 o2Var4 = u1Var.a;
            boolean z22 = o2Var4.p() || o2Var4.g(vVar.a, m2Var2).f;
            long j23 = (u1Var.b.a() || z22) ? u1Var.c : u1Var.r;
            if (j0Var != null) {
                Pair H = H(o2Var, j0Var, true, i18, z21, n2Var2, m2Var2);
                if (H == null) {
                    i15 = o2Var.a(z21);
                    j13 = j23;
                    obj = obj4;
                    z17 = false;
                    z18 = true;
                    z16 = false;
                } else {
                    if (j0Var.c == -9223372036854775807L) {
                        longValue = j23;
                        obj = obj4;
                        z15 = false;
                        i14 = o2Var.g(H.first, m2Var2).c;
                    } else {
                        obj = H.first;
                        longValue = ((Long) H.second).longValue();
                        z15 = true;
                        i14 = -1;
                    }
                    z16 = z15;
                    z17 = u1Var.e == 4;
                    j13 = longValue;
                    i15 = i14;
                    z18 = false;
                }
                z10 = z17;
                z11 = z18;
                z12 = z16;
                i10 = i15;
                i11 = -1;
                j10 = j13;
                n2Var = n2Var2;
            } else {
                if (u1Var.a.p()) {
                    i10 = o2Var.a(z21);
                    n2Var = n2Var2;
                } else if (o2Var.b(obj4) == -1) {
                    Object I = I(n2Var2, m2Var2, i18, z21, obj4, u1Var.a, o2Var);
                    n2Var = n2Var2;
                    m2Var2 = m2Var2;
                    if (I == null) {
                        i12 = o2Var.a(z21);
                        z13 = true;
                    } else {
                        i12 = o2Var.g(I, m2Var2).c;
                        z13 = false;
                    }
                    i10 = i12;
                    z11 = z13;
                    j10 = j23;
                    obj = obj4;
                    i11 = -1;
                    z10 = false;
                    z12 = false;
                } else {
                    n2Var = n2Var2;
                    if (j23 == -9223372036854775807L) {
                        i10 = o2Var.g(obj4, m2Var2).c;
                    } else if (z22) {
                        u1Var.a.g(vVar.a, m2Var2);
                        if (u1Var.a.m(m2Var2.c, n2Var, 0L).B == u1Var.a.b(vVar.a)) {
                            Pair i19 = o2Var.i(n2Var, m2Var2, o2Var.g(obj4, m2Var2).c, j23 + m2Var2.e);
                            obj = i19.first;
                            j10 = ((Long) i19.second).longValue();
                        } else {
                            j10 = j23;
                            obj = obj4;
                        }
                        i10 = -1;
                        i11 = -1;
                        z10 = false;
                        z11 = false;
                        z12 = true;
                    } else {
                        j10 = j23;
                        obj = obj4;
                        i10 = -1;
                        i11 = -1;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                    }
                }
                j10 = j23;
                obj = obj4;
                i11 = -1;
                z10 = false;
                z11 = false;
                z12 = false;
            }
            if (i10 != i11) {
                m2 m2Var3 = m2Var2;
                Pair i20 = o2Var.i(n2Var, m2Var3, i10, -9223372036854775807L);
                o2Var2 = o2Var;
                m2Var = m2Var3;
                obj = i20.first;
                j10 = ((Long) i20.second).longValue();
                j11 = -9223372036854775807L;
            } else {
                m2Var = m2Var2;
                o2Var2 = o2Var;
                j11 = j10;
            }
            o4.v n10 = h1Var.n(o2Var2, obj, j10);
            int i21 = n10.e;
            boolean z23 = vVar.a.equals(obj) && !vVar.a() && !n10.a() && (i21 == i11 || ((i13 = vVar.e) != i11 && i21 >= i13));
            m2 g10 = o2Var2.g(obj, m2Var);
            if (!z22 && j23 == j11) {
                Object obj5 = vVar.a;
                int i22 = vVar.c;
                int i23 = vVar.b;
                if (obj5.equals(n10.a) && (!vVar.a() || !g10.h(i23) ? !(!n10.a() || !g10.h(n10.b)) : !(g10.e(i23, i22) == 4 || g10.e(i23, i22) == 2))) {
                    z14 = true;
                    if (!z23 || z14) {
                        n10 = vVar;
                    }
                    if (n10.a()) {
                        if (n10.equals(vVar)) {
                            j10 = u1Var.r;
                        } else {
                            o2Var2.g(n10.a, m2Var);
                            j12 = n10.c == m2Var.f(n10.b) ? m2Var.h.b : 0L;
                            i0Var = new i0(n10, j12, j11, z10, z11, z12);
                            i0Var2 = i0Var;
                        }
                    }
                    j12 = j10;
                    i0Var = new i0(n10, j12, j11, z10, z11, z12);
                    i0Var2 = i0Var;
                }
            }
            z14 = false;
            if (!z23) {
            }
            n10 = vVar;
            if (n10.a()) {
            }
            j12 = j10;
            i0Var = new i0(n10, j12, j11, z10, z11, z12);
            i0Var2 = i0Var;
        }
        o4.v vVar2 = i0Var2.a;
        long j24 = i0Var2.c;
        boolean z24 = i0Var2.d;
        long j25 = i0Var2.b;
        boolean z25 = (this.J.b.equals(vVar2) && j25 == this.J.r) ? false : true;
        try {
            if (i0Var2.e) {
                try {
                    if (this.J.e != 1) {
                        Y(4);
                    }
                    z20 = false;
                    D(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    j14 = j25;
                    o2Var3 = o2Var2;
                    z19 = false;
                    j15 = j14;
                    u1 u1Var2 = this.J;
                    h0(o2Var3, vVar2, u1Var2.a, u1Var2.b, i0Var2.f ? j15 : -9223372036854775807L, false);
                    if (!z25) {
                    }
                    u1 u1Var3 = this.J;
                    obj2 = u1Var3.b.a;
                    o2 o2Var5 = u1Var3.a;
                    if (z25) {
                    }
                    long j26 = this.J.d;
                    if (o2Var3.b(obj2) == -1) {
                    }
                    this.J = o(vVar2, j15, j16, j26, r7, i16);
                    E();
                    G(o2Var3, this.J.a);
                    this.J = this.J.h(o2Var3);
                    if (!o2Var3.p()) {
                    }
                    k(z19);
                    throw th;
                }
            } else {
                z20 = false;
            }
            try {
                if (z25) {
                    long j27 = j25;
                    j19 = j27;
                    if (!o2Var2.p()) {
                        try {
                            for (f1 f1Var = this.E.h; f1Var != null; f1Var = f1Var.l) {
                                if (f1Var.f.a.equals(vVar2)) {
                                    g1 h = this.E.h(o2Var2, f1Var.f);
                                    f1Var.f = h;
                                    Object obj6 = f1Var.a;
                                    if (obj6 instanceof o4.d) {
                                        long j28 = h.d;
                                        if (j28 == -9223372036854775807L) {
                                            j28 = Long.MIN_VALUE;
                                        }
                                        o4.d dVar = (o4.d) obj6;
                                        dVar.e = 0L;
                                        dVar.f = j28;
                                    }
                                }
                            }
                            h1 h1Var2 = this.E;
                            if (h1Var2.h != h1Var2.i) {
                                z20 = true;
                            }
                            z19 = false;
                            try {
                                L = L(vVar2, j27, z20, z24);
                                u1 u1Var4 = this.J;
                                h0(o2Var, vVar2, u1Var4.a, u1Var4.b, !i0Var2.f ? L : -9223372036854775807L, false);
                                if (!z25 || j24 != this.J.c) {
                                    u1 u1Var5 = this.J;
                                    obj3 = u1Var5.b.a;
                                    o2 o2Var6 = u1Var5.a;
                                    boolean z26 = (z25 || !z4 || o2Var6.p() || o2Var6.g(obj3, this.w).f) ? false : true;
                                    long j29 = this.J.d;
                                    if (o2Var.b(obj3) != -1) {
                                        j18 = j24;
                                        i17 = 4;
                                    } else {
                                        j18 = j24;
                                        i17 = 3;
                                    }
                                    this.J = o(vVar2, L, j18, j29, z26, i17);
                                }
                                E();
                                G(o2Var, this.J.a);
                                this.J = this.J.h(o2Var);
                                if (!o2Var.p()) {
                                    this.W = null;
                                }
                                k(z19);
                            } catch (Throwable th3) {
                                th = th3;
                                j17 = j27;
                                o2Var3 = o2Var2;
                                j15 = j17;
                                u1 u1Var22 = this.J;
                                h0(o2Var3, vVar2, u1Var22.a, u1Var22.b, i0Var2.f ? j15 : -9223372036854775807L, false);
                                if (!z25) {
                                }
                                u1 u1Var32 = this.J;
                                obj2 = u1Var32.b.a;
                                o2 o2Var52 = u1Var32.a;
                                if (z25) {
                                }
                                long j262 = this.J.d;
                                if (o2Var3.b(obj2) == -1) {
                                }
                                this.J = o(vVar2, j15, j16, j262, r7, i16);
                                E();
                                G(o2Var3, this.J.a);
                                this.J = this.J.h(o2Var3);
                                if (!o2Var3.p()) {
                                }
                                k(z19);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z19 = false;
                            j17 = j27;
                        }
                    }
                } else {
                    h1 h1Var3 = this.E;
                    long j30 = this.X;
                    try {
                        e[] eVarArr = this.a;
                        f1 f1Var2 = h1Var3.i;
                        if (f1Var2 == null) {
                            j20 = j25;
                            j22 = j30;
                        } else {
                            long j31 = f1Var2.o;
                            if (f1Var2.d) {
                                long j32 = j31;
                                int i24 = 0;
                                while (i24 < eVarArr.length) {
                                    try {
                                        if (q(eVarArr[i24])) {
                                            e eVar = eVarArr[i24];
                                            j20 = j25;
                                            try {
                                                if (eVar.n == f1Var2.c[i24]) {
                                                    long j33 = eVar.v;
                                                    if (j33 == Long.MIN_VALUE) {
                                                        j21 = j20;
                                                        break;
                                                    }
                                                    j32 = Math.max(j33, j32);
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                j14 = j20;
                                                o2Var3 = o2Var2;
                                                z19 = false;
                                                j15 = j14;
                                                u1 u1Var222 = this.J;
                                                h0(o2Var3, vVar2, u1Var222.a, u1Var222.b, i0Var2.f ? j15 : -9223372036854775807L, false);
                                                if (!z25) {
                                                }
                                                u1 u1Var322 = this.J;
                                                obj2 = u1Var322.b.a;
                                                o2 o2Var522 = u1Var322.a;
                                                if (z25) {
                                                }
                                                long j2622 = this.J.d;
                                                if (o2Var3.b(obj2) == -1) {
                                                }
                                                this.J = o(vVar2, j15, j16, j2622, r7, i16);
                                                E();
                                                G(o2Var3, this.J.a);
                                                this.J = this.J.h(o2Var3);
                                                if (!o2Var3.p()) {
                                                }
                                                k(z19);
                                                throw th;
                                            }
                                        } else {
                                            j20 = j25;
                                        }
                                        i24++;
                                        j25 = j20;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        j20 = j25;
                                    }
                                }
                            }
                            j21 = j25;
                            j22 = j30;
                            j20 = j21;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        j14 = j25;
                        o2Var3 = o2Var2;
                        z19 = false;
                        j15 = j14;
                        u1 u1Var2222 = this.J;
                        h0(o2Var3, vVar2, u1Var2222.a, u1Var2222.b, i0Var2.f ? j15 : -9223372036854775807L, false);
                        if (!z25 || j24 != this.J.c) {
                            u1 u1Var3222 = this.J;
                            obj2 = u1Var3222.b.a;
                            o2 o2Var5222 = u1Var3222.a;
                            boolean z27 = (z25 || !z4 || o2Var5222.p() || o2Var5222.g(obj2, this.w).f) ? false : true;
                            long j26222 = this.J.d;
                            if (o2Var3.b(obj2) == -1) {
                                j16 = j24;
                                i16 = 4;
                            } else {
                                j16 = j24;
                                i16 = 3;
                            }
                            this.J = o(vVar2, j15, j16, j26222, z27, i16);
                        }
                        E();
                        G(o2Var3, this.J.a);
                        this.J = this.J.h(o2Var3);
                        if (!o2Var3.p()) {
                            this.W = null;
                        }
                        k(z19);
                        throw th;
                    }
                    try {
                        j19 = j20;
                        if (!h1Var3.p(o2Var2, j22)) {
                            J(false);
                            j19 = j20;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j14 = j20;
                        o2Var3 = o2Var2;
                        z19 = false;
                        j15 = j14;
                        u1 u1Var22222 = this.J;
                        h0(o2Var3, vVar2, u1Var22222.a, u1Var22222.b, i0Var2.f ? j15 : -9223372036854775807L, false);
                        if (!z25) {
                        }
                        u1 u1Var32222 = this.J;
                        obj2 = u1Var32222.b.a;
                        o2 o2Var52222 = u1Var32222.a;
                        if (z25) {
                        }
                        long j262222 = this.J.d;
                        if (o2Var3.b(obj2) == -1) {
                        }
                        this.J = o(vVar2, j15, j16, j262222, z27, i16);
                        E();
                        G(o2Var3, this.J.a);
                        this.J = this.J.h(o2Var3);
                        if (!o2Var3.p()) {
                        }
                        k(z19);
                        throw th;
                    }
                }
                z19 = false;
                L = j19;
                u1 u1Var42 = this.J;
                h0(o2Var, vVar2, u1Var42.a, u1Var42.b, !i0Var2.f ? L : -9223372036854775807L, false);
                if (!z25) {
                }
                u1 u1Var52 = this.J;
                obj3 = u1Var52.b.a;
                o2 o2Var62 = u1Var52.a;
                if (z25) {
                }
                long j292 = this.J.d;
                if (o2Var.b(obj3) != -1) {
                }
                this.J = o(vVar2, L, j18, j292, z26, i17);
                E();
                G(o2Var, this.J.a);
                this.J = this.J.h(o2Var);
                if (!o2Var.p()) {
                }
                k(z19);
            } catch (Throwable th9) {
                th = th9;
                j14 = i0Var;
            }
        } catch (Throwable th10) {
            th = th10;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, o4.t] */
    public final void m(o4.t tVar) {
        h1 h1Var = this.E;
        f1 f1Var = h1Var.j;
        if (f1Var == null || f1Var.a != tVar) {
            return;
        }
        float f10 = this.y.d().a;
        o2 o2Var = this.J.a;
        f1Var.d = true;
        f1Var.m = f1Var.a.o();
        f5.y g10 = f1Var.g(f10, o2Var);
        g1 g1Var = f1Var.f;
        long j10 = g1Var.b;
        long j11 = g1Var.e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a2 = f1Var.a(g10, j10, false, new boolean[f1Var.i.length]);
        long j12 = f1Var.o;
        g1 g1Var2 = f1Var.f;
        f1Var.o = (g1Var2.b - a2) + j12;
        f1Var.f = g1Var2.b(a2);
        f0(f1Var.n);
        if (f1Var == h1Var.h) {
            F(f1Var.f.b);
            f(new boolean[this.a.length]);
            u1 u1Var = this.J;
            o4.v vVar = u1Var.b;
            long j13 = f1Var.f.b;
            this.J = o(vVar, j13, u1Var.c, j13, false, 5);
        }
        t();
    }

    public final void n(v1 v1Var, float f10, boolean z4, boolean z10) {
        int i10;
        if (z4) {
            if (z10) {
                this.K.a(1);
            }
            this.J = this.J.f(v1Var);
        }
        float f11 = v1Var.a;
        f1 f1Var = this.E.h;
        while (true) {
            i10 = 0;
            if (f1Var == null) {
                break;
            }
            f5.c[] cVarArr = f1Var.n.c;
            int length = cVarArr.length;
            while (i10 < length) {
                f5.c cVar = cVarArr[i10];
                if (cVar != null) {
                    cVar.s(f11);
                }
                i10++;
            }
            f1Var = f1Var.l;
        }
        e[] eVarArr = this.a;
        int length2 = eVarArr.length;
        while (i10 < length2) {
            e eVar = eVarArr[i10];
            if (eVar != null) {
                eVar.w(f10, v1Var.a);
            }
            i10++;
        }
    }

    public final u1 o(o4.v vVar, long j10, long j11, long j12, boolean z4, int i10) {
        s8.i0 i0Var;
        this.Z = (!this.Z && j10 == this.J.r && vVar.equals(this.J.b)) ? false : true;
        E();
        u1 u1Var = this.J;
        o4.t0 t0Var = u1Var.h;
        f5.y yVar = u1Var.i;
        List list = u1Var.j;
        if (this.F.k) {
            f1 f1Var = this.E.h;
            t0Var = f1Var == null ? o4.t0.d : f1Var.m;
            yVar = f1Var == null ? this.e : f1Var.n;
            f5.c[] cVarArr = yVar.c;
            s8.s sVar = new s8.s();
            boolean z10 = false;
            for (f5.c cVar : cVarArr) {
                if (cVar != null) {
                    e4.c cVar2 = cVar.e(0).s;
                    if (cVar2 == null) {
                        sVar.b(new e4.c(new e4.b[0]));
                    } else {
                        sVar.b(cVar2);
                        z10 = true;
                    }
                }
            }
            if (z10) {
                i0Var = sVar.i();
            } else {
                s8.t tVar = s8.v.b;
                i0Var = s8.i0.e;
            }
            list = i0Var;
            if (f1Var != null) {
                g1 g1Var = f1Var.f;
                if (g1Var.c != j11) {
                    f1Var.f = g1Var.a(j11);
                }
            }
        } else if (!vVar.equals(u1Var.b)) {
            t0Var = o4.t0.d;
            yVar = this.e;
            list = s8.i0.e;
        }
        o4.t0 t0Var2 = t0Var;
        f5.y yVar2 = yVar;
        List list2 = list;
        if (z4) {
            ye.f fVar = this.K;
            if (!fVar.d || fVar.e == 5) {
                fVar.b = true;
                fVar.d = true;
                fVar.e = i10;
            } else {
                h5.a.f(i10 == 5);
            }
        }
        u1 u1Var2 = this.J;
        long j13 = u1Var2.p;
        f1 f1Var2 = this.E.j;
        return u1Var2.c(vVar, j10, j11, j12, f1Var2 == null ? 0L : Math.max(0L, j13 - (this.X - f1Var2.o)), t0Var2, yVar2, list2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o4.n0] */
    public final boolean p() {
        f1 f1Var = this.E.j;
        if (f1Var == null) {
            return false;
        }
        return (!f1Var.d ? 0L : f1Var.a.e()) != Long.MIN_VALUE;
    }

    public final boolean r() {
        f1 f1Var = this.E.h;
        long j10 = f1Var.f.e;
        if (f1Var.d) {
            return j10 == -9223372036854775807L || this.J.r < j10 || !Z();
        }
        return false;
    }

    @Override // o4.m0
    public final void s(o4.n0 n0Var) {
        this.n.a(9, (o4.t) n0Var).b();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, o4.t] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, o4.n0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o4.n0] */
    public final void t() {
        boolean c3;
        if (p()) {
            f1 f1Var = this.E.j;
            long e6 = !f1Var.d ? 0L : f1Var.a.e();
            f1 f1Var2 = this.E.j;
            long max = f1Var2 == null ? 0L : Math.max(0L, e6 - (this.X - f1Var2.o));
            f1 f1Var3 = this.E.h;
            c3 = this.f.c(max, this.y.d().a);
            if (!c3 && max < 500000 && this.x > 0) {
                this.E.h.a.k(this.J.r);
                c3 = this.f.c(max, this.y.d().a);
            }
        } else {
            c3 = false;
        }
        this.P = c3;
        if (c3) {
            f1 f1Var4 = this.E.j;
            long j10 = this.X;
            h5.a.i(f1Var4.l == null);
            f1Var4.a.m(j10 - f1Var4.o);
        }
        e0();
    }

    public final void u() {
        ye.f fVar = this.K;
        u1 u1Var = this.J;
        boolean z4 = fVar.b | (((u1) fVar.h) != u1Var);
        fVar.b = z4;
        fVar.h = u1Var;
        if (z4) {
            f0 f0Var = this.D.a;
            f0Var.i.c(new gf.c(16, f0Var, fVar));
            this.K = new ye.f(this.J);
        }
    }

    public final void v() {
        l(this.F.b(), true);
    }

    public final void w() {
        this.K.a(1);
        throw null;
    }

    public final void x() {
        this.K.a(1);
        D(false, false, false, true);
        this.f.b(false);
        Y(this.J.a.p() ? 4 : 2);
        g5.s sVar = (g5.s) this.h;
        sVar.getClass();
        q1 q1Var = this.F;
        ArrayList arrayList = q1Var.b;
        h5.a.i(!q1Var.k);
        q1Var.l = sVar;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            p1 p1Var = (p1) arrayList.get(i10);
            q1Var.e(p1Var);
            q1Var.g.add(p1Var);
        }
        q1Var.k = true;
        this.n.d(2);
    }

    public final synchronized boolean y() {
        if (!this.L && this.s.getThread().isAlive()) {
            this.n.d(7);
            i0(new hg.f(this, 14), this.H);
            return this.L;
        }
        return true;
    }

    public final void z() {
        D(true, false, true, false);
        A();
        this.f.b(true);
        Y(1);
        HandlerThread handlerThread = this.r;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.L = true;
            notifyAll();
        }
    }
}
