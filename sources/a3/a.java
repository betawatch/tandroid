package a3;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import b2.x1;
import u2.d1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class a extends i2.f {
    public final long I;
    public final int J;
    public final of.b K;
    public final e2.a0 L;
    public final h2.h M;
    public b2.s N;
    public b2.s O;
    public h2.e P;
    public h2.h Q;
    public VideoDecoderOutputBuffer R;
    public int S;
    public Surface T;
    public Surface U;
    public y V;
    public n2.g W;
    public n2.g X;
    public int Y;
    public boolean Z;
    public int a0;
    public long b0;
    public long c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public x1 g0;
    public long h0;
    public int i0;
    public int j0;
    public int k0;
    public long l0;
    public i2.g m0;

    public a(long j3, Handler handler, l0 l0Var, int i10) {
        super(2);
        this.I = j3;
        this.J = i10;
        this.c0 = -9223372036854775807L;
        this.L = new e2.a0();
        this.M = new h2.h(0, 0);
        this.K = new of.b(handler, l0Var);
        this.Y = 0;
        this.S = -1;
        this.a0 = 0;
        this.m0 = new i2.g();
    }

    public abstract h2.e C(b2.s sVar);

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0103, code lost:
    
        if (r1 != false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(long j3) {
        boolean z10;
        long j10;
        boolean z11;
        if (this.R == null) {
            h2.e eVar = this.P;
            eVar.getClass();
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) ((h2.l) eVar).c();
            this.R = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return false;
            }
            i2.g gVar = this.m0;
            int i10 = gVar.f;
            int i11 = videoDecoderOutputBuffer.skippedOutputBufferCount;
            gVar.f = i10 + i11;
            this.k0 -= i11;
        }
        if (this.R.isEndOfStream()) {
            if (this.Y == 2) {
                I();
                G();
                return false;
            }
            this.R.release();
            this.R = null;
            this.f0 = true;
            return false;
        }
        if (this.b0 == -9223372036854775807L) {
            this.b0 = j3;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.R;
        videoDecoderOutputBuffer2.getClass();
        long j11 = videoDecoderOutputBuffer2.timeUs;
        long j12 = j11 - j3;
        if (this.S != -1) {
            e2.a0 a0Var = this.L;
            b2.s sVar = (b2.s) a0Var.g(j11);
            if (sVar != null) {
                this.O = sVar;
            } else if (this.O == null) {
                this.O = (b2.s) a0Var.f();
            }
            long j13 = j11 - this.v;
            boolean z12 = this.n == 2;
            int i12 = this.a0;
            if (i12 != 0) {
                if (i12 != 1) {
                    j10 = -30000;
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    long Q = e2.d0.Q(SystemClock.elapsedRealtime()) - this.l0;
                    if (!z12 || j12 >= -30000 || Q <= 100000) {
                        z12 = false;
                    }
                } else {
                    j10 = -30000;
                }
                z12 = true;
            } else {
                j10 = -30000;
            }
            if (z12) {
                b2.s sVar2 = this.O;
                sVar2.getClass();
                J(videoDecoderOutputBuffer2, j13, sVar2);
            } else {
                if ((this.n == 2) && j3 != this.b0) {
                    if (j12 < -500000) {
                        d1 d1Var = this.r;
                        d1Var.getClass();
                        int g10 = d1Var.g(j3 - this.v);
                        if (g10 == 0) {
                            z11 = false;
                        } else {
                            this.m0.j++;
                            M(g10, this.k0);
                            F();
                            z11 = true;
                        }
                    }
                    if (j12 < j10) {
                        M(0, 1);
                        videoDecoderOutputBuffer2.release();
                    } else if (j12 < 30000) {
                        b2.s sVar3 = this.O;
                        sVar3.getClass();
                        J(videoDecoderOutputBuffer2, j13, sVar3);
                    }
                }
                z10 = false;
            }
            z10 = true;
        } else {
            if (j12 < -30000) {
                this.m0.f++;
                videoDecoderOutputBuffer2.release();
                z10 = true;
            }
            z10 = false;
        }
        if (z10) {
            this.R.getClass();
            this.k0--;
            this.R = null;
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r0 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E() {
        h2.e eVar = this.P;
        if (eVar != null && this.Y != 2 && !this.e0) {
            if (this.Q == null) {
                h2.h hVar = (h2.h) ((h2.l) eVar).d();
                this.Q = hVar;
            }
            h2.h hVar2 = this.Q;
            hVar2.getClass();
            if (this.Y == 1) {
                hVar2.setFlags(4);
                h2.e eVar2 = this.P;
                eVar2.getClass();
                ((h2.l) eVar2).e(hVar2);
                this.Q = null;
                this.Y = 2;
                return false;
            }
            of.b bVar = this.c;
            bVar.F();
            int w10 = w(bVar, hVar2, 0);
            if (w10 == -5) {
                H(bVar);
                return true;
            }
            if (w10 == -4) {
                if (hVar2.isEndOfStream()) {
                    this.e0 = true;
                    h2.e eVar3 = this.P;
                    eVar3.getClass();
                    ((h2.l) eVar3).e(hVar2);
                    this.Q = null;
                    return false;
                }
                if (this.d0) {
                    long j3 = hVar2.e;
                    b2.s sVar = this.N;
                    sVar.getClass();
                    this.L.a(sVar, j3);
                    this.d0 = false;
                }
                hVar2.c();
                hVar2.a = this.N;
                h2.e eVar4 = this.P;
                eVar4.getClass();
                ((h2.l) eVar4).e(hVar2);
                this.k0++;
                this.Z = true;
                this.m0.c++;
                this.Q = null;
                return true;
            }
            if (w10 != -3) {
                throw new IllegalStateException();
            }
        }
        return false;
    }

    public final void F() {
        this.k0 = 0;
        if (this.Y != 0) {
            I();
            G();
            return;
        }
        this.Q = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.R;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.R = null;
        }
        h2.e eVar = this.P;
        eVar.getClass();
        h2.l lVar = (h2.l) eVar;
        lVar.flush();
        lVar.a(this.w);
        this.Z = false;
    }

    public final void G() {
        of.b bVar = this.K;
        if (this.P != null) {
            return;
        }
        n2.g gVar = this.X;
        hc.b.D(this.W, gVar);
        this.W = gVar;
        if (gVar != null && gVar.h() == null && this.W.g() == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            b2.s sVar = this.N;
            sVar.getClass();
            h2.e C = C(sVar);
            this.P = C;
            ((h2.l) C).a(this.w);
            L(this.S);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            h2.e eVar = this.P;
            eVar.getClass();
            String name = eVar.getName();
            long j3 = elapsedRealtime2 - elapsedRealtime;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new g0(bVar, name, elapsedRealtime2, j3, 0));
            }
            this.m0.a++;
        } catch (h2.f e) {
            e2.a.f("DecoderVideoRenderer", "Video codec error", e);
            Handler handler2 = (Handler) bVar.b;
            if (handler2 != null) {
                handler2.post(new a1.e(3, bVar, e));
            }
            throw d(e, this.N, false, 4001);
        } catch (OutOfMemoryError e7) {
            throw d(e7, this.N, false, 4001);
        }
    }

    public final void H(of.b bVar) {
        i2.h hVar;
        this.d0 = true;
        b2.s sVar = (b2.s) bVar.c;
        sVar.getClass();
        n2.g gVar = (n2.g) bVar.b;
        hc.b.D(this.X, gVar);
        this.X = gVar;
        b2.s sVar2 = this.N;
        this.N = sVar;
        h2.e eVar = this.P;
        of.b bVar2 = this.K;
        if (eVar == null) {
            G();
            b2.s sVar3 = this.N;
            sVar3.getClass();
            Handler handler = (Handler) bVar2.b;
            if (handler != null) {
                handler.post(new k0(bVar2, sVar3, null, 0));
                return;
            }
            return;
        }
        if (gVar != this.W) {
            String name = eVar.getName();
            sVar2.getClass();
            hVar = new i2.h(name, sVar2, sVar, 0, 128);
        } else {
            String name2 = eVar.getName();
            sVar2.getClass();
            hVar = new i2.h(name2, sVar2, sVar, 0, 8);
        }
        if (hVar.d == 0) {
            if (this.Z) {
                this.Y = 1;
            } else {
                I();
                G();
            }
        }
        b2.s sVar4 = this.N;
        sVar4.getClass();
        Handler handler2 = (Handler) bVar2.b;
        if (handler2 != null) {
            handler2.post(new k0(bVar2, sVar4, hVar, 0));
        }
    }

    public final void I() {
        this.Q = null;
        this.R = null;
        this.Y = 0;
        this.Z = false;
        this.k0 = 0;
        h2.e eVar = this.P;
        if (eVar != null) {
            this.m0.b++;
            eVar.release();
            String name = this.P.getName();
            of.b bVar = this.K;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new a1.e(4, bVar, name));
            }
            this.P = null;
        }
        hc.b.D(this.W, null);
        this.W = null;
    }

    public final void J(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j3, b2.s sVar) {
        y yVar = this.V;
        if (yVar != null) {
            this.h.getClass();
            yVar.a(j3, System.nanoTime(), sVar, null);
        }
        this.l0 = e2.d0.Q(SystemClock.elapsedRealtime());
        if (videoDecoderOutputBuffer.mode != 1 || this.U == null) {
            M(0, 1);
            videoDecoderOutputBuffer.release();
            return;
        }
        int i10 = videoDecoderOutputBuffer.width;
        int i11 = videoDecoderOutputBuffer.height;
        x1 x1Var = this.g0;
        of.b bVar = this.K;
        if (x1Var == null || x1Var.a != i10 || x1Var.b != i11) {
            x1 x1Var2 = new x1(i10, i11);
            this.g0 = x1Var2;
            bVar.r0(x1Var2);
        }
        Surface surface = this.U;
        surface.getClass();
        K(videoDecoderOutputBuffer, surface);
        this.j0 = 0;
        this.m0.e++;
        if (this.a0 != 3) {
            this.a0 = 3;
            Surface surface2 = this.T;
            if (surface2 != null) {
                bVar.n0(surface2);
            }
        }
    }

    public abstract void K(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    public abstract void L(int i10);

    public final void M(int i10, int i11) {
        int i12;
        i2.g gVar = this.m0;
        gVar.h += i10;
        int i13 = i10 + i11;
        gVar.g += i13;
        this.i0 += i13;
        int i14 = this.j0 + i13;
        this.j0 = i14;
        gVar.i = Math.max(i14, gVar.i);
        int i15 = this.J;
        if (i15 <= 0 || (i12 = this.i0) < i15 || i12 <= 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.h0;
        int i16 = this.i0;
        of.b bVar = this.K;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new i0(bVar, i16, j3));
        }
        this.i0 = 0;
        this.h0 = elapsedRealtime;
    }

    @Override // i2.f, i2.h1
    public final void c(int i10, Object obj) {
        Surface surface;
        if (i10 != 1) {
            if (i10 == 7) {
                this.V = (y) obj;
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            this.U = (Surface) obj;
            this.S = 1;
        } else {
            this.U = null;
            this.S = -1;
            obj = null;
        }
        Surface surface2 = this.T;
        of.b bVar = this.K;
        if (surface2 == obj) {
            if (obj != null) {
                x1 x1Var = this.g0;
                if (x1Var != null) {
                    bVar.r0(x1Var);
                }
                if (this.a0 != 3 || (surface = this.T) == null) {
                    return;
                }
                bVar.n0(surface);
                return;
            }
            return;
        }
        this.T = (Surface) obj;
        if (obj == null) {
            this.g0 = null;
            this.a0 = Math.min(this.a0, 1);
            return;
        }
        if (this.P != null) {
            L(this.S);
        }
        x1 x1Var2 = this.g0;
        if (x1Var2 != null) {
            bVar.r0(x1Var2);
        }
        this.a0 = Math.min(this.a0, 1);
        if (this.n == 2) {
            long j3 = this.I;
            this.c0 = j3 > 0 ? SystemClock.elapsedRealtime() + j3 : -9223372036854775807L;
        }
    }

    @Override // i2.f
    public final void e() {
        if (this.a0 == 0) {
            this.a0 = 1;
        }
    }

    @Override // i2.f
    public final boolean l() {
        return this.f0;
    }

    @Override // i2.f
    public final boolean m() {
        if (this.N != null && ((n() || this.R != null) && (this.a0 == 3 || this.S == -1))) {
            this.c0 = -9223372036854775807L;
            return true;
        }
        if (this.c0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.c0) {
            return true;
        }
        this.c0 = -9223372036854775807L;
        return false;
    }

    @Override // i2.f
    public final void o() {
        of.b bVar = this.K;
        this.N = null;
        this.g0 = null;
        this.a0 = Math.min(this.a0, 0);
        try {
            hc.b.D(this.X, null);
            this.X = null;
            I();
        } finally {
            bVar.J(this.m0);
        }
    }

    @Override // i2.f
    public final void p(boolean z10, boolean z11) {
        i2.g gVar = new i2.g();
        this.m0 = gVar;
        of.b bVar = this.K;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new j0(bVar, gVar, 0));
        }
        this.a0 = z11 ? 1 : 0;
    }

    @Override // i2.f
    public final void q(long j3, boolean z10) {
        this.e0 = false;
        this.f0 = false;
        this.a0 = Math.min(this.a0, 1);
        this.b0 = -9223372036854775807L;
        this.j0 = 0;
        if (this.P != null) {
            F();
        }
        if (z10) {
            long j10 = this.I;
            this.c0 = j10 > 0 ? SystemClock.elapsedRealtime() + j10 : -9223372036854775807L;
        } else {
            this.c0 = -9223372036854775807L;
        }
        e2.a0 a0Var = this.L;
        if (a0Var.i() > 0) {
            this.d0 = true;
        }
        a0Var.c();
    }

    @Override // i2.f
    public final void t() {
        this.i0 = 0;
        this.h0 = SystemClock.elapsedRealtime();
        this.l0 = e2.d0.Q(SystemClock.elapsedRealtime());
    }

    @Override // i2.f
    public final void u() {
        this.c0 = -9223372036854775807L;
        if (this.i0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.h0;
            int i10 = this.i0;
            of.b bVar = this.K;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new i0(bVar, i10, j3));
            }
            this.i0 = 0;
            this.h0 = elapsedRealtime;
        }
    }

    @Override // i2.f
    public final void x(long j3, long j10) {
        if (this.f0) {
            return;
        }
        if (this.N == null) {
            of.b bVar = this.c;
            bVar.F();
            this.M.clear();
            int w10 = w(bVar, this.M, 2);
            if (w10 != -5) {
                if (w10 == -4) {
                    e2.d.g(this.M.isEndOfStream());
                    this.e0 = true;
                    this.f0 = true;
                    return;
                }
                return;
            }
            H(bVar);
        }
        G();
        if (this.P != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (D(j3)) {
                }
                while (E()) {
                }
                Trace.endSection();
                synchronized (this.m0) {
                }
            } catch (h2.f e) {
                e2.a.f("DecoderVideoRenderer", "Video codec error", e);
                of.b bVar2 = this.K;
                Handler handler = (Handler) bVar2.b;
                if (handler != null) {
                    handler.post(new a1.e(3, bVar2, e));
                }
                throw d(e, this.N, false, 4003);
            }
        }
    }

    @Override // i2.f
    public final void v(b2.s[] sVarArr, long j3, long j10, u2.g0 g0Var) {
    }
}
