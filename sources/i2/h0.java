package i2;

import ai.x9;
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
import b2.a2;
import b2.v1;
import e9.x1;
import ei.bc;
import hg.b2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class h0 extends ai.c1 implements q {
    public final bi.a A;
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
    public final r1 M;
    public s1 N;
    public u2.k1 O;
    public b2.b1 P;
    public b2.r0 Q;
    public b2.r0 R;
    public b2.w S;
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
    public final b2.b1 c;
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
    public final b2.p j0;
    public final w k;
    public a2 k0;
    public final q0 l;
    public final long l0;
    public final e2.r m;
    public final long m0;
    public final CopyOnWriteArraySet n;
    public final long n0;
    public final b2.l1 o;
    public b2.r0 o0;
    public final ArrayList p;
    public i1 p0;
    public final boolean q;
    public int q0;
    public final u2.g0 r;
    public long r0;
    public final j2.e s;
    public org.telegram.messenger.g1 s0;
    public final Looper t;
    public final ArrayList t0;
    public final y2.c u;
    public final e2.g0 v;
    public final b0 w;
    public final c0 x;
    public final c2.b y;
    public final ac.a z;

    static {
        b2.p0.a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0351 A[Catch: all -> 0x030e, TryCatch #2 {all -> 0x030e, blocks: (B:41:0x02c0, B:43:0x02ff, B:45:0x0303, B:47:0x0307, B:51:0x0313, B:54:0x0326, B:56:0x0351, B:57:0x0358, B:66:0x031f), top: B:40:0x02c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x031f A[Catch: all -> 0x030e, TryCatch #2 {all -> 0x030e, blocks: (B:41:0x02c0, B:43:0x02ff, B:45:0x0303, B:47:0x0307, B:51:0x0313, B:54:0x0326, B:56:0x0351, B:57:0x0358, B:66:0x031f), top: B:40:0x02c0 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ai.c1, i2.h0, java.lang.Object] */
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
        int i12 = 1;
        ?? c1Var = new ai.c1(1);
        c1Var.t0 = new ArrayList();
        c1Var.d = new e2.i();
        try {
            e2.a.g("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(c1Var)) + " [AndroidXMedia3/1.10.1] [" + e2.m0.a + "]");
            context = oVar.a;
            g0Var = oVar.b;
            c1Var.e = context.getApplicationContext();
            c1Var.s = new j2.e(g0Var);
            c1Var.h0 = oVar.i;
            c1Var.a0 = oVar.j;
            c1Var.Y = oVar.k;
            c1Var.d0 = false;
            c1Var.B = oVar.t;
            b0 b0Var = new b0(c1Var);
            c1Var.w = b0Var;
            c1Var.x = new c0();
            b[] b10 = ((k) oVar.c.get()).b(new Handler(oVar.h), b0Var, b0Var, b0Var, b0Var);
            c1Var.g = b10;
            u6.p(b10.length > 0);
            c1Var.h = new b[b10.length];
            int i13 = 0;
            while (true) {
                b[] bVarArr = c1Var.h;
                if (i13 >= bVarArr.length) {
                    break;
                }
                int i14 = c1Var.g[i13].b;
                bVarArr[i13] = null;
                i13++;
            }
            x2.s sVar = (x2.s) oVar.e.get();
            c1Var.i = sVar;
            c1Var.r = (u2.g0) oVar.d.get();
            y2.f b11 = y2.f.b(oVar.g.b);
            c1Var.u = b11;
            c1Var.q = oVar.l;
            c1Var.N = oVar.m;
            c1Var.l0 = oVar.o;
            c1Var.m0 = oVar.p;
            c1Var.n0 = oVar.q;
            c1Var.M = oVar.n;
            looper = oVar.h;
            c1Var.t = looper;
            c1Var.v = g0Var;
            c1Var.f = c1Var;
            c1Var.m = new e2.r(new CopyOnWriteArraySet(), looper, looper.getThread(), g0Var, new w(c1Var, i11), true);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            c1Var.n = copyOnWriteArraySet;
            c1Var.p = new ArrayList();
            c1Var.O = new u2.i1();
            b[] bVarArr2 = c1Var.g;
            x2.t tVar = new x2.t(new p1[bVarArr2.length], new x2.p[bVarArr2.length], v1.b, null);
            c1Var.b = tVar;
            c1Var.o = new b2.l1();
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
            b2.u uVar = new b2.u(sparseBooleanArray);
            c1Var.c = new b2.b1(uVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i16 = 0; i16 < uVar.a.size(); i16++) {
                int a2 = uVar.a(i16);
                u6.p(!false);
                sparseBooleanArray2.append(a2, true);
            }
            u6.p(!false);
            sparseBooleanArray2.append(4, true);
            u6.p(!false);
            sparseBooleanArray2.append(10, true);
            u6.p(!false);
            c1Var.P = new b2.b1(new b2.u(sparseBooleanArray2));
            c1Var.j = g0Var.a(looper, null);
            w wVar = new w(c1Var, i12);
            c1Var.k = wVar;
            c1Var.p0 = i1.k(tVar);
            c1Var.s.r(c1Var, looper);
            j2.j jVar = new j2.j(oVar.A);
            q0 q0Var = new q0(c1Var.e, c1Var.g, c1Var.h, sVar, tVar, (s0) oVar.f.get(), b11, c1Var.H, c1Var.I, c1Var.s, c1Var.N, oVar.r, oVar.s, looper, g0Var, wVar, jVar, c1Var.x, oVar.B);
            i0Var = q0Var.n;
            c1Var.l = q0Var;
            looper2 = q0Var.s;
            c1Var.b0 = 1.0f;
            c1Var.H = 0;
            b2.r0 r0Var = b2.r0.L;
            c1Var.Q = r0Var;
            c1Var.R = r0Var;
            c1Var.o0 = r0Var;
            c1Var.q0 = -1;
            c1Var.e0 = d2.c.d;
            c1Var.f0 = true;
            c1Var.p0(c1Var.s);
            Handler handler = new Handler(looper);
            j2.e eVar = c1Var.s;
            b11.getClass();
            eVar.getClass();
            te.b bVar = b11.c;
            bVar.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) bVar.b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                y2.b bVar2 = (y2.b) it.next();
                if (bVar2.b == eVar) {
                    bVar2.c = true;
                    copyOnWriteArrayList.remove(bVar2);
                }
            }
            copyOnWriteArrayList.add(new y2.b(handler, eVar));
            copyOnWriteArraySet.add(c1Var.w);
            i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                try {
                    Context context2 = c1Var.e;
                    boolean z11 = oVar.y;
                    e2.i0 a10 = g0Var.a(q0Var.s, null);
                    callback = null;
                    x9 x9Var = new x9(context2, z11, (Object) c1Var, jVar, 5);
                    h0Var2 = c1Var;
                    a10.d(x9Var);
                } catch (Throwable th2) {
                    th = th2;
                    h0Var = c1Var;
                    h0Var.d.e();
                    throw th;
                }
            } else {
                callback = null;
                h0Var2 = c1Var;
            }
            h0Var3 = h0Var2;
        } catch (Throwable th3) {
            th = th3;
            h0Var = c1Var;
        }
        try {
            e2.c cVar = new e2.c(0, looper2, looper, g0Var, new w(h0Var2, 2));
            h0Var3.C = cVar;
            cVar.i(new bc(h0Var3, 14));
            Context context3 = oVar.a;
            Looper looper3 = oVar.h;
            b0 b0Var2 = h0Var3.w;
            c2.b bVar3 = new c2.b();
            bVar3.b = context3.getApplicationContext();
            bVar3.d = g0Var.a(looper2, callback);
            bVar3.c = new c2.a(bVar3, g0Var.a(looper3, callback), b0Var2);
            h0Var3.y = bVar3;
            bVar3.w();
            if (oVar.u != Integer.MAX_VALUE && oVar.v != Integer.MAX_VALUE && oVar.w != Integer.MAX_VALUE && oVar.x != Integer.MAX_VALUE) {
                z10 = true;
                aVar = new ac.a(context, looper2, g0Var);
                h0Var3.z = aVar;
                if (aVar.a == z10) {
                    aVar.a = z10;
                    aVar.b(z10, aVar.b);
                }
                bi.a aVar2 = new bi.a();
                new sb.a(context.getApplicationContext(), 7);
                g0Var.a(looper2, callback);
                g0Var.a(Looper.getMainLooper(), callback);
                h0Var3.A = aVar2;
                h0Var3.j0 = b2.p.c;
                h0Var3.k0 = a2.d;
                h0Var3.Z = e2.y.c;
                h0Var3.E = i10 < 34 ? new g0(h0Var3, context) : callback;
                h0Var3.F = new n4.s(22);
                h0Var3.G = new n4.s(22);
                c1Var = h0Var3;
                c1Var.D = new e2.e0(c1Var, h0Var3.w, h0Var3.v, oVar.u, oVar.v, oVar.w, oVar.x);
                i0Var.b(38, c1Var.M).b();
                b2.f fVar = c1Var.a0;
                i0Var.getClass();
                e2.h0 c10 = e2.i0.c();
                c10.a = i0Var.a.obtainMessage(31, 0, 0, fVar);
                c10.b();
                c1Var.t1(1, 3, c1Var.a0);
                c1Var.t1(2, 4, Integer.valueOf(c1Var.Y));
                c1Var.t1(2, 5, 0);
                c1Var.t1(1, 9, Boolean.valueOf(c1Var.d0));
                c1Var.t1(6, 8, c1Var.x);
                c1Var.t1(-1, 16, Integer.valueOf(c1Var.h0));
                c1Var.d.e();
            }
            z10 = false;
            aVar = new ac.a(context, looper2, g0Var);
            h0Var3.z = aVar;
            if (aVar.a == z10) {
            }
            bi.a aVar22 = new bi.a();
            new sb.a(context.getApplicationContext(), 7);
            g0Var.a(looper2, callback);
            g0Var.a(Looper.getMainLooper(), callback);
            h0Var3.A = aVar22;
            h0Var3.j0 = b2.p.c;
            h0Var3.k0 = a2.d;
            h0Var3.Z = e2.y.c;
            h0Var3.E = i10 < 34 ? new g0(h0Var3, context) : callback;
            h0Var3.F = new n4.s(22);
            h0Var3.G = new n4.s(22);
            c1Var = h0Var3;
            c1Var.D = new e2.e0(c1Var, h0Var3.w, h0Var3.v, oVar.u, oVar.v, oVar.w, oVar.x);
            i0Var.b(38, c1Var.M).b();
            b2.f fVar2 = c1Var.a0;
            i0Var.getClass();
            e2.h0 c102 = e2.i0.c();
            c102.a = i0Var.a.obtainMessage(31, 0, 0, fVar2);
            c102.b();
            c1Var.t1(1, 3, c1Var.a0);
            c1Var.t1(2, 4, Integer.valueOf(c1Var.Y));
            c1Var.t1(2, 5, 0);
            c1Var.t1(1, 9, Boolean.valueOf(c1Var.d0));
            c1Var.t1(6, 8, c1Var.x);
            c1Var.t1(-1, 16, Integer.valueOf(c1Var.h0));
            c1Var.d.e();
        } catch (Throwable th4) {
            th = th4;
            h0Var = h0Var3;
            h0Var.d.e();
            throw th;
        }
    }

    public static long m1(i1 i1Var) {
        b2.n1 n1Var = new b2.n1();
        b2.l1 l1Var = new b2.l1();
        i1Var.a.g(i1Var.b.a, l1Var);
        long j10 = i1Var.c;
        return j10 == -9223372036854775807L ? i1Var.a.m(l1Var.c, n1Var, 0L).l : l1Var.e + j10;
    }

    public static i1 n1(i1 i1Var, int i10) {
        i1 h = i1Var.h(i10);
        return (i10 == 1 || i10 == 4) ? h.b(false) : h;
    }

    @Override // b2.f1
    public final int A() {
        F1();
        if (!this.p0.a.p()) {
            i1 i1Var = this.p0;
            return i1Var.a.b(i1Var.b.a);
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

    public final void A1(m mVar) {
        i1 i1Var = this.p0;
        i1 c10 = i1Var.c(i1Var.b);
        c10.q = c10.s;
        c10.r = 0L;
        i1 n12 = n1(c10, 1);
        if (mVar != null) {
            n12 = n12.f(mVar);
        }
        this.J++;
        this.l.n.a(6).b();
        D1(n12, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // b2.f1
    public final void B(b2.r0 r0Var) {
        F1();
        r0Var.getClass();
        if (r0Var.equals(this.R)) {
            return;
        }
        this.R = r0Var;
        this.m.e(15, new w(this, 4));
    }

    @Override // b2.f1
    public final void B0() {
        F1();
        if (this.b0 != 0.0f) {
            U(0.0f);
        }
    }

    public final void B1() {
        b2.b1 b1Var = this.P;
        String str = e2.m0.a;
        h0 h0Var = this.f;
        boolean n10 = h0Var.n();
        boolean e02 = h0Var.e0();
        boolean T0 = h0Var.T0();
        boolean S0 = h0Var.S0();
        boolean P0 = h0Var.P0();
        boolean v02 = h0Var.v0();
        boolean p5 = h0Var.y0().p();
        b2.a1 a1Var = new b2.a1();
        a1Var.a = new b2.t();
        b2.t tVar = (b2.t) a1Var.a;
        tVar.c(this.c.a);
        boolean z10 = !n10;
        a1Var.a(4, z10);
        boolean z11 = false;
        a1Var.a(5, e02 && !n10);
        a1Var.a(6, T0 && !n10);
        a1Var.a(7, !p5 && (T0 || !P0 || e02) && !n10);
        a1Var.a(8, S0 && !n10);
        a1Var.a(9, !p5 && (S0 || (P0 && v02)) && !n10);
        a1Var.a(10, z10);
        a1Var.a(11, e02 && !n10);
        if (e02 && !n10) {
            z11 = true;
        }
        a1Var.a(12, z11);
        b2.b1 b1Var2 = new b2.b1(tVar.d());
        this.P = b1Var2;
        if (b1Var2.equals(b1Var)) {
            return;
        }
        this.m.c(13, new w(this, 3));
    }

    @Override // b2.f1
    public final void C(b2.d1 d1Var) {
        F1();
        d1Var.getClass();
        e2.r rVar = this.m;
        if (rVar.i) {
            u6.p(Thread.currentThread() == rVar.a);
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
                    pVar.a(qVar.a, qVar.b.d());
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
        i1 i1Var = this.p0;
        int i11 = i1Var.n;
        int i12 = (i11 != 1 || z10) ? 0 : 1;
        if (i1Var.l == z10 && i11 == i12 && i1Var.m == i10) {
            return;
        }
        this.J++;
        if (i1Var.p) {
            i1Var = i1Var.a();
        }
        i1 e = i1Var.e(i10, i12, z10);
        e2.i0 i0Var = this.l.n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.a = i0Var.a.obtainMessage(1, z10 ? 1 : 0, i10 | (i12 << 4));
        c10.b();
        D1(e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // b2.f1
    public final a2 D() {
        F1();
        return this.k0;
    }

    @Override // b2.f1
    public final boolean D0() {
        F1();
        return this.I;
    }

    public final void D1(final i1 i1Var, int i10, boolean z10, int i11, long j10, int i12, boolean z11) {
        Pair pair;
        int i13;
        b2.o0 o0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14;
        int i15;
        Object obj;
        b2.o0 o0Var2;
        Object obj2;
        long j11;
        long j12;
        long j13;
        long m12;
        Object obj3;
        b2.o0 o0Var3;
        Object obj4;
        i1 i1Var2 = this.p0;
        this.p0 = i1Var;
        boolean equals = i1Var2.a.equals(i1Var.a);
        b2.n1 n1Var = (b2.n1) this.a;
        b2.l1 l1Var = this.o;
        b2.o1 o1Var = i1Var2.a;
        u2.h0 h0Var = i1Var2.b;
        b2.o1 o1Var2 = i1Var.a;
        u2.h0 h0Var2 = i1Var.b;
        if (o1Var2.p() && o1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (o1Var2.p() != o1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (o1Var.m(o1Var.g(h0Var.a, l1Var).c, n1Var, 0L).a.equals(o1Var2.m(o1Var2.g(h0Var2.a, l1Var).c, n1Var, 0L).a)) {
            pair = (z10 && i11 == 0 && h0Var.d < h0Var2.d) ? new Pair(Boolean.TRUE, 0) : (z10 && i11 == 1 && z11) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
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
            o0Var = !i1Var.a.p() ? i1Var.a.m(i1Var.a.g(i1Var.b.a, this.o).c, (b2.n1) this.a, 0L).c : null;
            this.o0 = b2.r0.L;
        } else {
            o0Var = null;
        }
        if (booleanValue || !i1Var2.j.equals(i1Var.j)) {
            b2.q0 a2 = this.o0.a();
            List list = i1Var.j;
            for (int i16 = 0; i16 < list.size(); i16++) {
                b2.t0 t0Var = (b2.t0) list.get(i16);
                int i17 = 0;
                while (true) {
                    b2.s0[] s0VarArr = t0Var.a;
                    if (i17 < s0VarArr.length) {
                        s0VarArr[i17].b(a2);
                        i17++;
                    }
                }
            }
            this.o0 = new b2.r0(a2);
        }
        b2.r0 f12 = f1();
        boolean equals2 = f12.equals(this.Q);
        this.Q = f12;
        boolean z15 = i1Var2.l != i1Var.l;
        boolean z16 = i1Var2.e != i1Var.e;
        if (z16 || z15) {
            E1();
        }
        boolean z17 = i1Var2.g != i1Var.g;
        if (!equals) {
            this.m.c(0, new r(i1Var, i10, 0));
        }
        if (z10) {
            b2.l1 l1Var2 = new b2.l1();
            if (i1Var2.a.p()) {
                z12 = booleanValue;
                z13 = equals2;
                z14 = z16;
                i14 = i12;
                i15 = i14;
                obj = null;
                o0Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = i1Var2.b.a;
                i1Var2.a.g(obj5, l1Var2);
                int i18 = l1Var2.c;
                int b10 = i1Var2.a.b(obj5);
                z12 = booleanValue;
                z13 = equals2;
                z14 = z16;
                obj = i1Var2.a.m(i18, (b2.n1) this.a, 0L).a;
                o0Var2 = ((b2.n1) this.a).c;
                obj2 = obj5;
                i14 = i18;
                i15 = b10;
            }
            if (i11 == 0) {
                if (i1Var2.b.b()) {
                    u2.h0 h0Var3 = i1Var2.b;
                    j13 = l1Var2.a(h0Var3.b, h0Var3.c);
                    m12 = m1(i1Var2);
                } else if (i1Var2.b.e != -1) {
                    j13 = m1(this.p0);
                    m12 = j13;
                } else {
                    j11 = l1Var2.e;
                    j12 = l1Var2.d;
                    j13 = j11 + j12;
                    m12 = j13;
                }
            } else if (i1Var2.b.b()) {
                j13 = i1Var2.s;
                m12 = m1(i1Var2);
            } else {
                j11 = l1Var2.e;
                j12 = i1Var2.s;
                j13 = j11 + j12;
                m12 = j13;
            }
            long h02 = e2.m0.h0(j13);
            long h03 = e2.m0.h0(m12);
            u2.h0 h0Var4 = i1Var2.b;
            b2.e1 e1Var = new b2.e1(obj, i14, o0Var2, obj2, i15, h02, h03, h0Var4.b, h0Var4.c);
            b2.n1 n1Var2 = (b2.n1) this.a;
            int n02 = n0();
            int A = A();
            if (this.p0.a.p()) {
                obj3 = null;
                o0Var3 = null;
                obj4 = null;
            } else {
                i1 i1Var3 = this.p0;
                Object obj6 = i1Var3.b.a;
                i1Var3.a.g(obj6, this.o);
                A = this.p0.a.b(obj6);
                Object obj7 = this.p0.a.m(n02, n1Var2, 0L).a;
                o0Var3 = n1Var2.c;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i19 = A;
            long h04 = e2.m0.h0(j10);
            long h05 = this.p0.b.b() ? e2.m0.h0(m1(this.p0)) : h04;
            u2.h0 h0Var5 = this.p0.b;
            this.m.c(11, new b2(i11, e1Var, new b2.e1(obj3, n02, o0Var3, obj4, i19, h04, h05, h0Var5.b, h0Var5.c), 1));
        } else {
            z12 = booleanValue;
            z13 = equals2;
            z14 = z16;
        }
        if (z12) {
            this.m.c(1, new r(o0Var, intValue, 1));
        }
        if (i1Var2.f != i1Var.f) {
            final int i20 = 7;
            this.m.c(10, new e2.o() { // from class: i2.t
                @Override // e2.o
                public final void invoke(Object obj8) {
                    b2.d1 d1Var = (b2.d1) obj8;
                    switch (i20) {
                        case 0:
                            i1 i1Var4 = i1Var;
                            d1Var.onLoadingChanged(i1Var4.g);
                            d1Var.onIsLoadingChanged(i1Var4.g);
                            break;
                        case 1:
                            i1 i1Var5 = i1Var;
                            d1Var.onPlayerStateChanged(i1Var5.l, i1Var5.e);
                            break;
                        case 2:
                            d1Var.onPlaybackStateChanged(i1Var.e);
                            break;
                        case 3:
                            i1 i1Var6 = i1Var;
                            d1Var.onPlayWhenReadyChanged(i1Var6.l, i1Var6.m);
                            break;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(i1Var.n);
                            break;
                        case 5:
                            d1Var.onIsPlayingChanged(i1Var.m());
                            break;
                        case 6:
                            d1Var.onPlaybackParametersChanged(i1Var.o);
                            break;
                        case 7:
                            d1Var.onPlayerErrorChanged(i1Var.f);
                            break;
                        case 8:
                            d1Var.onPlayerError(i1Var.f);
                            break;
                        default:
                            d1Var.onTracksChanged(i1Var.i.d);
                            break;
                    }
                }
            });
            if (i1Var.f != null) {
                final int i21 = 8;
                this.m.c(10, new e2.o() { // from class: i2.t
                    @Override // e2.o
                    public final void invoke(Object obj8) {
                        b2.d1 d1Var = (b2.d1) obj8;
                        switch (i21) {
                            case 0:
                                i1 i1Var4 = i1Var;
                                d1Var.onLoadingChanged(i1Var4.g);
                                d1Var.onIsLoadingChanged(i1Var4.g);
                                break;
                            case 1:
                                i1 i1Var5 = i1Var;
                                d1Var.onPlayerStateChanged(i1Var5.l, i1Var5.e);
                                break;
                            case 2:
                                d1Var.onPlaybackStateChanged(i1Var.e);
                                break;
                            case 3:
                                i1 i1Var6 = i1Var;
                                d1Var.onPlayWhenReadyChanged(i1Var6.l, i1Var6.m);
                                break;
                            case 4:
                                d1Var.onPlaybackSuppressionReasonChanged(i1Var.n);
                                break;
                            case 5:
                                d1Var.onIsPlayingChanged(i1Var.m());
                                break;
                            case 6:
                                d1Var.onPlaybackParametersChanged(i1Var.o);
                                break;
                            case 7:
                                d1Var.onPlayerErrorChanged(i1Var.f);
                                break;
                            case 8:
                                d1Var.onPlayerError(i1Var.f);
                                break;
                            default:
                                d1Var.onTracksChanged(i1Var.i.d);
                                break;
                        }
                    }
                });
            }
        }
        x2.t tVar = i1Var2.i;
        x2.t tVar2 = i1Var.i;
        if (tVar != tVar2) {
            x2.s sVar = this.i;
            Object obj8 = tVar2.e;
            sVar.getClass();
            sVar.c = (x2.r) obj8;
            final int i22 = 9;
            this.m.c(2, new e2.o() { // from class: i2.t
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (i22) {
                        case 0:
                            i1 i1Var4 = i1Var;
                            d1Var.onLoadingChanged(i1Var4.g);
                            d1Var.onIsLoadingChanged(i1Var4.g);
                            break;
                        case 1:
                            i1 i1Var5 = i1Var;
                            d1Var.onPlayerStateChanged(i1Var5.l, i1Var5.e);
                            break;
                        case 2:
                            d1Var.onPlaybackStateChanged(i1Var.e);
                            break;
                        case 3:
                            i1 i1Var6 = i1Var;
                            d1Var.onPlayWhenReadyChanged(i1Var6.l, i1Var6.m);
                            break;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(i1Var.n);
                            break;
                        case 5:
                            d1Var.onIsPlayingChanged(i1Var.m());
                            break;
                        case 6:
                            d1Var.onPlaybackParametersChanged(i1Var.o);
                            break;
                        case 7:
                            d1Var.onPlayerErrorChanged(i1Var.f);
                            break;
                        case 8:
                            d1Var.onPlayerError(i1Var.f);
                            break;
                        default:
                            d1Var.onTracksChanged(i1Var.i.d);
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
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (i23) {
                        case 0:
                            i1 i1Var4 = i1Var;
                            d1Var.onLoadingChanged(i1Var4.g);
                            d1Var.onIsLoadingChanged(i1Var4.g);
                            break;
                        case 1:
                            i1 i1Var5 = i1Var;
                            d1Var.onPlayerStateChanged(i1Var5.l, i1Var5.e);
                            break;
                        case 2:
                            d1Var.onPlaybackStateChanged(i1Var.e);
                            break;
                        case 3:
                            i1 i1Var6 = i1Var;
                            d1Var.onPlayWhenReadyChanged(i1Var6.l, i1Var6.m);
                            break;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(i1Var.n);
                            break;
                        case 5:
                            d1Var.onIsPlayingChanged(i1Var.m());
                            break;
                        case 6:
                            d1Var.onPlaybackParametersChanged(i1Var.o);
                            break;
                        case 7:
                            d1Var.onPlayerErrorChanged(i1Var.f);
                            break;
                        case 8:
                            d1Var.onPlayerError(i1Var.f);
                            break;
                        default:
                            d1Var.onTracksChanged(i1Var.i.d);
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
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (i24) {
                        case 0:
                            i1 i1Var4 = i1Var;
                            d1Var.onLoadingChanged(i1Var4.g);
                            d1Var.onIsLoadingChanged(i1Var4.g);
                            break;
                        case 1:
                            i1 i1Var5 = i1Var;
                            d1Var.onPlayerStateChanged(i1Var5.l, i1Var5.e);
                            break;
                        case 2:
                            d1Var.onPlaybackStateChanged(i1Var.e);
                            break;
                        case 3:
                            i1 i1Var6 = i1Var;
                            d1Var.onPlayWhenReadyChanged(i1Var6.l, i1Var6.m);
                            break;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(i1Var.n);
                            break;
                        case 5:
                            d1Var.onIsPlayingChanged(i1Var.m());
                            break;
                        case 6:
                            d1Var.onPlaybackParametersChanged(i1Var.o);
                            break;
                        case 7:
                            d1Var.onPlayerErrorChanged(i1Var.f);
                            break;
                        case 8:
                            d1Var.onPlayerError(i1Var.f);
                            break;
                        default:
                            d1Var.onTracksChanged(i1Var.i.d);
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
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (i25) {
                        case 0:
                            i1 i1Var4 = i1Var;
                            d1Var.onLoadingChanged(i1Var4.g);
                            d1Var.onIsLoadingChanged(i1Var4.g);
                            break;
                        case 1:
                            i1 i1Var5 = i1Var;
                            d1Var.onPlayerStateChanged(i1Var5.l, i1Var5.e);
                            break;
                        case 2:
                            d1Var.onPlaybackStateChanged(i1Var.e);
                            break;
                        case 3:
                            i1 i1Var6 = i1Var;
                            d1Var.onPlayWhenReadyChanged(i1Var6.l, i1Var6.m);
                            break;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(i1Var.n);
                            break;
                        case 5:
                            d1Var.onIsPlayingChanged(i1Var.m());
                            break;
                        case 6:
                            d1Var.onPlaybackParametersChanged(i1Var.o);
                            break;
                        case 7:
                            d1Var.onPlayerErrorChanged(i1Var.f);
                            break;
                        case 8:
                            d1Var.onPlayerError(i1Var.f);
                            break;
                        default:
                            d1Var.onTracksChanged(i1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z15 || i1Var2.m != i1Var.m) {
            final int i26 = 3;
            this.m.c(5, new e2.o() { // from class: i2.t
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (i26) {
                        case 0:
                            i1 i1Var4 = i1Var;
                            d1Var.onLoadingChanged(i1Var4.g);
                            d1Var.onIsLoadingChanged(i1Var4.g);
                            break;
                        case 1:
                            i1 i1Var5 = i1Var;
                            d1Var.onPlayerStateChanged(i1Var5.l, i1Var5.e);
                            break;
                        case 2:
                            d1Var.onPlaybackStateChanged(i1Var.e);
                            break;
                        case 3:
                            i1 i1Var6 = i1Var;
                            d1Var.onPlayWhenReadyChanged(i1Var6.l, i1Var6.m);
                            break;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(i1Var.n);
                            break;
                        case 5:
                            d1Var.onIsPlayingChanged(i1Var.m());
                            break;
                        case 6:
                            d1Var.onPlaybackParametersChanged(i1Var.o);
                            break;
                        case 7:
                            d1Var.onPlayerErrorChanged(i1Var.f);
                            break;
                        case 8:
                            d1Var.onPlayerError(i1Var.f);
                            break;
                        default:
                            d1Var.onTracksChanged(i1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (i1Var2.n != i1Var.n) {
            final int i27 = 4;
            this.m.c(6, new e2.o() { // from class: i2.t
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (i27) {
                        case 0:
                            i1 i1Var4 = i1Var;
                            d1Var.onLoadingChanged(i1Var4.g);
                            d1Var.onIsLoadingChanged(i1Var4.g);
                            break;
                        case 1:
                            i1 i1Var5 = i1Var;
                            d1Var.onPlayerStateChanged(i1Var5.l, i1Var5.e);
                            break;
                        case 2:
                            d1Var.onPlaybackStateChanged(i1Var.e);
                            break;
                        case 3:
                            i1 i1Var6 = i1Var;
                            d1Var.onPlayWhenReadyChanged(i1Var6.l, i1Var6.m);
                            break;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(i1Var.n);
                            break;
                        case 5:
                            d1Var.onIsPlayingChanged(i1Var.m());
                            break;
                        case 6:
                            d1Var.onPlaybackParametersChanged(i1Var.o);
                            break;
                        case 7:
                            d1Var.onPlayerErrorChanged(i1Var.f);
                            break;
                        case 8:
                            d1Var.onPlayerError(i1Var.f);
                            break;
                        default:
                            d1Var.onTracksChanged(i1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (i1Var2.m() != i1Var.m()) {
            final int i28 = 5;
            this.m.c(7, new e2.o() { // from class: i2.t
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (i28) {
                        case 0:
                            i1 i1Var4 = i1Var;
                            d1Var.onLoadingChanged(i1Var4.g);
                            d1Var.onIsLoadingChanged(i1Var4.g);
                            break;
                        case 1:
                            i1 i1Var5 = i1Var;
                            d1Var.onPlayerStateChanged(i1Var5.l, i1Var5.e);
                            break;
                        case 2:
                            d1Var.onPlaybackStateChanged(i1Var.e);
                            break;
                        case 3:
                            i1 i1Var6 = i1Var;
                            d1Var.onPlayWhenReadyChanged(i1Var6.l, i1Var6.m);
                            break;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(i1Var.n);
                            break;
                        case 5:
                            d1Var.onIsPlayingChanged(i1Var.m());
                            break;
                        case 6:
                            d1Var.onPlaybackParametersChanged(i1Var.o);
                            break;
                        case 7:
                            d1Var.onPlayerErrorChanged(i1Var.f);
                            break;
                        case 8:
                            d1Var.onPlayerError(i1Var.f);
                            break;
                        default:
                            d1Var.onTracksChanged(i1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (!i1Var2.o.equals(i1Var.o)) {
            final int i29 = 6;
            this.m.c(12, new e2.o() { // from class: i2.t
                @Override // e2.o
                public final void invoke(Object obj82) {
                    b2.d1 d1Var = (b2.d1) obj82;
                    switch (i29) {
                        case 0:
                            i1 i1Var4 = i1Var;
                            d1Var.onLoadingChanged(i1Var4.g);
                            d1Var.onIsLoadingChanged(i1Var4.g);
                            break;
                        case 1:
                            i1 i1Var5 = i1Var;
                            d1Var.onPlayerStateChanged(i1Var5.l, i1Var5.e);
                            break;
                        case 2:
                            d1Var.onPlaybackStateChanged(i1Var.e);
                            break;
                        case 3:
                            i1 i1Var6 = i1Var;
                            d1Var.onPlayWhenReadyChanged(i1Var6.l, i1Var6.m);
                            break;
                        case 4:
                            d1Var.onPlaybackSuppressionReasonChanged(i1Var.n);
                            break;
                        case 5:
                            d1Var.onIsPlayingChanged(i1Var.m());
                            break;
                        case 6:
                            d1Var.onPlaybackParametersChanged(i1Var.o);
                            break;
                        case 7:
                            d1Var.onPlayerErrorChanged(i1Var.f);
                            break;
                        case 8:
                            d1Var.onPlayerError(i1Var.f);
                            break;
                        default:
                            d1Var.onTracksChanged(i1Var.i.d);
                            break;
                    }
                }
            });
        }
        B1();
        this.m.b();
        if (i1Var2.p != i1Var.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).a.E1();
            }
        }
    }

    @Override // b2.f1
    public final b2.t1 E0() {
        F1();
        return ((x2.n) this.i).j();
    }

    public final void E1() {
        int d = d();
        bi.a aVar = this.A;
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
        i1 i1Var = this.p0;
        long j10 = 0;
        if (i1Var.k.d != i1Var.b.d) {
            return e2.m0.h0(i1Var.a.m(n0(), (b2.n1) this.a, 0L).m);
        }
        long j11 = i1Var.q;
        if (this.p0.k.b()) {
            i1 i1Var2 = this.p0;
            i1Var2.a.g(i1Var2.k.a, this.o).d(this.p0.k.b);
        } else {
            j10 = j11;
        }
        i1 i1Var3 = this.p0;
        b2.o1 o1Var = i1Var3.a;
        Object obj = i1Var3.k.a;
        b2.l1 l1Var = this.o;
        o1Var.g(obj, l1Var);
        return e2.m0.h0(j10 + l1Var.e);
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
            String l4 = org.telegram.ui.Cells.b1.l("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f0) {
                throw new IllegalStateException(l4);
            }
            e2.a.m("ExoPlayerImpl", l4, this.g0 ? null : new IllegalStateException());
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
    public final b2.p J() {
        F1();
        return this.j0;
    }

    @Override // b2.f1
    public final void K() {
        F1();
    }

    @Override // b2.f1
    public final b2.r0 K0() {
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
        v1(-9223372036854775807L, g12, true, -1);
    }

    @Override // b2.f1
    public final void M(int i10) {
        F1();
    }

    @Override // b2.f1
    public final long M0() {
        F1();
        return e2.m0.h0(j1(this.p0));
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
            rVar.c(20, new e1.c(fVar, 14));
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
                if (((d0) arrayList.get(i12)).b.k.a((b2.o0) list.get(i12 - i10))) {
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
                b2.o1 o1Var = d0Var.c;
                b2.o0 o0Var = (b2.o0) list.get(i13 - i10);
                d0Var.c = o1Var instanceof u2.s1 ? new u2.s1(((u2.s1) o1Var).e, o0Var) : new u2.s1(o1Var, o0Var);
            }
            D1(this.p0.j(new n1(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList g12 = g1(list);
        if (!this.p0.a.p()) {
            i1 r12 = r1(e1(this.p0, min, g12), i10, min);
            D1(r12, 0, !r12.b.a.equals(this.p0.b.a), 4, j1(r12), -1, false);
        } else {
            boolean z10 = this.q0 == -1;
            F1();
            v1(-9223372036854775807L, g12, z10, -1);
        }
    }

    @Override // b2.f1
    public final long O0() {
        F1();
        return this.l0;
    }

    @Override // b2.f1
    public final void R(int i10, int i11) {
        F1();
        u6.g(i10 >= 0 && i11 >= i10);
        int size = this.p.size();
        int min = Math.min(i11, size);
        if (i10 >= size || i10 == min) {
            return;
        }
        i1 r12 = r1(this.p0, i10, min);
        D1(r12, 0, !r12.b.a.equals(this.p0.b.a), 4, j1(r12), -1, false);
    }

    @Override // b2.f1
    public final void S(long j10, int i10, List list) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(j10, g12, false, i10);
    }

    @Override // b2.f1
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

    @Override // b2.f1
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

    @Override // b2.f1
    public final b2.y0 W() {
        F1();
        return this.p0.f;
    }

    @Override // b2.f1
    public final void X(boolean z10) {
        F1();
        C1(1, z10);
    }

    @Override // ai.c1
    public final void X0() {
        boolean z10;
        e2.a.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.m0.a + "] [" + b2.p0.b() + "]");
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
        q0 q0Var = this.l;
        if (q0Var.Z || !q0Var.s.getThread().isAlive()) {
            z10 = true;
        } else {
            q0Var.Z = true;
            e2.i iVar = new e2.i(q0Var.F);
            q0Var.n.b(7, iVar).b();
            z10 = iVar.c(q0Var.K);
        }
        if (!z10) {
            this.m.e(10, new fh.b(26));
        }
        this.m.d();
        this.j.a.removeCallbacksAndMessages(null);
        y2.c cVar = this.u;
        j2.e eVar = this.s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((y2.f) cVar).c.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            y2.b bVar = (y2.b) it.next();
            if (bVar.b == eVar) {
                bVar.c = true;
                copyOnWriteArrayList.remove(bVar);
            }
        }
        i1 i1Var = this.p0;
        if (i1Var.p) {
            this.p0 = i1Var.a();
        }
        i1 n12 = n1(this.p0, 1);
        this.p0 = n12;
        i1 c10 = n12.c(n12.b);
        this.p0 = c10;
        c10.q = c10.s;
        this.p0.r = 0L;
        j2.e eVar2 = this.s;
        e2.i0 i0Var = eVar2.n;
        i0Var.getClass();
        i0Var.d(new bc(eVar2, 25));
        s1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.e0 = d2.c.d;
        this.i0 = true;
    }

    @Override // ai.c1
    public final void Y0(int i10, long j10, boolean z10) {
        F1();
        if (i10 == -1) {
            return;
        }
        u6.g(i10 >= 0);
        b2.o1 o1Var = this.p0.a;
        if (o1Var.p() || i10 < o1Var.o()) {
            j2.e eVar = this.s;
            if (!eVar.r) {
                j2.a l4 = eVar.l();
                eVar.r = true;
                eVar.q(l4, -1, new e1.c(l4, 25));
            }
            this.J++;
            if (n()) {
                e2.a.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                n0 n0Var = new n0(this.p0);
                n0Var.f(1);
                h0 h0Var = this.k.b;
                h0Var.j.d(new hi.t(1, h0Var, n0Var));
                return;
            }
            i1 i1Var = this.p0;
            int i11 = i1Var.e;
            if (i11 == 3 || (i11 == 4 && !o1Var.p())) {
                i1Var = this.p0.h(2);
            }
            int n02 = n0();
            i1 o12 = o1(i1Var, o1Var, p1(o1Var, i10, j10));
            this.l.n.b(3, new p0(o1Var, i10, e2.m0.S(j10))).b();
            D1(o12, 0, true, 1, j1(o12), n02, z10);
        }
    }

    @Override // b2.f1
    public final long Z() {
        F1();
        return this.m0;
    }

    @Override // b2.f1
    public final long a0() {
        F1();
        return i1(this.p0);
    }

    @Override // b2.f1
    public final void b() {
        F1();
        i1 i1Var = this.p0;
        if (i1Var.e != 1) {
            return;
        }
        i1 f7 = i1Var.f(null);
        i1 n12 = n1(f7, f7.a.p() ? 4 : 2);
        this.J++;
        this.l.n.a(29).b();
        D1(n12, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // b2.f1
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

    @Override // b2.f1
    public final boolean c() {
        F1();
        return this.p0.g;
    }

    @Override // b2.f1
    public final void c0() {
        F1();
        if (this.b0 == 0.0f) {
            float f7 = this.c0;
            if (f7 != 0.0f) {
                U(f7);
            }
        }
    }

    @Override // b2.f1
    public final int d() {
        F1();
        return this.p0.e;
    }

    @Override // b2.f1
    public final long d0() {
        F1();
        if (!n()) {
            return F0();
        }
        i1 i1Var = this.p0;
        return i1Var.k.equals(i1Var.b) ? e2.m0.h0(this.p0.q) : getDuration();
    }

    public final i1 e1(i1 i1Var, int i10, ArrayList arrayList) {
        b2.o1 o1Var = i1Var.a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.p;
            if (i11 >= size) {
                this.O = this.O.f(i10, arrayList2.size());
                n1 n1Var = new n1(arrayList3, this.O);
                i1 o12 = o1(i1Var, n1Var, l1(o1Var, n1Var, k1(i1Var), i1(i1Var)));
                u2.k1 k1Var = this.O;
                e2.i0 i0Var = this.l.n;
                l0 l0Var = new l0(arrayList2, k1Var, -1, -9223372036854775807L);
                i0Var.getClass();
                e2.h0 c10 = e2.i0.c();
                c10.a = i0Var.a.obtainMessage(18, i10, 0, l0Var);
                c10.b();
                return o12;
            }
            g1 g1Var = new g1((u2.a) arrayList.get(i11), this.q);
            arrayList2.add(g1Var);
            arrayList3.add(i11 + i10, new d0(g1Var.b, g1Var.a));
            i11++;
        }
    }

    @Override // b2.f1
    public final void f(b2.z0 z0Var) {
        F1();
        if (this.p0.o.equals(z0Var)) {
            return;
        }
        i1 g10 = this.p0.g(z0Var);
        this.J++;
        this.l.n.b(4, z0Var).b();
        D1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final b2.r0 f1() {
        b2.o1 y02 = y0();
        if (y02.p()) {
            return this.o0;
        }
        b2.o0 o0Var = y02.m(n0(), (b2.n1) this.a, 0L).c;
        b2.q0 a2 = this.o0.a();
        b2.r0 r0Var = o0Var.d;
        if (r0Var != null) {
            e9.n0 n0Var = r0Var.K;
            byte[] bArr = r0Var.k;
            CharSequence charSequence = r0Var.a;
            if (charSequence != null) {
                a2.a = charSequence;
            }
            CharSequence charSequence2 = r0Var.b;
            if (charSequence2 != null) {
                a2.b = charSequence2;
            }
            CharSequence charSequence3 = r0Var.c;
            if (charSequence3 != null) {
                a2.c = charSequence3;
            }
            CharSequence charSequence4 = r0Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = r0Var.e;
            if (charSequence5 != null) {
                a2.e = charSequence5;
            }
            CharSequence charSequence6 = r0Var.f;
            if (charSequence6 != null) {
                a2.f = charSequence6;
            }
            CharSequence charSequence7 = r0Var.g;
            if (charSequence7 != null) {
                a2.g = charSequence7;
            }
            Long l4 = r0Var.h;
            if (l4 != null) {
                u6.g(l4.longValue() >= 0);
                a2.h = l4;
            }
            b2.g1 g1Var = r0Var.i;
            if (g1Var != null) {
                a2.i = g1Var;
            }
            b2.g1 g1Var2 = r0Var.j;
            if (g1Var2 != null) {
                a2.j = g1Var2;
            }
            Uri uri = r0Var.n;
            if (uri != null || bArr != null) {
                a2.n = uri;
                a2.b(bArr, r0Var.m);
                a2.l = r0Var.l;
            }
            Integer num = r0Var.o;
            if (num != null) {
                a2.o = num;
            }
            Integer num2 = r0Var.p;
            if (num2 != null) {
                a2.p = num2;
            }
            Integer num3 = r0Var.q;
            if (num3 != null) {
                a2.q = num3;
            }
            Boolean bool = r0Var.r;
            if (bool != null) {
                a2.r = bool;
            }
            Boolean bool2 = r0Var.s;
            if (bool2 != null) {
                a2.s = bool2;
            }
            Integer num4 = r0Var.t;
            if (num4 != null) {
                a2.t = num4;
            }
            Integer num5 = r0Var.u;
            if (num5 != null) {
                a2.t = num5;
            }
            Integer num6 = r0Var.v;
            if (num6 != null) {
                a2.u = num6;
            }
            Integer num7 = r0Var.w;
            if (num7 != null) {
                a2.v = num7;
            }
            Integer num8 = r0Var.x;
            if (num8 != null) {
                a2.w = num8;
            }
            Integer num9 = r0Var.y;
            if (num9 != null) {
                a2.x = num9;
            }
            Integer num10 = r0Var.z;
            if (num10 != null) {
                a2.y = num10;
            }
            CharSequence charSequence8 = r0Var.A;
            if (charSequence8 != null) {
                a2.z = charSequence8;
            }
            CharSequence charSequence9 = r0Var.B;
            if (charSequence9 != null) {
                a2.A = charSequence9;
            }
            CharSequence charSequence10 = r0Var.C;
            if (charSequence10 != null) {
                a2.B = charSequence10;
            }
            Integer num11 = r0Var.D;
            if (num11 != null) {
                a2.C = num11;
            }
            Integer num12 = r0Var.E;
            if (num12 != null) {
                a2.D = num12;
            }
            CharSequence charSequence11 = r0Var.F;
            if (charSequence11 != null) {
                a2.E = charSequence11;
            }
            CharSequence charSequence12 = r0Var.G;
            if (charSequence12 != null) {
                a2.F = charSequence12;
            }
            CharSequence charSequence13 = r0Var.H;
            if (charSequence13 != null) {
                a2.G = charSequence13;
            }
            Integer num13 = r0Var.I;
            if (num13 != null) {
                a2.H = num13;
            }
            Bundle bundle = r0Var.J;
            if (bundle != null) {
                a2.I = bundle;
            }
            if (!n0Var.isEmpty()) {
                a2.J = e9.n0.u(n0Var);
            }
        }
        return new b2.r0(a2);
    }

    @Override // b2.f1
    public final void g0(int i10) {
        F1();
    }

    public final ArrayList g1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.r.a((b2.o0) list.get(i10)));
        }
        return arrayList;
    }

    @Override // b2.f1
    public final long getDuration() {
        F1();
        if (!n()) {
            return z();
        }
        i1 i1Var = this.p0;
        u2.h0 h0Var = i1Var.b;
        b2.o1 o1Var = i1Var.a;
        Object obj = h0Var.a;
        b2.l1 l1Var = this.o;
        o1Var.g(obj, l1Var);
        return e2.m0.h0(l1Var.a(h0Var.b, h0Var.c));
    }

    @Override // b2.f1
    public final b2.z0 h() {
        F1();
        return this.p0.o;
    }

    @Override // b2.f1
    public final v1 h0() {
        F1();
        return this.p0.i.d;
    }

    public final l1 h1(k1 k1Var) {
        int k12 = k1(this.p0);
        b2.o1 o1Var = this.p0.a;
        if (k12 == -1) {
            k12 = 0;
        }
        q0 q0Var = this.l;
        return new l1(q0Var, k1Var, o1Var, k12, q0Var.s);
    }

    @Override // b2.f1
    public final b2.r0 i0() {
        F1();
        return this.R;
    }

    public final long i1(i1 i1Var) {
        u2.h0 h0Var = i1Var.b;
        long j10 = i1Var.c;
        b2.o1 o1Var = i1Var.a;
        if (!h0Var.b()) {
            return e2.m0.h0(j1(i1Var));
        }
        Object obj = i1Var.b.a;
        b2.l1 l1Var = this.o;
        o1Var.g(obj, l1Var);
        if (j10 == -9223372036854775807L) {
            return e2.m0.h0(o1Var.m(k1(i1Var), (b2.n1) this.a, 0L).l);
        }
        return e2.m0.h0(j10) + e2.m0.h0(l1Var.e);
    }

    @Override // b2.f1
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

    public final long j1(i1 i1Var) {
        if (i1Var.a.p()) {
            return e2.m0.S(this.r0);
        }
        long l4 = i1Var.p ? i1Var.l() : i1Var.s;
        if (i1Var.b.b()) {
            return l4;
        }
        b2.o1 o1Var = i1Var.a;
        Object obj = i1Var.b.a;
        b2.l1 l1Var = this.o;
        o1Var.g(obj, l1Var);
        return l4 + l1Var.e;
    }

    @Override // b2.f1
    public final d2.c k0() {
        F1();
        return this.e0;
    }

    public final int k1(i1 i1Var) {
        return i1Var.a.p() ? this.q0 : i1Var.a.g(i1Var.b.a, this.o).c;
    }

    @Override // b2.f1
    public final int l() {
        F1();
        return this.H;
    }

    public final Pair l1(b2.o1 o1Var, n1 n1Var, int i10, long j10) {
        if (o1Var.p() || n1Var.p()) {
            boolean z10 = !o1Var.p() && n1Var.p();
            return p1(n1Var, z10 ? -1 : i10, z10 ? -9223372036854775807L : j10);
        }
        Pair i11 = o1Var.i((b2.n1) this.a, this.o, i10, e2.m0.S(j10));
        Object obj = i11.first;
        if (n1Var.b(obj) != -1) {
            return i11;
        }
        int U = q0.U((b2.n1) this.a, this.o, this.H, this.I, obj, o1Var, n1Var);
        if (U == -1) {
            return p1(n1Var, -1, -9223372036854775807L);
        }
        b2.n1 n1Var2 = (b2.n1) this.a;
        n1Var.m(U, n1Var2, 0L);
        return p1(n1Var, U, e2.m0.h0(n1Var2.l));
    }

    @Override // b2.f1
    public final int m() {
        F1();
        return 0;
    }

    @Override // b2.f1
    public final int m0() {
        F1();
        if (n()) {
            return this.p0.b.b;
        }
        return -1;
    }

    @Override // b2.f1
    public final boolean n() {
        F1();
        return this.p0.b.b();
    }

    @Override // b2.f1
    public final int n0() {
        F1();
        int k12 = k1(this.p0);
        if (k12 == -1) {
            return 0;
        }
        return k12;
    }

    public final i1 o1(i1 i1Var, b2.o1 o1Var, Pair pair) {
        List list;
        u6.g(o1Var.p() || pair != null);
        b2.o1 o1Var2 = i1Var.a;
        long i12 = i1(i1Var);
        i1 j10 = i1Var.j(o1Var);
        if (o1Var.p()) {
            u2.h0 h0Var = i1.u;
            long S = e2.m0.S(this.r0);
            i1 c10 = j10.d(h0Var, S, S, S, 0L, u2.t1.d, this.b, x1.e).c(h0Var);
            c10.q = c10.s;
            return c10;
        }
        Object obj = j10.b.a;
        String str = e2.m0.a;
        boolean equals = obj.equals(pair.first);
        u2.h0 h0Var2 = !equals ? new u2.h0(pair.first) : j10.b;
        long longValue = ((Long) pair.second).longValue();
        long S2 = e2.m0.S(i12);
        if (!o1Var2.p()) {
            S2 -= o1Var2.g(obj, this.o).e;
            if (equals && S2 - longValue == 1 && S2 == o1Var2.g(obj, this.o).d) {
                S2--;
            }
        }
        if (!equals || longValue < S2) {
            u2.h0 h0Var3 = h0Var2;
            u6.p(!h0Var3.b());
            u2.t1 t1Var = !equals ? u2.t1.d : j10.h;
            x2.t tVar = !equals ? this.b : j10.i;
            if (equals) {
                list = j10.j;
            } else {
                e9.l0 l0Var = e9.n0.b;
                list = x1.e;
            }
            i1 c11 = j10.d(h0Var3, longValue, longValue, longValue, 0L, t1Var, tVar, list).c(h0Var3);
            c11.q = longValue;
            return c11;
        }
        if (longValue != S2) {
            u2.h0 h0Var4 = h0Var2;
            u6.p(!h0Var4.b());
            long max = Math.max(0L, j10.r - (longValue - S2));
            long j11 = j10.q;
            if (j10.k.equals(j10.b)) {
                j11 = longValue + max;
            }
            i1 d = j10.d(h0Var4, longValue, longValue, longValue, max, j10.h, j10.i, j10.j);
            d.q = j11;
            return d;
        }
        int b10 = o1Var.b(j10.k.a);
        if (b10 != -1 && o1Var.f(b10, this.o, false).c == o1Var.g(h0Var2.a, this.o).c) {
            return j10;
        }
        o1Var.g(h0Var2.a, this.o);
        long a2 = h0Var2.b() ? this.o.a(h0Var2.b, h0Var2.c) : this.o.d;
        u2.h0 h0Var5 = h0Var2;
        i1 c12 = j10.d(h0Var5, j10.s, j10.s, j10.d, a2 - j10.s, j10.h, j10.i, j10.j).c(h0Var5);
        c12.q = a2;
        return c12;
    }

    @Override // b2.f1
    public final void p(b2.t1 t1Var) {
        F1();
        x2.s sVar = this.i;
        sVar.getClass();
        b2.t1 E0 = E0();
        if (!t1Var.equals(((x2.n) sVar).j())) {
            sVar.b(t1Var);
        }
        if (E0.equals(t1Var)) {
            return;
        }
        this.m.e(19, new e1.c(t1Var, 15));
    }

    @Override // b2.f1
    public final void p0(b2.d1 d1Var) {
        d1Var.getClass();
        this.m.a(d1Var);
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
            j10 = e2.m0.h0(o1Var.m(i10, (b2.n1) this.a, 0L).l);
        }
        return o1Var.i((b2.n1) this.a, this.o, i10, e2.m0.S(j10));
    }

    @Override // b2.f1
    public final long q() {
        F1();
        return e2.m0.h0(this.p0.r);
    }

    @Override // b2.f1
    public final void q0(boolean z10) {
        F1();
    }

    public final void q1(int i10, int i11) {
        e2.y yVar = this.Z;
        if (i10 == yVar.a && i11 == yVar.b) {
            return;
        }
        this.Z = new e2.y(i10, i11);
        org.telegram.messenger.g1 g1Var = this.s0;
        if (g1Var != null) {
            g1Var.execute(new hg.n(this, i10, i11, 1));
            return;
        }
        this.m.e(24, new eh.c(i10, i11, 1));
        t1(2, 14, new e2.y(i10, i11));
    }

    public final i1 r1(i1 i1Var, int i10, int i11) {
        ArrayList arrayList;
        int k12 = k1(i1Var);
        long i12 = i1(i1Var);
        b2.o1 o1Var = i1Var.a;
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
        n1 n1Var = new n1(arrayList, this.O);
        i1 o12 = o1(i1Var, n1Var, l1(o1Var, n1Var, k12, i12));
        int i14 = o12.e;
        if (i14 != 1 && i14 != 4 && k12 >= i10 && k12 < i11) {
            if (q0.U((b2.n1) this.a, this.o, this.H, this.I, i1Var.b.a, o1Var, n1Var) == -1) {
                o12 = n1(o12, 4);
            }
        }
        u2.k1 k1Var = this.O;
        e2.i0 i0Var = this.l.n;
        i0Var.getClass();
        e2.h0 c10 = e2.i0.c();
        c10.a = i0Var.a.obtainMessage(20, i10, i11, k1Var);
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

    @Override // ai.c1, b2.f1
    public final void stop() {
        F1();
        A1(null);
        this.e0 = new d2.c(this.p0.s, x1.e);
    }

    @Override // b2.f1
    public final boolean t() {
        F1();
        return this.p0.l;
    }

    @Override // b2.f1
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
        b2.o1 y02 = y0();
        this.J++;
        e2.m0.R(i10, min, min2, arrayList);
        this.O = this.O.g();
        n1 n1Var = new n1(arrayList, this.O);
        i1 i1Var = this.p0;
        i1 o12 = o1(i1Var, n1Var, l1(y02, n1Var, k1(i1Var), i1(this.p0)));
        u2.k1 k1Var = this.O;
        q0 q0Var = this.l;
        q0Var.getClass();
        q0Var.n.b(19, new m0(i10, min, min2, k1Var)).b();
        D1(o12, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void t1(int i10, int i11, Object obj) {
        for (b bVar : this.g) {
            if (i10 == -1 || bVar.b == i10) {
                l1 h12 = h1(bVar);
                u6.p(!h12.f);
                h12.c = i11;
                u6.p(!h12.f);
                h12.d = obj;
                h12.b();
            }
        }
        for (b bVar2 : this.h) {
            if (bVar2 != null && (i10 == -1 || bVar2.b == i10)) {
                l1 h13 = h1(bVar2);
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
            g1 g1Var = new g1((u2.a) list.get(i14), this.q);
            arrayList2.add(g1Var);
            arrayList.add(i14, new d0(g1Var.b, g1Var.a));
        }
        this.O = this.O.c(arrayList2.size());
        n1 n1Var = new n1(arrayList, this.O);
        boolean p5 = n1Var.p();
        int i15 = n1Var.h;
        if (!p5 && i13 >= i15) {
            throw new b2.z();
        }
        if (z10) {
            i13 = n1Var.a(this.I);
            j11 = -9223372036854775807L;
        } else {
            if (i13 == -1) {
                i11 = k12;
                j11 = M0;
                i1 o12 = o1(this.p0, n1Var, p1(n1Var, i11, j11));
                i12 = o12.e;
                if (i12 != 1) {
                    i12 = 1;
                } else {
                    if (!n1Var.p()) {
                        if (i11 != -1) {
                            if (i11 < i15) {
                                i12 = 2;
                            }
                        }
                    }
                    i12 = 4;
                }
                i1 n12 = n1(o12, i12);
                this.l.n.b(17, new l0(arrayList2, this.O, i11, e2.m0.S(j11))).b();
                D1(n12, 0, this.p0.b.a.equals(n12.b.a) && !this.p0.a.p(), 4, j1(n12), -1, false);
            }
            j11 = j10;
        }
        i11 = i13;
        i1 o122 = o1(this.p0, n1Var, p1(n1Var, i11, j11));
        i12 = o122.e;
        if (i12 != 1) {
        }
        i1 n122 = n1(o122, i12);
        this.l.n.b(17, new l0(arrayList2, this.O, i11, e2.m0.S(j11))).b();
        D1(n122, 0, this.p0.b.a.equals(n122.b.a) && !this.p0.a.p(), 4, j1(n122), -1, false);
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
            x xVar = new x(0, z10);
            e2.r rVar = this.m;
            rVar.c(9, xVar);
            B1();
            rVar.b();
        }
    }

    @Override // b2.f1
    public final int w0() {
        F1();
        return this.p0.n;
    }

    public final void w1(s1 s1Var) {
        F1();
        if (s1Var == null) {
            s1Var = s1.f;
        }
        if (this.N.equals(s1Var)) {
            return;
        }
        this.N = s1Var;
        this.l.n.b(5, s1Var).b();
    }

    public final void x1(Surface surface) {
        Object obj = this.T;
        boolean z10 = true;
        boolean z11 = (obj == null || obj == surface) ? false : true;
        long j10 = z11 ? this.B : -9223372036854775807L;
        q0 q0Var = this.l;
        if (!q0Var.Z && q0Var.s.getThread().isAlive()) {
            e2.i iVar = new e2.i(q0Var.F);
            q0Var.n.b(30, new Pair(surface, iVar)).b();
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
