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
import android.view.SurfaceView;
import android.view.TextureView;
import b2.q1;
import b2.s1;
import b2.x1;
import bi.g2;
import fg.e2;
import gg.v1;
import hi.y1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import m.g3;
import org.telegram.ui.Cells.r6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class e0 extends b2.g implements r {
    public final com.google.firebase.messaging.m A;
    public final c3.k0 B;
    public final c3.k0 C;
    public final long D;
    public final e2.c E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public final n1 K;
    public o1 L;
    public u2.i1 M;
    public b2.x0 N;
    public b2.n0 O;
    public b2.n0 P;
    public b2.s Q;
    public Object R;
    public Surface S;
    public SurfaceHolder T;
    public boolean U;
    public TextureView V;
    public final int W;
    public e2.w X;
    public b2.e Y;
    public float Z;
    public boolean a0;
    public final x2.v b;
    public d2.c b0;
    public final b2.x0 c;
    public final boolean c0;
    public final e2.g d;
    public boolean d0;
    public final Context e;
    public final int e0;
    public final e0 f;
    public boolean f0;
    public final f[] g;
    public final b2.l g0;
    public final f[] h;
    public x1 h0;
    public final x2.u i;
    public b2.n0 i0;
    public final e2.z j;
    public f1 j0;
    public final w k;
    public int k0;
    public final n0 l;
    public long l0;
    public final e2.p m;
    public org.telegram.messenger.e1 m0;
    public final CopyOnWriteArraySet n;
    public final ArrayList n0;
    public final b2.h1 o;
    public final ArrayList p;
    public final boolean q;
    public final u2.f0 r;
    public final j2.e s;
    public final Looper t;
    public final y2.c u;
    public final long v;
    public final long w;
    public final long x;
    public final b0 y;
    public final c0 z;

    static {
        b2.l0.a("media3.exoplayer");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(p pVar) {
        super(0);
        e0 e0Var;
        e0 e0Var2;
        Handler.Callback callback;
        int i10 = 0;
        this.n0 = new ArrayList();
        this.d = new e2.g();
        try {
            e2.a.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.a + "]");
            Context context = pVar.a;
            e2.x xVar = pVar.b;
            this.e = context.getApplicationContext();
            this.s = new j2.e(xVar);
            this.e0 = pVar.i;
            this.Y = pVar.j;
            this.W = pVar.k;
            this.a0 = false;
            this.D = pVar.t;
            b0 b0Var = new b0(this);
            this.y = b0Var;
            this.z = new c0();
            f[] b10 = ((l) pVar.c.get()).b(new Handler(pVar.h), b0Var, b0Var, b0Var, b0Var);
            this.g = b10;
            int i11 = 1;
            e2.d.g(b10.length > 0);
            this.h = new f[b10.length];
            int i12 = 0;
            while (true) {
                f[] fVarArr = this.h;
                if (i12 >= fVarArr.length) {
                    break;
                }
                int i13 = this.g[i12].b;
                fVarArr[i12] = null;
                i12++;
            }
            x2.u uVar = (x2.u) pVar.e.get();
            this.i = uVar;
            this.r = (u2.f0) pVar.d.get();
            y2.f b11 = y2.f.b(pVar.g.b);
            this.u = b11;
            this.q = pVar.l;
            this.L = pVar.m;
            this.v = pVar.o;
            this.w = pVar.p;
            this.x = pVar.q;
            this.K = pVar.n;
            Looper looper = pVar.h;
            this.t = looper;
            this.f = this;
            this.m = new e2.p(looper, xVar, new w(this, i10));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.n = copyOnWriteArraySet;
            this.p = new ArrayList();
            this.M = new u2.g1();
            f[] fVarArr2 = this.g;
            x2.v vVar = new x2.v(new l1[fVarArr2.length], new x2.r[fVarArr2.length], s1.b, null);
            this.b = vVar;
            this.o = new b2.h1();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int length = iArr.length;
            while (i10 < length) {
                int i14 = iArr[i10];
                e2.d.g(!false);
                sparseBooleanArray.append(i14, true);
                i10++;
            }
            uVar.getClass();
            e2.d.g(!false);
            sparseBooleanArray.append(29, true);
            e2.d.g(!false);
            b2.q qVar = new b2.q(sparseBooleanArray);
            this.c = new b2.x0(qVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i15 = 0; i15 < qVar.a.size(); i15++) {
                int a2 = qVar.a(i15);
                e2.d.g(!false);
                sparseBooleanArray2.append(a2, true);
            }
            e2.d.g(!false);
            sparseBooleanArray2.append(4, true);
            e2.d.g(!false);
            sparseBooleanArray2.append(10, true);
            e2.d.g(!false);
            this.N = new b2.x0(new b2.q(sparseBooleanArray2));
            this.j = xVar.a(looper, null);
            w wVar = new w(this, i11);
            this.k = wVar;
            this.j0 = f1.k(vVar);
            this.s.r(this, looper);
            j2.k kVar = new j2.k(pVar.w);
            n0 n0Var = new n0(this.e, this.g, this.h, uVar, vVar, (k) pVar.f.get(), b11, this.F, this.G, this.s, this.L, pVar.r, pVar.s, looper, xVar, wVar, kVar, this.z);
            e2.z zVar = n0Var.n;
            this.l = n0Var;
            Looper looper2 = n0Var.s;
            this.Z = 1.0f;
            this.F = 0;
            b2.n0 n0Var2 = b2.n0.K;
            this.O = n0Var2;
            this.P = n0Var2;
            this.i0 = n0Var2;
            this.k0 = -1;
            this.b0 = d2.c.d;
            this.c0 = true;
            n0(this.s);
            Handler handler = new Handler(looper);
            j2.e eVar = this.s;
            b11.getClass();
            eVar.getClass();
            g3 g3Var = b11.c;
            g3Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) g3Var.b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                y2.b bVar = (y2.b) it.next();
                if (bVar.b == eVar) {
                    bVar.c = true;
                    copyOnWriteArrayList.remove(bVar);
                }
            }
            copyOnWriteArrayList.add(new y2.b(handler, eVar));
            copyOnWriteArraySet.add(this.y);
            if (Build.VERSION.SDK_INT >= 31) {
                try {
                    Context context2 = this.e;
                    boolean z10 = pVar.u;
                    e2.z a10 = xVar.a(n0Var.s, null);
                    callback = null;
                    g2 g2Var = new g2(context2, z10, this, kVar, 4);
                    e0Var2 = this;
                    try {
                        a10.c(g2Var);
                    } catch (Throwable th2) {
                        th = th2;
                        e0Var = e0Var2;
                        e0Var.d.e();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    e0Var2 = this;
                    e0Var = e0Var2;
                    e0Var.d.e();
                    throw th;
                }
            } else {
                callback = null;
                e0Var2 = this;
            }
            e0Var = e0Var2;
            try {
                e2.c cVar = new e2.c(0, looper2, looper, xVar, new w(e0Var2, 2));
                e0Var.E = cVar;
                cVar.i(new v1(e0Var, 11));
                Context context3 = pVar.a;
                Looper looper3 = pVar.h;
                b0 b0Var2 = e0Var.y;
                com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
                mVar.b = context3.getApplicationContext();
                mVar.d = xVar.a(looper2, callback);
                mVar.c = new b(mVar, xVar.a(looper3, callback), b0Var2);
                e0Var.A = mVar;
                mVar.t();
                e0Var.B = new c3.k0(context, looper2, xVar, 2);
                e0Var.C = new c3.k0(context, looper2, xVar, 3);
                e0Var.g0 = b2.l.c;
                e0Var.h0 = x1.d;
                e0Var.X = e2.w.c;
                zVar.a(38, e0Var.K).b();
                b2.e eVar2 = e0Var.Y;
                e2.y b12 = e2.z.b();
                b12.a = zVar.a.obtainMessage(31, 0, 0, eVar2);
                b12.b();
                e0Var.p1(1, 3, e0Var.Y);
                e0Var.p1(2, 4, Integer.valueOf(e0Var.W));
                e0Var.p1(2, 5, 0);
                e0Var.p1(1, 9, Boolean.valueOf(e0Var.a0));
                e0Var.p1(6, 8, e0Var.z);
                e0Var.p1(-1, 16, Integer.valueOf(e0Var.e0));
                e0Var.d.e();
            } catch (Throwable th4) {
                th = th4;
                e0Var.d.e();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            e0Var = this;
        }
    }

    public static long i1(f1 f1Var) {
        b2.j1 j1Var = new b2.j1();
        b2.h1 h1Var = new b2.h1();
        f1Var.a.g(f1Var.b.a, h1Var);
        long j3 = f1Var.c;
        return j3 == -9223372036854775807L ? f1Var.a.m(h1Var.c, j1Var, 0L).l : h1Var.e + j3;
    }

    public static f1 j1(f1 f1Var, int i10) {
        f1 h = f1Var.h(i10);
        return (i10 == 1 || i10 == 4) ? h.b(false) : h;
    }

    @Override // b2.b1
    public final boolean A0() {
        B1();
        return this.G;
    }

    public final void A1() {
        int d = d();
        c3.k0 k0Var = this.C;
        c3.k0 k0Var2 = this.B;
        boolean z10 = false;
        if (d != 1) {
            if (d == 2 || d == 3) {
                B1();
                boolean z11 = this.j0.p;
                if (u() && !z11) {
                    z10 = true;
                }
                k0Var2.a(z10);
                k0Var.a(u());
                return;
            }
            if (d != 4) {
                throw new IllegalStateException();
            }
        }
        k0Var2.a(false);
        k0Var.a(false);
    }

    @Override // b2.b1
    public final int B() {
        B1();
        if (this.j0.a.p()) {
            return 0;
        }
        f1 f1Var = this.j0;
        return f1Var.a.b(f1Var.b.a);
    }

    @Override // b2.b1
    public final q1 B0() {
        B1();
        return ((x2.p) this.i).e();
    }

    public final void B1() {
        this.d.b();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = e2.d0.a;
            Locale locale = Locale.US;
            String j3 = r6.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.c0) {
                throw new IllegalStateException(j3);
            }
            e2.a.o("ExoPlayerImpl", j3, this.d0 ? null : new IllegalStateException());
            this.d0 = true;
        }
    }

    @Override // b2.b1
    public final void C(b2.n0 n0Var) {
        B1();
        if (n0Var.equals(this.P)) {
            return;
        }
        this.P = n0Var;
        this.m.e(15, new w(this, 4));
    }

    @Override // b2.b1
    public final long C0() {
        B1();
        if (this.j0.a.p()) {
            return this.l0;
        }
        f1 f1Var = this.j0;
        long j3 = 0;
        if (f1Var.k.d != f1Var.b.d) {
            return e2.d0.e0(f1Var.a.m(l0(), (b2.j1) this.a, 0L).m);
        }
        long j10 = f1Var.q;
        if (this.j0.k.b()) {
            f1 f1Var2 = this.j0;
            f1Var2.a.g(f1Var2.k.a, this.o).d(this.j0.k.b);
        } else {
            j3 = j10;
        }
        f1 f1Var3 = this.j0;
        b2.k1 k1Var = f1Var3.a;
        Object obj = f1Var3.k.a;
        b2.h1 h1Var = this.o;
        k1Var.g(obj, h1Var);
        return e2.d0.e0(j3 + h1Var.e);
    }

    @Override // b2.b1
    public final void D(b2.z0 z0Var) {
        B1();
        e2.p pVar = this.m;
        pVar.f();
        CopyOnWriteArraySet copyOnWriteArraySet = pVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            e2.o oVar = (e2.o) it.next();
            if (oVar.a.equals(z0Var)) {
                e2.n nVar = pVar.c;
                oVar.d = true;
                if (oVar.c) {
                    oVar.c = false;
                    nVar.a(oVar.a, oVar.b.d());
                }
                copyOnWriteArraySet.remove(oVar);
            }
        }
    }

    @Override // b2.b1
    public final void D0(int i10) {
        B1();
    }

    @Override // b2.b1
    public final x1 E() {
        B1();
        return this.h0;
    }

    @Override // b2.b1
    public final float G() {
        B1();
        return this.Z;
    }

    @Override // b2.b1
    public final b2.n0 H0() {
        B1();
        return this.O;
    }

    @Override // b2.b1
    public final b2.e I() {
        B1();
        return this.Y;
    }

    @Override // b2.b1
    public final void I0(List list) {
        B1();
        ArrayList c12 = c1(list);
        B1();
        r1(-9223372036854775807L, c12, true, -1);
    }

    @Override // b2.b1
    public final void J(int i10, boolean z10) {
        B1();
    }

    @Override // b2.b1
    public final long J0() {
        B1();
        return e2.d0.e0(f1(this.j0));
    }

    @Override // b2.b1
    public final b2.l K() {
        B1();
        return this.g0;
    }

    @Override // b2.b1
    public final void K0(b2.e eVar, boolean z10) {
        B1();
        if (this.f0) {
            return;
        }
        boolean equals = Objects.equals(this.Y, eVar);
        e2.p pVar = this.m;
        if (!equals) {
            this.Y = eVar;
            p1(1, 3, eVar);
            pVar.c(20, new y1(eVar, 8));
        }
        b2.e eVar2 = this.Y;
        e2.z zVar = this.l.n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.a = zVar.a.obtainMessage(31, z10 ? 1 : 0, 0, eVar2);
        b10.b();
        pVar.b();
    }

    @Override // b2.b1
    public final void L() {
        B1();
    }

    @Override // b2.b1
    public final long L0() {
        B1();
        return this.v;
    }

    @Override // b2.b1
    public final void M(int i10, int i11) {
        B1();
    }

    @Override // b2.b1
    public final void N(int i10) {
        B1();
    }

    @Override // b2.b1
    public final int O() {
        B1();
        if (o()) {
            return this.j0.b.c;
        }
        return -1;
    }

    @Override // b2.b1
    public final void P(int i10, int i11, List list) {
        B1();
        e2.d.b(i10 >= 0 && i11 >= i10);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        if (i10 > size) {
            return;
        }
        int min = Math.min(i11, size);
        if (min - i10 == list.size()) {
            for (int i12 = i10; i12 < min; i12++) {
                if (((d0) arrayList.get(i12)).b.k.a((b2.k0) list.get(i12 - i10))) {
                }
            }
            this.H++;
            e2.z zVar = this.l.n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.a = zVar.a.obtainMessage(27, i10, min, list);
            b10.b();
            for (int i13 = i10; i13 < min; i13++) {
                d0 d0Var = (d0) arrayList.get(i13);
                d0Var.c = new j1(d0Var.c, (b2.k0) list.get(i13 - i10));
            }
            z1(this.j0.j(new k1(arrayList, this.M)), 0, false, 4, -9223372036854775807L, -1, false);
            return;
        }
        ArrayList c12 = c1(list);
        if (!arrayList.isEmpty()) {
            f1 n12 = n1(a1(this.j0, min, c12), i10, min);
            z1(n12, 0, !n12.b.a.equals(this.j0.b.a), 4, f1(n12), -1, false);
        } else {
            boolean z10 = this.k0 == -1;
            B1();
            r1(-9223372036854775807L, c12, z10, -1);
        }
    }

    @Override // b2.b1
    public final void S(int i10, int i11) {
        B1();
        e2.d.b(i10 >= 0 && i11 >= i10);
        int size = this.p.size();
        int min = Math.min(i11, size);
        if (i10 >= size || i10 == min) {
            return;
        }
        f1 n12 = n1(this.j0, i10, min);
        z1(n12, 0, !n12.b.a.equals(this.j0.b.a), 4, f1(n12), -1, false);
    }

    @Override // b2.b1
    public final void T(long j3, int i10, List list) {
        B1();
        ArrayList c12 = c1(list);
        B1();
        r1(j3, c12, false, i10);
    }

    @Override // b2.b1
    public final void U(float f7) {
        B1();
        final float g10 = e2.d0.g(f7, 0.0f, 1.0f);
        if (this.Z == g10) {
            return;
        }
        this.Z = g10;
        this.l.n.a(32, Float.valueOf(g10)).b();
        this.m.e(22, new e2.m() { // from class: i2.u
            @Override // e2.m
            public final void invoke(Object obj) {
                ((b2.z0) obj).onVolumeChanged(g10);
            }
        });
    }

    @Override // b2.g
    public final void U0() {
        boolean z10;
        e2.a.i("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.a + "] [" + b2.l0.b() + "]");
        B1();
        this.A.t();
        this.B.a(false);
        this.C.a(false);
        n0 n0Var = this.l;
        if (n0Var.X || !n0Var.s.getThread().isAlive()) {
            z10 = true;
        } else {
            n0Var.X = true;
            e2.g gVar = new e2.g(n0Var.F);
            n0Var.n.a(7, gVar).b();
            z10 = gVar.c(n0Var.K);
        }
        if (!z10) {
            this.m.e(10, new i0.b(4));
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
        f1 f1Var = this.j0;
        if (f1Var.p) {
            this.j0 = f1Var.a();
        }
        f1 j12 = j1(this.j0, 1);
        this.j0 = j12;
        f1 c10 = j12.c(j12.b);
        this.j0 = c10;
        c10.q = c10.s;
        this.j0.r = 0L;
        j2.e eVar2 = this.s;
        e2.z zVar = eVar2.n;
        e2.d.h(zVar);
        zVar.c(new v1(eVar2, 14));
        o1();
        Surface surface = this.S;
        if (surface != null) {
            surface.release();
            this.S = null;
        }
        this.b0 = d2.c.d;
        this.f0 = true;
    }

    @Override // b2.g
    public final void V0(int i10, long j3, boolean z10) {
        B1();
        if (i10 == -1) {
            return;
        }
        e2.d.b(i10 >= 0);
        b2.k1 k1Var = this.j0.a;
        if (k1Var.p() || i10 < k1Var.o()) {
            j2.e eVar = this.s;
            if (!eVar.r) {
                j2.a l4 = eVar.l();
                eVar.r = true;
                eVar.q(l4, -1, new y1(l4, 15));
            }
            this.H++;
            if (o()) {
                e2.a.n("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                k0 k0Var = new k0(this.j0);
                k0Var.f(1);
                e0 e0Var = this.k.b;
                e0Var.j.c(new fg.s1(19, e0Var, k0Var));
                return;
            }
            f1 f1Var = this.j0;
            int i11 = f1Var.e;
            if (i11 == 3 || (i11 == 4 && !k1Var.p())) {
                f1Var = this.j0.h(2);
            }
            int l02 = l0();
            f1 k12 = k1(f1Var, k1Var, l1(k1Var, i10, j3));
            this.l.n.a(3, new m0(k1Var, i10, e2.d0.Q(j3))).b();
            z1(k12, 0, true, 1, f1(k12), l02, z10);
        }
    }

    @Override // b2.b1
    public final b2.u0 W() {
        B1();
        return this.j0.f;
    }

    @Override // b2.b1
    public final void X(boolean z10) {
        B1();
        y1(1, z10);
    }

    @Override // b2.b1
    public final long Z() {
        B1();
        return this.w;
    }

    public final ArrayList Z0(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            d1 d1Var = new d1((u2.a) list.get(i11), this.q);
            arrayList.add(d1Var);
            d0 d0Var = new d0(d1Var.b, d1Var.a);
            this.p.add(i11 + i10, d0Var);
        }
        this.M = this.M.e(i10, arrayList.size());
        return arrayList;
    }

    @Override // b2.b1
    public final long a0() {
        B1();
        return e1(this.j0);
    }

    public final f1 a1(f1 f1Var, int i10, ArrayList arrayList) {
        b2.k1 k1Var = f1Var.a;
        this.H++;
        ArrayList Z0 = Z0(i10, arrayList);
        k1 k1Var2 = new k1(this.p, this.M);
        f1 k12 = k1(f1Var, k1Var2, h1(k1Var, k1Var2, g1(f1Var), e1(f1Var)));
        u2.i1 i1Var = this.M;
        e2.z zVar = this.l.n;
        i0 i0Var = new i0(Z0, i1Var, -1, -9223372036854775807L);
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.a = zVar.a.obtainMessage(18, i10, 0, i0Var);
        b10.b();
        return k12;
    }

    @Override // b2.b1
    public final void b() {
        B1();
        f1 f1Var = this.j0;
        if (f1Var.e != 1) {
            return;
        }
        f1 f7 = f1Var.f(null);
        f1 j12 = j1(f7, f7.a.p() ? 4 : 2);
        this.H++;
        e2.z zVar = this.l.n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.a = zVar.a.obtainMessage(29);
        b10.b();
        z1(j12, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // b2.b1
    public final void b0(int i10, List list) {
        B1();
        ArrayList c12 = c1(list);
        B1();
        e2.d.b(i10 >= 0);
        ArrayList arrayList = this.p;
        int min = Math.min(i10, arrayList.size());
        if (!arrayList.isEmpty()) {
            z1(a1(this.j0, min, c12), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z10 = this.k0 == -1;
        B1();
        r1(-9223372036854775807L, c12, z10, -1);
    }

    public final b2.n0 b1() {
        b2.k1 w02 = w0();
        if (w02.p()) {
            return this.i0;
        }
        b2.k0 k0Var = w02.m(l0(), (b2.j1) this.a, 0L).c;
        b2.m0 a2 = this.i0.a();
        b2.n0 n0Var = k0Var.d;
        if (n0Var != null) {
            e9.i0 i0Var = n0Var.J;
            byte[] bArr = n0Var.k;
            CharSequence charSequence = n0Var.a;
            if (charSequence != null) {
                a2.a = charSequence;
            }
            CharSequence charSequence2 = n0Var.b;
            if (charSequence2 != null) {
                a2.b = charSequence2;
            }
            CharSequence charSequence3 = n0Var.c;
            if (charSequence3 != null) {
                a2.c = charSequence3;
            }
            CharSequence charSequence4 = n0Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = n0Var.e;
            if (charSequence5 != null) {
                a2.e = charSequence5;
            }
            CharSequence charSequence6 = n0Var.f;
            if (charSequence6 != null) {
                a2.f = charSequence6;
            }
            CharSequence charSequence7 = n0Var.g;
            if (charSequence7 != null) {
                a2.g = charSequence7;
            }
            Long l4 = n0Var.h;
            if (l4 != null) {
                e2.d.b(l4.longValue() >= 0);
                a2.h = l4;
            }
            b2.c1 c1Var = n0Var.i;
            if (c1Var != null) {
                a2.i = c1Var;
            }
            b2.c1 c1Var2 = n0Var.j;
            if (c1Var2 != null) {
                a2.j = c1Var2;
            }
            Uri uri = n0Var.m;
            if (uri != null || bArr != null) {
                a2.m = uri;
                Integer num = n0Var.l;
                a2.k = bArr == null ? null : (byte[]) bArr.clone();
                a2.l = num;
            }
            Integer num2 = n0Var.n;
            if (num2 != null) {
                a2.n = num2;
            }
            Integer num3 = n0Var.o;
            if (num3 != null) {
                a2.o = num3;
            }
            Integer num4 = n0Var.p;
            if (num4 != null) {
                a2.p = num4;
            }
            Boolean bool = n0Var.q;
            if (bool != null) {
                a2.q = bool;
            }
            Boolean bool2 = n0Var.r;
            if (bool2 != null) {
                a2.r = bool2;
            }
            Integer num5 = n0Var.s;
            if (num5 != null) {
                a2.s = num5;
            }
            Integer num6 = n0Var.t;
            if (num6 != null) {
                a2.s = num6;
            }
            Integer num7 = n0Var.u;
            if (num7 != null) {
                a2.t = num7;
            }
            Integer num8 = n0Var.v;
            if (num8 != null) {
                a2.u = num8;
            }
            Integer num9 = n0Var.w;
            if (num9 != null) {
                a2.v = num9;
            }
            Integer num10 = n0Var.x;
            if (num10 != null) {
                a2.w = num10;
            }
            Integer num11 = n0Var.y;
            if (num11 != null) {
                a2.x = num11;
            }
            CharSequence charSequence8 = n0Var.z;
            if (charSequence8 != null) {
                a2.y = charSequence8;
            }
            CharSequence charSequence9 = n0Var.A;
            if (charSequence9 != null) {
                a2.z = charSequence9;
            }
            CharSequence charSequence10 = n0Var.B;
            if (charSequence10 != null) {
                a2.A = charSequence10;
            }
            Integer num12 = n0Var.C;
            if (num12 != null) {
                a2.B = num12;
            }
            Integer num13 = n0Var.D;
            if (num13 != null) {
                a2.C = num13;
            }
            CharSequence charSequence11 = n0Var.E;
            if (charSequence11 != null) {
                a2.D = charSequence11;
            }
            CharSequence charSequence12 = n0Var.F;
            if (charSequence12 != null) {
                a2.E = charSequence12;
            }
            CharSequence charSequence13 = n0Var.G;
            if (charSequence13 != null) {
                a2.F = charSequence13;
            }
            Integer num14 = n0Var.H;
            if (num14 != null) {
                a2.G = num14;
            }
            Bundle bundle = n0Var.I;
            if (bundle != null) {
                a2.H = bundle;
            }
            if (!i0Var.isEmpty()) {
                a2.I = e9.i0.v(i0Var);
            }
        }
        return new b2.n0(a2);
    }

    @Override // b2.b1
    public final boolean c() {
        B1();
        return this.j0.g;
    }

    @Override // b2.b1
    public final long c0() {
        B1();
        if (!o()) {
            return C0();
        }
        f1 f1Var = this.j0;
        return f1Var.k.equals(f1Var.b) ? e2.d0.e0(this.j0.q) : getDuration();
    }

    public final ArrayList c1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.r.a((b2.k0) list.get(i10)));
        }
        return arrayList;
    }

    @Override // b2.b1
    public final int d() {
        B1();
        return this.j0.e;
    }

    public final i1 d1(h1 h1Var) {
        int g12 = g1(this.j0);
        b2.k1 k1Var = this.j0.a;
        int i10 = g12 == -1 ? 0 : g12;
        n0 n0Var = this.l;
        return new i1(n0Var, h1Var, k1Var, i10, n0Var.s);
    }

    public final long e1(f1 f1Var) {
        u2.g0 g0Var = f1Var.b;
        long j3 = f1Var.c;
        b2.k1 k1Var = f1Var.a;
        if (!g0Var.b()) {
            return e2.d0.e0(f1(f1Var));
        }
        Object obj = f1Var.b.a;
        b2.h1 h1Var = this.o;
        k1Var.g(obj, h1Var);
        if (j3 == -9223372036854775807L) {
            return e2.d0.e0(k1Var.m(g1(f1Var), (b2.j1) this.a, 0L).l);
        }
        return e2.d0.e0(j3) + e2.d0.e0(h1Var.e);
    }

    @Override // b2.b1
    public final void f(b2.v0 v0Var) {
        B1();
        if (this.j0.o.equals(v0Var)) {
            return;
        }
        f1 g10 = this.j0.g(v0Var);
        this.H++;
        this.l.n.a(4, v0Var).b();
        z1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // b2.b1
    public final void f0(int i10) {
        B1();
    }

    public final long f1(f1 f1Var) {
        if (f1Var.a.p()) {
            return e2.d0.Q(this.l0);
        }
        long l4 = f1Var.p ? f1Var.l() : f1Var.s;
        if (f1Var.b.b()) {
            return l4;
        }
        b2.k1 k1Var = f1Var.a;
        Object obj = f1Var.b.a;
        b2.h1 h1Var = this.o;
        k1Var.g(obj, h1Var);
        return l4 + h1Var.e;
    }

    @Override // b2.b1
    public final s1 g0() {
        B1();
        return this.j0.i.d;
    }

    public final int g1(f1 f1Var) {
        return f1Var.a.p() ? this.k0 : f1Var.a.g(f1Var.b.a, this.o).c;
    }

    @Override // b2.b1
    public final long getDuration() {
        B1();
        if (!o()) {
            return A();
        }
        f1 f1Var = this.j0;
        u2.g0 g0Var = f1Var.b;
        b2.k1 k1Var = f1Var.a;
        Object obj = g0Var.a;
        b2.h1 h1Var = this.o;
        k1Var.g(obj, h1Var);
        return e2.d0.e0(h1Var.a(g0Var.b, g0Var.c));
    }

    @Override // b2.b1
    public final b2.v0 h() {
        B1();
        return this.j0.o;
    }

    @Override // b2.b1
    public final b2.n0 h0() {
        B1();
        return this.P;
    }

    public final Pair h1(b2.k1 k1Var, k1 k1Var2, int i10, long j3) {
        if (k1Var.p() || k1Var2.p()) {
            boolean z10 = !k1Var.p() && k1Var2.p();
            return l1(k1Var2, z10 ? -1 : i10, z10 ? -9223372036854775807L : j3);
        }
        Pair i11 = k1Var.i((b2.j1) this.a, this.o, i10, e2.d0.Q(j3));
        Object obj = i11.first;
        if (k1Var2.b(obj) != -1) {
            return i11;
        }
        int U = n0.U((b2.j1) this.a, this.o, this.F, this.G, obj, k1Var, k1Var2);
        if (U == -1) {
            return l1(k1Var2, -1, -9223372036854775807L);
        }
        b2.j1 j1Var = (b2.j1) this.a;
        k1Var2.m(U, j1Var, 0L);
        return l1(k1Var2, U, e2.d0.e0(j1Var.l));
    }

    @Override // b2.b1
    public final void j(int i10) {
        B1();
        if (this.F != i10) {
            this.F = i10;
            e2.z zVar = this.l.n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.a = zVar.a.obtainMessage(11, i10, 0);
            b10.b();
            v vVar = new v(i10, 0);
            e2.p pVar = this.m;
            pVar.c(8, vVar);
            x1();
            pVar.b();
        }
    }

    @Override // b2.b1
    public final d2.c j0() {
        B1();
        return this.b0;
    }

    @Override // b2.b1
    public final int k0() {
        B1();
        if (o()) {
            return this.j0.b.b;
        }
        return -1;
    }

    public final f1 k1(f1 f1Var, b2.k1 k1Var, Pair pair) {
        List list;
        e2.d.b(k1Var.p() || pair != null);
        b2.k1 k1Var2 = f1Var.a;
        long e12 = e1(f1Var);
        f1 j3 = f1Var.j(k1Var);
        if (k1Var.p()) {
            u2.g0 g0Var = f1.u;
            long Q = e2.d0.Q(this.l0);
            f1 c10 = j3.d(g0Var, Q, Q, Q, 0L, u2.q1.d, this.b, e9.a1.e).c(g0Var);
            c10.q = c10.s;
            return c10;
        }
        Object obj = j3.b.a;
        String str = e2.d0.a;
        boolean equals = obj.equals(pair.first);
        u2.g0 g0Var2 = !equals ? new u2.g0(pair.first) : j3.b;
        long longValue = ((Long) pair.second).longValue();
        long Q2 = e2.d0.Q(e12);
        if (!k1Var2.p()) {
            Q2 -= k1Var2.g(obj, this.o).e;
        }
        if (!equals || longValue < Q2) {
            u2.g0 g0Var3 = g0Var2;
            e2.d.g(!g0Var3.b());
            u2.q1 q1Var = !equals ? u2.q1.d : j3.h;
            x2.v vVar = !equals ? this.b : j3.i;
            if (equals) {
                list = j3.j;
            } else {
                e9.g0 g0Var4 = e9.i0.b;
                list = e9.a1.e;
            }
            f1 c11 = j3.d(g0Var3, longValue, longValue, longValue, 0L, q1Var, vVar, list).c(g0Var3);
            c11.q = longValue;
            return c11;
        }
        if (longValue != Q2) {
            u2.g0 g0Var5 = g0Var2;
            e2.d.g(!g0Var5.b());
            long max = Math.max(0L, j3.r - (longValue - Q2));
            long j10 = j3.q;
            if (j3.k.equals(j3.b)) {
                j10 = longValue + max;
            }
            f1 d = j3.d(g0Var5, longValue, longValue, longValue, max, j3.h, j3.i, j3.j);
            d.q = j10;
            return d;
        }
        int b10 = k1Var.b(j3.k.a);
        if (b10 != -1 && k1Var.f(b10, this.o, false).c == k1Var.g(g0Var2.a, this.o).c) {
            return j3;
        }
        k1Var.g(g0Var2.a, this.o);
        long a2 = g0Var2.b() ? this.o.a(g0Var2.b, g0Var2.c) : this.o.d;
        u2.g0 g0Var6 = g0Var2;
        f1 c12 = j3.d(g0Var6, j3.s, j3.s, j3.d, a2 - j3.s, j3.h, j3.i, j3.j).c(g0Var6);
        c12.q = a2;
        return c12;
    }

    @Override // b2.b1
    public final int l() {
        B1();
        return this.F;
    }

    @Override // b2.b1
    public final int l0() {
        B1();
        int g12 = g1(this.j0);
        if (g12 == -1) {
            return 0;
        }
        return g12;
    }

    public final Pair l1(b2.k1 k1Var, int i10, long j3) {
        if (k1Var.p()) {
            this.k0 = i10;
            if (j3 == -9223372036854775807L) {
                j3 = 0;
            }
            this.l0 = j3;
            return null;
        }
        if (i10 == -1 || i10 >= k1Var.o()) {
            i10 = k1Var.a(this.G);
            j3 = e2.d0.e0(k1Var.m(i10, (b2.j1) this.a, 0L).l);
        }
        return k1Var.i((b2.j1) this.a, this.o, i10, e2.d0.Q(j3));
    }

    @Override // b2.b1
    public final int m() {
        B1();
        return 0;
    }

    public final void m1(int i10, int i11) {
        e2.w wVar = this.X;
        if (i10 == wVar.a && i11 == wVar.b) {
            return;
        }
        this.X = new e2.w(i10, i11);
        org.telegram.messenger.e1 e1Var = this.m0;
        if (e1Var != null) {
            e1Var.execute(new fg.n(this, i10, i11, 1));
            return;
        }
        this.m.e(24, new ch.c(i10, i11, 1));
        p1(2, 14, new e2.w(i10, i11));
    }

    @Override // b2.b1
    public final void n(Surface surface) {
        B1();
        o1();
        t1(surface);
        int i10 = surface == null ? 0 : -1;
        m1(i10, i10);
    }

    @Override // b2.b1
    public final void n0(b2.z0 z0Var) {
        z0Var.getClass();
        this.m.a(z0Var);
    }

    public final f1 n1(f1 f1Var, int i10, int i11) {
        int g12 = g1(f1Var);
        long e12 = e1(f1Var);
        b2.k1 k1Var = f1Var.a;
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        this.H++;
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            arrayList.remove(i12);
        }
        this.M = this.M.a(i10, i11);
        k1 k1Var2 = new k1(arrayList, this.M);
        f1 k12 = k1(f1Var, k1Var2, h1(k1Var, k1Var2, g12, e12));
        int i13 = k12.e;
        if (i13 != 1 && i13 != 4 && i10 < i11 && i11 == size && g12 >= k12.a.o()) {
            k12 = j1(k12, 4);
        }
        u2.i1 i1Var = this.M;
        e2.z zVar = this.l.n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.a = zVar.a.obtainMessage(20, i10, i11, i1Var);
        b10.b();
        return k12;
    }

    @Override // b2.b1
    public final boolean o() {
        B1();
        return this.j0.b.b();
    }

    @Override // b2.b1
    public final void o0(boolean z10) {
        B1();
    }

    public final void o1() {
        TextureView textureView = this.V;
        b0 b0Var = this.y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != b0Var) {
                e2.a.n("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.V.setSurfaceTextureListener(null);
            }
            this.V = null;
        }
        SurfaceHolder surfaceHolder = this.T;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(b0Var);
            this.T = null;
        }
    }

    public final void p1(int i10, int i11, Object obj) {
        for (f fVar : this.g) {
            if (i10 == -1 || fVar.b == i10) {
                i1 d12 = d1(fVar);
                e2.d.g(!d12.f);
                d12.c = i11;
                e2.d.g(!d12.f);
                d12.d = obj;
                d12.b();
            }
        }
        for (f fVar2 : this.h) {
            if (fVar2 != null && (i10 == -1 || fVar2.b == i10)) {
                i1 d13 = d1(fVar2);
                e2.d.g(!d13.f);
                d13.c = i11;
                e2.d.g(!d13.f);
                d13.d = obj;
                d13.b();
            }
        }
    }

    @Override // b2.b1
    public final void q(q1 q1Var) {
        B1();
        x2.u uVar = this.i;
        uVar.getClass();
        q1 B0 = B0();
        if (!q1Var.equals(((x2.p) uVar).e())) {
            uVar.b(q1Var);
        }
        if (B0.equals(q1Var)) {
            return;
        }
        this.m.e(19, new y1(q1Var, 9));
    }

    public final void q1(u2.a aVar, boolean z10) {
        B1();
        List singletonList = Collections.singletonList(aVar);
        B1();
        r1(-9223372036854775807L, singletonList, z10, -1);
    }

    @Override // b2.b1
    public final long r() {
        B1();
        return e2.d0.e0(this.j0.r);
    }

    @Override // b2.b1
    public final void r0(int i10, int i11, int i12) {
        B1();
        e2.d.b(i10 >= 0 && i10 <= i11 && i12 >= 0);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int min = Math.min(i11, size);
        int min2 = Math.min(i12, size - (min - i10));
        if (i10 >= size || i10 == min || i10 == min2) {
            return;
        }
        b2.k1 w02 = w0();
        this.H++;
        e2.d0.P(i10, min, min2, arrayList);
        this.M = this.M.f();
        k1 k1Var = new k1(arrayList, this.M);
        f1 f1Var = this.j0;
        f1 k12 = k1(f1Var, k1Var, h1(w02, k1Var, g1(f1Var), e1(this.j0)));
        u2.i1 i1Var = this.M;
        n0 n0Var = this.l;
        n0Var.getClass();
        n0Var.n.a(19, new j0(i10, min, min2, i1Var)).b();
        z1(k12, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void r1(long j3, List list, boolean z10, int i10) {
        long j10;
        int i11;
        int i12;
        int i13 = i10;
        int g12 = g1(this.j0);
        long J0 = J0();
        this.H++;
        ArrayList arrayList = this.p;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i14 = size - 1; i14 >= 0; i14--) {
                arrayList.remove(i14);
            }
            this.M = this.M.a(0, size);
        }
        ArrayList Z0 = Z0(0, list);
        k1 k1Var = new k1(arrayList, this.M);
        boolean p5 = k1Var.p();
        int i15 = k1Var.h;
        if (!p5 && i13 >= i15) {
            throw new b2.v();
        }
        if (z10) {
            i13 = k1Var.a(this.G);
            j10 = -9223372036854775807L;
        } else {
            if (i13 == -1) {
                i11 = g12;
                j10 = J0;
                f1 k12 = k1(this.j0, k1Var, l1(k1Var, i11, j10));
                i12 = k12.e;
                if (i11 != -1 && i12 != 1) {
                    i12 = (!k1Var.p() || i11 >= i15) ? 4 : 2;
                }
                f1 j12 = j1(k12, i12);
                this.l.n.a(17, new i0(Z0, this.M, i11, e2.d0.Q(j10))).b();
                z1(j12, 0, this.j0.b.a.equals(j12.b.a) && !this.j0.a.p(), 4, f1(j12), -1, false);
            }
            j10 = j3;
        }
        i11 = i13;
        f1 k122 = k1(this.j0, k1Var, l1(k1Var, i11, j10));
        i12 = k122.e;
        if (i11 != -1) {
            if (k1Var.p()) {
            }
        }
        f1 j122 = j1(k122, i12);
        this.l.n.a(17, new i0(Z0, this.M, i11, e2.d0.Q(j10))).b();
        z1(j122, 0, this.j0.b.a.equals(j122.b.a) && !this.j0.a.p(), 4, f1(j122), -1, false);
    }

    public final void s1(o1 o1Var) {
        B1();
        if (o1Var == null) {
            o1Var = o1.e;
        }
        if (this.L.equals(o1Var)) {
            return;
        }
        this.L = o1Var;
        this.l.n.a(5, o1Var).b();
    }

    @Override // b2.b1
    public final void stop() {
        B1();
        w1(null);
        this.b0 = new d2.c(this.j0.s, e9.a1.e);
    }

    @Override // b2.b1
    public final b2.x0 t() {
        B1();
        return this.N;
    }

    public final void t1(Surface surface) {
        Object obj = this.R;
        boolean z10 = true;
        boolean z11 = (obj == null || obj == surface) ? false : true;
        long j3 = z11 ? this.D : -9223372036854775807L;
        n0 n0Var = this.l;
        if (!n0Var.X && n0Var.s.getThread().isAlive()) {
            e2.g gVar = new e2.g(n0Var.F);
            n0Var.n.a(30, new Pair(surface, gVar)).b();
            if (j3 != -9223372036854775807L) {
                z10 = gVar.c(j3);
            }
        }
        if (z11) {
            Object obj2 = this.R;
            Surface surface2 = this.S;
            if (obj2 == surface2) {
                try {
                    surface2.release();
                } catch (Throwable unused) {
                }
                this.S = null;
            }
        }
        this.R = surface;
        if (z10) {
            return;
        }
        w1(new n(2, new androidx.car.app.j("Detaching surface timed out."), 1003));
    }

    @Override // b2.b1
    public final boolean u() {
        B1();
        return this.j0.l;
    }

    @Override // b2.b1
    public final int u0() {
        B1();
        return this.j0.n;
    }

    public final void u1(SurfaceView surfaceView) {
        B1();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        B1();
        if (holder == null) {
            B1();
            o1();
            t1(null);
            m1(0, 0);
            return;
        }
        o1();
        this.U = true;
        this.T = holder;
        holder.addCallback(this.y);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            t1(null);
            m1(0, 0);
        } else {
            t1(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            m1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void v1(TextureView textureView) {
        B1();
        if (textureView == null) {
            B1();
            o1();
            t1(null);
            m1(0, 0);
            return;
        }
        o1();
        this.V = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            e2.a.n("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.y);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            t1(null);
            m1(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            t1(surface);
            this.S = surface;
            m1(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // b2.b1
    public final b2.k1 w0() {
        B1();
        return this.j0.a;
    }

    public final void w1(n nVar) {
        f1 f1Var = this.j0;
        f1 c10 = f1Var.c(f1Var.b);
        c10.q = c10.s;
        c10.r = 0L;
        f1 j12 = j1(c10, 1);
        if (nVar != null) {
            j12 = j12.f(nVar);
        }
        f1 f1Var2 = j12;
        this.H++;
        e2.z zVar = this.l.n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.a = zVar.a.obtainMessage(6);
        b10.b();
        z1(f1Var2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // b2.b1
    public final void x(boolean z10) {
        B1();
        if (this.G != z10) {
            this.G = z10;
            e2.z zVar = this.l.n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.a = zVar.a.obtainMessage(12, z10 ? 1 : 0, 0);
            b10.b();
            x xVar = new x(0, z10);
            e2.p pVar = this.m;
            pVar.c(9, xVar);
            x1();
            pVar.b();
        }
    }

    @Override // b2.b1
    public final boolean x0() {
        B1();
        return false;
    }

    public final void x1() {
        b2.x0 x0Var = this.N;
        String str = e2.d0.a;
        e0 e0Var = this.f;
        boolean o9 = e0Var.o();
        boolean d02 = e0Var.d0();
        boolean Q0 = e0Var.Q0();
        boolean P0 = e0Var.P0();
        boolean M0 = e0Var.M0();
        boolean t02 = e0Var.t0();
        boolean p5 = e0Var.w0().p();
        b2.w0 w0Var = new b2.w0();
        w0Var.a = new b2.p();
        b2.p pVar = (b2.p) w0Var.a;
        pVar.c(this.c.a);
        boolean z10 = !o9;
        w0Var.a(4, z10);
        boolean z11 = false;
        w0Var.a(5, d02 && !o9);
        w0Var.a(6, Q0 && !o9);
        w0Var.a(7, !p5 && (Q0 || !M0 || d02) && !o9);
        w0Var.a(8, P0 && !o9);
        w0Var.a(9, !p5 && (P0 || (M0 && t02)) && !o9);
        w0Var.a(10, z10);
        w0Var.a(11, d02 && !o9);
        if (d02 && !o9) {
            z11 = true;
        }
        w0Var.a(12, z11);
        b2.x0 x0Var2 = new b2.x0(pVar.d());
        this.N = x0Var2;
        if (x0Var2.equals(x0Var)) {
            return;
        }
        this.m.c(13, new w(this, 3));
    }

    @Override // b2.b1
    public final Looper y0() {
        return this.t;
    }

    public final void y1(int i10, boolean z10) {
        f1 f1Var = this.j0;
        int i11 = f1Var.n;
        int i12 = (i11 != 1 || z10) ? 0 : 1;
        if (f1Var.l == z10 && i11 == i12 && f1Var.m == i10) {
            return;
        }
        this.H++;
        if (f1Var.p) {
            f1Var = f1Var.a();
        }
        f1 e = f1Var.e(i10, i12, z10);
        e2.z zVar = this.l.n;
        zVar.getClass();
        e2.y b10 = e2.z.b();
        b10.a = zVar.a.obtainMessage(1, z10 ? 1 : 0, i10 | (i12 << 4));
        b10.b();
        z1(e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // b2.b1
    public final long z() {
        B1();
        return this.x;
    }

    @Override // b2.b1
    public final void z0() {
        B1();
    }

    public final void z1(final f1 f1Var, int i10, boolean z10, int i11, long j3, int i12, boolean z11) {
        Pair pair;
        int i13;
        b2.k0 k0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14;
        Object obj;
        b2.k0 k0Var2;
        Object obj2;
        int i15;
        long j10;
        long j11;
        long j12;
        long i16;
        Object obj3;
        b2.k0 k0Var3;
        Object obj4;
        int i17;
        f1 f1Var2 = this.j0;
        this.j0 = f1Var;
        boolean equals = f1Var2.a.equals(f1Var.a);
        b2.j1 j1Var = (b2.j1) this.a;
        b2.h1 h1Var = this.o;
        b2.k1 k1Var = f1Var2.a;
        u2.g0 g0Var = f1Var2.b;
        b2.k1 k1Var2 = f1Var.a;
        u2.g0 g0Var2 = f1Var.b;
        if (k1Var2.p() && k1Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (k1Var2.p() != k1Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (k1Var.m(k1Var.g(g0Var.a, h1Var).c, j1Var, 0L).a.equals(k1Var2.m(k1Var2.g(g0Var2.a, h1Var).c, j1Var, 0L).a)) {
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
            k0Var = !f1Var.a.p() ? f1Var.a.m(f1Var.a.g(f1Var.b.a, this.o).c, (b2.j1) this.a, 0L).c : null;
            this.i0 = b2.n0.K;
        } else {
            k0Var = null;
        }
        if (booleanValue || !f1Var2.j.equals(f1Var.j)) {
            b2.m0 a2 = this.i0.a();
            List list = f1Var.j;
            for (int i18 = 0; i18 < list.size(); i18++) {
                b2.p0 p0Var = (b2.p0) list.get(i18);
                int i19 = 0;
                while (true) {
                    b2.o0[] o0VarArr = p0Var.a;
                    if (i19 < o0VarArr.length) {
                        o0VarArr[i19].b(a2);
                        i19++;
                    }
                }
            }
            this.i0 = new b2.n0(a2);
        }
        b2.n0 b12 = b1();
        boolean equals2 = b12.equals(this.O);
        this.O = b12;
        boolean z15 = f1Var2.l != f1Var.l;
        boolean z16 = f1Var2.e != f1Var.e;
        if (z16 || z15) {
            A1();
        }
        boolean z17 = f1Var2.g != f1Var.g;
        if (!equals) {
            this.m.c(0, new s(f1Var, i10, 0));
        }
        if (z10) {
            b2.h1 h1Var2 = new b2.h1();
            if (f1Var2.a.p()) {
                z12 = booleanValue;
                z13 = equals2;
                z14 = z16;
                i14 = i12;
                obj = null;
                k0Var2 = null;
                obj2 = null;
                i15 = -1;
            } else {
                Object obj5 = f1Var2.b.a;
                f1Var2.a.g(obj5, h1Var2);
                int i20 = h1Var2.c;
                int b10 = f1Var2.a.b(obj5);
                z12 = booleanValue;
                z13 = equals2;
                z14 = z16;
                obj = f1Var2.a.m(i20, (b2.j1) this.a, 0L).a;
                k0Var2 = ((b2.j1) this.a).c;
                obj2 = obj5;
                i14 = i20;
                i15 = b10;
            }
            if (i11 == 0) {
                if (f1Var2.b.b()) {
                    u2.g0 g0Var3 = f1Var2.b;
                    j12 = h1Var2.a(g0Var3.b, g0Var3.c);
                    i16 = i1(f1Var2);
                } else if (f1Var2.b.e != -1) {
                    j12 = i1(this.j0);
                    i16 = j12;
                } else {
                    j10 = h1Var2.e;
                    j11 = h1Var2.d;
                    j12 = j10 + j11;
                    i16 = j12;
                }
            } else if (f1Var2.b.b()) {
                j12 = f1Var2.s;
                i16 = i1(f1Var2);
            } else {
                j10 = h1Var2.e;
                j11 = f1Var2.s;
                j12 = j10 + j11;
                i16 = j12;
            }
            long e02 = e2.d0.e0(j12);
            long e03 = e2.d0.e0(i16);
            u2.g0 g0Var4 = f1Var2.b;
            b2.a1 a1Var = new b2.a1(obj, i14, k0Var2, obj2, i15, e02, e03, g0Var4.b, g0Var4.c);
            b2.j1 j1Var2 = (b2.j1) this.a;
            int l02 = l0();
            if (this.j0.a.p()) {
                obj3 = null;
                k0Var3 = null;
                obj4 = null;
                i17 = -1;
            } else {
                f1 f1Var3 = this.j0;
                Object obj6 = f1Var3.b.a;
                f1Var3.a.g(obj6, this.o);
                int b11 = this.j0.a.b(obj6);
                Object obj7 = this.j0.a.m(l02, j1Var2, 0L).a;
                k0Var3 = j1Var2.c;
                i17 = b11;
                obj4 = obj6;
                obj3 = obj7;
            }
            long e04 = e2.d0.e0(j3);
            long e05 = this.j0.b.b() ? e2.d0.e0(i1(this.j0)) : e04;
            u2.g0 g0Var5 = this.j0.b;
            this.m.c(11, new e2(i11, a1Var, new b2.a1(obj3, l02, k0Var3, obj4, i17, e04, e05, g0Var5.b, g0Var5.c), 2));
        } else {
            z12 = booleanValue;
            z13 = equals2;
            z14 = z16;
        }
        if (z12) {
            this.m.c(1, new s(k0Var, intValue, 1));
        }
        if (f1Var2.f != f1Var.f) {
            final int i21 = 7;
            this.m.c(10, new e2.m() { // from class: i2.t
                @Override // e2.m
                public final void invoke(Object obj8) {
                    b2.z0 z0Var = (b2.z0) obj8;
                    switch (i21) {
                        case 0:
                            f1 f1Var4 = f1Var;
                            z0Var.onLoadingChanged(f1Var4.g);
                            z0Var.onIsLoadingChanged(f1Var4.g);
                            break;
                        case 1:
                            f1 f1Var5 = f1Var;
                            z0Var.onPlayerStateChanged(f1Var5.l, f1Var5.e);
                            break;
                        case 2:
                            z0Var.onPlaybackStateChanged(f1Var.e);
                            break;
                        case 3:
                            f1 f1Var6 = f1Var;
                            z0Var.onPlayWhenReadyChanged(f1Var6.l, f1Var6.m);
                            break;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(f1Var.n);
                            break;
                        case 5:
                            z0Var.onIsPlayingChanged(f1Var.m());
                            break;
                        case 6:
                            z0Var.onPlaybackParametersChanged(f1Var.o);
                            break;
                        case 7:
                            z0Var.onPlayerErrorChanged(f1Var.f);
                            break;
                        case 8:
                            z0Var.onPlayerError(f1Var.f);
                            break;
                        default:
                            z0Var.onTracksChanged(f1Var.i.d);
                            break;
                    }
                }
            });
            if (f1Var.f != null) {
                final int i22 = 8;
                this.m.c(10, new e2.m() { // from class: i2.t
                    @Override // e2.m
                    public final void invoke(Object obj8) {
                        b2.z0 z0Var = (b2.z0) obj8;
                        switch (i22) {
                            case 0:
                                f1 f1Var4 = f1Var;
                                z0Var.onLoadingChanged(f1Var4.g);
                                z0Var.onIsLoadingChanged(f1Var4.g);
                                break;
                            case 1:
                                f1 f1Var5 = f1Var;
                                z0Var.onPlayerStateChanged(f1Var5.l, f1Var5.e);
                                break;
                            case 2:
                                z0Var.onPlaybackStateChanged(f1Var.e);
                                break;
                            case 3:
                                f1 f1Var6 = f1Var;
                                z0Var.onPlayWhenReadyChanged(f1Var6.l, f1Var6.m);
                                break;
                            case 4:
                                z0Var.onPlaybackSuppressionReasonChanged(f1Var.n);
                                break;
                            case 5:
                                z0Var.onIsPlayingChanged(f1Var.m());
                                break;
                            case 6:
                                z0Var.onPlaybackParametersChanged(f1Var.o);
                                break;
                            case 7:
                                z0Var.onPlayerErrorChanged(f1Var.f);
                                break;
                            case 8:
                                z0Var.onPlayerError(f1Var.f);
                                break;
                            default:
                                z0Var.onTracksChanged(f1Var.i.d);
                                break;
                        }
                    }
                });
            }
        }
        x2.v vVar = f1Var2.i;
        x2.v vVar2 = f1Var.i;
        if (vVar != vVar2) {
            x2.u uVar = this.i;
            Object obj8 = vVar2.e;
            uVar.getClass();
            uVar.c = (x2.t) obj8;
            final int i23 = 9;
            this.m.c(2, new e2.m() { // from class: i2.t
                @Override // e2.m
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (i23) {
                        case 0:
                            f1 f1Var4 = f1Var;
                            z0Var.onLoadingChanged(f1Var4.g);
                            z0Var.onIsLoadingChanged(f1Var4.g);
                            break;
                        case 1:
                            f1 f1Var5 = f1Var;
                            z0Var.onPlayerStateChanged(f1Var5.l, f1Var5.e);
                            break;
                        case 2:
                            z0Var.onPlaybackStateChanged(f1Var.e);
                            break;
                        case 3:
                            f1 f1Var6 = f1Var;
                            z0Var.onPlayWhenReadyChanged(f1Var6.l, f1Var6.m);
                            break;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(f1Var.n);
                            break;
                        case 5:
                            z0Var.onIsPlayingChanged(f1Var.m());
                            break;
                        case 6:
                            z0Var.onPlaybackParametersChanged(f1Var.o);
                            break;
                        case 7:
                            z0Var.onPlayerErrorChanged(f1Var.f);
                            break;
                        case 8:
                            z0Var.onPlayerError(f1Var.f);
                            break;
                        default:
                            z0Var.onTracksChanged(f1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (!z13) {
            this.m.c(14, new y1(this.O, 7));
        }
        if (z17) {
            final int i24 = 0;
            this.m.c(3, new e2.m() { // from class: i2.t
                @Override // e2.m
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (i24) {
                        case 0:
                            f1 f1Var4 = f1Var;
                            z0Var.onLoadingChanged(f1Var4.g);
                            z0Var.onIsLoadingChanged(f1Var4.g);
                            break;
                        case 1:
                            f1 f1Var5 = f1Var;
                            z0Var.onPlayerStateChanged(f1Var5.l, f1Var5.e);
                            break;
                        case 2:
                            z0Var.onPlaybackStateChanged(f1Var.e);
                            break;
                        case 3:
                            f1 f1Var6 = f1Var;
                            z0Var.onPlayWhenReadyChanged(f1Var6.l, f1Var6.m);
                            break;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(f1Var.n);
                            break;
                        case 5:
                            z0Var.onIsPlayingChanged(f1Var.m());
                            break;
                        case 6:
                            z0Var.onPlaybackParametersChanged(f1Var.o);
                            break;
                        case 7:
                            z0Var.onPlayerErrorChanged(f1Var.f);
                            break;
                        case 8:
                            z0Var.onPlayerError(f1Var.f);
                            break;
                        default:
                            z0Var.onTracksChanged(f1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z14 || z15) {
            final int i25 = 1;
            this.m.c(-1, new e2.m() { // from class: i2.t
                @Override // e2.m
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (i25) {
                        case 0:
                            f1 f1Var4 = f1Var;
                            z0Var.onLoadingChanged(f1Var4.g);
                            z0Var.onIsLoadingChanged(f1Var4.g);
                            break;
                        case 1:
                            f1 f1Var5 = f1Var;
                            z0Var.onPlayerStateChanged(f1Var5.l, f1Var5.e);
                            break;
                        case 2:
                            z0Var.onPlaybackStateChanged(f1Var.e);
                            break;
                        case 3:
                            f1 f1Var6 = f1Var;
                            z0Var.onPlayWhenReadyChanged(f1Var6.l, f1Var6.m);
                            break;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(f1Var.n);
                            break;
                        case 5:
                            z0Var.onIsPlayingChanged(f1Var.m());
                            break;
                        case 6:
                            z0Var.onPlaybackParametersChanged(f1Var.o);
                            break;
                        case 7:
                            z0Var.onPlayerErrorChanged(f1Var.f);
                            break;
                        case 8:
                            z0Var.onPlayerError(f1Var.f);
                            break;
                        default:
                            z0Var.onTracksChanged(f1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z14) {
            final int i26 = 2;
            this.m.c(4, new e2.m() { // from class: i2.t
                @Override // e2.m
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (i26) {
                        case 0:
                            f1 f1Var4 = f1Var;
                            z0Var.onLoadingChanged(f1Var4.g);
                            z0Var.onIsLoadingChanged(f1Var4.g);
                            break;
                        case 1:
                            f1 f1Var5 = f1Var;
                            z0Var.onPlayerStateChanged(f1Var5.l, f1Var5.e);
                            break;
                        case 2:
                            z0Var.onPlaybackStateChanged(f1Var.e);
                            break;
                        case 3:
                            f1 f1Var6 = f1Var;
                            z0Var.onPlayWhenReadyChanged(f1Var6.l, f1Var6.m);
                            break;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(f1Var.n);
                            break;
                        case 5:
                            z0Var.onIsPlayingChanged(f1Var.m());
                            break;
                        case 6:
                            z0Var.onPlaybackParametersChanged(f1Var.o);
                            break;
                        case 7:
                            z0Var.onPlayerErrorChanged(f1Var.f);
                            break;
                        case 8:
                            z0Var.onPlayerError(f1Var.f);
                            break;
                        default:
                            z0Var.onTracksChanged(f1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z15 || f1Var2.m != f1Var.m) {
            final int i27 = 3;
            this.m.c(5, new e2.m() { // from class: i2.t
                @Override // e2.m
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (i27) {
                        case 0:
                            f1 f1Var4 = f1Var;
                            z0Var.onLoadingChanged(f1Var4.g);
                            z0Var.onIsLoadingChanged(f1Var4.g);
                            break;
                        case 1:
                            f1 f1Var5 = f1Var;
                            z0Var.onPlayerStateChanged(f1Var5.l, f1Var5.e);
                            break;
                        case 2:
                            z0Var.onPlaybackStateChanged(f1Var.e);
                            break;
                        case 3:
                            f1 f1Var6 = f1Var;
                            z0Var.onPlayWhenReadyChanged(f1Var6.l, f1Var6.m);
                            break;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(f1Var.n);
                            break;
                        case 5:
                            z0Var.onIsPlayingChanged(f1Var.m());
                            break;
                        case 6:
                            z0Var.onPlaybackParametersChanged(f1Var.o);
                            break;
                        case 7:
                            z0Var.onPlayerErrorChanged(f1Var.f);
                            break;
                        case 8:
                            z0Var.onPlayerError(f1Var.f);
                            break;
                        default:
                            z0Var.onTracksChanged(f1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (f1Var2.n != f1Var.n) {
            final int i28 = 4;
            this.m.c(6, new e2.m() { // from class: i2.t
                @Override // e2.m
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (i28) {
                        case 0:
                            f1 f1Var4 = f1Var;
                            z0Var.onLoadingChanged(f1Var4.g);
                            z0Var.onIsLoadingChanged(f1Var4.g);
                            break;
                        case 1:
                            f1 f1Var5 = f1Var;
                            z0Var.onPlayerStateChanged(f1Var5.l, f1Var5.e);
                            break;
                        case 2:
                            z0Var.onPlaybackStateChanged(f1Var.e);
                            break;
                        case 3:
                            f1 f1Var6 = f1Var;
                            z0Var.onPlayWhenReadyChanged(f1Var6.l, f1Var6.m);
                            break;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(f1Var.n);
                            break;
                        case 5:
                            z0Var.onIsPlayingChanged(f1Var.m());
                            break;
                        case 6:
                            z0Var.onPlaybackParametersChanged(f1Var.o);
                            break;
                        case 7:
                            z0Var.onPlayerErrorChanged(f1Var.f);
                            break;
                        case 8:
                            z0Var.onPlayerError(f1Var.f);
                            break;
                        default:
                            z0Var.onTracksChanged(f1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (f1Var2.m() != f1Var.m()) {
            final int i29 = 5;
            this.m.c(7, new e2.m() { // from class: i2.t
                @Override // e2.m
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (i29) {
                        case 0:
                            f1 f1Var4 = f1Var;
                            z0Var.onLoadingChanged(f1Var4.g);
                            z0Var.onIsLoadingChanged(f1Var4.g);
                            break;
                        case 1:
                            f1 f1Var5 = f1Var;
                            z0Var.onPlayerStateChanged(f1Var5.l, f1Var5.e);
                            break;
                        case 2:
                            z0Var.onPlaybackStateChanged(f1Var.e);
                            break;
                        case 3:
                            f1 f1Var6 = f1Var;
                            z0Var.onPlayWhenReadyChanged(f1Var6.l, f1Var6.m);
                            break;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(f1Var.n);
                            break;
                        case 5:
                            z0Var.onIsPlayingChanged(f1Var.m());
                            break;
                        case 6:
                            z0Var.onPlaybackParametersChanged(f1Var.o);
                            break;
                        case 7:
                            z0Var.onPlayerErrorChanged(f1Var.f);
                            break;
                        case 8:
                            z0Var.onPlayerError(f1Var.f);
                            break;
                        default:
                            z0Var.onTracksChanged(f1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (!f1Var2.o.equals(f1Var.o)) {
            final int i30 = 6;
            this.m.c(12, new e2.m() { // from class: i2.t
                @Override // e2.m
                public final void invoke(Object obj82) {
                    b2.z0 z0Var = (b2.z0) obj82;
                    switch (i30) {
                        case 0:
                            f1 f1Var4 = f1Var;
                            z0Var.onLoadingChanged(f1Var4.g);
                            z0Var.onIsLoadingChanged(f1Var4.g);
                            break;
                        case 1:
                            f1 f1Var5 = f1Var;
                            z0Var.onPlayerStateChanged(f1Var5.l, f1Var5.e);
                            break;
                        case 2:
                            z0Var.onPlaybackStateChanged(f1Var.e);
                            break;
                        case 3:
                            f1 f1Var6 = f1Var;
                            z0Var.onPlayWhenReadyChanged(f1Var6.l, f1Var6.m);
                            break;
                        case 4:
                            z0Var.onPlaybackSuppressionReasonChanged(f1Var.n);
                            break;
                        case 5:
                            z0Var.onIsPlayingChanged(f1Var.m());
                            break;
                        case 6:
                            z0Var.onPlaybackParametersChanged(f1Var.o);
                            break;
                        case 7:
                            z0Var.onPlayerErrorChanged(f1Var.f);
                            break;
                        case 8:
                            z0Var.onPlayerError(f1Var.f);
                            break;
                        default:
                            z0Var.onTracksChanged(f1Var.i.d);
                            break;
                    }
                }
            });
        }
        x1();
        this.m.b();
        if (f1Var2.p != f1Var.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).a.A1();
            }
        }
    }
}
