package k2;

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
import b8.zb;
import ci.u8;
import d2.a2;
import d2.v1;
import ei.y8;
import gi.f6;
import ii.y3;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import org.telegram.ui.Components.e51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i0 extends ci.u0 implements p {
    public final di.a A;
    public final long B;
    public final g2.d C;
    public final g2.f0 D;
    public final h0 E;
    public final p4.q F;
    public final p4.q G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public boolean L;
    public final s1 M;
    public t1 N;
    public w2.i1 O;
    public d2.a1 P;
    public d2.q0 Q;
    public d2.q0 R;
    public d2.v S;
    public Object T;
    public Surface U;
    public SurfaceHolder V;
    public boolean W;
    public TextureView X;
    public final int Y;
    public g2.z Z;
    public d2.f a0;
    public final z2.t b;
    public float b0;
    public final d2.a1 c;
    public float c0;
    public final g2.j d;
    public boolean d0;
    public final Context e;
    public f2.c e0;
    public final i0 f;
    public final boolean f0;
    public final b[] g;
    public boolean g0;
    public final b[] h;
    public final int h0;
    public final z2.s i;
    public boolean i0;
    public final g2.j0 j;
    public final d2.p j0;
    public final w k;
    public a2 k0;
    public final r0 l;
    public final long l0;
    public final g2.s m;
    public final long m0;
    public final CopyOnWriteArraySet n;
    public final long n0;
    public final d2.k1 o;
    public d2.q0 o0;
    public final ArrayList p;
    public j1 p0;
    public final boolean q;
    public int q0;
    public final w2.f0 r;
    public long r0;
    public final l2.f s;
    public e51 s0;
    public final Looper t;
    public final ArrayList t0;
    public final a3.d u;
    public final g2.h0 v;
    public final c0 w;
    public final d0 x;
    public final b4.n y;
    public final g2.q0 z;

    static {
        d2.o0.a("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0368 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:3:0x001f, B:6:0x009e, B:7:0x00a7, B:9:0x00ad, B:11:0x00bb, B:13:0x0157, B:15:0x0167, B:16:0x018b, B:18:0x0193, B:20:0x01a2, B:21:0x0275, B:23:0x027b, B:25:0x0285, B:31:0x028f, B:38:0x02ba, B:45:0x02c2, B:47:0x031a, B:49:0x031e, B:51:0x0322, B:55:0x032a, B:58:0x033d, B:60:0x0368, B:61:0x036f, B:66:0x0336), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0336 A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:3:0x001f, B:6:0x009e, B:7:0x00a7, B:9:0x00ad, B:11:0x00bb, B:13:0x0157, B:15:0x0167, B:16:0x018b, B:18:0x0193, B:20:0x01a2, B:21:0x0275, B:23:0x027b, B:25:0x0285, B:31:0x028f, B:38:0x02ba, B:45:0x02c2, B:47:0x031a, B:49:0x031e, B:51:0x0322, B:55:0x032a, B:58:0x033d, B:60:0x0368, B:61:0x036f, B:66:0x0336), top: B:2:0x001f }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ci.u0, java.lang.Object, k2.i0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, k2.i0] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i0(n nVar) {
        i0 i0Var;
        boolean z10;
        g2.q0 q0Var;
        ?? u0Var = new ci.u0(2);
        u0Var.t0 = new ArrayList();
        u0Var.d = new g2.j();
        try {
            g2.a.g("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(u0Var)) + " [AndroidXMedia3/1.10.1] [" + g2.n0.a + "]");
            Context context = nVar.a;
            g2.h0 h0Var = nVar.b;
            u0Var.e = context.getApplicationContext();
            u0Var.s = new l2.f(h0Var);
            u0Var.h0 = nVar.i;
            u0Var.a0 = nVar.j;
            u0Var.Y = nVar.k;
            u0Var.d0 = false;
            u0Var.B = nVar.t;
            c0 c0Var = new c0(u0Var);
            u0Var.w = c0Var;
            u0Var.x = new d0();
            b[] b10 = ((j) nVar.c.get()).b(new Handler(nVar.h), c0Var, c0Var, c0Var, c0Var);
            u0Var.g = b10;
            zb.p(b10.length > 0);
            u0Var.h = new b[b10.length];
            int i3 = 0;
            while (true) {
                b[] bVarArr = u0Var.h;
                if (i3 >= bVarArr.length) {
                    break;
                }
                int i10 = u0Var.g[i3].b;
                bVarArr[i3] = null;
                i3++;
            }
            z2.s sVar = (z2.s) nVar.e.get();
            u0Var.i = sVar;
            u0Var.r = (w2.f0) nVar.d.get();
            a3.g c2 = a3.g.c(nVar.g.b);
            u0Var.u = c2;
            u0Var.q = nVar.l;
            u0Var.N = nVar.m;
            u0Var.l0 = nVar.o;
            u0Var.m0 = nVar.p;
            u0Var.n0 = nVar.q;
            u0Var.M = nVar.n;
            Looper looper = nVar.h;
            u0Var.t = looper;
            u0Var.v = h0Var;
            u0Var.f = u0Var;
            u0Var.m = new g2.s(new CopyOnWriteArraySet(), looper, looper.getThread(), h0Var, new y3((Object) u0Var, 8), true);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            u0Var.n = copyOnWriteArraySet;
            u0Var.p = new ArrayList();
            u0Var.O = new w2.g1();
            b[] bVarArr2 = u0Var.g;
            z2.t tVar = new z2.t(new q1[bVarArr2.length], new z2.p[bVarArr2.length], v1.b, null);
            u0Var.b = tVar;
            u0Var.o = new d2.k1();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (int i11 : new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32}) {
                zb.p(!false);
                sparseBooleanArray.append(i11, true);
            }
            sVar.getClass();
            zb.p(!false);
            sparseBooleanArray.append(29, true);
            zb.p(!false);
            d2.t tVar2 = new d2.t(sparseBooleanArray);
            u0Var.c = new d2.a1(tVar2);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i12 = 0; i12 < tVar2.a.size(); i12++) {
                int a10 = tVar2.a(i12);
                zb.p(!false);
                sparseBooleanArray2.append(a10, true);
            }
            zb.p(!false);
            sparseBooleanArray2.append(4, true);
            zb.p(!false);
            sparseBooleanArray2.append(10, true);
            zb.p(!false);
            u0Var.P = new d2.a1(new d2.t(sparseBooleanArray2));
            u0Var.j = h0Var.a(looper, null);
            w wVar = new w(u0Var, 0);
            u0Var.k = wVar;
            u0Var.p0 = j1.k(tVar);
            u0Var.s.W(u0Var, looper);
            l2.k kVar = new l2.k(nVar.A);
            r0 r0Var = new r0(u0Var.e, u0Var.g, u0Var.h, sVar, tVar, (t0) nVar.f.get(), c2, u0Var.H, u0Var.I, u0Var.s, u0Var.N, nVar.r, nVar.s, looper, h0Var, wVar, kVar, u0Var.x, nVar.B);
            Looper looper2 = r0Var.s;
            g2.j0 j0Var = r0Var.n;
            u0Var.l = r0Var;
            u0Var.b0 = 1.0f;
            u0Var.H = 0;
            d2.q0 q0Var2 = d2.q0.L;
            u0Var.Q = q0Var2;
            u0Var.R = q0Var2;
            u0Var.o0 = q0Var2;
            u0Var.q0 = -1;
            u0Var.e0 = f2.c.d;
            u0Var.f0 = true;
            u0Var.u0(u0Var.s);
            Handler handler = new Handler(looper);
            l2.f fVar = u0Var.s;
            c2.getClass();
            fVar.getClass();
            bb.c cVar = c2.c;
            cVar.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) cVar.b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                a3.c cVar2 = (a3.c) it.next();
                if (cVar2.b == fVar) {
                    cVar2.c = true;
                    copyOnWriteArrayList.remove(cVar2);
                }
            }
            int i13 = 1;
            copyOnWriteArrayList.add(new a3.c(handler, fVar));
            copyOnWriteArraySet.add(u0Var.w);
            int i14 = Build.VERSION.SDK_INT;
            u0Var = u0Var;
            if (i14 >= 31) {
                try {
                    Context context2 = u0Var.e;
                    boolean z11 = nVar.y;
                    g2.j0 a11 = h0Var.a(looper2, null);
                    u8 u8Var = new u8(context2, z11, (Object) u0Var, kVar, 4);
                    u0Var = u0Var;
                    a11.d(u8Var);
                } catch (Throwable th2) {
                    th = th2;
                    i0Var = u0Var;
                    i0Var.d.e();
                    throw th;
                }
            }
            w wVar2 = new w(u0Var, i13);
            g2.d dVar = new g2.d();
            dVar.b = h0Var.a(looper2, null);
            dVar.c = h0Var.a(looper, null);
            dVar.e = 0;
            dVar.f = 0;
            dVar.d = wVar2;
            u0Var.C = dVar;
            dVar.A(new f6((Object) u0Var, 24));
            Context context3 = nVar.a;
            Looper looper3 = nVar.h;
            c0 c0Var2 = u0Var.w;
            b4.n nVar2 = new b4.n();
            nVar2.b = context3.getApplicationContext();
            nVar2.d = h0Var.a(looper2, null);
            nVar2.c = new e2.a(nVar2, h0Var.a(looper3, null), c0Var2);
            u0Var.y = nVar2;
            nVar2.A();
            if (nVar.u != Integer.MAX_VALUE && nVar.v != Integer.MAX_VALUE && nVar.w != Integer.MAX_VALUE && nVar.x != Integer.MAX_VALUE) {
                z10 = true;
                q0Var = new g2.q0(context, looper2, h0Var);
                u0Var.z = q0Var;
                if (q0Var.b == z10) {
                    q0Var.b = z10;
                    q0Var.b(z10, q0Var.c);
                }
                di.a aVar = new di.a();
                new nb.a(context.getApplicationContext());
                h0Var.a(looper2, null);
                h0Var.a(Looper.getMainLooper(), null);
                u0Var.A = aVar;
                u0Var.j0 = d2.p.c;
                u0Var.k0 = a2.d;
                u0Var.Z = g2.z.c;
                u0Var.E = i14 < 34 ? new h0(u0Var, context) : null;
                u0Var.F = new p4.q(26);
                u0Var.G = new p4.q(26);
                u0Var.D = new g2.f0(u0Var, u0Var.w, u0Var.v, nVar.u, nVar.v, nVar.w, nVar.x);
                j0Var.b(38, u0Var.M).b();
                d2.f fVar2 = u0Var.a0;
                j0Var.getClass();
                g2.i0 c10 = g2.j0.c();
                c10.a = j0Var.a.obtainMessage(31, 0, 0, fVar2);
                c10.b();
                u0Var.t1(1, 3, u0Var.a0);
                u0Var.t1(2, 4, Integer.valueOf(u0Var.Y));
                u0Var.t1(2, 5, 0);
                u0Var.t1(1, 9, Boolean.valueOf(u0Var.d0));
                u0Var.t1(6, 8, u0Var.x);
                u0Var.t1(-1, 16, Integer.valueOf(u0Var.h0));
                u0Var.d.e();
            }
            z10 = false;
            q0Var = new g2.q0(context, looper2, h0Var);
            u0Var.z = q0Var;
            if (q0Var.b == z10) {
            }
            di.a aVar2 = new di.a();
            new nb.a(context.getApplicationContext());
            h0Var.a(looper2, null);
            h0Var.a(Looper.getMainLooper(), null);
            u0Var.A = aVar2;
            u0Var.j0 = d2.p.c;
            u0Var.k0 = a2.d;
            u0Var.Z = g2.z.c;
            u0Var.E = i14 < 34 ? new h0(u0Var, context) : null;
            u0Var.F = new p4.q(26);
            u0Var.G = new p4.q(26);
            u0Var.D = new g2.f0(u0Var, u0Var.w, u0Var.v, nVar.u, nVar.v, nVar.w, nVar.x);
            j0Var.b(38, u0Var.M).b();
            d2.f fVar22 = u0Var.a0;
            j0Var.getClass();
            g2.i0 c102 = g2.j0.c();
            c102.a = j0Var.a.obtainMessage(31, 0, 0, fVar22);
            c102.b();
            u0Var.t1(1, 3, u0Var.a0);
            u0Var.t1(2, 4, Integer.valueOf(u0Var.Y));
            u0Var.t1(2, 5, 0);
            u0Var.t1(1, 9, Boolean.valueOf(u0Var.d0));
            u0Var.t1(6, 8, u0Var.x);
            u0Var.t1(-1, 16, Integer.valueOf(u0Var.h0));
            u0Var.d.e();
        } catch (Throwable th3) {
            th = th3;
            i0Var = u0Var;
        }
    }

    public static long m1(j1 j1Var) {
        d2.m1 m1Var = new d2.m1();
        d2.k1 k1Var = new d2.k1();
        j1Var.a.g(j1Var.b.a, k1Var);
        long j10 = j1Var.c;
        return j10 == -9223372036854775807L ? j1Var.a.m(k1Var.c, m1Var, 0L).l : k1Var.e + j10;
    }

    public static j1 n1(j1 j1Var, int i3) {
        j1 h = j1Var.h(i3);
        return (i3 == 1 || i3 == 4) ? h.b(false) : h;
    }

    @Override // d2.e1
    public final void A0(d2.f fVar, boolean z10) {
        F1();
        if (this.i0) {
            return;
        }
        boolean equals = Objects.equals(this.a0, fVar);
        g2.s sVar = this.m;
        if (!equals) {
            this.a0 = fVar;
            t1(1, 3, fVar);
            sVar.c(20, new y8(fVar, 18));
        }
        d2.f fVar2 = this.a0;
        g2.j0 j0Var = this.l.n;
        j0Var.getClass();
        g2.i0 c2 = g2.j0.c();
        c2.a = j0Var.a.obtainMessage(31, z10 ? 1 : 0, 0, fVar2);
        c2.b();
        sVar.b();
    }

    public final void A1(l lVar) {
        j1 j1Var = this.p0;
        j1 c2 = j1Var.c(j1Var.b);
        c2.q = c2.s;
        c2.r = 0L;
        j1 n12 = n1(c2, 1);
        if (lVar != null) {
            n12 = n12.f(lVar);
        }
        this.J++;
        this.l.n.a(6).b();
        D1(n12, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // d2.e1
    public final int B() {
        F1();
        if (!this.p0.a.p()) {
            j1 j1Var = this.p0;
            return j1Var.a.b(j1Var.b.a);
        }
        int i3 = this.q0;
        if (i3 == -1) {
            return 0;
        }
        return i3;
    }

    @Override // d2.e1
    public final Looper B0() {
        return this.t;
    }

    public final void B1() {
        d2.a1 a1Var = this.P;
        String str = g2.n0.a;
        i0 i0Var = this.f;
        boolean n4 = i0Var.n();
        boolean c02 = i0Var.c0();
        boolean T0 = i0Var.T0();
        boolean S0 = i0Var.S0();
        boolean P0 = i0Var.P0();
        boolean s02 = i0Var.s0();
        boolean p10 = i0Var.y0().p();
        d2.z0 z0Var = new d2.z0();
        z0Var.a = new ba.i();
        ba.i iVar = (ba.i) z0Var.a;
        iVar.c(this.c.a);
        boolean z10 = !n4;
        z0Var.a(4, z10);
        boolean z11 = false;
        z0Var.a(5, c02 && !n4);
        z0Var.a(6, T0 && !n4);
        z0Var.a(7, !p10 && (T0 || !P0 || c02) && !n4);
        z0Var.a(8, S0 && !n4);
        z0Var.a(9, !p10 && (S0 || (P0 && s02)) && !n4);
        z0Var.a(10, z10);
        z0Var.a(11, c02 && !n4);
        if (c02 && !n4) {
            z11 = true;
        }
        z0Var.a(12, z11);
        d2.a1 a1Var2 = new d2.a1(iVar.d());
        this.P = a1Var2;
        if (a1Var2.equals(a1Var)) {
            return;
        }
        this.m.c(13, new w(this, 2));
    }

    @Override // d2.e1
    public final a2 C() {
        F1();
        return this.k0;
    }

    @Override // d2.e1
    public final void C0() {
        F1();
        if (this.b0 != 0.0f) {
            R(0.0f);
        }
    }

    public final void C1(int i3, boolean z10) {
        j1 j1Var = this.p0;
        int i10 = j1Var.n;
        int i11 = (i10 != 1 || z10) ? 0 : 1;
        if (j1Var.l == z10 && i10 == i11 && j1Var.m == i3) {
            return;
        }
        this.J++;
        if (j1Var.p) {
            j1Var = j1Var.a();
        }
        j1 e10 = j1Var.e(i3, i11, z10);
        g2.j0 j0Var = this.l.n;
        j0Var.getClass();
        g2.i0 c2 = g2.j0.c();
        c2.a = j0Var.a.obtainMessage(1, z10 ? 1 : 0, i3 | (i11 << 4));
        c2.b();
        D1(e10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // d2.e1
    public final void D0() {
        F1();
    }

    public final void D1(final j1 j1Var, int i3, boolean z10, int i10, long j10, int i11, boolean z11) {
        Pair pair;
        int i12;
        d2.n0 n0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i13;
        int i14;
        Object obj;
        d2.n0 n0Var2;
        Object obj2;
        long j11;
        long j12;
        long j13;
        long m1;
        Object obj3;
        d2.n0 n0Var3;
        Object obj4;
        j1 j1Var2 = this.p0;
        this.p0 = j1Var;
        boolean equals = j1Var2.a.equals(j1Var.a);
        d2.m1 m1Var = (d2.m1) this.a;
        d2.k1 k1Var = this.o;
        d2.n1 n1Var = j1Var2.a;
        w2.g0 g0Var = j1Var2.b;
        d2.n1 n1Var2 = j1Var.a;
        w2.g0 g0Var2 = j1Var.b;
        if (n1Var2.p() && n1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (n1Var2.p() != n1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (n1Var.m(n1Var.g(g0Var.a, k1Var).c, m1Var, 0L).a.equals(n1Var2.m(n1Var2.g(g0Var2.a, k1Var).c, m1Var, 0L).a)) {
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
            n0Var = !j1Var.a.p() ? j1Var.a.m(j1Var.a.g(j1Var.b.a, this.o).c, (d2.m1) this.a, 0L).c : null;
            this.o0 = d2.q0.L;
        } else {
            n0Var = null;
        }
        if (booleanValue || !j1Var2.j.equals(j1Var.j)) {
            d2.p0 a10 = this.o0.a();
            List list = j1Var.j;
            for (int i15 = 0; i15 < list.size(); i15++) {
                d2.s0 s0Var = (d2.s0) list.get(i15);
                int i16 = 0;
                while (true) {
                    d2.r0[] r0VarArr = s0Var.a;
                    if (i16 < r0VarArr.length) {
                        r0VarArr[i16].a(a10);
                        i16++;
                    }
                }
            }
            this.o0 = new d2.q0(a10);
        }
        d2.q0 f12 = f1();
        boolean equals2 = f12.equals(this.Q);
        this.Q = f12;
        boolean z15 = j1Var2.l != j1Var.l;
        boolean z16 = j1Var2.e != j1Var.e;
        if (z16 || z15) {
            E1();
        }
        boolean z17 = j1Var2.g != j1Var.g;
        if (!equals) {
            this.m.c(0, new q(j1Var, i3, 0));
        }
        if (z10) {
            d2.k1 k1Var2 = new d2.k1();
            if (j1Var2.a.p()) {
                z12 = booleanValue;
                z13 = equals2;
                z14 = z16;
                i13 = i11;
                i14 = i13;
                obj = null;
                n0Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = j1Var2.b.a;
                j1Var2.a.g(obj5, k1Var2);
                int i17 = k1Var2.c;
                int b10 = j1Var2.a.b(obj5);
                z12 = booleanValue;
                z13 = equals2;
                z14 = z16;
                obj = j1Var2.a.m(i17, (d2.m1) this.a, 0L).a;
                n0Var2 = ((d2.m1) this.a).c;
                obj2 = obj5;
                i13 = i17;
                i14 = b10;
            }
            if (i10 == 0) {
                if (j1Var2.b.b()) {
                    w2.g0 g0Var3 = j1Var2.b;
                    j13 = k1Var2.a(g0Var3.b, g0Var3.c);
                    m1 = m1(j1Var2);
                } else if (j1Var2.b.e != -1) {
                    j13 = m1(this.p0);
                    m1 = j13;
                } else {
                    j11 = k1Var2.e;
                    j12 = k1Var2.d;
                    j13 = j11 + j12;
                    m1 = j13;
                }
            } else if (j1Var2.b.b()) {
                j13 = j1Var2.s;
                m1 = m1(j1Var2);
            } else {
                j11 = k1Var2.e;
                j12 = j1Var2.s;
                j13 = j11 + j12;
                m1 = j13;
            }
            long h02 = g2.n0.h0(j13);
            long h03 = g2.n0.h0(m1);
            w2.g0 g0Var4 = j1Var2.b;
            d2.d1 d1Var = new d2.d1(obj, i13, n0Var2, obj2, i14, h02, h03, g0Var4.b, g0Var4.c);
            d2.m1 m1Var2 = (d2.m1) this.a;
            int l02 = l0();
            int B = B();
            if (this.p0.a.p()) {
                obj3 = null;
                n0Var3 = null;
                obj4 = null;
            } else {
                j1 j1Var3 = this.p0;
                Object obj6 = j1Var3.b.a;
                j1Var3.a.g(obj6, this.o);
                B = this.p0.a.b(obj6);
                Object obj7 = this.p0.a.m(l02, m1Var2, 0L).a;
                n0Var3 = m1Var2.c;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i18 = B;
            long h04 = g2.n0.h0(j10);
            long h05 = this.p0.b.b() ? g2.n0.h0(m1(this.p0)) : h04;
            w2.g0 g0Var5 = this.p0.b;
            this.m.c(11, new y(i10, d1Var, new d2.d1(obj3, l02, n0Var3, obj4, i18, h04, h05, g0Var5.b, g0Var5.c), 0));
        } else {
            z12 = booleanValue;
            z13 = equals2;
            z14 = z16;
        }
        if (z12) {
            this.m.c(1, new q(n0Var, intValue, 1));
        }
        if (j1Var2.f != j1Var.f) {
            final int i19 = 7;
            this.m.c(10, new g2.p() { // from class: k2.s
                @Override // g2.p
                public final void invoke(Object obj8) {
                    d2.c1 c1Var = (d2.c1) obj8;
                    switch (i19) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            c1Var.h(j1Var4.g);
                            c1Var.p(j1Var4.g);
                            break;
                        case 1:
                            j1 j1Var5 = j1Var;
                            c1Var.G(j1Var5.e, j1Var5.l);
                            break;
                        case 2:
                            c1Var.w(j1Var.e);
                            break;
                        case 3:
                            j1 j1Var6 = j1Var;
                            c1Var.r(j1Var6.m, j1Var6.l);
                            break;
                        case 4:
                            c1Var.g(j1Var.n);
                            break;
                        case 5:
                            c1Var.P(j1Var.m());
                            break;
                        case 6:
                            c1Var.H(j1Var.o);
                            break;
                        case 7:
                            c1Var.l(j1Var.f);
                            break;
                        case 8:
                            c1Var.o(j1Var.f);
                            break;
                        default:
                            c1Var.v(j1Var.i.d);
                            break;
                    }
                }
            });
            if (j1Var.f != null) {
                final int i20 = 8;
                this.m.c(10, new g2.p() { // from class: k2.s
                    @Override // g2.p
                    public final void invoke(Object obj8) {
                        d2.c1 c1Var = (d2.c1) obj8;
                        switch (i20) {
                            case 0:
                                j1 j1Var4 = j1Var;
                                c1Var.h(j1Var4.g);
                                c1Var.p(j1Var4.g);
                                break;
                            case 1:
                                j1 j1Var5 = j1Var;
                                c1Var.G(j1Var5.e, j1Var5.l);
                                break;
                            case 2:
                                c1Var.w(j1Var.e);
                                break;
                            case 3:
                                j1 j1Var6 = j1Var;
                                c1Var.r(j1Var6.m, j1Var6.l);
                                break;
                            case 4:
                                c1Var.g(j1Var.n);
                                break;
                            case 5:
                                c1Var.P(j1Var.m());
                                break;
                            case 6:
                                c1Var.H(j1Var.o);
                                break;
                            case 7:
                                c1Var.l(j1Var.f);
                                break;
                            case 8:
                                c1Var.o(j1Var.f);
                                break;
                            default:
                                c1Var.v(j1Var.i.d);
                                break;
                        }
                    }
                });
            }
        }
        z2.t tVar = j1Var2.i;
        z2.t tVar2 = j1Var.i;
        if (tVar != tVar2) {
            z2.s sVar = this.i;
            Object obj8 = tVar2.e;
            sVar.getClass();
            sVar.c = (z2.r) obj8;
            final int i21 = 9;
            this.m.c(2, new g2.p() { // from class: k2.s
                @Override // g2.p
                public final void invoke(Object obj82) {
                    d2.c1 c1Var = (d2.c1) obj82;
                    switch (i21) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            c1Var.h(j1Var4.g);
                            c1Var.p(j1Var4.g);
                            break;
                        case 1:
                            j1 j1Var5 = j1Var;
                            c1Var.G(j1Var5.e, j1Var5.l);
                            break;
                        case 2:
                            c1Var.w(j1Var.e);
                            break;
                        case 3:
                            j1 j1Var6 = j1Var;
                            c1Var.r(j1Var6.m, j1Var6.l);
                            break;
                        case 4:
                            c1Var.g(j1Var.n);
                            break;
                        case 5:
                            c1Var.P(j1Var.m());
                            break;
                        case 6:
                            c1Var.H(j1Var.o);
                            break;
                        case 7:
                            c1Var.l(j1Var.f);
                            break;
                        case 8:
                            c1Var.o(j1Var.f);
                            break;
                        default:
                            c1Var.v(j1Var.i.d);
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
            this.m.c(3, new g2.p() { // from class: k2.s
                @Override // g2.p
                public final void invoke(Object obj82) {
                    d2.c1 c1Var = (d2.c1) obj82;
                    switch (i22) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            c1Var.h(j1Var4.g);
                            c1Var.p(j1Var4.g);
                            break;
                        case 1:
                            j1 j1Var5 = j1Var;
                            c1Var.G(j1Var5.e, j1Var5.l);
                            break;
                        case 2:
                            c1Var.w(j1Var.e);
                            break;
                        case 3:
                            j1 j1Var6 = j1Var;
                            c1Var.r(j1Var6.m, j1Var6.l);
                            break;
                        case 4:
                            c1Var.g(j1Var.n);
                            break;
                        case 5:
                            c1Var.P(j1Var.m());
                            break;
                        case 6:
                            c1Var.H(j1Var.o);
                            break;
                        case 7:
                            c1Var.l(j1Var.f);
                            break;
                        case 8:
                            c1Var.o(j1Var.f);
                            break;
                        default:
                            c1Var.v(j1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z14 || z15) {
            final int i23 = 1;
            this.m.c(-1, new g2.p() { // from class: k2.s
                @Override // g2.p
                public final void invoke(Object obj82) {
                    d2.c1 c1Var = (d2.c1) obj82;
                    switch (i23) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            c1Var.h(j1Var4.g);
                            c1Var.p(j1Var4.g);
                            break;
                        case 1:
                            j1 j1Var5 = j1Var;
                            c1Var.G(j1Var5.e, j1Var5.l);
                            break;
                        case 2:
                            c1Var.w(j1Var.e);
                            break;
                        case 3:
                            j1 j1Var6 = j1Var;
                            c1Var.r(j1Var6.m, j1Var6.l);
                            break;
                        case 4:
                            c1Var.g(j1Var.n);
                            break;
                        case 5:
                            c1Var.P(j1Var.m());
                            break;
                        case 6:
                            c1Var.H(j1Var.o);
                            break;
                        case 7:
                            c1Var.l(j1Var.f);
                            break;
                        case 8:
                            c1Var.o(j1Var.f);
                            break;
                        default:
                            c1Var.v(j1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z14) {
            final int i24 = 2;
            this.m.c(4, new g2.p() { // from class: k2.s
                @Override // g2.p
                public final void invoke(Object obj82) {
                    d2.c1 c1Var = (d2.c1) obj82;
                    switch (i24) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            c1Var.h(j1Var4.g);
                            c1Var.p(j1Var4.g);
                            break;
                        case 1:
                            j1 j1Var5 = j1Var;
                            c1Var.G(j1Var5.e, j1Var5.l);
                            break;
                        case 2:
                            c1Var.w(j1Var.e);
                            break;
                        case 3:
                            j1 j1Var6 = j1Var;
                            c1Var.r(j1Var6.m, j1Var6.l);
                            break;
                        case 4:
                            c1Var.g(j1Var.n);
                            break;
                        case 5:
                            c1Var.P(j1Var.m());
                            break;
                        case 6:
                            c1Var.H(j1Var.o);
                            break;
                        case 7:
                            c1Var.l(j1Var.f);
                            break;
                        case 8:
                            c1Var.o(j1Var.f);
                            break;
                        default:
                            c1Var.v(j1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z15 || j1Var2.m != j1Var.m) {
            final int i25 = 3;
            this.m.c(5, new g2.p() { // from class: k2.s
                @Override // g2.p
                public final void invoke(Object obj82) {
                    d2.c1 c1Var = (d2.c1) obj82;
                    switch (i25) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            c1Var.h(j1Var4.g);
                            c1Var.p(j1Var4.g);
                            break;
                        case 1:
                            j1 j1Var5 = j1Var;
                            c1Var.G(j1Var5.e, j1Var5.l);
                            break;
                        case 2:
                            c1Var.w(j1Var.e);
                            break;
                        case 3:
                            j1 j1Var6 = j1Var;
                            c1Var.r(j1Var6.m, j1Var6.l);
                            break;
                        case 4:
                            c1Var.g(j1Var.n);
                            break;
                        case 5:
                            c1Var.P(j1Var.m());
                            break;
                        case 6:
                            c1Var.H(j1Var.o);
                            break;
                        case 7:
                            c1Var.l(j1Var.f);
                            break;
                        case 8:
                            c1Var.o(j1Var.f);
                            break;
                        default:
                            c1Var.v(j1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (j1Var2.n != j1Var.n) {
            final int i26 = 4;
            this.m.c(6, new g2.p() { // from class: k2.s
                @Override // g2.p
                public final void invoke(Object obj82) {
                    d2.c1 c1Var = (d2.c1) obj82;
                    switch (i26) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            c1Var.h(j1Var4.g);
                            c1Var.p(j1Var4.g);
                            break;
                        case 1:
                            j1 j1Var5 = j1Var;
                            c1Var.G(j1Var5.e, j1Var5.l);
                            break;
                        case 2:
                            c1Var.w(j1Var.e);
                            break;
                        case 3:
                            j1 j1Var6 = j1Var;
                            c1Var.r(j1Var6.m, j1Var6.l);
                            break;
                        case 4:
                            c1Var.g(j1Var.n);
                            break;
                        case 5:
                            c1Var.P(j1Var.m());
                            break;
                        case 6:
                            c1Var.H(j1Var.o);
                            break;
                        case 7:
                            c1Var.l(j1Var.f);
                            break;
                        case 8:
                            c1Var.o(j1Var.f);
                            break;
                        default:
                            c1Var.v(j1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (j1Var2.m() != j1Var.m()) {
            final int i27 = 5;
            this.m.c(7, new g2.p() { // from class: k2.s
                @Override // g2.p
                public final void invoke(Object obj82) {
                    d2.c1 c1Var = (d2.c1) obj82;
                    switch (i27) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            c1Var.h(j1Var4.g);
                            c1Var.p(j1Var4.g);
                            break;
                        case 1:
                            j1 j1Var5 = j1Var;
                            c1Var.G(j1Var5.e, j1Var5.l);
                            break;
                        case 2:
                            c1Var.w(j1Var.e);
                            break;
                        case 3:
                            j1 j1Var6 = j1Var;
                            c1Var.r(j1Var6.m, j1Var6.l);
                            break;
                        case 4:
                            c1Var.g(j1Var.n);
                            break;
                        case 5:
                            c1Var.P(j1Var.m());
                            break;
                        case 6:
                            c1Var.H(j1Var.o);
                            break;
                        case 7:
                            c1Var.l(j1Var.f);
                            break;
                        case 8:
                            c1Var.o(j1Var.f);
                            break;
                        default:
                            c1Var.v(j1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (!j1Var2.o.equals(j1Var.o)) {
            final int i28 = 6;
            this.m.c(12, new g2.p() { // from class: k2.s
                @Override // g2.p
                public final void invoke(Object obj82) {
                    d2.c1 c1Var = (d2.c1) obj82;
                    switch (i28) {
                        case 0:
                            j1 j1Var4 = j1Var;
                            c1Var.h(j1Var4.g);
                            c1Var.p(j1Var4.g);
                            break;
                        case 1:
                            j1 j1Var5 = j1Var;
                            c1Var.G(j1Var5.e, j1Var5.l);
                            break;
                        case 2:
                            c1Var.w(j1Var.e);
                            break;
                        case 3:
                            j1 j1Var6 = j1Var;
                            c1Var.r(j1Var6.m, j1Var6.l);
                            break;
                        case 4:
                            c1Var.g(j1Var.n);
                            break;
                        case 5:
                            c1Var.P(j1Var.m());
                            break;
                        case 6:
                            c1Var.H(j1Var.o);
                            break;
                        case 7:
                            c1Var.l(j1Var.f);
                            break;
                        case 8:
                            c1Var.o(j1Var.f);
                            break;
                        default:
                            c1Var.v(j1Var.i.d);
                            break;
                    }
                }
            });
        }
        B1();
        this.m.b();
        if (j1Var2.p != j1Var.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).a.E1();
            }
        }
    }

    @Override // d2.e1
    public final float E() {
        F1();
        return this.b0;
    }

    @Override // d2.e1
    public final boolean E0() {
        F1();
        return this.I;
    }

    public final void E1() {
        int h = h();
        di.a aVar = this.A;
        g2.q0 q0Var = this.z;
        boolean z10 = false;
        if (h != 1) {
            if (h == 2 || h == 3) {
                F1();
                boolean z11 = this.p0.p;
                if (u() && !z11) {
                    z10 = true;
                }
                q0Var.c(z10);
                aVar.a(u());
                return;
            }
            if (h != 4) {
                throw new IllegalStateException();
            }
        }
        q0Var.c(false);
        aVar.a(false);
    }

    @Override // d2.e1
    public final d2.s1 F0() {
        F1();
        return ((z2.n) this.i).j();
    }

    public final void F1() {
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = g2.n0.a;
            Locale locale = Locale.US;
            String q10 = org.telegram.ui.Cells.f1.q("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f0) {
                throw new IllegalStateException(q10);
            }
            g2.a.m("ExoPlayerImpl", q10, this.g0 ? null : new IllegalStateException());
            this.g0 = true;
        }
    }

    @Override // d2.e1
    public final d2.f G() {
        F1();
        return this.a0;
    }

    @Override // d2.e1
    public final long G0() {
        F1();
        if (this.p0.a.p()) {
            return this.r0;
        }
        j1 j1Var = this.p0;
        long j10 = 0;
        if (j1Var.k.d != j1Var.b.d) {
            return g2.n0.h0(j1Var.a.m(l0(), (d2.m1) this.a, 0L).m);
        }
        long j11 = j1Var.q;
        if (this.p0.k.b()) {
            j1 j1Var2 = this.p0;
            j1Var2.a.g(j1Var2.k.a, this.o).d(this.p0.k.b);
        } else {
            j10 = j11;
        }
        j1 j1Var3 = this.p0;
        d2.n1 n1Var = j1Var3.a;
        Object obj = j1Var3.k.a;
        d2.k1 k1Var = this.o;
        n1Var.g(obj, k1Var);
        return g2.n0.h0(j10 + k1Var.e);
    }

    @Override // d2.e1
    public final void H(int i3, boolean z10) {
        F1();
    }

    @Override // d2.e1
    public final void H0(int i3) {
        F1();
    }

    @Override // d2.e1
    public final d2.p I() {
        F1();
        return this.j0;
    }

    @Override // d2.e1
    public final void J() {
        F1();
    }

    @Override // d2.e1
    public final void K(int i3, int i10) {
        F1();
    }

    @Override // d2.e1
    public final void L(int i3) {
        F1();
    }

    @Override // d2.e1
    public final d2.q0 L0() {
        F1();
        return this.Q;
    }

    @Override // d2.e1
    public final int M() {
        F1();
        if (n()) {
            return this.p0.b.c;
        }
        return -1;
    }

    @Override // d2.e1
    public final void M0(List list) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(-1, -9223372036854775807L, g12, true);
    }

    @Override // d2.e1
    public final long N0() {
        F1();
        return g2.n0.h0(j1(this.p0));
    }

    @Override // d2.e1
    public final long O0() {
        F1();
        return this.l0;
    }

    @Override // d2.e1
    public final void P(int i3, int i10) {
        F1();
        zb.f(i3 >= 0 && i10 >= i3);
        int size = this.p.size();
        int min = Math.min(i10, size);
        if (i3 >= size || i3 == min) {
            return;
        }
        j1 r12 = r1(this.p0, i3, min);
        D1(r12, 0, !r12.b.a.equals(this.p0.b.a), 4, j1(r12), -1, false);
    }

    @Override // d2.e1
    public final void Q(SurfaceHolder surfaceHolder) {
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

    @Override // d2.e1
    public final void R(float f10) {
        F1();
        float h = g2.n0.h(f10, 0.0f, 1.0f);
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

    @Override // d2.e1
    public final void T(List list, int i3, long j10) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        v1(i3, j10, g12, false);
    }

    @Override // d2.e1
    public final d2.x0 U() {
        F1();
        return this.p0.f;
    }

    @Override // d2.e1
    public final void V(boolean z10) {
        F1();
        C1(1, z10);
    }

    @Override // d2.e1
    public final long X() {
        F1();
        return this.m0;
    }

    @Override // ci.u0
    public final void X0() {
        boolean z10;
        g2.a.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + g2.n0.a + "] [" + d2.o0.b() + "]");
        F1();
        this.y.A();
        this.z.c(false);
        this.A.a(false);
        h0 h0Var = this.E;
        if (h0Var != null && Build.VERSION.SDK_INT >= 34) {
            h0.a(h0Var);
        }
        g2.f0 f0Var = this.D;
        ((g2.j0) f0Var.f).a.removeCallbacksAndMessages(null);
        ((i0) f0Var.a).s((g2.a0) f0Var.b);
        r0 r0Var = this.l;
        if (r0Var.a0 || !r0Var.s.getThread().isAlive()) {
            z10 = true;
        } else {
            r0Var.a0 = true;
            g2.j jVar = new g2.j(r0Var.G);
            r0Var.n.b(7, jVar).b();
            z10 = jVar.c(r0Var.L);
        }
        if (!z10) {
            this.m.e(10, new y3(7));
        }
        this.m.d();
        this.j.a.removeCallbacksAndMessages(null);
        a3.d dVar = this.u;
        l2.f fVar = this.s;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((a3.g) dVar).c.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            a3.c cVar = (a3.c) it.next();
            if (cVar.b == fVar) {
                cVar.c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        j1 j1Var = this.p0;
        if (j1Var.p) {
            this.p0 = j1Var.a();
        }
        j1 n12 = n1(this.p0, 1);
        this.p0 = n12;
        j1 c2 = n12.c(n12.b);
        this.p0 = c2;
        c2.q = c2.s;
        this.p0.r = 0L;
        l2.f fVar2 = this.s;
        g2.j0 j0Var = fVar2.n;
        j0Var.getClass();
        j0Var.d(new f6(fVar2, 28));
        s1();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.e0 = f2.c.d;
        this.i0 = true;
    }

    @Override // d2.e1
    public final long Y() {
        F1();
        return i1(this.p0);
    }

    @Override // ci.u0
    public final void Y0(int i3, long j10, boolean z10) {
        F1();
        if (i3 == -1) {
            return;
        }
        zb.f(i3 >= 0);
        d2.n1 n1Var = this.p0.a;
        if (n1Var.p() || i3 < n1Var.o()) {
            l2.f fVar = this.s;
            if (!fVar.r) {
                l2.a Q = fVar.Q();
                fVar.r = true;
                fVar.V(Q, -1, new y8(Q, 25));
            }
            this.J++;
            if (n()) {
                g2.a.l("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                o0 o0Var = new o0(this.p0);
                o0Var.f(1);
                i0 i0Var = this.k.b;
                i0Var.j.d(new ii.e(10, i0Var, o0Var));
                return;
            }
            j1 j1Var = this.p0;
            int i10 = j1Var.e;
            if (i10 == 3 || (i10 == 4 && !n1Var.p())) {
                j1Var = this.p0.h(2);
            }
            int l02 = l0();
            j1 o12 = o1(j1Var, n1Var, p1(n1Var, i3, j10));
            this.l.n.b(3, new q0(n1Var, i3, g2.n0.S(j10))).b();
            D1(o12, 0, true, 1, j1(o12), l02, z10);
        }
    }

    @Override // d2.e1
    public final void Z(int i3, List list) {
        F1();
        ArrayList g12 = g1(list);
        F1();
        zb.f(i3 >= 0);
        int min = Math.min(i3, this.p.size());
        if (!this.p0.a.p()) {
            D1(e1(this.p0, min, g12), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z10 = this.q0 == -1;
        F1();
        v1(-1, -9223372036854775807L, g12, z10);
    }

    @Override // d2.e1
    public final void a() {
        F1();
        j1 j1Var = this.p0;
        if (j1Var.e != 1) {
            return;
        }
        j1 f10 = j1Var.f(null);
        j1 n12 = n1(f10, f10.a.p() ? 4 : 2);
        this.J++;
        this.l.n.a(29).b();
        D1(n12, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // d2.e1
    public final void a0() {
        F1();
        if (this.b0 == 0.0f) {
            float f10 = this.c0;
            if (f10 != 0.0f) {
                R(f10);
            }
        }
    }

    @Override // d2.e1
    public final long b0() {
        F1();
        if (!n()) {
            return G0();
        }
        j1 j1Var = this.p0;
        return j1Var.k.equals(j1Var.b) ? g2.n0.h0(this.p0.q) : getDuration();
    }

    @Override // d2.e1
    public final void c(d2.y0 y0Var) {
        F1();
        if (this.p0.o.equals(y0Var)) {
            return;
        }
        j1 g7 = this.p0.g(y0Var);
        this.J++;
        this.l.n.b(4, y0Var).b();
        D1(g7, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // d2.e1
    public final boolean d() {
        F1();
        return this.p0.g;
    }

    @Override // d2.e1
    public final void e0(int i3) {
        F1();
    }

    public final j1 e1(j1 j1Var, int i3, ArrayList arrayList) {
        d2.n1 n1Var = j1Var.a;
        this.J++;
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.p;
            if (i10 >= size) {
                this.O = this.O.f(i3, arrayList2.size());
                o1 o1Var = new o1(arrayList3, this.O);
                j1 o12 = o1(j1Var, o1Var, l1(n1Var, o1Var, k1(j1Var), i1(j1Var)));
                w2.i1 i1Var = this.O;
                g2.j0 j0Var = this.l.n;
                m0 m0Var = new m0(arrayList2, i1Var, -1, -9223372036854775807L);
                j0Var.getClass();
                g2.i0 c2 = g2.j0.c();
                c2.a = j0Var.a.obtainMessage(18, i3, 0, m0Var);
                c2.b();
                return o12;
            }
            h1 h1Var = new h1((w2.a) arrayList.get(i10), this.q);
            arrayList2.add(h1Var);
            arrayList3.add(i10 + i3, new e0(h1Var.b, h1Var.a));
            i10++;
        }
    }

    @Override // d2.e1
    public final v1 f0() {
        F1();
        return this.p0.i.d;
    }

    public final d2.q0 f1() {
        d2.n1 y02 = y0();
        if (y02.p()) {
            return this.o0;
        }
        d2.n0 n0Var = y02.m(l0(), (d2.m1) this.a, 0L).c;
        d2.p0 a10 = this.o0.a();
        d2.q0 q0Var = n0Var.d;
        if (q0Var != null) {
            g9.i0 i0Var = q0Var.K;
            byte[] bArr = q0Var.k;
            CharSequence charSequence = q0Var.a;
            if (charSequence != null) {
                a10.a = charSequence;
            }
            CharSequence charSequence2 = q0Var.b;
            if (charSequence2 != null) {
                a10.b = charSequence2;
            }
            CharSequence charSequence3 = q0Var.c;
            if (charSequence3 != null) {
                a10.c = charSequence3;
            }
            CharSequence charSequence4 = q0Var.d;
            if (charSequence4 != null) {
                a10.d = charSequence4;
            }
            CharSequence charSequence5 = q0Var.e;
            if (charSequence5 != null) {
                a10.e = charSequence5;
            }
            CharSequence charSequence6 = q0Var.f;
            if (charSequence6 != null) {
                a10.f = charSequence6;
            }
            CharSequence charSequence7 = q0Var.g;
            if (charSequence7 != null) {
                a10.g = charSequence7;
            }
            Long l10 = q0Var.h;
            if (l10 != null) {
                zb.f(l10.longValue() >= 0);
                a10.h = l10;
            }
            d2.f1 f1Var = q0Var.i;
            if (f1Var != null) {
                a10.i = f1Var;
            }
            d2.f1 f1Var2 = q0Var.j;
            if (f1Var2 != null) {
                a10.j = f1Var2;
            }
            Uri uri = q0Var.n;
            if (uri != null || bArr != null) {
                a10.n = uri;
                a10.b(bArr, q0Var.m);
                a10.l = q0Var.l;
            }
            Integer num = q0Var.o;
            if (num != null) {
                a10.o = num;
            }
            Integer num2 = q0Var.p;
            if (num2 != null) {
                a10.p = num2;
            }
            Integer num3 = q0Var.q;
            if (num3 != null) {
                a10.q = num3;
            }
            Boolean bool = q0Var.r;
            if (bool != null) {
                a10.r = bool;
            }
            Boolean bool2 = q0Var.s;
            if (bool2 != null) {
                a10.s = bool2;
            }
            Integer num4 = q0Var.t;
            if (num4 != null) {
                a10.t = num4;
            }
            Integer num5 = q0Var.u;
            if (num5 != null) {
                a10.t = num5;
            }
            Integer num6 = q0Var.v;
            if (num6 != null) {
                a10.u = num6;
            }
            Integer num7 = q0Var.w;
            if (num7 != null) {
                a10.v = num7;
            }
            Integer num8 = q0Var.x;
            if (num8 != null) {
                a10.w = num8;
            }
            Integer num9 = q0Var.y;
            if (num9 != null) {
                a10.x = num9;
            }
            Integer num10 = q0Var.z;
            if (num10 != null) {
                a10.y = num10;
            }
            CharSequence charSequence8 = q0Var.A;
            if (charSequence8 != null) {
                a10.z = charSequence8;
            }
            CharSequence charSequence9 = q0Var.B;
            if (charSequence9 != null) {
                a10.A = charSequence9;
            }
            CharSequence charSequence10 = q0Var.C;
            if (charSequence10 != null) {
                a10.B = charSequence10;
            }
            Integer num11 = q0Var.D;
            if (num11 != null) {
                a10.C = num11;
            }
            Integer num12 = q0Var.E;
            if (num12 != null) {
                a10.D = num12;
            }
            CharSequence charSequence11 = q0Var.F;
            if (charSequence11 != null) {
                a10.E = charSequence11;
            }
            CharSequence charSequence12 = q0Var.G;
            if (charSequence12 != null) {
                a10.F = charSequence12;
            }
            CharSequence charSequence13 = q0Var.H;
            if (charSequence13 != null) {
                a10.G = charSequence13;
            }
            Integer num13 = q0Var.I;
            if (num13 != null) {
                a10.H = num13;
            }
            Bundle bundle = q0Var.J;
            if (bundle != null) {
                a10.I = bundle;
            }
            if (!i0Var.isEmpty()) {
                a10.J = g9.i0.q(i0Var);
            }
        }
        return new d2.q0(a10);
    }

    @Override // d2.e1
    public final d2.y0 g() {
        F1();
        return this.p0.o;
    }

    @Override // d2.e1
    public final void g0(d2.s1 s1Var) {
        F1();
        z2.s sVar = this.i;
        sVar.getClass();
        d2.s1 F0 = F0();
        if (!s1Var.equals(((z2.n) sVar).j())) {
            sVar.b(s1Var);
        }
        if (F0.equals(s1Var)) {
            return;
        }
        this.m.e(19, new y8(s1Var, 19));
    }

    public final ArrayList g1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            arrayList.add(this.r.c((d2.n0) list.get(i3)));
        }
        return arrayList;
    }

    @Override // d2.e1
    public final long getDuration() {
        F1();
        if (!n()) {
            return A();
        }
        j1 j1Var = this.p0;
        w2.g0 g0Var = j1Var.b;
        d2.n1 n1Var = j1Var.a;
        Object obj = g0Var.a;
        d2.k1 k1Var = this.o;
        n1Var.g(obj, k1Var);
        return g2.n0.h0(k1Var.a(g0Var.b, g0Var.c));
    }

    @Override // d2.e1
    public final int h() {
        F1();
        return this.p0.e;
    }

    @Override // d2.e1
    public final d2.q0 h0() {
        F1();
        return this.R;
    }

    public final m1 h1(l1 l1Var) {
        int k1 = k1(this.p0);
        d2.n1 n1Var = this.p0.a;
        if (k1 == -1) {
            k1 = 0;
        }
        r0 r0Var = this.l;
        return new m1(r0Var, l1Var, n1Var, k1, r0Var.s);
    }

    @Override // d2.e1
    public final int i() {
        F1();
        return 0;
    }

    public final long i1(j1 j1Var) {
        w2.g0 g0Var = j1Var.b;
        long j10 = j1Var.c;
        d2.n1 n1Var = j1Var.a;
        if (!g0Var.b()) {
            return g2.n0.h0(j1(j1Var));
        }
        Object obj = j1Var.b.a;
        d2.k1 k1Var = this.o;
        n1Var.g(obj, k1Var);
        if (j10 == -9223372036854775807L) {
            return g2.n0.h0(n1Var.m(k1(j1Var), (d2.m1) this.a, 0L).l);
        }
        return g2.n0.h0(j10) + g2.n0.h0(k1Var.e);
    }

    @Override // d2.e1
    public final f2.c j0() {
        F1();
        return this.e0;
    }

    public final long j1(j1 j1Var) {
        if (j1Var.a.p()) {
            return g2.n0.S(this.r0);
        }
        long l10 = j1Var.p ? j1Var.l() : j1Var.s;
        if (j1Var.b.b()) {
            return l10;
        }
        d2.n1 n1Var = j1Var.a;
        Object obj = j1Var.b.a;
        d2.k1 k1Var = this.o;
        n1Var.g(obj, k1Var);
        return l10 + k1Var.e;
    }

    @Override // d2.e1
    public final void k(int i3) {
        F1();
        if (this.H != i3) {
            this.H = i3;
            g2.j0 j0Var = this.l.n;
            j0Var.getClass();
            g2.i0 c2 = g2.j0.c();
            c2.a = j0Var.a.obtainMessage(11, i3, 0);
            c2.b();
            v vVar = new v(i3, 0);
            g2.s sVar = this.m;
            sVar.c(8, vVar);
            B1();
            sVar.b();
        }
    }

    @Override // d2.e1
    public final int k0() {
        F1();
        if (n()) {
            return this.p0.b.b;
        }
        return -1;
    }

    public final int k1(j1 j1Var) {
        return j1Var.a.p() ? this.q0 : j1Var.a.g(j1Var.b.a, this.o).c;
    }

    @Override // d2.e1
    public final void l(d2.q0 q0Var) {
        F1();
        q0Var.getClass();
        if (q0Var.equals(this.R)) {
            return;
        }
        this.R = q0Var;
        this.m.e(15, new w(this, 3));
    }

    @Override // d2.e1
    public final int l0() {
        F1();
        int k1 = k1(this.p0);
        if (k1 == -1) {
            return 0;
        }
        return k1;
    }

    public final Pair l1(d2.n1 n1Var, o1 o1Var, int i3, long j10) {
        if (n1Var.p() || o1Var.p()) {
            boolean z10 = !n1Var.p() && o1Var.p();
            return p1(o1Var, z10 ? -1 : i3, z10 ? -9223372036854775807L : j10);
        }
        Pair i10 = n1Var.i((d2.m1) this.a, this.o, i3, g2.n0.S(j10));
        Object obj = i10.first;
        if (o1Var.b(obj) != -1) {
            return i10;
        }
        int U = r0.U((d2.m1) this.a, this.o, this.H, this.I, obj, n1Var, o1Var);
        if (U == -1) {
            return p1(o1Var, -1, -9223372036854775807L);
        }
        d2.m1 m1Var = (d2.m1) this.a;
        o1Var.m(U, m1Var, 0L);
        return p1(o1Var, U, g2.n0.h0(m1Var.l));
    }

    @Override // d2.e1
    public final int m() {
        F1();
        return this.H;
    }

    @Override // d2.e1
    public final boolean n() {
        F1();
        return this.p0.b.b();
    }

    @Override // d2.e1
    public final void o0(boolean z10) {
        F1();
    }

    public final j1 o1(j1 j1Var, d2.n1 n1Var, Pair pair) {
        List list;
        zb.f(n1Var.p() || pair != null);
        d2.n1 n1Var2 = j1Var.a;
        long i12 = i1(j1Var);
        j1 j10 = j1Var.j(n1Var);
        if (n1Var.p()) {
            w2.g0 g0Var = j1.u;
            long S = g2.n0.S(this.r0);
            j1 c2 = j10.d(g0Var, S, S, S, 0L, w2.r1.d, this.b, g9.s1.e).c(g0Var);
            c2.q = c2.s;
            return c2;
        }
        Object obj = j10.b.a;
        String str = g2.n0.a;
        boolean equals = obj.equals(pair.first);
        w2.g0 g0Var2 = !equals ? new w2.g0(pair.first) : j10.b;
        long longValue = ((Long) pair.second).longValue();
        long S2 = g2.n0.S(i12);
        if (!n1Var2.p()) {
            S2 -= n1Var2.g(obj, this.o).e;
            if (equals && S2 - longValue == 1 && S2 == n1Var2.g(obj, this.o).d) {
                S2--;
            }
        }
        if (!equals || longValue < S2) {
            w2.g0 g0Var3 = g0Var2;
            zb.p(!g0Var3.b());
            w2.r1 r1Var = !equals ? w2.r1.d : j10.h;
            z2.t tVar = !equals ? this.b : j10.i;
            if (equals) {
                list = j10.j;
            } else {
                g9.g0 g0Var4 = g9.i0.b;
                list = g9.s1.e;
            }
            j1 c10 = j10.d(g0Var3, longValue, longValue, longValue, 0L, r1Var, tVar, list).c(g0Var3);
            c10.q = longValue;
            return c10;
        }
        if (longValue != S2) {
            w2.g0 g0Var5 = g0Var2;
            zb.p(!g0Var5.b());
            long max = Math.max(0L, j10.r - (longValue - S2));
            long j11 = j10.q;
            if (j10.k.equals(j10.b)) {
                j11 = longValue + max;
            }
            j1 d = j10.d(g0Var5, longValue, longValue, longValue, max, j10.h, j10.i, j10.j);
            d.q = j11;
            return d;
        }
        int b10 = n1Var.b(j10.k.a);
        if (b10 != -1 && n1Var.f(b10, this.o, false).c == n1Var.g(g0Var2.a, this.o).c) {
            return j10;
        }
        n1Var.g(g0Var2.a, this.o);
        long a10 = g0Var2.b() ? this.o.a(g0Var2.b, g0Var2.c) : this.o.d;
        w2.g0 g0Var6 = g0Var2;
        j1 c11 = j10.d(g0Var6, j10.s, j10.s, j10.d, a10 - j10.s, j10.h, j10.i, j10.j).c(g0Var6);
        c11.q = a10;
        return c11;
    }

    @Override // d2.e1
    public final void p0(List list, int i3, int i10) {
        F1();
        zb.f(i3 >= 0 && i10 >= i3);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        if (i3 > size) {
            return;
        }
        int min = Math.min(i10, size);
        if (min - i3 == list.size()) {
            for (int i11 = i3; i11 < min; i11++) {
                if (((e0) arrayList.get(i11)).b.k.a((d2.n0) list.get(i11 - i3))) {
                }
            }
            this.J++;
            g2.j0 j0Var = this.l.n;
            j0Var.getClass();
            g2.i0 c2 = g2.j0.c();
            c2.a = j0Var.a.obtainMessage(27, i3, min, list);
            c2.b();
            for (int i12 = i3; i12 < min; i12++) {
                e0 e0Var = (e0) arrayList.get(i12);
                d2.n1 n1Var = e0Var.c;
                d2.n0 n0Var = (d2.n0) list.get(i12 - i3);
                e0Var.c = n1Var instanceof w2.q1 ? new w2.q1(((w2.q1) n1Var).e, n0Var) : new w2.q1(n1Var, n0Var);
            }
            D1(this.p0.j(new o1(arrayList, this.O)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList g12 = g1(list);
        if (!this.p0.a.p()) {
            j1 r12 = r1(e1(this.p0, min, g12), i3, min);
            D1(r12, 0, !r12.b.a.equals(this.p0.b.a), 4, j1(r12), -1, false);
        } else {
            boolean z10 = this.q0 == -1;
            F1();
            v1(-1, -9223372036854775807L, g12, z10);
        }
    }

    public final Pair p1(d2.n1 n1Var, int i3, long j10) {
        if (n1Var.p()) {
            this.q0 = i3;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.r0 = j10;
            return null;
        }
        if (i3 == -1 || i3 >= n1Var.o()) {
            i3 = n1Var.a(this.I);
            j10 = g2.n0.h0(n1Var.m(i3, (d2.m1) this.a, 0L).l);
        }
        return n1Var.i((d2.m1) this.a, this.o, i3, g2.n0.S(j10));
    }

    @Override // d2.e1
    public final long q() {
        F1();
        return g2.n0.h0(this.p0.r);
    }

    public final void q1(int i3, int i10) {
        g2.z zVar = this.Z;
        if (i3 == zVar.a && i10 == zVar.b) {
            return;
        }
        this.Z = new g2.z(i3, i10);
        e51 e51Var = this.s0;
        if (e51Var != null) {
            e51Var.execute(new u(this, i3, i10, 0));
            return;
        }
        this.m.e(24, new hh.c(i3, i10, 1));
        t1(2, 14, new g2.z(i3, i10));
    }

    @Override // d2.e1
    public final void r0(int i3, int i10, int i11) {
        F1();
        zb.f(i3 >= 0 && i3 <= i10 && i11 >= 0);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int min = Math.min(i10, size);
        int min2 = Math.min(i11, size - (min - i3));
        if (i3 >= size || i3 == min || i3 == min2) {
            return;
        }
        d2.n1 y02 = y0();
        this.J++;
        g2.n0.R(i3, min, min2, arrayList);
        this.O = this.O.g();
        o1 o1Var = new o1(arrayList, this.O);
        j1 j1Var = this.p0;
        j1 o12 = o1(j1Var, o1Var, l1(y02, o1Var, k1(j1Var), i1(this.p0)));
        w2.i1 i1Var = this.O;
        r0 r0Var = this.l;
        r0Var.getClass();
        r0Var.n.b(19, new n0(i3, min, min2, i1Var)).b();
        D1(o12, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final j1 r1(j1 j1Var, int i3, int i10) {
        ArrayList arrayList;
        int k1 = k1(j1Var);
        long i12 = i1(j1Var);
        d2.n1 n1Var = j1Var.a;
        this.J++;
        int i11 = i10 - 1;
        while (true) {
            arrayList = this.p;
            if (i11 < i3) {
                break;
            }
            arrayList.remove(i11);
            i11--;
        }
        this.O = this.O.a(i3, i10);
        o1 o1Var = new o1(arrayList, this.O);
        j1 o12 = o1(j1Var, o1Var, l1(n1Var, o1Var, k1, i12));
        int i13 = o12.e;
        if (i13 != 1 && i13 != 4 && k1 >= i3 && k1 < i10) {
            if (r0.U((d2.m1) this.a, this.o, this.H, this.I, j1Var.b.a, n1Var, o1Var) == -1) {
                o12 = n1(o12, 4);
            }
        }
        w2.i1 i1Var = this.O;
        g2.j0 j0Var = this.l.n;
        j0Var.getClass();
        g2.i0 c2 = g2.j0.c();
        c2.a = j0Var.a.obtainMessage(20, i3, i10, i1Var);
        c2.b();
        return o12;
    }

    @Override // d2.e1
    public final void s(d2.c1 c1Var) {
        F1();
        c1Var.getClass();
        g2.s sVar = this.m;
        if (sVar.i) {
            zb.p(Thread.currentThread() == sVar.a);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = sVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            g2.r rVar = (g2.r) it.next();
            if (rVar.a.equals(c1Var)) {
                g2.q qVar = sVar.c;
                rVar.d = true;
                if (qVar != null && rVar.c) {
                    rVar.c = false;
                    qVar.e(rVar.a, rVar.b.d());
                }
                copyOnWriteArraySet.remove(rVar);
            }
        }
    }

    public final void s1() {
        TextureView textureView = this.X;
        c0 c0Var = this.w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != c0Var) {
                g2.a.l("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
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

    @Override // ci.u0, d2.e1
    public final void stop() {
        F1();
        A1(null);
        this.e0 = new f2.c(this.p0.s, g9.s1.e);
    }

    @Override // d2.e1
    public final d2.a1 t() {
        F1();
        return this.P;
    }

    @Override // d2.e1
    public final int t0() {
        F1();
        return this.p0.n;
    }

    public final void t1(int i3, int i10, Object obj) {
        for (b bVar : this.g) {
            if (i3 == -1 || bVar.b == i3) {
                m1 h12 = h1(bVar);
                zb.p(!h12.f);
                h12.c = i10;
                zb.p(!h12.f);
                h12.d = obj;
                h12.b();
            }
        }
        for (b bVar2 : this.h) {
            if (bVar2 != null && (i3 == -1 || bVar2.b == i3)) {
                m1 h13 = h1(bVar2);
                zb.p(!h13.f);
                h13.c = i10;
                zb.p(!h13.f);
                h13.d = obj;
                h13.b();
            }
        }
    }

    @Override // d2.e1
    public final boolean u() {
        F1();
        return this.p0.l;
    }

    @Override // d2.e1
    public final void u0(d2.c1 c1Var) {
        c1Var.getClass();
        this.m.a(c1Var);
    }

    public final void u1(w2.a aVar, boolean z10) {
        F1();
        List singletonList = Collections.singletonList(aVar);
        F1();
        v1(-1, -9223372036854775807L, singletonList, z10);
    }

    public final void v1(int i3, long j10, List list, boolean z10) {
        int i10;
        long j11;
        int k1 = k1(this.p0);
        long N0 = N0();
        this.J++;
        ArrayList arrayList = this.p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            h1 h1Var = new h1((w2.a) list.get(i11), this.q);
            arrayList2.add(h1Var);
            arrayList.add(i11, new e0(h1Var.b, h1Var.a));
        }
        this.O = this.O.c(arrayList2.size());
        o1 o1Var = new o1(arrayList, this.O);
        boolean p10 = o1Var.p();
        int i12 = o1Var.h;
        if (!p10 && i3 >= i12) {
            throw new d2.y();
        }
        if (z10) {
            j11 = -9223372036854775807L;
            i10 = o1Var.a(this.I);
        } else if (i3 == -1) {
            i10 = k1;
            j11 = N0;
        } else {
            i10 = i3;
            j11 = j10;
        }
        j1 o12 = o1(this.p0, o1Var, p1(o1Var, i10, j11));
        int i13 = o12.e;
        if (i13 == 1) {
            i13 = 1;
        } else {
            if (!o1Var.p()) {
                if (i10 != -1) {
                    if (i10 < i12) {
                        i13 = 2;
                    }
                }
            }
            i13 = 4;
        }
        j1 n12 = n1(o12, i13);
        this.l.n.b(17, new m0(arrayList2, this.O, i10, g2.n0.S(j11))).b();
        D1(n12, 0, (this.p0.b.a.equals(n12.b.a) || this.p0.a.p()) ? false : true, 4, j1(n12), -1, false);
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

    @Override // d2.e1
    public final void x(boolean z10) {
        F1();
        if (this.I != z10) {
            this.I = z10;
            g2.j0 j0Var = this.l.n;
            j0Var.getClass();
            g2.i0 c2 = g2.j0.c();
            c2.a = j0Var.a.obtainMessage(12, z10 ? 1 : 0, 0);
            c2.b();
            x xVar = new x(0, z10);
            g2.s sVar = this.m;
            sVar.c(9, xVar);
            B1();
            sVar.b();
        }
    }

    public final void x1(Surface surface) {
        Object obj = this.T;
        boolean z10 = true;
        boolean z11 = (obj == null || obj == surface) ? false : true;
        long j10 = z11 ? this.B : -9223372036854775807L;
        r0 r0Var = this.l;
        if (!r0Var.a0 && r0Var.s.getThread().isAlive()) {
            g2.j jVar = new g2.j(r0Var.G);
            r0Var.n.b(30, new Pair(surface, jVar)).b();
            if (j10 != -9223372036854775807L) {
                z10 = jVar.c(j10);
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
        A1(new l(2, new androidx.car.app.j("Detaching surface timed out."), 1003));
    }

    @Override // d2.e1
    public final d2.n1 y0() {
        F1();
        return this.p0.a;
    }

    public final void y1(Surface surface) {
        F1();
        s1();
        x1(surface);
        int i3 = surface == null ? 0 : -1;
        q1(i3, i3);
    }

    @Override // d2.e1
    public final long z() {
        F1();
        return this.n0;
    }

    @Override // d2.e1
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
            g2.a.l("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
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
