package androidx.media3.decoder.ffmpeg;

import a3.g0;
import a4.m;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import b2.r;
import b2.s;
import b2.v0;
import e2.d;
import e2.d0;
import e9.i0;
import fg.s1;
import gg.a0;
import h2.e;
import h2.h;
import h2.l;
import i2.f;
import i2.g;
import i2.l1;
import i2.r0;
import j2.k;
import k2.e0;
import k2.j;
import k2.o;
import k2.p;
import k2.x;
import of.b;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class FfmpegAudioRenderer extends f implements r0 {
    public final b I;
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
        this.I = new b(handler, jVar);
        this.J = pVar;
        ((e0) pVar).t = new m(this, 24);
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
    
        if (((k2.e0) r4).G(e2.d0.C(4, r2, r1)) == false) goto L19;
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
        if (!b2.r0.i(str)) {
            return hc.b.c(0, 0, 0, 0);
        }
        String str2 = sVar.r;
        str2.getClass();
        String str3 = FfmpegLibrary.a;
        if (b2.r0.i(str2)) {
            if (FfmpegLibrary.d(str2)) {
                s C = d0.C(2, i12, i11);
                p pVar = this.J;
                i10 = 4;
                if (!((e0) pVar).G(C)) {
                }
                if (sVar.S != 0) {
                    i10 = 2;
                }
            }
            i10 = 1;
        } else {
            i10 = 0;
        }
        return i10 <= 2 ? hc.b.c(i10, 0, 0, 0) : i10 | 168;
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
        s C = d0.C(2, i12, i11);
        p pVar = this.J;
        boolean z10 = true;
        if (((e0) pVar).G(C)) {
            z10 = ((e0) pVar).k(d0.C(4, i12, i11)) != 2 ? false : true ^ "audio/ac3".equals(sVar.r);
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
                ((e0) this.J).N = true;
            }
            if (simpleDecoderOutputBuffer.isFirstSample()) {
                long[] jArr = this.d0;
                ((e0) this.J).N = true;
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
                ((e0) this.J).w();
                this.j0 = this.i0;
                return false;
            } catch (o e) {
                throw d(e, e.c, e.b, 5002);
            }
        }
        this.j0 = -9223372036854775807L;
        if (this.X) {
            FfmpegAudioDecoder ffmpegAudioDecoder = this.Q;
            ffmpegAudioDecoder.getClass();
            r rVar = new r();
            rVar.q = b2.r0.n("audio/raw");
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
            ((e0) this.J).d(new s(a2), null);
            this.X = false;
        }
        p pVar = this.J;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.S;
        if (!((e0) pVar).n(simpleDecoderOutputBuffer2.timeUs, 1, simpleDecoderOutputBuffer2.b)) {
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
            b bVar = this.c;
            bVar.F();
            int w10 = w(bVar, this.R, 0);
            if (w10 == -5) {
                G(bVar);
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
        b bVar = this.I;
        if (this.Q != null) {
            return;
        }
        n2.g gVar = this.U;
        hc.b.D(this.T, gVar);
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
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new g0(bVar, name, elapsedRealtime2, j3, 1));
            }
            this.L.a++;
        } catch (h2.f e) {
            e2.a.f("DecoderAudioRenderer", "Audio codec error", e);
            Handler handler2 = (Handler) bVar.b;
            if (handler2 != null) {
                handler2.post(new k2.f(bVar, e, 0));
            }
            throw d(e, this.M, false, 4001);
        } catch (OutOfMemoryError e7) {
            throw d(e7, this.M, false, 4001);
        }
    }

    public final void G(b bVar) {
        s sVar = (s) bVar.c;
        sVar.getClass();
        n2.g gVar = (n2.g) bVar.b;
        hc.b.D(this.U, gVar);
        this.U = gVar;
        s sVar2 = this.M;
        this.M = sVar;
        this.N = sVar.M;
        this.O = sVar.N;
        FfmpegAudioDecoder ffmpegAudioDecoder = this.Q;
        b bVar2 = this.I;
        if (ffmpegAudioDecoder == null) {
            F();
            s sVar3 = this.M;
            Handler handler = (Handler) bVar2.b;
            if (handler != null) {
                handler.post(new a0(bVar2, sVar3, (Object) null, 13));
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
        Handler handler2 = (Handler) bVar2.b;
        if (handler2 != null) {
            handler2.post(new a0(bVar2, sVar4, hVar, 13));
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
            b bVar = this.I;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new s1(26, bVar, name));
            }
            this.Q = null;
        }
        hc.b.D(this.T, null);
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
        long i10 = ((e0) this.J).i();
        if (i10 != Long.MIN_VALUE) {
            if (!this.Z) {
                i10 = Math.max(this.Y, i10);
            }
            this.Y = i10;
            this.Z = false;
        }
    }

    @Override // i2.r0
    public final long a() {
        if (this.n == 2) {
            J();
        }
        return this.Y;
    }

    @Override // i2.r0
    public final boolean b() {
        boolean z10 = this.f0;
        this.f0 = false;
        return z10;
    }

    @Override // i2.f, i2.h1
    public final void c(int i10, Object obj) {
        p pVar = this.J;
        if (i10 == 2) {
            float floatValue = ((Float) obj).floatValue();
            e0 e0Var = (e0) pVar;
            if (e0Var.Q != floatValue) {
                e0Var.Q = floatValue;
                if (e0Var.q()) {
                    e0Var.x.setVolume(e0Var.Q);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            ((e0) pVar).z((b2.e) obj);
            return;
        }
        if (i10 == 6) {
            ((e0) pVar).C((b2.f) obj);
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
                ((e0) pVar).A(((Integer) obj).intValue());
                return;
            }
            e0 e0Var2 = (e0) pVar;
            e0Var2.F = ((Boolean) obj).booleanValue();
            x xVar = new x(e0Var2.H() ? v0.d : e0Var2.E, -9223372036854775807L, -9223372036854775807L);
            if (e0Var2.q()) {
                e0Var2.C = xVar;
            } else {
                e0Var2.D = xVar;
            }
        }
    }

    @Override // i2.r0
    public final void f(v0 v0Var) {
        ((e0) this.J).F(v0Var);
    }

    @Override // i2.f
    public final long g(long j3, long j10) {
        boolean z10 = this.j0 != -9223372036854775807L;
        if (this.g0) {
            long h = ((e0) this.J).h();
            if (z10 && h != -9223372036854775807L) {
                float min = Math.min(h, this.j0 - j3);
                float f7 = h() != null ? h().a : 1.0f;
                this.h.getClass();
                return Math.max(10000L, ((long) ((min / f7) / 2.0f)) - (d0.Q(SystemClock.elapsedRealtime()) - j10));
            }
        } else if (z10 || this.b0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // i2.r0
    public final v0 h() {
        return ((e0) this.J).E;
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
        e0 e0Var = (e0) this.J;
        if (e0Var.q()) {
            return e0Var.U && !e0Var.o();
        }
        return true;
    }

    @Override // i2.f
    public final boolean m() {
        if (((e0) this.J).o()) {
            return true;
        }
        if (this.M != null) {
            return n() || this.S != null;
        }
        return false;
    }

    @Override // i2.f
    public final void o() {
        b bVar = this.I;
        this.M = null;
        this.X = true;
        I(-9223372036854775807L);
        this.f0 = false;
        this.j0 = -9223372036854775807L;
        try {
            hc.b.D(this.U, null);
            this.U = null;
            H();
            ((e0) this.J).y();
        } finally {
            bVar.J(this.L);
        }
    }

    @Override // i2.f
    public final void p(boolean z10, boolean z11) {
        g gVar = new g();
        this.L = gVar;
        b bVar = this.I;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new k2.g(bVar, gVar, 1));
        }
        l1 l1Var = this.d;
        l1Var.getClass();
        boolean z12 = l1Var.b;
        p pVar = this.J;
        if (z12) {
            e0 e0Var = (e0) pVar;
            d.g(e0Var.Y);
            if (!e0Var.d0) {
                e0Var.d0 = true;
                e0Var.g();
            }
        } else {
            e0 e0Var2 = (e0) pVar;
            if (e0Var2.d0) {
                e0Var2.d0 = false;
                e0Var2.g();
            }
        }
        k kVar = this.f;
        kVar.getClass();
        e0 e0Var3 = (e0) pVar;
        e0Var3.s = kVar;
        e2.x xVar = this.h;
        xVar.getClass();
        e0Var3.h.I = xVar;
    }

    @Override // i2.f
    public final void q(long j3, boolean z10) {
        ((e0) this.J).g();
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
        ((e0) this.J).u();
        this.g0 = true;
    }

    @Override // i2.f
    public final void u() {
        J();
        ((e0) this.J).t();
        this.g0 = false;
    }

    @Override // i2.f
    public final void v(s[] sVarArr, long j3, long j10, u2.g0 g0Var) {
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
                ((e0) this.J).w();
                this.j0 = this.i0;
                return;
            } catch (o e) {
                throw d(e, e.c, e.b, 5002);
            }
        }
        if (this.M == null) {
            b bVar = this.c;
            bVar.F();
            this.K.clear();
            int w10 = w(bVar, this.K, 2);
            if (w10 != -5) {
                if (w10 == -4) {
                    d.g(this.K.isEndOfStream());
                    this.a0 = true;
                    try {
                        this.b0 = true;
                        ((e0) this.J).w();
                        this.j0 = this.i0;
                        return;
                    } catch (o e7) {
                        throw d(e7, null, false, 5002);
                    }
                }
                return;
            }
            G(bVar);
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
            } catch (h2.f e10) {
                e2.a.f("DecoderAudioRenderer", "Audio codec error", e10);
                b bVar2 = this.I;
                Handler handler = (Handler) bVar2.b;
                if (handler != null) {
                    handler.post(new k2.f(bVar2, e10, 0));
                }
                throw d(e10, this.M, false, 4003);
            } catch (k2.l e11) {
                throw d(e11, e11.a, false, 5001);
            } catch (k2.m e12) {
                throw d(e12, e12.c, e12.b, 5001);
            } catch (o e13) {
                throw d(e13, e13.c, e13.b, 5002);
            }
        }
    }

    @Override // i2.f
    public final r0 i() {
        return this;
    }
}
