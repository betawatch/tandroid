package androidx.media3.decoder.ffmpeg;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ExperimentalFfmpegVideoRenderer extends uh0 implements fa3 {
    public static final int y0 = ((hac.g(720, 64) * hac.g(1280, 64)) * 6144) / 2;
    public final long K;
    public final int L;
    public final xab M;
    public final ir N;
    public final ArrayDeque O;
    public final la3 P;
    public go4 Q;
    public go4 R;
    public ra3 S;
    public ga3 T;
    public la3 U;
    public long V;
    public VideoDecoderOutputBuffer W;
    public int X;
    public Object Y;
    public Surface Z;
    public vcc a0;
    public cs3 b0;
    public cs3 c0;
    public byte d0;
    public boolean e0;
    public int f0;
    public long g0;
    public long h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public jec l0;
    public long m0;
    public int n0;
    public int o0;
    public int p0;
    public long q0;
    public ia3 r0;
    public l74 s0;
    public g50 t0;
    public final byte u0;
    public final byte v0;
    public final int w0;
    public ExperimentalFfmpegVideoDecoder x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentalFfmpegVideoRenderer(long j, Handler handler, ydc ydcVar, int i) {
        super(2);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        this.K = j;
        this.L = i;
        this.h0 = -9223372036854775807L;
        this.N = new ir();
        this.O = new ArrayDeque();
        this.P = new la3(0, 0);
        this.M = new xab(handler, ydcVar);
        this.d0 = (byte) 0;
        this.V = -9223372036854775807L;
        this.X = -1;
        this.f0 = 0;
        this.r0 = new ia3();
        this.w0 = availableProcessors;
        this.u0 = (byte) 4;
        this.v0 = (byte) 4;
    }

    @Override // uh0
    public final void B(long j, long j2) {
        if (this.k0) {
            return;
        }
        if (this.Q == null) {
            mj4 mj4Var = this.c;
            mj4Var.i();
            this.P.clear();
            int A = A(mj4Var, this.P, 2);
            if (A != -5) {
                if (A == -4) {
                    jte.p(this.P.isEndOfStream());
                    this.j0 = true;
                    this.k0 = true;
                    return;
                }
                return;
            }
            P(mj4Var);
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
            } catch (ja3 e) {
                ncd.d("DecoderVideoRenderer", "Video codec error", e);
                xab xabVar = this.M;
                Handler handler = (Handler) xabVar.b;
                if (handler != null) {
                    handler.post(new x4c(xabVar, e, (byte) 24));
                }
                throw e(e, this.Q, false, 4003);
            }
        }
    }

    @Override // uh0
    public final int G(go4 go4Var) {
        String str = go4Var.t;
        String str2 = FfmpegLibrary.a;
        return !wf7.m(str) ? kt6.a(0, 0, 0, 0) : !FfmpegLibrary.d(str) ? kt6.a(1, 0, 0, 0) : go4Var.X != 0 ? kt6.a(2, 0, 0, 0) : nm7.V1;
    }

    public final ga3 K(go4 go4Var) {
        Trace.beginSection("createFfmpegVideoDecoder");
        int i = go4Var.u;
        if (i == -1) {
            i = y0;
        }
        int i2 = i;
        ExperimentalFfmpegVideoDecoder experimentalFfmpegVideoDecoder = new ExperimentalFfmpegVideoDecoder(this.u0, this.v0, i2, Math.max(this.w0, 1), go4Var);
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
            ga3 ga3Var = this.T;
            ga3Var.getClass();
            videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) ((fka) ga3Var).c();
            this.W = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return false;
            }
            ia3 ia3Var = this.r0;
            int i2 = ia3Var.f;
            int i3 = videoDecoderOutputBuffer.skippedOutputBufferCount;
            ia3Var.f = i2 + i3;
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
            ra3 ra3Var = this.S;
            long j6 = j4 - ra3Var.b;
            if ((ra3Var.d & 1) != 0) {
                long j7 = ra3Var.c;
                if (j7 != -9223372036854775807L && j6 >= j7) {
                    this.r0.f++;
                    videoDecoderOutputBuffer3.release();
                    z = 1;
                    i = 1;
                    j2 = j3;
                }
            }
            ir irVar = this.N;
            go4 go4Var = (go4) irVar.j(j4);
            if (go4Var != null) {
                this.R = go4Var;
            } else if (this.R == null) {
                this.R = (go4) irVar.i();
            }
            int i4 = this.n == 2 ? 1 : 0;
            int i5 = this.f0;
            if (i5 != 0) {
                if (i5 == 1) {
                    i = 1;
                    j2 = j3;
                } else {
                    if (i5 != 3) {
                        rjb.h();
                        return false;
                    }
                    i = 1;
                    j2 = j3;
                    long T = hac.T(SystemClock.elapsedRealtime()) - this.q0;
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
                go4 go4Var2 = this.R;
                go4Var2.getClass();
                R(videoDecoderOutputBuffer3, j6, go4Var2);
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
                            go4 go4Var3 = this.R;
                            go4Var3.getClass();
                            R(videoDecoderOutputBuffer3, j6, go4Var3);
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
                if (arrayDeque.isEmpty() || j2 < ((ra3) arrayDeque.peek()).a) {
                    break;
                }
                ra3 ra3Var2 = (ra3) arrayDeque.poll();
                ra3Var2.getClass();
                this.S = ra3Var2;
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
        ra3 ra3Var = !arrayDeque.isEmpty() ? (ra3) arrayDeque.getLast() : this.S;
        ra3Var.getClass();
        jr9 jr9Var = this.r;
        jr9Var.getClass();
        ra3Var.d = jr9Var.a();
        ga3 ga3Var = this.T;
        if (ga3Var != null && this.d0 != 2 && !this.j0) {
            la3 la3Var = this.U;
            if (la3Var == null) {
                la3Var = (la3) ((fka) ga3Var).d();
                this.U = la3Var;
            }
            if (this.d0 == 1) {
                la3Var.setFlags(4);
                ga3 ga3Var2 = this.T;
                ga3Var2.getClass();
                ((fka) ga3Var2).e(la3Var);
                this.U = null;
                this.d0 = (byte) 2;
                return false;
            }
            mj4 mj4Var = this.c;
            mj4Var.i();
            int A = A(mj4Var, la3Var, 0);
            if (A == -5) {
                P(mj4Var);
                return true;
            }
            if (A == -4) {
                if (la3Var.isEndOfStream()) {
                    this.j0 = true;
                    ga3 ga3Var3 = this.T;
                    ga3Var3.getClass();
                    ((fka) ga3Var3).e(la3Var);
                    this.U = null;
                    return false;
                }
                if (this.i0) {
                    long j = la3Var.e;
                    go4 go4Var = this.Q;
                    go4Var.getClass();
                    this.N.a(go4Var, j);
                    this.i0 = false;
                }
                la3Var.d();
                la3Var.a = this.Q;
                ga3 ga3Var4 = this.T;
                ga3Var4.getClass();
                ((fka) ga3Var4).e(la3Var);
                this.p0++;
                this.e0 = true;
                this.r0.c++;
                this.V = Math.max(this.V, la3Var.e);
                this.U = null;
                return true;
            }
            if (A != -3) {
                rjb.h();
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
        ga3 ga3Var = this.T;
        ga3Var.getClass();
        fka fkaVar = (fka) ga3Var;
        fkaVar.flush();
        fkaVar.a(this.x);
        this.e0 = false;
    }

    public final void O() {
        xab xabVar = this.M;
        if (this.T == null) {
            cs3 cs3Var = this.c0;
            ts2.B(this.b0, cs3Var);
            this.b0 = cs3Var;
            if (cs3Var != null && cs3Var.h() == null && this.b0.g() == null) {
                return;
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.t0 == null) {
                    Looper myLooper = Looper.myLooper();
                    myLooper.getClass();
                    this.t0 = new g50(new Handler(myLooper), (byte) 0);
                }
                go4 go4Var = this.Q;
                go4Var.getClass();
                ga3 K = K(go4Var);
                this.T = K;
                ((fka) K).a(this.x);
                ((fka) this.T).p(this, this.t0);
                S(this.X);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                ga3 ga3Var = this.T;
                ga3Var.getClass();
                String name = ga3Var.getName();
                long j = elapsedRealtime2 - elapsedRealtime;
                Handler handler = (Handler) xabVar.b;
                if (handler != null) {
                    handler.post(new n40((Object) xabVar, (Object) name, elapsedRealtime2, j, (byte) 17));
                }
                this.r0.a++;
            } catch (ja3 e) {
                ncd.d("DecoderVideoRenderer", "Video codec error", e);
                Handler handler2 = (Handler) xabVar.b;
                if (handler2 != null) {
                    handler2.post(new x4c(xabVar, e, (byte) 24));
                }
                throw e(e, this.Q, false, 4001);
            } catch (OutOfMemoryError e2) {
                throw e(e2, this.Q, false, 4001);
            }
        }
    }

    public final void P(mj4 mj4Var) {
        pa3 pa3Var;
        xab xabVar = this.M;
        Handler handler = (Handler) xabVar.b;
        this.i0 = true;
        go4 go4Var = (go4) mj4Var.c;
        go4Var.getClass();
        cs3 cs3Var = (cs3) mj4Var.b;
        ts2.B(this.c0, cs3Var);
        this.c0 = cs3Var;
        go4 go4Var2 = this.Q;
        this.Q = go4Var;
        ga3 ga3Var = this.T;
        byte b = 3;
        if (ga3Var == null) {
            O();
            go4 go4Var3 = this.Q;
            go4Var3.getClass();
            if (handler != null) {
                handler.post(new gcc(xabVar, go4Var3, null, b));
                return;
            }
            return;
        }
        if (cs3Var != this.b0) {
            String name = ga3Var.getName();
            go4Var2.getClass();
            pa3Var = new pa3(name, go4Var2, go4Var, 0, 128);
        } else {
            String name2 = ga3Var.getName();
            go4Var2.getClass();
            pa3Var = new pa3(name2, go4Var2, go4Var, 0, 8);
        }
        if (pa3Var.d == 0) {
            if (this.e0) {
                this.d0 = (byte) 1;
            } else {
                Q();
                O();
            }
        }
        go4 go4Var4 = this.Q;
        go4Var4.getClass();
        if (handler != null) {
            handler.post(new gcc(xabVar, go4Var4, pa3Var, b));
        }
    }

    public final void Q() {
        this.U = null;
        this.W = null;
        this.d0 = (byte) 0;
        this.e0 = false;
        this.p0 = 0;
        ga3 ga3Var = this.T;
        if (ga3Var != null) {
            this.r0.b++;
            ga3Var.release();
            String name = this.T.getName();
            xab xabVar = this.M;
            Handler handler = (Handler) xabVar.b;
            if (handler != null) {
                handler.post(new x4c(xabVar, name, (byte) 25));
            }
            this.T = null;
        }
        ts2.B(this.b0, null);
        this.b0 = null;
    }

    public final void R(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j, go4 go4Var) {
        vcc vccVar = this.a0;
        if (vccVar != null) {
            this.h.getClass();
            vccVar.c(j, System.nanoTime(), go4Var, null);
        }
        this.q0 = hac.T(SystemClock.elapsedRealtime());
        if (videoDecoderOutputBuffer.mode != 1 || this.Z == null) {
            T(0, 1);
            return;
        }
        int i = videoDecoderOutputBuffer.width;
        int i2 = videoDecoderOutputBuffer.height;
        jec jecVar = this.l0;
        xab xabVar = this.M;
        if (jecVar == null || jecVar.a != i || jecVar.b != i2) {
            jec jecVar2 = new jec(i, i2);
            this.l0 = jecVar2;
            xabVar.q(jecVar2);
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
                    xabVar.p(obj);
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
        ia3 ia3Var = this.r0;
        ia3Var.h += i;
        int i4 = i + i2;
        ia3Var.g += i4;
        this.n0 += i4;
        int i5 = this.o0 + i4;
        this.o0 = i5;
        ia3Var.i = Math.max(i5, ia3Var.i);
        int i6 = this.L;
        if (i6 <= 0 || (i3 = this.n0) < i6 || i3 <= 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.m0;
        int i7 = this.n0;
        xab xabVar = this.M;
        Handler handler = (Handler) xabVar.b;
        if (handler != null) {
            handler.post(new wdc(xabVar, i7, j));
        }
        this.n0 = 0;
        this.m0 = elapsedRealtime;
    }

    @Override // fa3
    public final void a() {
        l74 l74Var = this.s0;
        if (l74Var != null) {
            l74Var.a();
        }
    }

    @Override // fa3
    public final void c() {
        l74 l74Var = this.s0;
        if (l74Var != null) {
            l74Var.a();
        }
    }

    @Override // uh0, ze8
    public final void d(int i, Object obj) {
        int i2;
        Object obj2;
        if (i != 1) {
            if (i == 7) {
                this.a0 = (vcc) obj;
                return;
            } else {
                if (i == 11) {
                    this.s0 = (l74) obj;
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
        xab xabVar = this.M;
        if (obj3 == obj) {
            if (obj != null) {
                jec jecVar = this.l0;
                if (jecVar != null) {
                    xabVar.q(jecVar);
                }
                if (this.f0 != 3 || (obj2 = this.Y) == null) {
                    return;
                }
                xabVar.p(obj2);
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
        jec jecVar2 = this.l0;
        if (jecVar2 != null) {
            xabVar.q(jecVar2);
        }
        this.f0 = Math.min(this.f0, 1);
        if (this.n == 2) {
            long j = this.K;
            this.h0 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
    }

    @Override // uh0
    public final void f() {
        if (this.f0 == 0) {
            this.f0 = 1;
        }
    }

    @Override // uh0
    public final String l() {
        return "ExperimentalFfmpegVideoRenderer";
    }

    @Override // uh0
    public final boolean n() {
        return this.k0;
    }

    @Override // uh0
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

    @Override // uh0
    public final void q() {
        xab xabVar = this.M;
        this.Q = null;
        this.S = null;
        this.O.clear();
        this.V = -9223372036854775807L;
        this.l0 = null;
        this.f0 = Math.min(this.f0, 0);
        try {
            ts2.B(this.c0, null);
            this.c0 = null;
            Q();
        } finally {
            xabVar.i(this.r0);
        }
    }

    @Override // uh0
    public final void r(boolean z, boolean z2) {
        ia3 ia3Var = new ia3();
        this.r0 = ia3Var;
        xab xabVar = this.M;
        Handler handler = (Handler) xabVar.b;
        if (handler != null) {
            handler.post(new xdc(xabVar, ia3Var, (byte) 0));
        }
        this.f0 = z2 ? 1 : 0;
    }

    @Override // uh0
    public final void s(long j, boolean z, boolean z2) {
        this.j0 = false;
        this.k0 = false;
        ArrayDeque arrayDeque = this.O;
        if (!arrayDeque.isEmpty()) {
            this.S = (ra3) arrayDeque.getLast();
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
        ir irVar = this.N;
        if (irVar.p() > 0) {
            this.i0 = true;
        }
        irVar.c();
    }

    @Override // uh0
    public final void w() {
        this.n0 = 0;
        this.m0 = SystemClock.elapsedRealtime();
        this.q0 = hac.T(SystemClock.elapsedRealtime());
    }

    @Override // uh0
    public final void x() {
        this.h0 = -9223372036854775807L;
        if (this.n0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.m0;
            int i = this.n0;
            xab xabVar = this.M;
            Handler handler = (Handler) xabVar.b;
            if (handler != null) {
                handler.post(new wdc(xabVar, i, j));
            }
            this.n0 = 0;
            this.m0 = elapsedRealtime;
        }
    }

    @Override // uh0
    public final void y(go4[] go4VarArr, long j, long j2, rz6 rz6Var) {
        jr9 jr9Var = this.r;
        jr9Var.getClass();
        int a = jr9Var.a();
        if (this.S != null) {
            ArrayDeque arrayDeque = this.O;
            if (!arrayDeque.isEmpty() || this.p0 != 0) {
                arrayDeque.add(new ra3(a, this.V, j2, this.I));
                return;
            }
        }
        this.S = new ra3(a, -9223372036854775807L, j2, this.I);
    }

    @Override // uh0
    public final void z() {
        ArrayDeque arrayDeque = this.O;
        ra3 ra3Var = !arrayDeque.isEmpty() ? (ra3) arrayDeque.getLast() : this.S;
        if (ra3Var != null) {
            ra3Var.c = this.I;
        }
    }
}
