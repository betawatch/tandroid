package androidx.media3.decoder.ffmpeg;

import a8.yb;
import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import b2.a1;
import b2.w;
import b2.w0;
import b2.x;
import b6.i;
import c3.h0;
import e2.g0;
import e2.n0;
import f9.i0;
import h2.f;
import h2.h;
import h2.l;
import hi.u2;
import i2.b;
import i2.e;
import i2.q1;
import i2.x0;
import j2.j;
import jg.f1;
import k2.a0;
import k2.j0;
import k2.l0;
import k2.q;
import k2.r;
import k2.s0;
import k2.u0;
import k2.v;
import k2.z;
import n2.g;
import n4.s;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class FfmpegAudioRenderer extends b implements x0 {
    public final rf.b I;
    public final a0 J;
    public final h K;
    public e L;
    public x M;
    public int N;
    public int O;
    public boolean P;
    public FfmpegAudioDecoder Q;
    public h R;
    public SimpleDecoderOutputBuffer S;
    public g T;
    public g U;
    public int V;
    public boolean W;
    public boolean X;
    public long Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public long c0;
    public final long[] d0;
    public int e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public long i0;
    public long j0;
    public long k0;

    public FfmpegAudioRenderer(Handler handler, v vVar, a0 a0Var) {
        super(1);
        this.I = new rf.b(handler, vVar);
        this.J = a0Var;
        this.K = new h(0, 0);
        this.V = 0;
        this.X = true;
        L(-9223372036854775807L);
        this.d0 = new long[10];
        this.i0 = -9223372036854775807L;
        this.j0 = -9223372036854775807L;
        this.k0 = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (((k2.u0) r4).j(e2.n0.E(4, r2, r1)) != 0) goto L16;
     */
    @Override // i2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int C(x xVar) {
        int i10;
        String str = xVar.s;
        int i11 = xVar.L;
        int i12 = xVar.K;
        if (!w0.i(str)) {
            return h0.c(0, 0, 0, 0);
        }
        String str2 = xVar.s;
        str2.getClass();
        String str3 = FfmpegLibrary.a;
        if (w0.i(str2)) {
            if (FfmpegLibrary.d(str2)) {
                x E = n0.E(2, i12, i11);
                a0 a0Var = this.J;
                i10 = 4;
                if (((u0) a0Var).j(E) == 0) {
                }
                if (xVar.T != 0) {
                    i10 = 2;
                }
            }
            i10 = 1;
        } else {
            i10 = 0;
        }
        return i10 <= 2 ? h0.c(i10, 0, 0, 0) : i10 | 168;
    }

    @Override // i2.b
    public final int D() {
        return 8;
    }

    public final h2.e F(x xVar) {
        Trace.beginSection("createFfmpegAudioDecoder");
        int i10 = xVar.t;
        int i11 = xVar.L;
        int i12 = xVar.K;
        if (i10 == -1) {
            i10 = 5760;
        }
        x E = n0.E(2, i12, i11);
        a0 a0Var = this.J;
        boolean z10 = true;
        if (((u0) a0Var).j(E) != 0) {
            z10 = ((u0) a0Var).j(n0.E(4, i12, i11)) != 2 ? false : true ^ "audio/ac3".equals(xVar.s);
        }
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i10, xVar, z10);
        Trace.endSection();
        return ffmpegAudioDecoder;
    }

    public final boolean G() {
        if (this.S == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) this.Q.c();
            this.S = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer == null) {
                return false;
            }
            int i10 = simpleDecoderOutputBuffer.skippedOutputBufferCount;
            if (i10 > 0) {
                this.L.f += i10;
                ((u0) this.J).E = true;
            }
            if (simpleDecoderOutputBuffer.isFirstSample()) {
                long[] jArr = this.d0;
                ((u0) this.J).E = true;
                if (this.e0 != 0) {
                    L(jArr[0]);
                    int i11 = this.e0 - 1;
                    this.e0 = i11;
                    System.arraycopy(jArr, 1, jArr, 0, i11);
                }
            }
        }
        if (this.S.isEndOfStream()) {
            if (this.V == 2) {
                K();
                I();
                this.X = true;
                return false;
            }
            this.S.release();
            this.S = null;
            try {
                this.b0 = true;
                ((u0) this.J).t();
                this.k0 = this.j0;
                return false;
            } catch (z e) {
                throw d(e, e.c, e.b, 5002);
            }
        }
        this.k0 = -9223372036854775807L;
        if (this.X) {
            FfmpegAudioDecoder ffmpegAudioDecoder = this.Q;
            ffmpegAudioDecoder.getClass();
            w wVar = new w();
            wVar.r = w0.n("audio/raw");
            wVar.J = ffmpegAudioDecoder.u;
            wVar.K = ffmpegAudioDecoder.v;
            wVar.L = ffmpegAudioDecoder.q;
            w a2 = new x(wVar).a();
            a2.M = this.N;
            a2.N = this.O;
            x xVar = this.M;
            a2.k = xVar.l;
            a2.a = xVar.a;
            a2.b = xVar.b;
            a2.c = i0.u(xVar.c);
            x xVar2 = this.M;
            a2.d = xVar2.d;
            a2.e = xVar2.e;
            a2.f = xVar2.f;
            ((u0) this.J).c(new x(a2), null);
            this.X = false;
        }
        a0 a0Var = this.J;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.S;
        if (!((u0) a0Var).m(simpleDecoderOutputBuffer2.timeUs, 1, simpleDecoderOutputBuffer2.b)) {
            this.k0 = this.S.timeUs;
            return false;
        }
        this.L.e++;
        this.S.release();
        this.S = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r0 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H() {
        FfmpegAudioDecoder ffmpegAudioDecoder = this.Q;
        if (ffmpegAudioDecoder != null && this.V != 2 && !this.a0) {
            if (this.R == null) {
                h hVar = (h) ffmpegAudioDecoder.d();
                this.R = hVar;
            }
            if (this.V == 1) {
                this.R.setFlags(4);
                FfmpegAudioDecoder ffmpegAudioDecoder2 = this.Q;
                h hVar2 = this.R;
                ffmpegAudioDecoder2.getClass();
                ffmpegAudioDecoder2.e(hVar2);
                this.R = null;
                this.V = 2;
                return false;
            }
            s sVar = this.c;
            sVar.d();
            int w10 = w(sVar, this.R, 0);
            if (w10 == -5) {
                J(sVar);
                return true;
            }
            if (w10 == -4) {
                if (this.R.isEndOfStream()) {
                    this.a0 = true;
                    this.j0 = this.i0;
                    FfmpegAudioDecoder ffmpegAudioDecoder3 = this.Q;
                    h hVar3 = this.R;
                    ffmpegAudioDecoder3.getClass();
                    ffmpegAudioDecoder3.e(hVar3);
                    this.R = null;
                    return false;
                }
                if (!this.P) {
                    this.P = true;
                    this.R.addFlag(TLObject.FLAG_27);
                }
                this.i0 = this.R.e;
                if (k() || this.R.isLastSample()) {
                    this.j0 = this.i0;
                }
                this.R.d();
                h hVar4 = this.R;
                hVar4.a = this.M;
                FfmpegAudioDecoder ffmpegAudioDecoder4 = this.Q;
                ffmpegAudioDecoder4.getClass();
                ffmpegAudioDecoder4.e(hVar4);
                this.W = true;
                this.L.c++;
                this.R = null;
                return true;
            }
            if (w10 != -3) {
                throw new IllegalStateException();
            }
            if (k()) {
                this.j0 = this.i0;
                return false;
            }
        }
        return false;
    }

    public final void I() {
        rf.b bVar = this.I;
        if (this.Q != null) {
            return;
        }
        g gVar = this.U;
        ic.a.B(this.T, gVar);
        this.T = gVar;
        if (gVar != null && gVar.h() == null && this.T.g() == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Trace.beginSection("createAudioDecoder");
            h2.e F = F(this.M);
            this.Q = (FfmpegAudioDecoder) F;
            ((l) F).a(this.w);
            Trace.endSection();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            String name = this.Q.getName();
            long j10 = elapsedRealtime2 - elapsedRealtime;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new a3.h0(bVar, name, elapsedRealtime2, j10, 3));
            }
            this.L.a++;
        } catch (f e) {
            e2.a.d("DecoderAudioRenderer", "Audio codec error", e);
            Handler handler2 = (Handler) bVar.b;
            if (handler2 != null) {
                handler2.post(new r(bVar, e, 0));
            }
            throw d(e, this.M, false, 4001);
        } catch (OutOfMemoryError e10) {
            throw d(e10, this.M, false, 4001);
        }
    }

    public final void J(s sVar) {
        x xVar = (x) sVar.c;
        xVar.getClass();
        g gVar = (g) sVar.b;
        ic.a.B(this.U, gVar);
        this.U = gVar;
        x xVar2 = this.M;
        this.M = xVar;
        this.N = xVar.N;
        this.O = xVar.O;
        FfmpegAudioDecoder ffmpegAudioDecoder = this.Q;
        rf.b bVar = this.I;
        if (ffmpegAudioDecoder == null) {
            I();
            x xVar3 = this.M;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new f1(bVar, xVar3, (Object) null, 2));
                return;
            }
            return;
        }
        i2.f fVar = gVar != this.T ? new i2.f(ffmpegAudioDecoder.getName(), xVar2, xVar, 0, 128) : new i2.f(ffmpegAudioDecoder.getName(), xVar2, xVar, 0, 1);
        if (fVar.d == 0) {
            if (this.W) {
                this.V = 1;
            } else {
                K();
                I();
                this.X = true;
            }
        }
        x xVar4 = this.M;
        Handler handler2 = (Handler) bVar.b;
        if (handler2 != null) {
            handler2.post(new f1(bVar, xVar4, fVar, 2));
        }
    }

    public final void K() {
        this.R = null;
        this.S = null;
        this.V = 0;
        this.W = false;
        this.i0 = -9223372036854775807L;
        this.j0 = -9223372036854775807L;
        FfmpegAudioDecoder ffmpegAudioDecoder = this.Q;
        if (ffmpegAudioDecoder != null) {
            this.L.b++;
            ffmpegAudioDecoder.release();
            String name = this.Q.getName();
            rf.b bVar = this.I;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new u2(27, bVar, name));
            }
            this.Q = null;
        }
        ic.a.B(this.T, null);
        this.T = null;
    }

    public final void L(long j10) {
        this.c0 = j10;
        if (j10 != -9223372036854775807L) {
            this.J.getClass();
        }
    }

    public final void M() {
        l();
        long h = ((u0) this.J).h();
        if (h != Long.MIN_VALUE) {
            if (!this.Z) {
                h = Math.max(this.Y, h);
            }
            this.Y = h;
            this.Z = false;
        }
    }

    @Override // i2.x0
    public final long a() {
        if (this.n == 2) {
            M();
        }
        return this.Y;
    }

    @Override // i2.x0
    public final boolean b() {
        boolean z10 = this.f0;
        this.f0 = false;
        return z10;
    }

    @Override // i2.b, i2.m1
    public final void c(int i10, Object obj) {
        a0 a0Var = this.J;
        if (i10 == 2) {
            float floatValue = ((Float) obj).floatValue();
            u0 u0Var = (u0) a0Var;
            if (u0Var.H != floatValue) {
                u0Var.H = floatValue;
                if (u0Var.p()) {
                    u0Var.t.a.setVolume(u0Var.H);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            b2.f fVar = (b2.f) obj;
            u0 u0Var2 = (u0) a0Var;
            if (u0Var2.u.equals(fVar)) {
                return;
            }
            u0Var2.u = fVar;
            if (u0Var2.V) {
                return;
            }
            u0Var2.v();
            return;
        }
        if (i10 == 6) {
            ((u0) a0Var).A((b2.g) obj);
            return;
        }
        if (i10 == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            u0 u0Var3 = (u0) a0Var;
            u0Var3.T = audioDeviceInfo;
            j0 j0Var = u0Var3.t;
            if (j0Var != null) {
                j0Var.a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i10 == 9) {
            u0 u0Var4 = (u0) a0Var;
            u0Var4.y = ((Boolean) obj).booleanValue();
            s0 s0Var = new s0(u0Var4.D() ? a1.d : u0Var4.x, -9223372036854775807L, -9223372036854775807L);
            if (u0Var4.p()) {
                u0Var4.v = s0Var;
                return;
            } else {
                u0Var4.w = s0Var;
                return;
            }
        }
        if (i10 == 10) {
            ((u0) a0Var).z(((Integer) obj).intValue());
            return;
        }
        if (i10 != 19) {
            if (i10 != 20) {
                return;
            }
            obj.getClass();
            ((u0) a0Var).y((q) obj);
            return;
        }
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        u0 u0Var5 = (u0) a0Var;
        u0Var5.getClass();
        if (intValue == 0 || intValue == -1) {
            intValue = -1;
        }
        if (u0Var5.U == intValue) {
            return;
        }
        u0Var5.U = intValue;
        u0Var5.v();
    }

    @Override // i2.x0
    public final void f(a1 a1Var) {
        ((u0) this.J).C(a1Var);
    }

    @Override // i2.b
    public final long g(long j10, long j11) {
        u0 u0Var = (u0) this.J;
        boolean z10 = u0Var.n() && this.k0 != -9223372036854775807L;
        if (this.h0) {
            long g7 = u0Var.g();
            if (this.g0 && z10 && g7 != -9223372036854775807L) {
                return Math.max(10000L, (long) ((Math.min(g7, this.k0 - j10) / (h() != null ? h().a : 1.0f)) / 2.0f));
            }
        } else if (z10 || this.b0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // i2.x0
    public final a1 h() {
        return ((u0) this.J).x;
    }

    @Override // i2.b
    public final String j() {
        return "FfmpegAudioRenderer";
    }

    @Override // i2.b
    public final boolean l() {
        if (!this.b0) {
            return false;
        }
        u0 u0Var = (u0) this.J;
        if (u0Var.p()) {
            return u0Var.L && !u0Var.n();
        }
        return true;
    }

    @Override // i2.b
    public final boolean m() {
        return ((u0) this.J).n();
    }

    @Override // i2.b
    public final void n() {
        rf.b bVar = this.I;
        this.M = null;
        this.X = true;
        L(-9223372036854775807L);
        this.f0 = false;
        this.g0 = false;
        this.k0 = -9223372036854775807L;
        try {
            ic.a.B(this.U, null);
            this.U = null;
            K();
            ((u0) this.J).w();
        } finally {
            bVar.J(this.L);
        }
    }

    @Override // i2.b
    public final void o(boolean z10, boolean z11) {
        e eVar = new e();
        this.L = eVar;
        rf.b bVar = this.I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k2.s(bVar, eVar, 1));
        }
        q1 q1Var = this.d;
        q1Var.getClass();
        boolean z12 = q1Var.b;
        a0 a0Var = this.J;
        if (z12) {
            u0 u0Var = (u0) a0Var;
            yb.p(u0Var.P);
            if (!u0Var.V) {
                u0Var.V = true;
                u0Var.v();
            }
        } else {
            u0 u0Var2 = (u0) a0Var;
            if (u0Var2.V) {
                u0Var2.V = false;
                u0Var2.v();
            }
        }
        j jVar = this.f;
        jVar.getClass();
        u0 u0Var3 = (u0) a0Var;
        u0Var3.m = jVar;
        g0 g0Var = this.h;
        g0Var.getClass();
        ((l0) u0Var3.r).g = g0Var;
        u0Var3.n = new i(this, 28);
    }

    @Override // i2.b
    public final void p(long j10, boolean z10, boolean z11) {
        ((u0) this.J).f();
        this.Y = j10;
        this.k0 = -9223372036854775807L;
        this.f0 = false;
        this.g0 = false;
        this.Z = true;
        this.a0 = false;
        this.b0 = false;
        if (this.Q != null) {
            if (this.V != 0) {
                K();
                I();
                return;
            }
            this.R = null;
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.S;
            if (simpleDecoderOutputBuffer != null) {
                simpleDecoderOutputBuffer.release();
                this.S = null;
            }
            FfmpegAudioDecoder ffmpegAudioDecoder = this.Q;
            ffmpegAudioDecoder.getClass();
            ffmpegAudioDecoder.flush();
            ffmpegAudioDecoder.a(this.w);
            this.W = false;
        }
    }

    @Override // i2.b
    public final void s() {
        ((u0) this.J).r();
        this.h0 = true;
    }

    @Override // i2.b
    public final void t() {
        M();
        ((u0) this.J).q();
        this.h0 = false;
        this.g0 = false;
    }

    @Override // i2.b
    public final void u(x[] xVarArr, long j10, long j11, u2.g0 g0Var) {
        this.P = false;
        if (this.c0 == -9223372036854775807L) {
            L(j11);
            return;
        }
        int i10 = this.e0;
        long[] jArr = this.d0;
        if (i10 == jArr.length) {
            e2.a.l("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + jArr[this.e0 - 1]);
        } else {
            this.e0 = i10 + 1;
        }
        jArr[this.e0 - 1] = j11;
    }

    @Override // i2.b
    public final void x(long j10, long j11) {
        if (this.b0) {
            try {
                ((u0) this.J).t();
                this.k0 = this.j0;
                return;
            } catch (z e) {
                throw d(e, e.c, e.b, 5002);
            }
        }
        if (this.M == null) {
            s sVar = this.c;
            sVar.d();
            this.K.clear();
            int w10 = w(sVar, this.K, 2);
            if (w10 != -5) {
                if (w10 == -4) {
                    yb.p(this.K.isEndOfStream());
                    this.a0 = true;
                    try {
                        this.b0 = true;
                        ((u0) this.J).t();
                        this.k0 = this.j0;
                        return;
                    } catch (z e10) {
                        throw d(e10, null, false, 5002);
                    }
                }
                return;
            }
            J(sVar);
        }
        I();
        if (this.Q != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (G()) {
                }
                while (H()) {
                }
                Trace.endSection();
                synchronized (this.L) {
                }
            } catch (f e11) {
                e2.a.d("DecoderAudioRenderer", "Audio codec error", e11);
                rf.b bVar = this.I;
                Handler handler = (Handler) bVar.b;
                if (handler != null) {
                    handler.post(new r(bVar, e11, 0));
                }
                throw d(e11, this.M, false, 4003);
            } catch (k2.w e12) {
                throw d(e12, e12.a, false, 5001);
            } catch (k2.x e13) {
                throw d(e13, e13.b, e13.a, 5001);
            } catch (z e14) {
                throw d(e14, e14.c, e14.b, 5002);
            }
        }
    }

    @Override // i2.b
    public final x0 i() {
        return this;
    }
}
