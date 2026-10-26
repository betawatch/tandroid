package a3;

import a8.yb;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import b2.b2;
import u2.d1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class a extends i2.b {
    public final long I;
    public final int J;
    public final n4.s K;
    public final e2.j0 L;
    public final h2.h M;
    public b2.x N;
    public b2.x O;
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
    public b2 g0;
    public long h0;
    public int i0;
    public int j0;
    public int k0;
    public long l0;
    public i2.e m0;

    public a(long j10, Handler handler, m0 m0Var, int i10) {
        super(2);
        this.I = j10;
        this.J = i10;
        this.c0 = -9223372036854775807L;
        this.L = new e2.j0();
        this.M = new h2.h(0, 0);
        this.K = new n4.s(handler, m0Var);
        this.Y = 0;
        this.S = -1;
        this.a0 = 0;
        this.m0 = new i2.e();
    }

    public abstract h2.e F(b2.x xVar);

    public final boolean G(long j10) {
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        if (this.R == null) {
            h2.e eVar = this.P;
            eVar.getClass();
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) ((h2.l) eVar).c();
            this.R = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return false;
            }
            i2.e eVar2 = this.m0;
            int i10 = eVar2.f;
            int i11 = videoDecoderOutputBuffer.skippedOutputBufferCount;
            eVar2.f = i10 + i11;
            this.k0 -= i11;
        }
        if (this.R.isEndOfStream()) {
            if (this.Y == 2) {
                L();
                J();
                return false;
            }
            this.R.release();
            this.R = null;
            this.f0 = true;
            return false;
        }
        if (this.b0 == -9223372036854775807L) {
            this.b0 = j10;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.R;
        videoDecoderOutputBuffer2.getClass();
        long j12 = videoDecoderOutputBuffer2.timeUs;
        long j13 = j12 - j10;
        if (this.S != -1) {
            e2.j0 j0Var = this.L;
            b2.x xVar = (b2.x) j0Var.g(j12);
            if (xVar != null) {
                this.O = xVar;
            } else if (this.O == null) {
                this.O = (b2.x) j0Var.f();
            }
            long j14 = j12 - this.v;
            boolean z13 = this.n == 2;
            int i12 = this.a0;
            if (i12 != 0) {
                if (i12 != 1) {
                    j11 = -30000;
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    long S = e2.n0.S(SystemClock.elapsedRealtime()) - this.l0;
                    if (!z13 || j13 >= -30000 || S <= 100000) {
                        z13 = false;
                    }
                } else {
                    j11 = -30000;
                }
                z13 = true;
            } else {
                j11 = -30000;
            }
            if (z13) {
                b2.x xVar2 = this.O;
                xVar2.getClass();
                M(videoDecoderOutputBuffer2, j14, xVar2);
            } else {
                if (!(this.n == 2) || j10 == this.b0) {
                    z10 = false;
                } else {
                    if (j13 < -500000) {
                        int B = B(j10);
                        if (B == 0) {
                            z12 = false;
                        } else {
                            this.m0.j++;
                            P(B, this.k0);
                            I();
                            z12 = true;
                        }
                        if (z12) {
                            z11 = false;
                        }
                    }
                    if (j13 < j11) {
                        P(0, 1);
                        videoDecoderOutputBuffer2.release();
                    } else {
                        z10 = false;
                        if (j13 < 30000) {
                            b2.x xVar3 = this.O;
                            xVar3.getClass();
                            M(videoDecoderOutputBuffer2, j14, xVar3);
                        }
                    }
                }
                z11 = z10;
            }
            z11 = true;
        } else {
            z10 = false;
            if (j13 < -30000) {
                this.m0.f++;
                videoDecoderOutputBuffer2.release();
                z11 = true;
            }
            z11 = z10;
        }
        if (z11) {
            this.R.getClass();
            this.k0--;
            this.R = null;
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r0 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H() {
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
            n4.s sVar = this.c;
            sVar.d();
            int w10 = w(sVar, hVar2, 0);
            if (w10 == -5) {
                K(sVar);
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
                    long j10 = hVar2.e;
                    b2.x xVar = this.N;
                    xVar.getClass();
                    this.L.a(xVar, j10);
                    this.d0 = false;
                }
                hVar2.d();
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

    public final void I() {
        this.k0 = 0;
        if (this.Y != 0) {
            L();
            J();
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

    public final void J() {
        n4.s sVar = this.K;
        if (this.P != null) {
            return;
        }
        n2.g gVar = this.X;
        ic.a.B(this.W, gVar);
        this.W = gVar;
        if (gVar != null && gVar.h() == null && this.W.g() == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            b2.x xVar = this.N;
            xVar.getClass();
            h2.e F = F(xVar);
            this.P = F;
            ((h2.l) F).a(this.w);
            O(this.S);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            h2.e eVar = this.P;
            eVar.getClass();
            String name = eVar.getName();
            long j10 = elapsedRealtime2 - elapsedRealtime;
            Handler handler = (Handler) sVar.b;
            if (handler != null) {
                handler.post(new h0(sVar, name, elapsedRealtime2, j10, 0));
            }
            this.m0.a++;
        } catch (h2.f e) {
            e2.a.d("DecoderVideoRenderer", "Video codec error", e);
            Handler handler2 = (Handler) sVar.b;
            if (handler2 != null) {
                handler2.post(new a1.f(5, sVar, e));
            }
            throw d(e, this.N, false, 4001);
        } catch (OutOfMemoryError e10) {
            throw d(e10, this.N, false, 4001);
        }
    }

    public final void K(n4.s sVar) {
        i2.f fVar;
        this.d0 = true;
        b2.x xVar = (b2.x) sVar.c;
        xVar.getClass();
        n2.g gVar = (n2.g) sVar.b;
        ic.a.B(this.X, gVar);
        this.X = gVar;
        b2.x xVar2 = this.N;
        this.N = xVar;
        h2.e eVar = this.P;
        n4.s sVar2 = this.K;
        if (eVar == null) {
            J();
            b2.x xVar3 = this.N;
            xVar3.getClass();
            Handler handler = (Handler) sVar2.b;
            if (handler != null) {
                handler.post(new l0(sVar2, xVar3, null, 0));
                return;
            }
            return;
        }
        if (gVar != this.W) {
            String name = eVar.getName();
            xVar2.getClass();
            fVar = new i2.f(name, xVar2, xVar, 0, 128);
        } else {
            String name2 = eVar.getName();
            xVar2.getClass();
            fVar = new i2.f(name2, xVar2, xVar, 0, 8);
        }
        if (fVar.d == 0) {
            if (this.Z) {
                this.Y = 1;
            } else {
                L();
                J();
            }
        }
        b2.x xVar4 = this.N;
        xVar4.getClass();
        Handler handler2 = (Handler) sVar2.b;
        if (handler2 != null) {
            handler2.post(new l0(sVar2, xVar4, fVar, 0));
        }
    }

    public final void L() {
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
            n4.s sVar = this.K;
            Handler handler = (Handler) sVar.b;
            if (handler != null) {
                handler.post(new a1.f(6, sVar, name));
            }
            this.P = null;
        }
        ic.a.B(this.W, null);
        this.W = null;
    }

    public final void M(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j10, b2.x xVar) {
        y yVar = this.V;
        if (yVar != null) {
            this.h.getClass();
            yVar.a(j10, System.nanoTime(), xVar, null);
        }
        this.l0 = e2.n0.S(SystemClock.elapsedRealtime());
        if (videoDecoderOutputBuffer.mode != 1 || this.U == null) {
            P(0, 1);
            videoDecoderOutputBuffer.release();
            return;
        }
        int i10 = videoDecoderOutputBuffer.width;
        int i11 = videoDecoderOutputBuffer.height;
        b2 b2Var = this.g0;
        n4.s sVar = this.K;
        if (b2Var == null || b2Var.a != i10 || b2Var.b != i11) {
            b2 b2Var2 = new b2(i10, i11);
            this.g0 = b2Var2;
            sVar.J(b2Var2);
        }
        Surface surface = this.U;
        surface.getClass();
        N(videoDecoderOutputBuffer, surface);
        this.j0 = 0;
        this.m0.e++;
        if (this.a0 != 3) {
            this.a0 = 3;
            Surface surface2 = this.T;
            if (surface2 != null) {
                sVar.E(surface2);
            }
        }
    }

    public abstract void N(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    public abstract void O(int i10);

    public final void P(int i10, int i11) {
        int i12;
        i2.e eVar = this.m0;
        eVar.h += i10;
        int i13 = i10 + i11;
        eVar.g += i13;
        this.i0 += i13;
        int i14 = this.j0 + i13;
        this.j0 = i14;
        eVar.i = Math.max(i14, eVar.i);
        int i15 = this.J;
        if (i15 <= 0 || (i12 = this.i0) < i15 || i12 <= 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.h0;
        int i16 = this.i0;
        n4.s sVar = this.K;
        Handler handler = (Handler) sVar.b;
        if (handler != null) {
            handler.post(new j0(sVar, i16, j10));
        }
        this.i0 = 0;
        this.h0 = elapsedRealtime;
    }

    @Override // i2.b, i2.m1
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
        n4.s sVar = this.K;
        if (surface2 == obj) {
            if (obj != null) {
                b2 b2Var = this.g0;
                if (b2Var != null) {
                    sVar.J(b2Var);
                }
                if (this.a0 != 3 || (surface = this.T) == null) {
                    return;
                }
                sVar.E(surface);
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
            O(this.S);
        }
        b2 b2Var2 = this.g0;
        if (b2Var2 != null) {
            sVar.J(b2Var2);
        }
        this.a0 = Math.min(this.a0, 1);
        if (this.n == 2) {
            long j10 = this.I;
            this.c0 = j10 > 0 ? SystemClock.elapsedRealtime() + j10 : -9223372036854775807L;
        }
    }

    @Override // i2.b
    public final void e() {
        if (this.a0 == 0) {
            this.a0 = 1;
        }
    }

    @Override // i2.b
    public final boolean l() {
        return this.f0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if ((r9.S != -1) == false) goto L18;
     */
    @Override // i2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m() {
        boolean e;
        if (this.N != null) {
            if (k()) {
                e = this.y;
            } else {
                d1 d1Var = this.r;
                d1Var.getClass();
                e = d1Var.e();
            }
            if (e || this.R != null) {
                if (this.a0 != 3) {
                }
                this.c0 = -9223372036854775807L;
                return true;
            }
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

    @Override // i2.b
    public final void n() {
        n4.s sVar = this.K;
        this.N = null;
        this.g0 = null;
        this.a0 = Math.min(this.a0, 0);
        try {
            ic.a.B(this.X, null);
            this.X = null;
            L();
        } finally {
            sVar.g(this.m0);
        }
    }

    @Override // i2.b
    public final void o(boolean z10, boolean z11) {
        i2.e eVar = new i2.e();
        this.m0 = eVar;
        n4.s sVar = this.K;
        Handler handler = (Handler) sVar.b;
        if (handler != null) {
            handler.post(new k0(sVar, eVar, 0));
        }
        this.a0 = z11 ? 1 : 0;
    }

    @Override // i2.b
    public final void p(long j10, boolean z10, boolean z11) {
        this.e0 = false;
        this.f0 = false;
        this.a0 = Math.min(this.a0, 1);
        this.b0 = -9223372036854775807L;
        this.j0 = 0;
        if (this.P != null) {
            I();
        }
        if (z10) {
            long j11 = this.I;
            this.c0 = j11 > 0 ? SystemClock.elapsedRealtime() + j11 : -9223372036854775807L;
        } else {
            this.c0 = -9223372036854775807L;
        }
        e2.j0 j0Var = this.L;
        if (j0Var.j() > 0) {
            this.d0 = true;
        }
        j0Var.c();
    }

    @Override // i2.b
    public final void s() {
        this.i0 = 0;
        this.h0 = SystemClock.elapsedRealtime();
        this.l0 = e2.n0.S(SystemClock.elapsedRealtime());
    }

    @Override // i2.b
    public final void t() {
        this.c0 = -9223372036854775807L;
        if (this.i0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.h0;
            int i10 = this.i0;
            n4.s sVar = this.K;
            Handler handler = (Handler) sVar.b;
            if (handler != null) {
                handler.post(new j0(sVar, i10, j10));
            }
            this.i0 = 0;
            this.h0 = elapsedRealtime;
        }
    }

    @Override // i2.b
    public final void x(long j10, long j11) {
        if (this.f0) {
            return;
        }
        if (this.N == null) {
            n4.s sVar = this.c;
            sVar.d();
            this.M.clear();
            int w10 = w(sVar, this.M, 2);
            if (w10 != -5) {
                if (w10 == -4) {
                    yb.p(this.M.isEndOfStream());
                    this.e0 = true;
                    this.f0 = true;
                    return;
                }
                return;
            }
            K(sVar);
        }
        J();
        if (this.P != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (G(j10)) {
                }
                while (H()) {
                }
                Trace.endSection();
                synchronized (this.m0) {
                }
            } catch (h2.f e) {
                e2.a.d("DecoderVideoRenderer", "Video codec error", e);
                n4.s sVar2 = this.K;
                Handler handler = (Handler) sVar2.b;
                if (handler != null) {
                    handler.post(new a1.f(5, sVar2, e));
                }
                throw d(e, this.N, false, 4003);
            }
        }
    }

    @Override // i2.b
    public final void u(b2.x[] xVarArr, long j10, long j11, u2.g0 g0Var) {
    }
}
