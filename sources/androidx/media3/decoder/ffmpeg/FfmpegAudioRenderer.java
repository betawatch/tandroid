package androidx.media3.decoder.ffmpeg;

import a8.ja;
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
import h2.l0;
import h9.i0;
import i5.c;
import k2.e;
import k2.f;
import k2.h;
import k2.l;
import kg.t1;
import ki.n;
import l2.b;
import l2.d;
import l2.m1;
import l2.t0;
import m2.j;
import n2.g0;
import n2.o;
import n2.p;
import n2.p0;
import n2.q;
import n2.r0;
import n2.s;
import n2.w;
import n2.x;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.y0;
import x2.f0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class FfmpegAudioRenderer extends b implements t0 {
    public final k8.a J;
    public final x K;
    public final h L;
    public d M;
    public u N;
    public int O;
    public int P;
    public boolean Q;
    public FfmpegAudioDecoder R;
    public h S;
    public SimpleDecoderOutputBuffer T;
    public q2.h U;
    public q2.h V;
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
        this.J = new k8.a(handler, sVar);
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
    
        if (((n2.r0) r4).j(h2.l0.E(4, r2, r1)) != 0) goto L16;
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
                if (((r0) xVar).j(E) == 0) {
                }
                if (uVar.T != 0) {
                    i7 = 2;
                }
            }
            i7 = 1;
        } else {
            i7 = 0;
        }
        return i7 <= 2 ? c.a(i7, 0, 0, 0) : i7 | ns.y2;
    }

    @Override // l2.b
    public final int D() {
        return 8;
    }

    public final e F(u uVar) {
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
        if (((r0) xVar).j(E) != 0) {
            z10 = ((r0) xVar).j(l0.E(4, i11, i10)) != 2 ? false : true ^ "audio/ac3".equals(uVar.s);
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
                ((r0) this.K).E = true;
            }
            if (simpleDecoderOutputBuffer.isFirstSample()) {
                long[] jArr = this.e0;
                ((r0) this.K).E = true;
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
                ((r0) this.K).t();
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
            ((r0) this.K).c(new u(a10), null);
            this.Y = false;
        }
        x xVar = this.K;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.T;
        if (!((r0) xVar).m(simpleDecoderOutputBuffer2.timeUs, 1, simpleDecoderOutputBuffer2.b)) {
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
            k8.a aVar = this.c;
            aVar.x0();
            int w10 = w(aVar, this.S, 0);
            if (w10 == -5) {
                J(aVar);
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
                if (k() || this.S.isLastSample()) {
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
            if (k()) {
                this.k0 = this.j0;
                return false;
            }
        }
        return false;
    }

    public final void I() {
        k8.a aVar = this.J;
        if (this.R != null) {
            return;
        }
        q2.h hVar = this.V;
        y0.C(this.U, hVar);
        this.U = hVar;
        if (hVar != null && hVar.h() == null && this.U.g() == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Trace.beginSection("createAudioDecoder");
            e F = F(this.N);
            this.R = (FfmpegAudioDecoder) F;
            ((l) F).a(this.x);
            Trace.endSection();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            String name = this.R.getName();
            long j3 = elapsedRealtime2 - elapsedRealtime;
            Handler handler = (Handler) aVar.b;
            if (handler != null) {
                handler.post(new e0(aVar, name, elapsedRealtime2, j3, 3));
            }
            this.M.a++;
        } catch (OutOfMemoryError e10) {
            throw d(e10, this.N, false, 4001);
        } catch (f e11) {
            h2.a.d("DecoderAudioRenderer", "Audio codec error", e11);
            Handler handler2 = (Handler) aVar.b;
            if (handler2 != null) {
                handler2.post(new p(aVar, e11, 0));
            }
            throw d(e11, this.N, false, 4001);
        }
    }

    public final void J(k8.a aVar) {
        u uVar = (u) aVar.c;
        uVar.getClass();
        q2.h hVar = (q2.h) aVar.b;
        y0.C(this.V, hVar);
        this.V = hVar;
        u uVar2 = this.N;
        this.N = uVar;
        this.O = uVar.N;
        this.P = uVar.O;
        FfmpegAudioDecoder ffmpegAudioDecoder = this.R;
        k8.a aVar2 = this.J;
        if (ffmpegAudioDecoder == null) {
            I();
            u uVar3 = this.N;
            Handler handler = (Handler) aVar2.b;
            if (handler != null) {
                handler.post(new n(aVar2, uVar3, null, 8));
                return;
            }
            return;
        }
        l2.e eVar = hVar != this.U ? new l2.e(ffmpegAudioDecoder.getName(), uVar2, uVar, 0, 128) : new l2.e(ffmpegAudioDecoder.getName(), uVar2, uVar, 0, 1);
        if (eVar.d == 0) {
            if (this.X) {
                this.W = 1;
            } else {
                K();
                I();
                this.Y = true;
            }
        }
        u uVar4 = this.N;
        Handler handler2 = (Handler) aVar2.b;
        if (handler2 != null) {
            handler2.post(new n(aVar2, uVar4, eVar, 8));
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
            k8.a aVar = this.J;
            Handler handler = (Handler) aVar.b;
            if (handler != null) {
                handler.post(new t1(20, aVar, name));
            }
            this.R = null;
        }
        y0.C(this.U, null);
        this.U = null;
    }

    public final void L(long j3) {
        this.d0 = j3;
        if (j3 != -9223372036854775807L) {
            this.K.getClass();
        }
    }

    public final void M() {
        l();
        long h = ((r0) this.K).h();
        if (h != Long.MIN_VALUE) {
            if (!this.a0) {
                h = Math.max(this.Z, h);
            }
            this.Z = h;
            this.a0 = false;
        }
    }

    @Override // l2.t0
    public final long a() {
        if (this.n == 2) {
            M();
        }
        return this.Z;
    }

    @Override // l2.t0
    public final boolean b() {
        boolean z10 = this.g0;
        this.g0 = false;
        return z10;
    }

    @Override // l2.b, l2.i1
    public final void c(int i7, Object obj) {
        x xVar = this.K;
        if (i7 == 2) {
            float floatValue = ((Float) obj).floatValue();
            r0 r0Var = (r0) xVar;
            if (r0Var.H != floatValue) {
                r0Var.H = floatValue;
                if (r0Var.p()) {
                    r0Var.t.a.setVolume(r0Var.H);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 3) {
            e2.e eVar = (e2.e) obj;
            r0 r0Var2 = (r0) xVar;
            if (r0Var2.u.equals(eVar)) {
                return;
            }
            r0Var2.u = eVar;
            if (r0Var2.V) {
                return;
            }
            r0Var2.v();
            return;
        }
        if (i7 == 6) {
            ((r0) xVar).A((e2.f) obj);
            return;
        }
        if (i7 == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            r0 r0Var3 = (r0) xVar;
            r0Var3.T = audioDeviceInfo;
            g0 g0Var = r0Var3.t;
            if (g0Var != null) {
                g0Var.a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i7 == 9) {
            r0 r0Var4 = (r0) xVar;
            r0Var4.y = ((Boolean) obj).booleanValue();
            p0 p0Var = new p0(r0Var4.D() ? w0.d : r0Var4.x, -9223372036854775807L, -9223372036854775807L);
            if (r0Var4.p()) {
                r0Var4.v = p0Var;
                return;
            } else {
                r0Var4.w = p0Var;
                return;
            }
        }
        if (i7 == 10) {
            ((r0) xVar).z(((Integer) obj).intValue());
            return;
        }
        if (i7 != 19) {
            if (i7 != 20) {
                return;
            }
            obj.getClass();
            ((r0) xVar).y((o) obj);
            return;
        }
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        r0 r0Var5 = (r0) xVar;
        r0Var5.getClass();
        if (intValue == 0 || intValue == -1) {
            intValue = -1;
        }
        if (r0Var5.U == intValue) {
            return;
        }
        r0Var5.U = intValue;
        r0Var5.v();
    }

    @Override // l2.t0
    public final void e(w0 w0Var) {
        ((r0) this.K).C(w0Var);
    }

    @Override // l2.b
    public final long g(long j3, long j10) {
        r0 r0Var = (r0) this.K;
        boolean z10 = r0Var.n() && this.l0 != -9223372036854775807L;
        if (this.i0) {
            long g10 = r0Var.g();
            if (this.h0 && z10 && g10 != -9223372036854775807L) {
                return Math.max(10000L, (long) ((Math.min(g10, this.l0 - j3) / (j() != null ? j().a : 1.0f)) / 2.0f));
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

    @Override // l2.t0
    public final w0 j() {
        return ((r0) this.K).x;
    }

    @Override // l2.b
    public final boolean l() {
        if (!this.c0) {
            return false;
        }
        r0 r0Var = (r0) this.K;
        if (r0Var.p()) {
            return r0Var.L && !r0Var.n();
        }
        return true;
    }

    @Override // l2.b
    public final boolean m() {
        return ((r0) this.K).n();
    }

    @Override // l2.b
    public final void n() {
        k8.a aVar = this.J;
        this.N = null;
        this.Y = true;
        L(-9223372036854775807L);
        this.g0 = false;
        this.h0 = false;
        this.l0 = -9223372036854775807L;
        try {
            y0.C(this.V, null);
            this.V = null;
            K();
            ((r0) this.K).w();
        } finally {
            aVar.D0(this.M);
        }
    }

    @Override // l2.b
    public final void o(boolean z10, boolean z11) {
        d dVar = new d();
        this.M = dVar;
        k8.a aVar = this.J;
        Handler handler = (Handler) aVar.b;
        if (handler != null) {
            handler.post(new q(aVar, dVar, 1));
        }
        m1 m1Var = this.d;
        m1Var.getClass();
        boolean z12 = m1Var.b;
        x xVar = this.K;
        if (z12) {
            r0 r0Var = (r0) xVar;
            ja.p(r0Var.P);
            if (!r0Var.V) {
                r0Var.V = true;
                r0Var.v();
            }
        } else {
            r0 r0Var2 = (r0) xVar;
            if (r0Var2.V) {
                r0Var2.V = false;
                r0Var2.v();
            }
        }
        j jVar = this.f;
        jVar.getClass();
        r0 r0Var3 = (r0) xVar;
        r0Var3.m = jVar;
        h2.g0 g0Var = this.h;
        g0Var.getClass();
        ((n2.i0) r0Var3.r).g = g0Var;
        r0Var3.n = new hi.l0(this, 14);
    }

    @Override // l2.b
    public final void p(long j3, boolean z10, boolean z11) {
        ((r0) this.K).f();
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
        ((r0) this.K).r();
        this.i0 = true;
    }

    @Override // l2.b
    public final void t() {
        M();
        ((r0) this.K).q();
        this.i0 = false;
        this.h0 = false;
    }

    @Override // l2.b
    public final void u(u[] uVarArr, long j3, long j10, f0 f0Var) {
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
                ((r0) this.K).t();
                this.l0 = this.k0;
                return;
            } catch (w e10) {
                throw d(e10, e10.c, e10.b, 5002);
            }
        }
        if (this.N == null) {
            k8.a aVar = this.c;
            aVar.x0();
            this.L.clear();
            int w10 = w(aVar, this.L, 2);
            if (w10 != -5) {
                if (w10 == -4) {
                    ja.p(this.L.isEndOfStream());
                    this.b0 = true;
                    try {
                        this.c0 = true;
                        ((r0) this.K).t();
                        this.l0 = this.k0;
                        return;
                    } catch (w e11) {
                        throw d(e11, null, false, 5002);
                    }
                }
                return;
            }
            J(aVar);
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
                k8.a aVar2 = this.J;
                Handler handler = (Handler) aVar2.b;
                if (handler != null) {
                    handler.post(new p(aVar2, e12, 0));
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
    public final t0 h() {
        return this;
    }
}
