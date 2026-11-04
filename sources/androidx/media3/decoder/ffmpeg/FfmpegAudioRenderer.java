package androidx.media3.decoder.ffmpeg;

import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import b8.zb;
import c3.f0;
import d2.u0;
import d2.v;
import d2.y0;
import g2.n0;
import g9.i0;
import gi.w5;
import j2.e;
import j2.f;
import j2.h;
import j2.l;
import k2.b;
import k2.d;
import k2.p1;
import k2.q1;
import k2.w0;
import l2.k;
import m2.h0;
import m2.j0;
import m2.o;
import m2.p;
import m2.q;
import m2.q0;
import m2.s0;
import m2.t;
import m2.u;
import m2.w;
import m2.y;
import m2.z;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.f1;
import p2.g;
import w2.g0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class FfmpegAudioRenderer extends b implements w0 {
    public final t J;
    public final z K;
    public final h L;
    public d M;
    public v N;
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

    public FfmpegAudioRenderer(Handler handler, u uVar, z zVar) {
        super(1);
        this.J = new t(handler, uVar);
        this.K = zVar;
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
    
        if (((m2.s0) r4).j(g2.n0.E(4, r2, r1)) != 0) goto L16;
     */
    @Override // k2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int C(v vVar) {
        int i3;
        String str = vVar.s;
        int i10 = vVar.L;
        int i11 = vVar.K;
        if (!u0.i(str)) {
            return p1.a(0, 0, 0, 0);
        }
        String str2 = vVar.s;
        str2.getClass();
        String str3 = FfmpegLibrary.a;
        if (u0.i(str2)) {
            if (FfmpegLibrary.d(str2)) {
                v E = n0.E(2, i11, i10);
                z zVar = this.K;
                i3 = 4;
                if (((s0) zVar).j(E) == 0) {
                }
                if (vVar.T != 0) {
                    i3 = 2;
                }
            }
            i3 = 1;
        } else {
            i3 = 0;
        }
        return i3 <= 2 ? p1.a(i3, 0, 0, 0) : i3 | hs.y2;
    }

    @Override // k2.b
    public final int D() {
        return 8;
    }

    public final e F(v vVar) {
        Trace.beginSection("createFfmpegAudioDecoder");
        int i3 = vVar.t;
        int i10 = vVar.L;
        int i11 = vVar.K;
        if (i3 == -1) {
            i3 = 5760;
        }
        v E = n0.E(2, i11, i10);
        z zVar = this.K;
        boolean z10 = true;
        if (((s0) zVar).j(E) != 0) {
            z10 = ((s0) zVar).j(n0.E(4, i11, i10)) != 2 ? false : true ^ "audio/ac3".equals(vVar.s);
        }
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i3, vVar, z10);
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
            int i3 = simpleDecoderOutputBuffer.skippedOutputBufferCount;
            if (i3 > 0) {
                this.M.f += i3;
                ((s0) this.K).E = true;
            }
            if (simpleDecoderOutputBuffer.isFirstSample()) {
                long[] jArr = this.e0;
                ((s0) this.K).E = true;
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
                ((s0) this.K).t();
                this.l0 = this.k0;
                return false;
            } catch (y e10) {
                throw e(e10, e10.c, e10.b, 5002);
            }
        }
        this.l0 = -9223372036854775807L;
        if (this.Y) {
            FfmpegAudioDecoder ffmpegAudioDecoder = this.R;
            ffmpegAudioDecoder.getClass();
            d2.u uVar = new d2.u();
            uVar.r = u0.n("audio/raw");
            uVar.J = ffmpegAudioDecoder.u;
            uVar.K = ffmpegAudioDecoder.v;
            uVar.L = ffmpegAudioDecoder.q;
            d2.u a10 = new v(uVar).a();
            a10.M = this.O;
            a10.N = this.P;
            v vVar = this.N;
            a10.k = vVar.l;
            a10.a = vVar.a;
            a10.b = vVar.b;
            a10.c = i0.q(vVar.c);
            v vVar2 = this.N;
            a10.d = vVar2.d;
            a10.e = vVar2.e;
            a10.f = vVar2.f;
            ((s0) this.K).c(new v(a10), null);
            this.Y = false;
        }
        z zVar = this.K;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.T;
        if (!((s0) zVar).m(simpleDecoderOutputBuffer2.timeUs, 1, simpleDecoderOutputBuffer2.b)) {
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
            tf.b bVar = this.c;
            bVar.q();
            int w10 = w(bVar, this.S, 0);
            if (w10 == -5) {
                J(bVar);
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
        t tVar = this.J;
        if (this.R != null) {
            return;
        }
        g gVar = this.V;
        f1.E(this.U, gVar);
        this.U = gVar;
        if (gVar != null && gVar.h() == null && this.U.g() == null) {
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
            long j10 = elapsedRealtime2 - elapsedRealtime;
            Handler handler = (Handler) tVar.b;
            if (handler != null) {
                handler.post(new f0(tVar, name, elapsedRealtime2, j10, 3));
            }
            this.M.a++;
        } catch (f e10) {
            g2.a.d("DecoderAudioRenderer", "Audio codec error", e10);
            Handler handler2 = (Handler) tVar.b;
            if (handler2 != null) {
                handler2.post(new p(tVar, e10, 0));
            }
            throw e(e10, this.N, false, 4001);
        } catch (OutOfMemoryError e11) {
            throw e(e11, this.N, false, 4001);
        }
    }

    public final void J(tf.b bVar) {
        v vVar = (v) bVar.b;
        vVar.getClass();
        g gVar = (g) bVar.a;
        f1.E(this.V, gVar);
        this.V = gVar;
        v vVar2 = this.N;
        this.N = vVar;
        this.O = vVar.N;
        this.P = vVar.O;
        FfmpegAudioDecoder ffmpegAudioDecoder = this.R;
        t tVar = this.J;
        if (ffmpegAudioDecoder == null) {
            I();
            v vVar3 = this.N;
            Handler handler = (Handler) tVar.b;
            if (handler != null) {
                handler.post(new lg.y(tVar, vVar3, (Object) null, 5));
                return;
            }
            return;
        }
        k2.e eVar = gVar != this.U ? new k2.e(ffmpegAudioDecoder.getName(), vVar2, vVar, 0, 128) : new k2.e(ffmpegAudioDecoder.getName(), vVar2, vVar, 0, 1);
        if (eVar.d == 0) {
            if (this.X) {
                this.W = 1;
            } else {
                K();
                I();
                this.Y = true;
            }
        }
        v vVar4 = this.N;
        Handler handler2 = (Handler) tVar.b;
        if (handler2 != null) {
            handler2.post(new lg.y(tVar, vVar4, eVar, 5));
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
            t tVar = this.J;
            Handler handler = (Handler) tVar.b;
            if (handler != null) {
                handler.post(new ii.e(29, tVar, name));
            }
            this.R = null;
        }
        f1.E(this.U, null);
        this.U = null;
    }

    public final void L(long j10) {
        this.d0 = j10;
        if (j10 != -9223372036854775807L) {
            this.K.getClass();
        }
    }

    public final void M() {
        l();
        long h = ((s0) this.K).h();
        if (h != Long.MIN_VALUE) {
            if (!this.a0) {
                h = Math.max(this.Z, h);
            }
            this.Z = h;
            this.a0 = false;
        }
    }

    @Override // k2.w0
    public final long a() {
        if (this.n == 2) {
            M();
        }
        return this.Z;
    }

    @Override // k2.w0
    public final boolean b() {
        boolean z10 = this.g0;
        this.g0 = false;
        return z10;
    }

    @Override // k2.w0
    public final void c(y0 y0Var) {
        ((s0) this.K).C(y0Var);
    }

    @Override // k2.b, k2.l1
    public final void d(int i3, Object obj) {
        z zVar = this.K;
        if (i3 == 2) {
            float floatValue = ((Float) obj).floatValue();
            s0 s0Var = (s0) zVar;
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
        if (i3 == 3) {
            d2.f fVar = (d2.f) obj;
            s0 s0Var2 = (s0) zVar;
            if (s0Var2.u.equals(fVar)) {
                return;
            }
            s0Var2.u = fVar;
            if (s0Var2.V) {
                return;
            }
            s0Var2.v();
            return;
        }
        if (i3 == 6) {
            ((s0) zVar).A((d2.g) obj);
            return;
        }
        if (i3 == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            s0 s0Var3 = (s0) zVar;
            s0Var3.T = audioDeviceInfo;
            h0 h0Var = s0Var3.t;
            if (h0Var != null) {
                h0Var.a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i3 == 9) {
            s0 s0Var4 = (s0) zVar;
            s0Var4.y = ((Boolean) obj).booleanValue();
            q0 q0Var = new q0(s0Var4.D() ? y0.d : s0Var4.x, -9223372036854775807L, -9223372036854775807L);
            if (s0Var4.p()) {
                s0Var4.v = q0Var;
                return;
            } else {
                s0Var4.w = q0Var;
                return;
            }
        }
        if (i3 == 10) {
            ((s0) zVar).z(((Integer) obj).intValue());
            return;
        }
        if (i3 != 19) {
            if (i3 != 20) {
                return;
            }
            obj.getClass();
            ((s0) zVar).y((o) obj);
            return;
        }
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        s0 s0Var5 = (s0) zVar;
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

    @Override // k2.w0
    public final y0 g() {
        return ((s0) this.K).x;
    }

    @Override // k2.b
    public final long h(long j10, long j11) {
        s0 s0Var = (s0) this.K;
        boolean z10 = s0Var.n() && this.l0 != -9223372036854775807L;
        if (this.i0) {
            long g7 = s0Var.g();
            if (this.h0 && z10 && g7 != -9223372036854775807L) {
                return Math.max(10000L, (long) ((Math.min(g7, this.l0 - j10) / (g() != null ? g().a : 1.0f)) / 2.0f));
            }
        } else if (z10 || this.c0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // k2.b
    public final String j() {
        return "FfmpegAudioRenderer";
    }

    @Override // k2.b
    public final boolean l() {
        if (!this.c0) {
            return false;
        }
        s0 s0Var = (s0) this.K;
        if (s0Var.p()) {
            return s0Var.L && !s0Var.n();
        }
        return true;
    }

    @Override // k2.b
    public final boolean m() {
        return ((s0) this.K).n();
    }

    @Override // k2.b
    public final void n() {
        t tVar = this.J;
        this.N = null;
        this.Y = true;
        L(-9223372036854775807L);
        this.g0 = false;
        this.h0 = false;
        this.l0 = -9223372036854775807L;
        try {
            f1.E(this.V, null);
            this.V = null;
            K();
            ((s0) this.K).w();
        } finally {
            tVar.i0(this.M);
        }
    }

    @Override // k2.b
    public final void o(boolean z10, boolean z11) {
        d dVar = new d();
        this.M = dVar;
        t tVar = this.J;
        Handler handler = (Handler) tVar.b;
        if (handler != null) {
            handler.post(new q(tVar, dVar, 1));
        }
        q1 q1Var = this.d;
        q1Var.getClass();
        boolean z12 = q1Var.b;
        z zVar = this.K;
        if (z12) {
            s0 s0Var = (s0) zVar;
            zb.p(s0Var.P);
            if (!s0Var.V) {
                s0Var.V = true;
                s0Var.v();
            }
        } else {
            s0 s0Var2 = (s0) zVar;
            if (s0Var2.V) {
                s0Var2.V = false;
                s0Var2.v();
            }
        }
        k kVar = this.f;
        kVar.getClass();
        s0 s0Var3 = (s0) zVar;
        s0Var3.m = kVar;
        g2.h0 h0Var = this.h;
        h0Var.getClass();
        ((j0) s0Var3.r).g = h0Var;
        s0Var3.n = new w5(this, 13);
    }

    @Override // k2.b
    public final void p(long j10, boolean z10, boolean z11) {
        ((s0) this.K).f();
        this.Z = j10;
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

    @Override // k2.b
    public final void s() {
        ((s0) this.K).r();
        this.i0 = true;
    }

    @Override // k2.b
    public final void t() {
        M();
        ((s0) this.K).q();
        this.i0 = false;
        this.h0 = false;
    }

    @Override // k2.b
    public final void u(v[] vVarArr, long j10, long j11, g0 g0Var) {
        this.Q = false;
        if (this.d0 == -9223372036854775807L) {
            L(j11);
            return;
        }
        int i3 = this.f0;
        long[] jArr = this.e0;
        if (i3 == jArr.length) {
            g2.a.l("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + jArr[this.f0 - 1]);
        } else {
            this.f0 = i3 + 1;
        }
        jArr[this.f0 - 1] = j11;
    }

    @Override // k2.b
    public final void x(long j10, long j11) {
        if (this.c0) {
            try {
                ((s0) this.K).t();
                this.l0 = this.k0;
                return;
            } catch (y e10) {
                throw e(e10, e10.c, e10.b, 5002);
            }
        }
        if (this.N == null) {
            tf.b bVar = this.c;
            bVar.q();
            this.L.clear();
            int w10 = w(bVar, this.L, 2);
            if (w10 != -5) {
                if (w10 == -4) {
                    zb.p(this.L.isEndOfStream());
                    this.b0 = true;
                    try {
                        this.c0 = true;
                        ((s0) this.K).t();
                        this.l0 = this.k0;
                        return;
                    } catch (y e11) {
                        throw e(e11, null, false, 5002);
                    }
                }
                return;
            }
            J(bVar);
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
                g2.a.d("DecoderAudioRenderer", "Audio codec error", e12);
                t tVar = this.J;
                Handler handler = (Handler) tVar.b;
                if (handler != null) {
                    handler.post(new p(tVar, e12, 0));
                }
                throw e(e12, this.N, false, 4003);
            } catch (m2.v e13) {
                throw e(e13, e13.a, false, 5001);
            } catch (w e14) {
                throw e(e14, e14.b, e14.a, 5001);
            } catch (y e15) {
                throw e(e15, e15.c, e15.b, 5002);
            }
        }
    }

    @Override // k2.b
    public final w0 i() {
        return this;
    }
}
