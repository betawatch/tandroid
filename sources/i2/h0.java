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
import b2.w1;
import bi.h4;
import di.x8;
import e9.x1;
import fi.c2;
import fi.q3;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class h0 extends b2.h implements q {
    public final ai.a A;
    public final long B;
    public final e2.c C;
    public final e2.e0 D;
    public final g0 E;
    public final n4.s F;
    public final n4.s G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public final s1 M;
    public t1 N;
    public u2.i1 O;
    public b2.c1 P;
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
    public final x2.t b;
    public float b0;
    public final b2.c1 c;
    public float c0;
    public final e2.i d;
    public boolean d0;
    public final Context e;
    public d2.c e0;
    public final h0 f;
    public final boolean f0;
    public final b[] g;
    public boolean g0;
    public final b[] h;
    public final int h0;
    public final x2.s i;
    public boolean i0;
    public final e2.i0 j;
    public final b2.q j0;
    public final w k;
    public b2 k0;
    public final r0 l;
    public final long l0;
    public final e2.r m;
    public final long m0;
    public final CopyOnWriteArraySet n;
    public final long n0;
    public final b2.m1 o;
    public b2.s0 o0;
    public final ArrayList p;
    public k1 p0;
    public final boolean q;
    public int q0;
    public final u2.f0 r;
    public long r0;
    public final j2.f s;
    public org.telegram.messenger.f1 s0;
    public final Looper t;
    public final ArrayList t0;
    public final y2.c u;
    public final e2.g0 v;
    public final b0 w;
    public final c0 x;
    public final c2.b y;
    public final ac.a z;

    static {
        b2.q0.a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x035c A[Catch: all -> 0x0319, TryCatch #2 {all -> 0x0319, blocks: (B:42:0x02cb, B:44:0x030a, B:46:0x030e, B:48:0x0312, B:52:0x031e, B:55:0x0331, B:57:0x035c, B:58:0x0363, B:67:0x032a), top: B:41:0x02cb }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x032a A[Catch: all -> 0x0319, TryCatch #2 {all -> 0x0319, blocks: (B:42:0x02cb, B:44:0x030a, B:46:0x030e, B:48:0x0312, B:52:0x031e, B:55:0x0331, B:57:0x035c, B:58:0x0363, B:67:0x032a), top: B:41:0x02cb }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [b2.h, i2.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v17, types: [i2.h0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h0(o oVar) {
        h0 h0Var;
        Context context;
        e2.g0 g0Var;
        Looper looper;
        e2.i0 i0Var;
        Looper looper2;
        int i10;
        Handler.Callback callback;
        h0 h0Var2;
        h0 h0Var3;
        boolean z10;
        ac.a aVar;
        int i11 = 0;
        ?? hVar = new b2.h(0);
        hVar.t0 = new ArrayList();
        hVar.d = new e2.i();
        try {
            e2.a.g("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(hVar)) + " [AndroidXMedia3/1.10.1] [" + e2.m0.a + "]");
            context = oVar.a;
            g0Var = oVar.b;
            hVar.e = context.getApplicationContext();
            hVar.s = new j2.f(g0Var);
            hVar.h0 = oVar.i;
            hVar.a0 = oVar.j;
            hVar.Y = oVar.k;
            hVar.d0 = false;
            hVar.B = oVar.t;
            b0 b0Var = new b0(hVar);
            hVar.w = b0Var;
            hVar.x = new c0();
            b[] b10 = ((k) oVar.c.get()).b(new Handler(oVar.h), b0Var, b0Var, b0Var, b0Var);
            hVar.g = b10;
            int i12 = 1;
            u6.p(b10.length > 0);
            hVar.h = new b[b10.length];
            int i13 = 0;
            while (true) {
                b[] bVarArr = hVar.h;
                if (i13 >= bVarArr.length) {
                    break;
                }
                int i14 = hVar.g[i13].b;
                bVarArr[i13] = null;
                i13++;
            }
            x2.s sVar = (x2.s) oVar.e.get();
            hVar.i = sVar;
            hVar.r = (u2.f0) oVar.d.get();
            y2.f b11 = y2.f.b(oVar.g.b);
            hVar.u = b11;
            hVar.q = oVar.l;
            hVar.N = oVar.m;
            hVar.l0 = oVar.o;
            hVar.m0 = oVar.p;
            hVar.n0 = oVar.q;
            hVar.M = oVar.n;
            looper = oVar.h;
            hVar.t = looper;
            hVar.v = g0Var;
            hVar.f = hVar;
            hVar.m = new e2.r(new CopyOnWriteArraySet(), looper, looper.getThread(), g0Var, new w(hVar, i11), true);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            hVar.n = copyOnWriteArraySet;
            hVar.p = new ArrayList();
            hVar.O = new u2.g1();
            b[] bVarArr2 = hVar.g;
            x2.t tVar = new x2.t(new q1[bVarArr2.length], new x2.p[bVarArr2.length], w1.b, null);
            hVar.b = tVar;
            hVar.o = new b2.m1();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int length = iArr.length;
            while (i11 < length) {
                int i15 = iArr[i11];
                u6.p(!false);
                sparseBooleanArray.append(i15, true);
                i11++;
            }
            sVar.getClass();
            u6.p(!false);
            sparseBooleanArray.append(29, true);
            u6.p(!false);
            b2.v vVar = new b2.v(sparseBooleanArray);
            hVar.c = new b2.c1(vVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i16 = 0; i16 < vVar.a.size(); i16++) {
                int a2 = vVar.a(i16);
                u6.p(!false);
                sparseBooleanArray2.append(a2, true);
            }
            u6.p(!false);
            sparseBooleanArray2.append(4, true);
            u6.p(!false);
            sparseBooleanArray2.append(10, true);
            u6.p(!false);
            hVar.P = new b2.c1(new b2.v(sparseBooleanArray2));
            hVar.j = g0Var.a(looper, null);
            w wVar = new w(hVar, i12);
            hVar.k = wVar;
            hVar.p0 = k1.k(tVar);
            hVar.s.r(hVar, looper);
            j2.k kVar = new j2.k(oVar.A);
            r0 r0Var = new r0(hVar.e, hVar.g, hVar.h, sVar, tVar, (t0) oVar.f.get(), b11, hVar.H, hVar.I, hVar.s, hVar.N, oVar.r, oVar.s, looper, g0Var, wVar, kVar, hVar.x, oVar.B);
            i0Var = r0Var.n;
            hVar.l = r0Var;
            looper2 = r0Var.s;
            hVar.b0 = 1.0f;
            hVar.H = 0;
            b2.s0 s0Var = b2.s0.L;
            hVar.Q = s0Var;
            hVar.R = s0Var;
            hVar.o0 = s0Var;
            hVar.q0 = -1;
            hVar.e0 = d2.c.d;
            hVar.f0 = true;
            hVar.p0(hVar.s);
            Handler handler = new Handler(looper);
            j2.f fVar = hVar.s;
            b11.getClass();
            fVar.getClass();
            u9.d dVar = b11.c;
            dVar.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) dVar.a;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                y2.b bVar = (y2.b) it.next();
                if (bVar.b == fVar) {
                    bVar.c = true;
                    copyOnWriteArrayList.remove(bVar);
                }
            }
            copyOnWriteArrayList.add(new y2.b(handler, fVar));
            copyOnWriteArraySet.add(hVar.w);
            i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                try {
                    Context context2 = hVar.e;
                    boolean z11 = oVar.y;
                    e2.i0 a10 = g0Var.a(r0Var.s, null);
                    callback = null;
                    h4 h4Var = new h4(context2, z11, (Object) hVar, kVar, 4);
                    h0Var2 = hVar;
                    a10.d(h4Var);
                } catch (Throwable th2) {
                    th = th2;
                    h0Var = hVar;
                    h0Var.d.e();
                    throw th;
                }
            } else {
                callback = null;
                h0Var2 = hVar;
            }
            h0Var3 = h0Var2;
        } catch (Throwable th3) {
            th = th3;
            h0Var = hVar;
        }
        try {
            e2.c cVar = new e2.c(0, looper2, looper, g0Var, new w(h0Var2, 2));
            h0Var3.C = cVar;
            cVar.i(new x8(h0Var3, 24));
            Context context3 = oVar.a;
            Looper looper3 = oVar.h;
            b0 b0Var2 = h0Var3.w;
            c2.b bVar2 = new c2.b();
            bVar2.b = context3.getApplicationContext();
            bVar2.d = g0Var.a(looper2, callback);
            bVar2.c = new c2.a(bVar2, g0Var.a(looper3, callback), b0Var2);
            h0Var3.y = bVar2;
            bVar2.w();
            if (oVar.u != Integer.MAX_VALUE && oVar.v != Integer.MAX_VALUE && oVar.w != Integer.MAX_VALUE && oVar.x != Integer.MAX_VALUE) {
                z10 = true;
                aVar = new ac.a(context, looper2, g0Var);
                h0Var3.z = aVar;
                if (aVar.a == z10) {
                    aVar.a = z10;
                    aVar.b(z10, aVar.b);
                }
                ai.a aVar2 = new ai.a();
                new sb.a(context.getApplicationContext(), 7);
                g0Var.a(looper2, callback);
                g0Var.a(Looper.getMainLooper(), callback);
                h0Var3.A = aVar2;
                h0Var3.j0 = b2.q.c;
                h0Var3.k0 = b2.d;
                h0Var3.Z = e2.y.c;
                h0Var3.E = i10 < 34 ? new g0(h0Var3, context) : callback;
                h0Var3.F = new n4.s(20);
                h0Var3.G = new n4.s(20);
                hVar = h0Var3;
                hVar.D = new e2.e0(hVar, h0Var3.w, h0Var3.v, oVar.u, oVar.v, oVar.w, oVar.x);
                i0Var.b(38, hVar.M).b();
                b2.f fVar2 = hVar.a0;
                i0Var.getClass();
                e2.h0 c10 = e2.i0.c();
                c10.a = i0Var.a.obtainMessage(31, 0, 0, fVar2);
                c10.b();
                hVar.t1(1, 3, hVar.a0);
                hVar.t1(2, 4, Integer.valueOf(hVar.Y));
                hVar.t1(2, 5, 0);
                hVar.t1(1, 9, Boolean.valueOf(hVar.d0));
                hVar.t1(6, 8, hVar.x);
                hVar.t1(-1, 16, Integer.valueOf(hVar.h0));
                hVar.d.e();
            }
            z10 = false;
            aVar = new ac.a(context, looper2, g0Var);
            h0Var3.z = aVar;
            if (aVar.a == z10) {
            }
            ai.a aVar22 = new ai.a();
            new sb.a(context.getApplicationContext(), 7);
            g0Var.a(looper2, callback);
            g0Var.a(Looper.getMainLooper(), callback);
            h0Var3.A = aVar22;
            h0Var3.j0 = b2.q.c;
            h0Var3.k0 = b2.d;
            h0Var3.Z = e2.y.c;
            h0Var3.E = i10 < 34 ? new g0(h0Var3, context) : callback;
            h0Var3.F = new n4.s(20);
            h0Var3.G = new n4.s(20);
            hVar = h0Var3;
            hVar.D = new e2.e0(hVar, h0Var3.w, h0Var3.v, oVar.u, oVar.v, oVar.w, oVar.x);
            i0Var.b(38, hVar.M).b();
            b2.f fVar22 = hVar.a0;
            i0Var.getClass();
            e2.h0 c102 = e2.i0.c();
            c102.a = i0Var.a.obtainMessage(31, 0, 0, fVar22);
            c102.b();
            hVar.t1(1, 3, hVar.a0);
            hVar.t1(2, 4, Integer.valueOf(hVar.Y));
            hVar.t1(2, 5, 0);
            hVar.t1(1, 9, Boolean.valueOf(hVar.d0));
            hVar.t1(6, 8, hVar.x);
            hVar.t1(-1, 16, Integer.valueOf(hVar.h0));
            hVar.d.e();
        } catch (Throwable th4) {
            th = th4;
            h0Var = h0Var3;
            h0Var.d.e();
            throw th;
        }
    }

    public static long m1(k1 k1Var) {
        b2.o1 o1Var = new b2.o1();
        b2.m1 m1Var = new b2.m1();
        k1Var.a.g(k1Var.b.a, m1Var);
        long j10 = k1Var.c;
        return j10 == -9223372036854775807L ? k1Var.a.m(m1Var.c, o1Var, 0L).l : m1Var.e + j10;
    }

    public static k1 n1(k1 k1Var, int i10) {
        k1 h = k1Var.h(i10);
        return (i10 == 1 || i10 == 4) ? h.b(false) : h;
    }

    @Override // b2.g1
    public final int A() {
        F1();
        if (!this.p0.a.p()) {
            k1 k1Var = this.p0;
            return k1Var.a.b(k1Var.b.a);
        }
        int i10 = this.q0;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    @Override // b2.g1
    public final Looper A0() {
        return this.t;
    }

    public final void A1(m mVar) {
        k1 k1Var = this.p0;
        k1 c10 = k1Var.c(k1Var.b);
        c10.q = c10.s;
        c10.r = 0L;
        k1 n12 = n1(c10, 1);
        if (mVar != null) {
            n12 = n12.f(mVar);
        }
        this.J++;
        this.l.n.a(6).b();
        D1(n12, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // b2.g1
    public final void B(b2.s0 s0Var) {
        F1();
        s0Var.getClass();
        if (s0Var.equals(this.R)) {
            return;
        }
        this.R = s0Var;
        this.m.e(15, new w(this, 4));
    }

    @Override // b2.g1
    public final void B0() {
        F1();
        if (this.b0 != 0.0f) {
            U(0.0f);
        }
    }

    public final void B1() {
        b2.c1 c1Var = this.P;
        String str = e2.m0.a;
        h0 h0Var = this.f;
        boolean n10 = h0Var.n();
        boolean e02 = h0Var.e0();
        boolean T0 = h0Var.T0();
        boolean S0 = h0Var.S0();
        boolean P0 = h0Var.P0();
        boolean v02 = h0Var.v0();
        boolean p5 = h0Var.y0().p();
        b2.b1 b1Var = new b2.b1();
        b1Var.a = new b2.u();
        b2.u uVar = (b2.u) b1Var.a;
        uVar.c(this.c.a);
        boolean z10 = !n10;
        b1Var.a(4, z10);
        boolean z11 = false;
        b1Var.a(5, e02 && !n10);
        b1Var.a(6, T0 && !n10);
        b1Var.a(7, !p5 && (T0 || !P0 || e02) && !n10);
        b1Var.a(8, S0 && !n10);
        b1Var.a(9, !p5 && (S0 || (P0 && v02)) && !n10);
        b1Var.a(10, z10);
        b1Var.a(11, e02 && !n10);
        if (e02 && !n10) {
            z11 = true;
        }
        b1Var.a(12, z11);
        b2.c1 c1Var2 = new b2.c1(uVar.d());
        this.P = c1Var2;
        if (c1Var2.equals(c1Var)) {
            return;
        }
        this.m.c(13, new w(this, 3));
    }

    @Override // b2.g1
    public final void C(b2.e1 e1Var) {
        F1();
        e1Var.getClass();
        e2.r rVar = this.m;
        if (rVar.i) {
            u6.p(Thread.currentThread() == rVar.a);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = rVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            e2.q qVar = (e2.q) it.next();
            if (qVar.a.equals(e1Var)) {
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

    @Override // b2.g1
    public final void C0() {
        F1();
    }

    public final void C1(int i10, boolean z10) {
        k1 k1Var = this.p0;
        int i11 = k1Var.n;
        int i12 = (i11 != 1 || z10) ? 0 : 1;
        if (k1Var.l == z10 && i11 == i12 && k1Var.m == i10) {
            return;
        }
        this.J++;
        if (k1Var.p) {
            k1Var = k1Var.a();
        }
        k1 e = k1Var.e(i10, i12, z10);
        e2.i0 i0Var = this.l.n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.a = i0Var.a.obtainMessage(1, z10 ? 1 : 0, i10 | (i12 << 4));
        c10.b();
        D1(e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // b2.g1
    public final b2 D() {
        F1();
        return this.k0;
    }

    @Override // b2.g1
    public final boolean D0() {
        F1();
        return this.I;
    }

    public final void D1(final k1 k1Var, int i10, boolean z10, int i11, long j10, int i12, boolean z11) {
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
        k1 k1Var2 = this.p0;
        this.p0 = k1Var;
        boolean equals = k1Var2.a.equals(k1Var.a);
        b2.o1 o1Var = (b2.o1) this.a;
        b2.m1 m1Var = this.o;
        b2.p1 p1Var = k1Var2.a;
        u2.g0 g0Var = k1Var2.b;
        b2.p1 p1Var2 = k1Var.a;
        u2.g0 g0Var2 = k1Var.b;
        if (p1Var2.p() && p1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (p1Var2.p() != p1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (p1Var.m(p1Var.g(g0Var.a, m1Var).c, o1Var, 0L).a.equals(p1Var2.m(p1Var2.g(g0Var2.a, m1Var).c, o1Var, 0L).a)) {
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
            p0Var = !k1Var.a.p() ? k1Var.a.m(k1Var.a.g(k1Var.b.a, this.o).c, (b2.o1) this.a, 0L).c : null;
            this.o0 = b2.s0.L;
        } else {
            p0Var = null;
        }
        if (booleanValue || !k1Var2.j.equals(k1Var.j)) {
            b2.r0 a2 = this.o0.a();
            List list = k1Var.j;
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
        boolean z15 = k1Var2.l != k1Var.l;
        boolean z16 = k1Var2.e != k1Var.e;
        if (z16 || z15) {
            E1();
        }
        boolean z17 = k1Var2.g != k1Var.g;
        if (!equals) {
            this.m.c(0, new r(k1Var, i10, 0));
        }
        if (z10) {
            b2.m1 m1Var2 = new b2.m1();
            if (k1Var2.a.p()) {
                z12 = booleanValue;
                z13 = equals2;
                z14 = z16;
                i14 = i12;
                i15 = i14;
                obj = null;
                p0Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = k1Var2.b.a;
                k1Var2.a.g(obj5, m1Var2);
                int i18 = m1Var2.c;
                int b10 = k1Var2.a.b(obj5);
                z12 = booleanValue;
                z13 = equals2;
                z14 = z16;
                obj = k1Var2.a.m(i18, (b2.o1) this.a, 0L).a;
                p0Var2 = ((b2.o1) this.a).c;
                obj2 = obj5;
                i14 = i18;
                i15 = b10;
            }
            if (i11 == 0) {
                if (k1Var2.b.b()) {
                    u2.g0 g0Var3 = k1Var2.b;
                    j13 = m1Var2.a(g0Var3.b, g0Var3.c);
                    m12 = m1(k1Var2);
                } else if (k1Var2.b.e != -1) {
                    j13 = m1(this.p0);
                    m12 = j13;
                } else {
                    j11 = m1Var2.e;
                    j12 = m1Var2.d;
                    j13 = j11 + j12;
                    m12 = j13;
                }
            } else if (k1Var2.b.b()) {
                j13 = k1Var2.s;
                m12 = m1(k1Var2);
            } else {
                j11 = m1Var2.e;
                j12 = k1Var2.s;
                j13 = j11 + j12;
                m12 = j13;
            }
            long h02 = e2.m0.h0(j13);
            long h03 = e2.m0.h0(m12);
            u2.g0 g0Var4 = k1Var2.b;
            b2.f1 f1Var = new b2.f1(obj, i14, p0Var2, obj2, i15, h02, h03, g0Var4.b, g0Var4.c);
            b2.o1 o1Var2 = (b2.o1) this.a;
            int n02 = n0();
            int A = A();
            if (this.p0.a.p()) {
                obj3 = null;
                p0Var3 = null;
                obj4 = null;
            } else {
                k1 k1Var3 = this.p0;
                Object obj6 = k1Var3.b.a;
                k1Var3.a.g(obj6, this.o);
                A = this.p0.a.b(obj6);
                Object obj7 = this.p0.a.m(n02, o1Var2, 0L).a;
                p0Var3 = o1Var2.c;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i19 = A;
            long h04 = e2.m0.h0(j10);
            long h05 = this.p0.b.b() ? e2.m0.h0(m1(this.p0)) : h04;
            u2.g0 g0Var5 = this.p0.b;
            this.m.c(11, new hg.b2(i11, f1Var, new b2.f1(obj3, n02, p0Var3, obj4, i19, h04, h05, g0Var5.b, g0Var5.c), 1));
        } else {
            z12 = booleanValue;
            z13 = equals2;
            z14 = z16;
        }
        if (z12) {
            this.m.c(1, new r(p0Var, intValue, 1));
        }
        if (k1Var2.f != k1Var.f) {
            final int i20 = 7;
            this.m.c(10, new e2.o() { // from class: i2.t
                @Override // e2.o
                public final void invoke(Object obj8) {
                    b2.e1 e1Var = (b2.e1) obj8;
                    switch (i20) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.g);
                            e1Var.onIsLoadingChanged(k1Var4.g);
                            break;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.l, k1Var5.e);
                            break;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            break;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.l, k1Var6.m);
                            break;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.n);
                            break;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            break;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.o);
                            break;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f);
                            break;
                        case 8:
                            e1Var.onPlayerError(k1Var.f);
                            break;
                        default:
                            e1Var.onTracksChanged(k1Var.i.d);
                            break;
                    }
                }
            });
            if (k1Var.f != null) {
                final int i21 = 8;
                this.m.c(10, new e2.o() { // from class: i2.t
                    @Override // e2.o
                    public final void invoke(Object obj8) {
                        b2.e1 e1Var = (b2.e1) obj8;
                        switch (i21) {
                            case 0:
                                k1 k1Var4 = k1Var;
                                e1Var.onLoadingChanged(k1Var4.g);
                                e1Var.onIsLoadingChanged(k1Var4.g);
                                break;
                            case 1:
                                k1 k1Var5 = k1Var;
                                e1Var.onPlayerStateChanged(k1Var5.l, k1Var5.e);
                                break;
                            case 2:
                                e1Var.onPlaybackStateChanged(k1Var.e);
                                break;
                            case 3:
                                k1 k1Var6 = k1Var;
                                e1Var.onPlayWhenReadyChanged(k1Var6.l, k1Var6.m);
                                break;
                            case 4:
                                e1Var.onPlaybackSuppressionReasonChanged(k1Var.n);
                                break;
                            case 5:
                                e1Var.onIsPlayingChanged(k1Var.m());
                                break;
                            case 6:
                                e1Var.onPlaybackParametersChanged(k1Var.o);
                                break;
                            case 7:
                                e1Var.onPlayerErrorChanged(k1Var.f);
                                break;
                            case 8:
                                e1Var.onPlayerError(k1Var.f);
                                break;
                            default:
                                e1Var.onTracksChanged(k1Var.i.d);
                                break;
                        }
                    }
                });
            }
        }
        x2.t tVar = k1Var2.i;
        x2.t tVar2 = k1Var.i;
        if (tVar != tVar2) {
            x2.s sVar = this.i;
            Object obj8 = tVar2.e;
            sVar.getClass();
            sVar.c = (x2.r) obj8;
            final int i22 = 9;
            this.m.c(2, new e2.o() { // from class: i2.t
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (i22) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.g);
                            e1Var.onIsLoadingChanged(k1Var4.g);
                            break;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.l, k1Var5.e);
                            break;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            break;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.l, k1Var6.m);
                            break;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.n);
                            break;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            break;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.o);
                            break;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f);
                            break;
                        case 8:
                            e1Var.onPlayerError(k1Var.f);
                            break;
                        default:
                            e1Var.onTracksChanged(k1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (!z13) {
            this.m.c(14, new s(this.Q));
        }
        if (z17) {
            final int i23 = 0;
            this.m.c(3, new e2.o() { // from class: i2.t
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (i23) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.g);
                            e1Var.onIsLoadingChanged(k1Var4.g);
                            break;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.l, k1Var5.e);
                            break;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            break;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.l, k1Var6.m);
                            break;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.n);
                            break;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            break;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.o);
                            break;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f);
                            break;
                        case 8:
                            e1Var.onPlayerError(k1Var.f);
                            break;
                        default:
                            e1Var.onTracksChanged(k1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z14 || z15) {
            final int i24 = 1;
            this.m.c(-1, new e2.o() { // from class: i2.t
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (i24) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.g);
                            e1Var.onIsLoadingChanged(k1Var4.g);
                            break;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.l, k1Var5.e);
                            break;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            break;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.l, k1Var6.m);
                            break;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.n);
                            break;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            break;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.o);
                            break;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f);
                            break;
                        case 8:
                            e1Var.onPlayerError(k1Var.f);
                            break;
                        default:
                            e1Var.onTracksChanged(k1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z14) {
            final int i25 = 2;
            this.m.c(4, new e2.o() { // from class: i2.t
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (i25) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.g);
                            e1Var.onIsLoadingChanged(k1Var4.g);
                            break;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.l, k1Var5.e);
                            break;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            break;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.l, k1Var6.m);
                            break;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.n);
                            break;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            break;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.o);
                            break;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f);
                            break;
                        case 8:
                            e1Var.onPlayerError(k1Var.f);
                            break;
                        default:
                            e1Var.onTracksChanged(k1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z15 || k1Var2.m != k1Var.m) {
            final int i26 = 3;
            this.m.c(5, new e2.o() { // from class: i2.t
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (i26) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.g);
                            e1Var.onIsLoadingChanged(k1Var4.g);
                            break;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.l, k1Var5.e);
                            break;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            break;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.l, k1Var6.m);
                            break;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.n);
                            break;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            break;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.o);
                            break;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f);
                            break;
                        case 8:
                            e1Var.onPlayerError(k1Var.f);
                            break;
                        default:
                            e1Var.onTracksChanged(k1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (k1Var2.n != k1Var.n) {
            final int i27 = 4;
            this.m.c(6, new e2.o() { // from class: i2.t
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (i27) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.g);
                            e1Var.onIsLoadingChanged(k1Var4.g);
                            break;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.l, k1Var5.e);
                            break;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            break;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.l, k1Var6.m);
                            break;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.n);
                            break;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            break;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.o);
                            break;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f);
                            break;
                        case 8:
                            e1Var.onPlayerError(k1Var.f);
                            break;
                        default:
                            e1Var.onTracksChanged(k1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (k1Var2.m() != k1Var.m()) {
            final int i28 = 5;
            this.m.c(7, new e2.o() { // from class: i2.t
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (i28) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.g);
                            e1Var.onIsLoadingChanged(k1Var4.g);
                            break;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.l, k1Var5.e);
                            break;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            break;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.l, k1Var6.m);
                            break;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.n);
                            break;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            break;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.o);
                            break;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f);
                            break;
                        case 8:
                            e1Var.onPlayerError(k1Var.f);
                            break;
                        default:
                            e1Var.onTracksChanged(k1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (!k1Var2.o.equals(k1Var.o)) {
            final int i29 = 6;
            this.m.c(12, new e2.o() { // from class: i2.t
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.e1 e1Var = (b2.e1) obj82;
                    switch (i29) {
                        case 0:
                            k1 k1Var4 = k1Var;
                            e1Var.onLoadingChanged(k1Var4.g);
                            e1Var.onIsLoadingChanged(k1Var4.g);
                            break;
                        case 1:
                            k1 k1Var5 = k1Var;
                            e1Var.onPlayerStateChanged(k1Var5.l, k1Var5.e);
                            break;
                        case 2:
                            e1Var.onPlaybackStateChanged(k1Var.e);
                            break;
                        case 3:
                            k1 k1Var6 = k1Var;
                            e1Var.onPlayWhenReadyChanged(k1Var6.l, k1Var6.m);
                            break;
                        case 4:
                            e1Var.onPlaybackSuppressionReasonChanged(k1Var.n);
                            break;
                        case 5:
                            e1Var.onIsPlayingChanged(k1Var.m());
                            break;
                        case 6:
                            e1Var.onPlaybackParametersChanged(k1Var.o);
                            break;
                        case 7:
                            e1Var.onPlayerErrorChanged(k1Var.f);
                            break;
                        case 8:
                            e1Var.onPlayerError(k1Var.f);
                            break;
                        default:
                            e1Var.onTracksChanged(k1Var.i.d);
                            break;
                    }
                }
            });
        }
        B1();
        this.m.b();
        if (k1Var2.p != k1Var.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).a.E1();
            }
        }
    }

    @Override // b2.g1
    public final b2.u1 E0() {
        F1();
        return ((x2.n) this.i).j();
    }

    public final void E1() {
        int d = d();
        ai.a aVar = this.A;
        ac.a aVar2 = this.z;
        boolean z10 = false;
        if (d != 1) {
            if (d == 2 || d == 3) {
                F1();
                boolean z11 = this.p0.p;
                if (t() && !z11) {
                    z10 = true;
                }
                aVar2.c(z10);
                aVar.a(t());
                return;
            }
            if (d != 4) {
                throw new IllegalStateException();
            }
        }
        aVar2.c(false);
        aVar.a(false);
    }

    @Override // b2.g1
    public final float F() {
        F1();
        return this.b0;
    }

    @Override // b2.g1
    public final long F0() {
        F1();
        if (this.p0.a.p()) {
            return this.r0;
        }
        k1 k1Var = this.p0;
        long j10 = 0;
        if (k1Var.k.d != k1Var.b.d) {
            return e2.m0.h0(k1Var.a.m(n0(), (b2.o1) this.a, 0L).m);
        }
        long j11 = k1Var.q;
        if (this.p0.k.b()) {
            k1 k1Var2 = this.p0;
            k1Var2.a.g(k1Var2.k.a, this.o).d(this.p0.k.b);
        } else {
            j10 = j11;
        }
        k1 k1Var3 = this.p0;
        b2.p1 p1Var = k1Var3.a;
        Object obj = k1Var3.k.a;
        b2.m1 m1Var = this.o;
        p1Var.g(obj, m1Var);
        return e2.m0.h0(j10 + m1Var.e);
    }

    public final void F1() {
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = e2.m0.a;
            Locale locale = Locale.US;
            String j10 = org.telegram.ui.Cells.d0.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f0) {
                throw new IllegalStateException(j10);
            }
            e2.a.m("ExoPlayerImpl", j10, this.g0 ? null : new IllegalStateException());
            this.g0 = true;
        }
    }

    @Override // b2.g1
    public final void G0(int i10) {
        F1();
    }

    @Override // b2.g1
    public final b2.f H() {
        F1();
        return this.a0;
    }

    @Override // b2.g1
    public final void I(int i10, boolean z10) {
        F1();
    }

    @Override // b2.g1
    public final b2.q J() {
        F1();
        return this.j0;
    }

    @Override // b2.g1
    public final void K() {
        F1();
    }

    @Override // b2.g1
    public final b2.s0 K0() {
        F1();
        return this.Q;
    }

    @Override // b2.g1
    public final void L(int i10, int i11) {
        F1();
    }

    @Override // b2.g1
    public final void L0(List list) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(-9223372036854775807L, g12, true, -1);
    }

    @Override // b2.g1
    public final void M(int i10) {
        F1();
    }

    @Override // b2.g1
    public final long M0() {
        F1();
        return e2.m0.h0(j1(this.p0));
    }

    @Override // b2.g1
    public final int N() {
        F1();
        if (n()) {
            return this.p0.b.c;
        }
        return -1;
    }

    @Override // b2.g1
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
            rVar.c(20, new f1.a(fVar, 5));
        }
        b2.f fVar2 = this.a0;
        e2.i0 i0Var = this.l.n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.a = i0Var.a.obtainMessage(31, z10 ? 1 : 0, 0, fVar2);
        c10.b();
        rVar.b();
    }

    @Override // b2.g1
    public final void O(int i10, int i11, List list) {
        F1();
        u6.g(i10 >= 0 && i11 >= i10);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        if (i10 > size) {
            return;
        }
        int min = Math.min(i11, size);
        if (min - i10 == list.size()) {
            for (int i12 = i10; i12 < min; i12++) {
                if (((d0) arrayList.get(i12)).b.k.a((b2.p0) list.get(i12 - i10))) {
                }
            }
            this.J++;
            e2.i0 i0Var = this.l.n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.a = i0Var.a.obtainMessage(27, i10, min, list);
            c10.b();
            for (int i13 = i10; i13 < min; i13++) {
                d0 d0Var = (d0) arrayList.get(i13);
                b2.p1 p1Var = d0Var.c;
                b2.p0 p0Var = (b2.p0) list.get(i13 - i10);
                d0Var.c = p1Var instanceof u2.q1 ? new u2.q1(((u2.q1) p1Var).e, p0Var) : new u2.q1(p1Var, p0Var);
            }
            D1(this.p0.j(new p1(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList g12 = g1(list);
        if (!this.p0.a.p()) {
            k1 r12 = r1(e1(this.p0, min, g12), i10, min);
            D1(r12, 0, !r12.b.a.equals(this.p0.b.a), 4, j1(r12), -1, false);
        } else {
            boolean z10 = this.q0 == -1;
            F1();
            v1(-9223372036854775807L, g12, z10, -1);
        }
    }

    @Override // b2.g1
    public final long O0() {
        F1();
        return this.l0;
    }

    @Override // b2.g1
    public final void R(int i10, int i11) {
        F1();
        u6.g(i10 >= 0 && i11 >= i10);
        int size = this.p.size();
        int min = Math.min(i11, size);
        if (i10 >= size || i10 == min) {
            return;
        }
        k1 r12 = r1(this.p0, i10, min);
        D1(r12, 0, !r12.b.a.equals(this.p0.b.a), 4, j1(r12), -1, false);
    }

    @Override // b2.g1
    public final void S(long j10, int i10, List list) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(j10, g12, false, i10);
    }

    @Override // b2.g1
    public final void T(SurfaceHolder surfaceHolder) {
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

    @Override // b2.g1
    public final void U(float f7) {
        F1();
        float h = e2.m0.h(f7, 0.0f, 1.0f);
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
        this.m.e(22, new u(h, 0));
    }

    @Override // b2.g1
    public final b2.z0 W() {
        F1();
        return this.p0.f;
    }

    @Override // b2.g1
    public final void X(boolean z10) {
        F1();
        C1(1, z10);
    }

    @Override // b2.h
    public final void X0() {
        boolean z10;
        e2.a.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.m0.a + "] [" + b2.q0.b() + "]");
        F1();
        this.y.w();
        this.z.c(false);
        this.A.a(false);
        g0 g0Var = this.E;
        if (g0Var != null && Build.VERSION.SDK_INT >= 34) {
            g0.a(g0Var);
        }
        e2.e0 e0Var = this.D;
        e0Var.f.a.removeCallbacksAndMessages(null);
        e0Var.a.C(e0Var.b);
        r0 r0Var = this.l;
        if (r0Var.Z || !r0Var.s.getThread().isAlive()) {
            z10 = true;
        } else {
            r0Var.Z = true;
            e2.i iVar = new e2.i(r0Var.F);
            r0Var.n.b(7, iVar).b();
            z10 = iVar.c(r0Var.K);
        }
        if (!z10) {
            this.m.e(10, new c2(20));
        }
        this.m.d();
        this.j.a.removeCallbacksAndMessages(null);
        y2.c cVar = this.u;
        j2.f fVar = this.s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((y2.f) cVar).c.a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            y2.b bVar = (y2.b) it.next();
            if (bVar.b == fVar) {
                bVar.c = true;
                copyOnWriteArrayList.remove(bVar);
            }
        }
        k1 k1Var = this.p0;
        if (k1Var.p) {
            this.p0 = k1Var.a();
        }
        k1 n12 = n1(this.p0, 1);
        this.p0 = n12;
        k1 c10 = n12.c(n12.b);
        this.p0 = c10;
        c10.q = c10.s;
        this.p0.r = 0L;
        j2.f fVar2 = this.s;
        e2.i0 i0Var = fVar2.n;
        i0Var.getClass();
        i0Var.d(new ig.t0(fVar2, 5));
        s1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.e0 = d2.c.d;
        this.i0 = true;
    }

    @Override // b2.h
    public final void Y0(int i10, long j10, boolean z10) {
        F1();
        if (i10 == -1) {
            return;
        }
        u6.g(i10 >= 0);
        b2.p1 p1Var = this.p0.a;
        if (p1Var.p() || i10 < p1Var.o()) {
            j2.f fVar = this.s;
            if (!fVar.r) {
                j2.a l4 = fVar.l();
                fVar.r = true;
                fVar.q(l4, -1, new f1.a(l4, 16));
            }
            this.J++;
            if (n()) {
                e2.a.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                o0 o0Var = new o0(this.p0);
                o0Var.f(1);
                h0 h0Var = this.k.b;
                h0Var.j.d(new q3(12, h0Var, o0Var));
                return;
            }
            k1 k1Var = this.p0;
            int i11 = k1Var.e;
            if (i11 == 3 || (i11 == 4 && !p1Var.p())) {
                k1Var = this.p0.h(2);
            }
            int n02 = n0();
            k1 o12 = o1(k1Var, p1Var, p1(p1Var, i10, j10));
            this.l.n.b(3, new q0(p1Var, i10, e2.m0.S(j10))).b();
            D1(o12, 0, true, 1, j1(o12), n02, z10);
        }
    }

    @Override // b2.g1
    public final long Z() {
        F1();
        return this.m0;
    }

    @Override // b2.g1
    public final long a0() {
        F1();
        return i1(this.p0);
    }

    @Override // b2.g1
    public final void b() {
        F1();
        k1 k1Var = this.p0;
        if (k1Var.e != 1) {
            return;
        }
        k1 f7 = k1Var.f(null);
        k1 n12 = n1(f7, f7.a.p() ? 4 : 2);
        this.J++;
        this.l.n.a(29).b();
        D1(n12, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // b2.g1
    public final void b0(int i10, List list) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        u6.g(i10 >= 0);
        int min = Math.min(i10, this.p.size());
        if (!this.p0.a.p()) {
            D1(e1(this.p0, min, g12), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z10 = this.q0 == -1;
        F1();
        v1(-9223372036854775807L, g12, z10, -1);
    }

    @Override // b2.g1
    public final boolean c() {
        F1();
        return this.p0.g;
    }

    @Override // b2.g1
    public final void c0() {
        F1();
        if (this.b0 == 0.0f) {
            float f7 = this.c0;
            if (f7 != 0.0f) {
                U(f7);
            }
        }
    }

    @Override // b2.g1
    public final int d() {
        F1();
        return this.p0.e;
    }

    @Override // b2.g1
    public final long d0() {
        F1();
        if (!n()) {
            return F0();
        }
        k1 k1Var = this.p0;
        return k1Var.k.equals(k1Var.b) ? e2.m0.h0(this.p0.q) : getDuration();
    }

    public final k1 e1(k1 k1Var, int i10, ArrayList arrayList) {
        b2.p1 p1Var = k1Var.a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.p;
            if (i11 >= size) {
                this.O = this.O.f(i10, arrayList2.size());
                p1 p1Var2 = new p1(arrayList3, this.O);
                k1 o12 = o1(k1Var, p1Var2, l1(p1Var, p1Var2, k1(k1Var), i1(k1Var)));
                u2.i1 i1Var = this.O;
                e2.i0 i0Var = this.l.n;
                m0 m0Var = new m0(arrayList2, i1Var, -1, -9223372036854775807L);
                i0Var.getClass();
                e2.h0 c10 = e2.i0.c();
                c10.a = i0Var.a.obtainMessage(18, i10, 0, m0Var);
                c10.b();
                return o12;
            }
            i1 i1Var2 = new i1((u2.a) arrayList.get(i11), this.q);
            arrayList2.add(i1Var2);
            arrayList3.add(i11 + i10, new d0(i1Var2.b, i1Var2.a));
            i11++;
        }
    }

    @Override // b2.g1
    public final void f(b2.a1 a1Var) {
        F1();
        if (this.p0.o.equals(a1Var)) {
            return;
        }
        k1 g10 = this.p0.g(a1Var);
        this.J++;
        this.l.n.b(4, a1Var).b();
        D1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final b2.s0 f1() {
        b2.p1 y02 = y0();
        if (y02.p()) {
            return this.o0;
        }
        b2.p0 p0Var = y02.m(n0(), (b2.o1) this.a, 0L).c;
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
                u6.g(l4.longValue() >= 0);
                a2.h = l4;
            }
            b2.h1 h1Var = s0Var.i;
            if (h1Var != null) {
                a2.i = h1Var;
            }
            b2.h1 h1Var2 = s0Var.j;
            if (h1Var2 != null) {
                a2.j = h1Var2;
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

    @Override // b2.g1
    public final void g0(int i10) {
        F1();
    }

    public final ArrayList g1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.r.a((b2.p0) list.get(i10)));
        }
        return arrayList;
    }

    @Override // b2.g1
    public final long getDuration() {
        F1();
        if (!n()) {
            return z();
        }
        k1 k1Var = this.p0;
        u2.g0 g0Var = k1Var.b;
        b2.p1 p1Var = k1Var.a;
        Object obj = g0Var.a;
        b2.m1 m1Var = this.o;
        p1Var.g(obj, m1Var);
        return e2.m0.h0(m1Var.a(g0Var.b, g0Var.c));
    }

    @Override // b2.g1
    public final b2.a1 h() {
        F1();
        return this.p0.o;
    }

    @Override // b2.g1
    public final w1 h0() {
        F1();
        return this.p0.i.d;
    }

    public final n1 h1(m1 m1Var) {
        int k12 = k1(this.p0);
        b2.p1 p1Var = this.p0.a;
        if (k12 == -1) {
            k12 = 0;
        }
        r0 r0Var = this.l;
        return new n1(r0Var, m1Var, p1Var, k12, r0Var.s);
    }

    @Override // b2.g1
    public final b2.s0 i0() {
        F1();
        return this.R;
    }

    public final long i1(k1 k1Var) {
        u2.g0 g0Var = k1Var.b;
        long j10 = k1Var.c;
        b2.p1 p1Var = k1Var.a;
        if (!g0Var.b()) {
            return e2.m0.h0(j1(k1Var));
        }
        Object obj = k1Var.b.a;
        b2.m1 m1Var = this.o;
        p1Var.g(obj, m1Var);
        if (j10 == -9223372036854775807L) {
            return e2.m0.h0(p1Var.m(k1(k1Var), (b2.o1) this.a, 0L).l);
        }
        return e2.m0.h0(j10) + e2.m0.h0(m1Var.e);
    }

    @Override // b2.g1
    public final void j(int i10) {
        F1();
        if (this.H != i10) {
            this.H = i10;
            e2.i0 i0Var = this.l.n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.a = i0Var.a.obtainMessage(11, i10, 0);
            c10.b();
            v vVar = new v(i10, 0);
            e2.r rVar = this.m;
            rVar.c(8, vVar);
            B1();
            rVar.b();
        }
    }

    public final long j1(k1 k1Var) {
        if (k1Var.a.p()) {
            return e2.m0.S(this.r0);
        }
        long l4 = k1Var.p ? k1Var.l() : k1Var.s;
        if (k1Var.b.b()) {
            return l4;
        }
        b2.p1 p1Var = k1Var.a;
        Object obj = k1Var.b.a;
        b2.m1 m1Var = this.o;
        p1Var.g(obj, m1Var);
        return l4 + m1Var.e;
    }

    @Override // b2.g1
    public final d2.c k0() {
        F1();
        return this.e0;
    }

    public final int k1(k1 k1Var) {
        return k1Var.a.p() ? this.q0 : k1Var.a.g(k1Var.b.a, this.o).c;
    }

    @Override // b2.g1
    public final int l() {
        F1();
        return this.H;
    }

    public final Pair l1(b2.p1 p1Var, p1 p1Var2, int i10, long j10) {
        if (p1Var.p() || p1Var2.p()) {
            boolean z10 = !p1Var.p() && p1Var2.p();
            return p1(p1Var2, z10 ? -1 : i10, z10 ? -9223372036854775807L : j10);
        }
        Pair i11 = p1Var.i((b2.o1) this.a, this.o, i10, e2.m0.S(j10));
        Object obj = i11.first;
        if (p1Var2.b(obj) != -1) {
            return i11;
        }
        int U = r0.U((b2.o1) this.a, this.o, this.H, this.I, obj, p1Var, p1Var2);
        if (U == -1) {
            return p1(p1Var2, -1, -9223372036854775807L);
        }
        b2.o1 o1Var = (b2.o1) this.a;
        p1Var2.m(U, o1Var, 0L);
        return p1(p1Var2, U, e2.m0.h0(o1Var.l));
    }

    @Override // b2.g1
    public final int m() {
        F1();
        return 0;
    }

    @Override // b2.g1
    public final int m0() {
        F1();
        if (n()) {
            return this.p0.b.b;
        }
        return -1;
    }

    @Override // b2.g1
    public final boolean n() {
        F1();
        return this.p0.b.b();
    }

    @Override // b2.g1
    public final int n0() {
        F1();
        int k12 = k1(this.p0);
        if (k12 == -1) {
            return 0;
        }
        return k12;
    }

    public final k1 o1(k1 k1Var, b2.p1 p1Var, Pair pair) {
        List list;
        u6.g(p1Var.p() || pair != null);
        b2.p1 p1Var2 = k1Var.a;
        long i12 = i1(k1Var);
        k1 j10 = k1Var.j(p1Var);
        if (p1Var.p()) {
            u2.g0 g0Var = k1.u;
            long S = e2.m0.S(this.r0);
            k1 c10 = j10.d(g0Var, S, S, S, 0L, u2.r1.d, this.b, x1.e).c(g0Var);
            c10.q = c10.s;
            return c10;
        }
        Object obj = j10.b.a;
        String str = e2.m0.a;
        boolean equals = obj.equals(pair.first);
        u2.g0 g0Var2 = !equals ? new u2.g0(pair.first) : j10.b;
        long longValue = ((Long) pair.second).longValue();
        long S2 = e2.m0.S(i12);
        if (!p1Var2.p()) {
            S2 -= p1Var2.g(obj, this.o).e;
            if (equals && S2 - longValue == 1 && S2 == p1Var2.g(obj, this.o).d) {
                S2--;
            }
        }
        if (!equals || longValue < S2) {
            u2.g0 g0Var3 = g0Var2;
            u6.p(!g0Var3.b());
            u2.r1 r1Var = !equals ? u2.r1.d : j10.h;
            x2.t tVar = !equals ? this.b : j10.i;
            if (equals) {
                list = j10.j;
            } else {
                e9.l0 l0Var = e9.n0.b;
                list = x1.e;
            }
            k1 c11 = j10.d(g0Var3, longValue, longValue, longValue, 0L, r1Var, tVar, list).c(g0Var3);
            c11.q = longValue;
            return c11;
        }
        if (longValue != S2) {
            u2.g0 g0Var4 = g0Var2;
            u6.p(!g0Var4.b());
            long max = Math.max(0L, j10.r - (longValue - S2));
            long j11 = j10.q;
            if (j10.k.equals(j10.b)) {
                j11 = longValue + max;
            }
            k1 d = j10.d(g0Var4, longValue, longValue, longValue, max, j10.h, j10.i, j10.j);
            d.q = j11;
            return d;
        }
        int b10 = p1Var.b(j10.k.a);
        if (b10 != -1 && p1Var.f(b10, this.o, false).c == p1Var.g(g0Var2.a, this.o).c) {
            return j10;
        }
        p1Var.g(g0Var2.a, this.o);
        long a2 = g0Var2.b() ? this.o.a(g0Var2.b, g0Var2.c) : this.o.d;
        u2.g0 g0Var5 = g0Var2;
        k1 c12 = j10.d(g0Var5, j10.s, j10.s, j10.d, a2 - j10.s, j10.h, j10.i, j10.j).c(g0Var5);
        c12.q = a2;
        return c12;
    }

    @Override // b2.g1
    public final void p(b2.u1 u1Var) {
        F1();
        x2.s sVar = this.i;
        sVar.getClass();
        b2.u1 E0 = E0();
        if (!u1Var.equals(((x2.n) sVar).j())) {
            sVar.b(u1Var);
        }
        if (E0.equals(u1Var)) {
            return;
        }
        this.m.e(19, new f1.a(u1Var, 6));
    }

    @Override // b2.g1
    public final void p0(b2.e1 e1Var) {
        e1Var.getClass();
        this.m.a(e1Var);
    }

    public final Pair p1(b2.p1 p1Var, int i10, long j10) {
        if (p1Var.p()) {
            this.q0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.r0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= p1Var.o()) {
            i10 = p1Var.a(this.I);
            j10 = e2.m0.h0(p1Var.m(i10, (b2.o1) this.a, 0L).l);
        }
        return p1Var.i((b2.o1) this.a, this.o, i10, e2.m0.S(j10));
    }

    @Override // b2.g1
    public final long q() {
        F1();
        return e2.m0.h0(this.p0.r);
    }

    @Override // b2.g1
    public final void q0(boolean z10) {
        F1();
    }

    public final void q1(int i10, int i11) {
        e2.y yVar = this.Z;
        if (i10 == yVar.a && i11 == yVar.b) {
            return;
        }
        this.Z = new e2.y(i10, i11);
        org.telegram.messenger.f1 f1Var = this.s0;
        if (f1Var != null) {
            f1Var.execute(new hg.n(this, i10, i11, 1));
            return;
        }
        this.m.e(24, new eh.c(i10, i11, 1));
        t1(2, 14, new e2.y(i10, i11));
    }

    public final k1 r1(k1 k1Var, int i10, int i11) {
        ArrayList arrayList;
        int k12 = k1(k1Var);
        long i12 = i1(k1Var);
        b2.p1 p1Var = k1Var.a;
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
        p1 p1Var2 = new p1(arrayList, this.O);
        k1 o12 = o1(k1Var, p1Var2, l1(p1Var, p1Var2, k12, i12));
        int i14 = o12.e;
        if (i14 != 1 && i14 != 4 && k12 >= i10 && k12 < i11) {
            if (r0.U((b2.o1) this.a, this.o, this.H, this.I, k1Var.b.a, p1Var, p1Var2) == -1) {
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

    @Override // b2.g1
    public final b2.c1 s() {
        F1();
        return this.P;
    }

    public final void s1() {
        TextureView textureView = this.X;
        b0 b0Var = this.w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != b0Var) {
                e2.a.l("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.X.setSurfaceTextureListener(null);
            }
            this.X = null;
        }
        SurfaceHolder surfaceHolder = this.V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(b0Var);
            this.V = null;
        }
    }

    @Override // b2.h, b2.g1
    public final void stop() {
        F1();
        A1(null);
        this.e0 = new d2.c(this.p0.s, x1.e);
    }

    @Override // b2.g1
    public final boolean t() {
        F1();
        return this.p0.l;
    }

    @Override // b2.g1
    public final void t0(int i10, int i11, int i12) {
        F1();
        u6.g(i10 >= 0 && i10 <= i11 && i12 >= 0);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int min = Math.min(i11, size);
        int min2 = Math.min(i12, size - (min - i10));
        if (i10 >= size || i10 == min || i10 == min2) {
            return;
        }
        b2.p1 y02 = y0();
        this.J++;
        e2.m0.R(i10, min, min2, arrayList);
        this.O = this.O.g();
        p1 p1Var = new p1(arrayList, this.O);
        k1 k1Var = this.p0;
        k1 o12 = o1(k1Var, p1Var, l1(y02, p1Var, k1(k1Var), i1(this.p0)));
        u2.i1 i1Var = this.O;
        r0 r0Var = this.l;
        r0Var.getClass();
        r0Var.n.b(19, new n0(i10, min, min2, i1Var)).b();
        D1(o12, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void t1(int i10, int i11, Object obj) {
        for (b bVar : this.g) {
            if (i10 == -1 || bVar.b == i10) {
                n1 h12 = h1(bVar);
                u6.p(!h12.f);
                h12.c = i11;
                u6.p(!h12.f);
                h12.d = obj;
                h12.b();
            }
        }
        for (b bVar2 : this.h) {
            if (bVar2 != null && (i10 == -1 || bVar2.b == i10)) {
                n1 h13 = h1(bVar2);
                u6.p(!h13.f);
                h13.c = i11;
                u6.p(!h13.f);
                h13.d = obj;
                h13.b();
            }
        }
    }

    public final void u1(u2.a aVar, boolean z10) {
        F1();
        List singletonList = Collections.singletonList(aVar);
        F1();
        v1(-9223372036854775807L, singletonList, z10, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v1(long j10, List list, boolean z10, int i10) {
        long j11;
        int i11;
        int i12;
        int i13 = i10;
        int k12 = k1(this.p0);
        long M0 = M0();
        this.J++;
        ArrayList arrayList = this.p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i14 = 0; i14 < list.size(); i14++) {
            i1 i1Var = new i1((u2.a) list.get(i14), this.q);
            arrayList2.add(i1Var);
            arrayList.add(i14, new d0(i1Var.b, i1Var.a));
        }
        this.O = this.O.c(arrayList2.size());
        p1 p1Var = new p1(arrayList, this.O);
        boolean p5 = p1Var.p();
        int i15 = p1Var.h;
        if (!p5 && i13 >= i15) {
            throw new b2.a0();
        }
        if (z10) {
            i13 = p1Var.a(this.I);
            j11 = -9223372036854775807L;
        } else {
            if (i13 == -1) {
                i11 = k12;
                j11 = M0;
                k1 o12 = o1(this.p0, p1Var, p1(p1Var, i11, j11));
                i12 = o12.e;
                if (i12 != 1) {
                    i12 = 1;
                } else {
                    if (!p1Var.p()) {
                        if (i11 != -1) {
                            if (i11 < i15) {
                                i12 = 2;
                            }
                        }
                    }
                    i12 = 4;
                }
                k1 n12 = n1(o12, i12);
                this.l.n.b(17, new m0(arrayList2, this.O, i11, e2.m0.S(j11))).b();
                D1(n12, 0, this.p0.b.a.equals(n12.b.a) && !this.p0.a.p(), 4, j1(n12), -1, false);
            }
            j11 = j10;
        }
        i11 = i13;
        k1 o122 = o1(this.p0, p1Var, p1(p1Var, i11, j11));
        i12 = o122.e;
        if (i12 != 1) {
        }
        k1 n122 = n1(o122, i12);
        this.l.n.b(17, new m0(arrayList2, this.O, i11, e2.m0.S(j11))).b();
        D1(n122, 0, this.p0.b.a.equals(n122.b.a) && !this.p0.a.p(), 4, j1(n122), -1, false);
    }

    @Override // b2.g1
    public final void w(boolean z10) {
        F1();
        if (this.I != z10) {
            this.I = z10;
            e2.i0 i0Var = this.l.n;
            i0Var.getClass();
            e2.h0 c10 = e2.i0.c();
            c10.a = i0Var.a.obtainMessage(12, z10 ? 1 : 0, 0);
            c10.b();
            x xVar = new x(0, z10);
            e2.r rVar = this.m;
            rVar.c(9, xVar);
            B1();
            rVar.b();
        }
    }

    @Override // b2.g1
    public final int w0() {
        F1();
        return this.p0.n;
    }

    public final void w1(t1 t1Var) {
        F1();
        if (t1Var == null) {
            t1Var = t1.f;
        }
        if (this.N.equals(t1Var)) {
            return;
        }
        this.N = t1Var;
        this.l.n.b(5, t1Var).b();
    }

    public final void x1(Surface surface) {
        Object obj = this.T;
        boolean z10 = true;
        boolean z11 = (obj == null || obj == surface) ? false : true;
        long j10 = z11 ? this.B : -9223372036854775807L;
        r0 r0Var = this.l;
        if (!r0Var.Z && r0Var.s.getThread().isAlive()) {
            e2.i iVar = new e2.i(r0Var.F);
            r0Var.n.b(30, new Pair(surface, iVar)).b();
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
        A1(new m(2, new androidx.car.app.j("Detaching surface timed out."), 1003));
    }

    @Override // b2.g1
    public final long y() {
        F1();
        return this.n0;
    }

    @Override // b2.g1
    public final b2.p1 y0() {
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

    @Override // b2.g1
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
