package d3;

import a8.ia;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import bi.a4;
import bi.h4;
import e2.x1;
import h2.m0;
import org.telegram.ui.Cells.f1;
import x2.b1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class a extends l2.b {
    public final long I;
    public final int J;
    public final wf.b K;
    public final h2.j0 L;
    public final k2.h M;
    public e2.u N;
    public e2.u O;
    public k2.e P;
    public k2.h Q;
    public VideoDecoderOutputBuffer R;
    public int S;
    public Surface T;
    public Surface U;
    public w V;
    public q2.g W;
    public q2.g X;
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
    public l2.d m0;

    public a(long j3, Handler handler, h0 h0Var, int i7) {
        super(2);
        this.I = j3;
        this.J = i7;
        this.c0 = -9223372036854775807L;
        this.L = new h2.j0();
        this.M = new k2.h(0, 0);
        this.K = new wf.b(handler, h0Var);
        this.Y = 0;
        this.S = -1;
        this.a0 = 0;
        this.m0 = new l2.d();
    }

    public abstract k2.e F(e2.u uVar);

    public final boolean G(long j3) {
        boolean z9;
        boolean z10;
        long j10;
        boolean z11;
        if (this.R == null) {
            k2.e eVar = this.P;
            eVar.getClass();
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) ((k2.l) eVar).c();
            this.R = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return false;
            }
            l2.d dVar = this.m0;
            int i7 = dVar.f;
            int i10 = videoDecoderOutputBuffer.skippedOutputBufferCount;
            dVar.f = i7 + i10;
            this.k0 -= i10;
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
            this.b0 = j3;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.R;
        videoDecoderOutputBuffer2.getClass();
        long j11 = videoDecoderOutputBuffer2.timeUs;
        long j12 = j11 - j3;
        if (this.S != -1) {
            h2.j0 j0Var = this.L;
            e2.u uVar = (e2.u) j0Var.j(j11);
            if (uVar != null) {
                this.O = uVar;
            } else if (this.O == null) {
                this.O = (e2.u) j0Var.i();
            }
            long j13 = j11 - this.w;
            boolean z12 = this.n == 2;
            int i11 = this.a0;
            if (i11 != 0) {
                if (i11 != 1) {
                    j10 = -30000;
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    long S = m0.S(SystemClock.elapsedRealtime()) - this.l0;
                    if (!z12 || j12 >= -30000 || S <= 100000) {
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
                e2.u uVar2 = this.O;
                uVar2.getClass();
                M(videoDecoderOutputBuffer2, j13, uVar2);
            } else {
                if (!(this.n == 2) || j3 == this.b0) {
                    z9 = false;
                } else {
                    if (j12 < -500000) {
                        int B = B(j3);
                        if (B == 0) {
                            z11 = false;
                        } else {
                            this.m0.j++;
                            P(B, this.k0);
                            I();
                            z11 = true;
                        }
                        if (z11) {
                            z10 = false;
                        }
                    }
                    if (j12 < j10) {
                        P(0, 1);
                        videoDecoderOutputBuffer2.release();
                    } else {
                        z9 = false;
                        if (j12 < 30000) {
                            e2.u uVar3 = this.O;
                            uVar3.getClass();
                            M(videoDecoderOutputBuffer2, j13, uVar3);
                        }
                    }
                }
                z10 = z9;
            }
            z10 = true;
        } else {
            z9 = false;
            if (j12 < -30000) {
                this.m0.f++;
                videoDecoderOutputBuffer2.release();
                z10 = true;
            }
            z10 = z9;
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
    public final boolean H() {
        k2.e eVar = this.P;
        if (eVar != null && this.Y != 2 && !this.e0) {
            if (this.Q == null) {
                k2.h hVar = (k2.h) ((k2.l) eVar).d();
                this.Q = hVar;
            }
            k2.h hVar2 = this.Q;
            hVar2.getClass();
            if (this.Y == 1) {
                hVar2.setFlags(4);
                k2.e eVar2 = this.P;
                eVar2.getClass();
                ((k2.l) eVar2).e(hVar2);
                this.Q = null;
                this.Y = 2;
                return false;
            }
            wf.b bVar = this.c;
            bVar.A();
            int w10 = w(bVar, hVar2, 0);
            if (w10 == -5) {
                K(bVar);
                return true;
            }
            if (w10 == -4) {
                if (hVar2.isEndOfStream()) {
                    this.e0 = true;
                    k2.e eVar3 = this.P;
                    eVar3.getClass();
                    ((k2.l) eVar3).e(hVar2);
                    this.Q = null;
                    return false;
                }
                if (this.d0) {
                    long j3 = hVar2.e;
                    e2.u uVar = this.N;
                    uVar.getClass();
                    this.L.a(uVar, j3);
                    this.d0 = false;
                }
                hVar2.c();
                hVar2.a = this.N;
                k2.e eVar4 = this.P;
                eVar4.getClass();
                ((k2.l) eVar4).e(hVar2);
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
        k2.e eVar = this.P;
        eVar.getClass();
        k2.l lVar = (k2.l) eVar;
        lVar.flush();
        lVar.a(this.x);
        this.Z = false;
    }

    public final void J() {
        wf.b bVar = this.K;
        if (this.P != null) {
            return;
        }
        q2.g gVar = this.X;
        f1.B(this.W, gVar);
        this.W = gVar;
        if (gVar != null && gVar.h() == null && this.W.g() == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            e2.u uVar = this.N;
            uVar.getClass();
            k2.e F = F(uVar);
            this.P = F;
            ((k2.l) F).a(this.x);
            O(this.S);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            k2.e eVar = this.P;
            eVar.getClass();
            String name = eVar.getName();
            long j3 = elapsedRealtime2 - elapsedRealtime;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new h4(bVar, name, elapsedRealtime2, j3, 1));
            }
            this.m0.a++;
        } catch (OutOfMemoryError e10) {
            throw d(e10, this.N, false, 4001);
        } catch (k2.f e11) {
            h2.a.d("DecoderVideoRenderer", "Video codec error", e11);
            Handler handler2 = (Handler) bVar.b;
            if (handler2 != null) {
                handler2.post(new a4(25, bVar, e11));
            }
            throw d(e11, this.N, false, 4001);
        }
    }

    public final void K(wf.b bVar) {
        l2.e eVar;
        this.d0 = true;
        e2.u uVar = (e2.u) bVar.c;
        uVar.getClass();
        q2.g gVar = (q2.g) bVar.b;
        f1.B(this.X, gVar);
        this.X = gVar;
        e2.u uVar2 = this.N;
        this.N = uVar;
        k2.e eVar2 = this.P;
        wf.b bVar2 = this.K;
        if (eVar2 == null) {
            J();
            e2.u uVar3 = this.N;
            uVar3.getClass();
            Handler handler = (Handler) bVar2.b;
            if (handler != null) {
                handler.post(new aa.s(bVar2, uVar3, (Object) null, 21));
                return;
            }
            return;
        }
        if (gVar != this.W) {
            String name = eVar2.getName();
            uVar2.getClass();
            eVar = new l2.e(name, uVar2, uVar, 0, 128);
        } else {
            String name2 = eVar2.getName();
            uVar2.getClass();
            eVar = new l2.e(name2, uVar2, uVar, 0, 8);
        }
        if (eVar.d == 0) {
            if (this.Z) {
                this.Y = 1;
            } else {
                L();
                J();
            }
        }
        e2.u uVar4 = this.N;
        uVar4.getClass();
        Handler handler2 = (Handler) bVar2.b;
        if (handler2 != null) {
            handler2.post(new aa.s(bVar2, uVar4, eVar, 21));
        }
    }

    public final void L() {
        this.Q = null;
        this.R = null;
        this.Y = 0;
        this.Z = false;
        this.k0 = 0;
        k2.e eVar = this.P;
        if (eVar != null) {
            this.m0.b++;
            eVar.release();
            String name = this.P.getName();
            wf.b bVar = this.K;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new a4(26, bVar, name));
            }
            this.P = null;
        }
        f1.B(this.W, null);
        this.W = null;
    }

    public final void M(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j3, e2.u uVar) {
        w wVar = this.V;
        if (wVar != null) {
            this.h.getClass();
            wVar.b(j3, System.nanoTime(), uVar, null);
        }
        this.l0 = m0.S(SystemClock.elapsedRealtime());
        if (videoDecoderOutputBuffer.mode != 1 || this.U == null) {
            P(0, 1);
            videoDecoderOutputBuffer.release();
            return;
        }
        int i7 = videoDecoderOutputBuffer.width;
        int i10 = videoDecoderOutputBuffer.height;
        x1 x1Var = this.g0;
        wf.b bVar = this.K;
        if (x1Var == null || x1Var.a != i7 || x1Var.b != i10) {
            x1 x1Var2 = new x1(i7, i10);
            this.g0 = x1Var2;
            bVar.m0(x1Var2);
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
                bVar.g0(surface2);
            }
        }
    }

    public abstract void N(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    public abstract void O(int i7);

    public final void P(int i7, int i10) {
        int i11;
        l2.d dVar = this.m0;
        dVar.h += i7;
        int i12 = i7 + i10;
        dVar.g += i12;
        this.i0 += i12;
        int i13 = this.j0 + i12;
        this.j0 = i13;
        dVar.i = Math.max(i13, dVar.i);
        int i14 = this.J;
        if (i14 <= 0 || (i11 = this.i0) < i14 || i11 <= 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.h0;
        int i15 = this.i0;
        wf.b bVar = this.K;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new f0(bVar, i15, j3));
        }
        this.i0 = 0;
        this.h0 = elapsedRealtime;
    }

    @Override // l2.b, l2.m1
    public final void c(int i7, Object obj) {
        Surface surface;
        if (i7 != 1) {
            if (i7 == 7) {
                this.V = (w) obj;
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
        wf.b bVar = this.K;
        if (surface2 == obj) {
            if (obj != null) {
                x1 x1Var = this.g0;
                if (x1Var != null) {
                    bVar.m0(x1Var);
                }
                if (this.a0 != 3 || (surface = this.T) == null) {
                    return;
                }
                bVar.g0(surface);
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
        x1 x1Var2 = this.g0;
        if (x1Var2 != null) {
            bVar.m0(x1Var2);
        }
        this.a0 = Math.min(this.a0, 1);
        if (this.n == 2) {
            long j3 = this.I;
            this.c0 = j3 > 0 ? SystemClock.elapsedRealtime() + j3 : -9223372036854775807L;
        }
    }

    @Override // l2.b
    public final void f() {
        if (this.a0 == 0) {
            this.a0 = 1;
        }
    }

    @Override // l2.b
    public final boolean l() {
        return this.f0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if ((r9.S != -1) == false) goto L18;
     */
    @Override // l2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m() {
        boolean f10;
        if (this.N != null) {
            if (k()) {
                f10 = this.D;
            } else {
                b1 b1Var = this.r;
                b1Var.getClass();
                f10 = b1Var.f();
            }
            if (f10 || this.R != null) {
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

    @Override // l2.b
    public final void n() {
        wf.b bVar = this.K;
        this.N = null;
        this.g0 = null;
        this.a0 = Math.min(this.a0, 0);
        try {
            f1.B(this.X, null);
            this.X = null;
            L();
        } finally {
            bVar.F(this.m0);
        }
    }

    @Override // l2.b
    public final void o(boolean z9, boolean z10) {
        l2.d dVar = new l2.d();
        this.m0 = dVar;
        wf.b bVar = this.K;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new g0(bVar, dVar, 0));
        }
        this.a0 = z10 ? 1 : 0;
    }

    @Override // l2.b
    public final void p(long j3, boolean z9, boolean z10) {
        this.e0 = false;
        this.f0 = false;
        this.a0 = Math.min(this.a0, 1);
        this.b0 = -9223372036854775807L;
        this.j0 = 0;
        if (this.P != null) {
            I();
        }
        if (z9) {
            long j10 = this.I;
            this.c0 = j10 > 0 ? SystemClock.elapsedRealtime() + j10 : -9223372036854775807L;
        } else {
            this.c0 = -9223372036854775807L;
        }
        h2.j0 j0Var = this.L;
        if (j0Var.p() > 0) {
            this.d0 = true;
        }
        j0Var.c();
    }

    @Override // l2.b
    public final void s() {
        this.i0 = 0;
        this.h0 = SystemClock.elapsedRealtime();
        this.l0 = m0.S(SystemClock.elapsedRealtime());
    }

    @Override // l2.b
    public final void t() {
        this.c0 = -9223372036854775807L;
        if (this.i0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.h0;
            int i7 = this.i0;
            wf.b bVar = this.K;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new f0(bVar, i7, j3));
            }
            this.i0 = 0;
            this.h0 = elapsedRealtime;
        }
    }

    @Override // l2.b
    public final void x(long j3, long j10) {
        if (this.f0) {
            return;
        }
        if (this.N == null) {
            wf.b bVar = this.c;
            bVar.A();
            this.M.clear();
            int w10 = w(bVar, this.M, 2);
            if (w10 != -5) {
                if (w10 == -4) {
                    ia.p(this.M.isEndOfStream());
                    this.e0 = true;
                    this.f0 = true;
                    return;
                }
                return;
            }
            K(bVar);
        }
        J();
        if (this.P != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (G(j3)) {
                }
                while (H()) {
                }
                Trace.endSection();
                synchronized (this.m0) {
                }
            } catch (k2.f e10) {
                h2.a.d("DecoderVideoRenderer", "Video codec error", e10);
                wf.b bVar2 = this.K;
                Handler handler = (Handler) bVar2.b;
                if (handler != null) {
                    handler.post(new a4(25, bVar2, e10));
                }
                throw d(e10, this.N, false, 4003);
            }
        }
    }

    @Override // l2.b
    public final void u(e2.u[] uVarArr, long j3, long j10, x2.f0 f0Var) {
    }
}
