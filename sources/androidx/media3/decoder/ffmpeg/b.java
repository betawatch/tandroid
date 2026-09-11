package androidx.media3.decoder.ffmpeg;

import a3.f0;
import a6.m;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import b2.r;
import b2.r0;
import b2.s;
import b2.v0;
import e2.x;
import e9.i0;
import h2.d;
import h2.e;
import h2.g;
import hg.t;
import i2.f;
import i2.h;
import i2.i;
import i2.m1;
import i2.s0;
import j2.k;
import ji.b5;
import k2.d0;
import k2.j;
import k2.l;
import k2.o;
import k2.p;
import k2.w;
import n4.y;
import org.telegram.tgnet.TLObject;
import u2.b1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class b extends f implements s0 {
    public final y I;
    public final p J;
    public final g K;
    public h L;
    public s M;
    public int N;
    public int O;
    public boolean P;
    public d Q;
    public g R;
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

    public b(Handler handler, j jVar, p pVar) {
        super(1);
        this.I = new y(handler, jVar);
        this.J = pVar;
        ((d0) pVar).t = new m(this, 29);
        this.K = new g(0, 0);
        this.V = 0;
        this.X = true;
        H(-9223372036854775807L);
        this.d0 = new long[10];
        this.h0 = -9223372036854775807L;
        this.i0 = -9223372036854775807L;
        this.j0 = -9223372036854775807L;
    }

    @Override // i2.f
    public final int A() {
        return 8;
    }

    public final d B(s sVar) {
        Trace.beginSection("createFfmpegAudioDecoder");
        int i10 = sVar.s;
        int i11 = sVar.K;
        int i12 = sVar.J;
        if (i10 == -1) {
            i10 = 5760;
        }
        s C = e2.d0.C(2, i12, i11);
        p pVar = this.J;
        boolean z10 = true;
        if (((d0) pVar).G(C)) {
            z10 = ((d0) pVar).k(e2.d0.C(4, i12, i11)) != 2 ? false : true ^ "audio/ac3".equals(sVar.r);
        }
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i10, sVar, z10);
        Trace.endSection();
        return ffmpegAudioDecoder;
    }

    public final boolean C() {
        if (this.S == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) ((h2.j) this.Q).c();
            this.S = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer == null) {
                return false;
            }
            int i10 = simpleDecoderOutputBuffer.d;
            if (i10 > 0) {
                this.L.f += i10;
                ((d0) this.J).N = true;
            }
            if (simpleDecoderOutputBuffer.c(TLObject.FLAG_27)) {
                long[] jArr = this.d0;
                ((d0) this.J).N = true;
                if (this.e0 != 0) {
                    H(jArr[0]);
                    int i11 = this.e0 - 1;
                    this.e0 = i11;
                    System.arraycopy(jArr, 1, jArr, 0, i11);
                }
            }
        }
        if (this.S.c(4)) {
            if (this.V == 2) {
                G();
                E();
                this.X = true;
                return false;
            }
            this.S.j();
            this.S = null;
            try {
                this.b0 = true;
                ((d0) this.J).w();
                this.j0 = this.i0;
                return false;
            } catch (o e7) {
                throw c(e7, e7.c, e7.b, 5002);
            }
        }
        this.j0 = -9223372036854775807L;
        if (this.X) {
            FfmpegAudioDecoder ffmpegAudioDecoder = (FfmpegAudioDecoder) this.Q;
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
        if (!((d0) pVar).n(simpleDecoderOutputBuffer2.h, simpleDecoderOutputBuffer2.c, 1)) {
            this.j0 = this.S.c;
            return false;
        }
        this.L.e++;
        this.S.j();
        this.S = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r0 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D() {
        d dVar = this.Q;
        if (dVar != null && this.V != 2 && !this.a0) {
            if (this.R == null) {
                g gVar = (g) ((h2.j) dVar).d();
                this.R = gVar;
            }
            if (this.V == 1) {
                g gVar2 = this.R;
                gVar2.b = 4;
                h2.j jVar = (h2.j) this.Q;
                jVar.getClass();
                jVar.e(gVar2);
                this.R = null;
                this.V = 2;
                return false;
            }
            y yVar = this.c;
            yVar.A();
            int v = v(yVar, this.R, 0);
            if (v == -5) {
                F(yVar);
                return true;
            }
            if (v == -4) {
                if (this.R.c(4)) {
                    this.a0 = true;
                    this.i0 = this.h0;
                    d dVar2 = this.Q;
                    g gVar3 = this.R;
                    h2.j jVar2 = (h2.j) dVar2;
                    jVar2.getClass();
                    jVar2.e(gVar3);
                    this.R = null;
                    return false;
                }
                if (!this.P) {
                    this.P = true;
                    this.R.a(TLObject.FLAG_27);
                }
                this.h0 = this.R.h;
                if (k() || this.R.c(TLObject.FLAG_29)) {
                    this.i0 = this.h0;
                }
                this.R.m();
                g gVar4 = this.R;
                gVar4.c = this.M;
                h2.j jVar3 = (h2.j) this.Q;
                jVar3.getClass();
                jVar3.e(gVar4);
                this.W = true;
                this.L.c++;
                this.R = null;
                return true;
            }
            if (v != -3) {
                throw new IllegalStateException();
            }
            if (k()) {
                this.i0 = this.h0;
                return false;
            }
        }
        return false;
    }

    public final void E() {
        y yVar = this.I;
        if (this.Q != null) {
            return;
        }
        n2.g gVar = this.U;
        i2.g.D(this.T, gVar);
        this.T = gVar;
        if (gVar != null && gVar.h() == null && this.T.g() == null) {
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Trace.beginSection("createAudioDecoder");
            d B = B(this.M);
            this.Q = B;
            ((h2.j) B).a(this.w);
            Trace.endSection();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            String o9 = ((FfmpegAudioDecoder) this.Q).o();
            long j3 = elapsedRealtime2 - elapsedRealtime;
            Handler handler = (Handler) yVar.b;
            if (handler != null) {
                handler.post(new f0(yVar, o9, elapsedRealtime2, j3, 2));
            }
            this.L.a++;
        } catch (e e7) {
            e2.a.f("DecoderAudioRenderer", "Audio codec error", e7);
            Handler handler2 = (Handler) yVar.b;
            if (handler2 != null) {
                handler2.post(new k2.f(yVar, e7, 0));
            }
            throw c(e7, this.M, false, 4001);
        } catch (OutOfMemoryError e10) {
            throw c(e10, this.M, false, 4001);
        }
    }

    public final void F(y yVar) {
        s sVar = (s) yVar.c;
        sVar.getClass();
        n2.g gVar = (n2.g) yVar.b;
        i2.g.D(this.U, gVar);
        this.U = gVar;
        s sVar2 = this.M;
        this.M = sVar;
        this.N = sVar.M;
        this.O = sVar.N;
        d dVar = this.Q;
        y yVar2 = this.I;
        if (dVar == null) {
            E();
            s sVar3 = this.M;
            Handler handler = (Handler) yVar2.b;
            if (handler != null) {
                handler.post(new t(yVar2, sVar3, null, 19));
                return;
            }
            return;
        }
        i iVar = gVar != this.T ? new i(((FfmpegAudioDecoder) dVar).o(), sVar2, sVar, 0, 128) : new i(((FfmpegAudioDecoder) dVar).o(), sVar2, sVar, 0, 1);
        if (iVar.d == 0) {
            if (this.W) {
                this.V = 1;
            } else {
                G();
                E();
                this.X = true;
            }
        }
        s sVar4 = this.M;
        Handler handler2 = (Handler) yVar2.b;
        if (handler2 != null) {
            handler2.post(new t(yVar2, sVar4, iVar, 19));
        }
    }

    public final void G() {
        this.R = null;
        this.S = null;
        this.V = 0;
        this.W = false;
        this.h0 = -9223372036854775807L;
        this.i0 = -9223372036854775807L;
        d dVar = this.Q;
        if (dVar != null) {
            this.L.b++;
            ((FfmpegAudioDecoder) dVar).release();
            String o9 = ((FfmpegAudioDecoder) this.Q).o();
            y yVar = this.I;
            Handler handler = (Handler) yVar.b;
            if (handler != null) {
                handler.post(new b5(3, yVar, o9));
            }
            this.Q = null;
        }
        i2.g.D(this.T, null);
        this.T = null;
    }

    public final void H(long j3) {
        this.c0 = j3;
        if (j3 != -9223372036854775807L) {
            this.J.getClass();
        }
    }

    public final void I() {
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

    @Override // i2.s0
    public final long a() {
        if (this.n == 2) {
            I();
        }
        return this.Y;
    }

    @Override // i2.s0
    public final boolean b() {
        boolean z10 = this.f0;
        this.f0 = false;
        return z10;
    }

    @Override // i2.f, i2.i1
    public final void d(int i10, Object obj) {
        p pVar = this.J;
        if (i10 == 2) {
            float floatValue = ((Float) obj).floatValue();
            d0 d0Var = (d0) pVar;
            if (d0Var.Q != floatValue) {
                d0Var.Q = floatValue;
                if (d0Var.q()) {
                    d0Var.x.setVolume(d0Var.Q);
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
        if (i10 == 12) {
            if (Build.VERSION.SDK_INT >= 23) {
                e0.b.w(pVar, obj);
            }
        } else {
            if (i10 != 9) {
                if (i10 != 10) {
                    return;
                }
                ((d0) pVar).A(((Integer) obj).intValue());
                return;
            }
            d0 d0Var2 = (d0) pVar;
            d0Var2.F = ((Boolean) obj).booleanValue();
            w wVar = new w(d0Var2.H() ? v0.d : d0Var2.E, -9223372036854775807L, -9223372036854775807L);
            if (d0Var2.q()) {
                d0Var2.C = wVar;
            } else {
                d0Var2.D = wVar;
            }
        }
    }

    @Override // i2.s0
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
                return Math.max(10000L, ((long) ((min / f7) / 2.0f)) - (e2.d0.Q(SystemClock.elapsedRealtime()) - j10));
            }
        } else if (z10 || this.b0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // i2.s0
    public final v0 h() {
        return ((d0) this.J).E;
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
            return d0Var.U && !d0Var.o();
        }
        return true;
    }

    @Override // i2.f
    public final boolean m() {
        boolean e7;
        if (((d0) this.J).o()) {
            return true;
        }
        if (this.M == null) {
            return false;
        }
        if (k()) {
            e7 = this.y;
        } else {
            b1 b1Var = this.r;
            b1Var.getClass();
            e7 = b1Var.e();
        }
        return e7 || this.S != null;
    }

    @Override // i2.f
    public final void n() {
        y yVar = this.I;
        this.M = null;
        this.X = true;
        H(-9223372036854775807L);
        this.f0 = false;
        this.j0 = -9223372036854775807L;
        try {
            i2.g.D(this.U, null);
            this.U = null;
            G();
            ((d0) this.J).y();
        } finally {
            yVar.D(this.L);
        }
    }

    @Override // i2.f
    public final void o(boolean z10, boolean z11) {
        h hVar = new h();
        this.L = hVar;
        y yVar = this.I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new k2.g(yVar, hVar, 1));
        }
        m1 m1Var = this.d;
        m1Var.getClass();
        boolean z12 = m1Var.b;
        p pVar = this.J;
        if (z12) {
            d0 d0Var = (d0) pVar;
            e2.d.g(d0Var.Y);
            if (!d0Var.d0) {
                d0Var.d0 = true;
                d0Var.g();
            }
        } else {
            d0 d0Var2 = (d0) pVar;
            if (d0Var2.d0) {
                d0Var2.d0 = false;
                d0Var2.g();
            }
        }
        k kVar = this.f;
        kVar.getClass();
        d0 d0Var3 = (d0) pVar;
        d0Var3.s = kVar;
        x xVar = this.h;
        xVar.getClass();
        d0Var3.h.I = xVar;
    }

    @Override // i2.f
    public final void p(long j3, boolean z10) {
        ((d0) this.J).g();
        this.Y = j3;
        this.j0 = -9223372036854775807L;
        this.f0 = false;
        this.Z = true;
        this.a0 = false;
        this.b0 = false;
        if (this.Q != null) {
            if (this.V != 0) {
                G();
                E();
                return;
            }
            this.R = null;
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.S;
            if (simpleDecoderOutputBuffer != null) {
                simpleDecoderOutputBuffer.j();
                this.S = null;
            }
            d dVar = this.Q;
            dVar.getClass();
            h2.j jVar = (h2.j) dVar;
            jVar.flush();
            jVar.a(this.w);
            this.W = false;
        }
    }

    @Override // i2.f
    public final void s() {
        ((d0) this.J).u();
        this.g0 = true;
    }

    @Override // i2.f
    public final void t() {
        I();
        ((d0) this.J).t();
        this.g0 = false;
    }

    @Override // i2.f
    public final void u(s[] sVarArr, long j3, long j10, u2.f0 f0Var) {
        this.P = false;
        if (this.c0 == -9223372036854775807L) {
            H(j10);
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
    public final void w(long j3, long j10) {
        if (this.b0) {
            try {
                ((d0) this.J).w();
                this.j0 = this.i0;
                return;
            } catch (o e7) {
                throw c(e7, e7.c, e7.b, 5002);
            }
        }
        if (this.M == null) {
            y yVar = this.c;
            yVar.A();
            this.K.i();
            int v = v(yVar, this.K, 2);
            if (v != -5) {
                if (v == -4) {
                    e2.d.g(this.K.c(4));
                    this.a0 = true;
                    try {
                        this.b0 = true;
                        ((d0) this.J).w();
                        this.j0 = this.i0;
                        return;
                    } catch (o e10) {
                        throw c(e10, null, false, 5002);
                    }
                }
                return;
            }
            F(yVar);
        }
        E();
        if (this.Q != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (C()) {
                }
                while (D()) {
                }
                Trace.endSection();
                synchronized (this.L) {
                }
            } catch (e e11) {
                e2.a.f("DecoderAudioRenderer", "Audio codec error", e11);
                y yVar2 = this.I;
                Handler handler = (Handler) yVar2.b;
                if (handler != null) {
                    handler.post(new k2.f(yVar2, e11, 0));
                }
                throw c(e11, this.M, false, 4003);
            } catch (l e12) {
                throw c(e12, e12.a, false, 5001);
            } catch (k2.m e13) {
                throw c(e13, e13.c, e13.b, 5001);
            } catch (o e14) {
                throw c(e14, e14.c, e14.b, 5002);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (((k2.d0) r4).G(e2.d0.C(4, r2, r1)) == false) goto L19;
     */
    @Override // i2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int z(s sVar) {
        int i10;
        String str = sVar.r;
        int i11 = sVar.K;
        int i12 = sVar.J;
        if (!r0.i(str)) {
            return i2.g.b(0, 0, 0, 0);
        }
        String str2 = sVar.r;
        str2.getClass();
        String str3 = FfmpegLibrary.a;
        if (r0.i(str2)) {
            if (FfmpegLibrary.d(str2)) {
                s C = e2.d0.C(2, i12, i11);
                p pVar = this.J;
                i10 = 4;
                if (!((d0) pVar).G(C)) {
                }
                if (sVar.S != 0) {
                    i10 = 2;
                }
            }
            i10 = 1;
        } else {
            i10 = 0;
        }
        return i10 <= 2 ? i2.g.b(i10, 0, 0, 0) : i10 | 168;
    }

    @Override // i2.f
    public final s0 i() {
        return this;
    }
}
