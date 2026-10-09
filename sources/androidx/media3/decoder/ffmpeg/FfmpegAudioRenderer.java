package androidx.media3.decoder.ffmpeg;

import a3.g0;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import b2.r;
import b2.r0;
import b2.s;
import b2.v0;
import ci.e7;
import e2.d;
import e9.i0;
import gg.t;
import gg.w1;
import h2.e;
import h2.h;
import h2.l;
import i2.f;
import i2.g;
import i2.n1;
import i2.t0;
import j2.k;
import k2.d0;
import k2.j;
import k2.m;
import k2.o;
import k2.p;
import k2.v;
import k2.w;
import n4.x;
import org.telegram.tgnet.TLObject;
import pb.c;
import u2.f0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class FfmpegAudioRenderer extends f implements t0 {
    public final x I;
    public final p J;
    public final h K;
    public g L;
    public s M;
    public int N;
    public int O;
    public boolean P;
    public FfmpegAudioDecoder Q;
    public h R;
    public SimpleDecoderOutputBuffer S;
    public n2.g T;
    public n2.g U;
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
    public long h0;
    public long i0;
    public long j0;

    public FfmpegAudioRenderer(Handler handler, j jVar, p pVar) {
        super(1);
        this.I = new x(handler, jVar);
        this.J = pVar;
        ((d0) pVar).s = new c(this, 27);
        this.K = new h(0, 0);
        this.V = 0;
        this.X = true;
        I(-9223372036854775807L);
        this.d0 = new long[10];
        this.h0 = -9223372036854775807L;
        this.i0 = -9223372036854775807L;
        this.j0 = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (((k2.d0) r4).G(e2.d0.B(4, r2, r1)) == false) goto L19;
     */
    @Override // i2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A(s sVar) {
        int i10;
        String str = sVar.r;
        int i11 = sVar.K;
        int i12 = sVar.J;
        if (!r0.i(str)) {
            return hg.c.b(0, 0, 0, 0);
        }
        String str2 = sVar.r;
        str2.getClass();
        String str3 = FfmpegLibrary.a;
        if (r0.i(str2)) {
            if (FfmpegLibrary.d(str2)) {
                s B = e2.d0.B(2, i12, i11);
                p pVar = this.J;
                i10 = 4;
                if (!((d0) pVar).G(B)) {
                }
                if (sVar.S != 0) {
                    i10 = 2;
                }
            }
            i10 = 1;
        } else {
            i10 = 0;
        }
        return i10 <= 2 ? hg.c.b(i10, 0, 0, 0) : i10 | 168;
    }

    @Override // i2.f
    public final int B() {
        return 8;
    }

    public final e C(s sVar) {
        Trace.beginSection("createFfmpegAudioDecoder");
        int i10 = sVar.s;
        int i11 = sVar.K;
        int i12 = sVar.J;
        if (i10 == -1) {
            i10 = 5760;
        }
        s B = e2.d0.B(2, i12, i11);
        p pVar = this.J;
        boolean z10 = true;
        if (((d0) pVar).G(B)) {
            z10 = ((d0) pVar).k(e2.d0.B(4, i12, i11)) != 2 ? false : true ^ "audio/ac3".equals(sVar.r);
        }
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i10, sVar, z10);
        Trace.endSection();
        return ffmpegAudioDecoder;
    }

    public final boolean D() {
        if (this.S == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) this.Q.c();
            this.S = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer == null) {
                return false;
            }
            int i10 = simpleDecoderOutputBuffer.skippedOutputBufferCount;
            if (i10 > 0) {
                this.L.f += i10;
                ((d0) this.J).M = true;
            }
            if (simpleDecoderOutputBuffer.isFirstSample()) {
                long[] jArr = this.d0;
                ((d0) this.J).M = true;
                if (this.e0 != 0) {
                    I(jArr[0]);
                    int i11 = this.e0 - 1;
                    this.e0 = i11;
                    System.arraycopy(jArr, 1, jArr, 0, i11);
                }
            }
        }
        if (this.S.isEndOfStream()) {
            if (this.V == 2) {
                H();
                F();
                this.X = true;
                return false;
            }
            this.S.release();
            this.S = null;
            try {
                this.b0 = true;
                ((d0) this.J).w();
                this.j0 = this.i0;
                return false;
            } catch (o e7) {
                throw d(e7, e7.c, e7.b, 5002);
            }
        }
        this.j0 = -9223372036854775807L;
        if (this.X) {
            FfmpegAudioDecoder ffmpegAudioDecoder = this.Q;
            ffmpegAudioDecoder.getClass();
            r rVar = new r();
            rVar.q = r0.n("audio/raw");
            rVar.I = ffmpegAudioDecoder.u;
            rVar.J = ffmpegAudioDecoder.v;
            rVar.K = ffmpegAudioDecoder.q;
            r a2 = new s(rVar).a();
            a2.L = this.N;
            a2.M = this.O;
            s sVar = this.M;
            a2.k = sVar.l;
            a2.a = sVar.a;
            a2.b = sVar.b;
            a2.c = i0.v(sVar.c);
            s sVar2 = this.M;
            a2.d = sVar2.d;
            a2.e = sVar2.e;
            a2.f = sVar2.f;
            ((d0) this.J).d(new s(a2), null);
            this.X = false;
        }
        p pVar = this.J;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.S;
        if (!((d0) pVar).n(simpleDecoderOutputBuffer2.timeUs, 1, simpleDecoderOutputBuffer2.b)) {
            this.j0 = this.S.timeUs;
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
    public final boolean E() {
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
            x xVar = this.c;
            xVar.u();
            int w10 = w(xVar, this.R, 0);
            if (w10 == -5) {
                G(xVar);
                return true;
            }
            if (w10 == -4) {
                if (this.R.isEndOfStream()) {
                    this.a0 = true;
                    this.i0 = this.h0;
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
                this.h0 = this.R.e;
                if (k() || this.R.isLastSample()) {
                    this.i0 = this.h0;
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
                this.i0 = this.h0;
                return false;
            }
        }
        return false;
    }

    public final void F() {
        x xVar = this.I;
        if (this.Q != null) {
            return;
        }
        n2.g gVar = this.U;
        hg.c.A(this.T, gVar);
        this.T = gVar;
        if (gVar != null && gVar.h() == null && this.T.g() == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Trace.beginSection("createAudioDecoder");
            e C = C(this.M);
            this.Q = (FfmpegAudioDecoder) C;
            ((l) C).a(this.w);
            Trace.endSection();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            String name = this.Q.getName();
            long j3 = elapsedRealtime2 - elapsedRealtime;
            Handler handler = (Handler) xVar.b;
            if (handler != null) {
                handler.post(new g0(xVar, name, elapsedRealtime2, j3, 2));
            }
            this.L.a++;
        } catch (h2.f e7) {
            e2.a.f("DecoderAudioRenderer", "Audio codec error", e7);
            Handler handler2 = (Handler) xVar.b;
            if (handler2 != null) {
                handler2.post(new k2.f(xVar, e7, 0));
            }
            throw d(e7, this.M, false, 4001);
        } catch (OutOfMemoryError e10) {
            throw d(e10, this.M, false, 4001);
        }
    }

    public final void G(x xVar) {
        s sVar = (s) xVar.c;
        sVar.getClass();
        n2.g gVar = (n2.g) xVar.b;
        hg.c.A(this.U, gVar);
        this.U = gVar;
        s sVar2 = this.M;
        this.M = sVar;
        this.N = sVar.M;
        this.O = sVar.N;
        FfmpegAudioDecoder ffmpegAudioDecoder = this.Q;
        x xVar2 = this.I;
        if (ffmpegAudioDecoder == null) {
            F();
            s sVar3 = this.M;
            Handler handler = (Handler) xVar2.b;
            if (handler != null) {
                handler.post(new t(xVar2, sVar3, null, 21));
                return;
            }
            return;
        }
        i2.h hVar = gVar != this.T ? new i2.h(ffmpegAudioDecoder.getName(), sVar2, sVar, 0, 128) : new i2.h(ffmpegAudioDecoder.getName(), sVar2, sVar, 0, 1);
        if (hVar.d == 0) {
            if (this.W) {
                this.V = 1;
            } else {
                H();
                F();
                this.X = true;
            }
        }
        s sVar4 = this.M;
        Handler handler2 = (Handler) xVar2.b;
        if (handler2 != null) {
            handler2.post(new t(xVar2, sVar4, hVar, 21));
        }
    }

    public final void H() {
        this.R = null;
        this.S = null;
        this.V = 0;
        this.W = false;
        this.h0 = -9223372036854775807L;
        this.i0 = -9223372036854775807L;
        FfmpegAudioDecoder ffmpegAudioDecoder = this.Q;
        if (ffmpegAudioDecoder != null) {
            this.L.b++;
            ffmpegAudioDecoder.release();
            String name = this.Q.getName();
            x xVar = this.I;
            Handler handler = (Handler) xVar.b;
            if (handler != null) {
                handler.post(new w1(25, xVar, name));
            }
            this.Q = null;
        }
        hg.c.A(this.T, null);
        this.T = null;
    }

    public final void I(long j3) {
        this.c0 = j3;
        if (j3 != -9223372036854775807L) {
            this.J.getClass();
        }
    }

    public final void J() {
        l();
        long i10 = ((d0) this.J).i();
        if (i10 != Long.MIN_VALUE) {
            if (!this.Z) {
                i10 = Math.max(this.Y, i10);
            }
            this.Y = i10;
            this.Z = false;
        }
    }

    @Override // i2.t0
    public final long a() {
        if (this.n == 2) {
            J();
        }
        return this.Y;
    }

    @Override // i2.t0
    public final boolean b() {
        boolean z10 = this.f0;
        this.f0 = false;
        return z10;
    }

    @Override // i2.f, i2.j1
    public final void c(int i10, Object obj) {
        a4.l lVar;
        p pVar = this.J;
        if (i10 == 2) {
            float floatValue = ((Float) obj).floatValue();
            d0 d0Var = (d0) pVar;
            if (d0Var.P != floatValue) {
                d0Var.P = floatValue;
                if (d0Var.q()) {
                    d0Var.w.setVolume(d0Var.P);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            ((d0) pVar).z((b2.e) obj);
            return;
        }
        if (i10 == 6) {
            ((d0) pVar).C((b2.f) obj);
            return;
        }
        if (i10 != 12) {
            if (i10 != 9) {
                if (i10 != 10) {
                    return;
                }
                ((d0) pVar).A(((Integer) obj).intValue());
                return;
            }
            d0 d0Var2 = (d0) pVar;
            d0Var2.E = ((Boolean) obj).booleanValue();
            v vVar = d0Var2.u;
            w wVar = new w((vVar == null || !vVar.j) ? d0Var2.D : v0.d, -9223372036854775807L, -9223372036854775807L);
            if (d0Var2.q()) {
                d0Var2.B = wVar;
                return;
            } else {
                d0Var2.C = wVar;
                return;
            }
        }
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        d0 d0Var3 = (d0) pVar;
        if (audioDeviceInfo == null) {
            lVar = null;
        } else {
            d0Var3.getClass();
            lVar = new a4.l(audioDeviceInfo, 25);
        }
        d0Var3.b0 = lVar;
        e7 e7Var = d0Var3.y;
        if (e7Var != null) {
            e7Var.c(audioDeviceInfo);
        }
        AudioTrack audioTrack = d0Var3.w;
        if (audioTrack != null) {
            a4.l lVar2 = d0Var3.b0;
            audioTrack.setPreferredDevice(lVar2 != null ? (AudioDeviceInfo) lVar2.b : null);
        }
    }

    @Override // i2.t0
    public final void f(v0 v0Var) {
        ((d0) this.J).F(v0Var);
    }

    @Override // i2.f
    public final long g(long j3, long j10) {
        boolean z10 = this.j0 != -9223372036854775807L;
        if (this.g0) {
            long h = ((d0) this.J).h();
            if (z10 && h != -9223372036854775807L) {
                float min = Math.min(h, this.j0 - j3);
                float f7 = h() != null ? h().a : 1.0f;
                this.h.getClass();
                return Math.max(10000L, ((long) ((min / f7) / 2.0f)) - (e2.d0.P(SystemClock.elapsedRealtime()) - j10));
            }
        } else if (z10 || this.b0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // i2.t0
    public final v0 h() {
        return ((d0) this.J).D;
    }

    @Override // i2.f
    public final String j() {
        return "FfmpegAudioRenderer";
    }

    @Override // i2.f
    public final boolean l() {
        if (!this.b0) {
            return false;
        }
        d0 d0Var = (d0) this.J;
        if (d0Var.q()) {
            return d0Var.T && !d0Var.o();
        }
        return true;
    }

    @Override // i2.f
    public final boolean m() {
        if (((d0) this.J).o()) {
            return true;
        }
        if (this.M != null) {
            return n() || this.S != null;
        }
        return false;
    }

    @Override // i2.f
    public final void o() {
        x xVar = this.I;
        this.M = null;
        this.X = true;
        I(-9223372036854775807L);
        this.f0 = false;
        this.j0 = -9223372036854775807L;
        try {
            hg.c.A(this.U, null);
            this.U = null;
            H();
            ((d0) this.J).y();
        } finally {
            xVar.y(this.L);
        }
    }

    @Override // i2.f
    public final void p(boolean z10, boolean z11) {
        g gVar = new g();
        this.L = gVar;
        x xVar = this.I;
        Handler handler = (Handler) xVar.b;
        if (handler != null) {
            handler.post(new k2.g(xVar, gVar, 1));
        }
        n1 n1Var = this.d;
        n1Var.getClass();
        boolean z12 = n1Var.b;
        p pVar = this.J;
        if (z12) {
            d0 d0Var = (d0) pVar;
            d.g(d0Var.X);
            if (!d0Var.c0) {
                d0Var.c0 = true;
                d0Var.g();
            }
        } else {
            d0 d0Var2 = (d0) pVar;
            if (d0Var2.c0) {
                d0Var2.c0 = false;
                d0Var2.g();
            }
        }
        k kVar = this.f;
        kVar.getClass();
        d0 d0Var3 = (d0) pVar;
        d0Var3.r = kVar;
        e2.x xVar2 = this.h;
        xVar2.getClass();
        d0Var3.h.G = xVar2;
    }

    @Override // i2.f
    public final void q(long j3, boolean z10) {
        ((d0) this.J).g();
        this.Y = j3;
        this.j0 = -9223372036854775807L;
        this.f0 = false;
        this.Z = true;
        this.a0 = false;
        this.b0 = false;
        if (this.Q != null) {
            if (this.V != 0) {
                H();
                F();
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

    @Override // i2.f
    public final void t() {
        ((d0) this.J).u();
        this.g0 = true;
    }

    @Override // i2.f
    public final void u() {
        J();
        ((d0) this.J).t();
        this.g0 = false;
    }

    @Override // i2.f
    public final void v(s[] sVarArr, long j3, long j10, f0 f0Var) {
        this.P = false;
        if (this.c0 == -9223372036854775807L) {
            I(j10);
            return;
        }
        int i10 = this.e0;
        long[] jArr = this.d0;
        if (i10 == jArr.length) {
            e2.a.n("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + jArr[this.e0 - 1]);
        } else {
            this.e0 = i10 + 1;
        }
        jArr[this.e0 - 1] = j10;
    }

    @Override // i2.f
    public final void x(long j3, long j10) {
        if (this.b0) {
            try {
                ((d0) this.J).w();
                this.j0 = this.i0;
                return;
            } catch (o e7) {
                throw d(e7, e7.c, e7.b, 5002);
            }
        }
        if (this.M == null) {
            x xVar = this.c;
            xVar.u();
            this.K.clear();
            int w10 = w(xVar, this.K, 2);
            if (w10 != -5) {
                if (w10 == -4) {
                    d.g(this.K.isEndOfStream());
                    this.a0 = true;
                    try {
                        this.b0 = true;
                        ((d0) this.J).w();
                        this.j0 = this.i0;
                        return;
                    } catch (o e10) {
                        throw d(e10, null, false, 5002);
                    }
                }
                return;
            }
            G(xVar);
        }
        F();
        if (this.Q != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (D()) {
                }
                while (E()) {
                }
                Trace.endSection();
                synchronized (this.L) {
                }
            } catch (h2.f e11) {
                e2.a.f("DecoderAudioRenderer", "Audio codec error", e11);
                x xVar2 = this.I;
                Handler handler = (Handler) xVar2.b;
                if (handler != null) {
                    handler.post(new k2.f(xVar2, e11, 0));
                }
                throw d(e11, this.M, false, 4003);
            } catch (k2.l e12) {
                throw d(e12, e12.a, false, 5001);
            } catch (m e13) {
                throw d(e13, e13.c, e13.b, 5001);
            } catch (o e14) {
                throw d(e14, e14.c, e14.b, 5002);
            }
        }
    }

    @Override // i2.f
    public final t0 i() {
        return this;
    }
}
