package h3;

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
import bg.x2;
import fh.y5;
import gh.i3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.DispatchQueue;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k0 extends a8.a implements s {
    public final d A;
    public final m2 B;
    public final ya.b C;
    public final za.a D;
    public final long E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public j2 L;
    public j4.g1 M;
    public y1 N;
    public h1 O;
    public t0 P;
    public AudioTrack Q;
    public Object R;
    public Surface S;
    public SurfaceHolder T;
    public boolean U;
    public TextureView V;
    public final int W;
    public d5.z X;
    public final int Y;
    public j3.e Z;
    public float a0;
    public final b5.a0 b;
    public boolean b0;
    public final y1 c;
    public final boolean c0;
    public final d5.c d;
    public boolean d0;
    public final Context e;
    public boolean e0;
    public final c2 f;
    public m f0;
    public final e[] g;
    public e5.z g0;
    public final b5.w h;
    public h1 h0;
    public final d5.c0 i;
    public w1 i0;
    public final w j;
    public int j0;
    public final q0 k;
    public long k0;
    public final d5.n l;
    public DispatchQueue l0;
    public final CopyOnWriteArraySet m;
    public final ArrayList m0;
    public final p2 n;
    public final ArrayList o;
    public final boolean p;
    public final j4.c0 q;
    public final i3.f r;
    public final Looper s;
    public final com.google.android.exoplayer2.upstream.f t;
    public final long u;
    public final long v;
    public final d5.a0 w;
    public final h0 x;
    public final i0 y;
    public final androidx.activity.o z;

    static {
        r0.a("goog.exo.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k0(r rVar, k2 k2Var) {
        super(3);
        this.m0 = new ArrayList();
        this.d = new d5.c();
        try {
            d5.a.v("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.3] [" + d5.f0.e + "]");
            Context context = rVar.a;
            d5.a0 a0Var = rVar.b;
            this.e = context.getApplicationContext();
            this.r = new i3.f(a0Var);
            this.Z = rVar.i;
            this.W = rVar.j;
            this.b0 = false;
            this.E = rVar.q;
            h0 h0Var = new h0(this);
            this.x = h0Var;
            this.y = new i0();
            Handler handler = new Handler(rVar.h);
            e[] b10 = ((l) rVar.c.get()).b(handler, h0Var, h0Var, h0Var, h0Var);
            this.g = b10;
            d5.a.i(b10.length > 0);
            this.h = (b5.w) rVar.e.get();
            this.q = (j4.c0) rVar.d.get();
            this.t = com.google.android.exoplayer2.upstream.u.b(rVar.g.b);
            this.p = rVar.k;
            this.L = rVar.l;
            this.u = rVar.m;
            this.v = rVar.n;
            Looper looper = rVar.h;
            this.s = looper;
            this.w = a0Var;
            this.f = k2Var == 0 ? this : k2Var;
            this.l = new d5.n(looper, a0Var, new w(this));
            this.m = new CopyOnWriteArraySet();
            this.o = new ArrayList();
            this.M = new j4.e1();
            this.b = new b5.a0(new i2[b10.length], new b5.t[b10.length], t2.b, null);
            this.n = new p2();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i9 = 0; i9 < 21; i9++) {
                int i10 = iArr[i9];
                d5.a.i(!false);
                sparseBooleanArray.append(i10, true);
            }
            this.h.getClass();
            d5.a.i(!false);
            sparseBooleanArray.append(29, true);
            d5.a.i(!false);
            d5.g gVar = new d5.g(sparseBooleanArray);
            this.c = new y1(gVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i11 = 0; i11 < gVar.a.size(); i11++) {
                int a2 = gVar.a(i11);
                d5.a.i(!false);
                sparseBooleanArray2.append(a2, true);
            }
            d5.a.i(!false);
            sparseBooleanArray2.append(4, true);
            d5.a.i(!false);
            sparseBooleanArray2.append(10, true);
            d5.a.i(!false);
            this.N = new y1(new d5.g(sparseBooleanArray2));
            this.i = this.w.a(this.s, null);
            w wVar = new w(this);
            this.j = wVar;
            this.i0 = w1.h(this.b);
            this.r.m(this.f, this.s);
            int i12 = d5.f0.a;
            this.k = new q0(this.g, this.h, this.b, (j) rVar.f.get(), this.t, this.F, this.G, this.r, this.L, rVar.o, rVar.p, this.s, this.w, wVar, i12 < 31 ? new i3.l() : b0.a(this.e, this, rVar.r));
            this.a0 = 1.0f;
            this.F = 0;
            h1 h1Var = h1.U;
            this.O = h1Var;
            this.h0 = h1Var;
            int i13 = -1;
            this.j0 = -1;
            if (i12 < 21) {
                AudioTrack audioTrack = this.Q;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.Q.release();
                    this.Q = null;
                }
                if (this.Q == null) {
                    this.Q = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.Y = this.Q.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.e.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                if (audioManager != null) {
                    i13 = audioManager.generateAudioSessionId();
                }
                this.Y = i13;
            }
            int i14 = r4.c.b;
            this.c0 = true;
            k(this.r);
            com.google.android.exoplayer2.upstream.f fVar = this.t;
            Handler handler2 = new Handler(this.s);
            i3.f fVar2 = this.r;
            com.google.android.exoplayer2.upstream.u uVar = (com.google.android.exoplayer2.upstream.u) fVar;
            uVar.getClass();
            fVar2.getClass();
            xa.c cVar = uVar.b;
            cVar.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) cVar.b;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.upstream.e eVar = (com.google.android.exoplayer2.upstream.e) it.next();
                if (eVar.b == fVar2) {
                    eVar.c = true;
                    copyOnWriteArrayList.remove(eVar);
                }
            }
            copyOnWriteArrayList.add(new com.google.android.exoplayer2.upstream.e(handler2, fVar2));
            this.m.add(this.x);
            h0 h0Var2 = this.x;
            androidx.activity.o oVar = new androidx.activity.o();
            oVar.b = context.getApplicationContext();
            oVar.c = new b(oVar, handler, h0Var2);
            this.z = oVar;
            oVar.d();
            d dVar = new d(context, handler, this.x);
            this.A = dVar;
            dVar.b(null);
            m2 m2Var = new m2(context, handler, this.x);
            this.B = m2Var;
            m2Var.c(d5.f0.y(this.Z.c));
            int i15 = 8;
            ya.b bVar = new ya.b(i15);
            this.C = bVar;
            za.a aVar = new za.a(i15);
            this.D = aVar;
            this.f0 = new m(0, m2Var.a(), m2Var.d.getStreamMaxVolume(m2Var.f));
            this.g0 = e5.z.e;
            this.X = d5.z.c;
            this.h.b(this.Z);
            c0(1, 10, Integer.valueOf(this.Y));
            c0(2, 10, Integer.valueOf(this.Y));
            c0(1, 3, this.Z);
            c0(2, 4, Integer.valueOf(this.W));
            c0(2, 5, 0);
            c0(1, 9, Boolean.valueOf(this.b0));
            c0(2, 7, this.y);
            c0(6, 8, this.y);
            this.d.c();
        } catch (Throwable th) {
            this.d.c();
            throw th;
        }
    }

    public static long W(w1 w1Var) {
        q2 q2Var = new q2();
        p2 p2Var = new p2();
        w1Var.a.g(w1Var.b.a, p2Var);
        long j10 = w1Var.c;
        return j10 == -9223372036854775807L ? w1Var.a.m(p2Var.c, q2Var, 0L).x : p2Var.e + j10;
    }

    public static boolean X(w1 w1Var) {
        return w1Var.e == 3 && w1Var.l && w1Var.m == 0;
    }

    @Override // h3.c2
    public final r2 A() {
        q0();
        return this.i0.a;
    }

    @Override // h3.c2
    public final Looper B() {
        return this.s;
    }

    @Override // h3.c2
    public final boolean C() {
        q0();
        return this.G;
    }

    @Override // h3.c2
    public final long D() {
        q0();
        return d5.f0.S(T(this.i0));
    }

    @Override // h3.c2
    public final long E() {
        q0();
        return this.u;
    }

    @Override // a8.a
    public final void N() {
        String str;
        AudioTrack audioTrack;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [ExoPlayerLib/2.18.3] [");
        sb2.append(d5.f0.e);
        sb2.append("] [");
        HashSet hashSet = r0.a;
        synchronized (r0.class) {
            str = r0.b;
        }
        sb2.append(str);
        sb2.append("]");
        d5.a.v("ExoPlayerImpl", sb2.toString());
        q0();
        if (d5.f0.a < 21 && (audioTrack = this.Q) != null) {
            audioTrack.release();
            this.Q = null;
        }
        this.z.d();
        m2 m2Var = this.B;
        androidx.mediarouter.app.h hVar = m2Var.e;
        if (hVar != null) {
            try {
                m2Var.a.unregisterReceiver(hVar);
            } catch (RuntimeException e10) {
                d5.a.L("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            m2Var.e = null;
        }
        this.C.getClass();
        this.D.getClass();
        d dVar = this.A;
        dVar.c = null;
        dVar.a();
        if (!this.k.z()) {
            this.l.e(10, new y5(9));
        }
        this.l.d();
        this.i.a.removeCallbacksAndMessages(null);
        com.google.android.exoplayer2.upstream.f fVar = this.t;
        i3.f fVar2 = this.r;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((com.google.android.exoplayer2.upstream.u) fVar).b.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            com.google.android.exoplayer2.upstream.e eVar = (com.google.android.exoplayer2.upstream.e) it.next();
            if (eVar.b == fVar2) {
                eVar.c = true;
                copyOnWriteArrayList.remove(eVar);
            }
        }
        w1 f10 = this.i0.f(1);
        this.i0 = f10;
        w1 a2 = f10.a(f10.b);
        this.i0 = a2;
        a2.p = a2.r;
        this.i0.q = 0L;
        i3.f fVar3 = this.r;
        d5.c0 c0Var = fVar3.n;
        d5.a.j(c0Var);
        c0Var.c(new fh.o1(fVar3, 29));
        this.h.a();
        b0();
        Surface surface = this.S;
        if (surface != null) {
            surface.release();
            this.S = null;
        }
        int i9 = r4.c.b;
        this.e0 = true;
    }

    @Override // a8.a
    public final void O(long j10, int i9, int i10, boolean z10) {
        q0();
        d5.a.f(i9 >= 0);
        i3.f fVar = this.r;
        if (!fVar.r) {
            i3.a a2 = fVar.a();
            fVar.r = true;
            fVar.l(a2, -1, new i3.c(a2, 0));
        }
        r2 r2Var = this.i0.a;
        if (r2Var.p() || i9 < r2Var.o()) {
            this.H++;
            if (c()) {
                d5.a.K("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                te.f fVar2 = new te.f(this.i0);
                fVar2.a(1);
                k0 k0Var = this.j.a;
                k0Var.i.c(new e5.u(29, k0Var, fVar2));
                return;
            }
            int i11 = b() != 1 ? 2 : 1;
            int x10 = x();
            w1 Y = Y(this.i0.f(i11), r2Var, Z(r2Var, i9, j10));
            this.k.n.a(3, new p0(r2Var, i9, d5.f0.H(j10))).b();
            o0(Y, 0, 1, true, true, 1, T(Y), x10, z10);
        }
    }

    public final ArrayList Q(int i9, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            r1 r1Var = new r1((j4.a) list.get(i10), this.p);
            arrayList.add(r1Var);
            j0 j0Var = new j0(r1Var.b, r1Var.a.o);
            this.o.add(i10 + i9, j0Var);
        }
        this.M = this.M.e(i9, arrayList.size());
        return arrayList;
    }

    public final h1 R() {
        r2 A = A();
        if (A.p()) {
            return this.h0;
        }
        f1 f1Var = A.m(x(), (q2) this.a, 0L).c;
        g1 a2 = this.h0.a();
        h1 h1Var = f1Var.d;
        if (h1Var != null) {
            CharSequence charSequence = h1Var.a;
            if (charSequence != null) {
                a2.a = charSequence;
            }
            CharSequence charSequence2 = h1Var.b;
            if (charSequence2 != null) {
                a2.b = charSequence2;
            }
            CharSequence charSequence3 = h1Var.c;
            if (charSequence3 != null) {
                a2.c = charSequence3;
            }
            CharSequence charSequence4 = h1Var.d;
            if (charSequence4 != null) {
                a2.d = charSequence4;
            }
            CharSequence charSequence5 = h1Var.e;
            if (charSequence5 != null) {
                a2.e = charSequence5;
            }
            CharSequence charSequence6 = h1Var.f;
            if (charSequence6 != null) {
                a2.f = charSequence6;
            }
            CharSequence charSequence7 = h1Var.h;
            if (charSequence7 != null) {
                a2.g = charSequence7;
            }
            g2 g2Var = h1Var.n;
            if (g2Var != null) {
                a2.h = g2Var;
            }
            g2 g2Var2 = h1Var.r;
            if (g2Var2 != null) {
                a2.i = g2Var2;
            }
            byte[] bArr = h1Var.s;
            if (bArr != null) {
                Integer num = h1Var.v;
                a2.j = (byte[]) bArr.clone();
                a2.k = num;
            }
            Uri uri = h1Var.w;
            if (uri != null) {
                a2.l = uri;
            }
            Integer num2 = h1Var.x;
            if (num2 != null) {
                a2.m = num2;
            }
            Integer num3 = h1Var.y;
            if (num3 != null) {
                a2.n = num3;
            }
            Integer num4 = h1Var.A;
            if (num4 != null) {
                a2.o = num4;
            }
            Boolean bool = h1Var.B;
            if (bool != null) {
                a2.p = bool;
            }
            Boolean bool2 = h1Var.C;
            if (bool2 != null) {
                a2.q = bool2;
            }
            Integer num5 = h1Var.D;
            if (num5 != null) {
                a2.r = num5;
            }
            Integer num6 = h1Var.E;
            if (num6 != null) {
                a2.r = num6;
            }
            Integer num7 = h1Var.F;
            if (num7 != null) {
                a2.s = num7;
            }
            Integer num8 = h1Var.G;
            if (num8 != null) {
                a2.t = num8;
            }
            Integer num9 = h1Var.H;
            if (num9 != null) {
                a2.u = num9;
            }
            Integer num10 = h1Var.I;
            if (num10 != null) {
                a2.v = num10;
            }
            Integer num11 = h1Var.J;
            if (num11 != null) {
                a2.w = num11;
            }
            CharSequence charSequence8 = h1Var.K;
            if (charSequence8 != null) {
                a2.x = charSequence8;
            }
            CharSequence charSequence9 = h1Var.L;
            if (charSequence9 != null) {
                a2.y = charSequence9;
            }
            CharSequence charSequence10 = h1Var.M;
            if (charSequence10 != null) {
                a2.z = charSequence10;
            }
            Integer num12 = h1Var.N;
            if (num12 != null) {
                a2.A = num12;
            }
            Integer num13 = h1Var.O;
            if (num13 != null) {
                a2.B = num13;
            }
            CharSequence charSequence11 = h1Var.P;
            if (charSequence11 != null) {
                a2.C = charSequence11;
            }
            CharSequence charSequence12 = h1Var.Q;
            if (charSequence12 != null) {
                a2.D = charSequence12;
            }
            CharSequence charSequence13 = h1Var.R;
            if (charSequence13 != null) {
                a2.E = charSequence13;
            }
            Integer num14 = h1Var.S;
            if (num14 != null) {
                a2.F = num14;
            }
            Bundle bundle = h1Var.T;
            if (bundle != null) {
                a2.G = bundle;
            }
        }
        return new h1(a2);
    }

    public final e2 S(d2 d2Var) {
        int U = U();
        r2 r2Var = this.i0.a;
        int i9 = U == -1 ? 0 : U;
        d5.a0 a0Var = this.w;
        q0 q0Var = this.k;
        return new e2(q0Var, d2Var, r2Var, i9, a0Var, q0Var.s);
    }

    public final long T(w1 w1Var) {
        if (w1Var.a.p()) {
            return d5.f0.H(this.k0);
        }
        if (w1Var.b.a()) {
            return w1Var.r;
        }
        r2 r2Var = w1Var.a;
        j4.d0 d0Var = w1Var.b;
        long j10 = w1Var.r;
        Object obj = d0Var.a;
        p2 p2Var = this.n;
        r2Var.g(obj, p2Var);
        return j10 + p2Var.e;
    }

    public final int U() {
        if (this.i0.a.p()) {
            return this.j0;
        }
        w1 w1Var = this.i0;
        return w1Var.a.g(w1Var.b.a, this.n).c;
    }

    public final Pair V(r2 r2Var, f2 f2Var) {
        long q10 = q();
        if (r2Var.p() || f2Var.p()) {
            boolean z10 = !r2Var.p() && f2Var.p();
            int U = z10 ? -1 : U();
            if (z10) {
                q10 = -9223372036854775807L;
            }
            return Z(f2Var, U, q10);
        }
        Pair i9 = r2Var.i((q2) this.a, this.n, x(), d5.f0.H(q10));
        Object obj = i9.first;
        if (f2Var.b(obj) != -1) {
            return i9;
        }
        Object I = q0.I((q2) this.a, this.n, this.F, this.G, obj, r2Var, f2Var);
        if (I == null) {
            return Z(f2Var, -1, -9223372036854775807L);
        }
        p2 p2Var = this.n;
        f2Var.g(I, p2Var);
        int i10 = p2Var.c;
        q2 q2Var = (q2) this.a;
        f2Var.m(i10, q2Var, 0L);
        return Z(f2Var, i10, d5.f0.S(q2Var.x));
    }

    public final w1 Y(w1 w1Var, r2 r2Var, Pair pair) {
        List list;
        d5.a.f(r2Var.p() || pair != null);
        r2 r2Var2 = w1Var.a;
        w1 g10 = w1Var.g(r2Var);
        if (r2Var.p()) {
            j4.d0 d0Var = w1.s;
            long H = d5.f0.H(this.k0);
            w1 a2 = g10.b(d0Var, H, H, H, 0L, j4.j1.d, this.b, o8.l0.e).a(d0Var);
            a2.p = a2.r;
            return a2;
        }
        Object obj = g10.b.a;
        int i9 = d5.f0.a;
        boolean equals = obj.equals(pair.first);
        j4.d0 d0Var2 = !equals ? new j4.d0(pair.first) : g10.b;
        long longValue = ((Long) pair.second).longValue();
        long H2 = d5.f0.H(q());
        if (!r2Var2.p()) {
            H2 -= r2Var2.g(obj, this.n).e;
        }
        if (!equals || longValue < H2) {
            j4.d0 d0Var3 = d0Var2;
            d5.a.i(!d0Var3.a());
            j4.j1 j1Var = !equals ? j4.j1.d : g10.h;
            b5.a0 a0Var = !equals ? this.b : g10.i;
            if (equals) {
                list = g10.j;
            } else {
                o8.x xVar = o8.z.b;
                list = o8.l0.e;
            }
            w1 a3 = g10.b(d0Var3, longValue, longValue, longValue, 0L, j1Var, a0Var, list).a(d0Var3);
            a3.p = longValue;
            return a3;
        }
        if (longValue != H2) {
            j4.d0 d0Var4 = d0Var2;
            d5.a.i(!d0Var4.a());
            long max = Math.max(0L, g10.q - (longValue - H2));
            long j10 = g10.p;
            if (g10.k.equals(g10.b)) {
                j10 = longValue + max;
            }
            w1 b10 = g10.b(d0Var4, longValue, longValue, longValue, max, g10.h, g10.i, g10.j);
            b10.p = j10;
            return b10;
        }
        int b11 = r2Var.b(g10.k.a);
        if (b11 != -1 && r2Var.f(b11, this.n, false).c == r2Var.g(d0Var2.a, this.n).c) {
            return g10;
        }
        r2Var.g(d0Var2.a, this.n);
        long a10 = d0Var2.a() ? this.n.a(d0Var2.b, d0Var2.c) : this.n.d;
        j4.d0 d0Var5 = d0Var2;
        w1 a11 = g10.b(d0Var5, g10.r, g10.r, g10.d, a10 - g10.r, g10.h, g10.i, g10.j).a(d0Var5);
        a11.p = a10;
        return a11;
    }

    public final Pair Z(r2 r2Var, int i9, long j10) {
        if (r2Var.p()) {
            this.j0 = i9;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.k0 = j10;
            return null;
        }
        if (i9 == -1 || i9 >= r2Var.o()) {
            i9 = r2Var.a(this.G);
            j10 = d5.f0.S(r2Var.m(i9, (q2) this.a, 0L).x);
        }
        return r2Var.i((q2) this.a, this.n, i9, d5.f0.H(j10));
    }

    @Override // h3.c2
    public final void a() {
        q0();
        boolean h = h();
        int d = this.A.d(2, h);
        n0(d, (!h || d == 1) ? 1 : 2, h);
        w1 w1Var = this.i0;
        if (w1Var.e != 1) {
            return;
        }
        w1 d9 = w1Var.d(null);
        w1 f10 = d9.f(d9.a.p() ? 4 : 2);
        this.H++;
        d5.c0 c0Var = this.k.n;
        c0Var.getClass();
        d5.b0 b10 = d5.c0.b();
        b10.a = c0Var.a.obtainMessage(0);
        b10.b();
        o0(f10, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    public final void a0(int i9, int i10) {
        d5.z zVar = this.X;
        if (i9 == zVar.a && i10 == zVar.b) {
            return;
        }
        this.X = new d5.z(i9, i10);
        DispatchQueue dispatchQueue = this.l0;
        if (dispatchQueue != null) {
            dispatchQueue.postRunnable(new y(this, i9, i10, 0));
        } else {
            this.l.e(24, new z(i9, i10, 0));
        }
    }

    @Override // h3.c2
    public final int b() {
        q0();
        return this.i0.e;
    }

    public final void b0() {
        TextureView textureView = this.V;
        h0 h0Var = this.x;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != h0Var) {
                d5.a.K("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.V.setSurfaceTextureListener(null);
            }
            this.V = null;
        }
        SurfaceHolder surfaceHolder = this.T;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(h0Var);
            this.T = null;
        }
    }

    @Override // h3.c2
    public final boolean c() {
        q0();
        return this.i0.b.a();
    }

    public final void c0(int i9, int i10, Object obj) {
        for (e eVar : this.g) {
            if (eVar.getTrackType() == i9) {
                e2 S = S(eVar);
                d5.a.i(!S.g);
                S.d = i10;
                d5.a.i(!S.g);
                S.e = obj;
                S.c();
            }
        }
    }

    @Override // h3.c2
    public final long d() {
        q0();
        return d5.f0.S(this.i0.q);
    }

    public final void d0(j3.e eVar, boolean z10) {
        q0();
        if (this.e0) {
            return;
        }
        boolean a2 = d5.f0.a(this.Z, eVar);
        int i9 = 1;
        d5.n nVar = this.l;
        if (!a2) {
            this.Z = eVar;
            c0(1, 3, eVar);
            this.B.c(d5.f0.y(eVar.c));
            nVar.c(20, new i3(eVar, 9));
        }
        j3.e eVar2 = z10 ? eVar : null;
        d dVar = this.A;
        dVar.b(eVar2);
        this.h.b(eVar);
        boolean h = h();
        int d = dVar.d(b(), h);
        if (h && d != 1) {
            i9 = 2;
        }
        n0(d, i9, h);
        nVar.b();
    }

    @Override // h3.c2
    public final void e(int i9) {
        q0();
        if (this.F != i9) {
            this.F = i9;
            d5.c0 c0Var = this.k.n;
            c0Var.getClass();
            d5.b0 b10 = d5.c0.b();
            b10.a = c0Var.a.obtainMessage(11, i9, 0);
            b10.b();
            x xVar = new x(i9, 0);
            d5.n nVar = this.l;
            nVar.c(8, xVar);
            m0();
            nVar.b();
        }
    }

    public final void e0(j4.a aVar, boolean z10) {
        q0();
        List singletonList = Collections.singletonList(aVar);
        q0();
        int U = U();
        long D = D();
        this.H++;
        ArrayList arrayList = this.o;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i9 = size - 1; i9 >= 0; i9--) {
                arrayList.remove(i9);
            }
            this.M = this.M.a(0, size);
        }
        ArrayList Q = Q(0, singletonList);
        f2 f2Var = new f2(arrayList, this.M);
        boolean p6 = f2Var.p();
        int i10 = f2Var.e;
        if (!p6 && -1 >= i10) {
            throw new w0();
        }
        if (z10) {
            U = f2Var.a(this.G);
            D = -9223372036854775807L;
        }
        int i11 = U;
        w1 Y = Y(this.i0, f2Var, Z(f2Var, i11, D));
        int i12 = Y.e;
        if (i11 != -1 && i12 != 1) {
            i12 = (f2Var.p() || i11 >= i10) ? 4 : 2;
        }
        w1 f10 = Y.f(i12);
        this.k.n.a(17, new m0(Q, this.M, i11, d5.f0.H(D))).b();
        o0(f10, 0, 1, false, (this.i0.b.a.equals(f10.b.a) || this.i0.a.p()) ? false : true, 4, T(f10), -1, false);
    }

    @Override // h3.c2
    public final y1 f() {
        q0();
        return this.N;
    }

    public final void f0(j2 j2Var) {
        q0();
        if (j2Var == null) {
            j2Var = j2.e;
        }
        if (this.L.equals(j2Var)) {
            return;
        }
        this.L = j2Var;
        this.k.n.a(5, j2Var).b();
    }

    @Override // h3.c2
    public final int g() {
        q0();
        return this.F;
    }

    public final void g0(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (e eVar : this.g) {
            if (eVar.getTrackType() == 2) {
                e2 S = S(eVar);
                d5.a.i(!S.g);
                S.d = 1;
                d5.a.i(true ^ S.g);
                S.e = surface;
                S.c();
                arrayList.add(S);
            }
        }
        Object obj = this.R;
        if (obj != null && obj != surface) {
            try {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj2 = arrayList.get(i9);
                    i9++;
                    ((e2) obj2).a(this.E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z10 = true;
            }
            Object obj3 = this.R;
            Surface surface2 = this.S;
            if (obj3 == surface2) {
                try {
                    surface2.release();
                } catch (Throwable unused3) {
                }
                this.S = null;
            }
        }
        this.R = surface;
        if (z10) {
            l0(new n(2, new androidx.car.app.j("Detaching surface timed out."), 1003));
        }
    }

    @Override // h3.c2
    public final long getDuration() {
        q0();
        if (!c()) {
            r2 A = A();
            if (A.p()) {
                return -9223372036854775807L;
            }
            return d5.f0.S(A.m(x(), (q2) this.a, 0L).y);
        }
        w1 w1Var = this.i0;
        j4.d0 d0Var = w1Var.b;
        r2 r2Var = w1Var.a;
        Object obj = d0Var.a;
        p2 p2Var = this.n;
        r2Var.g(obj, p2Var);
        return d5.f0.S(p2Var.a(d0Var.b, d0Var.c));
    }

    @Override // h3.c2
    public final x1 getPlaybackParameters() {
        q0();
        return this.i0.n;
    }

    @Override // h3.c2
    public final boolean h() {
        q0();
        return this.i0.l;
    }

    public final void h0(Surface surface) {
        q0();
        b0();
        g0(surface);
        int i9 = surface == null ? 0 : -1;
        a0(i9, i9);
    }

    @Override // h3.c2
    public final void i(boolean z10) {
        q0();
        if (this.G != z10) {
            this.G = z10;
            d5.c0 c0Var = this.k.n;
            c0Var.getClass();
            d5.b0 b10 = d5.c0.b();
            b10.a = c0Var.a.obtainMessage(12, z10 ? 1 : 0, 0);
            b10.b();
            t tVar = new t(0, z10);
            d5.n nVar = this.l;
            nVar.c(9, tVar);
            m0();
            nVar.b();
        }
    }

    public final void i0(SurfaceView surfaceView) {
        q0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        q0();
        if (holder == null) {
            q0();
            b0();
            g0(null);
            a0(0, 0);
            return;
        }
        b0();
        this.U = true;
        this.T = holder;
        holder.addCallback(this.x);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            g0(null);
            a0(0, 0);
        } else {
            g0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            a0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // h3.c2
    public final void j() {
        q0();
    }

    public final void j0(TextureView textureView) {
        q0();
        if (textureView == null) {
            q0();
            b0();
            g0(null);
            a0(0, 0);
            return;
        }
        b0();
        this.V = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            d5.a.K("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.x);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            g0(null);
            a0(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            g0(surface);
            this.S = surface;
            a0(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // h3.c2
    public final void k(a2 a2Var) {
        a2Var.getClass();
        this.l.a(a2Var);
    }

    public final void k0(float f10) {
        q0();
        final float g10 = d5.f0.g(f10, 0.0f, 1.0f);
        if (this.a0 == g10) {
            return;
        }
        this.a0 = g10;
        c0(1, 2, Float.valueOf(this.A.g * g10));
        this.l.e(22, new d5.k() { // from class: h3.v
            @Override // d5.k
            public final void invoke(Object obj) {
                ((a2) obj).onVolumeChanged(g10);
            }
        });
    }

    @Override // h3.c2
    public final int l() {
        q0();
        if (this.i0.a.p()) {
            return 0;
        }
        w1 w1Var = this.i0;
        return w1Var.a.b(w1Var.b.a);
    }

    public final void l0(n nVar) {
        w1 w1Var = this.i0;
        w1 a2 = w1Var.a(w1Var.b);
        a2.p = a2.r;
        a2.q = 0L;
        w1 f10 = a2.f(1);
        if (nVar != null) {
            f10 = f10.d(nVar);
        }
        w1 w1Var2 = f10;
        this.H++;
        d5.c0 c0Var = this.k.n;
        c0Var.getClass();
        d5.b0 b10 = d5.c0.b();
        b10.a = c0Var.a.obtainMessage(6);
        b10.b();
        o0(w1Var2, 0, 1, false, w1Var2.a.p() && !this.i0.a.p(), 4, T(w1Var2), -1, false);
    }

    @Override // h3.c2
    public final int m() {
        q0();
        if (c()) {
            return this.i0.b.c;
        }
        return -1;
    }

    public final void m0() {
        int k10;
        int e10;
        y1 y1Var = this.N;
        int i9 = d5.f0.a;
        c2 c2Var = this.f;
        boolean c10 = c2Var.c();
        a8.a aVar = (a8.a) c2Var;
        r2 A = aVar.A();
        boolean z10 = !A.p() && A.m(aVar.x(), (q2) aVar.a, 0L).n;
        r2 A2 = aVar.A();
        if (A2.p()) {
            k10 = -1;
        } else {
            int x10 = aVar.x();
            int g10 = aVar.g();
            if (g10 == 1) {
                g10 = 0;
            }
            k10 = A2.k(x10, g10, aVar.C());
        }
        boolean z11 = k10 != -1;
        r2 A3 = aVar.A();
        if (A3.p()) {
            e10 = -1;
        } else {
            int x11 = aVar.x();
            int g11 = aVar.g();
            if (g11 == 1) {
                g11 = 0;
            }
            e10 = A3.e(x11, g11, aVar.C());
        }
        boolean z12 = e10 != -1;
        boolean J = aVar.J();
        boolean I = aVar.I();
        boolean p6 = c2Var.A().p();
        k5.i iVar = new k5.i(16);
        c2.t tVar = (c2.t) iVar.b;
        d5.g gVar = this.c.a;
        tVar.getClass();
        for (int i10 = 0; i10 < gVar.a.size(); i10++) {
            tVar.b(gVar.a(i10));
        }
        boolean z13 = !c10;
        iVar.F(4, z13);
        iVar.F(5, z10 && !c10);
        iVar.F(6, z11 && !c10);
        iVar.F(7, !p6 && (z11 || !J || z10) && !c10);
        iVar.F(8, z12 && !c10);
        iVar.F(9, !p6 && (z12 || (J && I)) && !c10);
        iVar.F(10, z13);
        iVar.F(11, z10 && !c10);
        iVar.F(12, z10 && !c10);
        y1 y1Var2 = new y1(tVar.c());
        this.N = y1Var2;
        if (y1Var2.equals(y1Var)) {
            return;
        }
        this.l.c(13, new w(this));
    }

    @Override // h3.c2
    public final void n(int i9, int i10) {
        q0();
        d5.a.f(i9 >= 0 && i10 >= i9);
        int size = this.o.size();
        int min = Math.min(i10, size);
        if (i9 >= size || i9 == min) {
            return;
        }
        int x10 = x();
        r2 A = A();
        ArrayList arrayList = this.o;
        int size2 = arrayList.size();
        this.H++;
        for (int i11 = min - 1; i11 >= i9; i11--) {
            arrayList.remove(i11);
        }
        this.M = this.M.a(i9, min);
        f2 f2Var = new f2(arrayList, this.M);
        w1 Y = Y(this.i0, f2Var, V(A, f2Var));
        int i12 = Y.e;
        if (i12 != 1 && i12 != 4 && i9 < min && min == size2 && x10 >= Y.a.o()) {
            Y = Y.f(4);
        }
        j4.g1 g1Var = this.M;
        d5.c0 c0Var = this.k.n;
        c0Var.getClass();
        d5.b0 b10 = d5.c0.b();
        b10.a = c0Var.a.obtainMessage(20, i9, min, g1Var);
        b10.b();
        o0(Y, 0, 1, false, !Y.b.a.equals(this.i0.b.a), 4, T(Y), -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void n0(int i9, int i10, boolean z10) {
        int i11 = 0;
        ?? r42 = (!z10 || i9 == -1) ? 0 : 1;
        if (r42 != 0 && i9 != 1) {
            i11 = 1;
        }
        w1 w1Var = this.i0;
        if (w1Var.l == r42 && w1Var.m == i11) {
            return;
        }
        this.H++;
        w1 c10 = w1Var.c(i11, r42);
        d5.c0 c0Var = this.k.n;
        c0Var.getClass();
        d5.b0 b10 = d5.c0.b();
        b10.a = c0Var.a.obtainMessage(1, r42, i11);
        b10.b();
        o0(c10, 0, i10, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // h3.c2
    public final void o(boolean z10) {
        q0();
        int d = this.A.d(b(), z10);
        int i9 = 1;
        if (z10 && d != 1) {
            i9 = 2;
        }
        n0(d, i9, z10);
    }

    public final void o0(final w1 w1Var, final int i9, final int i10, boolean z10, boolean z11, int i11, long j10, int i12, boolean z12) {
        Pair pair;
        int i13;
        f1 f1Var;
        boolean z13;
        boolean z14;
        boolean z15;
        int i14;
        Object obj;
        f1 f1Var2;
        Object obj2;
        int i15;
        long j11;
        long j12;
        long j13;
        long W;
        Object obj3;
        f1 f1Var3;
        Object obj4;
        int i16;
        w1 w1Var2 = this.i0;
        this.i0 = w1Var;
        boolean equals = w1Var2.a.equals(w1Var.a);
        q2 q2Var = (q2) this.a;
        p2 p2Var = this.n;
        r2 r2Var = w1Var2.a;
        j4.d0 d0Var = w1Var2.b;
        r2 r2Var2 = w1Var.a;
        j4.d0 d0Var2 = w1Var.b;
        if (r2Var2.p() && r2Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (r2Var2.p() != r2Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (r2Var.m(r2Var.g(d0Var.a, p2Var).c, q2Var, 0L).a.equals(r2Var2.m(r2Var2.g(d0Var2.a, p2Var).c, q2Var, 0L).a)) {
            pair = (z11 && i11 == 0 && d0Var.d < d0Var2.d) ? new Pair(Boolean.TRUE, 0) : (z11 && i11 == 1 && z12) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z11 && i11 == 0) {
                i13 = 1;
            } else if (z11 && i11 == 1) {
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
        h1 h1Var = this.O;
        if (booleanValue) {
            f1Var = !w1Var.a.p() ? w1Var.a.m(w1Var.a.g(w1Var.b.a, this.n).c, (q2) this.a, 0L).c : null;
            this.h0 = h1.U;
        } else {
            f1Var = null;
        }
        if (booleanValue || !w1Var2.j.equals(w1Var.j)) {
            g1 a2 = this.h0.a();
            List list = w1Var.j;
            for (int i17 = 0; i17 < list.size(); i17++) {
                z3.c cVar = (z3.c) list.get(i17);
                int i18 = 0;
                while (true) {
                    z3.b[] bVarArr = cVar.a;
                    if (i18 < bVarArr.length) {
                        bVarArr[i18].populateMediaMetadata(a2);
                        i18++;
                    }
                }
            }
            this.h0 = new h1(a2);
            h1Var = R();
        }
        boolean equals2 = h1Var.equals(this.O);
        this.O = h1Var;
        boolean z16 = w1Var2.l != w1Var.l;
        boolean z17 = w1Var2.e != w1Var.e;
        if (z17 || z16) {
            p0();
        }
        boolean z18 = w1Var2.g != w1Var.g;
        if (!equals) {
            final int i19 = 0;
            this.l.c(0, new d5.k() { // from class: h3.a0
                @Override // d5.k
                public final void invoke(Object obj5) {
                    a2 a2Var = (a2) obj5;
                    switch (i19) {
                        case 0:
                            a2Var.onTimelineChanged(w1Var.a, i9);
                            break;
                        default:
                            a2Var.onPlayWhenReadyChanged(w1Var.l, i9);
                            break;
                    }
                }
            });
        }
        if (z11) {
            p2 p2Var2 = new p2();
            if (w1Var2.a.p()) {
                z13 = booleanValue;
                z14 = z16;
                z15 = equals2;
                i14 = i12;
                obj = null;
                f1Var2 = null;
                obj2 = null;
                i15 = -1;
            } else {
                Object obj5 = w1Var2.b.a;
                w1Var2.a.g(obj5, p2Var2);
                int i20 = p2Var2.c;
                int b10 = w1Var2.a.b(obj5);
                z13 = booleanValue;
                z14 = z16;
                z15 = equals2;
                obj = w1Var2.a.m(i20, (q2) this.a, 0L).a;
                f1Var2 = ((q2) this.a).c;
                obj2 = obj5;
                i14 = i20;
                i15 = b10;
            }
            if (i11 == 0) {
                if (w1Var2.b.a()) {
                    j4.d0 d0Var3 = w1Var2.b;
                    j13 = p2Var2.a(d0Var3.b, d0Var3.c);
                    W = W(w1Var2);
                } else if (w1Var2.b.e != -1) {
                    j13 = W(this.i0);
                    W = j13;
                } else {
                    j11 = p2Var2.e;
                    j12 = p2Var2.d;
                    j13 = j11 + j12;
                    W = j13;
                }
            } else if (w1Var2.b.a()) {
                j13 = w1Var2.r;
                W = W(w1Var2);
            } else {
                j11 = p2Var2.e;
                j12 = w1Var2.r;
                j13 = j11 + j12;
                W = j13;
            }
            long S = d5.f0.S(j13);
            long S2 = d5.f0.S(W);
            j4.d0 d0Var4 = w1Var2.b;
            b2 b2Var = new b2(obj, i14, f1Var2, obj2, i15, S, S2, d0Var4.b, d0Var4.c);
            q2 q2Var2 = (q2) this.a;
            int x10 = x();
            if (this.i0.a.p()) {
                obj3 = null;
                f1Var3 = null;
                obj4 = null;
                i16 = -1;
            } else {
                w1 w1Var3 = this.i0;
                Object obj6 = w1Var3.b.a;
                w1Var3.a.g(obj6, this.n);
                int b11 = this.i0.a.b(obj6);
                Object obj7 = this.i0.a.m(x10, q2Var2, 0L).a;
                f1Var3 = q2Var2.c;
                i16 = b11;
                obj4 = obj6;
                obj3 = obj7;
            }
            long S3 = d5.f0.S(j10);
            long S4 = this.i0.b.a() ? d5.f0.S(W(this.i0)) : S3;
            j4.d0 d0Var5 = this.i0.b;
            this.l.c(11, new c3.e(i11, b2Var, new b2(obj3, x10, f1Var3, obj4, i16, S3, S4, d0Var5.b, d0Var5.c), 1));
        } else {
            z13 = booleanValue;
            z14 = z16;
            z15 = equals2;
        }
        if (z13) {
            this.l.c(1, new x2(f1Var, intValue, 1));
        }
        if (w1Var2.f != w1Var.f) {
            final int i21 = 0;
            this.l.c(10, new d5.k() { // from class: h3.u
                @Override // d5.k
                public final void invoke(Object obj8) {
                    a2 a2Var = (a2) obj8;
                    switch (i21) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f);
                            break;
                        case 1:
                            a2Var.onPlayerError(w1Var.f);
                            break;
                        case 2:
                            a2Var.onTracksChanged(w1Var.i.d);
                            break;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.g);
                            a2Var.onIsLoadingChanged(w1Var4.g);
                            break;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.l, w1Var5.e);
                            break;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.e);
                            break;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.m);
                            break;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            break;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.n);
                            break;
                    }
                }
            });
            if (w1Var.f != null) {
                final int i22 = 1;
                this.l.c(10, new d5.k() { // from class: h3.u
                    @Override // d5.k
                    public final void invoke(Object obj8) {
                        a2 a2Var = (a2) obj8;
                        switch (i22) {
                            case 0:
                                a2Var.onPlayerErrorChanged(w1Var.f);
                                break;
                            case 1:
                                a2Var.onPlayerError(w1Var.f);
                                break;
                            case 2:
                                a2Var.onTracksChanged(w1Var.i.d);
                                break;
                            case 3:
                                w1 w1Var4 = w1Var;
                                a2Var.onLoadingChanged(w1Var4.g);
                                a2Var.onIsLoadingChanged(w1Var4.g);
                                break;
                            case 4:
                                w1 w1Var5 = w1Var;
                                a2Var.onPlayerStateChanged(w1Var5.l, w1Var5.e);
                                break;
                            case 5:
                                a2Var.onPlaybackStateChanged(w1Var.e);
                                break;
                            case 6:
                                a2Var.onPlaybackSuppressionReasonChanged(w1Var.m);
                                break;
                            case 7:
                                a2Var.onIsPlayingChanged(k0.X(w1Var));
                                break;
                            default:
                                a2Var.onPlaybackParametersChanged(w1Var.n);
                                break;
                        }
                    }
                });
            }
        }
        b5.a0 a0Var = w1Var2.i;
        b5.a0 a0Var2 = w1Var.i;
        if (a0Var != a0Var2) {
            b5.w wVar = this.h;
            Object obj8 = a0Var2.e;
            wVar.getClass();
            wVar.c = (b5.v) obj8;
            final int i23 = 2;
            this.l.c(2, new d5.k() { // from class: h3.u
                @Override // d5.k
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (i23) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f);
                            break;
                        case 1:
                            a2Var.onPlayerError(w1Var.f);
                            break;
                        case 2:
                            a2Var.onTracksChanged(w1Var.i.d);
                            break;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.g);
                            a2Var.onIsLoadingChanged(w1Var4.g);
                            break;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.l, w1Var5.e);
                            break;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.e);
                            break;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.m);
                            break;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            break;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.n);
                            break;
                    }
                }
            });
        }
        if (!z15) {
            this.l.c(14, new i3(this.O, 8));
        }
        if (z18) {
            final int i24 = 3;
            this.l.c(3, new d5.k() { // from class: h3.u
                @Override // d5.k
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (i24) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f);
                            break;
                        case 1:
                            a2Var.onPlayerError(w1Var.f);
                            break;
                        case 2:
                            a2Var.onTracksChanged(w1Var.i.d);
                            break;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.g);
                            a2Var.onIsLoadingChanged(w1Var4.g);
                            break;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.l, w1Var5.e);
                            break;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.e);
                            break;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.m);
                            break;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            break;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.n);
                            break;
                    }
                }
            });
        }
        if (z17 || z14) {
            final int i25 = 4;
            this.l.c(-1, new d5.k() { // from class: h3.u
                @Override // d5.k
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (i25) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f);
                            break;
                        case 1:
                            a2Var.onPlayerError(w1Var.f);
                            break;
                        case 2:
                            a2Var.onTracksChanged(w1Var.i.d);
                            break;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.g);
                            a2Var.onIsLoadingChanged(w1Var4.g);
                            break;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.l, w1Var5.e);
                            break;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.e);
                            break;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.m);
                            break;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            break;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.n);
                            break;
                    }
                }
            });
        }
        if (z17) {
            final int i26 = 5;
            this.l.c(4, new d5.k() { // from class: h3.u
                @Override // d5.k
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (i26) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f);
                            break;
                        case 1:
                            a2Var.onPlayerError(w1Var.f);
                            break;
                        case 2:
                            a2Var.onTracksChanged(w1Var.i.d);
                            break;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.g);
                            a2Var.onIsLoadingChanged(w1Var4.g);
                            break;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.l, w1Var5.e);
                            break;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.e);
                            break;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.m);
                            break;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            break;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.n);
                            break;
                    }
                }
            });
        }
        if (z14) {
            final int i27 = 1;
            this.l.c(5, new d5.k() { // from class: h3.a0
                @Override // d5.k
                public final void invoke(Object obj52) {
                    a2 a2Var = (a2) obj52;
                    switch (i27) {
                        case 0:
                            a2Var.onTimelineChanged(w1Var.a, i10);
                            break;
                        default:
                            a2Var.onPlayWhenReadyChanged(w1Var.l, i10);
                            break;
                    }
                }
            });
        }
        if (w1Var2.m != w1Var.m) {
            final int i28 = 6;
            this.l.c(6, new d5.k() { // from class: h3.u
                @Override // d5.k
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (i28) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f);
                            break;
                        case 1:
                            a2Var.onPlayerError(w1Var.f);
                            break;
                        case 2:
                            a2Var.onTracksChanged(w1Var.i.d);
                            break;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.g);
                            a2Var.onIsLoadingChanged(w1Var4.g);
                            break;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.l, w1Var5.e);
                            break;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.e);
                            break;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.m);
                            break;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            break;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.n);
                            break;
                    }
                }
            });
        }
        if (X(w1Var2) != X(w1Var)) {
            final int i29 = 7;
            this.l.c(7, new d5.k() { // from class: h3.u
                @Override // d5.k
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (i29) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f);
                            break;
                        case 1:
                            a2Var.onPlayerError(w1Var.f);
                            break;
                        case 2:
                            a2Var.onTracksChanged(w1Var.i.d);
                            break;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.g);
                            a2Var.onIsLoadingChanged(w1Var4.g);
                            break;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.l, w1Var5.e);
                            break;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.e);
                            break;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.m);
                            break;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            break;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.n);
                            break;
                    }
                }
            });
        }
        if (!w1Var2.n.equals(w1Var.n)) {
            final int i30 = 8;
            this.l.c(12, new d5.k() { // from class: h3.u
                @Override // d5.k
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (i30) {
                        case 0:
                            a2Var.onPlayerErrorChanged(w1Var.f);
                            break;
                        case 1:
                            a2Var.onPlayerError(w1Var.f);
                            break;
                        case 2:
                            a2Var.onTracksChanged(w1Var.i.d);
                            break;
                        case 3:
                            w1 w1Var4 = w1Var;
                            a2Var.onLoadingChanged(w1Var4.g);
                            a2Var.onIsLoadingChanged(w1Var4.g);
                            break;
                        case 4:
                            w1 w1Var5 = w1Var;
                            a2Var.onPlayerStateChanged(w1Var5.l, w1Var5.e);
                            break;
                        case 5:
                            a2Var.onPlaybackStateChanged(w1Var.e);
                            break;
                        case 6:
                            a2Var.onPlaybackSuppressionReasonChanged(w1Var.m);
                            break;
                        case 7:
                            a2Var.onIsPlayingChanged(k0.X(w1Var));
                            break;
                        default:
                            a2Var.onPlaybackParametersChanged(w1Var.n);
                            break;
                    }
                }
            });
        }
        if (z10) {
            this.l.c(-1, new y5(10));
        }
        m0();
        this.l.b();
        if (w1Var2.o != w1Var.o) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                ((h0) it.next()).a.p0();
            }
        }
    }

    @Override // h3.c2
    public final long p() {
        q0();
        return this.v;
    }

    public final void p0() {
        int b10 = b();
        za.a aVar = this.D;
        ya.b bVar = this.C;
        if (b10 != 1) {
            if (b10 == 2 || b10 == 3) {
                q0();
                boolean z10 = this.i0.o;
                h();
                bVar.getClass();
                h();
                aVar.getClass();
                return;
            }
            if (b10 != 4) {
                throw new IllegalStateException();
            }
        }
        bVar.getClass();
        aVar.getClass();
    }

    @Override // h3.c2
    public final long q() {
        q0();
        if (!c()) {
            return D();
        }
        w1 w1Var = this.i0;
        r2 r2Var = w1Var.a;
        Object obj = w1Var.b.a;
        p2 p2Var = this.n;
        r2Var.g(obj, p2Var);
        w1 w1Var2 = this.i0;
        if (w1Var2.c == -9223372036854775807L) {
            return d5.f0.S(w1Var2.a.m(x(), (q2) this.a, 0L).x);
        }
        return d5.f0.S(this.i0.c) + d5.f0.S(p2Var.e);
    }

    public final void q0() {
        this.d.a();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.s;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i9 = d5.f0.a;
            Locale locale = Locale.US;
            String h = org.telegram.ui.Cells.j2.h("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (this.c0) {
                throw new IllegalStateException(h);
            }
            d5.a.L("ExoPlayerImpl", h, this.d0 ? null : new IllegalStateException());
            this.d0 = true;
        }
    }

    @Override // h3.c2
    public final void r(a2 a2Var) {
        q0();
        a2Var.getClass();
        d5.n nVar = this.l;
        nVar.f();
        CopyOnWriteArraySet copyOnWriteArraySet = nVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            d5.m mVar = (d5.m) it.next();
            if (mVar.a.equals(a2Var)) {
                d5.l lVar = nVar.c;
                mVar.d = true;
                if (mVar.c) {
                    mVar.c = false;
                    lVar.g(mVar.a, mVar.b.c());
                }
                copyOnWriteArraySet.remove(mVar);
            }
        }
    }

    @Override // h3.c2
    public final void s(int i9, List list) {
        q0();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.q.a((f1) list.get(i10)));
        }
        q0();
        d5.a.f(i9 >= 0);
        ArrayList arrayList2 = this.o;
        int min = Math.min(i9, arrayList2.size());
        r2 A = A();
        this.H++;
        ArrayList Q = Q(min, arrayList);
        f2 f2Var = new f2(arrayList2, this.M);
        w1 Y = Y(this.i0, f2Var, V(A, f2Var));
        j4.g1 g1Var = this.M;
        d5.c0 c0Var = this.k.n;
        m0 m0Var = new m0(Q, g1Var, -1, -9223372036854775807L);
        c0Var.getClass();
        d5.b0 b10 = d5.c0.b();
        b10.a = c0Var.a.obtainMessage(18, min, 0, m0Var);
        b10.b();
        o0(Y, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // h3.c2
    public final void setPlaybackParameters(x1 x1Var) {
        q0();
        if (this.i0.n.equals(x1Var)) {
            return;
        }
        w1 e10 = this.i0.e(x1Var);
        this.H++;
        this.k.n.a(4, x1Var).b();
        o0(e10, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // h3.c2
    public final void stop() {
        q0();
        q0();
        this.A.d(1, h());
        l0(null);
        new r4.c(this.i0.r, o8.l0.e);
    }

    @Override // h3.c2
    public final long t() {
        q0();
        if (c()) {
            w1 w1Var = this.i0;
            return w1Var.k.equals(w1Var.b) ? d5.f0.S(this.i0.p) : getDuration();
        }
        q0();
        if (this.i0.a.p()) {
            return this.k0;
        }
        w1 w1Var2 = this.i0;
        if (w1Var2.k.d != w1Var2.b.d) {
            return d5.f0.S(w1Var2.a.m(x(), (q2) this.a, 0L).y);
        }
        long j10 = w1Var2.p;
        if (this.i0.k.a()) {
            w1 w1Var3 = this.i0;
            p2 g10 = w1Var3.a.g(w1Var3.k.a, this.n);
            long d = g10.d(this.i0.k.b);
            j10 = d == Long.MIN_VALUE ? g10.d : d;
        }
        w1 w1Var4 = this.i0;
        r2 r2Var = w1Var4.a;
        Object obj = w1Var4.k.a;
        p2 p2Var = this.n;
        r2Var.g(obj, p2Var);
        return d5.f0.S(j10 + p2Var.e);
    }

    @Override // h3.c2
    public final t2 u() {
        q0();
        return this.i0.i.d;
    }

    @Override // h3.c2
    public final n v() {
        q0();
        return this.i0.f;
    }

    @Override // h3.c2
    public final int w() {
        q0();
        if (c()) {
            return this.i0.b.b;
        }
        return -1;
    }

    @Override // h3.c2
    public final int x() {
        q0();
        int U = U();
        if (U == -1) {
            return 0;
        }
        return U;
    }

    @Override // h3.c2
    public final void y(int i9, int i10, int i11) {
        q0();
        d5.a.f(i9 >= 0 && i9 <= i10 && i11 >= 0);
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int min = Math.min(i10, size);
        int min2 = Math.min(i11, size - (min - i9));
        if (i9 >= size || i9 == min || i9 == min2) {
            return;
        }
        r2 A = A();
        this.H++;
        d5.f0.G(i9, min, min2, arrayList);
        f2 f2Var = new f2(arrayList, this.M);
        w1 Y = Y(this.i0, f2Var, V(A, f2Var));
        j4.g1 g1Var = this.M;
        q0 q0Var = this.k;
        q0Var.getClass();
        q0Var.n.a(19, new n0(i9, min, min2, g1Var)).b();
        o0(Y, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // h3.c2
    public final int z() {
        q0();
        return this.i0.m;
    }
}
