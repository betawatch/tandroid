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
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.th;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k0 extends ab.e implements s {
    public final d A;
    public final m2 B;
    public final ya.a C;
    public final ab.b D;
    public final long E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public j2 L;
    public l4.h1 M;
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
    public f5.x X;
    public final int Y;
    public l3.e Z;
    public float a0;
    public final d5.y b;
    public boolean b0;
    public final y1 c;
    public final boolean c0;
    public final f5.c d;
    public boolean d0;
    public final Context e;
    public boolean e0;
    public final c2 f;
    public m f0;
    public final e[] g;
    public g5.y g0;
    public final d5.u h;
    public h1 h0;
    public final f5.a0 i;
    public w1 i0;
    public final w j;
    public int j0;
    public final q0 k;
    public long k0;
    public final f5.m l;
    public DispatchQueue l0;
    public final CopyOnWriteArraySet m;
    public final ArrayList m0;
    public final p2 n;
    public final ArrayList o;
    public final boolean p;
    public final l4.b0 q;
    public final k3.f r;
    public final Looper s;
    public final com.google.android.exoplayer2.upstream.f t;
    public final long u;
    public final long v;
    public final f5.y w;
    public final h0 x;
    public final i0 y;
    public final androidx.activity.n z;

    static {
        r0.a("goog.exo.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k0(r rVar, k2 k2Var) {
        super(3);
        this.m0 = new ArrayList();
        this.d = new f5.c();
        try {
            f5.a.v("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.3] [" + f5.d0.e + "]");
            Context context = rVar.a;
            f5.y yVar = rVar.b;
            this.e = context.getApplicationContext();
            this.r = new k3.f(yVar);
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
            f5.a.i(b10.length > 0);
            this.h = (d5.u) rVar.e.get();
            this.q = (l4.b0) rVar.d.get();
            this.t = com.google.android.exoplayer2.upstream.u.b(rVar.g.b);
            this.p = rVar.k;
            this.L = rVar.l;
            this.u = rVar.m;
            this.v = rVar.n;
            Looper looper = rVar.h;
            this.s = looper;
            this.w = yVar;
            this.f = k2Var == 0 ? this : k2Var;
            this.l = new f5.m(looper, yVar, new w(this));
            this.m = new CopyOnWriteArraySet();
            this.o = new ArrayList();
            this.M = new l4.f1();
            this.b = new d5.y(new i2[b10.length], new d5.r[b10.length], t2.b, null);
            this.n = new p2();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i10 = 0; i10 < 21; i10++) {
                int i11 = iArr[i10];
                f5.a.i(!false);
                sparseBooleanArray.append(i11, true);
            }
            this.h.getClass();
            f5.a.i(!false);
            sparseBooleanArray.append(29, true);
            f5.a.i(!false);
            f5.g gVar = new f5.g(sparseBooleanArray);
            this.c = new y1(gVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i12 = 0; i12 < gVar.a.size(); i12++) {
                int a2 = gVar.a(i12);
                f5.a.i(!false);
                sparseBooleanArray2.append(a2, true);
            }
            f5.a.i(!false);
            sparseBooleanArray2.append(4, true);
            f5.a.i(!false);
            sparseBooleanArray2.append(10, true);
            f5.a.i(!false);
            this.N = new y1(new f5.g(sparseBooleanArray2));
            this.i = this.w.a(this.s, null);
            w wVar = new w(this);
            this.j = wVar;
            this.i0 = w1.h(this.b);
            this.r.m(this.f, this.s);
            int i13 = f5.d0.a;
            this.k = new q0(this.g, this.h, this.b, (j) rVar.f.get(), this.t, this.F, this.G, this.r, this.L, rVar.o, rVar.p, this.s, this.w, wVar, i13 < 31 ? new k3.k() : b0.a(this.e, this, rVar.r));
            this.a0 = 1.0f;
            this.F = 0;
            h1 h1Var = h1.U;
            this.O = h1Var;
            this.h0 = h1Var;
            int i14 = -1;
            this.j0 = -1;
            if (i13 < 21) {
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
                    i14 = audioManager.generateAudioSessionId();
                }
                this.Y = i14;
            }
            int i15 = t4.c.b;
            this.c0 = true;
            l(this.r);
            com.google.android.exoplayer2.upstream.f fVar = this.t;
            Handler handler2 = new Handler(this.s);
            k3.f fVar2 = this.r;
            com.google.android.exoplayer2.upstream.u uVar = (com.google.android.exoplayer2.upstream.u) fVar;
            uVar.getClass();
            fVar2.getClass();
            ag.o1 o1Var = uVar.b;
            o1Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) o1Var.b;
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
            androidx.activity.n nVar = new androidx.activity.n();
            nVar.b = context.getApplicationContext();
            nVar.c = new b(nVar, handler, h0Var2);
            this.z = nVar;
            nVar.d();
            d dVar = new d(context, handler, this.x);
            this.A = dVar;
            dVar.b(null);
            m2 m2Var = new m2(context, handler, this.x);
            this.B = m2Var;
            m2Var.c(f5.d0.y(this.Z.c));
            ya.a aVar = new ya.a(9);
            this.C = aVar;
            ab.b bVar = new ab.b(10);
            this.D = bVar;
            this.f0 = new m(0, m2Var.a(), m2Var.d.getStreamMaxVolume(m2Var.f));
            this.g0 = g5.y.e;
            this.X = f5.x.c;
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
        } catch (Throwable th2) {
            this.d.c();
            throw th2;
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

    @Override // j3.c2
    public final r2 A() {
        q0();
        return this.i0.a;
    }

    @Override // j3.c2
    public final Looper B() {
        return this.s;
    }

    @Override // j3.c2
    public final boolean C() {
        q0();
        return this.G;
    }

    @Override // j3.c2
    public final long D() {
        q0();
        return f5.d0.S(T(this.i0));
    }

    @Override // j3.c2
    public final long E() {
        q0();
        return this.u;
    }

    @Override // ab.e
    public final void N() {
        String str;
        AudioTrack audioTrack;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [ExoPlayerLib/2.18.3] [");
        sb2.append(f5.d0.e);
        sb2.append("] [");
        HashSet hashSet = r0.a;
        synchronized (r0.class) {
            str = r0.b;
        }
        sb2.append(str);
        sb2.append("]");
        f5.a.v("ExoPlayerImpl", sb2.toString());
        q0();
        if (f5.d0.a < 21 && (audioTrack = this.Q) != null) {
            audioTrack.release();
            this.Q = null;
        }
        this.z.d();
        m2 m2Var = this.B;
        af.c cVar = m2Var.e;
        if (cVar != null) {
            try {
                m2Var.a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                f5.a.L("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            m2Var.e = null;
        }
        this.C.getClass();
        this.D.getClass();
        d dVar = this.A;
        dVar.c = null;
        dVar.a();
        if (!this.k.z()) {
            this.l.e(10, new eg.c(26));
        }
        this.l.d();
        this.i.a.removeCallbacksAndMessages(null);
        com.google.android.exoplayer2.upstream.f fVar = this.t;
        k3.f fVar2 = this.r;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((com.google.android.exoplayer2.upstream.u) fVar).b.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            com.google.android.exoplayer2.upstream.e eVar = (com.google.android.exoplayer2.upstream.e) it.next();
            if (eVar.b == fVar2) {
                eVar.c = true;
                copyOnWriteArrayList.remove(eVar);
            }
        }
        w1 f9 = this.i0.f(1);
        this.i0 = f9;
        w1 a2 = f9.a(f9.b);
        this.i0 = a2;
        a2.p = a2.r;
        this.i0.q = 0L;
        k3.f fVar3 = this.r;
        f5.a0 a0Var = fVar3.n;
        f5.a.j(a0Var);
        a0Var.c(new jh.o(fVar3, 17));
        this.h.a();
        b0();
        Surface surface = this.S;
        if (surface != null) {
            surface.release();
            this.S = null;
        }
        int i10 = t4.c.b;
        this.e0 = true;
    }

    @Override // ab.e
    public final void O(long j10, int i10, int i11, boolean z10) {
        q0();
        f5.a.f(i10 >= 0);
        k3.f fVar = this.r;
        if (!fVar.r) {
            k3.a d = fVar.d();
            fVar.r = true;
            fVar.l(d, -1, new k3.c(d, 0));
        }
        r2 r2Var = this.i0.a;
        if (r2Var.p() || i10 < r2Var.o()) {
            this.H++;
            if (c()) {
                f5.a.K("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                we.f fVar2 = new we.f(this.i0);
                fVar2.a(1);
                k0 k0Var = this.j.a;
                k0Var.i.c(new ef.c(23, k0Var, fVar2));
                return;
            }
            int i12 = b() != 1 ? 2 : 1;
            int x4 = x();
            w1 Y = Y(this.i0.f(i12), r2Var, Z(r2Var, i10, j10));
            this.k.n.a(3, new p0(r2Var, i10, f5.d0.H(j10))).b();
            o0(Y, 0, 1, true, true, 1, T(Y), x4, z10);
        }
    }

    public final ArrayList Q(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            r1 r1Var = new r1((l4.a) list.get(i11), this.p);
            arrayList.add(r1Var);
            j0 j0Var = new j0(r1Var.b, r1Var.a.o);
            this.o.add(i11 + i10, j0Var);
        }
        this.M = this.M.e(i10, arrayList.size());
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
        int i10 = U == -1 ? 0 : U;
        f5.y yVar = this.w;
        q0 q0Var = this.k;
        return new e2(q0Var, d2Var, r2Var, i10, yVar, q0Var.s);
    }

    public final long T(w1 w1Var) {
        if (w1Var.a.p()) {
            return f5.d0.H(this.k0);
        }
        if (w1Var.b.a()) {
            return w1Var.r;
        }
        r2 r2Var = w1Var.a;
        l4.c0 c0Var = w1Var.b;
        long j10 = w1Var.r;
        Object obj = c0Var.a;
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
        long q6 = q();
        if (r2Var.p() || f2Var.p()) {
            boolean z10 = !r2Var.p() && f2Var.p();
            int U = z10 ? -1 : U();
            if (z10) {
                q6 = -9223372036854775807L;
            }
            return Z(f2Var, U, q6);
        }
        Pair i10 = r2Var.i((q2) this.a, this.n, x(), f5.d0.H(q6));
        Object obj = i10.first;
        if (f2Var.b(obj) != -1) {
            return i10;
        }
        Object I = q0.I((q2) this.a, this.n, this.F, this.G, obj, r2Var, f2Var);
        if (I == null) {
            return Z(f2Var, -1, -9223372036854775807L);
        }
        p2 p2Var = this.n;
        f2Var.g(I, p2Var);
        int i11 = p2Var.c;
        q2 q2Var = (q2) this.a;
        f2Var.m(i11, q2Var, 0L);
        return Z(f2Var, i11, f5.d0.S(q2Var.x));
    }

    public final w1 Y(w1 w1Var, r2 r2Var, Pair pair) {
        List list;
        f5.a.f(r2Var.p() || pair != null);
        r2 r2Var2 = w1Var.a;
        w1 g10 = w1Var.g(r2Var);
        if (r2Var.p()) {
            l4.c0 c0Var = w1.s;
            long H = f5.d0.H(this.k0);
            w1 a2 = g10.b(c0Var, H, H, H, 0L, l4.k1.d, this.b, q8.l0.e).a(c0Var);
            a2.p = a2.r;
            return a2;
        }
        Object obj = g10.b.a;
        int i10 = f5.d0.a;
        boolean equals = obj.equals(pair.first);
        l4.c0 c0Var2 = !equals ? new l4.c0(pair.first) : g10.b;
        long longValue = ((Long) pair.second).longValue();
        long H2 = f5.d0.H(q());
        if (!r2Var2.p()) {
            H2 -= r2Var2.g(obj, this.n).e;
        }
        if (!equals || longValue < H2) {
            l4.c0 c0Var3 = c0Var2;
            f5.a.i(!c0Var3.a());
            l4.k1 k1Var = !equals ? l4.k1.d : g10.h;
            d5.y yVar = !equals ? this.b : g10.i;
            if (equals) {
                list = g10.j;
            } else {
                q8.x xVar = q8.z.b;
                list = q8.l0.e;
            }
            w1 a10 = g10.b(c0Var3, longValue, longValue, longValue, 0L, k1Var, yVar, list).a(c0Var3);
            a10.p = longValue;
            return a10;
        }
        if (longValue != H2) {
            l4.c0 c0Var4 = c0Var2;
            f5.a.i(!c0Var4.a());
            long max = Math.max(0L, g10.q - (longValue - H2));
            long j10 = g10.p;
            if (g10.k.equals(g10.b)) {
                j10 = longValue + max;
            }
            w1 b10 = g10.b(c0Var4, longValue, longValue, longValue, max, g10.h, g10.i, g10.j);
            b10.p = j10;
            return b10;
        }
        int b11 = r2Var.b(g10.k.a);
        if (b11 != -1 && r2Var.f(b11, this.n, false).c == r2Var.g(c0Var2.a, this.n).c) {
            return g10;
        }
        r2Var.g(c0Var2.a, this.n);
        long a11 = c0Var2.a() ? this.n.a(c0Var2.b, c0Var2.c) : this.n.d;
        l4.c0 c0Var5 = c0Var2;
        w1 a12 = g10.b(c0Var5, g10.r, g10.r, g10.d, a11 - g10.r, g10.h, g10.i, g10.j).a(c0Var5);
        a12.p = a11;
        return a12;
    }

    public final Pair Z(r2 r2Var, int i10, long j10) {
        if (r2Var.p()) {
            this.j0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.k0 = j10;
            return null;
        }
        if (i10 == -1 || i10 >= r2Var.o()) {
            i10 = r2Var.a(this.G);
            j10 = f5.d0.S(r2Var.m(i10, (q2) this.a, 0L).x);
        }
        return r2Var.i((q2) this.a, this.n, i10, f5.d0.H(j10));
    }

    @Override // j3.c2
    public final void a() {
        q0();
        boolean h = h();
        int d = this.A.d(2, h);
        n0(d, (!h || d == 1) ? 1 : 2, h);
        w1 w1Var = this.i0;
        if (w1Var.e != 1) {
            return;
        }
        w1 d10 = w1Var.d(null);
        w1 f9 = d10.f(d10.a.p() ? 4 : 2);
        this.H++;
        f5.a0 a0Var = this.k.n;
        a0Var.getClass();
        f5.z b10 = f5.a0.b();
        b10.a = a0Var.a.obtainMessage(0);
        b10.b();
        o0(f9, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    public final void a0(int i10, int i11) {
        f5.x xVar = this.X;
        if (i10 == xVar.a && i11 == xVar.b) {
            return;
        }
        this.X = new f5.x(i10, i11);
        DispatchQueue dispatchQueue = this.l0;
        if (dispatchQueue != null) {
            dispatchQueue.postRunnable(new y(this, i10, i11, 0));
        } else {
            this.l.e(24, new z(i10, i11, 0));
        }
    }

    @Override // j3.c2
    public final int b() {
        q0();
        return this.i0.e;
    }

    public final void b0() {
        TextureView textureView = this.V;
        h0 h0Var = this.x;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != h0Var) {
                f5.a.K("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
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

    @Override // j3.c2
    public final boolean c() {
        q0();
        return this.i0.b.a();
    }

    public final void c0(int i10, int i11, Object obj) {
        for (e eVar : this.g) {
            if (eVar.getTrackType() == i10) {
                e2 S = S(eVar);
                f5.a.i(!S.g);
                S.d = i11;
                f5.a.i(!S.g);
                S.e = obj;
                S.c();
            }
        }
    }

    @Override // j3.c2
    public final long d() {
        q0();
        return f5.d0.S(this.i0.q);
    }

    public final void d0(l3.e eVar, boolean z10) {
        q0();
        if (this.e0) {
            return;
        }
        boolean a2 = f5.d0.a(this.Z, eVar);
        int i10 = 1;
        f5.m mVar = this.l;
        if (!a2) {
            this.Z = eVar;
            c0(1, 3, eVar);
            this.B.c(f5.d0.y(eVar.c));
            mVar.c(20, new eg.n(eVar, 11));
        }
        l3.e eVar2 = z10 ? eVar : null;
        d dVar = this.A;
        dVar.b(eVar2);
        this.h.b(eVar);
        boolean h = h();
        int d = dVar.d(b(), h);
        if (h && d != 1) {
            i10 = 2;
        }
        n0(d, i10, h);
        mVar.b();
    }

    @Override // j3.c2
    public final void e(int i10) {
        q0();
        if (this.F != i10) {
            this.F = i10;
            f5.a0 a0Var = this.k.n;
            a0Var.getClass();
            f5.z b10 = f5.a0.b();
            b10.a = a0Var.a.obtainMessage(11, i10, 0);
            b10.b();
            x xVar = new x(i10, 0);
            f5.m mVar = this.l;
            mVar.c(8, xVar);
            m0();
            mVar.b();
        }
    }

    public final void e0(l4.a aVar, boolean z10) {
        q0();
        List singletonList = Collections.singletonList(aVar);
        q0();
        int U = U();
        long D = D();
        this.H++;
        ArrayList arrayList = this.o;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                arrayList.remove(i10);
            }
            this.M = this.M.a(0, size);
        }
        ArrayList Q = Q(0, singletonList);
        f2 f2Var = new f2(arrayList, this.M);
        boolean p10 = f2Var.p();
        int i11 = f2Var.e;
        if (!p10 && -1 >= i11) {
            throw new w0();
        }
        if (z10) {
            U = f2Var.a(this.G);
            D = -9223372036854775807L;
        }
        int i12 = U;
        w1 Y = Y(this.i0, f2Var, Z(f2Var, i12, D));
        int i13 = Y.e;
        if (i12 != -1 && i13 != 1) {
            i13 = (f2Var.p() || i12 >= i11) ? 4 : 2;
        }
        w1 f9 = Y.f(i13);
        this.k.n.a(17, new m0(Q, this.M, i12, f5.d0.H(D))).b();
        o0(f9, 0, 1, false, (this.i0.b.a.equals(f9.b.a) || this.i0.a.p()) ? false : true, 4, T(f9), -1, false);
    }

    @Override // j3.c2
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

    @Override // j3.c2
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
                f5.a.i(!S.g);
                S.d = 1;
                f5.a.i(true ^ S.g);
                S.e = surface;
                S.c();
                arrayList.add(S);
            }
        }
        Object obj = this.R;
        if (obj != null && obj != surface) {
            try {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
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
            l0(new n(2, new a6.b("Detaching surface timed out."), 1003));
        }
    }

    @Override // j3.c2
    public final long getDuration() {
        q0();
        if (!c()) {
            r2 A = A();
            if (A.p()) {
                return -9223372036854775807L;
            }
            return f5.d0.S(A.m(x(), (q2) this.a, 0L).y);
        }
        w1 w1Var = this.i0;
        l4.c0 c0Var = w1Var.b;
        r2 r2Var = w1Var.a;
        Object obj = c0Var.a;
        p2 p2Var = this.n;
        r2Var.g(obj, p2Var);
        return f5.d0.S(p2Var.a(c0Var.b, c0Var.c));
    }

    @Override // j3.c2
    public final x1 getPlaybackParameters() {
        q0();
        return this.i0.n;
    }

    @Override // j3.c2
    public final boolean h() {
        q0();
        return this.i0.l;
    }

    public final void h0(Surface surface) {
        q0();
        b0();
        g0(surface);
        int i10 = surface == null ? 0 : -1;
        a0(i10, i10);
    }

    @Override // j3.c2
    public final void i(boolean z10) {
        q0();
        if (this.G != z10) {
            this.G = z10;
            f5.a0 a0Var = this.k.n;
            a0Var.getClass();
            f5.z b10 = f5.a0.b();
            b10.a = a0Var.a.obtainMessage(12, z10 ? 1 : 0, 0);
            b10.b();
            t tVar = new t(0, z10);
            f5.m mVar = this.l;
            mVar.c(9, tVar);
            m0();
            mVar.b();
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

    @Override // j3.c2
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
            f5.a.K("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
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

    @Override // j3.c2
    public final int k() {
        q0();
        if (this.i0.a.p()) {
            return 0;
        }
        w1 w1Var = this.i0;
        return w1Var.a.b(w1Var.b.a);
    }

    public final void k0(float f9) {
        q0();
        final float g10 = f5.d0.g(f9, 0.0f, 1.0f);
        if (this.a0 == g10) {
            return;
        }
        this.a0 = g10;
        c0(1, 2, Float.valueOf(this.A.g * g10));
        this.l.e(22, new f5.j() { // from class: j3.v
            @Override // f5.j
            public final void invoke(Object obj) {
                ((a2) obj).onVolumeChanged(g10);
            }
        });
    }

    @Override // j3.c2
    public final void l(a2 a2Var) {
        a2Var.getClass();
        this.l.a(a2Var);
    }

    public final void l0(n nVar) {
        w1 w1Var = this.i0;
        w1 a2 = w1Var.a(w1Var.b);
        a2.p = a2.r;
        a2.q = 0L;
        w1 f9 = a2.f(1);
        if (nVar != null) {
            f9 = f9.d(nVar);
        }
        w1 w1Var2 = f9;
        this.H++;
        f5.a0 a0Var = this.k.n;
        a0Var.getClass();
        f5.z b10 = f5.a0.b();
        b10.a = a0Var.a.obtainMessage(6);
        b10.b();
        o0(w1Var2, 0, 1, false, w1Var2.a.p() && !this.i0.a.p(), 4, T(w1Var2), -1, false);
    }

    @Override // j3.c2
    public final int m() {
        q0();
        if (c()) {
            return this.i0.b.c;
        }
        return -1;
    }

    public final void m0() {
        int k9;
        int e10;
        y1 y1Var = this.N;
        int i10 = f5.d0.a;
        c2 c2Var = this.f;
        boolean c3 = c2Var.c();
        ab.e eVar = (ab.e) c2Var;
        r2 A = eVar.A();
        boolean z10 = !A.p() && A.m(eVar.x(), (q2) eVar.a, 0L).n;
        r2 A2 = eVar.A();
        if (A2.p()) {
            k9 = -1;
        } else {
            int x4 = eVar.x();
            int g10 = eVar.g();
            if (g10 == 1) {
                g10 = 0;
            }
            k9 = A2.k(x4, g10, eVar.C());
        }
        boolean z11 = k9 != -1;
        r2 A3 = eVar.A();
        if (A3.p()) {
            e10 = -1;
        } else {
            int x10 = eVar.x();
            int g11 = eVar.g();
            if (g11 == 1) {
                g11 = 0;
            }
            e10 = A3.e(x10, g11, eVar.C());
        }
        boolean z12 = e10 != -1;
        boolean J = eVar.J();
        boolean I = eVar.I();
        boolean p10 = c2Var.A().p();
        ag.o1 o1Var = new ag.o1(17);
        c2.u uVar = (c2.u) o1Var.b;
        f5.g gVar = this.c.a;
        uVar.getClass();
        for (int i11 = 0; i11 < gVar.a.size(); i11++) {
            uVar.b(gVar.a(i11));
        }
        boolean z13 = !c3;
        o1Var.a(4, z13);
        o1Var.a(5, z10 && !c3);
        o1Var.a(6, z11 && !c3);
        o1Var.a(7, !p10 && (z11 || !J || z10) && !c3);
        o1Var.a(8, z12 && !c3);
        o1Var.a(9, !p10 && (z12 || (J && I)) && !c3);
        o1Var.a(10, z13);
        o1Var.a(11, z10 && !c3);
        o1Var.a(12, z10 && !c3);
        y1 y1Var2 = new y1(uVar.c());
        this.N = y1Var2;
        if (y1Var2.equals(y1Var)) {
            return;
        }
        this.l.c(13, new w(this));
    }

    @Override // j3.c2
    public final void n(int i10, int i11) {
        q0();
        f5.a.f(i10 >= 0 && i11 >= i10);
        int size = this.o.size();
        int min = Math.min(i11, size);
        if (i10 >= size || i10 == min) {
            return;
        }
        int x4 = x();
        r2 A = A();
        ArrayList arrayList = this.o;
        int size2 = arrayList.size();
        this.H++;
        for (int i12 = min - 1; i12 >= i10; i12--) {
            arrayList.remove(i12);
        }
        this.M = this.M.a(i10, min);
        f2 f2Var = new f2(arrayList, this.M);
        w1 Y = Y(this.i0, f2Var, V(A, f2Var));
        int i13 = Y.e;
        if (i13 != 1 && i13 != 4 && i10 < min && min == size2 && x4 >= Y.a.o()) {
            Y = Y.f(4);
        }
        l4.h1 h1Var = this.M;
        f5.a0 a0Var = this.k.n;
        a0Var.getClass();
        f5.z b10 = f5.a0.b();
        b10.a = a0Var.a.obtainMessage(20, i10, min, h1Var);
        b10.b();
        o0(Y, 0, 1, false, !Y.b.a.equals(this.i0.b.a), 4, T(Y), -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void n0(int i10, int i11, boolean z10) {
        int i12 = 0;
        ?? r42 = (!z10 || i10 == -1) ? 0 : 1;
        if (r42 != 0 && i10 != 1) {
            i12 = 1;
        }
        w1 w1Var = this.i0;
        if (w1Var.l == r42 && w1Var.m == i12) {
            return;
        }
        this.H++;
        w1 c3 = w1Var.c(i12, r42);
        f5.a0 a0Var = this.k.n;
        a0Var.getClass();
        f5.z b10 = f5.a0.b();
        b10.a = a0Var.a.obtainMessage(1, r42, i12);
        b10.b();
        o0(c3, 0, i11, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // j3.c2
    public final void o(boolean z10) {
        q0();
        int d = this.A.d(b(), z10);
        int i10 = 1;
        if (z10 && d != 1) {
            i10 = 2;
        }
        n0(d, i10, z10);
    }

    public final void o0(final w1 w1Var, final int i10, final int i11, boolean z10, boolean z11, int i12, long j10, int i13, boolean z12) {
        Pair pair;
        int i14;
        f1 f1Var;
        boolean z13;
        boolean z14;
        boolean z15;
        int i15;
        Object obj;
        f1 f1Var2;
        Object obj2;
        int i16;
        long j11;
        long j12;
        long j13;
        long W;
        Object obj3;
        f1 f1Var3;
        Object obj4;
        int i17;
        w1 w1Var2 = this.i0;
        this.i0 = w1Var;
        boolean equals = w1Var2.a.equals(w1Var.a);
        q2 q2Var = (q2) this.a;
        p2 p2Var = this.n;
        r2 r2Var = w1Var2.a;
        l4.c0 c0Var = w1Var2.b;
        r2 r2Var2 = w1Var.a;
        l4.c0 c0Var2 = w1Var.b;
        if (r2Var2.p() && r2Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (r2Var2.p() != r2Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (r2Var.m(r2Var.g(c0Var.a, p2Var).c, q2Var, 0L).a.equals(r2Var2.m(r2Var2.g(c0Var2.a, p2Var).c, q2Var, 0L).a)) {
            pair = (z11 && i12 == 0 && c0Var.d < c0Var2.d) ? new Pair(Boolean.TRUE, 0) : (z11 && i12 == 1 && z12) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z11 && i12 == 0) {
                i14 = 1;
            } else if (z11 && i12 == 1) {
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
            for (int i18 = 0; i18 < list.size(); i18++) {
                b4.c cVar = (b4.c) list.get(i18);
                int i19 = 0;
                while (true) {
                    b4.b[] bVarArr = cVar.a;
                    if (i19 < bVarArr.length) {
                        bVarArr[i19].populateMediaMetadata(a2);
                        i19++;
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
            final int i20 = 0;
            this.l.c(0, new f5.j() { // from class: j3.a0
                @Override // f5.j
                public final void invoke(Object obj5) {
                    a2 a2Var = (a2) obj5;
                    switch (i20) {
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
        if (z11) {
            p2 p2Var2 = new p2();
            if (w1Var2.a.p()) {
                z13 = booleanValue;
                z14 = z16;
                z15 = equals2;
                i15 = i13;
                obj = null;
                f1Var2 = null;
                obj2 = null;
                i16 = -1;
            } else {
                Object obj5 = w1Var2.b.a;
                w1Var2.a.g(obj5, p2Var2);
                int i21 = p2Var2.c;
                int b10 = w1Var2.a.b(obj5);
                z13 = booleanValue;
                z14 = z16;
                z15 = equals2;
                obj = w1Var2.a.m(i21, (q2) this.a, 0L).a;
                f1Var2 = ((q2) this.a).c;
                obj2 = obj5;
                i15 = i21;
                i16 = b10;
            }
            if (i12 == 0) {
                if (w1Var2.b.a()) {
                    l4.c0 c0Var3 = w1Var2.b;
                    j13 = p2Var2.a(c0Var3.b, c0Var3.c);
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
            long S = f5.d0.S(j13);
            long S2 = f5.d0.S(W);
            l4.c0 c0Var4 = w1Var2.b;
            b2 b2Var = new b2(obj, i15, f1Var2, obj2, i16, S, S2, c0Var4.b, c0Var4.c);
            q2 q2Var2 = (q2) this.a;
            int x4 = x();
            if (this.i0.a.p()) {
                obj3 = null;
                f1Var3 = null;
                obj4 = null;
                i17 = -1;
            } else {
                w1 w1Var3 = this.i0;
                Object obj6 = w1Var3.b.a;
                w1Var3.a.g(obj6, this.n);
                int b11 = this.i0.a.b(obj6);
                Object obj7 = this.i0.a.m(x4, q2Var2, 0L).a;
                f1Var3 = q2Var2.c;
                i17 = b11;
                obj4 = obj6;
                obj3 = obj7;
            }
            long S3 = f5.d0.S(j10);
            long S4 = this.i0.b.a() ? f5.d0.S(W(this.i0)) : S3;
            l4.c0 c0Var5 = this.i0.b;
            this.l.c(11, new e3.d(i12, b2Var, new b2(obj3, x4, f1Var3, obj4, i17, S3, S4, c0Var5.b, c0Var5.c), 1));
        } else {
            z13 = booleanValue;
            z14 = z16;
            z15 = equals2;
        }
        if (z13) {
            this.l.c(1, new eg.n2(f1Var, intValue, 1));
        }
        if (w1Var2.f != w1Var.f) {
            final int i22 = 0;
            this.l.c(10, new f5.j() { // from class: j3.u
                @Override // f5.j
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
            if (w1Var.f != null) {
                final int i23 = 1;
                this.l.c(10, new f5.j() { // from class: j3.u
                    @Override // f5.j
                    public final void invoke(Object obj8) {
                        a2 a2Var = (a2) obj8;
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
        }
        d5.y yVar = w1Var2.i;
        d5.y yVar2 = w1Var.i;
        if (yVar != yVar2) {
            d5.u uVar = this.h;
            Object obj8 = yVar2.e;
            uVar.getClass();
            uVar.c = (d5.t) obj8;
            final int i24 = 2;
            this.l.c(2, new f5.j() { // from class: j3.u
                @Override // f5.j
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
        if (!z15) {
            this.l.c(14, new eg.n(this.O, 10));
        }
        if (z18) {
            final int i25 = 3;
            this.l.c(3, new f5.j() { // from class: j3.u
                @Override // f5.j
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
        if (z17 || z14) {
            final int i26 = 4;
            this.l.c(-1, new f5.j() { // from class: j3.u
                @Override // f5.j
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
        if (z17) {
            final int i27 = 5;
            this.l.c(4, new f5.j() { // from class: j3.u
                @Override // f5.j
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (i27) {
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
            final int i28 = 1;
            this.l.c(5, new f5.j() { // from class: j3.a0
                @Override // f5.j
                public final void invoke(Object obj52) {
                    a2 a2Var = (a2) obj52;
                    switch (i28) {
                        case 0:
                            a2Var.onTimelineChanged(w1Var.a, i11);
                            break;
                        default:
                            a2Var.onPlayWhenReadyChanged(w1Var.l, i11);
                            break;
                    }
                }
            });
        }
        if (w1Var2.m != w1Var.m) {
            final int i29 = 6;
            this.l.c(6, new f5.j() { // from class: j3.u
                @Override // f5.j
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
        if (X(w1Var2) != X(w1Var)) {
            final int i30 = 7;
            this.l.c(7, new f5.j() { // from class: j3.u
                @Override // f5.j
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
        if (!w1Var2.n.equals(w1Var.n)) {
            final int i31 = 8;
            this.l.c(12, new f5.j() { // from class: j3.u
                @Override // f5.j
                public final void invoke(Object obj82) {
                    a2 a2Var = (a2) obj82;
                    switch (i31) {
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
            this.l.c(-1, new eg.c(27));
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

    @Override // j3.c2
    public final long p() {
        q0();
        return this.v;
    }

    public final void p0() {
        int b10 = b();
        ab.b bVar = this.D;
        ya.a aVar = this.C;
        if (b10 != 1) {
            if (b10 == 2 || b10 == 3) {
                q0();
                boolean z10 = this.i0.o;
                h();
                aVar.getClass();
                h();
                bVar.getClass();
                return;
            }
            if (b10 != 4) {
                throw new IllegalStateException();
            }
        }
        aVar.getClass();
        bVar.getClass();
    }

    @Override // j3.c2
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
            return f5.d0.S(w1Var2.a.m(x(), (q2) this.a, 0L).x);
        }
        return f5.d0.S(this.i0.c) + f5.d0.S(p2Var.e);
    }

    public final void q0() {
        this.d.a();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.s;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i10 = f5.d0.a;
            Locale locale = Locale.US;
            String j10 = th.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (this.c0) {
                throw new IllegalStateException(j10);
            }
            f5.a.L("ExoPlayerImpl", j10, this.d0 ? null : new IllegalStateException());
            this.d0 = true;
        }
    }

    @Override // j3.c2
    public final void r(int i10, List list) {
        q0();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            arrayList.add(this.q.a((f1) list.get(i11)));
        }
        q0();
        f5.a.f(i10 >= 0);
        ArrayList arrayList2 = this.o;
        int min = Math.min(i10, arrayList2.size());
        r2 A = A();
        this.H++;
        ArrayList Q = Q(min, arrayList);
        f2 f2Var = new f2(arrayList2, this.M);
        w1 Y = Y(this.i0, f2Var, V(A, f2Var));
        l4.h1 h1Var = this.M;
        f5.a0 a0Var = this.k.n;
        m0 m0Var = new m0(Q, h1Var, -1, -9223372036854775807L);
        a0Var.getClass();
        f5.z b10 = f5.a0.b();
        b10.a = a0Var.a.obtainMessage(18, min, 0, m0Var);
        b10.b();
        o0(Y, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // j3.c2
    public final long s() {
        q0();
        if (c()) {
            w1 w1Var = this.i0;
            return w1Var.k.equals(w1Var.b) ? f5.d0.S(this.i0.p) : getDuration();
        }
        q0();
        if (this.i0.a.p()) {
            return this.k0;
        }
        w1 w1Var2 = this.i0;
        if (w1Var2.k.d != w1Var2.b.d) {
            return f5.d0.S(w1Var2.a.m(x(), (q2) this.a, 0L).y);
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
        return f5.d0.S(j10 + p2Var.e);
    }

    @Override // j3.c2
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

    @Override // j3.c2
    public final void stop() {
        q0();
        q0();
        this.A.d(1, h());
        l0(null);
        new t4.c(this.i0.r, q8.l0.e);
    }

    @Override // j3.c2
    public final t2 t() {
        q0();
        return this.i0.i.d;
    }

    @Override // j3.c2
    public final void u(a2 a2Var) {
        q0();
        a2Var.getClass();
        f5.m mVar = this.l;
        mVar.f();
        CopyOnWriteArraySet copyOnWriteArraySet = mVar.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            f5.l lVar = (f5.l) it.next();
            if (lVar.a.equals(a2Var)) {
                f5.k kVar = mVar.c;
                lVar.d = true;
                if (lVar.c) {
                    lVar.c = false;
                    kVar.e(lVar.a, lVar.b.c());
                }
                copyOnWriteArraySet.remove(lVar);
            }
        }
    }

    @Override // j3.c2
    public final n v() {
        q0();
        return this.i0.f;
    }

    @Override // j3.c2
    public final int w() {
        q0();
        if (c()) {
            return this.i0.b.b;
        }
        return -1;
    }

    @Override // j3.c2
    public final int x() {
        q0();
        int U = U();
        if (U == -1) {
            return 0;
        }
        return U;
    }

    @Override // j3.c2
    public final void y(int i10, int i11, int i12) {
        q0();
        f5.a.f(i10 >= 0 && i10 <= i11 && i12 >= 0);
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int min = Math.min(i11, size);
        int min2 = Math.min(i12, size - (min - i10));
        if (i10 >= size || i10 == min || i10 == min2) {
            return;
        }
        r2 A = A();
        this.H++;
        f5.d0.G(i10, min, min2, arrayList);
        f2 f2Var = new f2(arrayList, this.M);
        w1 Y = Y(this.i0, f2Var, V(A, f2Var));
        l4.h1 h1Var = this.M;
        q0 q0Var = this.k;
        q0Var.getClass();
        q0Var.n.a(19, new n0(i10, min, min2, h1Var)).b();
        o0(Y, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // j3.c2
    public final int z() {
        q0();
        return this.i0.m;
    }
}
