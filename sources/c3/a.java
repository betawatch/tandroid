package c3;

import ai.k3;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import b8.zb;
import d2.a2;
import g2.n0;
import org.telegram.ui.Cells.f1;
import w2.d1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a extends k2.b {
    public final long J;
    public final int K;
    public final tf.b L;
    public final g2.k0 M;
    public final j2.h N;
    public d2.v O;
    public d2.v P;
    public j2.e Q;
    public j2.h R;
    public VideoDecoderOutputBuffer S;
    public int T;
    public Surface U;
    public Surface V;
    public w W;
    public p2.g X;
    public p2.g Y;
    public int Z;
    public boolean a0;
    public int b0;
    public long c0;
    public long d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public a2 h0;
    public long i0;
    public int j0;
    public int k0;
    public int l0;
    public long m0;
    public k2.d n0;

    public a(long j10, Handler handler, i0 i0Var, int i3) {
        super(2);
        this.J = j10;
        this.K = i3;
        this.d0 = -9223372036854775807L;
        this.M = new g2.k0();
        this.N = new j2.h(0, 0);
        this.L = new tf.b(handler, i0Var);
        this.Z = 0;
        this.T = -1;
        this.b0 = 0;
        this.n0 = new k2.d();
    }

    public abstract j2.e F(d2.v vVar);

    public final boolean G(long j10) {
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        if (this.S == null) {
            j2.e eVar = this.Q;
            eVar.getClass();
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) ((j2.l) eVar).c();
            this.S = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return false;
            }
            k2.d dVar = this.n0;
            int i3 = dVar.f;
            int i10 = videoDecoderOutputBuffer.skippedOutputBufferCount;
            dVar.f = i3 + i10;
            this.l0 -= i10;
        }
        if (this.S.isEndOfStream()) {
            if (this.Z == 2) {
                L();
                J();
                return false;
            }
            this.S.release();
            this.S = null;
            this.g0 = true;
            return false;
        }
        if (this.c0 == -9223372036854775807L) {
            this.c0 = j10;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.S;
        videoDecoderOutputBuffer2.getClass();
        long j12 = videoDecoderOutputBuffer2.timeUs;
        long j13 = j12 - j10;
        if (this.T != -1) {
            g2.k0 k0Var = this.M;
            d2.v vVar = (d2.v) k0Var.j(j12);
            if (vVar != null) {
                this.P = vVar;
            } else if (this.P == null) {
                this.P = (d2.v) k0Var.i();
            }
            long j14 = j12 - this.w;
            boolean z13 = this.n == 2;
            int i11 = this.b0;
            if (i11 != 0) {
                if (i11 != 1) {
                    j11 = -30000;
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    long S = n0.S(SystemClock.elapsedRealtime()) - this.m0;
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
                d2.v vVar2 = this.P;
                vVar2.getClass();
                M(videoDecoderOutputBuffer2, j14, vVar2);
            } else {
                if (!(this.n == 2) || j10 == this.c0) {
                    z10 = false;
                } else {
                    if (j13 < -500000) {
                        int B = B(j10);
                        if (B == 0) {
                            z12 = false;
                        } else {
                            this.n0.j++;
                            P(B, this.l0);
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
                            d2.v vVar3 = this.P;
                            vVar3.getClass();
                            M(videoDecoderOutputBuffer2, j14, vVar3);
                        }
                    }
                }
                z11 = z10;
            }
            z11 = true;
        } else {
            z10 = false;
            if (j13 < -30000) {
                this.n0.f++;
                videoDecoderOutputBuffer2.release();
                z11 = true;
            }
            z11 = z10;
        }
        if (z11) {
            this.S.getClass();
            this.l0--;
            this.S = null;
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
        j2.e eVar = this.Q;
        if (eVar != null && this.Z != 2 && !this.f0) {
            if (this.R == null) {
                j2.h hVar = (j2.h) ((j2.l) eVar).d();
                this.R = hVar;
            }
            j2.h hVar2 = this.R;
            hVar2.getClass();
            if (this.Z == 1) {
                hVar2.setFlags(4);
                j2.e eVar2 = this.Q;
                eVar2.getClass();
                ((j2.l) eVar2).e(hVar2);
                this.R = null;
                this.Z = 2;
                return false;
            }
            tf.b bVar = this.c;
            bVar.q();
            int w10 = w(bVar, hVar2, 0);
            if (w10 == -5) {
                K(bVar);
                return true;
            }
            if (w10 == -4) {
                if (hVar2.isEndOfStream()) {
                    this.f0 = true;
                    j2.e eVar3 = this.Q;
                    eVar3.getClass();
                    ((j2.l) eVar3).e(hVar2);
                    this.R = null;
                    return false;
                }
                if (this.e0) {
                    long j10 = hVar2.e;
                    d2.v vVar = this.O;
                    vVar.getClass();
                    this.M.a(vVar, j10);
                    this.e0 = false;
                }
                hVar2.c();
                hVar2.a = this.O;
                j2.e eVar4 = this.Q;
                eVar4.getClass();
                ((j2.l) eVar4).e(hVar2);
                this.l0++;
                this.a0 = true;
                this.n0.c++;
                this.R = null;
                return true;
            }
            if (w10 != -3) {
                throw new IllegalStateException();
            }
        }
        return false;
    }

    public final void I() {
        this.l0 = 0;
        if (this.Z != 0) {
            L();
            J();
            return;
        }
        this.R = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.S;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.S = null;
        }
        j2.e eVar = this.Q;
        eVar.getClass();
        j2.l lVar = (j2.l) eVar;
        lVar.flush();
        lVar.a(this.x);
        this.a0 = false;
    }

    public final void J() {
        tf.b bVar = this.L;
        if (this.Q != null) {
            return;
        }
        p2.g gVar = this.Y;
        f1.E(this.X, gVar);
        this.X = gVar;
        if (gVar != null && gVar.h() == null && this.X.g() == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            d2.v vVar = this.O;
            vVar.getClass();
            j2.e F = F(vVar);
            this.Q = F;
            ((j2.l) F).a(this.x);
            O(this.T);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            j2.e eVar = this.Q;
            eVar.getClass();
            String name = eVar.getName();
            long j10 = elapsedRealtime2 - elapsedRealtime;
            Handler handler = (Handler) bVar.a;
            if (handler != null) {
                handler.post(new f0(bVar, name, elapsedRealtime2, j10, 0));
            }
            this.n0.a++;
        } catch (j2.f e10) {
            g2.a.d("DecoderVideoRenderer", "Video codec error", e10);
            Handler handler2 = (Handler) bVar.a;
            if (handler2 != null) {
                handler2.post(new a1.f(28, bVar, e10));
            }
            throw e(e10, this.O, false, 4001);
        } catch (OutOfMemoryError e11) {
            throw e(e11, this.O, false, 4001);
        }
    }

    public final void K(tf.b bVar) {
        k2.e eVar;
        this.e0 = true;
        d2.v vVar = (d2.v) bVar.b;
        vVar.getClass();
        p2.g gVar = (p2.g) bVar.a;
        f1.E(this.Y, gVar);
        this.Y = gVar;
        d2.v vVar2 = this.O;
        this.O = vVar;
        j2.e eVar2 = this.Q;
        tf.b bVar2 = this.L;
        if (eVar2 == null) {
            J();
            d2.v vVar3 = this.O;
            vVar3.getClass();
            Handler handler = (Handler) bVar2.a;
            if (handler != null) {
                handler.post(new k3(bVar2, vVar3, (Object) null, 9));
                return;
            }
            return;
        }
        if (gVar != this.X) {
            String name = eVar2.getName();
            vVar2.getClass();
            eVar = new k2.e(name, vVar2, vVar, 0, 128);
        } else {
            String name2 = eVar2.getName();
            vVar2.getClass();
            eVar = new k2.e(name2, vVar2, vVar, 0, 8);
        }
        if (eVar.d == 0) {
            if (this.a0) {
                this.Z = 1;
            } else {
                L();
                J();
            }
        }
        d2.v vVar4 = this.O;
        vVar4.getClass();
        Handler handler2 = (Handler) bVar2.a;
        if (handler2 != null) {
            handler2.post(new k3(bVar2, vVar4, eVar, 9));
        }
    }

    public final void L() {
        this.R = null;
        this.S = null;
        this.Z = 0;
        this.a0 = false;
        this.l0 = 0;
        j2.e eVar = this.Q;
        if (eVar != null) {
            this.n0.b++;
            eVar.release();
            String name = this.Q.getName();
            tf.b bVar = this.L;
            Handler handler = (Handler) bVar.a;
            if (handler != null) {
                handler.post(new a1.f(29, bVar, name));
            }
            this.Q = null;
        }
        f1.E(this.X, null);
        this.X = null;
    }

    public final void M(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j10, d2.v vVar) {
        w wVar = this.W;
        if (wVar != null) {
            this.h.getClass();
            wVar.a(j10, System.nanoTime(), vVar, null);
        }
        this.m0 = n0.S(SystemClock.elapsedRealtime());
        if (videoDecoderOutputBuffer.mode != 1 || this.V == null) {
            P(0, 1);
            videoDecoderOutputBuffer.release();
            return;
        }
        int i3 = videoDecoderOutputBuffer.width;
        int i10 = videoDecoderOutputBuffer.height;
        a2 a2Var = this.h0;
        tf.b bVar = this.L;
        if (a2Var == null || a2Var.a != i3 || a2Var.b != i10) {
            a2 a2Var2 = new a2(i3, i10);
            this.h0 = a2Var2;
            bVar.E(a2Var2);
        }
        Surface surface = this.V;
        surface.getClass();
        N(videoDecoderOutputBuffer, surface);
        this.k0 = 0;
        this.n0.e++;
        if (this.b0 != 3) {
            this.b0 = 3;
            Surface surface2 = this.U;
            if (surface2 != null) {
                bVar.y(surface2);
            }
        }
    }

    public abstract void N(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    public abstract void O(int i3);

    public final void P(int i3, int i10) {
        int i11;
        k2.d dVar = this.n0;
        dVar.h += i3;
        int i12 = i3 + i10;
        dVar.g += i12;
        this.j0 += i12;
        int i13 = this.k0 + i12;
        this.k0 = i13;
        dVar.i = Math.max(i13, dVar.i);
        int i14 = this.K;
        if (i14 <= 0 || (i11 = this.j0) < i14 || i11 <= 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.i0;
        int i15 = this.j0;
        tf.b bVar = this.L;
        Handler handler = (Handler) bVar.a;
        if (handler != null) {
            handler.post(new g0(bVar, i15, j10));
        }
        this.j0 = 0;
        this.i0 = elapsedRealtime;
    }

    @Override // k2.b, k2.l1
    public final void d(int i3, Object obj) {
        Surface surface;
        if (i3 != 1) {
            if (i3 == 7) {
                this.W = (w) obj;
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            this.V = (Surface) obj;
            this.T = 1;
        } else {
            this.V = null;
            this.T = -1;
            obj = null;
        }
        Surface surface2 = this.U;
        tf.b bVar = this.L;
        if (surface2 == obj) {
            if (obj != null) {
                a2 a2Var = this.h0;
                if (a2Var != null) {
                    bVar.E(a2Var);
                }
                if (this.b0 != 3 || (surface = this.U) == null) {
                    return;
                }
                bVar.y(surface);
                return;
            }
            return;
        }
        this.U = (Surface) obj;
        if (obj == null) {
            this.h0 = null;
            this.b0 = Math.min(this.b0, 1);
            return;
        }
        if (this.Q != null) {
            O(this.T);
        }
        a2 a2Var2 = this.h0;
        if (a2Var2 != null) {
            bVar.E(a2Var2);
        }
        this.b0 = Math.min(this.b0, 1);
        if (this.n == 2) {
            long j10 = this.J;
            this.d0 = j10 > 0 ? SystemClock.elapsedRealtime() + j10 : -9223372036854775807L;
        }
    }

    @Override // k2.b
    public final void f() {
        if (this.b0 == 0) {
            this.b0 = 1;
        }
    }

    @Override // k2.b
    public final boolean l() {
        return this.g0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if ((r9.T != -1) == false) goto L18;
     */
    @Override // k2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m() {
        boolean f10;
        if (this.O != null) {
            if (k()) {
                f10 = this.E;
            } else {
                d1 d1Var = this.r;
                d1Var.getClass();
                f10 = d1Var.f();
            }
            if (f10 || this.S != null) {
                if (this.b0 != 3) {
                }
                this.d0 = -9223372036854775807L;
                return true;
            }
        }
        if (this.d0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.d0) {
            return true;
        }
        this.d0 = -9223372036854775807L;
        return false;
    }

    @Override // k2.b
    public final void n() {
        tf.b bVar = this.L;
        this.O = null;
        this.h0 = null;
        this.b0 = Math.min(this.b0, 0);
        try {
            f1.E(this.Y, null);
            this.Y = null;
            L();
        } finally {
            bVar.s(this.n0);
        }
    }

    @Override // k2.b
    public final void o(boolean z10, boolean z11) {
        k2.d dVar = new k2.d();
        this.n0 = dVar;
        tf.b bVar = this.L;
        Handler handler = (Handler) bVar.a;
        if (handler != null) {
            handler.post(new h0(bVar, dVar, 0));
        }
        this.b0 = z11 ? 1 : 0;
    }

    @Override // k2.b
    public final void p(long j10, boolean z10, boolean z11) {
        this.f0 = false;
        this.g0 = false;
        this.b0 = Math.min(this.b0, 1);
        this.c0 = -9223372036854775807L;
        this.k0 = 0;
        if (this.Q != null) {
            I();
        }
        if (z10) {
            long j11 = this.J;
            this.d0 = j11 > 0 ? SystemClock.elapsedRealtime() + j11 : -9223372036854775807L;
        } else {
            this.d0 = -9223372036854775807L;
        }
        g2.k0 k0Var = this.M;
        if (k0Var.p() > 0) {
            this.e0 = true;
        }
        k0Var.c();
    }

    @Override // k2.b
    public final void s() {
        this.j0 = 0;
        this.i0 = SystemClock.elapsedRealtime();
        this.m0 = n0.S(SystemClock.elapsedRealtime());
    }

    @Override // k2.b
    public final void t() {
        this.d0 = -9223372036854775807L;
        if (this.j0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.i0;
            int i3 = this.j0;
            tf.b bVar = this.L;
            Handler handler = (Handler) bVar.a;
            if (handler != null) {
                handler.post(new g0(bVar, i3, j10));
            }
            this.j0 = 0;
            this.i0 = elapsedRealtime;
        }
    }

    @Override // k2.b
    public final void x(long j10, long j11) {
        if (this.g0) {
            return;
        }
        if (this.O == null) {
            tf.b bVar = this.c;
            bVar.q();
            this.N.clear();
            int w10 = w(bVar, this.N, 2);
            if (w10 != -5) {
                if (w10 == -4) {
                    zb.p(this.N.isEndOfStream());
                    this.f0 = true;
                    this.g0 = true;
                    return;
                }
                return;
            }
            K(bVar);
        }
        J();
        if (this.Q != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (G(j10)) {
                }
                while (H()) {
                }
                Trace.endSection();
                synchronized (this.n0) {
                }
            } catch (j2.f e10) {
                g2.a.d("DecoderVideoRenderer", "Video codec error", e10);
                tf.b bVar2 = this.L;
                Handler handler = (Handler) bVar2.a;
                if (handler != null) {
                    handler.post(new a1.f(28, bVar2, e10));
                }
                throw e(e10, this.O, false, 4003);
            }
        }
    }

    @Override // k2.b
    public final void u(d2.v[] vVarArr, long j10, long j11, w2.g0 g0Var) {
    }
}
