package androidx.media3.decoder.ffmpeg;

import a8.ia;
import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import bi.h4;
import e2.s0;
import e2.t;
import e2.u;
import h2.g0;
import h2.m0;
import h9.i0;
import j2.n;
import k2.e;
import k2.f;
import k2.h;
import k2.l;
import l2.b;
import l2.d;
import l2.q1;
import l2.w0;
import l2.z0;
import li.j3;
import m2.j;
import n2.f0;
import n2.h0;
import n2.o;
import n2.o0;
import n2.p;
import n2.q;
import n2.q0;
import n2.s;
import n2.w;
import n2.x;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.f1;
import q2.g;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class FfmpegAudioRenderer extends b implements w0 {
    public final n I;
    public final x J;
    public final h K;
    public d L;
    public u M;
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

    public FfmpegAudioRenderer(Handler handler, s sVar, x xVar) {
        super(1);
        this.I = new n(handler, sVar);
        this.J = xVar;
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
    
        if (((n2.q0) r4).j(h2.m0.E(4, r2, r1)) != 0) goto L16;
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
            return jg.g.b(0, 0, 0, 0);
        }
        String str2 = uVar.s;
        str2.getClass();
        String str3 = FfmpegLibrary.a;
        if (s0.i(str2)) {
            if (FfmpegLibrary.d(str2)) {
                u E = m0.E(2, i11, i10);
                x xVar = this.J;
                i7 = 4;
                if (((q0) xVar).j(E) == 0) {
                }
                if (uVar.T != 0) {
                    i7 = 2;
                }
            }
            i7 = 1;
        } else {
            i7 = 0;
        }
        return i7 <= 2 ? jg.g.b(i7, 0, 0, 0) : i7 | qs.y2;
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
        u E = m0.E(2, i11, i10);
        x xVar = this.J;
        boolean z9 = true;
        if (((q0) xVar).j(E) != 0) {
            z9 = ((q0) xVar).j(m0.E(4, i11, i10)) != 2 ? false : true ^ "audio/ac3".equals(uVar.s);
        }
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i7, uVar, z9);
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
            int i7 = simpleDecoderOutputBuffer.skippedOutputBufferCount;
            if (i7 > 0) {
                this.L.f += i7;
                ((q0) this.J).E = true;
            }
            if (simpleDecoderOutputBuffer.isFirstSample()) {
                long[] jArr = this.d0;
                ((q0) this.J).E = true;
                if (this.e0 != 0) {
                    L(jArr[0]);
                    int i10 = this.e0 - 1;
                    this.e0 = i10;
                    System.arraycopy(jArr, 1, jArr, 0, i10);
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
                ((q0) this.J).t();
                this.k0 = this.j0;
                return false;
            } catch (w e10) {
                throw d(e10, e10.c, e10.b, 5002);
            }
        }
        this.k0 = -9223372036854775807L;
        if (this.X) {
            FfmpegAudioDecoder ffmpegAudioDecoder = this.Q;
            ffmpegAudioDecoder.getClass();
            t tVar = new t();
            tVar.r = s0.n("audio/raw");
            tVar.J = ffmpegAudioDecoder.u;
            tVar.K = ffmpegAudioDecoder.v;
            tVar.L = ffmpegAudioDecoder.q;
            t a10 = new u(tVar).a();
            a10.M = this.N;
            a10.N = this.O;
            u uVar = this.M;
            a10.k = uVar.l;
            a10.a = uVar.a;
            a10.b = uVar.b;
            a10.c = i0.q(uVar.c);
            u uVar2 = this.M;
            a10.d = uVar2.d;
            a10.e = uVar2.e;
            a10.f = uVar2.f;
            ((q0) this.J).c(new u(a10), null);
            this.X = false;
        }
        x xVar = this.J;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.S;
        if (!((q0) xVar).m(simpleDecoderOutputBuffer2.timeUs, 1, simpleDecoderOutputBuffer2.b)) {
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
            wf.b bVar = this.c;
            bVar.A();
            int w10 = w(bVar, this.R, 0);
            if (w10 == -5) {
                J(bVar);
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
                this.R.c();
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
        n nVar = this.I;
        if (this.Q != null) {
            return;
        }
        g gVar = this.U;
        f1.B(this.T, gVar);
        this.T = gVar;
        if (gVar != null && gVar.h() == null && this.T.g() == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Trace.beginSection("createAudioDecoder");
            e F = F(this.M);
            this.Q = (FfmpegAudioDecoder) F;
            ((l) F).a(this.x);
            Trace.endSection();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            String name = this.Q.getName();
            long j3 = elapsedRealtime2 - elapsedRealtime;
            Handler handler = (Handler) nVar.b;
            if (handler != null) {
                handler.post(new h4(nVar, name, elapsedRealtime2, j3, 3));
            }
            this.L.a++;
        } catch (OutOfMemoryError e10) {
            throw d(e10, this.M, false, 4001);
        } catch (f e11) {
            h2.a.d("DecoderAudioRenderer", "Audio codec error", e11);
            Handler handler2 = (Handler) nVar.b;
            if (handler2 != null) {
                handler2.post(new p(nVar, e11, 0));
            }
            throw d(e11, this.M, false, 4001);
        }
    }

    public final void J(wf.b bVar) {
        u uVar = (u) bVar.c;
        uVar.getClass();
        g gVar = (g) bVar.b;
        f1.B(this.U, gVar);
        this.U = gVar;
        u uVar2 = this.M;
        this.M = uVar;
        this.N = uVar.N;
        this.O = uVar.O;
        FfmpegAudioDecoder ffmpegAudioDecoder = this.Q;
        n nVar = this.I;
        if (ffmpegAudioDecoder == null) {
            I();
            u uVar3 = this.M;
            Handler handler = (Handler) nVar.b;
            if (handler != null) {
                handler.post(new z0(nVar, uVar3, null, 9));
                return;
            }
            return;
        }
        l2.e eVar = gVar != this.T ? new l2.e(ffmpegAudioDecoder.getName(), uVar2, uVar, 0, 128) : new l2.e(ffmpegAudioDecoder.getName(), uVar2, uVar, 0, 1);
        if (eVar.d == 0) {
            if (this.W) {
                this.V = 1;
            } else {
                K();
                I();
                this.X = true;
            }
        }
        u uVar4 = this.M;
        Handler handler2 = (Handler) nVar.b;
        if (handler2 != null) {
            handler2.post(new z0(nVar, uVar4, eVar, 9));
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
            n nVar = this.I;
            Handler handler = (Handler) nVar.b;
            if (handler != null) {
                handler.post(new j3(9, nVar, name));
            }
            this.Q = null;
        }
        f1.B(this.T, null);
        this.T = null;
    }

    public final void L(long j3) {
        this.c0 = j3;
        if (j3 != -9223372036854775807L) {
            this.J.getClass();
        }
    }

    public final void M() {
        l();
        long h = ((q0) this.J).h();
        if (h != Long.MIN_VALUE) {
            if (!this.Z) {
                h = Math.max(this.Y, h);
            }
            this.Y = h;
            this.Z = false;
        }
    }

    @Override // l2.w0
    public final long a() {
        if (this.n == 2) {
            M();
        }
        return this.Y;
    }

    @Override // l2.w0
    public final boolean b() {
        boolean z9 = this.f0;
        this.f0 = false;
        return z9;
    }

    @Override // l2.b, l2.m1
    public final void c(int i7, Object obj) {
        x xVar = this.J;
        if (i7 == 2) {
            float floatValue = ((Float) obj).floatValue();
            q0 q0Var = (q0) xVar;
            if (q0Var.H != floatValue) {
                q0Var.H = floatValue;
                if (q0Var.p()) {
                    q0Var.t.a.setVolume(q0Var.H);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 3) {
            e2.e eVar = (e2.e) obj;
            q0 q0Var2 = (q0) xVar;
            if (q0Var2.u.equals(eVar)) {
                return;
            }
            q0Var2.u = eVar;
            if (q0Var2.V) {
                return;
            }
            q0Var2.v();
            return;
        }
        if (i7 == 6) {
            ((q0) xVar).A((e2.f) obj);
            return;
        }
        if (i7 == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            q0 q0Var3 = (q0) xVar;
            q0Var3.T = audioDeviceInfo;
            f0 f0Var = q0Var3.t;
            if (f0Var != null) {
                f0Var.a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i7 == 9) {
            q0 q0Var4 = (q0) xVar;
            q0Var4.y = ((Boolean) obj).booleanValue();
            o0 o0Var = new o0(q0Var4.D() ? e2.w0.d : q0Var4.x, -9223372036854775807L, -9223372036854775807L);
            if (q0Var4.p()) {
                q0Var4.v = o0Var;
                return;
            } else {
                q0Var4.w = o0Var;
                return;
            }
        }
        if (i7 == 10) {
            ((q0) xVar).z(((Integer) obj).intValue());
            return;
        }
        if (i7 != 19) {
            if (i7 != 20) {
                return;
            }
            obj.getClass();
            ((q0) xVar).y((o) obj);
            return;
        }
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        q0 q0Var5 = (q0) xVar;
        q0Var5.getClass();
        if (intValue == 0 || intValue == -1) {
            intValue = -1;
        }
        if (q0Var5.U == intValue) {
            return;
        }
        q0Var5.U = intValue;
        q0Var5.v();
    }

    @Override // l2.w0
    public final void e(e2.w0 w0Var) {
        ((q0) this.J).C(w0Var);
    }

    @Override // l2.b
    public final long g(long j3, long j10) {
        q0 q0Var = (q0) this.J;
        boolean z9 = q0Var.n() && this.k0 != -9223372036854775807L;
        if (this.h0) {
            long g10 = q0Var.g();
            if (this.g0 && z9 && g10 != -9223372036854775807L) {
                return Math.max(10000L, (long) ((Math.min(g10, this.k0 - j3) / (j() != null ? j().a : 1.0f)) / 2.0f));
            }
        } else if (z9 || this.b0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // l2.b
    public final String i() {
        return "FfmpegAudioRenderer";
    }

    @Override // l2.w0
    public final e2.w0 j() {
        return ((q0) this.J).x;
    }

    @Override // l2.b
    public final boolean l() {
        if (!this.b0) {
            return false;
        }
        q0 q0Var = (q0) this.J;
        if (q0Var.p()) {
            return q0Var.L && !q0Var.n();
        }
        return true;
    }

    @Override // l2.b
    public final boolean m() {
        return ((q0) this.J).n();
    }

    @Override // l2.b
    public final void n() {
        n nVar = this.I;
        this.M = null;
        this.X = true;
        L(-9223372036854775807L);
        this.f0 = false;
        this.g0 = false;
        this.k0 = -9223372036854775807L;
        try {
            f1.B(this.U, null);
            this.U = null;
            K();
            ((q0) this.J).w();
        } finally {
            nVar.c0(this.L);
        }
    }

    @Override // l2.b
    public final void o(boolean z9, boolean z10) {
        d dVar = new d();
        this.L = dVar;
        n nVar = this.I;
        Handler handler = (Handler) nVar.b;
        if (handler != null) {
            handler.post(new q(nVar, dVar, 1));
        }
        q1 q1Var = this.d;
        q1Var.getClass();
        boolean z11 = q1Var.b;
        x xVar = this.J;
        if (z11) {
            q0 q0Var = (q0) xVar;
            ia.p(q0Var.P);
            if (!q0Var.V) {
                q0Var.V = true;
                q0Var.v();
            }
        } else {
            q0 q0Var2 = (q0) xVar;
            if (q0Var2.V) {
                q0Var2.V = false;
                q0Var2.v();
            }
        }
        j jVar = this.f;
        jVar.getClass();
        q0 q0Var3 = (q0) xVar;
        q0Var3.m = jVar;
        g0 g0Var = this.h;
        g0Var.getClass();
        ((h0) q0Var3.r).g = g0Var;
        q0Var3.n = new h9.f1(this, 16);
    }

    @Override // l2.b
    public final void p(long j3, boolean z9, boolean z10) {
        ((q0) this.J).f();
        this.Y = j3;
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
            ffmpegAudioDecoder.a(this.x);
            this.W = false;
        }
    }

    @Override // l2.b
    public final void s() {
        ((q0) this.J).r();
        this.h0 = true;
    }

    @Override // l2.b
    public final void t() {
        M();
        ((q0) this.J).q();
        this.h0 = false;
        this.g0 = false;
    }

    @Override // l2.b
    public final void u(u[] uVarArr, long j3, long j10, x2.g0 g0Var) {
        this.P = false;
        if (this.c0 == -9223372036854775807L) {
            L(j10);
            return;
        }
        int i7 = this.e0;
        long[] jArr = this.d0;
        if (i7 == jArr.length) {
            h2.a.l("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + jArr[this.e0 - 1]);
        } else {
            this.e0 = i7 + 1;
        }
        jArr[this.e0 - 1] = j10;
    }

    @Override // l2.b
    public final void x(long j3, long j10) {
        if (this.b0) {
            try {
                ((q0) this.J).t();
                this.k0 = this.j0;
                return;
            } catch (w e10) {
                throw d(e10, e10.c, e10.b, 5002);
            }
        }
        if (this.M == null) {
            wf.b bVar = this.c;
            bVar.A();
            this.K.clear();
            int w10 = w(bVar, this.K, 2);
            if (w10 != -5) {
                if (w10 == -4) {
                    ia.p(this.K.isEndOfStream());
                    this.a0 = true;
                    try {
                        this.b0 = true;
                        ((q0) this.J).t();
                        this.k0 = this.j0;
                        return;
                    } catch (w e11) {
                        throw d(e11, null, false, 5002);
                    }
                }
                return;
            }
            J(bVar);
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
            } catch (f e12) {
                h2.a.d("DecoderAudioRenderer", "Audio codec error", e12);
                n nVar = this.I;
                Handler handler = (Handler) nVar.b;
                if (handler != null) {
                    handler.post(new p(nVar, e12, 0));
                }
                throw d(e12, this.M, false, 4003);
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
    public final w0 h() {
        return this;
    }
}
