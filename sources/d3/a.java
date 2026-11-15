package d3;

import a8.ja;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import e2.x1;
import h2.l0;
import org.telegram.ui.Cells.y0;
import x2.b1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class a extends l2.b {
    public final long J;
    public final int K;
    public final wf.b L;
    public final h2.j0 M;
    public final k2.h N;
    public e2.u O;
    public e2.u P;
    public k2.e Q;
    public k2.h R;
    public VideoDecoderOutputBuffer S;
    public int T;
    public Surface U;
    public Surface V;
    public v W;
    public q2.h X;
    public q2.h Y;
    public int Z;
    public boolean a0;
    public int b0;
    public long c0;
    public long d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public x1 h0;
    public long i0;
    public int j0;
    public int k0;
    public int l0;
    public long m0;
    public l2.d n0;

    public a(long j3, Handler handler, h0 h0Var, int i7) {
        super(2);
        this.J = j3;
        this.K = i7;
        this.d0 = -9223372036854775807L;
        this.M = new h2.j0();
        this.N = new k2.h(0, 0);
        this.L = new wf.b(handler, h0Var);
        this.Z = 0;
        this.T = -1;
        this.b0 = 0;
        this.n0 = new l2.d();
    }

    public abstract k2.e F(e2.u uVar);

    public final boolean G(long j3) {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12;
        if (this.S == null) {
            k2.e eVar = this.Q;
            eVar.getClass();
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) ((k2.l) eVar).c();
            this.S = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return false;
            }
            l2.d dVar = this.n0;
            int i7 = dVar.f;
            int i10 = videoDecoderOutputBuffer.skippedOutputBufferCount;
            dVar.f = i7 + i10;
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
            this.c0 = j3;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.S;
        videoDecoderOutputBuffer2.getClass();
        long j11 = videoDecoderOutputBuffer2.timeUs;
        long j12 = j11 - j3;
        if (this.T != -1) {
            h2.j0 j0Var = this.M;
            e2.u uVar = (e2.u) j0Var.j(j11);
            if (uVar != null) {
                this.P = uVar;
            } else if (this.P == null) {
                this.P = (e2.u) j0Var.i();
            }
            long j13 = j11 - this.w;
            boolean z13 = this.n == 2;
            int i11 = this.b0;
            if (i11 != 0) {
                if (i11 != 1) {
                    j10 = -30000;
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    long S = l0.S(SystemClock.elapsedRealtime()) - this.m0;
                    if (!z13 || j12 >= -30000 || S <= 100000) {
                        z13 = false;
                    }
                } else {
                    j10 = -30000;
                }
                z13 = true;
            } else {
                j10 = -30000;
            }
            if (z13) {
                e2.u uVar2 = this.P;
                uVar2.getClass();
                M(videoDecoderOutputBuffer2, j13, uVar2);
            } else {
                if (!(this.n == 2) || j3 == this.c0) {
                    z10 = false;
                } else {
                    if (j12 < -500000) {
                        int B = B(j3);
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
                    if (j12 < j10) {
                        P(0, 1);
                        videoDecoderOutputBuffer2.release();
                    } else {
                        z10 = false;
                        if (j12 < 30000) {
                            e2.u uVar3 = this.P;
                            uVar3.getClass();
                            M(videoDecoderOutputBuffer2, j13, uVar3);
                        }
                    }
                }
                z11 = z10;
            }
            z11 = true;
        } else {
            z10 = false;
            if (j12 < -30000) {
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
        k2.e eVar = this.Q;
        if (eVar != null && this.Z != 2 && !this.f0) {
            if (this.R == null) {
                k2.h hVar = (k2.h) ((k2.l) eVar).d();
                this.R = hVar;
            }
            k2.h hVar2 = this.R;
            hVar2.getClass();
            if (this.Z == 1) {
                hVar2.setFlags(4);
                k2.e eVar2 = this.Q;
                eVar2.getClass();
                ((k2.l) eVar2).e(hVar2);
                this.R = null;
                this.Z = 2;
                return false;
            }
            k8.a aVar = this.c;
            aVar.x0();
            int w10 = w(aVar, hVar2, 0);
            if (w10 == -5) {
                K(aVar);
                return true;
            }
            if (w10 == -4) {
                if (hVar2.isEndOfStream()) {
                    this.f0 = true;
                    k2.e eVar3 = this.Q;
                    eVar3.getClass();
                    ((k2.l) eVar3).e(hVar2);
                    this.R = null;
                    return false;
                }
                if (this.e0) {
                    long j3 = hVar2.e;
                    e2.u uVar = this.O;
                    uVar.getClass();
                    this.M.a(uVar, j3);
                    this.e0 = false;
                }
                hVar2.c();
                hVar2.a = this.O;
                k2.e eVar4 = this.Q;
                eVar4.getClass();
                ((k2.l) eVar4).e(hVar2);
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
        k2.e eVar = this.Q;
        eVar.getClass();
        k2.l lVar = (k2.l) eVar;
        lVar.flush();
        lVar.a(this.x);
        this.a0 = false;
    }

    public final void J() {
        wf.b bVar = this.L;
        if (this.Q != null) {
            return;
        }
        q2.h hVar = this.Y;
        y0.C(this.X, hVar);
        this.X = hVar;
        if (hVar != null && hVar.h() == null && this.X.g() == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            e2.u uVar = this.O;
            uVar.getClass();
            k2.e F = F(uVar);
            this.Q = F;
            ((k2.l) F).a(this.x);
            O(this.T);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            k2.e eVar = this.Q;
            eVar.getClass();
            String name = eVar.getName();
            long j3 = elapsedRealtime2 - elapsedRealtime;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new e0(bVar, name, elapsedRealtime2, j3, 0));
            }
            this.n0.a++;
        } catch (OutOfMemoryError e10) {
            throw d(e10, this.O, false, 4001);
        } catch (k2.f e11) {
            h2.a.d("DecoderVideoRenderer", "Video codec error", e11);
            Handler handler2 = (Handler) bVar.b;
            if (handler2 != null) {
                handler2.post(new c1.c(23, bVar, e11));
            }
            throw d(e11, this.O, false, 4001);
        }
    }

    public final void K(k8.a aVar) {
        l2.e eVar;
        this.e0 = true;
        e2.u uVar = (e2.u) aVar.c;
        uVar.getClass();
        q2.h hVar = (q2.h) aVar.b;
        y0.C(this.Y, hVar);
        this.Y = hVar;
        e2.u uVar2 = this.O;
        this.O = uVar;
        k2.e eVar2 = this.Q;
        wf.b bVar = this.L;
        if (eVar2 == null) {
            J();
            e2.u uVar3 = this.O;
            uVar3.getClass();
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new aa.r(bVar, uVar3, (Object) null, 12));
                return;
            }
            return;
        }
        if (hVar != this.X) {
            String name = eVar2.getName();
            uVar2.getClass();
            eVar = new l2.e(name, uVar2, uVar, 0, 128);
        } else {
            String name2 = eVar2.getName();
            uVar2.getClass();
            eVar = new l2.e(name2, uVar2, uVar, 0, 8);
        }
        if (eVar.d == 0) {
            if (this.a0) {
                this.Z = 1;
            } else {
                L();
                J();
            }
        }
        e2.u uVar4 = this.O;
        uVar4.getClass();
        Handler handler2 = (Handler) bVar.b;
        if (handler2 != null) {
            handler2.post(new aa.r(bVar, uVar4, eVar, 12));
        }
    }

    public final void L() {
        this.R = null;
        this.S = null;
        this.Z = 0;
        this.a0 = false;
        this.l0 = 0;
        k2.e eVar = this.Q;
        if (eVar != null) {
            this.n0.b++;
            eVar.release();
            String name = this.Q.getName();
            wf.b bVar = this.L;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new c1.c(24, bVar, name));
            }
            this.Q = null;
        }
        y0.C(this.X, null);
        this.X = null;
    }

    public final void M(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j3, e2.u uVar) {
        v vVar = this.W;
        if (vVar != null) {
            this.h.getClass();
            vVar.a(j3, System.nanoTime(), uVar, null);
        }
        this.m0 = l0.S(SystemClock.elapsedRealtime());
        if (videoDecoderOutputBuffer.mode != 1 || this.V == null) {
            P(0, 1);
            videoDecoderOutputBuffer.release();
            return;
        }
        int i7 = videoDecoderOutputBuffer.width;
        int i10 = videoDecoderOutputBuffer.height;
        x1 x1Var = this.h0;
        wf.b bVar = this.L;
        if (x1Var == null || x1Var.a != i7 || x1Var.b != i10) {
            x1 x1Var2 = new x1(i7, i10);
            this.h0 = x1Var2;
            bVar.V(x1Var2);
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
                bVar.O(surface2);
            }
        }
    }

    public abstract void N(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    public abstract void O(int i7);

    public final void P(int i7, int i10) {
        int i11;
        l2.d dVar = this.n0;
        dVar.h += i7;
        int i12 = i7 + i10;
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
        long j3 = elapsedRealtime - this.i0;
        int i15 = this.j0;
        wf.b bVar = this.L;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new f0(bVar, i15, j3));
        }
        this.j0 = 0;
        this.i0 = elapsedRealtime;
    }

    @Override // l2.b, l2.i1
    public final void c(int i7, Object obj) {
        Surface surface;
        if (i7 != 1) {
            if (i7 == 7) {
                this.W = (v) obj;
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
        wf.b bVar = this.L;
        if (surface2 == obj) {
            if (obj != null) {
                x1 x1Var = this.h0;
                if (x1Var != null) {
                    bVar.V(x1Var);
                }
                if (this.b0 != 3 || (surface = this.U) == null) {
                    return;
                }
                bVar.O(surface);
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
        x1 x1Var2 = this.h0;
        if (x1Var2 != null) {
            bVar.V(x1Var2);
        }
        this.b0 = Math.min(this.b0, 1);
        if (this.n == 2) {
            long j3 = this.J;
            this.d0 = j3 > 0 ? SystemClock.elapsedRealtime() + j3 : -9223372036854775807L;
        }
    }

    @Override // l2.b
    public final void f() {
        if (this.b0 == 0) {
            this.b0 = 1;
        }
    }

    @Override // l2.b
    public final boolean l() {
        return this.g0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if ((r9.T != -1) == false) goto L18;
     */
    @Override // l2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m() {
        boolean f10;
        if (this.O != null) {
            if (k()) {
                f10 = this.E;
            } else {
                b1 b1Var = this.r;
                b1Var.getClass();
                f10 = b1Var.f();
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

    @Override // l2.b
    public final void n() {
        wf.b bVar = this.L;
        this.O = null;
        this.h0 = null;
        this.b0 = Math.min(this.b0, 0);
        try {
            y0.C(this.Y, null);
            this.Y = null;
            L();
        } finally {
            bVar.t(this.n0);
        }
    }

    @Override // l2.b
    public final void o(boolean z10, boolean z11) {
        l2.d dVar = new l2.d();
        this.n0 = dVar;
        wf.b bVar = this.L;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new g0(bVar, dVar, 0));
        }
        this.b0 = z11 ? 1 : 0;
    }

    @Override // l2.b
    public final void p(long j3, boolean z10, boolean z11) {
        this.f0 = false;
        this.g0 = false;
        this.b0 = Math.min(this.b0, 1);
        this.c0 = -9223372036854775807L;
        this.k0 = 0;
        if (this.Q != null) {
            I();
        }
        if (z10) {
            long j10 = this.J;
            this.d0 = j10 > 0 ? SystemClock.elapsedRealtime() + j10 : -9223372036854775807L;
        } else {
            this.d0 = -9223372036854775807L;
        }
        h2.j0 j0Var = this.M;
        if (j0Var.p() > 0) {
            this.e0 = true;
        }
        j0Var.c();
    }

    @Override // l2.b
    public final void s() {
        this.j0 = 0;
        this.i0 = SystemClock.elapsedRealtime();
        this.m0 = l0.S(SystemClock.elapsedRealtime());
    }

    @Override // l2.b
    public final void t() {
        this.d0 = -9223372036854775807L;
        if (this.j0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.i0;
            int i7 = this.j0;
            wf.b bVar = this.L;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new f0(bVar, i7, j3));
            }
            this.j0 = 0;
            this.i0 = elapsedRealtime;
        }
    }

    @Override // l2.b
    public final void x(long j3, long j10) {
        if (this.g0) {
            return;
        }
        if (this.O == null) {
            k8.a aVar = this.c;
            aVar.x0();
            this.N.clear();
            int w10 = w(aVar, this.N, 2);
            if (w10 != -5) {
                if (w10 == -4) {
                    ja.p(this.N.isEndOfStream());
                    this.f0 = true;
                    this.g0 = true;
                    return;
                }
                return;
            }
            K(aVar);
        }
        J();
        if (this.Q != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (G(j3)) {
                }
                while (H()) {
                }
                Trace.endSection();
                synchronized (this.n0) {
                }
            } catch (k2.f e10) {
                h2.a.d("DecoderVideoRenderer", "Video codec error", e10);
                wf.b bVar = this.L;
                Handler handler = (Handler) bVar.b;
                if (handler != null) {
                    handler.post(new c1.c(23, bVar, e10));
                }
                throw d(e10, this.O, false, 4003);
            }
        }
    }

    @Override // l2.b
    public final void u(e2.u[] uVarArr, long j3, long j10, x2.f0 f0Var) {
    }
}
