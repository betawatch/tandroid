package androidx.media3.decoder.ffmpeg;

import a3.h0;
import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import b2.g;
import b2.w;
import b2.z0;
import e2.g0;
import e2.m0;
import e9.n0;
import h2.f;
import h2.h;
import h2.l;
import hi.t;
import i2.b;
import i2.e;
import i2.o1;
import i2.p1;
import i2.v0;
import ig.d2;
import j2.j;
import k2.a0;
import k2.i0;
import k2.k0;
import k2.q;
import k2.r;
import k2.r0;
import k2.s;
import k2.t0;
import k2.v;
import k2.x;
import k2.z;
import org.telegram.tgnet.TLObject;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class FfmpegAudioRenderer extends b implements v0 {
    public final qf.b I;
    public final a0 J;
    public final h K;
    public e L;
    public w M;
    public int N;
    public int O;
    public boolean P;
    public FfmpegAudioDecoder Q;
    public h R;
    public SimpleDecoderOutputBuffer S;
    public n2.h T;
    public n2.h U;
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
        this.I = new qf.b(handler, vVar);
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
    
        if (((k2.t0) r4).j(e2.m0.E(4, r2, r1)) != 0) goto L16;
     */
    @Override // i2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int C(w wVar) {
        int i10;
        String str = wVar.s;
        int i11 = wVar.L;
        int i12 = wVar.K;
        if (!b2.v0.i(str)) {
            return o1.c(0, 0, 0, 0);
        }
        String str2 = wVar.s;
        str2.getClass();
        String str3 = FfmpegLibrary.a;
        if (b2.v0.i(str2)) {
            if (FfmpegLibrary.d(str2)) {
                w E = m0.E(2, i12, i11);
                a0 a0Var = this.J;
                i10 = 4;
                if (((t0) a0Var).j(E) == 0) {
                }
                if (wVar.T != 0) {
                    i10 = 2;
                }
            }
            i10 = 1;
        } else {
            i10 = 0;
        }
        return i10 <= 2 ? o1.c(i10, 0, 0, 0) : i10 | 168;
    }

    @Override // i2.b
    public final int D() {
        return 8;
    }

    public final h2.e F(w wVar) {
        Trace.beginSection("createFfmpegAudioDecoder");
        int i10 = wVar.t;
        int i11 = wVar.L;
        int i12 = wVar.K;
        if (i10 == -1) {
            i10 = 5760;
        }
        w E = m0.E(2, i12, i11);
        a0 a0Var = this.J;
        boolean z10 = true;
        if (((t0) a0Var).j(E) != 0) {
            z10 = ((t0) a0Var).j(m0.E(4, i12, i11)) != 2 ? false : true ^ "audio/ac3".equals(wVar.s);
        }
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i10, wVar, z10);
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
                ((t0) this.J).E = true;
            }
            if (simpleDecoderOutputBuffer.isFirstSample()) {
                long[] jArr = this.d0;
                ((t0) this.J).E = true;
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
                ((t0) this.J).t();
                this.k0 = this.j0;
                return false;
            } catch (z e) {
                throw c(e, e.c, e.b, 5002);
            }
        }
        this.k0 = -9223372036854775807L;
        if (this.X) {
            FfmpegAudioDecoder ffmpegAudioDecoder = this.Q;
            ffmpegAudioDecoder.getClass();
            b2.v vVar = new b2.v();
            vVar.r = b2.v0.n("audio/raw");
            vVar.J = ffmpegAudioDecoder.u;
            vVar.K = ffmpegAudioDecoder.v;
            vVar.L = ffmpegAudioDecoder.q;
            b2.v a2 = new w(vVar).a();
            a2.M = this.N;
            a2.N = this.O;
            w wVar = this.M;
            a2.k = wVar.l;
            a2.a = wVar.a;
            a2.b = wVar.b;
            a2.c = n0.u(wVar.c);
            w wVar2 = this.M;
            a2.d = wVar2.d;
            a2.e = wVar2.e;
            a2.f = wVar2.f;
            ((t0) this.J).c(new w(a2), null);
            this.X = false;
        }
        a0 a0Var = this.J;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.S;
        if (!((t0) a0Var).m(simpleDecoderOutputBuffer2.timeUs, 1, simpleDecoderOutputBuffer2.b)) {
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
            qf.b bVar = this.c;
            bVar.A();
            int w9 = w(bVar, this.R, 0);
            if (w9 == -5) {
                J(bVar);
                return true;
            }
            if (w9 == -4) {
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
            if (w9 != -3) {
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
        qf.b bVar = this.I;
        if (this.Q != null) {
            return;
        }
        n2.h hVar = this.U;
        o1.D(this.T, hVar);
        this.T = hVar;
        if (hVar != null && hVar.h() == null && this.T.g() == null) {
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
                handler.post(new h0(bVar, name, elapsedRealtime2, j10, 3));
            }
            this.L.a++;
        } catch (f e) {
            e2.a.d("DecoderAudioRenderer", "Audio codec error", e);
            Handler handler2 = (Handler) bVar.b;
            if (handler2 != null) {
                handler2.post(new r(bVar, e, 0));
            }
            throw c(e, this.M, false, 4001);
        } catch (OutOfMemoryError e7) {
            throw c(e7, this.M, false, 4001);
        }
    }

    public final void J(qf.b bVar) {
        w wVar = (w) bVar.c;
        wVar.getClass();
        n2.h hVar = (n2.h) bVar.b;
        o1.D(this.U, hVar);
        this.U = hVar;
        w wVar2 = this.M;
        this.M = wVar;
        this.N = wVar.N;
        this.O = wVar.O;
        FfmpegAudioDecoder ffmpegAudioDecoder = this.Q;
        qf.b bVar2 = this.I;
        if (ffmpegAudioDecoder == null) {
            I();
            w wVar3 = this.M;
            Handler handler = (Handler) bVar2.b;
            if (handler != null) {
                handler.post(new d2(bVar2, wVar3, null, 1));
                return;
            }
            return;
        }
        i2.f fVar = hVar != this.T ? new i2.f(ffmpegAudioDecoder.getName(), wVar2, wVar, 0, 128) : new i2.f(ffmpegAudioDecoder.getName(), wVar2, wVar, 0, 1);
        if (fVar.d == 0) {
            if (this.W) {
                this.V = 1;
            } else {
                K();
                I();
                this.X = true;
            }
        }
        w wVar4 = this.M;
        Handler handler2 = (Handler) bVar2.b;
        if (handler2 != null) {
            handler2.post(new d2(bVar2, wVar4, fVar, 1));
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
            qf.b bVar = this.I;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new t(15, bVar, name));
            }
            this.Q = null;
        }
        o1.D(this.T, null);
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
        long h = ((t0) this.J).h();
        if (h != Long.MIN_VALUE) {
            if (!this.Z) {
                h = Math.max(this.Y, h);
            }
            this.Y = h;
            this.Z = false;
        }
    }

    @Override // i2.v0
    public final long a() {
        if (this.n == 2) {
            M();
        }
        return this.Y;
    }

    @Override // i2.v0
    public final boolean b() {
        boolean z10 = this.f0;
        this.f0 = false;
        return z10;
    }

    @Override // i2.b, i2.k1
    public final void d(int i10, Object obj) {
        a0 a0Var = this.J;
        if (i10 == 2) {
            float floatValue = ((Float) obj).floatValue();
            t0 t0Var = (t0) a0Var;
            if (t0Var.H != floatValue) {
                t0Var.H = floatValue;
                if (t0Var.p()) {
                    t0Var.t.a.setVolume(t0Var.H);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            b2.f fVar = (b2.f) obj;
            t0 t0Var2 = (t0) a0Var;
            if (t0Var2.u.equals(fVar)) {
                return;
            }
            t0Var2.u = fVar;
            if (t0Var2.V) {
                return;
            }
            t0Var2.v();
            return;
        }
        if (i10 == 6) {
            ((t0) a0Var).A((g) obj);
            return;
        }
        if (i10 == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            t0 t0Var3 = (t0) a0Var;
            t0Var3.T = audioDeviceInfo;
            i0 i0Var = t0Var3.t;
            if (i0Var != null) {
                i0Var.a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i10 == 9) {
            t0 t0Var4 = (t0) a0Var;
            t0Var4.y = ((Boolean) obj).booleanValue();
            r0 r0Var = new r0(t0Var4.D() ? z0.d : t0Var4.x, -9223372036854775807L, -9223372036854775807L);
            if (t0Var4.p()) {
                t0Var4.v = r0Var;
                return;
            } else {
                t0Var4.w = r0Var;
                return;
            }
        }
        if (i10 == 10) {
            ((t0) a0Var).z(((Integer) obj).intValue());
            return;
        }
        if (i10 != 19) {
            if (i10 != 20) {
                return;
            }
            obj.getClass();
            ((t0) a0Var).y((q) obj);
            return;
        }
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        t0 t0Var5 = (t0) a0Var;
        t0Var5.getClass();
        if (intValue == 0 || intValue == -1) {
            intValue = -1;
        }
        if (t0Var5.U == intValue) {
            return;
        }
        t0Var5.U = intValue;
        t0Var5.v();
    }

    @Override // i2.v0
    public final void f(z0 z0Var) {
        ((t0) this.J).C(z0Var);
    }

    @Override // i2.b
    public final long g(long j10, long j11) {
        t0 t0Var = (t0) this.J;
        boolean z10 = t0Var.n() && this.k0 != -9223372036854775807L;
        if (this.h0) {
            long g10 = t0Var.g();
            if (this.g0 && z10 && g10 != -9223372036854775807L) {
                return Math.max(10000L, (long) ((Math.min(g10, this.k0 - j10) / (h() != null ? h().a : 1.0f)) / 2.0f));
            }
        } else if (z10 || this.b0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // i2.v0
    public final z0 h() {
        return ((t0) this.J).x;
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
        t0 t0Var = (t0) this.J;
        if (t0Var.p()) {
            return t0Var.L && !t0Var.n();
        }
        return true;
    }

    @Override // i2.b
    public final boolean m() {
        return ((t0) this.J).n();
    }

    @Override // i2.b
    public final void n() {
        qf.b bVar = this.I;
        this.M = null;
        this.X = true;
        L(-9223372036854775807L);
        this.f0 = false;
        this.g0 = false;
        this.k0 = -9223372036854775807L;
        try {
            o1.D(this.U, null);
            this.U = null;
            K();
            ((t0) this.J).w();
        } finally {
            bVar.D(this.L);
        }
    }

    @Override // i2.b
    public final void o(boolean z10, boolean z11) {
        e eVar = new e();
        this.L = eVar;
        qf.b bVar = this.I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new s(bVar, eVar, 1));
        }
        p1 p1Var = this.d;
        p1Var.getClass();
        boolean z12 = p1Var.b;
        a0 a0Var = this.J;
        if (z12) {
            t0 t0Var = (t0) a0Var;
            u6.p(t0Var.P);
            if (!t0Var.V) {
                t0Var.V = true;
                t0Var.v();
            }
        } else {
            t0 t0Var2 = (t0) a0Var;
            if (t0Var2.V) {
                t0Var2.V = false;
                t0Var2.v();
            }
        }
        j jVar = this.f;
        jVar.getClass();
        t0 t0Var3 = (t0) a0Var;
        t0Var3.m = jVar;
        g0 g0Var = this.h;
        g0Var.getClass();
        ((k0) t0Var3.r).g = g0Var;
        t0Var3.n = new a4.l(this, 24);
    }

    @Override // i2.b
    public final void p(long j10, boolean z10, boolean z11) {
        ((t0) this.J).f();
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
        ((t0) this.J).r();
        this.h0 = true;
    }

    @Override // i2.b
    public final void t() {
        M();
        ((t0) this.J).q();
        this.h0 = false;
        this.g0 = false;
    }

    @Override // i2.b
    public final void u(w[] wVarArr, long j10, long j11, u2.h0 h0Var) {
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
                ((t0) this.J).t();
                this.k0 = this.j0;
                return;
            } catch (z e) {
                throw c(e, e.c, e.b, 5002);
            }
        }
        if (this.M == null) {
            qf.b bVar = this.c;
            bVar.A();
            this.K.clear();
            int w9 = w(bVar, this.K, 2);
            if (w9 != -5) {
                if (w9 == -4) {
                    u6.p(this.K.isEndOfStream());
                    this.a0 = true;
                    try {
                        this.b0 = true;
                        ((t0) this.J).t();
                        this.k0 = this.j0;
                        return;
                    } catch (z e7) {
                        throw c(e7, null, false, 5002);
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
            } catch (f e10) {
                e2.a.d("DecoderAudioRenderer", "Audio codec error", e10);
                qf.b bVar2 = this.I;
                Handler handler = (Handler) bVar2.b;
                if (handler != null) {
                    handler.post(new r(bVar2, e10, 0));
                }
                throw c(e10, this.M, false, 4003);
            } catch (k2.w e11) {
                throw c(e11, e11.a, false, 5001);
            } catch (x e12) {
                throw c(e12, e12.b, e12.a, 5001);
            } catch (z e13) {
                throw c(e13, e13.c, e13.b, 5002);
            }
        }
    }

    @Override // i2.b
    public final v0 i() {
        return this;
    }
}
