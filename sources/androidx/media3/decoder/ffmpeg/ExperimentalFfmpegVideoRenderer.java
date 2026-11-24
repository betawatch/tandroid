package androidx.media3.decoder.ffmpeg;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ExperimentalFfmpegVideoRenderer extends ug0 implements t83 {
    public static final int y0 = ((g8c.g(720, 64) * g8c.g(1280, 64)) * 6144) / 2;
    public final long K;
    public final int L;
    public final v8b M;
    public final iq N;
    public final ArrayDeque O;
    public final z83 P;
    public fm4 Q;
    public fm4 R;
    public f93 S;
    public u83 T;
    public z83 U;
    public long V;
    public VideoDecoderOutputBuffer W;
    public int X;
    public Object Y;
    public Surface Z;
    public sac a0;
    public sq3 b0;
    public sq3 c0;
    public byte d0;
    public boolean e0;
    public int f0;
    public long g0;
    public long h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public icc l0;
    public long m0;
    public int n0;
    public int o0;
    public int p0;
    public long q0;
    public w83 r0;
    public c64 s0;
    public g40 t0;
    public final byte u0;
    public final byte v0;
    public final int w0;
    public ExperimentalFfmpegVideoDecoder x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentalFfmpegVideoRenderer(long j, Handler handler, xbc xbcVar, int i) {
        super(2);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        this.K = j;
        this.L = i;
        this.h0 = -9223372036854775807L;
        this.N = new iq();
        this.O = new ArrayDeque();
        this.P = new z83(0, 0);
        this.M = new v8b(handler, xbcVar);
        this.d0 = (byte) 0;
        this.V = -9223372036854775807L;
        this.X = -1;
        this.f0 = 0;
        this.r0 = new w83();
        this.w0 = availableProcessors;
        this.u0 = (byte) 4;
        this.v0 = (byte) 4;
    }

    @Override // ug0
    public final void B(long j, long j2) {
        if (this.k0) {
            return;
        }
        if (this.Q == null) {
            sk4 sk4Var = this.c;
            sk4Var.m();
            this.P.clear();
            int A = A(sk4Var, this.P, 2);
            if (A != -5) {
                if (A == -4) {
                    gre.p(this.P.isEndOfStream());
                    this.j0 = true;
                    this.k0 = true;
                    return;
                }
                return;
            }
            P(sk4Var);
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
            } catch (x83 e) {
                lad.d("DecoderVideoRenderer", "Video codec error", e);
                v8b v8bVar = this.M;
                Handler handler = (Handler) v8bVar.b;
                if (handler != null) {
                    handler.post(new l3c(v8bVar, e, (byte) 22));
                }
                throw e(e, this.Q, false, 4003);
            }
        }
    }

    @Override // ug0
    public final int G(fm4 fm4Var) {
        String str = fm4Var.t;
        String str2 = FfmpegLibrary.a;
        return !ud7.m(str) ? ls6.a(0, 0, 0, 0) : !FfmpegLibrary.d(str) ? ls6.a(1, 0, 0, 0) : fm4Var.X != 0 ? ls6.a(2, 0, 0, 0) : kk7.V1;
    }

    public final u83 K(fm4 fm4Var) {
        Trace.beginSection("createFfmpegVideoDecoder");
        int i = fm4Var.u;
        if (i == -1) {
            i = y0;
        }
        int i2 = i;
        ExperimentalFfmpegVideoDecoder experimentalFfmpegVideoDecoder = new ExperimentalFfmpegVideoDecoder(this.u0, this.v0, i2, Math.max(this.w0, 1), fm4Var);
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
            u83 u83Var = this.T;
            u83Var.getClass();
            videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) ((dia) u83Var).c();
            this.W = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return false;
            }
            w83 w83Var = this.r0;
            int i2 = w83Var.f;
            int i3 = videoDecoderOutputBuffer.skippedOutputBufferCount;
            w83Var.f = i2 + i3;
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
            f93 f93Var = this.S;
            long j6 = j4 - f93Var.b;
            if ((f93Var.d & 1) != 0) {
                long j7 = f93Var.c;
                if (j7 != -9223372036854775807L && j6 >= j7) {
                    this.r0.f++;
                    videoDecoderOutputBuffer3.release();
                    z = 1;
                    i = 1;
                    j2 = j3;
                }
            }
            iq iqVar = this.N;
            fm4 fm4Var = (fm4) iqVar.j(j4);
            if (fm4Var != null) {
                this.R = fm4Var;
            } else if (this.R == null) {
                this.R = (fm4) iqVar.i();
            }
            int i4 = this.n == 2 ? 1 : 0;
            int i5 = this.f0;
            if (i5 != 0) {
                if (i5 == 1) {
                    i = 1;
                    j2 = j3;
                } else {
                    if (i5 != 3) {
                        sdb.a();
                        return false;
                    }
                    i = 1;
                    j2 = j3;
                    long T = g8c.T(SystemClock.elapsedRealtime()) - this.q0;
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
                fm4 fm4Var2 = this.R;
                fm4Var2.getClass();
                R(videoDecoderOutputBuffer3, j6, fm4Var2);
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
                            fm4 fm4Var3 = this.R;
                            fm4Var3.getClass();
                            R(videoDecoderOutputBuffer3, j6, fm4Var3);
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
                if (arrayDeque.isEmpty() || j2 < ((f93) arrayDeque.peek()).a) {
                    break;
                }
                f93 f93Var2 = (f93) arrayDeque.poll();
                f93Var2.getClass();
                this.S = f93Var2;
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
        f93 f93Var = !arrayDeque.isEmpty() ? (f93) arrayDeque.getLast() : this.S;
        f93Var.getClass();
        ip9 ip9Var = this.r;
        ip9Var.getClass();
        f93Var.d = ip9Var.a();
        u83 u83Var = this.T;
        if (u83Var != null && this.d0 != 2 && !this.j0) {
            z83 z83Var = this.U;
            if (z83Var == null) {
                z83Var = (z83) ((dia) u83Var).d();
                this.U = z83Var;
            }
            if (this.d0 == 1) {
                z83Var.setFlags(4);
                u83 u83Var2 = this.T;
                u83Var2.getClass();
                ((dia) u83Var2).e(z83Var);
                this.U = null;
                this.d0 = (byte) 2;
                return false;
            }
            sk4 sk4Var = this.c;
            sk4Var.m();
            int A = A(sk4Var, z83Var, 0);
            if (A == -5) {
                P(sk4Var);
                return true;
            }
            if (A == -4) {
                if (z83Var.isEndOfStream()) {
                    this.j0 = true;
                    u83 u83Var3 = this.T;
                    u83Var3.getClass();
                    ((dia) u83Var3).e(z83Var);
                    this.U = null;
                    return false;
                }
                if (this.i0) {
                    long j = z83Var.e;
                    fm4 fm4Var = this.Q;
                    fm4Var.getClass();
                    this.N.a(fm4Var, j);
                    this.i0 = false;
                }
                z83Var.d();
                z83Var.a = this.Q;
                u83 u83Var4 = this.T;
                u83Var4.getClass();
                ((dia) u83Var4).e(z83Var);
                this.p0++;
                this.e0 = true;
                this.r0.c++;
                this.V = Math.max(this.V, z83Var.e);
                this.U = null;
                return true;
            }
            if (A != -3) {
                sdb.a();
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
        u83 u83Var = this.T;
        u83Var.getClass();
        dia diaVar = (dia) u83Var;
        diaVar.flush();
        diaVar.a(this.x);
        this.e0 = false;
    }

    public final void O() {
        v8b v8bVar = this.M;
        if (this.T == null) {
            sq3 sq3Var = this.c0;
            ir2.C(this.b0, sq3Var);
            this.b0 = sq3Var;
            if (sq3Var != null && sq3Var.h() == null && this.b0.g() == null) {
                return;
            }
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.t0 == null) {
                    Looper myLooper = Looper.myLooper();
                    myLooper.getClass();
                    this.t0 = new g40(new Handler(myLooper), (byte) 0);
                }
                fm4 fm4Var = this.Q;
                fm4Var.getClass();
                u83 K = K(fm4Var);
                this.T = K;
                ((dia) K).a(this.x);
                ((dia) this.T).p(this, this.t0);
                S(this.X);
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                u83 u83Var = this.T;
                u83Var.getClass();
                String name = u83Var.getName();
                long j = elapsedRealtime2 - elapsedRealtime;
                Handler handler = (Handler) v8bVar.b;
                if (handler != null) {
                    handler.post(new n30((Object) v8bVar, (Object) name, elapsedRealtime2, j, (byte) 17));
                }
                this.r0.a++;
            } catch (OutOfMemoryError e) {
                throw e(e, this.Q, false, 4001);
            } catch (x83 e2) {
                lad.d("DecoderVideoRenderer", "Video codec error", e2);
                Handler handler2 = (Handler) v8bVar.b;
                if (handler2 != null) {
                    handler2.post(new l3c(v8bVar, e2, (byte) 22));
                }
                throw e(e2, this.Q, false, 4001);
            }
        }
    }

    public final void P(sk4 sk4Var) {
        d93 d93Var;
        v8b v8bVar = this.M;
        Handler handler = (Handler) v8bVar.b;
        this.i0 = true;
        fm4 fm4Var = (fm4) sk4Var.c;
        fm4Var.getClass();
        sq3 sq3Var = (sq3) sk4Var.b;
        ir2.C(this.c0, sq3Var);
        this.c0 = sq3Var;
        fm4 fm4Var2 = this.Q;
        this.Q = fm4Var;
        u83 u83Var = this.T;
        byte b = 0;
        if (u83Var == null) {
            O();
            fm4 fm4Var3 = this.Q;
            fm4Var3.getClass();
            if (handler != null) {
                handler.post(new wbc(v8bVar, fm4Var3, null, b));
                return;
            }
            return;
        }
        if (sq3Var != this.b0) {
            String name = u83Var.getName();
            fm4Var2.getClass();
            d93Var = new d93(name, fm4Var2, fm4Var, 0, 128);
        } else {
            String name2 = u83Var.getName();
            fm4Var2.getClass();
            d93Var = new d93(name2, fm4Var2, fm4Var, 0, 8);
        }
        if (d93Var.d == 0) {
            if (this.e0) {
                this.d0 = (byte) 1;
            } else {
                Q();
                O();
            }
        }
        fm4 fm4Var4 = this.Q;
        fm4Var4.getClass();
        if (handler != null) {
            handler.post(new wbc(v8bVar, fm4Var4, d93Var, b));
        }
    }

    public final void Q() {
        this.U = null;
        this.W = null;
        this.d0 = (byte) 0;
        this.e0 = false;
        this.p0 = 0;
        u83 u83Var = this.T;
        if (u83Var != null) {
            this.r0.b++;
            u83Var.release();
            String name = this.T.getName();
            v8b v8bVar = this.M;
            Handler handler = (Handler) v8bVar.b;
            if (handler != null) {
                handler.post(new l3c(v8bVar, name, (byte) 23));
            }
            this.T = null;
        }
        ir2.C(this.b0, null);
        this.b0 = null;
    }

    public final void R(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j, fm4 fm4Var) {
        sac sacVar = this.a0;
        if (sacVar != null) {
            this.h.getClass();
            sacVar.c(j, System.nanoTime(), fm4Var, null);
        }
        this.q0 = g8c.T(SystemClock.elapsedRealtime());
        if (videoDecoderOutputBuffer.mode != 1 || this.Z == null) {
            T(0, 1);
            return;
        }
        int i = videoDecoderOutputBuffer.width;
        int i2 = videoDecoderOutputBuffer.height;
        icc iccVar = this.l0;
        v8b v8bVar = this.M;
        if (iccVar == null || iccVar.a != i || iccVar.b != i2) {
            icc iccVar2 = new icc(i, i2);
            this.l0 = iccVar2;
            v8bVar.q(iccVar2);
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
                    v8bVar.p(obj);
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
        w83 w83Var = this.r0;
        w83Var.h += i;
        int i4 = i + i2;
        w83Var.g += i4;
        this.n0 += i4;
        int i5 = this.o0 + i4;
        this.o0 = i5;
        w83Var.i = Math.max(i5, w83Var.i);
        int i6 = this.L;
        if (i6 <= 0 || (i3 = this.n0) < i6 || i3 <= 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.m0;
        int i7 = this.n0;
        v8b v8bVar = this.M;
        Handler handler = (Handler) v8bVar.b;
        if (handler != null) {
            handler.post(new ubc(v8bVar, i7, j));
        }
        this.n0 = 0;
        this.m0 = elapsedRealtime;
    }

    @Override // t83
    public final void a() {
        c64 c64Var = this.s0;
        if (c64Var != null) {
            c64Var.a();
        }
    }

    @Override // t83
    public final void c() {
        c64 c64Var = this.s0;
        if (c64Var != null) {
            c64Var.a();
        }
    }

    @Override // ug0, xc8
    public final void d(int i, Object obj) {
        int i2;
        Object obj2;
        if (i != 1) {
            if (i == 7) {
                this.a0 = (sac) obj;
                return;
            } else {
                if (i == 11) {
                    this.s0 = (c64) obj;
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
        v8b v8bVar = this.M;
        if (obj3 == obj) {
            if (obj != null) {
                icc iccVar = this.l0;
                if (iccVar != null) {
                    v8bVar.q(iccVar);
                }
                if (this.f0 != 3 || (obj2 = this.Y) == null) {
                    return;
                }
                v8bVar.p(obj2);
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
        icc iccVar2 = this.l0;
        if (iccVar2 != null) {
            v8bVar.q(iccVar2);
        }
        this.f0 = Math.min(this.f0, 1);
        if (this.n == 2) {
            long j = this.K;
            this.h0 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
    }

    @Override // ug0
    public final void f() {
        if (this.f0 == 0) {
            this.f0 = 1;
        }
    }

    @Override // ug0
    public final String l() {
        return "ExperimentalFfmpegVideoRenderer";
    }

    @Override // ug0
    public final boolean n() {
        return this.k0;
    }

    @Override // ug0
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

    @Override // ug0
    public final void q() {
        v8b v8bVar = this.M;
        this.Q = null;
        this.S = null;
        this.O.clear();
        this.V = -9223372036854775807L;
        this.l0 = null;
        this.f0 = Math.min(this.f0, 0);
        try {
            ir2.C(this.c0, null);
            this.c0 = null;
            Q();
        } finally {
            v8bVar.i(this.r0);
        }
    }

    @Override // ug0
    public final void r(boolean z, boolean z2) {
        w83 w83Var = new w83();
        this.r0 = w83Var;
        v8b v8bVar = this.M;
        Handler handler = (Handler) v8bVar.b;
        if (handler != null) {
            handler.post(new vbc(v8bVar, w83Var, (byte) 0));
        }
        this.f0 = z2 ? 1 : 0;
    }

    @Override // ug0
    public final void s(long j, boolean z, boolean z2) {
        this.j0 = false;
        this.k0 = false;
        ArrayDeque arrayDeque = this.O;
        if (!arrayDeque.isEmpty()) {
            this.S = (f93) arrayDeque.getLast();
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
        iq iqVar = this.N;
        if (iqVar.p() > 0) {
            this.i0 = true;
        }
        iqVar.c();
    }

    @Override // ug0
    public final void w() {
        this.n0 = 0;
        this.m0 = SystemClock.elapsedRealtime();
        this.q0 = g8c.T(SystemClock.elapsedRealtime());
    }

    @Override // ug0
    public final void x() {
        this.h0 = -9223372036854775807L;
        if (this.n0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.m0;
            int i = this.n0;
            v8b v8bVar = this.M;
            Handler handler = (Handler) v8bVar.b;
            if (handler != null) {
                handler.post(new ubc(v8bVar, i, j));
            }
            this.n0 = 0;
            this.m0 = elapsedRealtime;
        }
    }

    @Override // ug0
    public final void y(fm4[] fm4VarArr, long j, long j2, rx6 rx6Var) {
        ip9 ip9Var = this.r;
        ip9Var.getClass();
        int a = ip9Var.a();
        if (this.S != null) {
            ArrayDeque arrayDeque = this.O;
            if (!arrayDeque.isEmpty() || this.p0 != 0) {
                arrayDeque.add(new f93(a, this.V, j2, this.I));
                return;
            }
        }
        this.S = new f93(a, -9223372036854775807L, j2, this.I);
    }

    @Override // ug0
    public final void z() {
        ArrayDeque arrayDeque = this.O;
        f93 f93Var = !arrayDeque.isEmpty() ? (f93) arrayDeque.getLast() : this.S;
        if (f93Var != null) {
            f93Var.c = this.I;
        }
    }
}
