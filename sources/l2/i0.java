package l2;

import a8.ia;
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
import di.r4;
import e2.x1;
import fi.v9;
import hi.x3;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import jg.a2;
import org.telegram.ui.Components.l51;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class i0 extends bi.b1 implements p {
    public final ci.a A;
    public final long B;
    public final h2.c C;
    public final h2.e0 D;
    public final h0 E;
    public final j2.n F;
    public final j2.n G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public final s1 M;
    public t1 N;
    public x2.g1 O;
    public e2.y0 P;
    public e2.o0 Q;
    public e2.o0 R;
    public e2.u S;
    public Object T;
    public Surface U;
    public SurfaceHolder V;
    public boolean W;
    public TextureView X;
    public final int Y;
    public h2.y Z;
    public e2.e a0;
    public final a3.y b;
    public float b0;
    public final e2.y0 c;
    public float c0;
    public final h2.i d;
    public boolean d0;
    public final Context e;
    public g2.d e0;
    public final i0 f;
    public final boolean f0;
    public final b[] g;
    public boolean g0;
    public final b[] h;
    public final int h0;
    public final a3.x i;
    public boolean i0;
    public final h2.i0 j;
    public final e2.o j0;
    public final v k;
    public x1 k0;
    public final r0 l;
    public final long l0;
    public final h2.r m;
    public final long m0;
    public final CopyOnWriteArraySet n;
    public final long n0;
    public final e2.i1 o;
    public e2.o0 o0;
    public final ArrayList p;
    public k1 p0;
    public final boolean q;
    public int q0;
    public final x2.e0 r;
    public long r0;
    public final m2.e s;
    public l51 s0;
    public final Looper t;
    public final ArrayList t0;
    public final b3.d u;
    public final h2.g0 v;
    public final c0 w;
    public final d0 x;
    public final ab.q y;
    public final h2.p0 z;

    static {
        e2.m0.a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0371 A[Catch: all -> 0x00b8, TryCatch #1 {all -> 0x00b8, blocks: (B:3:0x001f, B:6:0x009e, B:7:0x00a7, B:9:0x00ad, B:11:0x00bb, B:13:0x0156, B:15:0x0166, B:16:0x018a, B:18:0x0192, B:20:0x01a3, B:21:0x027c, B:23:0x0282, B:25:0x028c, B:31:0x0296, B:38:0x02c1, B:45:0x02c9, B:47:0x0321, B:49:0x0325, B:51:0x0329, B:55:0x0331, B:58:0x0344, B:60:0x0371, B:61:0x0378, B:66:0x033d), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x033d A[Catch: all -> 0x00b8, TryCatch #1 {all -> 0x00b8, blocks: (B:3:0x001f, B:6:0x009e, B:7:0x00a7, B:9:0x00ad, B:11:0x00bb, B:13:0x0156, B:15:0x0166, B:16:0x018a, B:18:0x0192, B:20:0x01a3, B:21:0x027c, B:23:0x0282, B:25:0x028c, B:31:0x0296, B:38:0x02c1, B:45:0x02c9, B:47:0x0321, B:49:0x0325, B:51:0x0329, B:55:0x0331, B:58:0x0344, B:60:0x0371, B:61:0x0378, B:66:0x033d), top: B:2:0x001f }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [bi.b1, java.lang.Object, l2.i0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, l2.i0] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i0(n nVar) {
        i0 i0Var;
        boolean z9;
        h2.p0 p0Var;
        ?? b1Var = new bi.b1(2);
        b1Var.t0 = new ArrayList();
        b1Var.d = new h2.i();
        try {
            h2.a.g("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(b1Var)) + " [AndroidXMedia3/1.10.1] [" + h2.m0.a + "]");
            Context context = nVar.a;
            h2.g0 g0Var = nVar.b;
            b1Var.e = context.getApplicationContext();
            b1Var.s = new m2.e(g0Var);
            b1Var.h0 = nVar.i;
            b1Var.a0 = nVar.j;
            b1Var.Y = nVar.k;
            b1Var.d0 = false;
            b1Var.B = nVar.t;
            c0 c0Var = new c0(b1Var);
            b1Var.w = c0Var;
            b1Var.x = new d0();
            b[] b10 = ((j) nVar.c.get()).b(new Handler(nVar.h), c0Var, c0Var, c0Var, c0Var);
            b1Var.g = b10;
            ia.p(b10.length > 0);
            b1Var.h = new b[b10.length];
            int i7 = 0;
            while (true) {
                b[] bVarArr = b1Var.h;
                if (i7 >= bVarArr.length) {
                    break;
                }
                int i10 = b1Var.g[i7].b;
                bVarArr[i7] = null;
                i7++;
            }
            a3.x xVar = (a3.x) nVar.e.get();
            b1Var.i = xVar;
            b1Var.r = (x2.e0) nVar.d.get();
            b3.g c10 = b3.g.c(nVar.g.b);
            b1Var.u = c10;
            b1Var.q = nVar.l;
            b1Var.N = nVar.m;
            b1Var.l0 = nVar.o;
            b1Var.m0 = nVar.p;
            b1Var.n0 = nVar.q;
            b1Var.M = nVar.n;
            Looper looper = nVar.h;
            b1Var.t = looper;
            b1Var.v = g0Var;
            b1Var.f = b1Var;
            b1Var.m = new h2.r(new CopyOnWriteArraySet(), looper, looper.getThread(), g0Var, new x3(b1Var, 20), true);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            b1Var.n = copyOnWriteArraySet;
            b1Var.p = new ArrayList();
            b1Var.O = new x2.e1();
            b[] bVarArr2 = b1Var.g;
            a3.y yVar = new a3.y(new q1[bVarArr2.length], new a3.u[bVarArr2.length], e2.s1.b, null);
            b1Var.b = yVar;
            b1Var.o = new e2.i1();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (int i11 : new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32}) {
                ia.p(!false);
                sparseBooleanArray.append(i11, true);
            }
            xVar.getClass();
            ia.p(!false);
            sparseBooleanArray.append(29, true);
            ia.p(!false);
            e2.s sVar = new e2.s(sparseBooleanArray);
            b1Var.c = new e2.y0(sVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i12 = 0; i12 < sVar.a.size(); i12++) {
                int a10 = sVar.a(i12);
                ia.p(!false);
                sparseBooleanArray2.append(a10, true);
            }
            ia.p(!false);
            sparseBooleanArray2.append(4, true);
            ia.p(!false);
            sparseBooleanArray2.append(10, true);
            ia.p(!false);
            b1Var.P = new e2.y0(new e2.s(sparseBooleanArray2));
            b1Var.j = g0Var.a(looper, null);
            v vVar = new v(b1Var, 0);
            b1Var.k = vVar;
            b1Var.p0 = k1.k(yVar);
            b1Var.s.W(b1Var, looper);
            m2.j jVar = new m2.j(nVar.A);
            r0 r0Var = new r0(b1Var.e, b1Var.g, b1Var.h, xVar, yVar, (t0) nVar.f.get(), c10, b1Var.H, b1Var.I, b1Var.s, b1Var.N, nVar.r, nVar.s, looper, g0Var, vVar, jVar, b1Var.x, nVar.B);
            Looper looper2 = r0Var.s;
            h2.i0 i0Var2 = r0Var.n;
            b1Var.l = r0Var;
            b1Var.b0 = 1.0f;
            b1Var.H = 0;
            e2.o0 o0Var = e2.o0.L;
            b1Var.Q = o0Var;
            b1Var.R = o0Var;
            b1Var.o0 = o0Var;
            b1Var.q0 = -1;
            b1Var.e0 = g2.d.d;
            b1Var.f0 = true;
            b1Var.I0(b1Var.s);
            Handler handler = new Handler(looper);
            m2.e eVar = b1Var.s;
            c10.getClass();
            eVar.getClass();
            aa.n nVar2 = c10.c;
            nVar2.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) nVar2.b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                b3.c cVar = (b3.c) it.next();
                if (cVar.b == eVar) {
                    cVar.c = true;
                    copyOnWriteArrayList.remove(cVar);
                }
            }
            int i13 = 1;
            copyOnWriteArrayList.add(new b3.c(handler, eVar));
            copyOnWriteArraySet.add(b1Var.w);
            int i14 = Build.VERSION.SDK_INT;
            b1Var = b1Var;
            if (i14 >= 31) {
                try {
                    Context context2 = b1Var.e;
                    boolean z10 = nVar.y;
                    h2.i0 a11 = g0Var.a(looper2, null);
                    aa.d0 d0Var = new aa.d0(context2, z10, (Object) b1Var, jVar, 6);
                    b1Var = b1Var;
                    a11.d(d0Var);
                } catch (Throwable th2) {
                    th = th2;
                    i0Var = b1Var;
                    i0Var.d.e();
                    throw th;
                }
            }
            v vVar2 = new v(b1Var, i13);
            h2.c cVar2 = new h2.c();
            cVar2.b = g0Var.a(looper2, null);
            cVar2.c = g0Var.a(looper, null);
            cVar2.e = 0;
            cVar2.f = 0;
            cVar2.d = vVar2;
            b1Var.C = cVar2;
            cVar2.A(new v9(b1Var, 29));
            Context context3 = nVar.a;
            Looper looper3 = nVar.h;
            c0 c0Var2 = b1Var.w;
            ab.q qVar = new ab.q();
            qVar.b = context3.getApplicationContext();
            qVar.d = g0Var.a(looper2, null);
            qVar.c = new f2.a(qVar, g0Var.a(looper3, null), c0Var2);
            b1Var.y = qVar;
            qVar.y();
            if (nVar.u != Integer.MAX_VALUE && nVar.v != Integer.MAX_VALUE && nVar.w != Integer.MAX_VALUE && nVar.x != Integer.MAX_VALUE) {
                z9 = true;
                p0Var = new h2.p0(context, looper2, g0Var);
                b1Var.z = p0Var;
                if (p0Var.b == z9) {
                    p0Var.b = z9;
                    p0Var.a(z9, p0Var.c);
                }
                ci.a aVar = new ci.a();
                new sa.d(context.getApplicationContext(), 10);
                g0Var.a(looper2, null);
                g0Var.a(Looper.getMainLooper(), null);
                b1Var.A = aVar;
                b1Var.j0 = e2.o.c;
                b1Var.k0 = x1.d;
                b1Var.Z = h2.y.c;
                b1Var.E = i14 < 34 ? new h0(b1Var, context) : null;
                b1Var.F = new j2.n(3);
                b1Var.G = new j2.n(3);
                b1Var.D = new h2.e0(b1Var, b1Var.w, b1Var.v, nVar.u, nVar.v, nVar.w, nVar.x);
                i0Var2.b(38, b1Var.M).b();
                e2.e eVar2 = b1Var.a0;
                i0Var2.getClass();
                h2.h0 c11 = h2.i0.c();
                c11.a = i0Var2.a.obtainMessage(31, 0, 0, eVar2);
                c11.b();
                b1Var.t1(1, 3, b1Var.a0);
                b1Var.t1(2, 4, Integer.valueOf(b1Var.Y));
                b1Var.t1(2, 5, 0);
                b1Var.t1(1, 9, Boolean.valueOf(b1Var.d0));
                b1Var.t1(6, 8, b1Var.x);
                b1Var.t1(-1, 16, Integer.valueOf(b1Var.h0));
                b1Var.d.e();
            }
            z9 = false;
            p0Var = new h2.p0(context, looper2, g0Var);
            b1Var.z = p0Var;
            if (p0Var.b == z9) {
            }
            ci.a aVar2 = new ci.a();
            new sa.d(context.getApplicationContext(), 10);
            g0Var.a(looper2, null);
            g0Var.a(Looper.getMainLooper(), null);
            b1Var.A = aVar2;
            b1Var.j0 = e2.o.c;
            b1Var.k0 = x1.d;
            b1Var.Z = h2.y.c;
            b1Var.E = i14 < 34 ? new h0(b1Var, context) : null;
            b1Var.F = new j2.n(3);
            b1Var.G = new j2.n(3);
            b1Var.D = new h2.e0(b1Var, b1Var.w, b1Var.v, nVar.u, nVar.v, nVar.w, nVar.x);
            i0Var2.b(38, b1Var.M).b();
            e2.e eVar22 = b1Var.a0;
            i0Var2.getClass();
            h2.h0 c112 = h2.i0.c();
            c112.a = i0Var2.a.obtainMessage(31, 0, 0, eVar22);
            c112.b();
            b1Var.t1(1, 3, b1Var.a0);
            b1Var.t1(2, 4, Integer.valueOf(b1Var.Y));
            b1Var.t1(2, 5, 0);
            b1Var.t1(1, 9, Boolean.valueOf(b1Var.d0));
            b1Var.t1(6, 8, b1Var.x);
            b1Var.t1(-1, 16, Integer.valueOf(b1Var.h0));
            b1Var.d.e();
        } catch (Throwable th3) {
            th = th3;
            i0Var = b1Var;
        }
    }

    public static long m1(k1 k1Var) {
        e2.k1 k1Var2 = new e2.k1();
        e2.i1 i1Var = new e2.i1();
        k1Var.a.g(k1Var.b.a, i1Var);
        long j3 = k1Var.c;
        return j3 == -9223372036854775807L ? k1Var.a.m(i1Var.c, k1Var2, 0L).l : i1Var.e + j3;
    }

    public static k1 n1(k1 k1Var, int i7) {
        k1 h = k1Var.h(i7);
        return (i7 == 1 || i7 == 4) ? h.b(false) : h;
    }

    @Override // e2.c1
    public final Looper A0() {
        return this.t;
    }

    public final void A1(l lVar) {
        k1 k1Var = this.p0;
        k1 c10 = k1Var.c(k1Var.b);
        c10.q = c10.s;
        c10.r = 0L;
        k1 n1 = n1(c10, 1);
        if (lVar != null) {
            n1 = n1.f(lVar);
        }
        this.J++;
        this.l.n.a(6).b();
        D1(n1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // e2.c1
    public final int B() {
        F1();
        if (!this.p0.a.p()) {
            k1 k1Var = this.p0;
            return k1Var.a.b(k1Var.b.a);
        }
        int i7 = this.q0;
        if (i7 == -1) {
            return 0;
        }
        return i7;
    }

    @Override // e2.c1
    public final void B0() {
        F1();
        if (this.b0 != 0.0f) {
            T(0.0f);
        }
    }

    public final void B1() {
        e2.y0 y0Var = this.P;
        String str = h2.m0.a;
        i0 i0Var = this.f;
        boolean p10 = i0Var.p();
        boolean e02 = i0Var.e0();
        boolean T0 = i0Var.T0();
        boolean S0 = i0Var.S0();
        boolean P0 = i0Var.P0();
        boolean v02 = i0Var.v0();
        boolean p11 = i0Var.y0().p();
        e2.x0 x0Var = new e2.x0();
        x0Var.a = new ca.i();
        ca.i iVar = (ca.i) x0Var.a;
        iVar.c(this.c.a);
        boolean z9 = !p10;
        x0Var.a(4, z9);
        boolean z10 = false;
        x0Var.a(5, e02 && !p10);
        x0Var.a(6, T0 && !p10);
        x0Var.a(7, !p11 && (T0 || !P0 || e02) && !p10);
        x0Var.a(8, S0 && !p10);
        x0Var.a(9, !p11 && (S0 || (P0 && v02)) && !p10);
        x0Var.a(10, z9);
        x0Var.a(11, e02 && !p10);
        if (e02 && !p10) {
            z10 = true;
        }
        x0Var.a(12, z10);
        e2.y0 y0Var2 = new e2.y0(iVar.d());
        this.P = y0Var2;
        if (y0Var2.equals(y0Var)) {
            return;
        }
        this.m.c(13, new v(this, 2));
    }

    @Override // e2.c1
    public final x1 C() {
        F1();
        return this.k0;
    }

    @Override // e2.c1
    public final void C0() {
        F1();
    }

    public final void C1(int i7, boolean z9) {
        k1 k1Var = this.p0;
        int i10 = k1Var.n;
        int i11 = (i10 != 1 || z9) ? 0 : 1;
        if (k1Var.l == z9 && i10 == i11 && k1Var.m == i7) {
            return;
        }
        this.J++;
        if (k1Var.p) {
            k1Var = k1Var.a();
        }
        k1 e10 = k1Var.e(i7, i11, z9);
        h2.i0 i0Var = this.l.n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.a = i0Var.a.obtainMessage(1, z9 ? 1 : 0, i7 | (i11 << 4));
        c10.b();
        D1(e10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // e2.c1
    public final void D(e2.e eVar, boolean z9) {
        F1();
        if (this.i0) {
            return;
        }
        boolean equals = Objects.equals(this.a0, eVar);
        h2.r rVar = this.m;
        if (!equals) {
            this.a0 = eVar;
            t1(1, 3, eVar);
            rVar.c(20, new r4(eVar, 28));
        }
        e2.e eVar2 = this.a0;
        h2.i0 i0Var = this.l.n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.a = i0Var.a.obtainMessage(31, z9 ? 1 : 0, 0, eVar2);
        c10.b();
        rVar.b();
    }

    @Override // e2.c1
    public final boolean D0() {
        F1();
        return this.I;
    }

    public final void D1(final k1 k1Var, int i7, boolean z9, int i10, long j3, int i11, boolean z10) {
        Pair pair;
        int i12;
        e2.l0 l0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        Object obj;
        e2.l0 l0Var2;
        Object obj2;
        long j10;
        long j11;
        long j12;
        long m12;
        Object obj3;
        e2.l0 l0Var3;
        Object obj4;
        k1 k1Var2 = this.p0;
        this.p0 = k1Var;
        boolean equals = k1Var2.a.equals(k1Var.a);
        e2.k1 k1Var3 = (e2.k1) this.a;
        e2.i1 i1Var = this.o;
        e2.l1 l1Var = k1Var2.a;
        x2.f0 f0Var = k1Var2.b;
        e2.l1 l1Var2 = k1Var.a;
        x2.f0 f0Var2 = k1Var.b;
        if (l1Var2.p() && l1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (l1Var2.p() != l1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (l1Var.m(l1Var.g(f0Var.a, i1Var).c, k1Var3, 0L).a.equals(l1Var2.m(l1Var2.g(f0Var2.a, i1Var).c, k1Var3, 0L).a)) {
            pair = (z9 && i10 == 0 && f0Var.d < f0Var2.d) ? new Pair(Boolean.TRUE, 0) : (z9 && i10 == 1 && z10) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z9 && i10 == 0) {
                i12 = 1;
            } else if (z9 && i10 == 1) {
                i12 = 2;
            } else {
                if (equals) {
                    throw new IllegalStateException();
                }
                i12 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i12));
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        if (booleanValue) {
            l0Var = !k1Var.a.p() ? k1Var.a.m(k1Var.a.g(k1Var.b.a, this.o).c, (e2.k1) this.a, 0L).c : null;
            this.o0 = e2.o0.L;
        } else {
            l0Var = null;
        }
        if (booleanValue || !k1Var2.j.equals(k1Var.j)) {
            e2.n0 a10 = this.o0.a();
            List list = k1Var.j;
            for (int i15 = 0; i15 < list.size(); i15++) {
                e2.q0 q0Var = (e2.q0) list.get(i15);
                int i16 = 0;
                while (true) {
                    e2.p0[] p0VarArr = q0Var.a;
                    if (i16 < p0VarArr.length) {
                        p0VarArr[i16].b(a10);
                        i16++;
                    }
                }
            }
            this.o0 = new e2.o0(a10);
        }
        e2.o0 f12 = f1();
        boolean equals2 = f12.equals(this.Q);
        this.Q = f12;
        boolean z14 = k1Var2.l != k1Var.l;
        boolean z15 = k1Var2.e != k1Var.e;
        if (z15 || z14) {
            E1();
        }
        boolean z16 = k1Var2.g != k1Var.g;
        if (!equals) {
            this.m.c(0, new q(k1Var, i7, 0));
        }
        if (z9) {
            e2.i1 i1Var2 = new e2.i1();
            if (k1Var2.a.p()) {
                z11 = booleanValue;
                z12 = equals2;
                z13 = z15;
                i13 = i11;
                i14 = i13;
                obj = null;
                l0Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = k1Var2.b.a;
                k1Var2.a.g(obj5, i1Var2);
                int i17 = i1Var2.c;
                int b10 = k1Var2.a.b(obj5);
                z11 = booleanValue;
                z12 = equals2;
                z13 = z15;
                obj = k1Var2.a.m(i17, (e2.k1) this.a, 0L).a;
                l0Var2 = ((e2.k1) this.a).c;
                obj2 = obj5;
                i13 = i17;
                i14 = b10;
            }
            if (i10 == 0) {
                if (k1Var2.b.b()) {
                    x2.f0 f0Var3 = k1Var2.b;
                    j12 = i1Var2.a(f0Var3.b, f0Var3.c);
                    m12 = m1(k1Var2);
                } else if (k1Var2.b.e != -1) {
                    j12 = m1(this.p0);
                    m12 = j12;
                } else {
                    j10 = i1Var2.e;
                    j11 = i1Var2.d;
                    j12 = j10 + j11;
                    m12 = j12;
                }
            } else if (k1Var2.b.b()) {
                j12 = k1Var2.s;
                m12 = m1(k1Var2);
            } else {
                j10 = i1Var2.e;
                j11 = k1Var2.s;
                j12 = j10 + j11;
                m12 = j12;
            }
            long h02 = h2.m0.h0(j12);
            long h03 = h2.m0.h0(m12);
            x2.f0 f0Var4 = k1Var2.b;
            e2.b1 b1Var = new e2.b1(obj, i13, l0Var2, obj2, i14, h02, h03, f0Var4.b, f0Var4.c);
            e2.k1 k1Var4 = (e2.k1) this.a;
            int o02 = o0();
            int B = B();
            if (this.p0.a.p()) {
                obj3 = null;
                l0Var3 = null;
                obj4 = null;
            } else {
                k1 k1Var5 = this.p0;
                Object obj6 = k1Var5.b.a;
                k1Var5.a.g(obj6, this.o);
                B = this.p0.a.b(obj6);
                Object obj7 = this.p0.a.m(o02, k1Var4, 0L).a;
                l0Var3 = k1Var4.c;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i18 = B;
            long h04 = h2.m0.h0(j3);
            long h05 = this.p0.b.b() ? h2.m0.h0(m1(this.p0)) : h04;
            x2.f0 f0Var5 = this.p0.b;
            this.m.c(11, new a2(i10, b1Var, new e2.b1(obj3, o02, l0Var3, obj4, i18, h04, h05, f0Var5.b, f0Var5.c), 2));
        } else {
            z11 = booleanValue;
            z12 = equals2;
            z13 = z15;
        }
        if (z11) {
            this.m.c(1, new q(l0Var, intValue, 1));
        }
        if (k1Var2.f != k1Var.f) {
            final int i19 = 7;
            this.m.c(10, new h2.o() { // from class: l2.s
                @Override // h2.o
                public final void invoke(Object obj8) {
                    e2.a1 a1Var = (e2.a1) obj8;
                    switch (i19) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.g);
                            a1Var.j(k1Var6.g);
                            break;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.e, k1Var7.l);
                            break;
                        case 2:
                            a1Var.m(k1Var.e);
                            break;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.m, k1Var8.l);
                            break;
                        case 4:
                            a1Var.g(k1Var.n);
                            break;
                        case 5:
                            a1Var.P(k1Var.m());
                            break;
                        case 6:
                            a1Var.H(k1Var.o);
                            break;
                        case 7:
                            a1Var.q(k1Var.f);
                            break;
                        case 8:
                            a1Var.y(k1Var.f);
                            break;
                        default:
                            a1Var.u(k1Var.i.d);
                            break;
                    }
                }
            });
            if (k1Var.f != null) {
                final int i20 = 8;
                this.m.c(10, new h2.o() { // from class: l2.s
                    @Override // h2.o
                    public final void invoke(Object obj8) {
                        e2.a1 a1Var = (e2.a1) obj8;
                        switch (i20) {
                            case 0:
                                k1 k1Var6 = k1Var;
                                a1Var.h(k1Var6.g);
                                a1Var.j(k1Var6.g);
                                break;
                            case 1:
                                k1 k1Var7 = k1Var;
                                a1Var.C(k1Var7.e, k1Var7.l);
                                break;
                            case 2:
                                a1Var.m(k1Var.e);
                                break;
                            case 3:
                                k1 k1Var8 = k1Var;
                                a1Var.k(k1Var8.m, k1Var8.l);
                                break;
                            case 4:
                                a1Var.g(k1Var.n);
                                break;
                            case 5:
                                a1Var.P(k1Var.m());
                                break;
                            case 6:
                                a1Var.H(k1Var.o);
                                break;
                            case 7:
                                a1Var.q(k1Var.f);
                                break;
                            case 8:
                                a1Var.y(k1Var.f);
                                break;
                            default:
                                a1Var.u(k1Var.i.d);
                                break;
                        }
                    }
                });
            }
        }
        a3.y yVar = k1Var2.i;
        a3.y yVar2 = k1Var.i;
        if (yVar != yVar2) {
            a3.x xVar = this.i;
            Object obj8 = yVar2.e;
            xVar.getClass();
            xVar.c = (a3.w) obj8;
            final int i21 = 9;
            this.m.c(2, new h2.o() { // from class: l2.s
                @Override // h2.o
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (i21) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.g);
                            a1Var.j(k1Var6.g);
                            break;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.e, k1Var7.l);
                            break;
                        case 2:
                            a1Var.m(k1Var.e);
                            break;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.m, k1Var8.l);
                            break;
                        case 4:
                            a1Var.g(k1Var.n);
                            break;
                        case 5:
                            a1Var.P(k1Var.m());
                            break;
                        case 6:
                            a1Var.H(k1Var.o);
                            break;
                        case 7:
                            a1Var.q(k1Var.f);
                            break;
                        case 8:
                            a1Var.y(k1Var.f);
                            break;
                        default:
                            a1Var.u(k1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (!z12) {
            this.m.c(14, new r(this.Q));
        }
        if (z16) {
            final int i22 = 0;
            this.m.c(3, new h2.o() { // from class: l2.s
                @Override // h2.o
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (i22) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.g);
                            a1Var.j(k1Var6.g);
                            break;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.e, k1Var7.l);
                            break;
                        case 2:
                            a1Var.m(k1Var.e);
                            break;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.m, k1Var8.l);
                            break;
                        case 4:
                            a1Var.g(k1Var.n);
                            break;
                        case 5:
                            a1Var.P(k1Var.m());
                            break;
                        case 6:
                            a1Var.H(k1Var.o);
                            break;
                        case 7:
                            a1Var.q(k1Var.f);
                            break;
                        case 8:
                            a1Var.y(k1Var.f);
                            break;
                        default:
                            a1Var.u(k1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z13 || z14) {
            final int i23 = 1;
            this.m.c(-1, new h2.o() { // from class: l2.s
                @Override // h2.o
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (i23) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.g);
                            a1Var.j(k1Var6.g);
                            break;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.e, k1Var7.l);
                            break;
                        case 2:
                            a1Var.m(k1Var.e);
                            break;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.m, k1Var8.l);
                            break;
                        case 4:
                            a1Var.g(k1Var.n);
                            break;
                        case 5:
                            a1Var.P(k1Var.m());
                            break;
                        case 6:
                            a1Var.H(k1Var.o);
                            break;
                        case 7:
                            a1Var.q(k1Var.f);
                            break;
                        case 8:
                            a1Var.y(k1Var.f);
                            break;
                        default:
                            a1Var.u(k1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z13) {
            final int i24 = 2;
            this.m.c(4, new h2.o() { // from class: l2.s
                @Override // h2.o
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (i24) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.g);
                            a1Var.j(k1Var6.g);
                            break;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.e, k1Var7.l);
                            break;
                        case 2:
                            a1Var.m(k1Var.e);
                            break;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.m, k1Var8.l);
                            break;
                        case 4:
                            a1Var.g(k1Var.n);
                            break;
                        case 5:
                            a1Var.P(k1Var.m());
                            break;
                        case 6:
                            a1Var.H(k1Var.o);
                            break;
                        case 7:
                            a1Var.q(k1Var.f);
                            break;
                        case 8:
                            a1Var.y(k1Var.f);
                            break;
                        default:
                            a1Var.u(k1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z14 || k1Var2.m != k1Var.m) {
            final int i25 = 3;
            this.m.c(5, new h2.o() { // from class: l2.s
                @Override // h2.o
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (i25) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.g);
                            a1Var.j(k1Var6.g);
                            break;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.e, k1Var7.l);
                            break;
                        case 2:
                            a1Var.m(k1Var.e);
                            break;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.m, k1Var8.l);
                            break;
                        case 4:
                            a1Var.g(k1Var.n);
                            break;
                        case 5:
                            a1Var.P(k1Var.m());
                            break;
                        case 6:
                            a1Var.H(k1Var.o);
                            break;
                        case 7:
                            a1Var.q(k1Var.f);
                            break;
                        case 8:
                            a1Var.y(k1Var.f);
                            break;
                        default:
                            a1Var.u(k1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (k1Var2.n != k1Var.n) {
            final int i26 = 4;
            this.m.c(6, new h2.o() { // from class: l2.s
                @Override // h2.o
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (i26) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.g);
                            a1Var.j(k1Var6.g);
                            break;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.e, k1Var7.l);
                            break;
                        case 2:
                            a1Var.m(k1Var.e);
                            break;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.m, k1Var8.l);
                            break;
                        case 4:
                            a1Var.g(k1Var.n);
                            break;
                        case 5:
                            a1Var.P(k1Var.m());
                            break;
                        case 6:
                            a1Var.H(k1Var.o);
                            break;
                        case 7:
                            a1Var.q(k1Var.f);
                            break;
                        case 8:
                            a1Var.y(k1Var.f);
                            break;
                        default:
                            a1Var.u(k1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (k1Var2.m() != k1Var.m()) {
            final int i27 = 5;
            this.m.c(7, new h2.o() { // from class: l2.s
                @Override // h2.o
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (i27) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.g);
                            a1Var.j(k1Var6.g);
                            break;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.e, k1Var7.l);
                            break;
                        case 2:
                            a1Var.m(k1Var.e);
                            break;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.m, k1Var8.l);
                            break;
                        case 4:
                            a1Var.g(k1Var.n);
                            break;
                        case 5:
                            a1Var.P(k1Var.m());
                            break;
                        case 6:
                            a1Var.H(k1Var.o);
                            break;
                        case 7:
                            a1Var.q(k1Var.f);
                            break;
                        case 8:
                            a1Var.y(k1Var.f);
                            break;
                        default:
                            a1Var.u(k1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (!k1Var2.o.equals(k1Var.o)) {
            final int i28 = 6;
            this.m.c(12, new h2.o() { // from class: l2.s
                @Override // h2.o
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (i28) {
                        case 0:
                            k1 k1Var6 = k1Var;
                            a1Var.h(k1Var6.g);
                            a1Var.j(k1Var6.g);
                            break;
                        case 1:
                            k1 k1Var7 = k1Var;
                            a1Var.C(k1Var7.e, k1Var7.l);
                            break;
                        case 2:
                            a1Var.m(k1Var.e);
                            break;
                        case 3:
                            k1 k1Var8 = k1Var;
                            a1Var.k(k1Var8.m, k1Var8.l);
                            break;
                        case 4:
                            a1Var.g(k1Var.n);
                            break;
                        case 5:
                            a1Var.P(k1Var.m());
                            break;
                        case 6:
                            a1Var.H(k1Var.o);
                            break;
                        case 7:
                            a1Var.q(k1Var.f);
                            break;
                        case 8:
                            a1Var.y(k1Var.f);
                            break;
                        default:
                            a1Var.u(k1Var.i.d);
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
                ((c0) it.next()).a.E1();
            }
        }
    }

    @Override // e2.c1
    public final e2.q1 E0() {
        F1();
        return ((a3.s) this.i).j();
    }

    public final void E1() {
        int i7 = i();
        ci.a aVar = this.A;
        h2.p0 p0Var = this.z;
        boolean z9 = false;
        if (i7 != 1) {
            if (i7 == 2 || i7 == 3) {
                F1();
                boolean z10 = this.p0.p;
                if (u() && !z10) {
                    z9 = true;
                }
                p0Var.b(z9);
                aVar.a(u());
                return;
            }
            if (i7 != 4) {
                throw new IllegalStateException();
            }
        }
        p0Var.b(false);
        aVar.a(false);
    }

    @Override // e2.c1
    public final float F() {
        F1();
        return this.b0;
    }

    @Override // e2.c1
    public final long F0() {
        F1();
        if (this.p0.a.p()) {
            return this.r0;
        }
        k1 k1Var = this.p0;
        long j3 = 0;
        if (k1Var.k.d != k1Var.b.d) {
            return h2.m0.h0(k1Var.a.m(o0(), (e2.k1) this.a, 0L).m);
        }
        long j10 = k1Var.q;
        if (this.p0.k.b()) {
            k1 k1Var2 = this.p0;
            k1Var2.a.g(k1Var2.k.a, this.o).d(this.p0.k.b);
        } else {
            j3 = j10;
        }
        k1 k1Var3 = this.p0;
        e2.l1 l1Var = k1Var3.a;
        Object obj = k1Var3.k.a;
        e2.i1 i1Var = this.o;
        l1Var.g(obj, i1Var);
        return h2.m0.h0(j3 + i1Var.e);
    }

    public final void F1() {
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = h2.m0.a;
            Locale locale = Locale.US;
            String m10 = org.telegram.ui.Cells.f1.m("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f0) {
                throw new IllegalStateException(m10);
            }
            h2.a.m("ExoPlayerImpl", m10, this.g0 ? null : new IllegalStateException());
            this.g0 = true;
        }
    }

    @Override // e2.c1
    public final void G0(int i7) {
        F1();
    }

    @Override // e2.c1
    public final e2.e H() {
        F1();
        return this.a0;
    }

    @Override // e2.c1
    public final void I0(e2.a1 a1Var) {
        a1Var.getClass();
        this.m.a(a1Var);
    }

    @Override // e2.c1
    public final void J(int i7, boolean z9) {
        F1();
    }

    @Override // e2.c1
    public final e2.o K() {
        F1();
        return this.j0;
    }

    @Override // e2.c1
    public final void K0(e2.o0 o0Var) {
        F1();
        o0Var.getClass();
        if (o0Var.equals(this.R)) {
            return;
        }
        this.R = o0Var;
        this.m.e(15, new v(this, 3));
    }

    @Override // e2.c1
    public final void L() {
        F1();
    }

    @Override // e2.c1
    public final void M(int i7, int i10) {
        F1();
    }

    @Override // e2.c1
    public final e2.o0 M0() {
        F1();
        return this.Q;
    }

    @Override // e2.c1
    public final void N(int i7) {
        F1();
    }

    @Override // e2.c1
    public final void N0(List list) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(-1, -9223372036854775807L, g12, true);
    }

    @Override // e2.c1
    public final int O() {
        F1();
        if (p()) {
            return this.p0.b.c;
        }
        return -1;
    }

    @Override // e2.c1
    public final long O0() {
        F1();
        return this.l0;
    }

    @Override // e2.c1
    public final void R(int i7, int i10) {
        F1();
        ia.f(i7 >= 0 && i10 >= i7);
        int size = this.p.size();
        int min = Math.min(i10, size);
        if (i7 >= size || i7 == min) {
            return;
        }
        k1 r12 = r1(this.p0, i7, min);
        D1(r12, 0, !r12.b.a.equals(this.p0.b.a), 4, j1(r12), -1, false);
    }

    @Override // e2.c1
    public final void S(SurfaceHolder surfaceHolder) {
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

    @Override // e2.c1
    public final void T(float f10) {
        F1();
        float h = h2.m0.h(f10, 0.0f, 1.0f);
        float f11 = this.b0;
        if (f11 == h) {
            return;
        }
        if (h != 0.0f) {
            f11 = h;
        }
        this.c0 = f11;
        this.b0 = h;
        this.l.n.b(32, Float.valueOf(h)).b();
        this.m.e(22, new t(h, 0));
    }

    @Override // e2.c1
    public final void V(List list, int i7, long j3) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(i7, j3, g12, false);
    }

    @Override // e2.c1
    public final e2.v0 W() {
        F1();
        return this.p0.f;
    }

    @Override // e2.c1
    public final void X(boolean z9) {
        F1();
        C1(1, z9);
    }

    @Override // bi.b1
    public final void X0() {
        boolean z9;
        h2.a.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.m0.a + "] [" + e2.m0.b() + "]");
        F1();
        this.y.y();
        this.z.b(false);
        this.A.a(false);
        h0 h0Var = this.E;
        if (h0Var != null && Build.VERSION.SDK_INT >= 34) {
            h0.a(h0Var);
        }
        h2.e0 e0Var = this.D;
        ((h2.i0) e0Var.f).a.removeCallbacksAndMessages(null);
        ((i0) e0Var.a).h0((h2.z) e0Var.b);
        r0 r0Var = this.l;
        if (r0Var.Z || !r0Var.s.getThread().isAlive()) {
            z9 = true;
        } else {
            r0Var.Z = true;
            h2.i iVar = new h2.i(r0Var.F);
            r0Var.n.b(7, iVar).b();
            z9 = iVar.c(r0Var.K);
        }
        if (!z9) {
            this.m.e(10, new x3(19));
        }
        this.m.d();
        this.j.a.removeCallbacksAndMessages(null);
        b3.d dVar = this.u;
        m2.e eVar = this.s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((b3.g) dVar).c.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            b3.c cVar = (b3.c) it.next();
            if (cVar.b == eVar) {
                cVar.c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        k1 k1Var = this.p0;
        if (k1Var.p) {
            this.p0 = k1Var.a();
        }
        k1 n1 = n1(this.p0, 1);
        this.p0 = n1;
        k1 c10 = n1.c(n1.b);
        this.p0 = c10;
        c10.q = c10.s;
        this.p0.r = 0L;
        m2.e eVar2 = this.s;
        h2.i0 i0Var = eVar2.n;
        i0Var.getClass();
        i0Var.d(new a0(eVar2, 8));
        s1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.e0 = g2.d.d;
        this.i0 = true;
    }

    @Override // bi.b1
    public final void Y0(int i7, long j3, boolean z9) {
        F1();
        if (i7 == -1) {
            return;
        }
        ia.f(i7 >= 0);
        e2.l1 l1Var = this.p0.a;
        if (l1Var.p() || i7 < l1Var.o()) {
            m2.e eVar = this.s;
            if (!eVar.r) {
                m2.a Q = eVar.Q();
                eVar.r = true;
                eVar.V(Q, -1, new x(Q, 14));
            }
            this.J++;
            if (p()) {
                h2.a.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                o0 o0Var = new o0(this.p0);
                o0Var.f(1);
                i0 i0Var = this.k.b;
                i0Var.j.d(new ha.b(23, i0Var, o0Var));
                return;
            }
            k1 k1Var = this.p0;
            int i10 = k1Var.e;
            if (i10 == 3 || (i10 == 4 && !l1Var.p())) {
                k1Var = this.p0.h(2);
            }
            int o02 = o0();
            k1 o12 = o1(k1Var, l1Var, p1(l1Var, i7, j3));
            this.l.n.b(3, new q0(l1Var, i7, h2.m0.S(j3))).b();
            D1(o12, 0, true, 1, j1(o12), o02, z9);
        }
    }

    @Override // e2.c1
    public final long Z() {
        F1();
        return this.m0;
    }

    @Override // e2.c1
    public final void a() {
        F1();
        k1 k1Var = this.p0;
        if (k1Var.e != 1) {
            return;
        }
        k1 f10 = k1Var.f(null);
        k1 n1 = n1(f10, f10.a.p() ? 4 : 2);
        this.J++;
        this.l.n.a(29).b();
        D1(n1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // e2.c1
    public final long a0() {
        F1();
        return i1(this.p0);
    }

    @Override // e2.c1
    public final void b0(int i7, List list) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        ia.f(i7 >= 0);
        int min = Math.min(i7, this.p.size());
        if (!this.p0.a.p()) {
            D1(e1(this.p0, min, g12), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z9 = this.q0 == -1;
        F1();
        v1(-1, -9223372036854775807L, g12, z9);
    }

    @Override // e2.c1
    public final void c0() {
        F1();
        if (this.b0 == 0.0f) {
            float f10 = this.c0;
            if (f10 != 0.0f) {
                T(f10);
            }
        }
    }

    @Override // e2.c1
    public final long d0() {
        F1();
        if (!p()) {
            return F0();
        }
        k1 k1Var = this.p0;
        return k1Var.k.equals(k1Var.b) ? h2.m0.h0(this.p0.q) : getDuration();
    }

    @Override // e2.c1
    public final void e(e2.w0 w0Var) {
        F1();
        if (this.p0.o.equals(w0Var)) {
            return;
        }
        k1 g10 = this.p0.g(w0Var);
        this.J++;
        this.l.n.b(4, w0Var).b();
        D1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final k1 e1(k1 k1Var, int i7, ArrayList arrayList) {
        e2.l1 l1Var = k1Var.a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.p;
            if (i10 >= size) {
                this.O = this.O.f(i7, arrayList2.size());
                p1 p1Var = new p1(arrayList3, this.O);
                k1 o12 = o1(k1Var, p1Var, l1(l1Var, p1Var, k1(k1Var), i1(k1Var)));
                x2.g1 g1Var = this.O;
                h2.i0 i0Var = this.l.n;
                m0 m0Var = new m0(arrayList2, g1Var, -1, -9223372036854775807L);
                i0Var.getClass();
                h2.h0 c10 = h2.i0.c();
                c10.a = i0Var.a.obtainMessage(18, i7, 0, m0Var);
                c10.b();
                return o12;
            }
            i1 i1Var = new i1((x2.a) arrayList.get(i10), this.q);
            arrayList2.add(i1Var);
            arrayList3.add(i10 + i7, new e0(i1Var.b, i1Var.a));
            i10++;
        }
    }

    public final e2.o0 f1() {
        e2.l1 y02 = y0();
        if (y02.p()) {
            return this.o0;
        }
        e2.l0 l0Var = y02.m(o0(), (e2.k1) this.a, 0L).c;
        e2.n0 a10 = this.o0.a();
        e2.o0 o0Var = l0Var.d;
        if (o0Var != null) {
            h9.i0 i0Var = o0Var.K;
            byte[] bArr = o0Var.k;
            CharSequence charSequence = o0Var.a;
            if (charSequence != null) {
                a10.a = charSequence;
            }
            CharSequence charSequence2 = o0Var.b;
            if (charSequence2 != null) {
                a10.b = charSequence2;
            }
            CharSequence charSequence3 = o0Var.c;
            if (charSequence3 != null) {
                a10.c = charSequence3;
            }
            CharSequence charSequence4 = o0Var.d;
            if (charSequence4 != null) {
                a10.d = charSequence4;
            }
            CharSequence charSequence5 = o0Var.e;
            if (charSequence5 != null) {
                a10.e = charSequence5;
            }
            CharSequence charSequence6 = o0Var.f;
            if (charSequence6 != null) {
                a10.f = charSequence6;
            }
            CharSequence charSequence7 = o0Var.g;
            if (charSequence7 != null) {
                a10.g = charSequence7;
            }
            Long l10 = o0Var.h;
            if (l10 != null) {
                ia.f(l10.longValue() >= 0);
                a10.h = l10;
            }
            e2.d1 d1Var = o0Var.i;
            if (d1Var != null) {
                a10.i = d1Var;
            }
            e2.d1 d1Var2 = o0Var.j;
            if (d1Var2 != null) {
                a10.j = d1Var2;
            }
            Uri uri = o0Var.n;
            if (uri != null || bArr != null) {
                a10.n = uri;
                a10.b(bArr, o0Var.m);
                a10.l = o0Var.l;
            }
            Integer num = o0Var.o;
            if (num != null) {
                a10.o = num;
            }
            Integer num2 = o0Var.p;
            if (num2 != null) {
                a10.p = num2;
            }
            Integer num3 = o0Var.q;
            if (num3 != null) {
                a10.q = num3;
            }
            Boolean bool = o0Var.r;
            if (bool != null) {
                a10.r = bool;
            }
            Boolean bool2 = o0Var.s;
            if (bool2 != null) {
                a10.s = bool2;
            }
            Integer num4 = o0Var.t;
            if (num4 != null) {
                a10.t = num4;
            }
            Integer num5 = o0Var.u;
            if (num5 != null) {
                a10.t = num5;
            }
            Integer num6 = o0Var.v;
            if (num6 != null) {
                a10.u = num6;
            }
            Integer num7 = o0Var.w;
            if (num7 != null) {
                a10.v = num7;
            }
            Integer num8 = o0Var.x;
            if (num8 != null) {
                a10.w = num8;
            }
            Integer num9 = o0Var.y;
            if (num9 != null) {
                a10.x = num9;
            }
            Integer num10 = o0Var.z;
            if (num10 != null) {
                a10.y = num10;
            }
            CharSequence charSequence8 = o0Var.A;
            if (charSequence8 != null) {
                a10.z = charSequence8;
            }
            CharSequence charSequence9 = o0Var.B;
            if (charSequence9 != null) {
                a10.A = charSequence9;
            }
            CharSequence charSequence10 = o0Var.C;
            if (charSequence10 != null) {
                a10.B = charSequence10;
            }
            Integer num11 = o0Var.D;
            if (num11 != null) {
                a10.C = num11;
            }
            Integer num12 = o0Var.E;
            if (num12 != null) {
                a10.D = num12;
            }
            CharSequence charSequence11 = o0Var.F;
            if (charSequence11 != null) {
                a10.E = charSequence11;
            }
            CharSequence charSequence12 = o0Var.G;
            if (charSequence12 != null) {
                a10.F = charSequence12;
            }
            CharSequence charSequence13 = o0Var.H;
            if (charSequence13 != null) {
                a10.G = charSequence13;
            }
            Integer num13 = o0Var.I;
            if (num13 != null) {
                a10.H = num13;
            }
            Bundle bundle = o0Var.J;
            if (bundle != null) {
                a10.I = bundle;
            }
            if (!i0Var.isEmpty()) {
                a10.J = h9.i0.q(i0Var);
            }
        }
        return new e2.o0(a10);
    }

    @Override // e2.c1
    public final boolean g() {
        F1();
        return this.p0.g;
    }

    public final ArrayList g1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            arrayList.add(this.r.b((e2.l0) list.get(i7)));
        }
        return arrayList;
    }

    @Override // e2.c1
    public final long getDuration() {
        F1();
        if (!p()) {
            return A();
        }
        k1 k1Var = this.p0;
        x2.f0 f0Var = k1Var.b;
        e2.l1 l1Var = k1Var.a;
        Object obj = f0Var.a;
        e2.i1 i1Var = this.o;
        l1Var.g(obj, i1Var);
        return h2.m0.h0(i1Var.a(f0Var.b, f0Var.c));
    }

    @Override // e2.c1
    public final void h0(e2.a1 a1Var) {
        F1();
        a1Var.getClass();
        h2.r rVar = this.m;
        if (rVar.i) {
            ia.p(Thread.currentThread() == rVar.a);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = rVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            h2.q qVar = (h2.q) it.next();
            if (qVar.a.equals(a1Var)) {
                h2.p pVar = rVar.c;
                qVar.d = true;
                if (pVar != null && qVar.c) {
                    qVar.c = false;
                    pVar.h(qVar.a, qVar.b.d());
                }
                copyOnWriteArraySet.remove(qVar);
            }
        }
    }

    public final n1 h1(m1 m1Var) {
        int k12 = k1(this.p0);
        e2.l1 l1Var = this.p0.a;
        if (k12 == -1) {
            k12 = 0;
        }
        r0 r0Var = this.l;
        return new n1(r0Var, m1Var, l1Var, k12, r0Var.s);
    }

    @Override // e2.c1
    public final int i() {
        F1();
        return this.p0.e;
    }

    @Override // e2.c1
    public final void i0(int i7) {
        F1();
    }

    public final long i1(k1 k1Var) {
        x2.f0 f0Var = k1Var.b;
        long j3 = k1Var.c;
        e2.l1 l1Var = k1Var.a;
        if (!f0Var.b()) {
            return h2.m0.h0(j1(k1Var));
        }
        Object obj = k1Var.b.a;
        e2.i1 i1Var = this.o;
        l1Var.g(obj, i1Var);
        if (j3 == -9223372036854775807L) {
            return h2.m0.h0(l1Var.m(k1(k1Var), (e2.k1) this.a, 0L).l);
        }
        return h2.m0.h0(j3) + h2.m0.h0(i1Var.e);
    }

    @Override // e2.c1
    public final e2.w0 j() {
        F1();
        return this.p0.o;
    }

    @Override // e2.c1
    public final e2.s1 j0() {
        F1();
        return this.p0.i.d;
    }

    public final long j1(k1 k1Var) {
        if (k1Var.a.p()) {
            return h2.m0.S(this.r0);
        }
        long l10 = k1Var.p ? k1Var.l() : k1Var.s;
        if (k1Var.b.b()) {
            return l10;
        }
        e2.l1 l1Var = k1Var.a;
        Object obj = k1Var.b.a;
        e2.i1 i1Var = this.o;
        l1Var.g(obj, i1Var);
        return l10 + i1Var.e;
    }

    @Override // e2.c1
    public final void k(int i7) {
        F1();
        if (this.H != i7) {
            this.H = i7;
            h2.i0 i0Var = this.l.n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.a = i0Var.a.obtainMessage(11, i7, 0);
            c10.b();
            u uVar = new u(i7, 0);
            h2.r rVar = this.m;
            rVar.c(8, uVar);
            B1();
            rVar.b();
        }
    }

    @Override // e2.c1
    public final e2.o0 k0() {
        F1();
        return this.R;
    }

    public final int k1(k1 k1Var) {
        return k1Var.a.p() ? this.q0 : k1Var.a.g(k1Var.b.a, this.o).c;
    }

    @Override // e2.c1
    public final long l() {
        F1();
        return h2.m0.h0(j1(this.p0));
    }

    @Override // e2.c1
    public final g2.d l0() {
        F1();
        return this.e0;
    }

    public final Pair l1(e2.l1 l1Var, p1 p1Var, int i7, long j3) {
        if (l1Var.p() || p1Var.p()) {
            boolean z9 = !l1Var.p() && p1Var.p();
            return p1(p1Var, z9 ? -1 : i7, z9 ? -9223372036854775807L : j3);
        }
        Pair i10 = l1Var.i((e2.k1) this.a, this.o, i7, h2.m0.S(j3));
        Object obj = i10.first;
        if (p1Var.b(obj) != -1) {
            return i10;
        }
        int U = r0.U((e2.k1) this.a, this.o, this.H, this.I, obj, l1Var, p1Var);
        if (U == -1) {
            return p1(p1Var, -1, -9223372036854775807L);
        }
        e2.k1 k1Var = (e2.k1) this.a;
        p1Var.m(U, k1Var, 0L);
        return p1(p1Var, U, h2.m0.h0(k1Var.l));
    }

    @Override // e2.c1
    public final int m() {
        F1();
        return this.H;
    }

    @Override // e2.c1
    public final int n() {
        F1();
        return 0;
    }

    @Override // e2.c1
    public final int n0() {
        F1();
        if (p()) {
            return this.p0.b.b;
        }
        return -1;
    }

    @Override // e2.c1
    public final int o0() {
        F1();
        int k12 = k1(this.p0);
        if (k12 == -1) {
            return 0;
        }
        return k12;
    }

    public final k1 o1(k1 k1Var, e2.l1 l1Var, Pair pair) {
        List list;
        ia.f(l1Var.p() || pair != null);
        e2.l1 l1Var2 = k1Var.a;
        long i12 = i1(k1Var);
        k1 j3 = k1Var.j(l1Var);
        if (l1Var.p()) {
            x2.f0 f0Var = k1.u;
            long S = h2.m0.S(this.r0);
            k1 c10 = j3.d(f0Var, S, S, S, 0L, x2.p1.d, this.b, h9.t1.e).c(f0Var);
            c10.q = c10.s;
            return c10;
        }
        Object obj = j3.b.a;
        String str = h2.m0.a;
        boolean equals = obj.equals(pair.first);
        x2.f0 f0Var2 = !equals ? new x2.f0(pair.first) : j3.b;
        long longValue = ((Long) pair.second).longValue();
        long S2 = h2.m0.S(i12);
        if (!l1Var2.p()) {
            S2 -= l1Var2.g(obj, this.o).e;
            if (equals && S2 - longValue == 1 && S2 == l1Var2.g(obj, this.o).d) {
                S2--;
            }
        }
        if (!equals || longValue < S2) {
            x2.f0 f0Var3 = f0Var2;
            ia.p(!f0Var3.b());
            x2.p1 p1Var = !equals ? x2.p1.d : j3.h;
            a3.y yVar = !equals ? this.b : j3.i;
            if (equals) {
                list = j3.j;
            } else {
                h9.g0 g0Var = h9.i0.b;
                list = h9.t1.e;
            }
            k1 c11 = j3.d(f0Var3, longValue, longValue, longValue, 0L, p1Var, yVar, list).c(f0Var3);
            c11.q = longValue;
            return c11;
        }
        if (longValue != S2) {
            x2.f0 f0Var4 = f0Var2;
            ia.p(!f0Var4.b());
            long max = Math.max(0L, j3.r - (longValue - S2));
            long j10 = j3.q;
            if (j3.k.equals(j3.b)) {
                j10 = longValue + max;
            }
            k1 d = j3.d(f0Var4, longValue, longValue, longValue, max, j3.h, j3.i, j3.j);
            d.q = j10;
            return d;
        }
        int b10 = l1Var.b(j3.k.a);
        if (b10 != -1 && l1Var.f(b10, this.o, false).c == l1Var.g(f0Var2.a, this.o).c) {
            return j3;
        }
        l1Var.g(f0Var2.a, this.o);
        long a10 = f0Var2.b() ? this.o.a(f0Var2.b, f0Var2.c) : this.o.d;
        x2.f0 f0Var5 = f0Var2;
        k1 c12 = j3.d(f0Var5, j3.s, j3.s, j3.d, a10 - j3.s, j3.h, j3.i, j3.j).c(f0Var5);
        c12.q = a10;
        return c12;
    }

    @Override // e2.c1
    public final boolean p() {
        F1();
        return this.p0.b.b();
    }

    public final Pair p1(e2.l1 l1Var, int i7, long j3) {
        if (l1Var.p()) {
            this.q0 = i7;
            if (j3 == -9223372036854775807L) {
                j3 = 0;
            }
            this.r0 = j3;
            return null;
        }
        if (i7 == -1 || i7 >= l1Var.o()) {
            i7 = l1Var.a(this.I);
            j3 = h2.m0.h0(l1Var.m(i7, (e2.k1) this.a, 0L).l);
        }
        return l1Var.i((e2.k1) this.a, this.o, i7, h2.m0.S(j3));
    }

    @Override // e2.c1
    public final void q0(e2.q1 q1Var) {
        F1();
        a3.x xVar = this.i;
        xVar.getClass();
        e2.q1 E0 = E0();
        if (!q1Var.equals(((a3.s) xVar).j())) {
            xVar.b(q1Var);
        }
        if (E0.equals(q1Var)) {
            return;
        }
        this.m.e(19, new r4(q1Var, 29));
    }

    public final void q1(int i7, int i10) {
        h2.y yVar = this.Z;
        if (i7 == yVar.a && i10 == yVar.b) {
            return;
        }
        this.Z = new h2.y(i7, i10);
        l51 l51Var = this.s0;
        if (l51Var != null) {
            l51Var.execute(new jg.r(this, i7, i10, 1));
            return;
        }
        this.m.e(24, new gh.c(i7, i10, 1));
        t1(2, 14, new h2.y(i7, i10));
    }

    @Override // e2.c1
    public final long r() {
        F1();
        return h2.m0.h0(this.p0.r);
    }

    @Override // e2.c1
    public final void r0(boolean z9) {
        F1();
    }

    public final k1 r1(k1 k1Var, int i7, int i10) {
        ArrayList arrayList;
        int k12 = k1(k1Var);
        long i12 = i1(k1Var);
        e2.l1 l1Var = k1Var.a;
        this.J++;
        int i11 = i10 - 1;
        while (true) {
            arrayList = this.p;
            if (i11 < i7) {
                break;
            }
            arrayList.remove(i11);
            i11--;
        }
        this.O = this.O.a(i7, i10);
        p1 p1Var = new p1(arrayList, this.O);
        k1 o12 = o1(k1Var, p1Var, l1(l1Var, p1Var, k12, i12));
        int i13 = o12.e;
        if (i13 != 1 && i13 != 4 && k12 >= i7 && k12 < i10) {
            if (r0.U((e2.k1) this.a, this.o, this.H, this.I, k1Var.b.a, l1Var, p1Var) == -1) {
                o12 = n1(o12, 4);
            }
        }
        x2.g1 g1Var = this.O;
        h2.i0 i0Var = this.l.n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.a = i0Var.a.obtainMessage(20, i7, i10, g1Var);
        c10.b();
        return o12;
    }

    @Override // e2.c1
    public final void s0(List list, int i7, int i10) {
        F1();
        ia.f(i7 >= 0 && i10 >= i7);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        if (i7 > size) {
            return;
        }
        int min = Math.min(i10, size);
        if (min - i7 == list.size()) {
            for (int i11 = i7; i11 < min; i11++) {
                if (((e0) arrayList.get(i11)).b.k.a((e2.l0) list.get(i11 - i7))) {
                }
            }
            this.J++;
            h2.i0 i0Var = this.l.n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.a = i0Var.a.obtainMessage(27, i7, min, list);
            c10.b();
            for (int i12 = i7; i12 < min; i12++) {
                e0 e0Var = (e0) arrayList.get(i12);
                e2.l1 l1Var = e0Var.c;
                e2.l0 l0Var = (e2.l0) list.get(i12 - i7);
                e0Var.c = l1Var instanceof x2.o1 ? new x2.o1(((x2.o1) l1Var).e, l0Var) : new x2.o1(l1Var, l0Var);
            }
            D1(this.p0.j(new p1(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList g12 = g1(list);
        if (!this.p0.a.p()) {
            k1 r12 = r1(e1(this.p0, min, g12), i7, min);
            D1(r12, 0, !r12.b.a.equals(this.p0.b.a), 4, j1(r12), -1, false);
        } else {
            boolean z9 = this.q0 == -1;
            F1();
            v1(-1, -9223372036854775807L, g12, z9);
        }
    }

    public final void s1() {
        TextureView textureView = this.X;
        c0 c0Var = this.w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != c0Var) {
                h2.a.l("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
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

    @Override // bi.b1, e2.c1
    public final void stop() {
        F1();
        A1(null);
        this.e0 = new g2.d(this.p0.s, h9.t1.e);
    }

    @Override // e2.c1
    public final e2.y0 t() {
        F1();
        return this.P;
    }

    public final void t1(int i7, int i10, Object obj) {
        for (b bVar : this.g) {
            if (i7 == -1 || bVar.b == i7) {
                n1 h12 = h1(bVar);
                ia.p(!h12.f);
                h12.c = i10;
                ia.p(!h12.f);
                h12.d = obj;
                h12.b();
            }
        }
        for (b bVar2 : this.h) {
            if (bVar2 != null && (i7 == -1 || bVar2.b == i7)) {
                n1 h13 = h1(bVar2);
                ia.p(!h13.f);
                h13.c = i10;
                ia.p(!h13.f);
                h13.d = obj;
                h13.b();
            }
        }
    }

    @Override // e2.c1
    public final boolean u() {
        F1();
        return this.p0.l;
    }

    @Override // e2.c1
    public final void u0(int i7, int i10, int i11) {
        F1();
        ia.f(i7 >= 0 && i7 <= i10 && i11 >= 0);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int min = Math.min(i10, size);
        int min2 = Math.min(i11, size - (min - i7));
        if (i7 >= size || i7 == min || i7 == min2) {
            return;
        }
        e2.l1 y02 = y0();
        this.J++;
        h2.m0.R(i7, min, min2, arrayList);
        this.O = this.O.g();
        p1 p1Var = new p1(arrayList, this.O);
        k1 k1Var = this.p0;
        k1 o12 = o1(k1Var, p1Var, l1(y02, p1Var, k1(k1Var), i1(this.p0)));
        x2.g1 g1Var = this.O;
        r0 r0Var = this.l;
        r0Var.getClass();
        r0Var.n.b(19, new n0(i7, min, min2, g1Var)).b();
        D1(o12, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void u1(x2.a aVar, boolean z9) {
        F1();
        List singletonList = Collections.singletonList(aVar);
        F1();
        v1(-1, -9223372036854775807L, singletonList, z9);
    }

    public final void v1(int i7, long j3, List list, boolean z9) {
        int i10;
        long j10;
        int k12 = k1(this.p0);
        long l10 = l();
        this.J++;
        ArrayList arrayList = this.p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            i1 i1Var = new i1((x2.a) list.get(i11), this.q);
            arrayList2.add(i1Var);
            arrayList.add(i11, new e0(i1Var.b, i1Var.a));
        }
        this.O = this.O.c(arrayList2.size());
        p1 p1Var = new p1(arrayList, this.O);
        boolean p10 = p1Var.p();
        int i12 = p1Var.h;
        if (!p10 && i7 >= i12) {
            throw new be.n();
        }
        if (z9) {
            j10 = -9223372036854775807L;
            i10 = p1Var.a(this.I);
        } else if (i7 == -1) {
            i10 = k12;
            j10 = l10;
        } else {
            i10 = i7;
            j10 = j3;
        }
        k1 o12 = o1(this.p0, p1Var, p1(p1Var, i10, j10));
        int i13 = o12.e;
        if (i13 == 1) {
            i13 = 1;
        } else {
            if (!p1Var.p()) {
                if (i10 != -1) {
                    if (i10 < i12) {
                        i13 = 2;
                    }
                }
            }
            i13 = 4;
        }
        k1 n1 = n1(o12, i13);
        this.l.n.b(17, new m0(arrayList2, this.O, i10, h2.m0.S(j10))).b();
        D1(n1, 0, (this.p0.b.a.equals(n1.b.a) || this.p0.a.p()) ? false : true, 4, j1(n1), -1, false);
    }

    @Override // e2.c1
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

    @Override // e2.c1
    public final void x(boolean z9) {
        F1();
        if (this.I != z9) {
            this.I = z9;
            h2.i0 i0Var = this.l.n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.a = i0Var.a.obtainMessage(12, z9 ? 1 : 0, 0);
            c10.b();
            w wVar = new w(0, z9);
            h2.r rVar = this.m;
            rVar.c(9, wVar);
            B1();
            rVar.b();
        }
    }

    public final void x1(Surface surface) {
        Object obj = this.T;
        boolean z9 = true;
        boolean z10 = (obj == null || obj == surface) ? false : true;
        long j3 = z10 ? this.B : -9223372036854775807L;
        r0 r0Var = this.l;
        if (!r0Var.Z && r0Var.s.getThread().isAlive()) {
            h2.i iVar = new h2.i(r0Var.F);
            r0Var.n.b(30, new Pair(surface, iVar)).b();
            if (j3 != -9223372036854775807L) {
                z9 = iVar.c(j3);
            }
        }
        if (z10) {
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
        if (z9) {
            return;
        }
        A1(new l(2, new androidx.car.app.j("Detaching surface timed out."), 1003));
    }

    @Override // e2.c1
    public final e2.l1 y0() {
        F1();
        return this.p0.a;
    }

    public final void y1(Surface surface) {
        F1();
        s1();
        x1(surface);
        int i7 = surface == null ? 0 : -1;
        q1(i7, i7);
    }

    @Override // e2.c1
    public final long z() {
        F1();
        return this.n0;
    }

    @Override // e2.c1
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
            h2.a.l("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
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
