package i2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import b2.b2;
import bi.n4;
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.telegram.ui.Components.n61;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i0 extends b2.h implements p {
    public final c3.m0 A;
    public final long B;
    public final e2.c C;
    public final e2.e0 D;
    public final h0 E;
    public final n4.q F;
    public final n4.q G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public final u1 M;
    public v1 N;
    public u2.i1 O;
    public b2.b1 P;
    public b2.s0 Q;
    public b2.s0 R;
    public b2.x S;
    public Object T;
    public Surface U;
    public SurfaceHolder V;
    public boolean W;
    public TextureView X;
    public final int Y;
    public e2.y Z;
    public b2.f a0;
    public final x2.u b;
    public float b0;
    public final b2.b1 c;
    public float c0;
    public final e2.i d;
    public boolean d0;
    public final Context e;
    public d2.d e0;
    public final i0 f;
    public final boolean f0;
    public final b[] g;
    public boolean g0;
    public final b[] h;
    public final int h0;
    public final x2.t i;
    public boolean i0;
    public final e2.i0 j;
    public final b2.q j0;
    public final x k;
    public b2 k0;
    public final s0 l;
    public final long l0;
    public final e2.r m;
    public final long m0;
    public final CopyOnWriteArraySet n;
    public final long n0;
    public final b2.l1 o;
    public b2.s0 o0;
    public final ArrayList p;
    public m1 p0;
    public final boolean q;
    public int q0;
    public final u2.f0 r;
    public long r0;
    public final j2.g s;
    public n61 s0;
    public final Looper t;
    public final ArrayList t0;
    public final y2.c u;
    public final e2.g0 v;
    public final c0 w;
    public final d0 x;
    public final ac.a y;
    public final e2.o0 z;

    static {
        b2.q0.a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0356 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x001e, B:6:0x009c, B:7:0x00a5, B:9:0x00ab, B:11:0x00b9, B:13:0x014a, B:15:0x015a, B:16:0x017e, B:18:0x0186, B:20:0x0195, B:21:0x0263, B:23:0x0269, B:30:0x0273, B:33:0x027c, B:40:0x02a8, B:47:0x02b0, B:49:0x0307, B:51:0x030b, B:53:0x030f, B:57:0x0317, B:60:0x032a, B:62:0x0356, B:63:0x035b, B:67:0x0323), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0323 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:3:0x001e, B:6:0x009c, B:7:0x00a5, B:9:0x00ab, B:11:0x00b9, B:13:0x014a, B:15:0x015a, B:16:0x017e, B:18:0x0186, B:20:0x0195, B:21:0x0263, B:23:0x0269, B:30:0x0273, B:33:0x027c, B:40:0x02a8, B:47:0x02b0, B:49:0x0307, B:51:0x030b, B:53:0x030f, B:57:0x0317, B:60:0x032a, B:62:0x0356, B:63:0x035b, B:67:0x0323), top: B:2:0x001e }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [b2.h, i2.i0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [i2.i0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i0(n nVar) {
        i0 i0Var;
        boolean z10;
        e2.o0 o0Var;
        ?? hVar = new b2.h(0);
        hVar.t0 = new ArrayList();
        hVar.d = new e2.i();
        try {
            e2.a.g("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(hVar)) + " [AndroidXMedia3/1.10.1] [" + e2.l0.a + "]");
            Context context = nVar.a;
            e2.g0 g0Var = nVar.b;
            hVar.e = context.getApplicationContext();
            hVar.s = new j2.g(g0Var);
            hVar.h0 = nVar.i;
            hVar.a0 = nVar.j;
            hVar.Y = nVar.k;
            hVar.d0 = false;
            hVar.B = nVar.t;
            c0 c0Var = new c0(hVar);
            hVar.w = c0Var;
            hVar.x = new d0();
            b[] b10 = ((j) nVar.c.get()).b(new Handler(nVar.h), c0Var, c0Var, c0Var, c0Var);
            hVar.g = b10;
            t6.p(b10.length > 0);
            hVar.h = new b[b10.length];
            int i10 = 0;
            while (true) {
                b[] bVarArr = hVar.h;
                if (i10 >= bVarArr.length) {
                    break;
                }
                int i11 = hVar.g[i10].b;
                bVarArr[i10] = null;
                i10++;
            }
            x2.t tVar = (x2.t) nVar.e.get();
            hVar.i = tVar;
            hVar.r = (u2.f0) nVar.d.get();
            y2.f c10 = y2.f.c(nVar.g.b);
            hVar.u = c10;
            hVar.q = nVar.l;
            hVar.N = nVar.m;
            hVar.l0 = nVar.o;
            hVar.m0 = nVar.p;
            hVar.n0 = nVar.q;
            hVar.M = nVar.n;
            Looper looper = nVar.h;
            hVar.t = looper;
            hVar.v = g0Var;
            hVar.f = hVar;
            hVar.m = new e2.r(new CopyOnWriteArraySet(), looper, looper.getThread(), g0Var, new d2.c((i0) hVar), true);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            hVar.n = copyOnWriteArraySet;
            hVar.p = new ArrayList();
            hVar.O = new u2.g1();
            b[] bVarArr2 = hVar.g;
            x2.u uVar = new x2.u(new s1[bVarArr2.length], new x2.q[bVarArr2.length], b2.w1.b, null);
            hVar.b = uVar;
            hVar.o = new b2.l1();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (int i12 : new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32}) {
                t6.p(!false);
                sparseBooleanArray.append(i12, true);
            }
            tVar.getClass();
            t6.p(!false);
            sparseBooleanArray.append(29, true);
            t6.p(!false);
            b2.v vVar = new b2.v(sparseBooleanArray);
            hVar.c = new b2.b1(vVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i13 = 0; i13 < vVar.a.size(); i13++) {
                int a2 = vVar.a(i13);
                t6.p(!false);
                sparseBooleanArray2.append(a2, true);
            }
            t6.p(!false);
            sparseBooleanArray2.append(4, true);
            t6.p(!false);
            sparseBooleanArray2.append(10, true);
            t6.p(!false);
            hVar.P = new b2.b1(new b2.v(sparseBooleanArray2));
            hVar.j = g0Var.a(looper, null);
            x xVar = new x(hVar, 0);
            hVar.k = xVar;
            hVar.p0 = m1.k(uVar);
            hVar.s.W(hVar, looper);
            j2.l lVar = new j2.l(nVar.A);
            s0 s0Var = new s0(hVar.e, hVar.g, hVar.h, tVar, uVar, (u0) nVar.f.get(), c10, hVar.H, hVar.I, hVar.s, hVar.N, nVar.r, nVar.s, looper, g0Var, xVar, lVar, hVar.x, nVar.B);
            Looper looper2 = s0Var.s;
            e2.i0 i0Var2 = s0Var.n;
            hVar.l = s0Var;
            hVar.b0 = 1.0f;
            hVar.H = 0;
            b2.s0 s0Var2 = b2.s0.L;
            hVar.Q = s0Var2;
            hVar.R = s0Var2;
            hVar.o0 = s0Var2;
            hVar.q0 = -1;
            hVar.e0 = d2.d.d;
            hVar.f0 = true;
            hVar.o0(hVar.s);
            Handler handler = new Handler(looper);
            j2.g gVar = hVar.s;
            c10.getClass();
            gVar.getClass();
            s9.g gVar2 = c10.c;
            gVar2.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) gVar2.a;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                y2.b bVar = (y2.b) it.next();
                if (bVar.b == gVar) {
                    bVar.c = true;
                    copyOnWriteArrayList.remove(bVar);
                }
            }
            int i14 = 1;
            copyOnWriteArrayList.add(new y2.b(handler, gVar));
            copyOnWriteArraySet.add(hVar.w);
            int i15 = Build.VERSION.SDK_INT;
            hVar = hVar;
            if (i15 >= 31) {
                try {
                    Context context2 = hVar.e;
                    boolean z11 = nVar.y;
                    e2.i0 a10 = g0Var.a(looper2, null);
                    n4 n4Var = new n4(context2, z11, (Object) hVar, lVar, 1);
                    hVar = hVar;
                    a10.d(n4Var);
                } catch (Throwable th2) {
                    th = th2;
                    i0Var = hVar;
                    i0Var.d.e();
                    throw th;
                }
            }
            x xVar2 = new x(hVar, i14);
            e2.c cVar = new e2.c();
            cVar.b = g0Var.a(looper2, null);
            cVar.c = g0Var.a(looper, null);
            cVar.e = 0;
            cVar.f = 0;
            cVar.d = xVar2;
            hVar.C = cVar;
            cVar.n(new gg.c((Object) hVar, 3));
            Context context3 = nVar.a;
            Looper looper3 = nVar.h;
            c0 c0Var2 = hVar.w;
            ac.a aVar = new ac.a();
            aVar.b = context3.getApplicationContext();
            aVar.d = g0Var.a(looper2, null);
            aVar.c = new c2.a(aVar, g0Var.a(looper3, null), c0Var2);
            hVar.y = aVar;
            aVar.x();
            if (nVar.u != Integer.MAX_VALUE && nVar.v != Integer.MAX_VALUE && nVar.w != Integer.MAX_VALUE && nVar.x != Integer.MAX_VALUE) {
                z10 = true;
                o0Var = new e2.o0(context, looper2, g0Var);
                hVar.z = o0Var;
                if (o0Var.a == z10) {
                    o0Var.a = z10;
                    o0Var.b(z10, o0Var.b);
                }
                c3.m0 m0Var = new c3.m0();
                new jb.b(context.getApplicationContext(), 5);
                g0Var.a(looper2, null);
                g0Var.a(Looper.getMainLooper(), null);
                hVar.A = m0Var;
                hVar.j0 = b2.q.c;
                hVar.k0 = b2.d;
                hVar.Z = e2.y.c;
                hVar.E = i15 >= 34 ? new h0(hVar, context) : null;
                hVar.F = new n4.q(22);
                hVar.G = new n4.q(22);
                hVar.D = new e2.e0(hVar, hVar.w, hVar.v, nVar.u, nVar.v, nVar.w, nVar.x);
                i0Var2.b(38, hVar.M).b();
                b2.f fVar = hVar.a0;
                i0Var2.getClass();
                e2.h0 c11 = e2.i0.c();
                c11.a = i0Var2.a.obtainMessage(31, 0, 0, fVar);
                c11.b();
                hVar.t1(1, 3, hVar.a0);
                hVar.t1(2, 4, Integer.valueOf(hVar.Y));
                hVar.t1(2, 5, 0);
                hVar.t1(1, 9, Boolean.valueOf(hVar.d0));
                hVar.t1(6, 8, hVar.x);
                hVar.t1(-1, 16, Integer.valueOf(hVar.h0));
                hVar.d.e();
            }
            z10 = false;
            o0Var = new e2.o0(context, looper2, g0Var);
            hVar.z = o0Var;
            if (o0Var.a == z10) {
            }
            c3.m0 m0Var2 = new c3.m0();
            new jb.b(context.getApplicationContext(), 5);
            g0Var.a(looper2, null);
            g0Var.a(Looper.getMainLooper(), null);
            hVar.A = m0Var2;
            hVar.j0 = b2.q.c;
            hVar.k0 = b2.d;
            hVar.Z = e2.y.c;
            hVar.E = i15 >= 34 ? new h0(hVar, context) : null;
            hVar.F = new n4.q(22);
            hVar.G = new n4.q(22);
            hVar.D = new e2.e0(hVar, hVar.w, hVar.v, nVar.u, nVar.v, nVar.w, nVar.x);
            i0Var2.b(38, hVar.M).b();
            b2.f fVar2 = hVar.a0;
            i0Var2.getClass();
            e2.h0 c112 = e2.i0.c();
            c112.a = i0Var2.a.obtainMessage(31, 0, 0, fVar2);
            c112.b();
            hVar.t1(1, 3, hVar.a0);
            hVar.t1(2, 4, Integer.valueOf(hVar.Y));
            hVar.t1(2, 5, 0);
            hVar.t1(1, 9, Boolean.valueOf(hVar.d0));
            hVar.t1(6, 8, hVar.x);
            hVar.t1(-1, 16, Integer.valueOf(hVar.h0));
            hVar.d.e();
        } catch (Throwable th3) {
            th = th3;
            i0Var = hVar;
        }
    }

    public static long m1(m1 m1Var) {
        b2.n1 n1Var = new b2.n1();
        b2.l1 l1Var = new b2.l1();
        m1Var.a.g(m1Var.b.a, l1Var);
        long j10 = m1Var.c;
        return j10 == -9223372036854775807L ? m1Var.a.m(l1Var.c, n1Var, 0L).l : l1Var.e + j10;
    }

    public static m1 n1(m1 m1Var, int i10) {
        m1 h = m1Var.h(i10);
        return (i10 == 1 || i10 == 4) ? h.b(false) : h;
    }

    @Override // b2.f1
    public final int A() {
        F1();
        if (!this.p0.a.p()) {
            m1 m1Var = this.p0;
            return m1Var.a.b(m1Var.b.a);
        }
        int i10 = this.q0;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    @Override // b2.f1
    public final Looper A0() {
        return this.t;
    }

    public final void A1(l lVar) {
        m1 m1Var = this.p0;
        m1 c10 = m1Var.c(m1Var.b);
        c10.q = c10.s;
        c10.r = 0L;
        m1 n12 = n1(c10, 1);
        if (lVar != null) {
            n12 = n12.f(lVar);
        }
        this.J++;
        this.l.n.a(6).b();
        D1(n12, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // b2.f1
    public final void B(b2.s0 s0Var) {
        F1();
        s0Var.getClass();
        if (s0Var.equals(this.R)) {
            return;
        }
        this.R = s0Var;
        this.m.e(15, new x(this, 3));
    }

    @Override // b2.f1
    public final void B0() {
        F1();
        if (this.b0 != 0.0f) {
            S(0.0f);
        }
    }

    public final void B1() {
        b2.b1 b1Var = this.P;
        String str = e2.l0.a;
        i0 i0Var = this.f;
        boolean n10 = i0Var.n();
        boolean d02 = i0Var.d0();
        boolean T0 = i0Var.T0();
        boolean S0 = i0Var.S0();
        boolean P0 = i0Var.P0();
        boolean v02 = i0Var.v0();
        boolean p5 = i0Var.y0().p();
        b2.a1 a1Var = new b2.a1();
        a1Var.a = new b2.u();
        b2.u uVar = (b2.u) a1Var.a;
        uVar.c(this.c.a);
        boolean z10 = !n10;
        a1Var.a(4, z10);
        boolean z11 = false;
        a1Var.a(5, d02 && !n10);
        a1Var.a(6, T0 && !n10);
        a1Var.a(7, !p5 && (T0 || !P0 || d02) && !n10);
        a1Var.a(8, S0 && !n10);
        a1Var.a(9, !p5 && (S0 || (P0 && v02)) && !n10);
        a1Var.a(10, z10);
        a1Var.a(11, d02 && !n10);
        if (d02 && !n10) {
            z11 = true;
        }
        a1Var.a(12, z11);
        b2.b1 b1Var2 = new b2.b1(uVar.d());
        this.P = b1Var2;
        if (b1Var2.equals(b1Var)) {
            return;
        }
        this.m.c(13, new x(this, 2));
    }

    @Override // b2.f1
    public final void C(b2.d1 d1Var) {
        F1();
        d1Var.getClass();
        e2.r rVar = this.m;
        if (rVar.i) {
            t6.p(Thread.currentThread() == rVar.a);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = rVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            e2.q qVar = (e2.q) it.next();
            if (qVar.a.equals(d1Var)) {
                e2.p pVar = rVar.c;
                qVar.d = true;
                if (pVar != null && qVar.c) {
                    qVar.c = false;
                    pVar.c(qVar.a, qVar.b.d());
                }
                copyOnWriteArraySet.remove(qVar);
            }
        }
    }

    @Override // b2.f1
    public final void C0() {
        F1();
    }

    public final void C1(int i10, boolean z10) {
        m1 m1Var = this.p0;
        int i11 = m1Var.n;
        int i12 = (i11 != 1 || z10) ? 0 : 1;
        if (m1Var.l == z10 && i11 == i12 && m1Var.m == i10) {
            return;
        }
        this.J++;
        if (m1Var.p) {
            m1Var = m1Var.a();
        }
        m1 e = m1Var.e(i10, i12, z10);
        e2.i0 i0Var = this.l.n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.a = i0Var.a.obtainMessage(1, z10 ? 1 : 0, i10 | (i12 << 4));
        c10.b();
        D1(e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // b2.f1
    public final b2 D() {
        F1();
        return this.k0;
    }

    @Override // b2.f1
    public final boolean D0() {
        F1();
        return this.I;
    }

    public final void D1(final m1 m1Var, int i10, boolean z10, int i11, long j10, int i12, boolean z11) {
        Pair pair;
        int i13;
        b2.p0 p0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14;
        int i15;
        Object obj;
        b2.p0 p0Var2;
        Object obj2;
        long j11;
        long j12;
        long j13;
        long m12;
        Object obj3;
        b2.p0 p0Var3;
        Object obj4;
        m1 m1Var2 = this.p0;
        this.p0 = m1Var;
        boolean equals = m1Var2.a.equals(m1Var.a);
        b2.n1 n1Var = (b2.n1) this.a;
        b2.l1 l1Var = this.o;
        b2.o1 o1Var = m1Var2.a;
        u2.g0 g0Var = m1Var2.b;
        b2.o1 o1Var2 = m1Var.a;
        u2.g0 g0Var2 = m1Var.b;
        if (o1Var2.p() && o1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (o1Var2.p() != o1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (o1Var.m(o1Var.g(g0Var.a, l1Var).c, n1Var, 0L).a.equals(o1Var2.m(o1Var2.g(g0Var2.a, l1Var).c, n1Var, 0L).a)) {
            pair = (z10 && i11 == 0 && g0Var.d < g0Var2.d) ? new Pair(Boolean.TRUE, 0) : (z10 && i11 == 1 && z11) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z10 && i11 == 0) {
                i13 = 1;
            } else if (z10 && i11 == 1) {
                i13 = 2;
            } else {
                if (equals) {
                    throw new IllegalStateException();
                }
                i13 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            p0Var = !m1Var.a.p() ? m1Var.a.m(m1Var.a.g(m1Var.b.a, this.o).c, (b2.n1) this.a, 0L).c : null;
            this.o0 = b2.s0.L;
        } else {
            p0Var = null;
        }
        if (booleanValue || !m1Var2.j.equals(m1Var.j)) {
            b2.r0 a2 = this.o0.a();
            List list = m1Var.j;
            for (int i16 = 0; i16 < list.size(); i16++) {
                b2.u0 u0Var = (b2.u0) list.get(i16);
                int i17 = 0;
                while (true) {
                    b2.t0[] t0VarArr = u0Var.a;
                    if (i17 < t0VarArr.length) {
                        t0VarArr[i17].b(a2);
                        i17++;
                    }
                }
            }
            this.o0 = new b2.s0(a2);
        }
        b2.s0 f12 = f1();
        boolean equals2 = f12.equals(this.Q);
        this.Q = f12;
        boolean z15 = m1Var2.l != m1Var.l;
        boolean z16 = m1Var2.e != m1Var.e;
        if (z16 || z15) {
            E1();
        }
        boolean z17 = m1Var2.g != m1Var.g;
        if (!equals) {
            this.m.c(0, new q(m1Var, i10, 0));
        }
        if (z10) {
            b2.l1 l1Var2 = new b2.l1();
            if (m1Var2.a.p()) {
                z12 = booleanValue;
                z13 = equals2;
                z14 = z16;
                i14 = i12;
                i15 = i14;
                obj = null;
                p0Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = m1Var2.b.a;
                m1Var2.a.g(obj5, l1Var2);
                int i18 = l1Var2.c;
                int b10 = m1Var2.a.b(obj5);
                z12 = booleanValue;
                z13 = equals2;
                z14 = z16;
                obj = m1Var2.a.m(i18, (b2.n1) this.a, 0L).a;
                p0Var2 = ((b2.n1) this.a).c;
                obj2 = obj5;
                i14 = i18;
                i15 = b10;
            }
            if (i11 == 0) {
                if (m1Var2.b.b()) {
                    u2.g0 g0Var3 = m1Var2.b;
                    j13 = l1Var2.a(g0Var3.b, g0Var3.c);
                    m12 = m1(m1Var2);
                } else if (m1Var2.b.e != -1) {
                    j13 = m1(this.p0);
                    m12 = j13;
                } else {
                    j11 = l1Var2.e;
                    j12 = l1Var2.d;
                    j13 = j11 + j12;
                    m12 = j13;
                }
            } else if (m1Var2.b.b()) {
                j13 = m1Var2.s;
                m12 = m1(m1Var2);
            } else {
                j11 = l1Var2.e;
                j12 = m1Var2.s;
                j13 = j11 + j12;
                m12 = j13;
            }
            long h02 = e2.l0.h0(j13);
            long h03 = e2.l0.h0(m12);
            u2.g0 g0Var4 = m1Var2.b;
            b2.e1 e1Var = new b2.e1(obj, i14, p0Var2, obj2, i15, h02, h03, g0Var4.b, g0Var4.c);
            b2.n1 n1Var2 = (b2.n1) this.a;
            int m0 = m0();
            int A = A();
            if (this.p0.a.p()) {
                obj3 = null;
                p0Var3 = null;
                obj4 = null;
            } else {
                m1 m1Var3 = this.p0;
                Object obj6 = m1Var3.b.a;
                m1Var3.a.g(obj6, this.o);
                A = this.p0.a.b(obj6);
                Object obj7 = this.p0.a.m(m0, n1Var2, 0L).a;
                p0Var3 = n1Var2.c;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i19 = A;
            long h04 = e2.l0.h0(j10);
            long h05 = this.p0.b.b() ? e2.l0.h0(m1(this.p0)) : h04;
            u2.g0 g0Var5 = this.p0.b;
            this.m.c(11, new ag.b0(i11, e1Var, new b2.e1(obj3, m0, p0Var3, obj4, i19, h04, h05, g0Var5.b, g0Var5.c), 1));
        } else {
            z12 = booleanValue;
            z13 = equals2;
            z14 = z16;
        }
        if (z12) {
            this.m.c(1, new q(p0Var, intValue, 1));
        }
        if (m1Var2.f != m1Var.f) {
            final int i20 = 7;
            this.m.c(10, new e2.o() { // from class: i2.s
                @Override // e2.o
                public final void invoke(Object obj8) {
                    b2.d1 d1Var = (b2.d1) obj8;
                    switch (i20) {
                        case 0:
                            m1 m1Var4 = m1Var;
                            d1Var.g(m1Var4.g);
                            d1Var.k(m1Var4.g);
                            break;
                        case 1:
                            m1 m1Var5 = m1Var;
                            d1Var.K(m1Var5.e, m1Var5.l);
                            break;
                        case 2:
                            d1Var.u(m1Var.e);
                            break;
                        case 3:
                            m1 m1Var6 = m1Var;
                            d1Var.o(m1Var6.m, m1Var6.l);
                            break;
                        case 4:
                            d1Var.f(m1Var.n);
                            break;
                        case 5:
                            d1Var.P(m1Var.m());
                            break;
                        case 6:
                            d1Var.z(m1Var.o);
                            break;
                        case 7:
                            d1Var.v(m1Var.f);
                            break;
                        case 8:
                            d1Var.H(m1Var.f);
                            break;
                        default:
                            d1Var.N(m1Var.i.d);
                            break;
                    }
                }
            });
            if (m1Var.f != null) {
                final int i21 = 8;
                this.m.c(10, new e2.o() { // from class: i2.s
                    @Override // e2.o
                    public final void invoke(Object obj8) {
                        b2.d1 d1Var = (b2.d1) obj8;
                        switch (i21) {
                            case 0:
                                m1 m1Var4 = m1Var;
                                d1Var.g(m1Var4.g);
                                d1Var.k(m1Var4.g);
                                break;
                            case 1:
                                m1 m1Var5 = m1Var;
                                d1Var.K(m1Var5.e, m1Var5.l);
                                break;
                            case 2:
                                d1Var.u(m1Var.e);
                                break;
                            case 3:
                                m1 m1Var6 = m1Var;
                                d1Var.o(m1Var6.m, m1Var6.l);
                                break;
                            case 4:
                                d1Var.f(m1Var.n);
                                break;
                            case 5:
                                d1Var.P(m1Var.m());
                                break;
                            case 6:
                                d1Var.z(m1Var.o);
                                break;
                            case 7:
                                d1Var.v(m1Var.f);
                                break;
                            case 8:
                                d1Var.H(m1Var.f);
                                break;
                            default:
                                d1Var.N(m1Var.i.d);
                                break;
                        }
                    }
                });
            }
        }
        x2.u uVar = m1Var2.i;
        x2.u uVar2 = m1Var.i;
        if (uVar != uVar2) {
            x2.t tVar = this.i;
            Object obj8 = uVar2.e;
            tVar.getClass();
            tVar.c = (x2.s) obj8;
            final int i22 = 9;
            this.m.c(2, new e2.o() { // from class: i2.s
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (i22) {
                        case 0:
                            m1 m1Var4 = m1Var;
                            d1Var.g(m1Var4.g);
                            d1Var.k(m1Var4.g);
                            break;
                        case 1:
                            m1 m1Var5 = m1Var;
                            d1Var.K(m1Var5.e, m1Var5.l);
                            break;
                        case 2:
                            d1Var.u(m1Var.e);
                            break;
                        case 3:
                            m1 m1Var6 = m1Var;
                            d1Var.o(m1Var6.m, m1Var6.l);
                            break;
                        case 4:
                            d1Var.f(m1Var.n);
                            break;
                        case 5:
                            d1Var.P(m1Var.m());
                            break;
                        case 6:
                            d1Var.z(m1Var.o);
                            break;
                        case 7:
                            d1Var.v(m1Var.f);
                            break;
                        case 8:
                            d1Var.H(m1Var.f);
                            break;
                        default:
                            d1Var.N(m1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (!z13) {
            this.m.c(14, new r(this.Q));
        }
        if (z17) {
            final int i23 = 0;
            this.m.c(3, new e2.o() { // from class: i2.s
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (i23) {
                        case 0:
                            m1 m1Var4 = m1Var;
                            d1Var.g(m1Var4.g);
                            d1Var.k(m1Var4.g);
                            break;
                        case 1:
                            m1 m1Var5 = m1Var;
                            d1Var.K(m1Var5.e, m1Var5.l);
                            break;
                        case 2:
                            d1Var.u(m1Var.e);
                            break;
                        case 3:
                            m1 m1Var6 = m1Var;
                            d1Var.o(m1Var6.m, m1Var6.l);
                            break;
                        case 4:
                            d1Var.f(m1Var.n);
                            break;
                        case 5:
                            d1Var.P(m1Var.m());
                            break;
                        case 6:
                            d1Var.z(m1Var.o);
                            break;
                        case 7:
                            d1Var.v(m1Var.f);
                            break;
                        case 8:
                            d1Var.H(m1Var.f);
                            break;
                        default:
                            d1Var.N(m1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z14 || z15) {
            final int i24 = 1;
            this.m.c(-1, new e2.o() { // from class: i2.s
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (i24) {
                        case 0:
                            m1 m1Var4 = m1Var;
                            d1Var.g(m1Var4.g);
                            d1Var.k(m1Var4.g);
                            break;
                        case 1:
                            m1 m1Var5 = m1Var;
                            d1Var.K(m1Var5.e, m1Var5.l);
                            break;
                        case 2:
                            d1Var.u(m1Var.e);
                            break;
                        case 3:
                            m1 m1Var6 = m1Var;
                            d1Var.o(m1Var6.m, m1Var6.l);
                            break;
                        case 4:
                            d1Var.f(m1Var.n);
                            break;
                        case 5:
                            d1Var.P(m1Var.m());
                            break;
                        case 6:
                            d1Var.z(m1Var.o);
                            break;
                        case 7:
                            d1Var.v(m1Var.f);
                            break;
                        case 8:
                            d1Var.H(m1Var.f);
                            break;
                        default:
                            d1Var.N(m1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z14) {
            final int i25 = 2;
            this.m.c(4, new e2.o() { // from class: i2.s
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (i25) {
                        case 0:
                            m1 m1Var4 = m1Var;
                            d1Var.g(m1Var4.g);
                            d1Var.k(m1Var4.g);
                            break;
                        case 1:
                            m1 m1Var5 = m1Var;
                            d1Var.K(m1Var5.e, m1Var5.l);
                            break;
                        case 2:
                            d1Var.u(m1Var.e);
                            break;
                        case 3:
                            m1 m1Var6 = m1Var;
                            d1Var.o(m1Var6.m, m1Var6.l);
                            break;
                        case 4:
                            d1Var.f(m1Var.n);
                            break;
                        case 5:
                            d1Var.P(m1Var.m());
                            break;
                        case 6:
                            d1Var.z(m1Var.o);
                            break;
                        case 7:
                            d1Var.v(m1Var.f);
                            break;
                        case 8:
                            d1Var.H(m1Var.f);
                            break;
                        default:
                            d1Var.N(m1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z15 || m1Var2.m != m1Var.m) {
            final int i26 = 3;
            this.m.c(5, new e2.o() { // from class: i2.s
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (i26) {
                        case 0:
                            m1 m1Var4 = m1Var;
                            d1Var.g(m1Var4.g);
                            d1Var.k(m1Var4.g);
                            break;
                        case 1:
                            m1 m1Var5 = m1Var;
                            d1Var.K(m1Var5.e, m1Var5.l);
                            break;
                        case 2:
                            d1Var.u(m1Var.e);
                            break;
                        case 3:
                            m1 m1Var6 = m1Var;
                            d1Var.o(m1Var6.m, m1Var6.l);
                            break;
                        case 4:
                            d1Var.f(m1Var.n);
                            break;
                        case 5:
                            d1Var.P(m1Var.m());
                            break;
                        case 6:
                            d1Var.z(m1Var.o);
                            break;
                        case 7:
                            d1Var.v(m1Var.f);
                            break;
                        case 8:
                            d1Var.H(m1Var.f);
                            break;
                        default:
                            d1Var.N(m1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (m1Var2.n != m1Var.n) {
            final int i27 = 4;
            this.m.c(6, new e2.o() { // from class: i2.s
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (i27) {
                        case 0:
                            m1 m1Var4 = m1Var;
                            d1Var.g(m1Var4.g);
                            d1Var.k(m1Var4.g);
                            break;
                        case 1:
                            m1 m1Var5 = m1Var;
                            d1Var.K(m1Var5.e, m1Var5.l);
                            break;
                        case 2:
                            d1Var.u(m1Var.e);
                            break;
                        case 3:
                            m1 m1Var6 = m1Var;
                            d1Var.o(m1Var6.m, m1Var6.l);
                            break;
                        case 4:
                            d1Var.f(m1Var.n);
                            break;
                        case 5:
                            d1Var.P(m1Var.m());
                            break;
                        case 6:
                            d1Var.z(m1Var.o);
                            break;
                        case 7:
                            d1Var.v(m1Var.f);
                            break;
                        case 8:
                            d1Var.H(m1Var.f);
                            break;
                        default:
                            d1Var.N(m1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (m1Var2.m() != m1Var.m()) {
            final int i28 = 5;
            this.m.c(7, new e2.o() { // from class: i2.s
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (i28) {
                        case 0:
                            m1 m1Var4 = m1Var;
                            d1Var.g(m1Var4.g);
                            d1Var.k(m1Var4.g);
                            break;
                        case 1:
                            m1 m1Var5 = m1Var;
                            d1Var.K(m1Var5.e, m1Var5.l);
                            break;
                        case 2:
                            d1Var.u(m1Var.e);
                            break;
                        case 3:
                            m1 m1Var6 = m1Var;
                            d1Var.o(m1Var6.m, m1Var6.l);
                            break;
                        case 4:
                            d1Var.f(m1Var.n);
                            break;
                        case 5:
                            d1Var.P(m1Var.m());
                            break;
                        case 6:
                            d1Var.z(m1Var.o);
                            break;
                        case 7:
                            d1Var.v(m1Var.f);
                            break;
                        case 8:
                            d1Var.H(m1Var.f);
                            break;
                        default:
                            d1Var.N(m1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (!m1Var2.o.equals(m1Var.o)) {
            final int i29 = 6;
            this.m.c(12, new e2.o() { // from class: i2.s
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (i29) {
                        case 0:
                            m1 m1Var4 = m1Var;
                            d1Var.g(m1Var4.g);
                            d1Var.k(m1Var4.g);
                            break;
                        case 1:
                            m1 m1Var5 = m1Var;
                            d1Var.K(m1Var5.e, m1Var5.l);
                            break;
                        case 2:
                            d1Var.u(m1Var.e);
                            break;
                        case 3:
                            m1 m1Var6 = m1Var;
                            d1Var.o(m1Var6.m, m1Var6.l);
                            break;
                        case 4:
                            d1Var.f(m1Var.n);
                            break;
                        case 5:
                            d1Var.P(m1Var.m());
                            break;
                        case 6:
                            d1Var.z(m1Var.o);
                            break;
                        case 7:
                            d1Var.v(m1Var.f);
                            break;
                        case 8:
                            d1Var.H(m1Var.f);
                            break;
                        default:
                            d1Var.N(m1Var.i.d);
                            break;
                    }
                }
            });
        }
        B1();
        this.m.b();
        if (m1Var2.p != m1Var.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).a.E1();
            }
        }
    }

    @Override // b2.f1
    public final b2.u1 E0() {
        F1();
        return ((x2.o) this.i).j();
    }

    public final void E1() {
        int h = h();
        c3.m0 m0Var = this.A;
        e2.o0 o0Var = this.z;
        boolean z10 = false;
        if (h != 1) {
            if (h == 2 || h == 3) {
                F1();
                boolean z11 = this.p0.p;
                if (t() && !z11) {
                    z10 = true;
                }
                o0Var.c(z10);
                m0Var.a(t());
                return;
            }
            if (h != 4) {
                throw new IllegalStateException();
            }
        }
        o0Var.c(false);
        m0Var.a(false);
    }

    @Override // b2.f1
    public final float F() {
        F1();
        return this.b0;
    }

    @Override // b2.f1
    public final long F0() {
        F1();
        if (this.p0.a.p()) {
            return this.r0;
        }
        m1 m1Var = this.p0;
        long j10 = 0;
        if (m1Var.k.d != m1Var.b.d) {
            return e2.l0.h0(m1Var.a.m(m0(), (b2.n1) this.a, 0L).m);
        }
        long j11 = m1Var.q;
        if (this.p0.k.b()) {
            m1 m1Var2 = this.p0;
            m1Var2.a.g(m1Var2.k.a, this.o).d(this.p0.k.b);
        } else {
            j10 = j11;
        }
        m1 m1Var3 = this.p0;
        b2.o1 o1Var = m1Var3.a;
        Object obj = m1Var3.k.a;
        b2.l1 l1Var = this.o;
        o1Var.g(obj, l1Var);
        return e2.l0.h0(j10 + l1Var.e);
    }

    public final void F1() {
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = e2.l0.a;
            Locale locale = Locale.US;
            String o10 = org.telegram.ui.Cells.f1.o("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f0) {
                throw new IllegalStateException(o10);
            }
            e2.a.m("ExoPlayerImpl", o10, this.g0 ? null : new IllegalStateException());
            this.g0 = true;
        }
    }

    @Override // b2.f1
    public final void G0(int i10) {
        F1();
    }

    @Override // b2.f1
    public final b2.f H() {
        F1();
        return this.a0;
    }

    @Override // b2.f1
    public final void I(int i10, boolean z10) {
        F1();
    }

    @Override // b2.f1
    public final b2.q J() {
        F1();
        return this.j0;
    }

    @Override // b2.f1
    public final void K() {
        F1();
    }

    @Override // b2.f1
    public final b2.s0 K0() {
        F1();
        return this.Q;
    }

    @Override // b2.f1
    public final void L(int i10, int i11) {
        F1();
    }

    @Override // b2.f1
    public final void L0(List list) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(-1, -9223372036854775807L, g12, true);
    }

    @Override // b2.f1
    public final void M(int i10) {
        F1();
    }

    @Override // b2.f1
    public final long M0() {
        F1();
        return e2.l0.h0(j1(this.p0));
    }

    @Override // b2.f1
    public final int N() {
        F1();
        if (n()) {
            return this.p0.b.c;
        }
        return -1;
    }

    @Override // b2.f1
    public final void N0(b2.f fVar, boolean z10) {
        F1();
        if (this.i0) {
            return;
        }
        boolean equals = Objects.equals(this.a0, fVar);
        e2.r rVar = this.m;
        if (!equals) {
            this.a0 = fVar;
            t1(1, 3, fVar);
            rVar.c(20, new a1.c(fVar, 24));
        }
        b2.f fVar2 = this.a0;
        e2.i0 i0Var = this.l.n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.a = i0Var.a.obtainMessage(31, z10 ? 1 : 0, 0, fVar2);
        c10.b();
        rVar.b();
    }

    @Override // b2.f1
    public final long O0() {
        F1();
        return this.l0;
    }

    @Override // b2.f1
    public final void Q(int i10, int i11) {
        F1();
        t6.f(i10 >= 0 && i11 >= i10);
        int size = this.p.size();
        int min = Math.min(i11, size);
        if (i10 >= size || i10 == min) {
            return;
        }
        m1 r12 = r1(this.p0, i10, min);
        D1(r12, 0, !r12.b.a.equals(this.p0.b.a), 4, j1(r12), -1, false);
    }

    @Override // b2.f1
    public final void R(SurfaceHolder surfaceHolder) {
        F1();
        if (surfaceHolder == null) {
            F1();
            s1();
            x1(null);
            q1(0, 0);
            return;
        }
        s1();
        this.W = true;
        this.V = surfaceHolder;
        surfaceHolder.addCallback(this.w);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            x1(null);
            q1(0, 0);
        } else {
            x1(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            q1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // b2.f1
    public final void S(float f7) {
        F1();
        float h = e2.l0.h(f7, 0.0f, 1.0f);
        float f10 = this.b0;
        if (f10 == h) {
            return;
        }
        if (h != 0.0f) {
            f10 = h;
        }
        this.c0 = f10;
        this.b0 = h;
        this.l.n.b(32, Float.valueOf(h)).b();
        this.m.e(22, new t(h, 0));
    }

    @Override // b2.f1
    public final void U(List list, int i10, long j10) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(i10, j10, g12, false);
    }

    @Override // b2.f1
    public final b2.y0 V() {
        F1();
        return this.p0.f;
    }

    @Override // b2.f1
    public final void W(boolean z10) {
        F1();
        C1(1, z10);
    }

    @Override // b2.h
    public final void X0() {
        boolean z10;
        e2.a.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.l0.a + "] [" + b2.q0.b() + "]");
        F1();
        this.y.x();
        this.z.c(false);
        this.A.a(false);
        h0 h0Var = this.E;
        if (h0Var != null && Build.VERSION.SDK_INT >= 34) {
            h0.a(h0Var);
        }
        e2.e0 e0Var = this.D;
        e0Var.f.a.removeCallbacksAndMessages(null);
        e0Var.a.C(e0Var.b);
        s0 s0Var = this.l;
        if (s0Var.Z || !s0Var.s.getThread().isAlive()) {
            z10 = true;
        } else {
            s0Var.Z = true;
            e2.i iVar = new e2.i(s0Var.F);
            s0Var.n.b(7, iVar).b();
            z10 = iVar.c(s0Var.K);
        }
        if (!z10) {
            this.m.e(10, new d2.c(19));
        }
        this.m.d();
        this.j.a.removeCallbacksAndMessages(null);
        y2.c cVar = this.u;
        j2.g gVar = this.s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((y2.f) cVar).c.a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            y2.b bVar = (y2.b) it.next();
            if (bVar.b == gVar) {
                bVar.c = true;
                copyOnWriteArrayList.remove(bVar);
            }
        }
        m1 m1Var = this.p0;
        if (m1Var.p) {
            this.p0 = m1Var.a();
        }
        m1 n12 = n1(this.p0, 1);
        this.p0 = n12;
        m1 c10 = n12.c(n12.b);
        this.p0 = c10;
        c10.q = c10.s;
        this.p0.r = 0L;
        j2.g gVar2 = this.s;
        e2.i0 i0Var = gVar2.n;
        i0Var.getClass();
        i0Var.d(new gg.c(gVar2, 14));
        s1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.e0 = d2.d.d;
        this.i0 = true;
    }

    @Override // b2.f1
    public final long Y() {
        F1();
        return this.m0;
    }

    @Override // b2.h
    public final void Y0(int i10, long j10, boolean z10) {
        F1();
        if (i10 == -1) {
            return;
        }
        t6.f(i10 >= 0);
        b2.o1 o1Var = this.p0.a;
        if (o1Var.p() || i10 < o1Var.o()) {
            j2.g gVar = this.s;
            if (!gVar.r) {
                j2.a Q = gVar.Q();
                gVar.r = true;
                gVar.V(Q, -1, new ig.c0(Q, 3));
            }
            this.J++;
            if (n()) {
                e2.a.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                p0 p0Var = new p0(this.p0);
                p0Var.f(1);
                i0 i0Var = this.k.b;
                i0Var.j.d(new d1.e(15, i0Var, p0Var));
                return;
            }
            m1 m1Var = this.p0;
            int i11 = m1Var.e;
            if (i11 == 3 || (i11 == 4 && !o1Var.p())) {
                m1Var = this.p0.h(2);
            }
            int m0 = m0();
            m1 o12 = o1(m1Var, o1Var, p1(o1Var, i10, j10));
            this.l.n.b(3, new r0(o1Var, i10, e2.l0.S(j10))).b();
            D1(o12, 0, true, 1, j1(o12), m0, z10);
        }
    }

    @Override // b2.f1
    public final long Z() {
        F1();
        return i1(this.p0);
    }

    @Override // b2.f1
    public final void a() {
        F1();
        m1 m1Var = this.p0;
        if (m1Var.e != 1) {
            return;
        }
        m1 f7 = m1Var.f(null);
        m1 n12 = n1(f7, f7.a.p() ? 4 : 2);
        this.J++;
        this.l.n.a(29).b();
        D1(n12, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // b2.f1
    public final void a0(int i10, List list) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        t6.f(i10 >= 0);
        int min = Math.min(i10, this.p.size());
        if (!this.p0.a.p()) {
            D1(e1(this.p0, min, g12), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z10 = this.q0 == -1;
        F1();
        v1(-1, -9223372036854775807L, g12, z10);
    }

    @Override // b2.f1
    public final void b0() {
        F1();
        if (this.b0 == 0.0f) {
            float f7 = this.c0;
            if (f7 != 0.0f) {
                S(f7);
            }
        }
    }

    @Override // b2.f1
    public final void c(b2.z0 z0Var) {
        F1();
        if (this.p0.o.equals(z0Var)) {
            return;
        }
        m1 g10 = this.p0.g(z0Var);
        this.J++;
        this.l.n.b(4, z0Var).b();
        D1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // b2.f1
    public final long c0() {
        F1();
        if (!n()) {
            return F0();
        }
        m1 m1Var = this.p0;
        return m1Var.k.equals(m1Var.b) ? e2.l0.h0(this.p0.q) : getDuration();
    }

    @Override // b2.f1
    public final boolean d() {
        F1();
        return this.p0.g;
    }

    public final m1 e1(m1 m1Var, int i10, ArrayList arrayList) {
        b2.o1 o1Var = m1Var.a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.p;
            if (i11 >= size) {
                this.O = this.O.f(i10, arrayList2.size());
                r1 r1Var = new r1(arrayList3, this.O);
                m1 o12 = o1(m1Var, r1Var, l1(o1Var, r1Var, k1(m1Var), i1(m1Var)));
                u2.i1 i1Var = this.O;
                e2.i0 i0Var = this.l.n;
                n0 n0Var = new n0(arrayList2, i1Var, -1, -9223372036854775807L);
                i0Var.getClass();
                e2.h0 c10 = e2.i0.c();
                c10.a = i0Var.a.obtainMessage(18, i10, 0, n0Var);
                c10.b();
                return o12;
            }
            k1 k1Var = new k1((u2.a) arrayList.get(i11), this.q);
            arrayList2.add(k1Var);
            arrayList3.add(i11 + i10, new e0(k1Var.b, k1Var.a));
            i11++;
        }
    }

    @Override // b2.f1
    public final void f0(int i10) {
        F1();
    }

    public final b2.s0 f1() {
        b2.o1 y02 = y0();
        if (y02.p()) {
            return this.o0;
        }
        b2.p0 p0Var = y02.m(m0(), (b2.n1) this.a, 0L).c;
        b2.r0 a2 = this.o0.a();
        b2.s0 s0Var = p0Var.d;
        if (s0Var != null) {
            e9.n0 n0Var = s0Var.K;
            byte[] bArr = s0Var.k;
            CharSequence charSequence = s0Var.a;
            if (charSequence != null) {
                a2.a = charSequence;
            }
            CharSequence charSequence2 = s0Var.b;
            if (charSequence2 != null) {
                a2.b = charSequence2;
            }
            CharSequence charSequence3 = s0Var.c;
            if (charSequence3 != null) {
                a2.c = charSequence3;
            }
            CharSequence charSequence4 = s0Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = s0Var.e;
            if (charSequence5 != null) {
                a2.e = charSequence5;
            }
            CharSequence charSequence6 = s0Var.f;
            if (charSequence6 != null) {
                a2.f = charSequence6;
            }
            CharSequence charSequence7 = s0Var.g;
            if (charSequence7 != null) {
                a2.g = charSequence7;
            }
            Long l4 = s0Var.h;
            if (l4 != null) {
                t6.f(l4.longValue() >= 0);
                a2.h = l4;
            }
            b2.g1 g1Var = s0Var.i;
            if (g1Var != null) {
                a2.i = g1Var;
            }
            b2.g1 g1Var2 = s0Var.j;
            if (g1Var2 != null) {
                a2.j = g1Var2;
            }
            Uri uri = s0Var.n;
            if (uri != null || bArr != null) {
                a2.n = uri;
                a2.b(bArr, s0Var.m);
                a2.l = s0Var.l;
            }
            Integer num = s0Var.o;
            if (num != null) {
                a2.o = num;
            }
            Integer num2 = s0Var.p;
            if (num2 != null) {
                a2.p = num2;
            }
            Integer num3 = s0Var.q;
            if (num3 != null) {
                a2.q = num3;
            }
            Boolean bool = s0Var.r;
            if (bool != null) {
                a2.r = bool;
            }
            Boolean bool2 = s0Var.s;
            if (bool2 != null) {
                a2.s = bool2;
            }
            Integer num4 = s0Var.t;
            if (num4 != null) {
                a2.t = num4;
            }
            Integer num5 = s0Var.u;
            if (num5 != null) {
                a2.t = num5;
            }
            Integer num6 = s0Var.v;
            if (num6 != null) {
                a2.u = num6;
            }
            Integer num7 = s0Var.w;
            if (num7 != null) {
                a2.v = num7;
            }
            Integer num8 = s0Var.x;
            if (num8 != null) {
                a2.w = num8;
            }
            Integer num9 = s0Var.y;
            if (num9 != null) {
                a2.x = num9;
            }
            Integer num10 = s0Var.z;
            if (num10 != null) {
                a2.y = num10;
            }
            CharSequence charSequence8 = s0Var.A;
            if (charSequence8 != null) {
                a2.z = charSequence8;
            }
            CharSequence charSequence9 = s0Var.B;
            if (charSequence9 != null) {
                a2.A = charSequence9;
            }
            CharSequence charSequence10 = s0Var.C;
            if (charSequence10 != null) {
                a2.B = charSequence10;
            }
            Integer num11 = s0Var.D;
            if (num11 != null) {
                a2.C = num11;
            }
            Integer num12 = s0Var.E;
            if (num12 != null) {
                a2.D = num12;
            }
            CharSequence charSequence11 = s0Var.F;
            if (charSequence11 != null) {
                a2.E = charSequence11;
            }
            CharSequence charSequence12 = s0Var.G;
            if (charSequence12 != null) {
                a2.F = charSequence12;
            }
            CharSequence charSequence13 = s0Var.H;
            if (charSequence13 != null) {
                a2.G = charSequence13;
            }
            Integer num13 = s0Var.I;
            if (num13 != null) {
                a2.H = num13;
            }
            Bundle bundle = s0Var.J;
            if (bundle != null) {
                a2.I = bundle;
            }
            if (!n0Var.isEmpty()) {
                a2.J = e9.n0.u(n0Var);
            }
        }
        return new b2.s0(a2);
    }

    @Override // b2.f1
    public final b2.z0 g() {
        F1();
        return this.p0.o;
    }

    @Override // b2.f1
    public final b2.w1 g0() {
        F1();
        return this.p0.i.d;
    }

    public final ArrayList g1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.r.a((b2.p0) list.get(i10)));
        }
        return arrayList;
    }

    @Override // b2.f1
    public final long getDuration() {
        F1();
        if (!n()) {
            return z();
        }
        m1 m1Var = this.p0;
        u2.g0 g0Var = m1Var.b;
        b2.o1 o1Var = m1Var.a;
        Object obj = g0Var.a;
        b2.l1 l1Var = this.o;
        o1Var.g(obj, l1Var);
        return e2.l0.h0(l1Var.a(g0Var.b, g0Var.c));
    }

    @Override // b2.f1
    public final int h() {
        F1();
        return this.p0.e;
    }

    @Override // b2.f1
    public final b2.s0 h0() {
        F1();
        return this.R;
    }

    public final p1 h1(o1 o1Var) {
        int k12 = k1(this.p0);
        b2.o1 o1Var2 = this.p0.a;
        if (k12 == -1) {
            k12 = 0;
        }
        s0 s0Var = this.l;
        return new p1(s0Var, o1Var, o1Var2, k12, s0Var.s);
    }

    public final long i1(m1 m1Var) {
        u2.g0 g0Var = m1Var.b;
        long j10 = m1Var.c;
        b2.o1 o1Var = m1Var.a;
        if (!g0Var.b()) {
            return e2.l0.h0(j1(m1Var));
        }
        Object obj = m1Var.b.a;
        b2.l1 l1Var = this.o;
        o1Var.g(obj, l1Var);
        if (j10 == -9223372036854775807L) {
            return e2.l0.h0(o1Var.m(k1(m1Var), (b2.n1) this.a, 0L).l);
        }
        return e2.l0.h0(j10) + e2.l0.h0(l1Var.e);
    }

    @Override // b2.f1
    public final d2.d j0() {
        F1();
        return this.e0;
    }

    public final long j1(m1 m1Var) {
        if (m1Var.a.p()) {
            return e2.l0.S(this.r0);
        }
        long l4 = m1Var.p ? m1Var.l() : m1Var.s;
        if (m1Var.b.b()) {
            return l4;
        }
        b2.o1 o1Var = m1Var.a;
        Object obj = m1Var.b.a;
        b2.l1 l1Var = this.o;
        o1Var.g(obj, l1Var);
        return l4 + l1Var.e;
    }

    @Override // b2.f1
    public final void k(int i10) {
        F1();
        if (this.H != i10) {
            this.H = i10;
            e2.i0 i0Var = this.l.n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.a = i0Var.a.obtainMessage(11, i10, 0);
            c10.b();
            w wVar = new w(i10, 0);
            e2.r rVar = this.m;
            rVar.c(8, wVar);
            B1();
            rVar.b();
        }
    }

    public final int k1(m1 m1Var) {
        return m1Var.a.p() ? this.q0 : m1Var.a.g(m1Var.b.a, this.o).c;
    }

    @Override // b2.f1
    public final int l() {
        F1();
        return 0;
    }

    @Override // b2.f1
    public final int l0() {
        F1();
        if (n()) {
            return this.p0.b.b;
        }
        return -1;
    }

    public final Pair l1(b2.o1 o1Var, r1 r1Var, int i10, long j10) {
        if (o1Var.p() || r1Var.p()) {
            boolean z10 = !o1Var.p() && r1Var.p();
            return p1(r1Var, z10 ? -1 : i10, z10 ? -9223372036854775807L : j10);
        }
        Pair i11 = o1Var.i((b2.n1) this.a, this.o, i10, e2.l0.S(j10));
        Object obj = i11.first;
        if (r1Var.b(obj) != -1) {
            return i11;
        }
        int U = s0.U((b2.n1) this.a, this.o, this.H, this.I, obj, o1Var, r1Var);
        if (U == -1) {
            return p1(r1Var, -1, -9223372036854775807L);
        }
        b2.n1 n1Var = (b2.n1) this.a;
        r1Var.m(U, n1Var, 0L);
        return p1(r1Var, U, e2.l0.h0(n1Var.l));
    }

    @Override // b2.f1
    public final int m() {
        F1();
        return this.H;
    }

    @Override // b2.f1
    public final int m0() {
        F1();
        int k12 = k1(this.p0);
        if (k12 == -1) {
            return 0;
        }
        return k12;
    }

    @Override // b2.f1
    public final boolean n() {
        F1();
        return this.p0.b.b();
    }

    @Override // b2.f1
    public final void o0(b2.d1 d1Var) {
        d1Var.getClass();
        this.m.a(d1Var);
    }

    public final m1 o1(m1 m1Var, b2.o1 o1Var, Pair pair) {
        List list;
        t6.f(o1Var.p() || pair != null);
        b2.o1 o1Var2 = m1Var.a;
        long i12 = i1(m1Var);
        m1 j10 = m1Var.j(o1Var);
        if (o1Var.p()) {
            u2.g0 g0Var = m1.u;
            long S = e2.l0.S(this.r0);
            m1 c10 = j10.d(g0Var, S, S, S, 0L, u2.r1.d, this.b, x1.e).c(g0Var);
            c10.q = c10.s;
            return c10;
        }
        Object obj = j10.b.a;
        String str = e2.l0.a;
        boolean equals = obj.equals(pair.first);
        u2.g0 g0Var2 = !equals ? new u2.g0(pair.first) : j10.b;
        long longValue = ((Long) pair.second).longValue();
        long S2 = e2.l0.S(i12);
        if (!o1Var2.p()) {
            S2 -= o1Var2.g(obj, this.o).e;
            if (equals && S2 - longValue == 1 && S2 == o1Var2.g(obj, this.o).d) {
                S2--;
            }
        }
        if (!equals || longValue < S2) {
            u2.g0 g0Var3 = g0Var2;
            t6.p(!g0Var3.b());
            u2.r1 r1Var = !equals ? u2.r1.d : j10.h;
            x2.u uVar = !equals ? this.b : j10.i;
            if (equals) {
                list = j10.j;
            } else {
                e9.l0 l0Var = e9.n0.b;
                list = x1.e;
            }
            m1 c11 = j10.d(g0Var3, longValue, longValue, longValue, 0L, r1Var, uVar, list).c(g0Var3);
            c11.q = longValue;
            return c11;
        }
        if (longValue != S2) {
            u2.g0 g0Var4 = g0Var2;
            t6.p(!g0Var4.b());
            long max = Math.max(0L, j10.r - (longValue - S2));
            long j11 = j10.q;
            if (j10.k.equals(j10.b)) {
                j11 = longValue + max;
            }
            m1 d = j10.d(g0Var4, longValue, longValue, longValue, max, j10.h, j10.i, j10.j);
            d.q = j11;
            return d;
        }
        int b10 = o1Var.b(j10.k.a);
        if (b10 != -1 && o1Var.f(b10, this.o, false).c == o1Var.g(g0Var2.a, this.o).c) {
            return j10;
        }
        o1Var.g(g0Var2.a, this.o);
        long a2 = g0Var2.b() ? this.o.a(g0Var2.b, g0Var2.c) : this.o.d;
        u2.g0 g0Var5 = g0Var2;
        m1 c12 = j10.d(g0Var5, j10.s, j10.s, j10.d, a2 - j10.s, j10.h, j10.i, j10.j).c(g0Var5);
        c12.q = a2;
        return c12;
    }

    @Override // b2.f1
    public final void p(b2.u1 u1Var) {
        F1();
        x2.t tVar = this.i;
        tVar.getClass();
        b2.u1 E0 = E0();
        if (!u1Var.equals(((x2.o) tVar).j())) {
            tVar.b(u1Var);
        }
        if (E0.equals(u1Var)) {
            return;
        }
        this.m.e(19, new a1.c(u1Var, 25));
    }

    @Override // b2.f1
    public final void p0(boolean z10) {
        F1();
    }

    public final Pair p1(b2.o1 o1Var, int i10, long j10) {
        if (o1Var.p()) {
            this.q0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.r0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= o1Var.o()) {
            i10 = o1Var.a(this.I);
            j10 = e2.l0.h0(o1Var.m(i10, (b2.n1) this.a, 0L).l);
        }
        return o1Var.i((b2.n1) this.a, this.o, i10, e2.l0.S(j10));
    }

    @Override // b2.f1
    public final long q() {
        F1();
        return e2.l0.h0(this.p0.r);
    }

    public final void q1(int i10, int i11) {
        e2.y yVar = this.Z;
        if (i10 == yVar.a && i11 == yVar.b) {
            return;
        }
        this.Z = new e2.y(i10, i11);
        n61 n61Var = this.s0;
        if (n61Var != null) {
            n61Var.execute(new u(this, i10, i11, 0));
            return;
        }
        this.m.e(24, new v(i10, i11, 0));
        t1(2, 14, new e2.y(i10, i11));
    }

    @Override // b2.f1
    public final void r0(List list, int i10, int i11) {
        F1();
        t6.f(i10 >= 0 && i11 >= i10);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        if (i10 > size) {
            return;
        }
        int min = Math.min(i11, size);
        if (min - i10 == list.size()) {
            for (int i12 = i10; i12 < min; i12++) {
                if (((e0) arrayList.get(i12)).b.k.a((b2.p0) list.get(i12 - i10))) {
                }
            }
            this.J++;
            e2.i0 i0Var = this.l.n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.a = i0Var.a.obtainMessage(27, i10, min, list);
            c10.b();
            for (int i13 = i10; i13 < min; i13++) {
                e0 e0Var = (e0) arrayList.get(i13);
                b2.o1 o1Var = e0Var.c;
                b2.p0 p0Var = (b2.p0) list.get(i13 - i10);
                e0Var.c = o1Var instanceof u2.q1 ? new u2.q1(((u2.q1) o1Var).e, p0Var) : new u2.q1(o1Var, p0Var);
            }
            D1(this.p0.j(new r1(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList g12 = g1(list);
        if (!this.p0.a.p()) {
            m1 r12 = r1(e1(this.p0, min, g12), i10, min);
            D1(r12, 0, !r12.b.a.equals(this.p0.b.a), 4, j1(r12), -1, false);
        } else {
            boolean z10 = this.q0 == -1;
            F1();
            v1(-1, -9223372036854775807L, g12, z10);
        }
    }

    public final m1 r1(m1 m1Var, int i10, int i11) {
        ArrayList arrayList;
        int k12 = k1(m1Var);
        long i12 = i1(m1Var);
        b2.o1 o1Var = m1Var.a;
        this.J++;
        int i13 = i11 - 1;
        while (true) {
            arrayList = this.p;
            if (i13 < i10) {
                break;
            }
            arrayList.remove(i13);
            i13--;
        }
        this.O = this.O.a(i10, i11);
        r1 r1Var = new r1(arrayList, this.O);
        m1 o12 = o1(m1Var, r1Var, l1(o1Var, r1Var, k12, i12));
        int i14 = o12.e;
        if (i14 != 1 && i14 != 4 && k12 >= i10 && k12 < i11) {
            if (s0.U((b2.n1) this.a, this.o, this.H, this.I, m1Var.b.a, o1Var, r1Var) == -1) {
                o12 = n1(o12, 4);
            }
        }
        u2.i1 i1Var = this.O;
        e2.i0 i0Var = this.l.n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.a = i0Var.a.obtainMessage(20, i10, i11, i1Var);
        c10.b();
        return o12;
    }

    @Override // b2.f1
    public final b2.b1 s() {
        F1();
        return this.P;
    }

    public final void s1() {
        TextureView textureView = this.X;
        c0 c0Var = this.w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != c0Var) {
                e2.a.l("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.X.setSurfaceTextureListener(null);
            }
            this.X = null;
        }
        SurfaceHolder surfaceHolder = this.V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(c0Var);
            this.V = null;
        }
    }

    @Override // b2.h, b2.f1
    public final void stop() {
        F1();
        A1(null);
        this.e0 = new d2.d(this.p0.s, x1.e);
    }

    @Override // b2.f1
    public final boolean t() {
        F1();
        return this.p0.l;
    }

    public final void t1(int i10, int i11, Object obj) {
        for (b bVar : this.g) {
            if (i10 == -1 || bVar.b == i10) {
                p1 h12 = h1(bVar);
                t6.p(!h12.f);
                h12.c = i11;
                t6.p(!h12.f);
                h12.d = obj;
                h12.b();
            }
        }
        for (b bVar2 : this.h) {
            if (bVar2 != null && (i10 == -1 || bVar2.b == i10)) {
                p1 h13 = h1(bVar2);
                t6.p(!h13.f);
                h13.c = i11;
                t6.p(!h13.f);
                h13.d = obj;
                h13.b();
            }
        }
    }

    @Override // b2.f1
    public final void u0(int i10, int i11, int i12) {
        F1();
        t6.f(i10 >= 0 && i10 <= i11 && i12 >= 0);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int min = Math.min(i11, size);
        int min2 = Math.min(i12, size - (min - i10));
        if (i10 >= size || i10 == min || i10 == min2) {
            return;
        }
        b2.o1 y02 = y0();
        this.J++;
        e2.l0.R(i10, min, min2, arrayList);
        this.O = this.O.g();
        r1 r1Var = new r1(arrayList, this.O);
        m1 m1Var = this.p0;
        m1 o12 = o1(m1Var, r1Var, l1(y02, r1Var, k1(m1Var), i1(this.p0)));
        u2.i1 i1Var = this.O;
        s0 s0Var = this.l;
        s0Var.getClass();
        s0Var.n.b(19, new o0(i10, min, min2, i1Var)).b();
        D1(o12, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void u1(u2.a aVar, boolean z10) {
        F1();
        List singletonList = Collections.singletonList(aVar);
        F1();
        v1(-1, -9223372036854775807L, singletonList, z10);
    }

    public final void v1(int i10, long j10, List list, boolean z10) {
        int i11;
        long j11;
        int k12 = k1(this.p0);
        long M0 = M0();
        this.J++;
        ArrayList arrayList = this.p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            k1 k1Var = new k1((u2.a) list.get(i12), this.q);
            arrayList2.add(k1Var);
            arrayList.add(i12, new e0(k1Var.b, k1Var.a));
        }
        this.O = this.O.c(arrayList2.size());
        r1 r1Var = new r1(arrayList, this.O);
        boolean p5 = r1Var.p();
        int i13 = r1Var.h;
        if (!p5 && i10 >= i13) {
            throw new b2.a0();
        }
        if (z10) {
            j11 = -9223372036854775807L;
            i11 = r1Var.a(this.I);
        } else if (i10 == -1) {
            i11 = k12;
            j11 = M0;
        } else {
            i11 = i10;
            j11 = j10;
        }
        m1 o12 = o1(this.p0, r1Var, p1(r1Var, i11, j11));
        int i14 = o12.e;
        if (i14 == 1) {
            i14 = 1;
        } else {
            if (!r1Var.p()) {
                if (i11 != -1) {
                    if (i11 < i13) {
                        i14 = 2;
                    }
                }
            }
            i14 = 4;
        }
        m1 n12 = n1(o12, i14);
        this.l.n.b(17, new n0(arrayList2, this.O, i11, e2.l0.S(j11))).b();
        D1(n12, 0, (this.p0.b.a.equals(n12.b.a) || this.p0.a.p()) ? false : true, 4, j1(n12), -1, false);
    }

    @Override // b2.f1
    public final void w(boolean z10) {
        F1();
        if (this.I != z10) {
            this.I = z10;
            e2.i0 i0Var = this.l.n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.a = i0Var.a.obtainMessage(12, z10 ? 1 : 0, 0);
            c10.b();
            y yVar = new y(0, z10);
            e2.r rVar = this.m;
            rVar.c(9, yVar);
            B1();
            rVar.b();
        }
    }

    @Override // b2.f1
    public final int w0() {
        F1();
        return this.p0.n;
    }

    public final void w1(v1 v1Var) {
        F1();
        if (v1Var == null) {
            v1Var = v1.f;
        }
        if (this.N.equals(v1Var)) {
            return;
        }
        this.N = v1Var;
        this.l.n.b(5, v1Var).b();
    }

    public final void x1(Surface surface) {
        Object obj = this.T;
        boolean z10 = true;
        boolean z11 = (obj == null || obj == surface) ? false : true;
        long j10 = z11 ? this.B : -9223372036854775807L;
        s0 s0Var = this.l;
        if (!s0Var.Z && s0Var.s.getThread().isAlive()) {
            e2.i iVar = new e2.i(s0Var.F);
            s0Var.n.b(30, new Pair(surface, iVar)).b();
            if (j10 != -9223372036854775807L) {
                z10 = iVar.c(j10);
            }
        }
        if (z11) {
            Object obj2 = this.T;
            Surface surface2 = this.U;
            if (obj2 == surface2) {
                try {
                    surface2.release();
                } catch (Throwable unused) {
                }
                this.U = null;
            }
        }
        this.T = surface;
        if (z10) {
            return;
        }
        A1(new l(2, new ad.d("Detaching surface timed out."), 1003));
    }

    @Override // b2.f1
    public final long y() {
        F1();
        return this.n0;
    }

    @Override // b2.f1
    public final b2.o1 y0() {
        F1();
        return this.p0.a;
    }

    public final void y1(Surface surface) {
        F1();
        s1();
        x1(surface);
        int i10 = surface == null ? 0 : -1;
        q1(i10, i10);
    }

    @Override // b2.f1
    public final boolean z0() {
        F1();
        return false;
    }

    public final void z1(TextureView textureView) {
        F1();
        if (textureView == null) {
            F1();
            s1();
            x1(null);
            q1(0, 0);
            return;
        }
        s1();
        this.X = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            e2.a.l("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.w);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            x1(null);
            q1(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            x1(surface);
            this.U = surface;
            q1(textureView.getWidth(), textureView.getHeight());
        }
    }
}
