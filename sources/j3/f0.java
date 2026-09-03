package j3;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ai;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f0 extends cb.e implements q {
    public final h7.u A;
    public final z9.d B;
    public final long C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public h2 J;
    public o4.q0 K;
    public w1 L;
    public e1 M;
    public n0 N;
    public AudioTrack O;
    public Object P;
    public Surface Q;
    public SurfaceHolder R;
    public boolean S;
    public TextureView T;
    public final int U;
    public h5.x V;
    public final int W;
    public l3.d X;
    public float Y;
    public boolean Z;
    public final boolean a0;
    public final f5.x b;
    public boolean b0;
    public final w1 c;
    public boolean c0;
    public final h5.c d;
    public i5.y d0;
    public final Context e;
    public e1 e0;
    public final a2 f;
    public u1 f0;
    public final e[] g;
    public int g0;
    public final f5.t h;
    public long h0;
    public final h5.a0 i;
    public Executor i0;
    public final u j;
    public final ArrayList j0;
    public final k0 k;
    public final h5.m l;
    public final CopyOnWriteArraySet m;
    public final m2 n;
    public final ArrayList o;
    public final boolean p;
    public final k3.f q;
    public final Looper r;
    public final g5.f s;
    public final long t;
    public final long u;
    public final h5.y v;
    public final c0 w;
    public final d0 x;
    public final androidx.activity.o y;
    public final d z;

    static {
        l0.a("goog.exo.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f0(p pVar, i2 i2Var) {
        super(3);
        this.j0 = new ArrayList();
        this.d = new h5.c();
        try {
            h5.a.v("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.19.1] [" + h5.d0.e + "]");
            Context context = pVar.a;
            h5.y yVar = pVar.b;
            this.e = context.getApplicationContext();
            this.q = new k3.f(yVar);
            this.X = pVar.i;
            this.U = pVar.j;
            this.Z = false;
            this.C = pVar.q;
            c0 c0Var = new c0(this);
            this.w = c0Var;
            this.x = new d0();
            Handler handler = new Handler(pVar.h);
            e[] b10 = ((l) pVar.c.get()).b(handler, c0Var, c0Var, c0Var, c0Var);
            this.g = b10;
            h5.a.i(b10.length > 0);
            this.h = (f5.t) pVar.e.get();
            pVar.d.get();
            this.s = g5.s.b(pVar.g.b);
            this.p = pVar.k;
            this.J = pVar.l;
            this.t = pVar.m;
            this.u = pVar.n;
            Looper looper = pVar.h;
            this.r = looper;
            this.v = yVar;
            this.f = i2Var == 0 ? this : i2Var;
            this.l = new h5.m(looper, yVar, new u(this));
            this.m = new CopyOnWriteArraySet();
            this.o = new ArrayList();
            this.K = new o4.o0();
            this.b = new f5.x(new g2[b10.length], new f5.c[b10.length], q2.b, null);
            this.n = new m2();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32};
            for (int i10 = 0; i10 < 19; i10++) {
                int i11 = iArr[i10];
                h5.a.i(!false);
                sparseBooleanArray.append(i11, true);
            }
            this.h.getClass();
            h5.a.i(!false);
            sparseBooleanArray.append(29, true);
            h5.a.i(!false);
            h5.g gVar = new h5.g(sparseBooleanArray);
            this.c = new w1(gVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i12 = 0; i12 < gVar.a.size(); i12++) {
                int a2 = gVar.a(i12);
                h5.a.i(!false);
                sparseBooleanArray2.append(a2, true);
            }
            h5.a.i(!false);
            sparseBooleanArray2.append(4, true);
            h5.a.i(!false);
            sparseBooleanArray2.append(10, true);
            h5.a.i(!false);
            this.L = new w1(new h5.g(sparseBooleanArray2));
            this.i = this.v.a(this.r, null);
            u uVar = new u(this);
            this.j = uVar;
            this.f0 = u1.i(this.b);
            this.q.r(this.f, this.r);
            int i13 = h5.d0.a;
            this.k = new k0(this.g, this.h, this.b, (j) pVar.f.get(), this.s, this.D, this.E, this.q, this.J, pVar.o, pVar.p, this.r, this.v, uVar, i13 < 31 ? new k3.k() : y.a(this.e, this, pVar.r));
            this.Y = 1.0f;
            this.D = 0;
            e1 e1Var = e1.V;
            this.M = e1Var;
            this.e0 = e1Var;
            int i14 = -1;
            this.g0 = -1;
            if (i13 < 21) {
                AudioTrack audioTrack = this.O;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.O.release();
                    this.O = null;
                }
                if (this.O == null) {
                    this.O = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.W = this.O.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.e.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                if (audioManager != null) {
                    i14 = audioManager.generateAudioSessionId();
                }
                this.W = i14;
            }
            int i15 = v4.c.b;
            this.a0 = true;
            n(this.q);
            g5.f fVar = this.s;
            Handler handler2 = new Handler(this.r);
            k3.f fVar2 = this.q;
            g5.s sVar = (g5.s) fVar;
            sVar.getClass();
            fVar2.getClass();
            ja.c cVar = sVar.b;
            cVar.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) cVar.b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                g5.e eVar = (g5.e) it.next();
                if (eVar.b == fVar2) {
                    eVar.c = true;
                    copyOnWriteArrayList.remove(eVar);
                }
            }
            copyOnWriteArrayList.add(new g5.e(handler2, fVar2));
            this.m.add(this.w);
            c0 c0Var2 = this.w;
            androidx.activity.o oVar = new androidx.activity.o();
            oVar.b = context.getApplicationContext();
            oVar.c = new b(oVar, handler, c0Var2);
            this.y = oVar;
            oVar.d();
            d dVar = new d(context, handler, this.w);
            this.z = dVar;
            dVar.b(null);
            int i16 = 9;
            h7.u uVar2 = new h7.u(i16);
            this.A = uVar2;
            z9.d dVar2 = new z9.d(i16);
            this.B = dVar2;
            e8.a aVar = new e8.a(0);
            aVar.b = 0;
            aVar.c = 0;
            aVar.a();
            this.d0 = i5.y.e;
            this.V = h5.x.c;
            this.h.b(this.X);
            V(1, 10, Integer.valueOf(this.W));
            V(2, 10, Integer.valueOf(this.W));
            V(1, 3, this.X);
            V(2, 4, Integer.valueOf(this.U));
            V(2, 5, 0);
            V(1, 9, Boolean.valueOf(this.Z));
            V(2, 7, this.x);
            V(6, 8, this.x);
            this.d.c();
        } catch (Throwable th2) {
            this.d.c();
            throw th2;
        }
    }

    public static long Q(u1 u1Var) {
        n2 n2Var = new n2();
        m2 m2Var = new m2();
        u1Var.a.g(u1Var.b.a, m2Var);
        long j10 = u1Var.c;
        return j10 == -9223372036854775807L ? u1Var.a.m(m2Var.c, n2Var, 0L).x : m2Var.e + j10;
    }

    @Override // j3.a2
    public final Looper A() {
        return this.r;
    }

    @Override // j3.a2
    public final boolean B() {
        j0();
        return this.E;
    }

    @Override // j3.a2
    public final long C() {
        j0();
        return h5.d0.S(O(this.f0));
    }

    @Override // j3.a2
    public final long D() {
        j0();
        return this.t;
    }

    @Override // cb.e
    public final void J() {
        String str;
        AudioTrack audioTrack;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [ExoPlayerLib/2.19.1] [");
        sb.append(h5.d0.e);
        sb.append("] [");
        HashSet hashSet = l0.a;
        synchronized (l0.class) {
            str = l0.b;
        }
        sb.append(str);
        sb.append("]");
        h5.a.v("ExoPlayerImpl", sb.toString());
        j0();
        if (h5.d0.a < 21 && (audioTrack = this.O) != null) {
            audioTrack.release();
            this.O = null;
        }
        this.y.d();
        this.A.getClass();
        this.B.getClass();
        d dVar = this.z;
        dVar.c = null;
        dVar.a();
        if (!this.k.w()) {
            this.l.e(10, new f0.d(23));
        }
        this.l.d();
        this.i.a.removeCallbacksAndMessages(null);
        g5.f fVar = this.s;
        k3.f fVar2 = this.q;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((g5.s) fVar).b.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            g5.e eVar = (g5.e) it.next();
            if (eVar.b == fVar2) {
                eVar.c = true;
                copyOnWriteArrayList.remove(eVar);
            }
        }
        u1 u1Var = this.f0;
        if (u1Var.o) {
            this.f0 = u1Var.a();
        }
        u1 g10 = this.f0.g(1);
        this.f0 = g10;
        u1 b10 = g10.b(g10.b);
        this.f0 = b10;
        b10.p = b10.r;
        this.f0.q = 0L;
        k3.f fVar3 = this.q;
        h5.a0 a0Var = fVar3.n;
        h5.a.j(a0Var);
        a0Var.c(new e3.h(fVar3, 20));
        this.h.a();
        U();
        Surface surface = this.Q;
        if (surface != null) {
            surface.release();
            this.Q = null;
        }
        int i10 = v4.c.b;
        this.c0 = true;
    }

    @Override // cb.e
    public final void K(int i10, int i11, long j10) {
        j0();
        h5.a.f(i10 >= 0);
        k3.f fVar = this.q;
        if (!fVar.r) {
            k3.a k10 = fVar.k();
            fVar.r = true;
            fVar.q(k10, -1, new gg.f(k10, 15));
        }
        o2 o2Var = this.f0.a;
        if (o2Var.p() || i10 < o2Var.o()) {
            this.F++;
            if (f()) {
                h5.a.K("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                xe.g gVar = new xe.g(this.f0);
                gVar.a(1);
                f0 f0Var = this.j.a;
                f0Var.i.c(new ff.c(17, f0Var, gVar));
                return;
            }
            u1 u1Var = this.f0;
            int i12 = u1Var.e;
            if (i12 == 3 || (i12 == 4 && !o2Var.p())) {
                u1Var = this.f0.g(2);
            }
            int x10 = x();
            u1 R = R(u1Var, o2Var, S(o2Var, i10, j10));
            this.k.n.a(3, new j0(o2Var, i10, h5.d0.G(j10))).b();
            h0(R, 0, 1, true, 1, O(R), x10);
        }
    }

    public final e1 L() {
        o2 z4 = z();
        if (z4.p()) {
            return this.e0;
        }
        c1 c1Var = z4.m(x(), (n2) this.a, 0L).c;
        d1 a2 = this.e0.a();
        e1 e1Var = c1Var.d;
        if (e1Var != null) {
            CharSequence charSequence = e1Var.a;
            if (charSequence != null) {
                a2.a = charSequence;
            }
            CharSequence charSequence2 = e1Var.b;
            if (charSequence2 != null) {
                a2.b = charSequence2;
            }
            CharSequence charSequence3 = e1Var.c;
            if (charSequence3 != null) {
                a2.c = charSequence3;
            }
            CharSequence charSequence4 = e1Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = e1Var.e;
            if (charSequence5 != null) {
                a2.e = charSequence5;
            }
            CharSequence charSequence6 = e1Var.f;
            if (charSequence6 != null) {
                a2.f = charSequence6;
            }
            CharSequence charSequence7 = e1Var.h;
            if (charSequence7 != null) {
                a2.g = charSequence7;
            }
            f2 f2Var = e1Var.n;
            if (f2Var != null) {
                a2.h = f2Var;
            }
            f2 f2Var2 = e1Var.r;
            if (f2Var2 != null) {
                a2.i = f2Var2;
            }
            byte[] bArr = e1Var.s;
            if (bArr != null) {
                Integer num = e1Var.v;
                a2.j = (byte[]) bArr.clone();
                a2.k = num;
            }
            Uri uri = e1Var.w;
            if (uri != null) {
                a2.l = uri;
            }
            Integer num2 = e1Var.x;
            if (num2 != null) {
                a2.m = num2;
            }
            Integer num3 = e1Var.y;
            if (num3 != null) {
                a2.n = num3;
            }
            Integer num4 = e1Var.B;
            if (num4 != null) {
                a2.o = num4;
            }
            Boolean bool = e1Var.C;
            if (bool != null) {
                a2.p = bool;
            }
            Boolean bool2 = e1Var.D;
            if (bool2 != null) {
                a2.q = bool2;
            }
            Integer num5 = e1Var.E;
            if (num5 != null) {
                a2.r = num5;
            }
            Integer num6 = e1Var.F;
            if (num6 != null) {
                a2.r = num6;
            }
            Integer num7 = e1Var.G;
            if (num7 != null) {
                a2.s = num7;
            }
            Integer num8 = e1Var.H;
            if (num8 != null) {
                a2.t = num8;
            }
            Integer num9 = e1Var.I;
            if (num9 != null) {
                a2.u = num9;
            }
            Integer num10 = e1Var.J;
            if (num10 != null) {
                a2.v = num10;
            }
            Integer num11 = e1Var.K;
            if (num11 != null) {
                a2.w = num11;
            }
            CharSequence charSequence8 = e1Var.L;
            if (charSequence8 != null) {
                a2.x = charSequence8;
            }
            CharSequence charSequence9 = e1Var.M;
            if (charSequence9 != null) {
                a2.y = charSequence9;
            }
            CharSequence charSequence10 = e1Var.N;
            if (charSequence10 != null) {
                a2.z = charSequence10;
            }
            Integer num12 = e1Var.O;
            if (num12 != null) {
                a2.A = num12;
            }
            Integer num13 = e1Var.P;
            if (num13 != null) {
                a2.B = num13;
            }
            CharSequence charSequence11 = e1Var.Q;
            if (charSequence11 != null) {
                a2.C = charSequence11;
            }
            CharSequence charSequence12 = e1Var.R;
            if (charSequence12 != null) {
                a2.D = charSequence12;
            }
            CharSequence charSequence13 = e1Var.S;
            if (charSequence13 != null) {
                a2.E = charSequence13;
            }
            Integer num14 = e1Var.T;
            if (num14 != null) {
                a2.F = num14;
            }
            Bundle bundle = e1Var.U;
            if (bundle != null) {
                a2.G = bundle;
            }
        }
        return new e1(a2);
    }

    public final c2 M(b2 b2Var) {
        int P = P(this.f0);
        o2 o2Var = this.f0.a;
        int i10 = P == -1 ? 0 : P;
        h5.y yVar = this.v;
        k0 k0Var = this.k;
        return new c2(k0Var, b2Var, o2Var, i10, yVar, k0Var.s);
    }

    public final long N(u1 u1Var) {
        o4.v vVar = u1Var.b;
        long j10 = u1Var.c;
        o2 o2Var = u1Var.a;
        if (!vVar.a()) {
            return h5.d0.S(O(u1Var));
        }
        Object obj = u1Var.b.a;
        m2 m2Var = this.n;
        o2Var.g(obj, m2Var);
        if (j10 == -9223372036854775807L) {
            return h5.d0.S(o2Var.m(P(u1Var), (n2) this.a, 0L).x);
        }
        return h5.d0.S(j10) + h5.d0.S(m2Var.e);
    }

    public final long O(u1 u1Var) {
        if (u1Var.a.p()) {
            return h5.d0.G(this.h0);
        }
        long j10 = u1Var.o ? u1Var.j() : u1Var.r;
        if (u1Var.b.a()) {
            return j10;
        }
        o2 o2Var = u1Var.a;
        Object obj = u1Var.b.a;
        m2 m2Var = this.n;
        o2Var.g(obj, m2Var);
        return j10 + m2Var.e;
    }

    public final int P(u1 u1Var) {
        return u1Var.a.p() ? this.g0 : u1Var.a.g(u1Var.b.a, this.n).c;
    }

    public final u1 R(u1 u1Var, o2 o2Var, Pair pair) {
        List list;
        h5.a.f(o2Var.p() || pair != null);
        o2 o2Var2 = u1Var.a;
        long N = N(u1Var);
        u1 h = u1Var.h(o2Var);
        if (o2Var.p()) {
            o4.v vVar = u1.t;
            long G = h5.d0.G(this.h0);
            u1 b10 = h.c(vVar, G, G, G, 0L, o4.t0.d, this.b, s8.i0.e).b(vVar);
            b10.p = b10.r;
            return b10;
        }
        Object obj = h.b.a;
        int i10 = h5.d0.a;
        boolean equals = obj.equals(pair.first);
        o4.v vVar2 = !equals ? new o4.v(pair.first) : h.b;
        long longValue = ((Long) pair.second).longValue();
        long G2 = h5.d0.G(N);
        if (!o2Var2.p()) {
            G2 -= o2Var2.g(obj, this.n).e;
        }
        if (!equals || longValue < G2) {
            o4.v vVar3 = vVar2;
            h5.a.i(!vVar3.a());
            o4.t0 t0Var = !equals ? o4.t0.d : h.h;
            f5.x xVar = !equals ? this.b : h.i;
            if (equals) {
                list = h.j;
            } else {
                s8.t tVar = s8.v.b;
                list = s8.i0.e;
            }
            u1 b11 = h.c(vVar3, longValue, longValue, longValue, 0L, t0Var, xVar, list).b(vVar3);
            b11.p = longValue;
            return b11;
        }
        if (longValue != G2) {
            o4.v vVar4 = vVar2;
            h5.a.i(!vVar4.a());
            long max = Math.max(0L, h.q - (longValue - G2));
            long j10 = h.p;
            if (h.k.equals(h.b)) {
                j10 = longValue + max;
            }
            u1 c3 = h.c(vVar4, longValue, longValue, longValue, max, h.h, h.i, h.j);
            c3.p = j10;
            return c3;
        }
        int b12 = o2Var.b(h.k.a);
        if (b12 != -1 && o2Var.f(b12, this.n, false).c == o2Var.g(vVar2.a, this.n).c) {
            return h;
        }
        o2Var.g(vVar2.a, this.n);
        long a2 = vVar2.a() ? this.n.a(vVar2.b, vVar2.c) : this.n.d;
        o4.v vVar5 = vVar2;
        u1 b13 = h.c(vVar5, h.r, h.r, h.d, a2 - h.r, h.h, h.i, h.j).b(vVar5);
        b13.p = a2;
        return b13;
    }

    public final Pair S(o2 o2Var, int i10, long j10) {
        if (o2Var.p()) {
            this.g0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.h0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= o2Var.o()) {
            i10 = o2Var.a(this.E);
            j10 = h5.d0.S(o2Var.m(i10, (n2) this.a, 0L).x);
        }
        return o2Var.i((n2) this.a, this.n, i10, h5.d0.G(j10));
    }

    public final void T(int i10, int i11) {
        h5.x xVar = this.V;
        if (i10 == xVar.a && i11 == xVar.b) {
            return;
        }
        this.V = new h5.x(i10, i11);
        Executor executor = this.i0;
        if (executor != null) {
            executor.execute(new v(this, i10, i11, 0));
            return;
        }
        this.l.e(24, new w(i10, i11, 0));
        V(2, 14, new h5.x(i10, i11));
    }

    public final void U() {
        TextureView textureView = this.T;
        c0 c0Var = this.w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != c0Var) {
                h5.a.K("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.T.setSurfaceTextureListener(null);
            }
            this.T = null;
        }
        SurfaceHolder surfaceHolder = this.R;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(c0Var);
            this.R = null;
        }
    }

    public final void V(int i10, int i11, Object obj) {
        for (e eVar : this.g) {
            if (eVar.b == i10) {
                c2 M = M(eVar);
                h5.a.i(!M.g);
                M.d = i11;
                h5.a.i(!M.g);
                M.e = obj;
                M.c();
            }
        }
    }

    public final void W(l3.d dVar, boolean z4) {
        j0();
        if (this.c0) {
            return;
        }
        boolean a2 = h5.d0.a(this.X, dVar);
        int i10 = 1;
        h5.m mVar = this.l;
        if (!a2) {
            this.X = dVar;
            V(1, 3, dVar);
            mVar.c(20, new gg.f(dVar, 10));
        }
        l3.d dVar2 = z4 ? dVar : null;
        d dVar3 = this.z;
        dVar3.b(dVar2);
        this.h.b(dVar);
        boolean j10 = j();
        int d = dVar3.d(c(), j10);
        if (j10 && d != 1) {
            i10 = 2;
        }
        g0(d, i10, j10);
        mVar.b();
    }

    public final void X(o4.a aVar, boolean z4) {
        j0();
        List singletonList = Collections.singletonList(aVar);
        j0();
        int P = P(this.f0);
        long C = C();
        this.F++;
        ArrayList arrayList = this.o;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                arrayList.remove(i10);
            }
            this.K = this.K.b(size);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < singletonList.size(); i11++) {
            p1 p1Var = new p1((o4.a) singletonList.get(i11), this.p);
            arrayList2.add(p1Var);
            arrayList.add(i11, new e0(p1Var.b, p1Var.a.o));
        }
        this.K = this.K.e(arrayList2.size());
        e2 e2Var = new e2(arrayList, this.K);
        boolean p10 = e2Var.p();
        int i12 = e2Var.e;
        if (!p10 && -1 >= i12) {
            throw new p0();
        }
        if (z4) {
            P = e2Var.a(this.E);
            C = -9223372036854775807L;
        }
        int i13 = P;
        u1 R = R(this.f0, e2Var, S(e2Var, i13, C));
        int i14 = R.e;
        if (i13 != -1 && i14 != 1) {
            i14 = (e2Var.p() || i13 >= i12) ? 4 : 2;
        }
        u1 g10 = R.g(i14);
        this.k.n.a(17, new h0(arrayList2, this.K, i13, h5.d0.G(C))).b();
        h0(g10, 0, 1, (this.f0.b.a.equals(g10.b.a) || this.f0.a.p()) ? false : true, 4, O(g10), -1);
    }

    public final void Y(h2 h2Var) {
        j0();
        if (h2Var == null) {
            h2Var = h2.e;
        }
        if (this.J.equals(h2Var)) {
            return;
        }
        this.J = h2Var;
        this.k.n.a(5, h2Var).b();
    }

    public final void Z(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z4 = false;
        for (e eVar : this.g) {
            if (eVar.b == 2) {
                c2 M = M(eVar);
                h5.a.i(!M.g);
                M.d = 1;
                h5.a.i(true ^ M.g);
                M.e = surface;
                M.c();
                arrayList.add(M);
            }
        }
        Object obj = this.P;
        if (obj != null && obj != surface) {
            try {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    ((c2) obj2).a(this.C);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z4 = true;
            }
            Object obj3 = this.P;
            Surface surface2 = this.Q;
            if (obj3 == surface2) {
                try {
                    surface2.release();
                } catch (Throwable unused3) {
                }
                this.Q = null;
            }
        }
        this.P = surface;
        if (z4) {
            e0(new n(2, new a7.b("Detaching surface timed out."), 1003));
        }
    }

    @Override // j3.a2
    public final void a(v1 v1Var) {
        j0();
        if (this.f0.n.equals(v1Var)) {
            return;
        }
        u1 f10 = this.f0.f(v1Var);
        this.F++;
        this.k.n.a(4, v1Var).b();
        h0(f10, 0, 1, false, 5, -9223372036854775807L, -1);
    }

    public final void a0(Surface surface) {
        j0();
        U();
        Z(surface);
        int i10 = surface == null ? 0 : -1;
        T(i10, i10);
    }

    @Override // j3.a2
    public final void b() {
        j0();
        boolean j10 = j();
        int d = this.z.d(2, j10);
        g0(d, (!j10 || d == 1) ? 1 : 2, j10);
        u1 u1Var = this.f0;
        if (u1Var.e != 1) {
            return;
        }
        u1 e = u1Var.e(null);
        u1 g10 = e.g(e.a.p() ? 4 : 2);
        this.F++;
        h5.a0 a0Var = this.k.n;
        a0Var.getClass();
        h5.z b10 = h5.a0.b();
        b10.a = a0Var.a.obtainMessage(0);
        b10.b();
        h0(g10, 1, 1, false, 5, -9223372036854775807L, -1);
    }

    public final void b0(SurfaceView surfaceView) {
        j0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        j0();
        if (holder == null) {
            j0();
            U();
            Z(null);
            T(0, 0);
            return;
        }
        U();
        this.S = true;
        this.R = holder;
        holder.addCallback(this.w);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            Z(null);
            T(0, 0);
        } else {
            Z(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            T(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // j3.a2
    public final int c() {
        j0();
        return this.f0.e;
    }

    public final void c0(TextureView textureView) {
        j0();
        if (textureView == null) {
            j0();
            U();
            Z(null);
            T(0, 0);
            return;
        }
        U();
        this.T = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            h5.a.K("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.w);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            Z(null);
            T(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            Z(surface);
            this.Q = surface;
            T(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // j3.a2
    public final v1 d() {
        j0();
        return this.f0.n;
    }

    public final void d0(float f10) {
        j0();
        final float g10 = h5.d0.g(f10, 0.0f, 1.0f);
        if (this.Y == g10) {
            return;
        }
        this.Y = g10;
        V(1, 2, Float.valueOf(this.z.g * g10));
        this.l.e(22, new h5.j() { // from class: j3.t
            @Override // h5.j
            public final void invoke(Object obj) {
                ((y1) obj).onVolumeChanged(g10);
            }
        });
    }

    @Override // j3.a2
    public final void e(int i10) {
        j0();
        if (this.D != i10) {
            this.D = i10;
            h5.a0 a0Var = this.k.n;
            a0Var.getClass();
            h5.z b10 = h5.a0.b();
            b10.a = a0Var.a.obtainMessage(11, i10, 0);
            b10.b();
            d4.b bVar = new d4.b(i10, 2);
            h5.m mVar = this.l;
            mVar.c(8, bVar);
            f0();
            mVar.b();
        }
    }

    public final void e0(n nVar) {
        u1 u1Var = this.f0;
        u1 b10 = u1Var.b(u1Var.b);
        b10.p = b10.r;
        b10.q = 0L;
        u1 g10 = b10.g(1);
        if (nVar != null) {
            g10 = g10.e(nVar);
        }
        u1 u1Var2 = g10;
        this.F++;
        h5.a0 a0Var = this.k.n;
        a0Var.getClass();
        h5.z b11 = h5.a0.b();
        b11.a = a0Var.a.obtainMessage(6);
        b11.b();
        h0(u1Var2, 0, 1, false, 5, -9223372036854775807L, -1);
    }

    @Override // j3.a2
    public final boolean f() {
        j0();
        return this.f0.b.a();
    }

    public final void f0() {
        int k10;
        int e;
        w1 w1Var = this.L;
        int i10 = h5.d0.a;
        a2 a2Var = this.f;
        boolean f10 = a2Var.f();
        cb.e eVar = (cb.e) a2Var;
        n2 n2Var = (n2) eVar.a;
        o2 z4 = eVar.z();
        boolean z10 = !z4.p() && z4.m(eVar.x(), n2Var, 0L).n;
        o2 z11 = eVar.z();
        if (z11.p()) {
            k10 = -1;
        } else {
            int x10 = eVar.x();
            int g10 = eVar.g();
            if (g10 == 1) {
                g10 = 0;
            }
            k10 = z11.k(x10, g10, eVar.B());
        }
        boolean z12 = k10 != -1;
        o2 z13 = eVar.z();
        if (z13.p()) {
            e = -1;
        } else {
            int x11 = eVar.x();
            int g11 = eVar.g();
            if (g11 == 1) {
                g11 = 0;
            }
            e = z13.e(x11, g11, eVar.B());
        }
        boolean z14 = e != -1;
        o2 z15 = eVar.z();
        boolean z16 = !z15.p() && z15.m(eVar.x(), n2Var, 0L).a();
        o2 z17 = eVar.z();
        boolean z18 = !z17.p() && z17.m(eVar.x(), n2Var, 0L).r;
        boolean p10 = a2Var.z().p();
        ja.c cVar = new ja.c(14);
        c2.u uVar = (c2.u) cVar.b;
        h5.g gVar = this.c.a;
        uVar.getClass();
        for (int i11 = 0; i11 < gVar.a.size(); i11++) {
            uVar.b(gVar.a(i11));
        }
        boolean z19 = !f10;
        cVar.c(4, z19);
        cVar.c(5, z10 && !f10);
        cVar.c(6, z12 && !f10);
        cVar.c(7, !p10 && (z12 || !z16 || z10) && !f10);
        cVar.c(8, z14 && !f10);
        cVar.c(9, !p10 && (z14 || (z16 && z18)) && !f10);
        cVar.c(10, z19);
        cVar.c(11, z10 && !f10);
        cVar.c(12, z10 && !f10);
        w1 w1Var2 = new w1(uVar.c());
        this.L = w1Var2;
        if (w1Var2.equals(w1Var)) {
            return;
        }
        this.l.c(13, new u(this));
    }

    @Override // j3.a2
    public final int g() {
        j0();
        return this.D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final void g0(int i10, int i11, boolean z4) {
        int i12 = 0;
        ?? r14 = (!z4 || i10 == -1) ? 0 : 1;
        if (r14 != 0 && i10 != 1) {
            i12 = 1;
        }
        u1 u1Var = this.f0;
        if (u1Var.l == r14 && u1Var.m == i12) {
            return;
        }
        this.F++;
        boolean z10 = u1Var.o;
        u1 u1Var2 = u1Var;
        if (z10) {
            u1Var2 = u1Var.a();
        }
        u1 d = u1Var2.d(i12, r14);
        h5.a0 a0Var = this.k.n;
        a0Var.getClass();
        h5.z b10 = h5.a0.b();
        b10.a = a0Var.a.obtainMessage(1, r14, i12);
        b10.b();
        h0(d, 0, i11, false, 5, -9223372036854775807L, -1);
    }

    @Override // j3.a2
    public final long getDuration() {
        j0();
        if (!f()) {
            o2 z4 = z();
            if (z4.p()) {
                return -9223372036854775807L;
            }
            return h5.d0.S(z4.m(x(), (n2) this.a, 0L).y);
        }
        u1 u1Var = this.f0;
        o4.v vVar = u1Var.b;
        o2 o2Var = u1Var.a;
        Object obj = vVar.a;
        m2 m2Var = this.n;
        o2Var.g(obj, m2Var);
        return h5.d0.S(m2Var.a(vVar.b, vVar.c));
    }

    @Override // j3.a2
    public final long h() {
        j0();
        return h5.d0.S(this.f0.q);
    }

    public final void h0(final u1 u1Var, final int i10, final int i11, boolean z4, int i12, long j10, int i13) {
        Pair pair;
        int i14;
        c1 c1Var;
        boolean z10;
        boolean z11;
        boolean z12;
        int i15;
        Object obj;
        c1 c1Var2;
        Object obj2;
        int i16;
        long j11;
        long j12;
        long j13;
        long Q;
        Object obj3;
        c1 c1Var3;
        Object obj4;
        int i17;
        u1 u1Var2 = this.f0;
        this.f0 = u1Var;
        boolean equals = u1Var2.a.equals(u1Var.a);
        n2 n2Var = (n2) this.a;
        m2 m2Var = this.n;
        o2 o2Var = u1Var2.a;
        o4.v vVar = u1Var2.b;
        o2 o2Var2 = u1Var.a;
        o4.v vVar2 = u1Var.b;
        if (o2Var2.p() && o2Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (o2Var2.p() != o2Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (o2Var.m(o2Var.g(vVar.a, m2Var).c, n2Var, 0L).a.equals(o2Var2.m(o2Var2.g(vVar2.a, m2Var).c, n2Var, 0L).a)) {
            pair = (z4 && i12 == 0 && vVar.d < vVar2.d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z4 && i12 == 0) {
                i14 = 1;
            } else if (z4 && i12 == 1) {
                i14 = 2;
            } else {
                if (equals) {
                    throw new IllegalStateException();
                }
                i14 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i14));
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        e1 e1Var = this.M;
        if (booleanValue) {
            c1Var = !u1Var.a.p() ? u1Var.a.m(u1Var.a.g(u1Var.b.a, this.n).c, (n2) this.a, 0L).c : null;
            this.e0 = e1.V;
        } else {
            c1Var = null;
        }
        if (booleanValue || !u1Var2.j.equals(u1Var.j)) {
            d1 a2 = this.e0.a();
            List list = u1Var.j;
            for (int i18 = 0; i18 < list.size(); i18++) {
                e4.c cVar = (e4.c) list.get(i18);
                int i19 = 0;
                while (true) {
                    e4.b[] bVarArr = cVar.a;
                    if (i19 < bVarArr.length) {
                        bVarArr[i19].c(a2);
                        i19++;
                    }
                }
            }
            this.e0 = new e1(a2);
            e1Var = L();
        }
        boolean equals2 = e1Var.equals(this.M);
        this.M = e1Var;
        boolean z13 = u1Var2.l != u1Var.l;
        boolean z14 = u1Var2.e != u1Var.e;
        if (z14 || z13) {
            i0();
        }
        boolean z15 = u1Var2.g != u1Var.g;
        if (!equals) {
            final int i20 = 0;
            this.l.c(0, new h5.j() { // from class: j3.r
                @Override // h5.j
                public final void invoke(Object obj5) {
                    y1 y1Var = (y1) obj5;
                    switch (i20) {
                        case 0:
                            y1Var.onTimelineChanged(u1Var.a, i10);
                            break;
                        default:
                            y1Var.onPlayWhenReadyChanged(u1Var.l, i10);
                            break;
                    }
                }
            });
        }
        if (z4) {
            m2 m2Var2 = new m2();
            if (u1Var2.a.p()) {
                z10 = booleanValue;
                z11 = z13;
                z12 = equals2;
                i15 = i13;
                obj = null;
                c1Var2 = null;
                obj2 = null;
                i16 = -1;
            } else {
                Object obj5 = u1Var2.b.a;
                u1Var2.a.g(obj5, m2Var2);
                int i21 = m2Var2.c;
                int b10 = u1Var2.a.b(obj5);
                z10 = booleanValue;
                z11 = z13;
                z12 = equals2;
                obj = u1Var2.a.m(i21, (n2) this.a, 0L).a;
                c1Var2 = ((n2) this.a).c;
                obj2 = obj5;
                i15 = i21;
                i16 = b10;
            }
            if (i12 == 0) {
                if (u1Var2.b.a()) {
                    o4.v vVar3 = u1Var2.b;
                    j13 = m2Var2.a(vVar3.b, vVar3.c);
                    Q = Q(u1Var2);
                } else if (u1Var2.b.e != -1) {
                    j13 = Q(this.f0);
                    Q = j13;
                } else {
                    j11 = m2Var2.e;
                    j12 = m2Var2.d;
                    j13 = j11 + j12;
                    Q = j13;
                }
            } else if (u1Var2.b.a()) {
                j13 = u1Var2.r;
                Q = Q(u1Var2);
            } else {
                j11 = m2Var2.e;
                j12 = u1Var2.r;
                j13 = j11 + j12;
                Q = j13;
            }
            long S = h5.d0.S(j13);
            long S2 = h5.d0.S(Q);
            o4.v vVar4 = u1Var2.b;
            z1 z1Var = new z1(obj, i15, c1Var2, obj2, i16, S, S2, vVar4.b, vVar4.c);
            n2 n2Var2 = (n2) this.a;
            int x10 = x();
            if (this.f0.a.p()) {
                obj3 = null;
                c1Var3 = null;
                obj4 = null;
                i17 = -1;
            } else {
                u1 u1Var3 = this.f0;
                Object obj6 = u1Var3.b.a;
                u1Var3.a.g(obj6, this.n);
                int b11 = this.f0.a.b(obj6);
                Object obj7 = this.f0.a.m(x10, n2Var2, 0L).a;
                c1Var3 = n2Var2.c;
                i17 = b11;
                obj4 = obj6;
                obj3 = obj7;
            }
            long S3 = h5.d0.S(j10);
            long S4 = this.f0.b.a() ? h5.d0.S(Q(this.f0)) : S3;
            o4.v vVar5 = this.f0.b;
            this.l.c(11, new e3.d(i12, z1Var, new z1(obj3, x10, c1Var3, obj4, i17, S3, S4, vVar5.b, vVar5.c), 1));
        } else {
            z10 = booleanValue;
            z11 = z13;
            z12 = equals2;
        }
        if (z10) {
            this.l.c(1, new gg.m2(c1Var, intValue, 1));
        }
        if (u1Var2.f != u1Var.f) {
            final int i22 = 6;
            this.l.c(10, new h5.j() { // from class: j3.s
                @Override // h5.j
                public final void invoke(Object obj8) {
                    y1 y1Var = (y1) obj8;
                    switch (i22) {
                        case 0:
                            u1 u1Var4 = u1Var;
                            y1Var.onLoadingChanged(u1Var4.g);
                            y1Var.onIsLoadingChanged(u1Var4.g);
                            break;
                        case 1:
                            u1 u1Var5 = u1Var;
                            y1Var.onPlayerStateChanged(u1Var5.l, u1Var5.e);
                            break;
                        case 2:
                            y1Var.onPlaybackStateChanged(u1Var.e);
                            break;
                        case 3:
                            y1Var.onPlaybackSuppressionReasonChanged(u1Var.m);
                            break;
                        case 4:
                            y1Var.onIsPlayingChanged(u1Var.k());
                            break;
                        case 5:
                            y1Var.onPlaybackParametersChanged(u1Var.n);
                            break;
                        case 6:
                            y1Var.onPlayerErrorChanged(u1Var.f);
                            break;
                        case 7:
                            y1Var.onPlayerError(u1Var.f);
                            break;
                        default:
                            y1Var.onTracksChanged(u1Var.i.d);
                            break;
                    }
                }
            });
            if (u1Var.f != null) {
                final int i23 = 7;
                this.l.c(10, new h5.j() { // from class: j3.s
                    @Override // h5.j
                    public final void invoke(Object obj8) {
                        y1 y1Var = (y1) obj8;
                        switch (i23) {
                            case 0:
                                u1 u1Var4 = u1Var;
                                y1Var.onLoadingChanged(u1Var4.g);
                                y1Var.onIsLoadingChanged(u1Var4.g);
                                break;
                            case 1:
                                u1 u1Var5 = u1Var;
                                y1Var.onPlayerStateChanged(u1Var5.l, u1Var5.e);
                                break;
                            case 2:
                                y1Var.onPlaybackStateChanged(u1Var.e);
                                break;
                            case 3:
                                y1Var.onPlaybackSuppressionReasonChanged(u1Var.m);
                                break;
                            case 4:
                                y1Var.onIsPlayingChanged(u1Var.k());
                                break;
                            case 5:
                                y1Var.onPlaybackParametersChanged(u1Var.n);
                                break;
                            case 6:
                                y1Var.onPlayerErrorChanged(u1Var.f);
                                break;
                            case 7:
                                y1Var.onPlayerError(u1Var.f);
                                break;
                            default:
                                y1Var.onTracksChanged(u1Var.i.d);
                                break;
                        }
                    }
                });
            }
        }
        f5.x xVar = u1Var2.i;
        f5.x xVar2 = u1Var.i;
        if (xVar != xVar2) {
            f5.t tVar = this.h;
            Object obj8 = xVar2.e;
            tVar.getClass();
            tVar.c = (f5.s) obj8;
            final int i24 = 8;
            this.l.c(2, new h5.j() { // from class: j3.s
                @Override // h5.j
                public final void invoke(Object obj82) {
                    y1 y1Var = (y1) obj82;
                    switch (i24) {
                        case 0:
                            u1 u1Var4 = u1Var;
                            y1Var.onLoadingChanged(u1Var4.g);
                            y1Var.onIsLoadingChanged(u1Var4.g);
                            break;
                        case 1:
                            u1 u1Var5 = u1Var;
                            y1Var.onPlayerStateChanged(u1Var5.l, u1Var5.e);
                            break;
                        case 2:
                            y1Var.onPlaybackStateChanged(u1Var.e);
                            break;
                        case 3:
                            y1Var.onPlaybackSuppressionReasonChanged(u1Var.m);
                            break;
                        case 4:
                            y1Var.onIsPlayingChanged(u1Var.k());
                            break;
                        case 5:
                            y1Var.onPlaybackParametersChanged(u1Var.n);
                            break;
                        case 6:
                            y1Var.onPlayerErrorChanged(u1Var.f);
                            break;
                        case 7:
                            y1Var.onPlayerError(u1Var.f);
                            break;
                        default:
                            y1Var.onTracksChanged(u1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (!z12) {
            this.l.c(14, new gg.f(this.M, 9));
        }
        if (z15) {
            final int i25 = 0;
            this.l.c(3, new h5.j() { // from class: j3.s
                @Override // h5.j
                public final void invoke(Object obj82) {
                    y1 y1Var = (y1) obj82;
                    switch (i25) {
                        case 0:
                            u1 u1Var4 = u1Var;
                            y1Var.onLoadingChanged(u1Var4.g);
                            y1Var.onIsLoadingChanged(u1Var4.g);
                            break;
                        case 1:
                            u1 u1Var5 = u1Var;
                            y1Var.onPlayerStateChanged(u1Var5.l, u1Var5.e);
                            break;
                        case 2:
                            y1Var.onPlaybackStateChanged(u1Var.e);
                            break;
                        case 3:
                            y1Var.onPlaybackSuppressionReasonChanged(u1Var.m);
                            break;
                        case 4:
                            y1Var.onIsPlayingChanged(u1Var.k());
                            break;
                        case 5:
                            y1Var.onPlaybackParametersChanged(u1Var.n);
                            break;
                        case 6:
                            y1Var.onPlayerErrorChanged(u1Var.f);
                            break;
                        case 7:
                            y1Var.onPlayerError(u1Var.f);
                            break;
                        default:
                            y1Var.onTracksChanged(u1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z14 || z11) {
            final int i26 = 1;
            this.l.c(-1, new h5.j() { // from class: j3.s
                @Override // h5.j
                public final void invoke(Object obj82) {
                    y1 y1Var = (y1) obj82;
                    switch (i26) {
                        case 0:
                            u1 u1Var4 = u1Var;
                            y1Var.onLoadingChanged(u1Var4.g);
                            y1Var.onIsLoadingChanged(u1Var4.g);
                            break;
                        case 1:
                            u1 u1Var5 = u1Var;
                            y1Var.onPlayerStateChanged(u1Var5.l, u1Var5.e);
                            break;
                        case 2:
                            y1Var.onPlaybackStateChanged(u1Var.e);
                            break;
                        case 3:
                            y1Var.onPlaybackSuppressionReasonChanged(u1Var.m);
                            break;
                        case 4:
                            y1Var.onIsPlayingChanged(u1Var.k());
                            break;
                        case 5:
                            y1Var.onPlaybackParametersChanged(u1Var.n);
                            break;
                        case 6:
                            y1Var.onPlayerErrorChanged(u1Var.f);
                            break;
                        case 7:
                            y1Var.onPlayerError(u1Var.f);
                            break;
                        default:
                            y1Var.onTracksChanged(u1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z14) {
            final int i27 = 2;
            this.l.c(4, new h5.j() { // from class: j3.s
                @Override // h5.j
                public final void invoke(Object obj82) {
                    y1 y1Var = (y1) obj82;
                    switch (i27) {
                        case 0:
                            u1 u1Var4 = u1Var;
                            y1Var.onLoadingChanged(u1Var4.g);
                            y1Var.onIsLoadingChanged(u1Var4.g);
                            break;
                        case 1:
                            u1 u1Var5 = u1Var;
                            y1Var.onPlayerStateChanged(u1Var5.l, u1Var5.e);
                            break;
                        case 2:
                            y1Var.onPlaybackStateChanged(u1Var.e);
                            break;
                        case 3:
                            y1Var.onPlaybackSuppressionReasonChanged(u1Var.m);
                            break;
                        case 4:
                            y1Var.onIsPlayingChanged(u1Var.k());
                            break;
                        case 5:
                            y1Var.onPlaybackParametersChanged(u1Var.n);
                            break;
                        case 6:
                            y1Var.onPlayerErrorChanged(u1Var.f);
                            break;
                        case 7:
                            y1Var.onPlayerError(u1Var.f);
                            break;
                        default:
                            y1Var.onTracksChanged(u1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (z11) {
            final int i28 = 1;
            this.l.c(5, new h5.j() { // from class: j3.r
                @Override // h5.j
                public final void invoke(Object obj52) {
                    y1 y1Var = (y1) obj52;
                    switch (i28) {
                        case 0:
                            y1Var.onTimelineChanged(u1Var.a, i11);
                            break;
                        default:
                            y1Var.onPlayWhenReadyChanged(u1Var.l, i11);
                            break;
                    }
                }
            });
        }
        if (u1Var2.m != u1Var.m) {
            final int i29 = 3;
            this.l.c(6, new h5.j() { // from class: j3.s
                @Override // h5.j
                public final void invoke(Object obj82) {
                    y1 y1Var = (y1) obj82;
                    switch (i29) {
                        case 0:
                            u1 u1Var4 = u1Var;
                            y1Var.onLoadingChanged(u1Var4.g);
                            y1Var.onIsLoadingChanged(u1Var4.g);
                            break;
                        case 1:
                            u1 u1Var5 = u1Var;
                            y1Var.onPlayerStateChanged(u1Var5.l, u1Var5.e);
                            break;
                        case 2:
                            y1Var.onPlaybackStateChanged(u1Var.e);
                            break;
                        case 3:
                            y1Var.onPlaybackSuppressionReasonChanged(u1Var.m);
                            break;
                        case 4:
                            y1Var.onIsPlayingChanged(u1Var.k());
                            break;
                        case 5:
                            y1Var.onPlaybackParametersChanged(u1Var.n);
                            break;
                        case 6:
                            y1Var.onPlayerErrorChanged(u1Var.f);
                            break;
                        case 7:
                            y1Var.onPlayerError(u1Var.f);
                            break;
                        default:
                            y1Var.onTracksChanged(u1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (u1Var2.k() != u1Var.k()) {
            final int i30 = 4;
            this.l.c(7, new h5.j() { // from class: j3.s
                @Override // h5.j
                public final void invoke(Object obj82) {
                    y1 y1Var = (y1) obj82;
                    switch (i30) {
                        case 0:
                            u1 u1Var4 = u1Var;
                            y1Var.onLoadingChanged(u1Var4.g);
                            y1Var.onIsLoadingChanged(u1Var4.g);
                            break;
                        case 1:
                            u1 u1Var5 = u1Var;
                            y1Var.onPlayerStateChanged(u1Var5.l, u1Var5.e);
                            break;
                        case 2:
                            y1Var.onPlaybackStateChanged(u1Var.e);
                            break;
                        case 3:
                            y1Var.onPlaybackSuppressionReasonChanged(u1Var.m);
                            break;
                        case 4:
                            y1Var.onIsPlayingChanged(u1Var.k());
                            break;
                        case 5:
                            y1Var.onPlaybackParametersChanged(u1Var.n);
                            break;
                        case 6:
                            y1Var.onPlayerErrorChanged(u1Var.f);
                            break;
                        case 7:
                            y1Var.onPlayerError(u1Var.f);
                            break;
                        default:
                            y1Var.onTracksChanged(u1Var.i.d);
                            break;
                    }
                }
            });
        }
        if (!u1Var2.n.equals(u1Var.n)) {
            final int i31 = 5;
            this.l.c(12, new h5.j() { // from class: j3.s
                @Override // h5.j
                public final void invoke(Object obj82) {
                    y1 y1Var = (y1) obj82;
                    switch (i31) {
                        case 0:
                            u1 u1Var4 = u1Var;
                            y1Var.onLoadingChanged(u1Var4.g);
                            y1Var.onIsLoadingChanged(u1Var4.g);
                            break;
                        case 1:
                            u1 u1Var5 = u1Var;
                            y1Var.onPlayerStateChanged(u1Var5.l, u1Var5.e);
                            break;
                        case 2:
                            y1Var.onPlaybackStateChanged(u1Var.e);
                            break;
                        case 3:
                            y1Var.onPlaybackSuppressionReasonChanged(u1Var.m);
                            break;
                        case 4:
                            y1Var.onIsPlayingChanged(u1Var.k());
                            break;
                        case 5:
                            y1Var.onPlaybackParametersChanged(u1Var.n);
                            break;
                        case 6:
                            y1Var.onPlayerErrorChanged(u1Var.f);
                            break;
                        case 7:
                            y1Var.onPlayerError(u1Var.f);
                            break;
                        default:
                            y1Var.onTracksChanged(u1Var.i.d);
                            break;
                    }
                }
            });
        }
        f0();
        this.l.b();
        if (u1Var2.o != u1Var.o) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).a.i0();
            }
        }
    }

    @Override // j3.a2
    public final w1 i() {
        j0();
        return this.L;
    }

    public final void i0() {
        int c3 = c();
        z9.d dVar = this.B;
        h7.u uVar = this.A;
        if (c3 != 1) {
            if (c3 == 2 || c3 == 3) {
                j0();
                boolean z4 = this.f0.o;
                j();
                uVar.getClass();
                j();
                dVar.getClass();
                return;
            }
            if (c3 != 4) {
                throw new IllegalStateException();
            }
        }
        uVar.getClass();
        dVar.getClass();
    }

    @Override // j3.a2
    public final boolean j() {
        j0();
        return this.f0.l;
    }

    public final void j0() {
        this.d.a();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.r;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i10 = h5.d0.a;
            Locale locale = Locale.US;
            String k10 = ai.k("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.a0) {
                throw new IllegalStateException(k10);
            }
            h5.a.L("ExoPlayerImpl", k10, this.b0 ? null : new IllegalStateException());
            this.b0 = true;
        }
    }

    @Override // j3.a2
    public final void k(boolean z4) {
        j0();
        if (this.E != z4) {
            this.E = z4;
            h5.a0 a0Var = this.k.n;
            a0Var.getClass();
            h5.z b10 = h5.a0.b();
            b10.a = a0Var.a.obtainMessage(12, z4 ? 1 : 0, 0);
            b10.b();
            x xVar = new x(0, z4);
            h5.m mVar = this.l;
            mVar.c(9, xVar);
            f0();
            mVar.b();
        }
    }

    @Override // j3.a2
    public final void l() {
        int i10;
        int i11;
        Pair S;
        j0();
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int min = Math.min(ConnectionsManager.DEFAULT_DATACENTER_ID, size);
        if (size <= 0 || min == 0) {
            return;
        }
        u1 u1Var = this.f0;
        int P = P(u1Var);
        long N = N(u1Var);
        o2 o2Var = u1Var.a;
        int size2 = arrayList.size();
        this.F++;
        for (int i12 = min - 1; i12 >= 0; i12--) {
            arrayList.remove(i12);
        }
        this.K = this.K.b(min);
        e2 e2Var = new e2(arrayList, this.K);
        if (o2Var.p() || e2Var.p()) {
            i10 = 1;
            i11 = 0;
            boolean z4 = !o2Var.p() && e2Var.p();
            int i13 = z4 ? -1 : P;
            if (z4) {
                N = -9223372036854775807L;
            }
            S = S(e2Var, i13, N);
        } else {
            Pair i14 = o2Var.i((n2) this.a, this.n, P, h5.d0.G(N));
            Object obj = i14.first;
            if (e2Var.b(obj) != -1) {
                S = i14;
                i10 = 1;
            } else {
                i10 = 1;
                Object G = k0.G((n2) this.a, this.n, this.D, this.E, obj, o2Var, e2Var);
                if (G != null) {
                    m2 m2Var = this.n;
                    e2Var.g(G, m2Var);
                    int i15 = m2Var.c;
                    n2 n2Var = (n2) this.a;
                    e2Var.m(i15, n2Var, 0L);
                    S = S(e2Var, i15, h5.d0.S(n2Var.x));
                } else {
                    S = S(e2Var, -1, -9223372036854775807L);
                }
            }
            i11 = 0;
        }
        u1 R = R(u1Var, e2Var, S);
        int i16 = R.e;
        if (i16 != i10 && i16 != 4 && min > 0 && min == size2 && P >= R.a.o()) {
            R = R.g(4);
        }
        o4.q0 q0Var = this.K;
        h5.a0 a0Var = this.k.n;
        a0Var.getClass();
        h5.z b10 = h5.a0.b();
        b10.a = a0Var.a.obtainMessage(20, i11, min, q0Var);
        b10.b();
        h0(R, 0, 1, !R.b.a.equals(this.f0.b.a), 4, O(R), -1);
    }

    @Override // j3.a2
    public final int m() {
        j0();
        if (this.f0.a.p()) {
            return 0;
        }
        u1 u1Var = this.f0;
        return u1Var.a.b(u1Var.b.a);
    }

    @Override // j3.a2
    public final void n(y1 y1Var) {
        y1Var.getClass();
        this.l.a(y1Var);
    }

    @Override // j3.a2
    public final int o() {
        j0();
        if (f()) {
            return this.f0.b.c;
        }
        return -1;
    }

    @Override // j3.a2
    public final void p(boolean z4) {
        j0();
        int d = this.z.d(c(), z4);
        int i10 = 1;
        if (z4 && d != 1) {
            i10 = 2;
        }
        g0(d, i10, z4);
    }

    @Override // j3.a2
    public final long q() {
        j0();
        return this.u;
    }

    @Override // j3.a2
    public final long r() {
        j0();
        return N(this.f0);
    }

    @Override // j3.a2
    public final long s() {
        j0();
        if (f()) {
            u1 u1Var = this.f0;
            return u1Var.k.equals(u1Var.b) ? h5.d0.S(this.f0.p) : getDuration();
        }
        j0();
        if (this.f0.a.p()) {
            return this.h0;
        }
        u1 u1Var2 = this.f0;
        if (u1Var2.k.d != u1Var2.b.d) {
            return h5.d0.S(u1Var2.a.m(x(), (n2) this.a, 0L).y);
        }
        long j10 = u1Var2.p;
        if (this.f0.k.a()) {
            u1 u1Var3 = this.f0;
            m2 g10 = u1Var3.a.g(u1Var3.k.a, this.n);
            long d = g10.d(this.f0.k.b);
            j10 = d == Long.MIN_VALUE ? g10.d : d;
        }
        u1 u1Var4 = this.f0;
        o2 o2Var = u1Var4.a;
        Object obj = u1Var4.k.a;
        m2 m2Var = this.n;
        o2Var.g(obj, m2Var);
        return h5.d0.S(j10 + m2Var.e);
    }

    @Override // j3.a2
    public final void stop() {
        j0();
        this.z.d(1, j());
        e0(null);
        new v4.c(this.f0.r, s8.i0.e);
    }

    @Override // j3.a2
    public final q2 t() {
        j0();
        return this.f0.i.d;
    }

    @Override // j3.a2
    public final void u(y1 y1Var) {
        j0();
        y1Var.getClass();
        h5.m mVar = this.l;
        mVar.f();
        CopyOnWriteArraySet copyOnWriteArraySet = mVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            h5.l lVar = (h5.l) it.next();
            if (lVar.a.equals(y1Var)) {
                h5.k kVar = mVar.c;
                lVar.d = true;
                if (lVar.c) {
                    lVar.c = false;
                    kVar.d(lVar.a, lVar.b.c());
                }
                copyOnWriteArraySet.remove(lVar);
            }
        }
    }

    @Override // j3.a2
    public final n v() {
        j0();
        return this.f0.f;
    }

    @Override // j3.a2
    public final int w() {
        j0();
        if (f()) {
            return this.f0.b.b;
        }
        return -1;
    }

    @Override // j3.a2
    public final int x() {
        j0();
        int P = P(this.f0);
        if (P == -1) {
            return 0;
        }
        return P;
    }

    @Override // j3.a2
    public final int y() {
        j0();
        return this.f0.m;
    }

    @Override // j3.a2
    public final o2 z() {
        j0();
        return this.f0.a;
    }
}
