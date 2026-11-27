package androidx.media3.decoder.ffmpeg;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ExperimentalFfmpegVideoRenderer extends vg0 implements m93 {
    public static final int y0 = ((gcc.g(720, 64) * gcc.g(1280, 64)) * 6144) / 2;
    public final long K;
    public final int L;
    public final k7b M;
    public final jq N;
    public final ArrayDeque O;
    public final s93 P;
    public ko4 Q;
    public ko4 R;
    public y93 S;
    public n93 T;
    public s93 U;
    public long V;
    public VideoDecoderOutputBuffer W;
    public int X;
    public Object Y;
    public Surface Z;
    public sec a0;
    public jr3 b0;
    public jr3 c0;
    public byte d0;
    public boolean e0;
    public int f0;
    public long g0;
    public long h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public ggc l0;
    public long m0;
    public int n0;
    public int o0;
    public int p0;
    public long q0;
    public p93 r0;
    public w64 s0;
    public i40 t0;
    public final byte u0;
    public final byte v0;
    public final int w0;
    public ExperimentalFfmpegVideoDecoder x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentalFfmpegVideoRenderer(long j, Handler handler, vfc vfcVar, int i) {
        super(2);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        this.K = j;
        this.L = i;
        this.h0 = -9223372036854775807L;
        this.N = new jq();
        this.O = new ArrayDeque();
        this.P = new s93(0, 0);
        this.M = new k7b(handler, vfcVar);
        this.d0 = (byte) 0;
        this.V = -9223372036854775807L;
        this.X = -1;
        this.f0 = 0;
        this.r0 = new p93();
        this.w0 = availableProcessors;
        this.u0 = (byte) 4;
        this.v0 = (byte) 4;
    }

    @Override // vg0
    public final void B(long j, long j2) {
        if (this.k0) {
            return;
        }
        if (this.Q == null) {
            ym4 ym4Var = this.c;
            ym4Var.t();
            this.P.clear();
            int A = A(ym4Var, this.P, 2);
            if (A != -5) {
                if (A == -4) {
                    yve.p(this.P.isEndOfStream());
                    this.j0 = true;
                    this.k0 = true;
                    return;
                }
                return;
            }
            P(ym4Var);
        }
        O();
        if (this.T != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (L(j)) {
                }
                while (M()) {
                }
                Trace.endSection();
                synchronized (this.r0) {
                }
            } catch (q93 e) {
                efd.d("DecoderVideoRenderer", "Video codec error", e);
                k7b k7bVar = this.M;
                Handler handler = (Handler) k7bVar.b;
                if (handler != null) {
                    handler.post(new c9c(k7bVar, e, (byte) 19));
                }
                throw e(e, this.Q, false, 4003);
            }
        }
    }

    @Override // vg0
    public final int G(ko4 ko4Var) {
        String str = ko4Var.t;
        String str2 = FfmpegLibrary.a;
        return !eg7.m(str) ? qu6.a(0, 0, 0, 0) : !FfmpegLibrary.d(str) ? qu6.a(1, 0, 0, 0) : ko4Var.X != 0 ? qu6.a(2, 0, 0, 0) : jn7.V1;
    }

    public final n93 K(ko4 ko4Var) {
        Trace.beginSection("createFfmpegVideoDecoder");
        int i = ko4Var.u;
        if (i == -1) {
            i = y0;
        }
        int i2 = i;
        ExperimentalFfmpegVideoDecoder experimentalFfmpegVideoDecoder = new ExperimentalFfmpegVideoDecoder(this.u0, this.v0, i2, Math.max(this.w0, 1), ko4Var);
        this.x0 = experimentalFfmpegVideoDecoder;
        Trace.endSection();
        return experimentalFfmpegVideoDecoder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean L(long j) {
        long j2;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int F;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.W;
        if (videoDecoderOutputBuffer == null) {
            n93 n93Var = this.T;
            n93Var.getClass();
            videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) ((yla) n93Var).c();
            this.W = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return false;
            }
            p93 p93Var = this.r0;
            int i2 = p93Var.f;
            int i3 = videoDecoderOutputBuffer.skippedOutputBufferCount;
            p93Var.f = i2 + i3;
            this.p0 -= i3;
        }
        if (videoDecoderOutputBuffer.isEndOfStream()) {
            if (this.d0 == 2) {
                Q();
                O();
                return false;
            }
            this.W.release();
            this.W = null;
            this.k0 = true;
            return false;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.W;
        videoDecoderOutputBuffer2.getClass();
        long j3 = videoDecoderOutputBuffer2.timeUs;
        if (this.g0 == -9223372036854775807L) {
            this.g0 = j;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer3 = this.W;
        videoDecoderOutputBuffer3.getClass();
        long j4 = videoDecoderOutputBuffer3.timeUs;
        long j5 = j4 - j;
        if (this.X != -1) {
            this.S.getClass();
            y93 y93Var = this.S;
            long j6 = j4 - y93Var.b;
            if ((y93Var.d & 1) != 0) {
                long j7 = y93Var.c;
                if (j7 != -9223372036854775807L && j6 >= j7) {
                    this.r0.f++;
                    videoDecoderOutputBuffer3.release();
                    z = 1;
                    i = 1;
                    j2 = j3;
                }
            }
            jq jqVar = this.N;
            ko4 ko4Var = (ko4) jqVar.j(j4);
            if (ko4Var != null) {
                this.R = ko4Var;
            } else if (this.R == null) {
                this.R = (ko4) jqVar.i();
            }
            int i4 = this.n == 2 ? 1 : 0;
            int i5 = this.f0;
            if (i5 != 0) {
                if (i5 == 1) {
                    i = 1;
                    j2 = j3;
                } else {
                    if (i5 != 3) {
                        grb.g();
                        return false;
                    }
                    i = 1;
                    j2 = j3;
                    long T = gcc.T(SystemClock.elapsedRealtime()) - this.q0;
                    if (i4 == 0 || j5 >= -30000 || T <= 100000) {
                        i4 = 0;
                    }
                }
                i4 = i;
            } else {
                i = 1;
                j2 = j3;
            }
            if (i4 != 0) {
                ko4 ko4Var2 = this.R;
                ko4Var2.getClass();
                R(videoDecoderOutputBuffer3, j6, ko4Var2);
                z = i;
            } else {
                if (this.n != 2 || j == this.g0) {
                    z2 = false;
                } else if (j5 >= -500000 || (F = F(j)) == 0) {
                    if (j5 < -30000) {
                        T(0, i);
                        videoDecoderOutputBuffer3.release();
                    } else {
                        z2 = false;
                        if (j5 < 30000) {
                            ko4 ko4Var3 = this.R;
                            ko4Var3.getClass();
                            R(videoDecoderOutputBuffer3, j6, ko4Var3);
                        }
                    }
                    z3 = true;
                    i = 1;
                    z = z3;
                } else {
                    this.r0.j += i;
                    T(F, this.p0);
                    N();
                    z = 0;
                }
                z3 = z2;
                i = 1;
                z = z3;
            }
        } else {
            j2 = j3;
            if (j5 < -30000) {
                i = 1;
                this.r0.f++;
                videoDecoderOutputBuffer3.release();
                z = i;
            } else {
                i = 1;
                z = 0;
            }
        }
        if (z != 0) {
            this.p0 -= i;
            while (true) {
                ArrayDeque arrayDeque = this.O;
                if (arrayDeque.isEmpty() || j2 < ((y93) arrayDeque.peek()).a) {
                    break;
                }
                y93 y93Var2 = (y93) arrayDeque.poll();
                y93Var2.getClass();
                this.S = y93Var2;
            }
            this.W = null;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r2 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M() {
        ArrayDeque arrayDeque = this.O;
        y93 y93Var = !arrayDeque.isEmpty() ? (y93) arrayDeque.getLast() : this.S;
        y93Var.getClass();
        at9 at9Var = this.r;
        at9Var.getClass();
        y93Var.d = at9Var.a();
        n93 n93Var = this.T;
        if (n93Var != null && this.d0 != 2 && !this.j0) {
            s93 s93Var = this.U;
            if (s93Var == null) {
                s93Var = (s93) ((yla) n93Var).d();
                this.U = s93Var;
            }
            if (this.d0 == 1) {
                s93Var.setFlags(4);
                n93 n93Var2 = this.T;
                n93Var2.getClass();
                ((yla) n93Var2).e(s93Var);
                this.U = null;
                this.d0 = (byte) 2;
                return false;
            }
            ym4 ym4Var = this.c;
            ym4Var.t();
            int A = A(ym4Var, s93Var, 0);
            if (A == -5) {
                P(ym4Var);
                return true;
            }
            if (A == -4) {
                if (s93Var.isEndOfStream()) {
                    this.j0 = true;
                    n93 n93Var3 = this.T;
                    n93Var3.getClass();
                    ((yla) n93Var3).e(s93Var);
                    this.U = null;
                    return false;
                }
                if (this.i0) {
                    long j = s93Var.e;
                    ko4 ko4Var = this.Q;
                    ko4Var.getClass();
                    this.N.a(j, ko4Var);
                    this.i0 = false;
                }
                s93Var.d();
                s93Var.a = this.Q;
                n93 n93Var4 = this.T;
                n93Var4.getClass();
                ((yla) n93Var4).e(s93Var);
                this.p0++;
                this.e0 = true;
                this.r0.c++;
                this.V = Math.max(this.V, s93Var.e);
                this.U = null;
                return true;
            }
            if (A != -3) {
                grb.g();
                return false;
            }
        }
        return false;
    }

    public final void N() {
        this.p0 = 0;
        if (this.d0 != 0) {
            Q();
            O();
            return;
        }
        this.U = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.W;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.W = null;
        }
        n93 n93Var = this.T;
        n93Var.getClass();
        yla ylaVar = (yla) n93Var;
        ylaVar.flush();
        ylaVar.a(this.x);
        this.e0 = false;
    }

    public final void O() {
        k7b k7bVar = this.M;
        if (this.T == null) {
            jr3 jr3Var = this.c0;
            bs2.C(this.b0, jr3Var);
            this.b0 = jr3Var;
            if (jr3Var != null && jr3Var.h() == null && this.b0.g() == null) {
                return;
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.t0 == null) {
                    Looper myLooper = Looper.myLooper();
                    myLooper.getClass();
                    this.t0 = new i40(new Handler(myLooper), (byte) 0);
                }
                ko4 ko4Var = this.Q;
                ko4Var.getClass();
                n93 K = K(ko4Var);
                this.T = K;
                ((yla) K).a(this.x);
                ((yla) this.T).p(this, this.t0);
                S(this.X);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                n93 n93Var = this.T;
                n93Var.getClass();
                String name = n93Var.getName();
                long j = elapsedRealtime2 - elapsedRealtime;
                Handler handler = (Handler) k7bVar.b;
                if (handler != null) {
                    handler.post(new o30((Object) k7bVar, (Object) name, elapsedRealtime2, j, (byte) 17));
                }
                this.r0.a++;
            } catch (OutOfMemoryError e) {
                throw e(e, this.Q, false, 4001);
            } catch (q93 e2) {
                efd.d("DecoderVideoRenderer", "Video codec error", e2);
                Handler handler2 = (Handler) k7bVar.b;
                if (handler2 != null) {
                    handler2.post(new c9c(k7bVar, e2, (byte) 19));
                }
                throw e(e2, this.Q, false, 4001);
            }
        }
    }

    public final void P(ym4 ym4Var) {
        w93 w93Var;
        k7b k7bVar = this.M;
        Handler handler = (Handler) k7bVar.b;
        this.i0 = true;
        ko4 ko4Var = (ko4) ym4Var.c;
        ko4Var.getClass();
        jr3 jr3Var = (jr3) ym4Var.b;
        bs2.C(this.c0, jr3Var);
        this.c0 = jr3Var;
        ko4 ko4Var2 = this.Q;
        this.Q = ko4Var;
        n93 n93Var = this.T;
        byte b = 9;
        if (n93Var == null) {
            O();
            ko4 ko4Var3 = this.Q;
            ko4Var3.getClass();
            if (handler != null) {
                handler.post(new b6c(k7bVar, ko4Var3, null, b));
                return;
            }
            return;
        }
        if (jr3Var != this.b0) {
            String name = n93Var.getName();
            ko4Var2.getClass();
            w93Var = new w93(name, ko4Var2, ko4Var, 0, 128);
        } else {
            String name2 = n93Var.getName();
            ko4Var2.getClass();
            w93Var = new w93(name2, ko4Var2, ko4Var, 0, 8);
        }
        if (w93Var.d == 0) {
            if (this.e0) {
                this.d0 = (byte) 1;
            } else {
                Q();
                O();
            }
        }
        ko4 ko4Var4 = this.Q;
        ko4Var4.getClass();
        if (handler != null) {
            handler.post(new b6c(k7bVar, ko4Var4, w93Var, b));
        }
    }

    public final void Q() {
        this.U = null;
        this.W = null;
        this.d0 = (byte) 0;
        this.e0 = false;
        this.p0 = 0;
        n93 n93Var = this.T;
        if (n93Var != null) {
            this.r0.b++;
            n93Var.release();
            String name = this.T.getName();
            k7b k7bVar = this.M;
            Handler handler = (Handler) k7bVar.b;
            if (handler != null) {
                handler.post(new c9c(k7bVar, name, (byte) 20));
            }
            this.T = null;
        }
        bs2.C(this.b0, null);
        this.b0 = null;
    }

    public final void R(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j, ko4 ko4Var) {
        sec secVar = this.a0;
        if (secVar != null) {
            this.h.getClass();
            secVar.b(j, System.nanoTime(), ko4Var, null);
        }
        this.q0 = gcc.T(SystemClock.elapsedRealtime());
        if (videoDecoderOutputBuffer.mode != 1 || this.Z == null) {
            T(0, 1);
            return;
        }
        int i = videoDecoderOutputBuffer.width;
        int i2 = videoDecoderOutputBuffer.height;
        ggc ggcVar = this.l0;
        k7b k7bVar = this.M;
        if (ggcVar == null || ggcVar.a != i || ggcVar.b != i2) {
            ggc ggcVar2 = new ggc(i, i2);
            this.l0 = ggcVar2;
            k7bVar.t(ggcVar2);
        }
        Surface surface = this.Z;
        surface.getClass();
        try {
            ExperimentalFfmpegVideoDecoder experimentalFfmpegVideoDecoder = this.x0;
            if (experimentalFfmpegVideoDecoder == null) {
                throw new FfmpegDecoderException("Failed to render output buffer to surface: decoder is not initialized.");
            }
            experimentalFfmpegVideoDecoder.r(videoDecoderOutputBuffer, surface);
            videoDecoderOutputBuffer.release();
            this.o0 = 0;
            this.r0.e++;
            if (this.f0 != 3) {
                this.f0 = 3;
                Object obj = this.Y;
                if (obj != null) {
                    k7bVar.s(obj);
                }
            }
        } finally {
            videoDecoderOutputBuffer.release();
        }
    }

    public final void S(int i) {
        ExperimentalFfmpegVideoDecoder experimentalFfmpegVideoDecoder = this.x0;
        if (experimentalFfmpegVideoDecoder != null) {
            experimentalFfmpegVideoDecoder.t = i;
        }
    }

    public final void T(int i, int i2) {
        int i3;
        p93 p93Var = this.r0;
        p93Var.h += i;
        int i4 = i + i2;
        p93Var.g += i4;
        this.n0 += i4;
        int i5 = this.o0 + i4;
        this.o0 = i5;
        p93Var.i = Math.max(i5, p93Var.i);
        int i6 = this.L;
        if (i6 <= 0 || (i3 = this.n0) < i6 || i3 <= 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.m0;
        int i7 = this.n0;
        k7b k7bVar = this.M;
        Handler handler = (Handler) k7bVar.b;
        if (handler != null) {
            handler.post(new tfc(k7bVar, i7, j));
        }
        this.n0 = 0;
        this.m0 = elapsedRealtime;
    }

    @Override // m93
    public final void a() {
        w64 w64Var = this.s0;
        if (w64Var != null) {
            w64Var.a();
        }
    }

    @Override // m93
    public final void b() {
        w64 w64Var = this.s0;
        if (w64Var != null) {
            w64Var.a();
        }
    }

    @Override // vg0, lg8
    public final void d(int i, Object obj) {
        int i2;
        Object obj2;
        if (i != 1) {
            if (i == 7) {
                this.a0 = (sec) obj;
                return;
            } else {
                if (i == 11) {
                    this.s0 = (w64) obj;
                    return;
                }
                return;
            }
        }
        if (obj instanceof Surface) {
            this.Z = (Surface) obj;
            this.X = 1;
            i2 = 1;
        } else {
            this.Z = null;
            i2 = -1;
            this.X = -1;
            obj = null;
        }
        Object obj3 = this.Y;
        k7b k7bVar = this.M;
        if (obj3 == obj) {
            if (obj != null) {
                ggc ggcVar = this.l0;
                if (ggcVar != null) {
                    k7bVar.t(ggcVar);
                }
                if (this.f0 != 3 || (obj2 = this.Y) == null) {
                    return;
                }
                k7bVar.s(obj2);
                return;
            }
            return;
        }
        this.Y = obj;
        if (obj == null) {
            this.l0 = null;
            this.f0 = Math.min(this.f0, 1);
            return;
        }
        if (this.T != null) {
            S(i2);
        }
        ggc ggcVar2 = this.l0;
        if (ggcVar2 != null) {
            k7bVar.t(ggcVar2);
        }
        this.f0 = Math.min(this.f0, 1);
        if (this.n == 2) {
            long j = this.K;
            this.h0 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
    }

    @Override // vg0
    public final void i() {
        if (this.f0 == 0) {
            this.f0 = 1;
        }
    }

    @Override // vg0
    public final String l() {
        return "ExperimentalFfmpegVideoRenderer";
    }

    @Override // vg0
    public final boolean n() {
        return this.k0;
    }

    @Override // vg0
    public final boolean o() {
        if (this.Q != null && ((p() || this.W != null) && (this.f0 == 3 || this.X == -1))) {
            this.h0 = -9223372036854775807L;
            return true;
        }
        if (this.h0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.h0) {
            return true;
        }
        this.h0 = -9223372036854775807L;
        return false;
    }

    @Override // vg0
    public final void q() {
        k7b k7bVar = this.M;
        this.Q = null;
        this.S = null;
        this.O.clear();
        this.V = -9223372036854775807L;
        this.l0 = null;
        this.f0 = Math.min(this.f0, 0);
        try {
            bs2.C(this.c0, null);
            this.c0 = null;
            Q();
        } finally {
            k7bVar.l(this.r0);
        }
    }

    @Override // vg0
    public final void r(boolean z, boolean z2) {
        p93 p93Var = new p93();
        this.r0 = p93Var;
        k7b k7bVar = this.M;
        Handler handler = (Handler) k7bVar.b;
        if (handler != null) {
            handler.post(new ufc(k7bVar, p93Var, (byte) 0));
        }
        this.f0 = z2 ? 1 : 0;
    }

    @Override // vg0
    public final void s(long j, boolean z, boolean z2) {
        this.j0 = false;
        this.k0 = false;
        ArrayDeque arrayDeque = this.O;
        if (!arrayDeque.isEmpty()) {
            this.S = (y93) arrayDeque.getLast();
        }
        arrayDeque.clear();
        this.V = -9223372036854775807L;
        this.f0 = Math.min(this.f0, 1);
        this.g0 = -9223372036854775807L;
        this.o0 = 0;
        if (this.T != null) {
            N();
        }
        if (z) {
            long j2 = this.K;
            this.h0 = j2 > 0 ? SystemClock.elapsedRealtime() + j2 : -9223372036854775807L;
        } else {
            this.h0 = -9223372036854775807L;
        }
        jq jqVar = this.N;
        if (jqVar.p() > 0) {
            this.i0 = true;
        }
        jqVar.c();
    }

    @Override // vg0
    public final void w() {
        this.n0 = 0;
        this.m0 = SystemClock.elapsedRealtime();
        this.q0 = gcc.T(SystemClock.elapsedRealtime());
    }

    @Override // vg0
    public final void x() {
        this.h0 = -9223372036854775807L;
        if (this.n0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.m0;
            int i = this.n0;
            k7b k7bVar = this.M;
            Handler handler = (Handler) k7bVar.b;
            if (handler != null) {
                handler.post(new tfc(k7bVar, i, j));
            }
            this.n0 = 0;
            this.m0 = elapsedRealtime;
        }
    }

    @Override // vg0
    public final void y(ko4[] ko4VarArr, long j, long j2, vz6 vz6Var) {
        at9 at9Var = this.r;
        at9Var.getClass();
        int a = at9Var.a();
        if (this.S != null) {
            ArrayDeque arrayDeque = this.O;
            if (!arrayDeque.isEmpty() || this.p0 != 0) {
                arrayDeque.add(new y93(a, this.V, j2, this.I));
                return;
            }
        }
        this.S = new y93(a, -9223372036854775807L, j2, this.I);
    }

    @Override // vg0
    public final void z() {
        ArrayDeque arrayDeque = this.O;
        y93 y93Var = !arrayDeque.isEmpty() ? (y93) arrayDeque.getLast() : this.S;
        if (y93Var != null) {
            y93Var.c = this.I;
        }
    }
}
