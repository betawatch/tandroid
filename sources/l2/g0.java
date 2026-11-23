package l2;

import a8.ma;
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
import e2.s1;
import e2.x1;
import hi.z9;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.telegram.ui.Components.a61;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class g0 extends com.google.android.gms.common.api.q implements q {
    public final ei.a A;
    public final long B;
    public final h2.c C;
    public final h2.e0 D;
    public final f0 E;
    public final j6.k F;
    public final j6.k G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public final p1 M;
    public q1 N;
    public x2.i1 O;
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
    public g2.c e0;
    public final g0 f;
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
    public final p0 l;
    public final long l0;
    public final h2.r m;
    public final long m0;
    public final CopyOnWriteArraySet n;
    public final long n0;
    public final e2.i1 o;
    public e2.o0 o0;
    public final ArrayList p;
    public h1 p0;
    public final boolean q;
    public int q0;
    public final x2.f0 r;
    public long r0;
    public final m2.d s;
    public a61 s0;
    public final Looper t;
    public final ArrayList t0;
    public final b3.d u;
    public final h2.g0 v;
    public final a0 w;
    public final b0 x;
    public final ab.q y;
    public final h2.o0 z;

    static {
        e2.m0.a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x035e A[Catch: all -> 0x00b8, TryCatch #1 {all -> 0x00b8, blocks: (B:3:0x001f, B:6:0x009e, B:7:0x00a7, B:9:0x00ad, B:11:0x00bb, B:13:0x0150, B:15:0x0160, B:16:0x0184, B:18:0x018c, B:20:0x019b, B:21:0x026b, B:23:0x0271, B:30:0x027b, B:33:0x0284, B:40:0x02b0, B:47:0x02b8, B:49:0x0310, B:51:0x0314, B:53:0x0318, B:57:0x0320, B:60:0x0333, B:62:0x035e, B:63:0x0363, B:67:0x032c), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x032c A[Catch: all -> 0x00b8, TryCatch #1 {all -> 0x00b8, blocks: (B:3:0x001f, B:6:0x009e, B:7:0x00a7, B:9:0x00ad, B:11:0x00bb, B:13:0x0150, B:15:0x0160, B:16:0x0184, B:18:0x018c, B:20:0x019b, B:21:0x026b, B:23:0x0271, B:30:0x027b, B:33:0x0284, B:40:0x02b0, B:47:0x02b8, B:49:0x0310, B:51:0x0314, B:53:0x0318, B:57:0x0320, B:60:0x0333, B:62:0x035e, B:63:0x0363, B:67:0x032c), top: B:2:0x001f }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.common.api.q, java.lang.Object, l2.g0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, l2.g0] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g0(o oVar) {
        g0 g0Var;
        boolean z10;
        h2.o0 o0Var;
        ?? qVar = new com.google.android.gms.common.api.q(2);
        qVar.t0 = new ArrayList();
        qVar.d = new h2.i();
        try {
            h2.a.g("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(qVar)) + " [AndroidXMedia3/1.10.1] [" + h2.l0.a + "]");
            Context context = oVar.a;
            h2.g0 g0Var2 = oVar.b;
            qVar.e = context.getApplicationContext();
            qVar.s = new m2.d(g0Var2);
            qVar.h0 = oVar.i;
            qVar.a0 = oVar.j;
            qVar.Y = oVar.k;
            qVar.d0 = false;
            qVar.B = oVar.t;
            a0 a0Var = new a0(qVar);
            qVar.w = a0Var;
            qVar.x = new b0();
            b[] b10 = ((k) oVar.c.get()).b(new Handler(oVar.h), a0Var, a0Var, a0Var, a0Var);
            qVar.g = b10;
            ma.p(b10.length > 0);
            qVar.h = new b[b10.length];
            int i7 = 0;
            while (true) {
                b[] bVarArr = qVar.h;
                if (i7 >= bVarArr.length) {
                    break;
                }
                int i10 = qVar.g[i7].b;
                bVarArr[i7] = null;
                i7++;
            }
            a3.x xVar = (a3.x) oVar.e.get();
            qVar.i = xVar;
            qVar.r = (x2.f0) oVar.d.get();
            b3.g c10 = b3.g.c(oVar.g.b);
            qVar.u = c10;
            qVar.q = oVar.l;
            qVar.N = oVar.m;
            qVar.l0 = oVar.o;
            qVar.m0 = oVar.p;
            qVar.n0 = oVar.q;
            qVar.M = oVar.n;
            Looper looper = oVar.h;
            qVar.t = looper;
            qVar.v = g0Var2;
            qVar.f = qVar;
            qVar.m = new h2.r(new CopyOnWriteArraySet(), looper, looper.getThread(), g0Var2, new z9(qVar, 25), true);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            qVar.n = copyOnWriteArraySet;
            qVar.p = new ArrayList();
            qVar.O = new x2.g1();
            b[] bVarArr2 = qVar.g;
            a3.y yVar = new a3.y(new n1[bVarArr2.length], new a3.u[bVarArr2.length], s1.b, null);
            qVar.b = yVar;
            qVar.o = new e2.i1();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (int i11 : new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32}) {
                ma.p(!false);
                sparseBooleanArray.append(i11, true);
            }
            xVar.getClass();
            ma.p(!false);
            sparseBooleanArray.append(29, true);
            ma.p(!false);
            e2.s sVar = new e2.s(sparseBooleanArray);
            qVar.c = new e2.y0(sVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i12 = 0; i12 < sVar.a.size(); i12++) {
                int a10 = sVar.a(i12);
                ma.p(!false);
                sparseBooleanArray2.append(a10, true);
            }
            ma.p(!false);
            sparseBooleanArray2.append(4, true);
            ma.p(!false);
            sparseBooleanArray2.append(10, true);
            ma.p(!false);
            qVar.P = new e2.y0(new e2.s(sparseBooleanArray2));
            qVar.j = g0Var2.a(looper, null);
            v vVar = new v(qVar, 0);
            qVar.k = vVar;
            qVar.p0 = h1.k(yVar);
            qVar.s.W(qVar, looper);
            m2.i iVar = new m2.i(oVar.A);
            p0 p0Var = new p0(qVar.e, qVar.g, qVar.h, xVar, yVar, (r0) oVar.f.get(), c10, qVar.H, qVar.I, qVar.s, qVar.N, oVar.r, oVar.s, looper, g0Var2, vVar, iVar, qVar.x, oVar.B);
            Looper looper2 = p0Var.s;
            h2.i0 i0Var = p0Var.n;
            qVar.l = p0Var;
            qVar.b0 = 1.0f;
            qVar.H = 0;
            e2.o0 o0Var2 = e2.o0.L;
            qVar.Q = o0Var2;
            qVar.R = o0Var2;
            qVar.o0 = o0Var2;
            qVar.q0 = -1;
            qVar.e0 = g2.c.d;
            qVar.f0 = true;
            qVar.J0(qVar.s);
            Handler handler = new Handler(looper);
            m2.d dVar = qVar.s;
            c10.getClass();
            dVar.getClass();
            cb.c cVar = c10.c;
            cVar.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) cVar.b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                b3.c cVar2 = (b3.c) it.next();
                if (cVar2.b == dVar) {
                    cVar2.c = true;
                    copyOnWriteArrayList.remove(cVar2);
                }
            }
            int i13 = 1;
            copyOnWriteArrayList.add(new b3.c(handler, dVar));
            copyOnWriteArraySet.add(qVar.w);
            int i14 = Build.VERSION.SDK_INT;
            qVar = qVar;
            if (i14 >= 31) {
                try {
                    Context context2 = qVar.e;
                    boolean z11 = oVar.y;
                    h2.i0 a11 = g0Var2.a(looper2, null);
                    aa.c0 c0Var = new aa.c0(context2, z11, (Object) qVar, iVar, 6);
                    qVar = qVar;
                    a11.d(c0Var);
                } catch (Throwable th2) {
                    th = th2;
                    g0Var = qVar;
                    g0Var.d.e();
                    throw th;
                }
            }
            v vVar2 = new v(qVar, i13);
            h2.c cVar3 = new h2.c();
            cVar3.b = g0Var2.a(looper2, null);
            cVar3.c = g0Var2.a(looper, null);
            cVar3.e = 0;
            cVar3.f = 0;
            cVar3.d = vVar2;
            qVar.C = cVar3;
            cVar3.A(new kg.i0((Object) qVar, 16));
            Context context3 = oVar.a;
            Looper looper3 = oVar.h;
            a0 a0Var2 = qVar.w;
            ab.q qVar2 = new ab.q();
            qVar2.b = context3.getApplicationContext();
            qVar2.d = g0Var2.a(looper2, null);
            qVar2.c = new f2.b(qVar2, g0Var2.a(looper3, null), a0Var2);
            qVar.y = qVar2;
            qVar2.A();
            if (oVar.u != Integer.MAX_VALUE && oVar.v != Integer.MAX_VALUE && oVar.w != Integer.MAX_VALUE && oVar.x != Integer.MAX_VALUE) {
                z10 = true;
                o0Var = new h2.o0(context, looper2, g0Var2);
                qVar.z = o0Var;
                if (o0Var.b == z10) {
                    o0Var.b = z10;
                    o0Var.a(z10, o0Var.c);
                }
                ei.a aVar = new ei.a();
                new sa.d(context.getApplicationContext());
                g0Var2.a(looper2, null);
                g0Var2.a(Looper.getMainLooper(), null);
                qVar.A = aVar;
                qVar.j0 = e2.o.c;
                qVar.k0 = x1.d;
                qVar.Z = h2.y.c;
                qVar.E = i14 >= 34 ? new f0(qVar, context) : null;
                qVar.F = new j6.k(2);
                qVar.G = new j6.k(2);
                qVar.D = new h2.e0(qVar, qVar.w, qVar.v, oVar.u, oVar.v, oVar.w, oVar.x);
                i0Var.b(38, qVar.M).b();
                e2.e eVar = qVar.a0;
                i0Var.getClass();
                h2.h0 c11 = h2.i0.c();
                c11.a = i0Var.a.obtainMessage(31, 0, 0, eVar);
                c11.b();
                qVar.t1(1, 3, qVar.a0);
                qVar.t1(2, 4, Integer.valueOf(qVar.Y));
                qVar.t1(2, 5, 0);
                qVar.t1(1, 9, Boolean.valueOf(qVar.d0));
                qVar.t1(6, 8, qVar.x);
                qVar.t1(-1, 16, Integer.valueOf(qVar.h0));
                qVar.d.e();
            }
            z10 = false;
            o0Var = new h2.o0(context, looper2, g0Var2);
            qVar.z = o0Var;
            if (o0Var.b == z10) {
            }
            ei.a aVar2 = new ei.a();
            new sa.d(context.getApplicationContext());
            g0Var2.a(looper2, null);
            g0Var2.a(Looper.getMainLooper(), null);
            qVar.A = aVar2;
            qVar.j0 = e2.o.c;
            qVar.k0 = x1.d;
            qVar.Z = h2.y.c;
            qVar.E = i14 >= 34 ? new f0(qVar, context) : null;
            qVar.F = new j6.k(2);
            qVar.G = new j6.k(2);
            qVar.D = new h2.e0(qVar, qVar.w, qVar.v, oVar.u, oVar.v, oVar.w, oVar.x);
            i0Var.b(38, qVar.M).b();
            e2.e eVar2 = qVar.a0;
            i0Var.getClass();
            h2.h0 c112 = h2.i0.c();
            c112.a = i0Var.a.obtainMessage(31, 0, 0, eVar2);
            c112.b();
            qVar.t1(1, 3, qVar.a0);
            qVar.t1(2, 4, Integer.valueOf(qVar.Y));
            qVar.t1(2, 5, 0);
            qVar.t1(1, 9, Boolean.valueOf(qVar.d0));
            qVar.t1(6, 8, qVar.x);
            qVar.t1(-1, 16, Integer.valueOf(qVar.h0));
            qVar.d.e();
        } catch (Throwable th3) {
            th = th3;
            g0Var = qVar;
        }
    }

    public static long m1(h1 h1Var) {
        e2.k1 k1Var = new e2.k1();
        e2.i1 i1Var = new e2.i1();
        h1Var.a.g(h1Var.b.a, i1Var);
        long j3 = h1Var.c;
        return j3 == -9223372036854775807L ? h1Var.a.m(i1Var.c, k1Var, 0L).l : i1Var.e + j3;
    }

    public static h1 n1(h1 h1Var, int i7) {
        h1 h = h1Var.h(i7);
        return (i7 == 1 || i7 == 4) ? h.b(false) : h;
    }

    @Override // e2.c1
    public final long A() {
        F1();
        return this.n0;
    }

    @Override // e2.c1
    public final boolean A0() {
        F1();
        return false;
    }

    public final void A1(m mVar) {
        h1 h1Var = this.p0;
        h1 c10 = h1Var.c(h1Var.b);
        c10.q = c10.s;
        c10.r = 0L;
        h1 n1 = n1(c10, 1);
        if (mVar != null) {
            n1 = n1.f(mVar);
        }
        this.J++;
        this.l.n.a(6).b();
        D1(n1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // e2.c1
    public final Looper B0() {
        return this.t;
    }

    public final void B1() {
        e2.y0 y0Var = this.P;
        String str = h2.l0.a;
        g0 g0Var = this.f;
        boolean q10 = g0Var.q();
        boolean f02 = g0Var.f0();
        boolean T0 = g0Var.T0();
        boolean S0 = g0Var.S0();
        boolean Q0 = g0Var.Q0();
        boolean w02 = g0Var.w0();
        boolean p10 = g0Var.z0().p();
        e2.x0 x0Var = new e2.x0();
        x0Var.a = new ca.i();
        ca.i iVar = (ca.i) x0Var.a;
        iVar.c(this.c.a);
        boolean z10 = !q10;
        x0Var.a(4, z10);
        boolean z11 = false;
        x0Var.a(5, f02 && !q10);
        x0Var.a(6, T0 && !q10);
        x0Var.a(7, !p10 && (T0 || !Q0 || f02) && !q10);
        x0Var.a(8, S0 && !q10);
        x0Var.a(9, !p10 && (S0 || (Q0 && w02)) && !q10);
        x0Var.a(10, z10);
        x0Var.a(11, f02 && !q10);
        if (f02 && !q10) {
            z11 = true;
        }
        x0Var.a(12, z11);
        e2.y0 y0Var2 = new e2.y0(iVar.d());
        this.P = y0Var2;
        if (y0Var2.equals(y0Var)) {
            return;
        }
        this.m.c(13, new v(this, 2));
    }

    @Override // e2.c1
    public final int C() {
        F1();
        if (!this.p0.a.p()) {
            h1 h1Var = this.p0;
            return h1Var.a.b(h1Var.b.a);
        }
        int i7 = this.q0;
        if (i7 == -1) {
            return 0;
        }
        return i7;
    }

    @Override // e2.c1
    public final void C0() {
        F1();
        if (this.b0 != 0.0f) {
            U(0.0f);
        }
    }

    public final void C1(int i7, boolean z10) {
        h1 h1Var = this.p0;
        int i10 = h1Var.n;
        int i11 = (i10 != 1 || z10) ? 0 : 1;
        if (h1Var.l == z10 && i10 == i11 && h1Var.m == i7) {
            return;
        }
        this.J++;
        if (h1Var.p) {
            h1Var = h1Var.a();
        }
        h1 e10 = h1Var.e(i7, i11, z10);
        h2.i0 i0Var = this.l.n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.a = i0Var.a.obtainMessage(1, z10 ? 1 : 0, i7 | (i11 << 4));
        c10.b();
        D1(e10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // e2.c1
    public final x1 D() {
        F1();
        return this.k0;
    }

    @Override // e2.c1
    public final void D0() {
        F1();
    }

    public final void D1(final h1 h1Var, int i7, boolean z10, int i10, long j3, int i11, boolean z11) {
        Pair pair;
        int i12;
        e2.l0 l0Var;
        boolean z12;
        boolean z13;
        boolean z14;
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
        h1 h1Var2 = this.p0;
        this.p0 = h1Var;
        boolean equals = h1Var2.a.equals(h1Var.a);
        e2.k1 k1Var = (e2.k1) this.a;
        e2.i1 i1Var = this.o;
        e2.l1 l1Var = h1Var2.a;
        x2.g0 g0Var = h1Var2.b;
        e2.l1 l1Var2 = h1Var.a;
        x2.g0 g0Var2 = h1Var.b;
        if (l1Var2.p() && l1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (l1Var2.p() != l1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (l1Var.m(l1Var.g(g0Var.a, i1Var).c, k1Var, 0L).a.equals(l1Var2.m(l1Var2.g(g0Var2.a, i1Var).c, k1Var, 0L).a)) {
            pair = (z10 && i10 == 0 && g0Var.d < g0Var2.d) ? new Pair(Boolean.TRUE, 0) : (z10 && i10 == 1 && z11) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z10 && i10 == 0) {
                i12 = 1;
            } else if (z10 && i10 == 1) {
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
            l0Var = !h1Var.a.p() ? h1Var.a.m(h1Var.a.g(h1Var.b.a, this.o).c, (e2.k1) this.a, 0L).c : null;
            this.o0 = e2.o0.L;
        } else {
            l0Var = null;
        }
        if (booleanValue || !h1Var2.j.equals(h1Var.j)) {
            e2.n0 a10 = this.o0.a();
            List list = h1Var.j;
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
        boolean z15 = h1Var2.l != h1Var.l;
        boolean z16 = h1Var2.e != h1Var.e;
        if (z16 || z15) {
            E1();
        }
        boolean z17 = h1Var2.g != h1Var.g;
        if (!equals) {
            this.m.c(0, new ai.n1(h1Var, i7, 2));
        }
        if (z10) {
            e2.i1 i1Var2 = new e2.i1();
            if (h1Var2.a.p()) {
                z12 = booleanValue;
                z13 = equals2;
                z14 = z16;
                i13 = i11;
                i14 = i13;
                obj = null;
                l0Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = h1Var2.b.a;
                h1Var2.a.g(obj5, i1Var2);
                int i17 = i1Var2.c;
                int b10 = h1Var2.a.b(obj5);
                z12 = booleanValue;
                z13 = equals2;
                z14 = z16;
                obj = h1Var2.a.m(i17, (e2.k1) this.a, 0L).a;
                l0Var2 = ((e2.k1) this.a).c;
                obj2 = obj5;
                i13 = i17;
                i14 = b10;
            }
            if (i10 == 0) {
                if (h1Var2.b.b()) {
                    x2.g0 g0Var3 = h1Var2.b;
                    j12 = i1Var2.a(g0Var3.b, g0Var3.c);
                    m12 = m1(h1Var2);
                } else if (h1Var2.b.e != -1) {
                    j12 = m1(this.p0);
                    m12 = j12;
                } else {
                    j10 = i1Var2.e;
                    j11 = i1Var2.d;
                    j12 = j10 + j11;
                    m12 = j12;
                }
            } else if (h1Var2.b.b()) {
                j12 = h1Var2.s;
                m12 = m1(h1Var2);
            } else {
                j10 = i1Var2.e;
                j11 = h1Var2.s;
                j12 = j10 + j11;
                m12 = j12;
            }
            long h02 = h2.l0.h0(j12);
            long h03 = h2.l0.h0(m12);
            x2.g0 g0Var4 = h1Var2.b;
            e2.b1 b1Var = new e2.b1(obj, i13, l0Var2, obj2, i14, h02, h03, g0Var4.b, g0Var4.c);
            e2.k1 k1Var2 = (e2.k1) this.a;
            int p02 = p0();
            int C = C();
            if (this.p0.a.p()) {
                obj3 = null;
                l0Var3 = null;
                obj4 = null;
            } else {
                h1 h1Var3 = this.p0;
                Object obj6 = h1Var3.b.a;
                h1Var3.a.g(obj6, this.o);
                C = this.p0.a.b(obj6);
                Object obj7 = this.p0.a.m(p02, k1Var2, 0L).a;
                l0Var3 = k1Var2.c;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i18 = C;
            long h04 = h2.l0.h0(j3);
            long h05 = this.p0.b.b() ? h2.l0.h0(m1(this.p0)) : h04;
            x2.g0 g0Var5 = this.p0.b;
            this.m.c(11, new ai.o1(i10, b1Var, new e2.b1(obj3, p02, l0Var3, obj4, i18, h04, h05, g0Var5.b, g0Var5.c), 4));
        } else {
            z12 = booleanValue;
            z13 = equals2;
            z14 = z16;
        }
        if (z12) {
            this.m.c(1, new ai.n1(l0Var, intValue, 3));
        }
        if (h1Var2.f != h1Var.f) {
            final int i19 = 7;
            this.m.c(10, new h2.o() { // from class: l2.s
                @Override // h2.o
                public final void invoke(Object obj8) {
                    e2.a1 a1Var = (e2.a1) obj8;
                    switch (i19) {
                        case 0:
                            h1 h1Var4 = h1Var;
                            a1Var.f(h1Var4.g);
                            a1Var.h(h1Var4.g);
                            break;
                        case 1:
                            h1 h1Var5 = h1Var;
                            a1Var.D(h1Var5.e, h1Var5.l);
                            break;
                        case 2:
                            a1Var.m(h1Var.e);
                            break;
                        case 3:
                            h1 h1Var6 = h1Var;
                            a1Var.j(h1Var6.m, h1Var6.l);
                            break;
                        case 4:
                            a1Var.d(h1Var.n);
                            break;
                        case 5:
                            a1Var.P(h1Var.m());
                            break;
                        case 6:
                            a1Var.H(h1Var.o);
                            break;
                        case 7:
                            a1Var.q(h1Var.f);
                            break;
                        case 8:
                            a1Var.y(h1Var.f);
                            break;
                        default:
                            a1Var.u(h1Var.i.d);
                            break;
                    }
                }
            });
            if (h1Var.f != null) {
                final int i20 = 8;
                this.m.c(10, new h2.o() { // from class: l2.s
                    @Override // h2.o
                    public final void invoke(Object obj8) {
                        e2.a1 a1Var = (e2.a1) obj8;
                        switch (i20) {
                            case 0:
                                h1 h1Var4 = h1Var;
                                a1Var.f(h1Var4.g);
                                a1Var.h(h1Var4.g);
                                break;
                            case 1:
                                h1 h1Var5 = h1Var;
                                a1Var.D(h1Var5.e, h1Var5.l);
                                break;
                            case 2:
                                a1Var.m(h1Var.e);
                                break;
                            case 3:
                                h1 h1Var6 = h1Var;
                                a1Var.j(h1Var6.m, h1Var6.l);
                                break;
                            case 4:
                                a1Var.d(h1Var.n);
                                break;
                            case 5:
                                a1Var.P(h1Var.m());
                                break;
                            case 6:
                                a1Var.H(h1Var.o);
                                break;
                            case 7:
                                a1Var.q(h1Var.f);
                                break;
                            case 8:
                                a1Var.y(h1Var.f);
                                break;
                            default:
                                a1Var.u(h1Var.i.d);
                                break;
                        }
                    }
                });
            }
        }
        a3.y yVar = h1Var2.i;
        a3.y yVar2 = h1Var.i;
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
                            h1 h1Var4 = h1Var;
                            a1Var.f(h1Var4.g);
                            a1Var.h(h1Var4.g);
                            break;
                        case 1:
                            h1 h1Var5 = h1Var;
                            a1Var.D(h1Var5.e, h1Var5.l);
                            break;
                        case 2:
                            a1Var.m(h1Var.e);
                            break;
                        case 3:
                            h1 h1Var6 = h1Var;
                            a1Var.j(h1Var6.m, h1Var6.l);
                            break;
                        case 4:
                            a1Var.d(h1Var.n);
                            break;
                        case 5:
                            a1Var.P(h1Var.m());
                            break;
                        case 6:
                            a1Var.H(h1Var.o);
                            break;
                        case 7:
                            a1Var.q(h1Var.f);
                            break;
                        case 8:
                            a1Var.y(h1Var.f);
                            break;
                        default:
                            a1Var.u(h1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (!z13) {
            this.m.c(14, new r(this.Q));
        }
        if (z17) {
            final int i22 = 0;
            this.m.c(3, new h2.o() { // from class: l2.s
                @Override // h2.o
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (i22) {
                        case 0:
                            h1 h1Var4 = h1Var;
                            a1Var.f(h1Var4.g);
                            a1Var.h(h1Var4.g);
                            break;
                        case 1:
                            h1 h1Var5 = h1Var;
                            a1Var.D(h1Var5.e, h1Var5.l);
                            break;
                        case 2:
                            a1Var.m(h1Var.e);
                            break;
                        case 3:
                            h1 h1Var6 = h1Var;
                            a1Var.j(h1Var6.m, h1Var6.l);
                            break;
                        case 4:
                            a1Var.d(h1Var.n);
                            break;
                        case 5:
                            a1Var.P(h1Var.m());
                            break;
                        case 6:
                            a1Var.H(h1Var.o);
                            break;
                        case 7:
                            a1Var.q(h1Var.f);
                            break;
                        case 8:
                            a1Var.y(h1Var.f);
                            break;
                        default:
                            a1Var.u(h1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z14 || z15) {
            final int i23 = 1;
            this.m.c(-1, new h2.o() { // from class: l2.s
                @Override // h2.o
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (i23) {
                        case 0:
                            h1 h1Var4 = h1Var;
                            a1Var.f(h1Var4.g);
                            a1Var.h(h1Var4.g);
                            break;
                        case 1:
                            h1 h1Var5 = h1Var;
                            a1Var.D(h1Var5.e, h1Var5.l);
                            break;
                        case 2:
                            a1Var.m(h1Var.e);
                            break;
                        case 3:
                            h1 h1Var6 = h1Var;
                            a1Var.j(h1Var6.m, h1Var6.l);
                            break;
                        case 4:
                            a1Var.d(h1Var.n);
                            break;
                        case 5:
                            a1Var.P(h1Var.m());
                            break;
                        case 6:
                            a1Var.H(h1Var.o);
                            break;
                        case 7:
                            a1Var.q(h1Var.f);
                            break;
                        case 8:
                            a1Var.y(h1Var.f);
                            break;
                        default:
                            a1Var.u(h1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z14) {
            final int i24 = 2;
            this.m.c(4, new h2.o() { // from class: l2.s
                @Override // h2.o
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (i24) {
                        case 0:
                            h1 h1Var4 = h1Var;
                            a1Var.f(h1Var4.g);
                            a1Var.h(h1Var4.g);
                            break;
                        case 1:
                            h1 h1Var5 = h1Var;
                            a1Var.D(h1Var5.e, h1Var5.l);
                            break;
                        case 2:
                            a1Var.m(h1Var.e);
                            break;
                        case 3:
                            h1 h1Var6 = h1Var;
                            a1Var.j(h1Var6.m, h1Var6.l);
                            break;
                        case 4:
                            a1Var.d(h1Var.n);
                            break;
                        case 5:
                            a1Var.P(h1Var.m());
                            break;
                        case 6:
                            a1Var.H(h1Var.o);
                            break;
                        case 7:
                            a1Var.q(h1Var.f);
                            break;
                        case 8:
                            a1Var.y(h1Var.f);
                            break;
                        default:
                            a1Var.u(h1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z15 || h1Var2.m != h1Var.m) {
            final int i25 = 3;
            this.m.c(5, new h2.o() { // from class: l2.s
                @Override // h2.o
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (i25) {
                        case 0:
                            h1 h1Var4 = h1Var;
                            a1Var.f(h1Var4.g);
                            a1Var.h(h1Var4.g);
                            break;
                        case 1:
                            h1 h1Var5 = h1Var;
                            a1Var.D(h1Var5.e, h1Var5.l);
                            break;
                        case 2:
                            a1Var.m(h1Var.e);
                            break;
                        case 3:
                            h1 h1Var6 = h1Var;
                            a1Var.j(h1Var6.m, h1Var6.l);
                            break;
                        case 4:
                            a1Var.d(h1Var.n);
                            break;
                        case 5:
                            a1Var.P(h1Var.m());
                            break;
                        case 6:
                            a1Var.H(h1Var.o);
                            break;
                        case 7:
                            a1Var.q(h1Var.f);
                            break;
                        case 8:
                            a1Var.y(h1Var.f);
                            break;
                        default:
                            a1Var.u(h1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (h1Var2.n != h1Var.n) {
            final int i26 = 4;
            this.m.c(6, new h2.o() { // from class: l2.s
                @Override // h2.o
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (i26) {
                        case 0:
                            h1 h1Var4 = h1Var;
                            a1Var.f(h1Var4.g);
                            a1Var.h(h1Var4.g);
                            break;
                        case 1:
                            h1 h1Var5 = h1Var;
                            a1Var.D(h1Var5.e, h1Var5.l);
                            break;
                        case 2:
                            a1Var.m(h1Var.e);
                            break;
                        case 3:
                            h1 h1Var6 = h1Var;
                            a1Var.j(h1Var6.m, h1Var6.l);
                            break;
                        case 4:
                            a1Var.d(h1Var.n);
                            break;
                        case 5:
                            a1Var.P(h1Var.m());
                            break;
                        case 6:
                            a1Var.H(h1Var.o);
                            break;
                        case 7:
                            a1Var.q(h1Var.f);
                            break;
                        case 8:
                            a1Var.y(h1Var.f);
                            break;
                        default:
                            a1Var.u(h1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (h1Var2.m() != h1Var.m()) {
            final int i27 = 5;
            this.m.c(7, new h2.o() { // from class: l2.s
                @Override // h2.o
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (i27) {
                        case 0:
                            h1 h1Var4 = h1Var;
                            a1Var.f(h1Var4.g);
                            a1Var.h(h1Var4.g);
                            break;
                        case 1:
                            h1 h1Var5 = h1Var;
                            a1Var.D(h1Var5.e, h1Var5.l);
                            break;
                        case 2:
                            a1Var.m(h1Var.e);
                            break;
                        case 3:
                            h1 h1Var6 = h1Var;
                            a1Var.j(h1Var6.m, h1Var6.l);
                            break;
                        case 4:
                            a1Var.d(h1Var.n);
                            break;
                        case 5:
                            a1Var.P(h1Var.m());
                            break;
                        case 6:
                            a1Var.H(h1Var.o);
                            break;
                        case 7:
                            a1Var.q(h1Var.f);
                            break;
                        case 8:
                            a1Var.y(h1Var.f);
                            break;
                        default:
                            a1Var.u(h1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (!h1Var2.o.equals(h1Var.o)) {
            final int i28 = 6;
            this.m.c(12, new h2.o() { // from class: l2.s
                @Override // h2.o
                public final void invoke(Object obj82) {
                    e2.a1 a1Var = (e2.a1) obj82;
                    switch (i28) {
                        case 0:
                            h1 h1Var4 = h1Var;
                            a1Var.f(h1Var4.g);
                            a1Var.h(h1Var4.g);
                            break;
                        case 1:
                            h1 h1Var5 = h1Var;
                            a1Var.D(h1Var5.e, h1Var5.l);
                            break;
                        case 2:
                            a1Var.m(h1Var.e);
                            break;
                        case 3:
                            h1 h1Var6 = h1Var;
                            a1Var.j(h1Var6.m, h1Var6.l);
                            break;
                        case 4:
                            a1Var.d(h1Var.n);
                            break;
                        case 5:
                            a1Var.P(h1Var.m());
                            break;
                        case 6:
                            a1Var.H(h1Var.o);
                            break;
                        case 7:
                            a1Var.q(h1Var.f);
                            break;
                        case 8:
                            a1Var.y(h1Var.f);
                            break;
                        default:
                            a1Var.u(h1Var.i.d);
                            break;
                    }
                }
            });
        }
        B1();
        this.m.b();
        if (h1Var2.p != h1Var.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((a0) it.next()).a.E1();
            }
        }
    }

    @Override // e2.c1
    public final void E(e2.e eVar, boolean z10) {
        F1();
        if (this.i0) {
            return;
        }
        boolean equals = Objects.equals(this.a0, eVar);
        h2.r rVar = this.m;
        if (!equals) {
            this.a0 = eVar;
            t1(1, 3, eVar);
            rVar.c(20, new kg.f1(eVar, 7));
        }
        e2.e eVar2 = this.a0;
        h2.i0 i0Var = this.l.n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.a = i0Var.a.obtainMessage(31, z10 ? 1 : 0, 0, eVar2);
        c10.b();
        rVar.b();
    }

    @Override // e2.c1
    public final boolean E0() {
        F1();
        return this.I;
    }

    public final void E1() {
        int i7 = i();
        ei.a aVar = this.A;
        h2.o0 o0Var = this.z;
        boolean z10 = false;
        if (i7 != 1) {
            if (i7 == 2 || i7 == 3) {
                F1();
                boolean z11 = this.p0.p;
                if (v() && !z11) {
                    z10 = true;
                }
                o0Var.b(z10);
                aVar.a(v());
                return;
            }
            if (i7 != 4) {
                throw new IllegalStateException();
            }
        }
        o0Var.b(false);
        aVar.a(false);
    }

    @Override // e2.c1
    public final e2.q1 F0() {
        F1();
        return ((a3.s) this.i).j();
    }

    public final void F1() {
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = h2.l0.a;
            Locale locale = Locale.US;
            String l10 = p5.c.l("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f0) {
                throw new IllegalStateException(l10);
            }
            h2.a.m("ExoPlayerImpl", l10, this.g0 ? null : new IllegalStateException());
            this.g0 = true;
        }
    }

    @Override // e2.c1
    public final float G() {
        F1();
        return this.b0;
    }

    @Override // e2.c1
    public final long G0() {
        F1();
        if (this.p0.a.p()) {
            return this.r0;
        }
        h1 h1Var = this.p0;
        long j3 = 0;
        if (h1Var.k.d != h1Var.b.d) {
            return h2.l0.h0(h1Var.a.m(p0(), (e2.k1) this.a, 0L).m);
        }
        long j10 = h1Var.q;
        if (this.p0.k.b()) {
            h1 h1Var2 = this.p0;
            h1Var2.a.g(h1Var2.k.a, this.o).d(this.p0.k.b);
        } else {
            j3 = j10;
        }
        h1 h1Var3 = this.p0;
        e2.l1 l1Var = h1Var3.a;
        Object obj = h1Var3.k.a;
        e2.i1 i1Var = this.o;
        l1Var.g(obj, i1Var);
        return h2.l0.h0(j3 + i1Var.e);
    }

    @Override // e2.c1
    public final void H0(int i7) {
        F1();
    }

    @Override // e2.c1
    public final e2.e I() {
        F1();
        return this.a0;
    }

    @Override // e2.c1
    public final void J0(e2.a1 a1Var) {
        a1Var.getClass();
        this.m.a(a1Var);
    }

    @Override // e2.c1
    public final void K(int i7, boolean z10) {
        F1();
    }

    @Override // e2.c1
    public final e2.o L() {
        F1();
        return this.j0;
    }

    @Override // e2.c1
    public final void L0(e2.o0 o0Var) {
        F1();
        o0Var.getClass();
        if (o0Var.equals(this.R)) {
            return;
        }
        this.R = o0Var;
        this.m.e(15, new v(this, 3));
    }

    @Override // e2.c1
    public final void M() {
        F1();
    }

    @Override // e2.c1
    public final void N(int i7, int i10) {
        F1();
    }

    @Override // e2.c1
    public final e2.o0 N0() {
        F1();
        return this.Q;
    }

    @Override // e2.c1
    public final void O(int i7) {
        F1();
    }

    @Override // e2.c1
    public final void O0(List list) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(-1, -9223372036854775807L, g12, true);
    }

    @Override // e2.c1
    public final int P() {
        F1();
        if (q()) {
            return this.p0.b.c;
        }
        return -1;
    }

    @Override // e2.c1
    public final long P0() {
        F1();
        return this.l0;
    }

    @Override // e2.c1
    public final void S(int i7, int i10) {
        F1();
        ma.f(i7 >= 0 && i10 >= i7);
        int size = this.p.size();
        int min = Math.min(i10, size);
        if (i7 >= size || i7 == min) {
            return;
        }
        h1 r12 = r1(this.p0, i7, min);
        D1(r12, 0, !r12.b.a.equals(this.p0.b.a), 4, j1(r12), -1, false);
    }

    @Override // e2.c1
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

    @Override // e2.c1
    public final void U(float f10) {
        F1();
        float h = h2.l0.h(f10, 0.0f, 1.0f);
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
    public final void W(List list, int i7, long j3) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(i7, j3, g12, false);
    }

    @Override // e2.c1
    public final e2.v0 X() {
        F1();
        return this.p0.f;
    }

    @Override // com.google.android.gms.common.api.q
    public final void X0() {
        boolean z10;
        h2.a.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.l0.a + "] [" + e2.m0.b() + "]");
        F1();
        this.y.A();
        this.z.b(false);
        this.A.a(false);
        f0 f0Var = this.E;
        if (f0Var != null && Build.VERSION.SDK_INT >= 34) {
            f0.a(f0Var);
        }
        h2.e0 e0Var = this.D;
        ((h2.i0) e0Var.f).a.removeCallbacksAndMessages(null);
        ((g0) e0Var.a).i0((h2.z) e0Var.b);
        p0 p0Var = this.l;
        if (p0Var.a0 || !p0Var.s.getThread().isAlive()) {
            z10 = true;
        } else {
            p0Var.a0 = true;
            h2.i iVar = new h2.i(p0Var.G);
            p0Var.n.b(7, iVar).b();
            z10 = iVar.c(p0Var.L);
        }
        if (!z10) {
            this.m.e(10, new z9(24));
        }
        this.m.d();
        this.j.a.removeCallbacksAndMessages(null);
        b3.d dVar = this.u;
        m2.d dVar2 = this.s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((b3.g) dVar).c.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            b3.c cVar = (b3.c) it.next();
            if (cVar.b == dVar2) {
                cVar.c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        h1 h1Var = this.p0;
        if (h1Var.p) {
            this.p0 = h1Var.a();
        }
        h1 n1 = n1(this.p0, 1);
        this.p0 = n1;
        h1 c10 = n1.c(n1.b);
        this.p0 = c10;
        c10.q = c10.s;
        this.p0.r = 0L;
        m2.d dVar3 = this.s;
        h2.i0 i0Var = dVar3.n;
        i0Var.getClass();
        i0Var.d(new kg.i0(dVar3, 19));
        s1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.e0 = g2.c.d;
        this.i0 = true;
    }

    @Override // e2.c1
    public final void Y(boolean z10) {
        F1();
        C1(1, z10);
    }

    @Override // com.google.android.gms.common.api.q
    public final void Y0(int i7, long j3, boolean z10) {
        F1();
        if (i7 == -1) {
            return;
        }
        ma.f(i7 >= 0);
        e2.l1 l1Var = this.p0.a;
        if (l1Var.p() || i7 < l1Var.o()) {
            m2.d dVar = this.s;
            if (!dVar.r) {
                m2.a Q = dVar.Q();
                dVar.r = true;
                dVar.V(Q, -1, new kg.f1(Q, 14));
            }
            this.J++;
            if (q()) {
                h2.a.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                m0 m0Var = new m0(this.p0);
                m0Var.f(1);
                g0 g0Var = this.k.b;
                g0Var.j.d(new ji.f(18, g0Var, m0Var));
                return;
            }
            h1 h1Var = this.p0;
            int i10 = h1Var.e;
            if (i10 == 3 || (i10 == 4 && !l1Var.p())) {
                h1Var = this.p0.h(2);
            }
            int p02 = p0();
            h1 o12 = o1(h1Var, l1Var, p1(l1Var, i7, j3));
            this.l.n.b(3, new o0(l1Var, i7, h2.l0.S(j3))).b();
            D1(o12, 0, true, 1, j1(o12), p02, z10);
        }
    }

    @Override // e2.c1
    public final void a() {
        F1();
        h1 h1Var = this.p0;
        if (h1Var.e != 1) {
            return;
        }
        h1 f10 = h1Var.f(null);
        h1 n1 = n1(f10, f10.a.p() ? 4 : 2);
        this.J++;
        this.l.n.a(29).b();
        D1(n1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // e2.c1
    public final long a0() {
        F1();
        return this.m0;
    }

    @Override // e2.c1
    public final long b0() {
        F1();
        return i1(this.p0);
    }

    @Override // e2.c1
    public final void c0(int i7, List list) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        ma.f(i7 >= 0);
        int min = Math.min(i7, this.p.size());
        if (!this.p0.a.p()) {
            D1(e1(this.p0, min, g12), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z10 = this.q0 == -1;
        F1();
        v1(-1, -9223372036854775807L, g12, z10);
    }

    @Override // e2.c1
    public final void d0() {
        F1();
        if (this.b0 == 0.0f) {
            float f10 = this.c0;
            if (f10 != 0.0f) {
                U(f10);
            }
        }
    }

    @Override // e2.c1
    public final void e(e2.w0 w0Var) {
        F1();
        if (this.p0.o.equals(w0Var)) {
            return;
        }
        h1 g10 = this.p0.g(w0Var);
        this.J++;
        this.l.n.b(4, w0Var).b();
        D1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // e2.c1
    public final long e0() {
        F1();
        if (!q()) {
            return G0();
        }
        h1 h1Var = this.p0;
        return h1Var.k.equals(h1Var.b) ? h2.l0.h0(this.p0.q) : getDuration();
    }

    public final h1 e1(h1 h1Var, int i7, ArrayList arrayList) {
        e2.l1 l1Var = h1Var.a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.p;
            if (i10 >= size) {
                this.O = this.O.f(i7, arrayList2.size());
                m1 m1Var = new m1(arrayList3, this.O);
                h1 o12 = o1(h1Var, m1Var, l1(l1Var, m1Var, k1(h1Var), i1(h1Var)));
                x2.i1 i1Var = this.O;
                h2.i0 i0Var = this.l.n;
                k0 k0Var = new k0(arrayList2, i1Var, -1, -9223372036854775807L);
                i0Var.getClass();
                h2.h0 c10 = h2.i0.c();
                c10.a = i0Var.a.obtainMessage(18, i7, 0, k0Var);
                c10.b();
                return o12;
            }
            f1 f1Var = new f1((x2.a) arrayList.get(i10), this.q);
            arrayList2.add(f1Var);
            arrayList3.add(i10 + i7, new c0(f1Var.b, f1Var.a));
            i10++;
        }
    }

    public final e2.o0 f1() {
        e2.l1 z02 = z0();
        if (z02.p()) {
            return this.o0;
        }
        e2.l0 l0Var = z02.m(p0(), (e2.k1) this.a, 0L).c;
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
                ma.f(l10.longValue() >= 0);
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
        if (!q()) {
            return B();
        }
        h1 h1Var = this.p0;
        x2.g0 g0Var = h1Var.b;
        e2.l1 l1Var = h1Var.a;
        Object obj = g0Var.a;
        e2.i1 i1Var = this.o;
        l1Var.g(obj, i1Var);
        return h2.l0.h0(i1Var.a(g0Var.b, g0Var.c));
    }

    public final k1 h1(j1 j1Var) {
        int k12 = k1(this.p0);
        e2.l1 l1Var = this.p0.a;
        if (k12 == -1) {
            k12 = 0;
        }
        p0 p0Var = this.l;
        return new k1(p0Var, j1Var, l1Var, k12, p0Var.s);
    }

    @Override // e2.c1
    public final int i() {
        F1();
        return this.p0.e;
    }

    @Override // e2.c1
    public final void i0(e2.a1 a1Var) {
        F1();
        a1Var.getClass();
        h2.r rVar = this.m;
        if (rVar.i) {
            ma.p(Thread.currentThread() == rVar.a);
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
                    pVar.f(qVar.a, qVar.b.d());
                }
                copyOnWriteArraySet.remove(qVar);
            }
        }
    }

    public final long i1(h1 h1Var) {
        x2.g0 g0Var = h1Var.b;
        long j3 = h1Var.c;
        e2.l1 l1Var = h1Var.a;
        if (!g0Var.b()) {
            return h2.l0.h0(j1(h1Var));
        }
        Object obj = h1Var.b.a;
        e2.i1 i1Var = this.o;
        l1Var.g(obj, i1Var);
        if (j3 == -9223372036854775807L) {
            return h2.l0.h0(l1Var.m(k1(h1Var), (e2.k1) this.a, 0L).l);
        }
        return h2.l0.h0(j3) + h2.l0.h0(i1Var.e);
    }

    @Override // e2.c1
    public final void j0(int i7) {
        F1();
    }

    public final long j1(h1 h1Var) {
        if (h1Var.a.p()) {
            return h2.l0.S(this.r0);
        }
        long l10 = h1Var.p ? h1Var.l() : h1Var.s;
        if (h1Var.b.b()) {
            return l10;
        }
        e2.l1 l1Var = h1Var.a;
        Object obj = h1Var.b.a;
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
    public final s1 k0() {
        F1();
        return this.p0.i.d;
    }

    public final int k1(h1 h1Var) {
        return h1Var.a.p() ? this.q0 : h1Var.a.g(h1Var.b.a, this.o).c;
    }

    @Override // e2.c1
    public final e2.w0 l() {
        F1();
        return this.p0.o;
    }

    @Override // e2.c1
    public final e2.o0 l0() {
        F1();
        return this.R;
    }

    public final Pair l1(e2.l1 l1Var, m1 m1Var, int i7, long j3) {
        if (l1Var.p() || m1Var.p()) {
            boolean z10 = !l1Var.p() && m1Var.p();
            return p1(m1Var, z10 ? -1 : i7, z10 ? -9223372036854775807L : j3);
        }
        Pair i10 = l1Var.i((e2.k1) this.a, this.o, i7, h2.l0.S(j3));
        Object obj = i10.first;
        if (m1Var.b(obj) != -1) {
            return i10;
        }
        int S = p0.S((e2.k1) this.a, this.o, this.H, this.I, obj, l1Var, m1Var);
        if (S == -1) {
            return p1(m1Var, -1, -9223372036854775807L);
        }
        e2.k1 k1Var = (e2.k1) this.a;
        m1Var.m(S, k1Var, 0L);
        return p1(m1Var, S, h2.l0.h0(k1Var.l));
    }

    @Override // e2.c1
    public final int m() {
        F1();
        return this.H;
    }

    @Override // e2.c1
    public final g2.c m0() {
        F1();
        return this.e0;
    }

    @Override // e2.c1
    public final long n() {
        F1();
        return h2.l0.h0(j1(this.p0));
    }

    @Override // e2.c1
    public final int o() {
        F1();
        return 0;
    }

    @Override // e2.c1
    public final int o0() {
        F1();
        if (q()) {
            return this.p0.b.b;
        }
        return -1;
    }

    public final h1 o1(h1 h1Var, e2.l1 l1Var, Pair pair) {
        List list;
        ma.f(l1Var.p() || pair != null);
        e2.l1 l1Var2 = h1Var.a;
        long i12 = i1(h1Var);
        h1 j3 = h1Var.j(l1Var);
        if (l1Var.p()) {
            x2.g0 g0Var = h1.u;
            long S = h2.l0.S(this.r0);
            h1 c10 = j3.d(g0Var, S, S, S, 0L, x2.r1.d, this.b, h9.s1.e).c(g0Var);
            c10.q = c10.s;
            return c10;
        }
        Object obj = j3.b.a;
        String str = h2.l0.a;
        boolean equals = obj.equals(pair.first);
        x2.g0 g0Var2 = !equals ? new x2.g0(pair.first) : j3.b;
        long longValue = ((Long) pair.second).longValue();
        long S2 = h2.l0.S(i12);
        if (!l1Var2.p()) {
            S2 -= l1Var2.g(obj, this.o).e;
            if (equals && S2 - longValue == 1 && S2 == l1Var2.g(obj, this.o).d) {
                S2--;
            }
        }
        if (!equals || longValue < S2) {
            x2.g0 g0Var3 = g0Var2;
            ma.p(!g0Var3.b());
            x2.r1 r1Var = !equals ? x2.r1.d : j3.h;
            a3.y yVar = !equals ? this.b : j3.i;
            if (equals) {
                list = j3.j;
            } else {
                h9.g0 g0Var4 = h9.i0.b;
                list = h9.s1.e;
            }
            h1 c11 = j3.d(g0Var3, longValue, longValue, longValue, 0L, r1Var, yVar, list).c(g0Var3);
            c11.q = longValue;
            return c11;
        }
        if (longValue != S2) {
            x2.g0 g0Var5 = g0Var2;
            ma.p(!g0Var5.b());
            long max = Math.max(0L, j3.r - (longValue - S2));
            long j10 = j3.q;
            if (j3.k.equals(j3.b)) {
                j10 = longValue + max;
            }
            h1 d = j3.d(g0Var5, longValue, longValue, longValue, max, j3.h, j3.i, j3.j);
            d.q = j10;
            return d;
        }
        int b10 = l1Var.b(j3.k.a);
        if (b10 != -1 && l1Var.f(b10, this.o, false).c == l1Var.g(g0Var2.a, this.o).c) {
            return j3;
        }
        l1Var.g(g0Var2.a, this.o);
        long a10 = g0Var2.b() ? this.o.a(g0Var2.b, g0Var2.c) : this.o.d;
        x2.g0 g0Var6 = g0Var2;
        h1 c12 = j3.d(g0Var6, j3.s, j3.s, j3.d, a10 - j3.s, j3.h, j3.i, j3.j).c(g0Var6);
        c12.q = a10;
        return c12;
    }

    @Override // e2.c1
    public final int p0() {
        F1();
        int k12 = k1(this.p0);
        if (k12 == -1) {
            return 0;
        }
        return k12;
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
            j3 = h2.l0.h0(l1Var.m(i7, (e2.k1) this.a, 0L).l);
        }
        return l1Var.i((e2.k1) this.a, this.o, i7, h2.l0.S(j3));
    }

    @Override // e2.c1
    public final boolean q() {
        F1();
        return this.p0.b.b();
    }

    public final void q1(int i7, int i10) {
        h2.y yVar = this.Z;
        if (i7 == yVar.a && i10 == yVar.b) {
            return;
        }
        this.Z = new h2.y(i7, i10);
        a61 a61Var = this.s0;
        if (a61Var != null) {
            a61Var.execute(new jg.q(this, i7, i10, 1));
            return;
        }
        this.m.e(24, new gh.c(i7, i10, 1));
        t1(2, 14, new h2.y(i7, i10));
    }

    @Override // e2.c1
    public final void r0(e2.q1 q1Var) {
        F1();
        a3.x xVar = this.i;
        xVar.getClass();
        e2.q1 F0 = F0();
        if (!q1Var.equals(((a3.s) xVar).j())) {
            xVar.b(q1Var);
        }
        if (F0.equals(q1Var)) {
            return;
        }
        this.m.e(19, new kg.f1(q1Var, 8));
    }

    public final h1 r1(h1 h1Var, int i7, int i10) {
        ArrayList arrayList;
        int k12 = k1(h1Var);
        long i12 = i1(h1Var);
        e2.l1 l1Var = h1Var.a;
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
        m1 m1Var = new m1(arrayList, this.O);
        h1 o12 = o1(h1Var, m1Var, l1(l1Var, m1Var, k12, i12));
        int i13 = o12.e;
        if (i13 != 1 && i13 != 4 && k12 >= i7 && k12 < i10) {
            if (p0.S((e2.k1) this.a, this.o, this.H, this.I, h1Var.b.a, l1Var, m1Var) == -1) {
                o12 = n1(o12, 4);
            }
        }
        x2.i1 i1Var = this.O;
        h2.i0 i0Var = this.l.n;
        i0Var.getClass();
        h2.h0 c10 = h2.i0.c();
        c10.a = i0Var.a.obtainMessage(20, i7, i10, i1Var);
        c10.b();
        return o12;
    }

    @Override // e2.c1
    public final long s() {
        F1();
        return h2.l0.h0(this.p0.r);
    }

    @Override // e2.c1
    public final void s0(boolean z10) {
        F1();
    }

    public final void s1() {
        TextureView textureView = this.X;
        a0 a0Var = this.w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != a0Var) {
                h2.a.l("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.X.setSurfaceTextureListener(null);
            }
            this.X = null;
        }
        SurfaceHolder surfaceHolder = this.V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(a0Var);
            this.V = null;
        }
    }

    @Override // com.google.android.gms.common.api.q, e2.c1
    public final void stop() {
        F1();
        A1(null);
        this.e0 = new g2.c(this.p0.s, h9.s1.e);
    }

    @Override // e2.c1
    public final void t0(List list, int i7, int i10) {
        F1();
        ma.f(i7 >= 0 && i10 >= i7);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        if (i7 > size) {
            return;
        }
        int min = Math.min(i10, size);
        if (min - i7 == list.size()) {
            for (int i11 = i7; i11 < min; i11++) {
                if (((c0) arrayList.get(i11)).b.k.a((e2.l0) list.get(i11 - i7))) {
                }
            }
            this.J++;
            h2.i0 i0Var = this.l.n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.a = i0Var.a.obtainMessage(27, i7, min, list);
            c10.b();
            for (int i12 = i7; i12 < min; i12++) {
                c0 c0Var = (c0) arrayList.get(i12);
                e2.l1 l1Var = c0Var.c;
                e2.l0 l0Var = (e2.l0) list.get(i12 - i7);
                c0Var.c = l1Var instanceof x2.q1 ? new x2.q1(((x2.q1) l1Var).e, l0Var) : new x2.q1(l1Var, l0Var);
            }
            D1(this.p0.j(new m1(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList g12 = g1(list);
        if (!this.p0.a.p()) {
            h1 r12 = r1(e1(this.p0, min, g12), i7, min);
            D1(r12, 0, !r12.b.a.equals(this.p0.b.a), 4, j1(r12), -1, false);
        } else {
            boolean z10 = this.q0 == -1;
            F1();
            v1(-1, -9223372036854775807L, g12, z10);
        }
    }

    public final void t1(int i7, int i10, Object obj) {
        for (b bVar : this.g) {
            if (i7 == -1 || bVar.b == i7) {
                k1 h12 = h1(bVar);
                ma.p(!h12.f);
                h12.c = i10;
                ma.p(!h12.f);
                h12.d = obj;
                h12.b();
            }
        }
        for (b bVar2 : this.h) {
            if (bVar2 != null && (i7 == -1 || bVar2.b == i7)) {
                k1 h13 = h1(bVar2);
                ma.p(!h13.f);
                h13.c = i10;
                ma.p(!h13.f);
                h13.d = obj;
                h13.b();
            }
        }
    }

    @Override // e2.c1
    public final e2.y0 u() {
        F1();
        return this.P;
    }

    public final void u1(x2.a aVar, boolean z10) {
        F1();
        List singletonList = Collections.singletonList(aVar);
        F1();
        v1(-1, -9223372036854775807L, singletonList, z10);
    }

    @Override // e2.c1
    public final boolean v() {
        F1();
        return this.p0.l;
    }

    @Override // e2.c1
    public final void v0(int i7, int i10, int i11) {
        F1();
        ma.f(i7 >= 0 && i7 <= i10 && i11 >= 0);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int min = Math.min(i10, size);
        int min2 = Math.min(i11, size - (min - i7));
        if (i7 >= size || i7 == min || i7 == min2) {
            return;
        }
        e2.l1 z02 = z0();
        this.J++;
        h2.l0.R(i7, min, min2, arrayList);
        this.O = this.O.g();
        m1 m1Var = new m1(arrayList, this.O);
        h1 h1Var = this.p0;
        h1 o12 = o1(h1Var, m1Var, l1(z02, m1Var, k1(h1Var), i1(this.p0)));
        x2.i1 i1Var = this.O;
        p0 p0Var = this.l;
        p0Var.getClass();
        p0Var.n.b(19, new l0(i7, min, min2, i1Var)).b();
        D1(o12, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void v1(int i7, long j3, List list, boolean z10) {
        int i10;
        long j10;
        int k12 = k1(this.p0);
        long n10 = n();
        this.J++;
        ArrayList arrayList = this.p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            f1 f1Var = new f1((x2.a) list.get(i11), this.q);
            arrayList2.add(f1Var);
            arrayList.add(i11, new c0(f1Var.b, f1Var.a));
        }
        this.O = this.O.c(arrayList2.size());
        m1 m1Var = new m1(arrayList, this.O);
        boolean p10 = m1Var.p();
        int i12 = m1Var.h;
        if (!p10 && i7 >= i12) {
            throw new be.n();
        }
        if (z10) {
            j10 = -9223372036854775807L;
            i10 = m1Var.a(this.I);
        } else if (i7 == -1) {
            i10 = k12;
            j10 = n10;
        } else {
            i10 = i7;
            j10 = j3;
        }
        h1 o12 = o1(this.p0, m1Var, p1(m1Var, i10, j10));
        int i13 = o12.e;
        if (i13 == 1) {
            i13 = 1;
        } else {
            if (!m1Var.p()) {
                if (i10 != -1) {
                    if (i10 < i12) {
                        i13 = 2;
                    }
                }
            }
            i13 = 4;
        }
        h1 n1 = n1(o12, i13);
        this.l.n.b(17, new k0(arrayList2, this.O, i10, h2.l0.S(j10))).b();
        D1(n1, 0, (this.p0.b.a.equals(n1.b.a) || this.p0.a.p()) ? false : true, 4, j1(n1), -1, false);
    }

    public final void w1(q1 q1Var) {
        F1();
        if (q1Var == null) {
            q1Var = q1.f;
        }
        if (this.N.equals(q1Var)) {
            return;
        }
        this.N = q1Var;
        this.l.n.b(5, q1Var).b();
    }

    @Override // e2.c1
    public final int x0() {
        F1();
        return this.p0.n;
    }

    public final void x1(Surface surface) {
        Object obj = this.T;
        boolean z10 = true;
        boolean z11 = (obj == null || obj == surface) ? false : true;
        long j3 = z11 ? this.B : -9223372036854775807L;
        p0 p0Var = this.l;
        if (!p0Var.a0 && p0Var.s.getThread().isAlive()) {
            h2.i iVar = new h2.i(p0Var.G);
            p0Var.n.b(30, new Pair(surface, iVar)).b();
            if (j3 != -9223372036854775807L) {
                z10 = iVar.c(j3);
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

    @Override // e2.c1
    public final void y(boolean z10) {
        F1();
        if (this.I != z10) {
            this.I = z10;
            h2.i0 i0Var = this.l.n;
            i0Var.getClass();
            h2.h0 c10 = h2.i0.c();
            c10.a = i0Var.a.obtainMessage(12, z10 ? 1 : 0, 0);
            c10.b();
            w wVar = new w(0, z10);
            h2.r rVar = this.m;
            rVar.c(9, wVar);
            B1();
            rVar.b();
        }
    }

    public final void y1(Surface surface) {
        F1();
        s1();
        x1(surface);
        int i7 = surface == null ? 0 : -1;
        q1(i7, i7);
    }

    @Override // e2.c1
    public final e2.l1 z0() {
        F1();
        return this.p0.a;
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
