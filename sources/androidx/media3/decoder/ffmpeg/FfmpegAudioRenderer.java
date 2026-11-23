package androidx.media3.decoder.ffmpeg;

import a8.ma;
import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import d3.e0;
import e2.s0;
import e2.t;
import e2.u;
import e2.w0;
import h2.g0;
import h2.l0;
import h9.i0;
import i5.c;
import j6.r;
import jb.m;
import k2.f;
import k2.h;
import k2.l;
import l2.b;
import l2.e;
import l2.n1;
import l2.u0;
import m2.i;
import n2.h0;
import n2.j0;
import n2.o;
import n2.p;
import n2.q;
import n2.q0;
import n2.s;
import n2.w;
import n2.x;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import q2.g;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class FfmpegAudioRenderer extends b implements u0 {
    public final m J;
    public final x K;
    public final h L;
    public e M;
    public u N;
    public int O;
    public int P;
    public boolean Q;
    public FfmpegAudioDecoder R;
    public h S;
    public SimpleDecoderOutputBuffer T;
    public g U;
    public g V;
    public int W;
    public boolean X;
    public boolean Y;
    public long Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public long d0;
    public final long[] e0;
    public int f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public long j0;
    public long k0;
    public long l0;

    public FfmpegAudioRenderer(Handler handler, s sVar, x xVar) {
        super(1);
        this.J = new m(handler, sVar);
        this.K = xVar;
        this.L = new h(0, 0);
        this.W = 0;
        this.Y = true;
        L(-9223372036854775807L);
        this.e0 = new long[10];
        this.j0 = -9223372036854775807L;
        this.k0 = -9223372036854775807L;
        this.l0 = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (((n2.s0) r4).j(h2.l0.E(4, r2, r1)) != 0) goto L16;
     */
    @Override // l2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int C(u uVar) {
        int i7;
        String str = uVar.s;
        int i10 = uVar.L;
        int i11 = uVar.K;
        if (!s0.i(str)) {
            return c.a(0, 0, 0, 0);
        }
        String str2 = uVar.s;
        str2.getClass();
        String str3 = FfmpegLibrary.a;
        if (s0.i(str2)) {
            if (FfmpegLibrary.d(str2)) {
                u E = l0.E(2, i11, i10);
                x xVar = this.K;
                i7 = 4;
                if (((n2.s0) xVar).j(E) == 0) {
                }
                if (uVar.T != 0) {
                    i7 = 2;
                }
            }
            i7 = 1;
        } else {
            i7 = 0;
        }
        return i7 <= 2 ? c.a(i7, 0, 0, 0) : i7 | ks.y2;
    }

    @Override // l2.b
    public final int D() {
        return 8;
    }

    public final k2.e F(u uVar) {
        Trace.beginSection("createFfmpegAudioDecoder");
        int i7 = uVar.t;
        int i10 = uVar.L;
        int i11 = uVar.K;
        if (i7 == -1) {
            i7 = 5760;
        }
        u E = l0.E(2, i11, i10);
        x xVar = this.K;
        boolean z10 = true;
        if (((n2.s0) xVar).j(E) != 0) {
            z10 = ((n2.s0) xVar).j(l0.E(4, i11, i10)) != 2 ? false : true ^ "audio/ac3".equals(uVar.s);
        }
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i7, uVar, z10);
        Trace.endSection();
        return ffmpegAudioDecoder;
    }

    public final boolean G() {
        if (this.T == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) this.R.c();
            this.T = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer == null) {
                return false;
            }
            int i7 = simpleDecoderOutputBuffer.skippedOutputBufferCount;
            if (i7 > 0) {
                this.M.f += i7;
                ((n2.s0) this.K).E = true;
            }
            if (simpleDecoderOutputBuffer.isFirstSample()) {
                long[] jArr = this.e0;
                ((n2.s0) this.K).E = true;
                if (this.f0 != 0) {
                    L(jArr[0]);
                    int i10 = this.f0 - 1;
                    this.f0 = i10;
                    System.arraycopy(jArr, 1, jArr, 0, i10);
                }
            }
        }
        if (this.T.isEndOfStream()) {
            if (this.W == 2) {
                K();
                I();
                this.Y = true;
                return false;
            }
            this.T.release();
            this.T = null;
            try {
                this.c0 = true;
                ((n2.s0) this.K).t();
                this.l0 = this.k0;
                return false;
            } catch (w e10) {
                throw d(e10, e10.c, e10.b, 5002);
            }
        }
        this.l0 = -9223372036854775807L;
        if (this.Y) {
            FfmpegAudioDecoder ffmpegAudioDecoder = this.R;
            ffmpegAudioDecoder.getClass();
            t tVar = new t();
            tVar.r = s0.n("audio/raw");
            tVar.J = ffmpegAudioDecoder.u;
            tVar.K = ffmpegAudioDecoder.v;
            tVar.L = ffmpegAudioDecoder.q;
            t a10 = new u(tVar).a();
            a10.M = this.O;
            a10.N = this.P;
            u uVar = this.N;
            a10.k = uVar.l;
            a10.a = uVar.a;
            a10.b = uVar.b;
            a10.c = i0.q(uVar.c);
            u uVar2 = this.N;
            a10.d = uVar2.d;
            a10.e = uVar2.e;
            a10.f = uVar2.f;
            ((n2.s0) this.K).c(new u(a10), null);
            this.Y = false;
        }
        x xVar = this.K;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.T;
        if (!((n2.s0) xVar).m(simpleDecoderOutputBuffer2.timeUs, 1, simpleDecoderOutputBuffer2.b)) {
            this.l0 = this.T.timeUs;
            return false;
        }
        this.M.e++;
        this.T.release();
        this.T = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r0 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H() {
        FfmpegAudioDecoder ffmpegAudioDecoder = this.R;
        if (ffmpegAudioDecoder != null && this.W != 2 && !this.b0) {
            if (this.S == null) {
                h hVar = (h) ffmpegAudioDecoder.d();
                this.S = hVar;
            }
            if (this.W == 1) {
                this.S.setFlags(4);
                FfmpegAudioDecoder ffmpegAudioDecoder2 = this.R;
                h hVar2 = this.S;
                ffmpegAudioDecoder2.getClass();
                ffmpegAudioDecoder2.e(hVar2);
                this.S = null;
                this.W = 2;
                return false;
            }
            m mVar = this.c;
            mVar.T();
            int w10 = w(mVar, this.S, 0);
            if (w10 == -5) {
                J(mVar);
                return true;
            }
            if (w10 == -4) {
                if (this.S.isEndOfStream()) {
                    this.b0 = true;
                    this.k0 = this.j0;
                    FfmpegAudioDecoder ffmpegAudioDecoder3 = this.R;
                    h hVar3 = this.S;
                    ffmpegAudioDecoder3.getClass();
                    ffmpegAudioDecoder3.e(hVar3);
                    this.S = null;
                    return false;
                }
                if (!this.Q) {
                    this.Q = true;
                    this.S.addFlag(TLObject.FLAG_27);
                }
                this.j0 = this.S.e;
                if (j() || this.S.isLastSample()) {
                    this.k0 = this.j0;
                }
                this.S.c();
                h hVar4 = this.S;
                hVar4.a = this.N;
                FfmpegAudioDecoder ffmpegAudioDecoder4 = this.R;
                ffmpegAudioDecoder4.getClass();
                ffmpegAudioDecoder4.e(hVar4);
                this.X = true;
                this.M.c++;
                this.S = null;
                return true;
            }
            if (w10 != -3) {
                throw new IllegalStateException();
            }
            if (j()) {
                this.k0 = this.j0;
                return false;
            }
        }
        return false;
    }

    public final void I() {
        m mVar = this.J;
        if (this.R != null) {
            return;
        }
        g gVar = this.V;
        p5.c.w(this.U, gVar);
        this.U = gVar;
        if (gVar != null && gVar.h() == null && this.U.g() == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Trace.beginSection("createAudioDecoder");
            k2.e F = F(this.N);
            this.R = (FfmpegAudioDecoder) F;
            ((l) F).a(this.x);
            Trace.endSection();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            String name = this.R.getName();
            long j3 = elapsedRealtime2 - elapsedRealtime;
            Handler handler = (Handler) mVar.b;
            if (handler != null) {
                handler.post(new e0(mVar, name, elapsedRealtime2, j3, 4));
            }
            this.M.a++;
        } catch (OutOfMemoryError e10) {
            throw d(e10, this.N, false, 4001);
        } catch (f e11) {
            h2.a.d("DecoderAudioRenderer", "Audio codec error", e11);
            Handler handler2 = (Handler) mVar.b;
            if (handler2 != null) {
                handler2.post(new p(mVar, e11, 0));
            }
            throw d(e11, this.N, false, 4001);
        }
    }

    public final void J(m mVar) {
        u uVar = (u) mVar.c;
        uVar.getClass();
        g gVar = (g) mVar.b;
        p5.c.w(this.V, gVar);
        this.V = gVar;
        u uVar2 = this.N;
        this.N = uVar;
        this.O = uVar.N;
        this.P = uVar.O;
        FfmpegAudioDecoder ffmpegAudioDecoder = this.R;
        m mVar2 = this.J;
        if (ffmpegAudioDecoder == null) {
            I();
            u uVar3 = this.N;
            Handler handler = (Handler) mVar2.b;
            if (handler != null) {
                handler.post(new kg.x(mVar2, uVar3, (Object) null, 14));
                return;
            }
            return;
        }
        l2.f fVar = gVar != this.U ? new l2.f(ffmpegAudioDecoder.getName(), uVar2, uVar, 0, 128) : new l2.f(ffmpegAudioDecoder.getName(), uVar2, uVar, 0, 1);
        if (fVar.d == 0) {
            if (this.X) {
                this.W = 1;
            } else {
                K();
                I();
                this.Y = true;
            }
        }
        u uVar4 = this.N;
        Handler handler2 = (Handler) mVar2.b;
        if (handler2 != null) {
            handler2.post(new kg.x(mVar2, uVar4, fVar, 14));
        }
    }

    public final void K() {
        this.S = null;
        this.T = null;
        this.W = 0;
        this.X = false;
        this.j0 = -9223372036854775807L;
        this.k0 = -9223372036854775807L;
        FfmpegAudioDecoder ffmpegAudioDecoder = this.R;
        if (ffmpegAudioDecoder != null) {
            this.M.b++;
            ffmpegAudioDecoder.release();
            String name = this.R.getName();
            m mVar = this.J;
            Handler handler = (Handler) mVar.b;
            if (handler != null) {
                handler.post(new ji.f(27, mVar, name));
            }
            this.R = null;
        }
        p5.c.w(this.U, null);
        this.U = null;
    }

    public final void L(long j3) {
        this.d0 = j3;
        if (j3 != -9223372036854775807L) {
            this.K.getClass();
        }
    }

    public final void M() {
        k();
        long h = ((n2.s0) this.K).h();
        if (h != Long.MIN_VALUE) {
            if (!this.a0) {
                h = Math.max(this.Z, h);
            }
            this.Z = h;
            this.a0 = false;
        }
    }

    @Override // l2.u0
    public final long a() {
        if (this.n == 2) {
            M();
        }
        return this.Z;
    }

    @Override // l2.u0
    public final boolean b() {
        boolean z10 = this.g0;
        this.g0 = false;
        return z10;
    }

    @Override // l2.b, l2.j1
    public final void c(int i7, Object obj) {
        x xVar = this.K;
        if (i7 == 2) {
            float floatValue = ((Float) obj).floatValue();
            n2.s0 s0Var = (n2.s0) xVar;
            if (s0Var.H != floatValue) {
                s0Var.H = floatValue;
                if (s0Var.p()) {
                    s0Var.t.a.setVolume(s0Var.H);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 3) {
            e2.e eVar = (e2.e) obj;
            n2.s0 s0Var2 = (n2.s0) xVar;
            if (s0Var2.u.equals(eVar)) {
                return;
            }
            s0Var2.u = eVar;
            if (s0Var2.V) {
                return;
            }
            s0Var2.v();
            return;
        }
        if (i7 == 6) {
            ((n2.s0) xVar).A((e2.f) obj);
            return;
        }
        if (i7 == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            n2.s0 s0Var3 = (n2.s0) xVar;
            s0Var3.T = audioDeviceInfo;
            h0 h0Var = s0Var3.t;
            if (h0Var != null) {
                h0Var.a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i7 == 9) {
            n2.s0 s0Var4 = (n2.s0) xVar;
            s0Var4.y = ((Boolean) obj).booleanValue();
            q0 q0Var = new q0(s0Var4.D() ? w0.d : s0Var4.x, -9223372036854775807L, -9223372036854775807L);
            if (s0Var4.p()) {
                s0Var4.v = q0Var;
                return;
            } else {
                s0Var4.w = q0Var;
                return;
            }
        }
        if (i7 == 10) {
            ((n2.s0) xVar).z(((Integer) obj).intValue());
            return;
        }
        if (i7 != 19) {
            if (i7 != 20) {
                return;
            }
            obj.getClass();
            ((n2.s0) xVar).y((o) obj);
            return;
        }
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        n2.s0 s0Var5 = (n2.s0) xVar;
        s0Var5.getClass();
        if (intValue == 0 || intValue == -1) {
            intValue = -1;
        }
        if (s0Var5.U == intValue) {
            return;
        }
        s0Var5.U = intValue;
        s0Var5.v();
    }

    @Override // l2.u0
    public final void e(w0 w0Var) {
        ((n2.s0) this.K).C(w0Var);
    }

    @Override // l2.b
    public final long g(long j3, long j10) {
        n2.s0 s0Var = (n2.s0) this.K;
        boolean z10 = s0Var.n() && this.l0 != -9223372036854775807L;
        if (this.i0) {
            long g10 = s0Var.g();
            if (this.h0 && z10 && g10 != -9223372036854775807L) {
                return Math.max(10000L, (long) ((Math.min(g10, this.l0 - j3) / (l() != null ? l().a : 1.0f)) / 2.0f));
            }
        } else if (z10 || this.c0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // l2.b
    public final String i() {
        return "FfmpegAudioRenderer";
    }

    @Override // l2.b
    public final boolean k() {
        if (!this.c0) {
            return false;
        }
        n2.s0 s0Var = (n2.s0) this.K;
        if (s0Var.p()) {
            return s0Var.L && !s0Var.n();
        }
        return true;
    }

    @Override // l2.u0
    public final w0 l() {
        return ((n2.s0) this.K).x;
    }

    @Override // l2.b
    public final boolean m() {
        return ((n2.s0) this.K).n();
    }

    @Override // l2.b
    public final void n() {
        m mVar = this.J;
        this.N = null;
        this.Y = true;
        L(-9223372036854775807L);
        this.g0 = false;
        this.h0 = false;
        this.l0 = -9223372036854775807L;
        try {
            p5.c.w(this.V, null);
            this.V = null;
            K();
            ((n2.s0) this.K).w();
        } finally {
            mVar.U(this.M);
        }
    }

    @Override // l2.b
    public final void o(boolean z10, boolean z11) {
        e eVar = new e();
        this.M = eVar;
        m mVar = this.J;
        Handler handler = (Handler) mVar.b;
        if (handler != null) {
            handler.post(new q(mVar, eVar, 1));
        }
        n1 n1Var = this.d;
        n1Var.getClass();
        boolean z12 = n1Var.b;
        x xVar = this.K;
        if (z12) {
            n2.s0 s0Var = (n2.s0) xVar;
            ma.p(s0Var.P);
            if (!s0Var.V) {
                s0Var.V = true;
                s0Var.v();
            }
        } else {
            n2.s0 s0Var2 = (n2.s0) xVar;
            if (s0Var2.V) {
                s0Var2.V = false;
                s0Var2.v();
            }
        }
        i iVar = this.f;
        iVar.getClass();
        n2.s0 s0Var3 = (n2.s0) xVar;
        s0Var3.m = iVar;
        g0 g0Var = this.h;
        g0Var.getClass();
        ((j0) s0Var3.r).g = g0Var;
        s0Var3.n = new r(this, 10);
    }

    @Override // l2.b
    public final void p(long j3, boolean z10, boolean z11) {
        ((n2.s0) this.K).f();
        this.Z = j3;
        this.l0 = -9223372036854775807L;
        this.g0 = false;
        this.h0 = false;
        this.a0 = true;
        this.b0 = false;
        this.c0 = false;
        if (this.R != null) {
            if (this.W != 0) {
                K();
                I();
                return;
            }
            this.S = null;
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.T;
            if (simpleDecoderOutputBuffer != null) {
                simpleDecoderOutputBuffer.release();
                this.T = null;
            }
            FfmpegAudioDecoder ffmpegAudioDecoder = this.R;
            ffmpegAudioDecoder.getClass();
            ffmpegAudioDecoder.flush();
            ffmpegAudioDecoder.a(this.x);
            this.X = false;
        }
    }

    @Override // l2.b
    public final void s() {
        ((n2.s0) this.K).r();
        this.i0 = true;
    }

    @Override // l2.b
    public final void t() {
        M();
        ((n2.s0) this.K).q();
        this.i0 = false;
        this.h0 = false;
    }

    @Override // l2.b
    public final void u(u[] uVarArr, long j3, long j10, x2.g0 g0Var) {
        this.Q = false;
        if (this.d0 == -9223372036854775807L) {
            L(j10);
            return;
        }
        int i7 = this.f0;
        long[] jArr = this.e0;
        if (i7 == jArr.length) {
            h2.a.l("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + jArr[this.f0 - 1]);
        } else {
            this.f0 = i7 + 1;
        }
        jArr[this.f0 - 1] = j10;
    }

    @Override // l2.b
    public final void x(long j3, long j10) {
        if (this.c0) {
            try {
                ((n2.s0) this.K).t();
                this.l0 = this.k0;
                return;
            } catch (w e10) {
                throw d(e10, e10.c, e10.b, 5002);
            }
        }
        if (this.N == null) {
            m mVar = this.c;
            mVar.T();
            this.L.clear();
            int w10 = w(mVar, this.L, 2);
            if (w10 != -5) {
                if (w10 == -4) {
                    ma.p(this.L.isEndOfStream());
                    this.b0 = true;
                    try {
                        this.c0 = true;
                        ((n2.s0) this.K).t();
                        this.l0 = this.k0;
                        return;
                    } catch (w e11) {
                        throw d(e11, null, false, 5002);
                    }
                }
                return;
            }
            J(mVar);
        }
        I();
        if (this.R != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (G()) {
                }
                while (H()) {
                }
                Trace.endSection();
                synchronized (this.M) {
                }
            } catch (f e12) {
                h2.a.d("DecoderAudioRenderer", "Audio codec error", e12);
                m mVar2 = this.J;
                Handler handler = (Handler) mVar2.b;
                if (handler != null) {
                    handler.post(new p(mVar2, e12, 0));
                }
                throw d(e12, this.N, false, 4003);
            } catch (n2.t e13) {
                throw d(e13, e13.a, false, 5001);
            } catch (n2.u e14) {
                throw d(e14, e14.b, e14.a, 5001);
            } catch (w e15) {
                throw d(e15, e15.c, e15.b, 5002);
            }
        }
    }

    @Override // l2.b
    public final u0 h() {
        return this;
    }
}
