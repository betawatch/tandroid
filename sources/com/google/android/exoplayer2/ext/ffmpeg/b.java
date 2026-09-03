package com.google.android.exoplayer2.ext.ffmpeg;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import ff.c;
import h5.d0;
import h5.n;
import i5.x;
import j3.e;
import j3.g2;
import j3.m0;
import j3.n0;
import j3.v1;
import l3.c0;
import l3.d;
import l3.h0;
import l3.k0;
import l3.o;
import l3.p;
import l3.q;
import l3.r;
import l3.s;
import l3.u;
import l3.v;
import l3.z;
import n3.f;
import n3.g;
import n3.i;
import n3.k;
import n3.l;
import n3.m;
import o3.j;
import o4.l0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b extends e implements n {
    public final f7.b B;
    public final v C;
    public final i D;
    public f E;
    public n0 F;
    public int G;
    public int H;
    public boolean I;
    public n3.e J;
    public i K;
    public m L;
    public j M;
    public j N;
    public int O;
    public boolean P;
    public boolean Q;
    public long R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public long W;
    public final long[] X;
    public int Y;

    public b(Handler handler, q qVar, v vVar) {
        super(1);
        this.B = new f7.b(handler, qVar);
        this.C = vVar;
        ((k0) vVar).r = new o5.i(this, 24);
        this.D = new i(0, 0);
        this.O = 0;
        this.Q = true;
        F(-9223372036854775807L);
        this.X = new long[10];
    }

    public final boolean A() {
        if (this.L == null) {
            m mVar = (m) ((l) this.J).b();
            this.L = mVar;
            if (mVar != null) {
                int i10 = mVar.d;
                if (i10 > 0) {
                    this.E.f += i10;
                    ((k0) this.C).K = true;
                }
                if (mVar.d(TLObject.FLAG_27)) {
                    long[] jArr = this.X;
                    ((k0) this.C).K = true;
                    if (this.Y != 0) {
                        F(jArr[0]);
                        int i11 = this.Y - 1;
                        this.Y = i11;
                        System.arraycopy(jArr, 1, jArr, 0, i11);
                    }
                }
            }
            return false;
        }
        if (this.L.d(4)) {
            if (this.O == 2) {
                E();
                C();
                this.Q = true;
                return false;
            }
            this.L.j();
            this.L = null;
            try {
                this.V = true;
                ((k0) this.C).t();
                return false;
            } catch (u e) {
                throw c(e, e.c, e.b, 5002);
            }
        }
        if (this.Q) {
            FfmpegAudioDecoder ffmpegAudioDecoder = (FfmpegAudioDecoder) this.J;
            ffmpegAudioDecoder.getClass();
            m0 m0Var = new m0();
            m0Var.o = "audio/raw";
            m0Var.B = ffmpegAudioDecoder.t;
            m0Var.C = ffmpegAudioDecoder.u;
            m0Var.D = ffmpegAudioDecoder.p;
            m0 a2 = new n0(m0Var).a();
            a2.E = this.G;
            a2.F = this.H;
            ((k0) this.C).b(new n0(a2), null);
            this.Q = false;
        }
        v vVar = this.C;
        m mVar2 = this.L;
        if (((k0) vVar).l(mVar2.f, mVar2.c, 1)) {
            this.E.e++;
            this.L.j();
            this.L = null;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r0 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B() {
        n3.e eVar = this.J;
        if (eVar != null && this.O != 2 && !this.U) {
            if (this.K == null) {
                i iVar = (i) ((l) eVar).c();
                this.K = iVar;
            }
            if (this.O == 1) {
                i iVar2 = this.K;
                iVar2.b = 4;
                ((l) this.J).d(iVar2);
                this.K = null;
                this.O = 2;
                return false;
            }
            f7.b bVar = this.c;
            bVar.m();
            int s6 = s(bVar, this.K, 0);
            if (s6 == -5) {
                D(bVar);
                return true;
            }
            if (s6 == -4) {
                if (this.K.d(4)) {
                    this.U = true;
                    ((l) this.J).d(this.K);
                    this.K = null;
                    return false;
                }
                if (!this.I) {
                    this.I = true;
                    this.K.a(TLObject.FLAG_27);
                }
                this.K.l();
                this.K.getClass();
                i iVar3 = this.K;
                if (this.S && !iVar3.d(TLObject.FLAG_31)) {
                    if (Math.abs(iVar3.f - this.R) > 500000) {
                        this.R = iVar3.f;
                    }
                    this.S = false;
                }
                ((l) this.J).d(this.K);
                this.P = true;
                this.E.c++;
                this.K = null;
                return true;
            }
            if (s6 != -3) {
                throw new IllegalStateException();
            }
        }
        return false;
    }

    public final void C() {
        f7.b bVar = this.B;
        if (this.J != null) {
            return;
        }
        j jVar = this.N;
        kf.k0.D(this.M, jVar);
        this.M = jVar;
        if (jVar != null && jVar.h() == null && this.M.g() == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            h5.a.c("createAudioDecoder");
            this.J = z(this.F);
            h5.a.q();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            String k10 = ((FfmpegAudioDecoder) this.J).k();
            long j10 = elapsedRealtime2 - elapsedRealtime;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new x(bVar, k10, elapsedRealtime2, j10, 1));
            }
            this.E.a++;
        } catch (OutOfMemoryError e) {
            throw c(e, this.F, false, 4001);
        } catch (g e6) {
            h5.a.p("DecoderAudioRenderer", "Audio codec error", e6);
            Handler handler2 = (Handler) bVar.b;
            if (handler2 != null) {
                handler2.post(new o(bVar, e6, 0));
            }
            throw c(e6, this.F, false, 4001);
        }
    }

    public final void D(f7.b bVar) {
        n0 n0Var = (n0) bVar.c;
        n0Var.getClass();
        j jVar = (j) bVar.b;
        kf.k0.D(this.N, jVar);
        this.N = jVar;
        n0 n0Var2 = this.F;
        this.F = n0Var;
        this.G = n0Var.S;
        this.H = n0Var.T;
        n3.e eVar = this.J;
        f7.b bVar2 = this.B;
        if (eVar == null) {
            C();
            n0 n0Var3 = this.F;
            Handler handler = (Handler) bVar2.b;
            if (handler != null) {
                handler.post(new androidx.car.app.utils.b(bVar2, n0Var3, null, 18));
                return;
            }
            return;
        }
        k kVar = jVar != this.M ? new k(((FfmpegAudioDecoder) eVar).k(), n0Var2, n0Var, 0, 128) : new k(((FfmpegAudioDecoder) eVar).k(), n0Var2, n0Var, 0, 1);
        if (kVar.d == 0) {
            if (this.P) {
                this.O = 1;
            } else {
                E();
                C();
                this.Q = true;
            }
        }
        n0 n0Var4 = this.F;
        Handler handler2 = (Handler) bVar2.b;
        if (handler2 != null) {
            handler2.post(new androidx.car.app.utils.b(bVar2, n0Var4, kVar, 18));
        }
    }

    public final void E() {
        this.K = null;
        this.L = null;
        this.O = 0;
        this.P = false;
        n3.e eVar = this.J;
        if (eVar != null) {
            this.E.b++;
            ((FfmpegAudioDecoder) eVar).release();
            String k10 = ((FfmpegAudioDecoder) this.J).k();
            f7.b bVar = this.B;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new c(25, bVar, k10));
            }
            this.J = null;
        }
        kf.k0.D(this.M, null);
        this.M = null;
    }

    public final void F(long j10) {
        this.W = j10;
        if (j10 != -9223372036854775807L) {
            this.C.getClass();
        }
    }

    public final void G() {
        long h = ((k0) this.C).h(i());
        if (h != Long.MIN_VALUE) {
            if (!this.T) {
                h = Math.max(this.R, h);
            }
            this.R = h;
            this.T = false;
        }
    }

    @Override // h5.n
    public final void a(v1 v1Var) {
        ((k0) this.C).y(v1Var);
    }

    @Override // j3.e, j3.b2
    public final void b(int i10, Object obj) {
        v vVar = this.C;
        if (i10 == 2) {
            float floatValue = ((Float) obj).floatValue();
            k0 k0Var = (k0) vVar;
            if (k0Var.N != floatValue) {
                k0Var.N = floatValue;
                if (k0Var.o()) {
                    if (d0.a >= 21) {
                        k0Var.v.setVolume(k0Var.N);
                        return;
                    }
                    AudioTrack audioTrack = k0Var.v;
                    float f10 = k0Var.N;
                    audioTrack.setStereoVolume(f10, f10);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            d dVar = (d) obj;
            k0 k0Var2 = (k0) vVar;
            if (k0Var2.y.equals(dVar)) {
                return;
            }
            k0Var2.y = dVar;
            if (k0Var2.a0) {
                return;
            }
            k0Var2.e();
            return;
        }
        if (i10 == 6) {
            ((k0) vVar).x((z) obj);
            return;
        }
        if (i10 == 12) {
            if (d0.a >= 23) {
                c0.a(vVar, obj);
                return;
            }
            return;
        }
        if (i10 == 9) {
            k0 k0Var3 = (k0) vVar;
            k0Var3.C = ((Boolean) obj).booleanValue();
            h0 h0Var = new h0(k0Var3.z() ? v1.d : k0Var3.B, -9223372036854775807L, -9223372036854775807L);
            if (k0Var3.o()) {
                k0Var3.z = h0Var;
                return;
            } else {
                k0Var3.A = h0Var;
                return;
            }
        }
        if (i10 != 10) {
            return;
        }
        int intValue = ((Integer) obj).intValue();
        k0 k0Var4 = (k0) vVar;
        if (k0Var4.X != intValue) {
            k0Var4.X = intValue;
            k0Var4.W = intValue != 0;
            k0Var4.e();
        }
    }

    @Override // h5.n
    public final v1 d() {
        return ((k0) this.C).B;
    }

    @Override // h5.n
    public final long e() {
        if (this.h == 2) {
            G();
        }
        return this.R;
    }

    @Override // j3.e
    public final String g() {
        return "FfmpegAudioRenderer";
    }

    @Override // j3.e
    public final boolean i() {
        if (!this.V) {
            return false;
        }
        k0 k0Var = (k0) this.C;
        if (k0Var.o()) {
            return k0Var.T && !k0Var.m();
        }
        return true;
    }

    @Override // j3.e
    public final boolean j() {
        boolean d;
        if (((k0) this.C).m()) {
            return true;
        }
        if (this.F == null) {
            return false;
        }
        if (h()) {
            d = this.w;
        } else {
            l0 l0Var = this.n;
            l0Var.getClass();
            d = l0Var.d();
        }
        return d || this.L != null;
    }

    @Override // j3.e
    public final void k() {
        f7.b bVar = this.B;
        this.F = null;
        this.Q = true;
        F(-9223372036854775807L);
        try {
            kf.k0.D(this.N, null);
            this.N = null;
            E();
            ((k0) this.C).v();
        } finally {
            bVar.p(this.E);
        }
    }

    @Override // j3.e
    public final void l(boolean z4, boolean z10) {
        f fVar = new f();
        this.E = fVar;
        f7.b bVar = this.B;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new p(bVar, fVar, 0));
        }
        g2 g2Var = this.d;
        g2Var.getClass();
        boolean z11 = g2Var.a;
        v vVar = this.C;
        if (z11) {
            ((k0) vVar).d();
        } else {
            k0 k0Var = (k0) vVar;
            if (k0Var.a0) {
                k0Var.a0 = false;
                k0Var.e();
            }
        }
        k3.k kVar = this.f;
        kVar.getClass();
        ((k0) vVar).q = kVar;
    }

    @Override // j3.e
    public final void m(long j10, boolean z4) {
        ((k0) this.C).e();
        this.R = j10;
        this.S = true;
        this.T = true;
        this.U = false;
        this.V = false;
        if (this.J != null) {
            if (this.O != 0) {
                E();
                C();
                return;
            }
            this.K = null;
            m mVar = this.L;
            if (mVar != null) {
                mVar.j();
                this.L = null;
            }
            ((l) this.J).flush();
            this.P = false;
        }
    }

    @Override // j3.e
    public final void p() {
        ((k0) this.C).r();
    }

    @Override // j3.e
    public final void q() {
        G();
        ((k0) this.C).q();
    }

    @Override // j3.e
    public final void r(n0[] n0VarArr, long j10, long j11) {
        this.I = false;
        if (this.W == -9223372036854775807L) {
            F(j11);
            return;
        }
        int i10 = this.Y;
        long[] jArr = this.X;
        if (i10 == jArr.length) {
            h5.a.K("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + jArr[this.Y - 1]);
        } else {
            this.Y = i10 + 1;
        }
        jArr[this.Y - 1] = j11;
    }

    @Override // j3.e
    public final void t(long j10, long j11) {
        if (this.V) {
            try {
                ((k0) this.C).t();
                return;
            } catch (u e) {
                throw c(e, e.c, e.b, 5002);
            }
        }
        if (this.F == null) {
            f7.b bVar = this.c;
            bVar.m();
            this.D.b();
            int s6 = s(bVar, this.D, 2);
            if (s6 != -5) {
                if (s6 == -4) {
                    h5.a.i(this.D.d(4));
                    this.U = true;
                    try {
                        this.V = true;
                        ((k0) this.C).t();
                        return;
                    } catch (u e6) {
                        throw c(e6, null, false, 5002);
                    }
                }
                return;
            }
            D(bVar);
        }
        C();
        if (this.J != null) {
            try {
                h5.a.c("drainAndFeed");
                while (A()) {
                }
                while (B()) {
                }
                h5.a.q();
                synchronized (this.E) {
                }
            } catch (r e10) {
                throw c(e10, e10.a, false, 5001);
            } catch (s e11) {
                throw c(e11, e11.c, e11.b, 5001);
            } catch (u e12) {
                throw c(e12, e12.c, e12.b, 5002);
            } catch (g e13) {
                h5.a.p("DecoderAudioRenderer", "Audio codec error", e13);
                f7.b bVar2 = this.B;
                Handler handler = (Handler) bVar2.b;
                if (handler != null) {
                    handler.post(new o(bVar2, e13, 0));
                }
                throw c(e13, this.F, false, 4003);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (((l3.k0) r4).i(h5.d0.w(4, r2, r1)) != 0) goto L16;
     */
    @Override // j3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int x(n0 n0Var) {
        int i10;
        String str = n0Var.C;
        int i11 = n0Var.Q;
        int i12 = n0Var.P;
        if (!h5.o.h(str)) {
            return e2.c.b(0, 0, 0);
        }
        String str2 = n0Var.C;
        str2.getClass();
        String str3 = FfmpegLibrary.a;
        if (h5.o.h(str2)) {
            if (FfmpegLibrary.d(str2)) {
                n0 w10 = d0.w(2, i12, i11);
                v vVar = this.C;
                i10 = 4;
                if (((k0) vVar).i(w10) == 0) {
                }
                if (n0Var.X != 0) {
                    i10 = 2;
                }
            }
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (i10 <= 2) {
            return e2.c.b(i10, 0, 0);
        }
        return e2.c.b(i10, 8, d0.a >= 21 ? 32 : 0);
    }

    @Override // j3.e
    public final int y() {
        return 8;
    }

    public final n3.e z(n0 n0Var) {
        h5.a.c("createFfmpegAudioDecoder");
        int i10 = n0Var.D;
        int i11 = n0Var.Q;
        int i12 = n0Var.P;
        if (i10 == -1) {
            i10 = 5760;
        }
        n0 w10 = d0.w(2, i12, i11);
        v vVar = this.C;
        boolean z4 = true;
        if (((k0) vVar).i(w10) != 0) {
            z4 = ((k0) vVar).i(d0.w(4, i12, i11)) != 2 ? false : true ^ "audio/ac3".equals(n0Var.C);
        }
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i10, n0Var, z4);
        h5.a.q();
        return ffmpegAudioDecoder;
    }

    @Override // j3.e
    public final n f() {
        return this;
    }
}
