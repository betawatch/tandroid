package androidx.media3.decoder.ffmpeg;

import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class FfmpegAudioRenderer extends uh0 implements fm6, fa3 {
    public final lx6 K;
    public final x40 L;
    public final la3 M;
    public ia3 N;
    public go4 O;
    public int P;
    public int Q;
    public boolean R;
    public FfmpegAudioDecoder S;
    public la3 T;
    public SimpleDecoderOutputBuffer U;
    public cs3 V;
    public cs3 W;
    public byte X;
    public boolean Y;
    public boolean Z;
    public long a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public long e0;
    public final long[] f0;
    public int g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public long k0;
    public long l0;
    public long m0;
    public long n0;
    public boolean o0;
    public l74 p0;
    public g50 q0;

    public FfmpegAudioRenderer(Handler handler, o40 o40Var, x40 x40Var) {
        super(1);
        this.K = new lx6(handler, o40Var);
        this.L = x40Var;
        this.M = new la3(0, 0);
        this.X = (byte) 0;
        this.Z = true;
        Q(-9223372036854775807L);
        this.f0 = new long[10];
        this.k0 = -9223372036854775807L;
        this.l0 = -9223372036854775807L;
        this.m0 = -9223372036854775807L;
        this.n0 = -9223372036854775807L;
        this.o0 = false;
    }

    @Override // uh0
    public final void B(long j, long j2) {
        if (this.d0) {
            try {
                ((cb3) this.L).t();
                this.m0 = this.l0;
                return;
            } catch (w40 e) {
                throw e(e, e.c, e.b, 5002);
            }
        }
        byte b = 0;
        if (this.O == null) {
            mj4 mj4Var = this.c;
            mj4Var.i();
            this.M.clear();
            int A = A(mj4Var, this.M, 2);
            if (A != -5) {
                if (A == -4) {
                    jte.p(this.M.isEndOfStream());
                    this.c0 = true;
                    try {
                        this.d0 = true;
                        ((cb3) this.L).t();
                        this.m0 = this.l0;
                        return;
                    } catch (w40 e2) {
                        throw e(e2, null, false, 5002);
                    }
                }
                return;
            }
            O(mj4Var);
        }
        N();
        if (this.S != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (L()) {
                }
                while (M()) {
                }
                Trace.endSection();
                synchronized (this.N) {
                }
            } catch (ja3 e3) {
                ncd.d("DecoderAudioRenderer", "Audio codec error", e3);
                lx6 lx6Var = this.K;
                Handler handler = (Handler) lx6Var.b;
                if (handler != null) {
                    handler.post(new j40(lx6Var, e3, b));
                }
                throw e(e3, this.O, false, 4003);
            } catch (s40 e4) {
                throw e(e4, e4.a, false, 5001);
            } catch (t40 e5) {
                throw e(e5, e5.b, e5.a, 5001);
            } catch (w40 e6) {
                throw e(e6, e6.c, e6.b, 5002);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (((cb3) r6).j(hac.G(4, r2, r1)) != 0) goto L15;
     */
    @Override // uh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int G(go4 go4Var) {
        int i;
        String str = go4Var.t;
        int i2 = go4Var.P;
        int i3 = go4Var.N;
        if (!wf7.i(str)) {
            return kt6.a(0, 0, 0, 0);
        }
        String str2 = go4Var.t;
        str2.getClass();
        String str3 = FfmpegLibrary.a;
        if (wf7.i(str2)) {
            if (FfmpegLibrary.d(str2)) {
                go4 G = hac.G(2, i3, i2);
                x40 x40Var = this.L;
                i = 4;
                if (((cb3) x40Var).j(G) == 0) {
                }
                if (go4Var.X != 0) {
                    i = 2;
                }
            }
            i = 1;
        } else {
            i = 0;
        }
        return i <= 2 ? kt6.a(i, 0, 0, 0) : i | nm7.x2;
    }

    @Override // uh0
    public final int H() {
        return 8;
    }

    public final ga3 K(go4 go4Var) {
        Trace.beginSection("createFfmpegAudioDecoder");
        int i = go4Var.u;
        int i2 = go4Var.P;
        int i3 = go4Var.N;
        if (i == -1) {
            i = 5760;
        }
        go4 G = hac.G(2, i3, i2);
        x40 x40Var = this.L;
        boolean z = true;
        if (((cb3) x40Var).j(G) != 0) {
            z = ((cb3) x40Var).j(hac.G(4, i3, i2)) != 2 ? false : true ^ "audio/ac3".equals(go4Var.t);
        }
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i, go4Var, z);
        Trace.endSection();
        return ffmpegAudioDecoder;
    }

    public final boolean L() {
        if (this.U == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) this.S.c();
            this.U = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer == null) {
                return false;
            }
            int i = simpleDecoderOutputBuffer.skippedOutputBufferCount;
            if (i > 0) {
                this.N.f += i;
                ((cb3) this.L).G = true;
            }
            if (simpleDecoderOutputBuffer.isFirstSample()) {
                long[] jArr = this.f0;
                ((cb3) this.L).G = true;
                if (this.g0 != 0) {
                    Q(jArr[0]);
                    int i2 = this.g0 - 1;
                    this.g0 = i2;
                    System.arraycopy(jArr, 1, jArr, 0, i2);
                }
            }
        }
        if (this.U.isEndOfStream()) {
            if (this.X == 2) {
                P();
                N();
                this.Z = true;
                return false;
            }
            this.U.release();
            this.U = null;
            try {
                this.d0 = true;
                ((cb3) this.L).t();
                this.m0 = this.l0;
                return false;
            } catch (w40 e) {
                throw e(e, e.c, e.b, 5002);
            }
        }
        this.m0 = -9223372036854775807L;
        if (this.Z) {
            FfmpegAudioDecoder ffmpegAudioDecoder = this.S;
            ffmpegAudioDecoder.getClass();
            fo4 fo4Var = new fo4();
            fo4Var.s = wf7.n("audio/raw");
            fo4Var.M = ffmpegAudioDecoder.x;
            fo4Var.O = ffmpegAudioDecoder.y;
            fo4Var.P = ffmpegAudioDecoder.t;
            fo4 a = new go4(fo4Var).a();
            a.Q = this.P;
            a.R = this.Q;
            go4 go4Var = this.O;
            a.l = go4Var.m;
            a.a = go4Var.a;
            a.b = go4Var.b;
            a.c = mo5.q(go4Var.c);
            go4 go4Var2 = this.O;
            a.d = go4Var2.d;
            a.e = go4Var2.e;
            a.f = go4Var2.f;
            go4 go4Var3 = new go4(a);
            x40 x40Var = this.L;
            e7a e7aVar = new e7a(go4Var3);
            e7aVar.b = null;
            e7aVar.c = this.G;
            e7aVar.d = this.H;
            ((cb3) x40Var).c(e7aVar.k());
            this.Z = false;
        }
        x40 x40Var2 = this.L;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.U;
        if (!((cb3) x40Var2).m(simpleDecoderOutputBuffer2.timeUs, 1, simpleDecoderOutputBuffer2.b)) {
            this.m0 = this.U.timeUs;
            return false;
        }
        this.N.e++;
        this.U.release();
        this.U = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r2 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M() {
        FfmpegAudioDecoder ffmpegAudioDecoder = this.S;
        if (ffmpegAudioDecoder != null && this.X != 2 && !this.c0) {
            la3 la3Var = this.T;
            if (la3Var == null) {
                la3Var = (la3) ffmpegAudioDecoder.d();
                this.T = la3Var;
            }
            if (this.X == 1) {
                la3Var.setFlags(4);
                FfmpegAudioDecoder ffmpegAudioDecoder2 = this.S;
                la3 la3Var2 = this.T;
                ffmpegAudioDecoder2.getClass();
                ffmpegAudioDecoder2.e(la3Var2);
                this.T = null;
                this.X = (byte) 2;
                return false;
            }
            mj4 mj4Var = this.c;
            mj4Var.i();
            int A = A(mj4Var, this.T, 0);
            if (A == -5) {
                O(mj4Var);
                return true;
            }
            if (A == -4) {
                if (this.T.isEndOfStream()) {
                    this.c0 = true;
                    this.l0 = this.k0;
                    FfmpegAudioDecoder ffmpegAudioDecoder3 = this.S;
                    la3 la3Var3 = this.T;
                    ffmpegAudioDecoder3.getClass();
                    ffmpegAudioDecoder3.e(la3Var3);
                    this.T = null;
                    return false;
                }
                if (!this.R) {
                    this.R = true;
                    this.T.addFlag(TLObject.FLAG_27);
                }
                this.k0 = this.T.e;
                if (m() || this.T.isLastSample()) {
                    this.l0 = this.k0;
                }
                this.T.d();
                la3 la3Var4 = this.T;
                la3Var4.a = this.O;
                FfmpegAudioDecoder ffmpegAudioDecoder4 = this.S;
                ffmpegAudioDecoder4.getClass();
                ffmpegAudioDecoder4.e(la3Var4);
                this.Y = true;
                this.N.c++;
                this.T = null;
                return true;
            }
            if (A != -3) {
                rjb.h();
                return false;
            }
            if (m()) {
                this.l0 = this.k0;
                return false;
            }
        }
        return false;
    }

    public final void N() {
        lx6 lx6Var = this.K;
        if (this.S == null) {
            cs3 cs3Var = this.W;
            ts2.B(this.V, cs3Var);
            this.V = cs3Var;
            if (cs3Var != null && cs3Var.h() == null && this.V.g() == null) {
                return;
            }
            byte b = 0;
            try {
                if (this.q0 == null) {
                    this.q0 = new g50(new Handler(Looper.myLooper()), (byte) 0);
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Trace.beginSection("createAudioDecoder");
                ga3 K = K(this.O);
                this.S = (FfmpegAudioDecoder) K;
                ((fka) K).a(this.x);
                this.S.p(this, this.q0);
                Trace.endSection();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                String name = this.S.getName();
                long j = elapsedRealtime2 - elapsedRealtime;
                Handler handler = (Handler) lx6Var.b;
                if (handler != null) {
                    handler.post(new n40((Object) lx6Var, (Object) name, elapsedRealtime2, j, (byte) 0));
                }
                this.N.a++;
            } catch (ja3 e) {
                ncd.d("DecoderAudioRenderer", "Audio codec error", e);
                Handler handler2 = (Handler) lx6Var.b;
                if (handler2 != null) {
                    handler2.post(new j40(lx6Var, e, b));
                }
                throw e(e, this.O, false, 4001);
            } catch (OutOfMemoryError e2) {
                throw e(e2, this.O, false, 4001);
            }
        }
    }

    public final void O(mj4 mj4Var) {
        go4 go4Var = (go4) mj4Var.c;
        go4Var.getClass();
        cs3 cs3Var = (cs3) mj4Var.b;
        ts2.B(this.W, cs3Var);
        this.W = cs3Var;
        go4 go4Var2 = this.O;
        this.O = go4Var;
        this.P = go4Var.R;
        this.Q = go4Var.S;
        FfmpegAudioDecoder ffmpegAudioDecoder = this.S;
        lx6 lx6Var = this.K;
        if (ffmpegAudioDecoder == null) {
            N();
            go4 go4Var3 = this.O;
            Handler handler = (Handler) lx6Var.b;
            if (handler != null) {
                handler.post(new op6(lx6Var, go4Var3, (Object) null, (byte) 13));
                return;
            }
            return;
        }
        pa3 pa3Var = cs3Var != this.V ? new pa3(ffmpegAudioDecoder.getName(), go4Var2, go4Var, 0, 128) : new pa3(ffmpegAudioDecoder.getName(), go4Var2, go4Var, 0, 1);
        if (pa3Var.d == 0) {
            if (this.Y) {
                this.X = (byte) 1;
            } else {
                P();
                N();
                this.Z = true;
            }
        }
        go4 go4Var4 = this.O;
        Handler handler2 = (Handler) lx6Var.b;
        if (handler2 != null) {
            handler2.post(new op6(lx6Var, go4Var4, pa3Var, (byte) 13));
        }
    }

    public final void P() {
        this.T = null;
        this.U = null;
        this.X = (byte) 0;
        this.Y = false;
        this.k0 = -9223372036854775807L;
        this.l0 = -9223372036854775807L;
        FfmpegAudioDecoder ffmpegAudioDecoder = this.S;
        if (ffmpegAudioDecoder != null) {
            this.N.b++;
            ffmpegAudioDecoder.release();
            String name = this.S.getName();
            lx6 lx6Var = this.K;
            Handler handler = (Handler) lx6Var.b;
            if (handler != null) {
                handler.post(new x30(lx6Var, name, (byte) 2));
            }
            this.S = null;
        }
        ts2.B(this.V, null);
        this.V = null;
    }

    public final void Q(long j) {
        this.e0 = j;
        if (j != -9223372036854775807L) {
            ((cb3) this.L).J = j;
        }
    }

    public final void R() {
        n();
        long h = ((cb3) this.L).h();
        if (h != Long.MIN_VALUE) {
            if (!this.b0) {
                h = Math.max(this.a0, h);
            }
            this.a0 = h;
            this.b0 = false;
        }
    }

    @Override // fa3
    public final void a() {
        l74 l74Var = this.p0;
        if (l74Var != null) {
            l74Var.a();
        }
    }

    @Override // fm6
    public final void b(ce8 ce8Var) {
        ((cb3) this.L).C(ce8Var);
    }

    @Override // fa3
    public final void c() {
        l74 l74Var = this.p0;
        if (l74Var != null) {
            l74Var.a();
        }
    }

    @Override // uh0, ze8
    public final void d(int i, Object obj) {
        x40 x40Var = this.L;
        if (i == 2) {
            float floatValue = ((Float) obj).floatValue();
            cb3 cb3Var = (cb3) x40Var;
            if (cb3Var.K != floatValue) {
                cb3Var.K = floatValue;
                if (cb3Var.p()) {
                    cb3Var.t.a.setVolume(cb3Var.K);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            o00 o00Var = (o00) obj;
            cb3 cb3Var2 = (cb3) x40Var;
            if (cb3Var2.u.equals(o00Var)) {
                return;
            }
            cb3Var2.u = o00Var;
            if (cb3Var2.Y) {
                return;
            }
            cb3Var2.v();
            return;
        }
        if (i == 6) {
            ((cb3) x40Var).A((tb0) obj);
            return;
        }
        if (i == 19) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            cb3 cb3Var3 = (cb3) x40Var;
            cb3Var3.getClass();
            if (intValue == 0 || intValue == -1) {
                intValue = -1;
            }
            if (cb3Var3.X != intValue) {
                cb3Var3.X = intValue;
                cb3Var3.v();
                return;
            }
            return;
        }
        if (i == 20) {
            obj.getClass();
            ((cb3) x40Var).y((s10) obj);
            return;
        }
        switch (i) {
            case 9:
                cb3 cb3Var4 = (cb3) x40Var;
                cb3Var4.y = ((Boolean) obj).booleanValue();
                bb3 bb3Var = new bb3(cb3Var4.E() ? ce8.d : cb3Var4.x, -9223372036854775807L, -9223372036854775807L);
                if (!cb3Var4.p()) {
                    cb3Var4.w = bb3Var;
                    break;
                } else {
                    cb3Var4.v = bb3Var;
                    break;
                }
            case 10:
                ((cb3) x40Var).z(((Integer) obj).intValue());
                break;
            case 11:
                this.p0 = (l74) obj;
                break;
            case 12:
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                cb3 cb3Var5 = (cb3) x40Var;
                cb3Var5.W = audioDeviceInfo;
                j50 j50Var = cb3Var5.t;
                if (j50Var != null) {
                    j50Var.a.setPreferredDevice(audioDeviceInfo);
                    break;
                }
                break;
        }
    }

    @Override // fm6
    public final ce8 g() {
        return ((cb3) this.L).x;
    }

    @Override // fm6
    public final long h() {
        if (this.n == 2) {
            R();
        }
        return this.a0;
    }

    @Override // fm6
    public final boolean i() {
        boolean z = this.h0;
        this.h0 = false;
        return z;
    }

    @Override // uh0
    public final long j(long j, long j2) {
        cb3 cb3Var = (cb3) this.L;
        boolean z = cb3Var.n() && this.m0 != -9223372036854775807L;
        if (this.j0) {
            long g = cb3Var.g();
            if (this.i0 && z && g != -9223372036854775807L) {
                return Math.max(10000L, (long) ((Math.min(g, this.m0 - j) / (g() != null ? g().a : 1.0f)) / 2.0f));
            }
        } else if (z || this.d0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // uh0
    public final String l() {
        return "FfmpegAudioRenderer";
    }

    @Override // uh0
    public final boolean n() {
        if (!this.d0) {
            return false;
        }
        cb3 cb3Var = (cb3) this.L;
        if (cb3Var.p()) {
            return cb3Var.O && !cb3Var.n();
        }
        return true;
    }

    @Override // uh0
    public final boolean o() {
        if (((cb3) this.L).n()) {
            this.n0 = -9223372036854775807L;
            this.o0 = true;
            return true;
        }
        if (!this.o0 || !this.j0 || !p() || m()) {
            return false;
        }
        this.h.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.n0;
        if (j != -9223372036854775807L) {
            return elapsedRealtime - j < 100;
        }
        this.n0 = elapsedRealtime;
        return true;
    }

    @Override // uh0
    public final void q() {
        lx6 lx6Var = this.K;
        this.O = null;
        this.Z = true;
        Q(-9223372036854775807L);
        this.h0 = false;
        this.i0 = false;
        this.m0 = -9223372036854775807L;
        try {
            ts2.B(this.W, null);
            this.W = null;
            P();
            ((cb3) this.L).w();
        } finally {
            lx6Var.o(this.N);
        }
    }

    @Override // uh0
    public final void r(boolean z, boolean z2) {
        ia3 ia3Var = new ia3();
        this.N = ia3Var;
        lx6 lx6Var = this.K;
        Handler handler = (Handler) lx6Var.b;
        byte b = 1;
        if (handler != null) {
            handler.post(new k40(lx6Var, ia3Var, b));
        }
        f99 f99Var = this.d;
        f99Var.getClass();
        boolean z3 = f99Var.b;
        x40 x40Var = this.L;
        if (z3) {
            cb3 cb3Var = (cb3) x40Var;
            jte.p(cb3Var.S);
            if (!cb3Var.Y) {
                cb3Var.Y = true;
                cb3Var.v();
            }
        } else {
            cb3 cb3Var2 = (cb3) x40Var;
            if (cb3Var2.Y) {
                cb3Var2.Y = false;
                cb3Var2.v();
            }
        }
        we8 we8Var = this.f;
        we8Var.getClass();
        cb3 cb3Var3 = (cb3) x40Var;
        cb3Var3.m = we8Var;
        bfb bfbVar = this.h;
        bfbVar.getClass();
        ((l50) cb3Var3.r).f = bfbVar;
        cb3Var3.n = new nl9((Object) this, (byte) 25);
    }

    @Override // uh0
    public final void s(long j, boolean z, boolean z2) {
        ((cb3) this.L).f();
        this.a0 = j;
        this.m0 = -9223372036854775807L;
        this.n0 = -9223372036854775807L;
        this.o0 = false;
        this.h0 = false;
        this.i0 = false;
        this.b0 = true;
        this.c0 = false;
        this.d0 = false;
        if (this.S != null) {
            if (this.X != 0) {
                P();
                N();
                return;
            }
            this.T = null;
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.U;
            if (simpleDecoderOutputBuffer != null) {
                simpleDecoderOutputBuffer.release();
                this.U = null;
            }
            FfmpegAudioDecoder ffmpegAudioDecoder = this.S;
            ffmpegAudioDecoder.getClass();
            ffmpegAudioDecoder.flush();
            ffmpegAudioDecoder.a(this.x);
            this.Y = false;
        }
    }

    @Override // uh0
    public final void w() {
        ((cb3) this.L).r();
        this.j0 = true;
    }

    @Override // uh0
    public final void x() {
        R();
        ((cb3) this.L).q();
        this.j0 = false;
        this.i0 = false;
        this.n0 = -9223372036854775807L;
        this.o0 = false;
    }

    @Override // uh0
    public final void y(go4[] go4VarArr, long j, long j2, rz6 rz6Var) {
        this.R = false;
        if (this.e0 == -9223372036854775807L) {
            Q(j2);
            return;
        }
        int i = this.g0;
        long[] jArr = this.f0;
        if (i == jArr.length) {
            ncd.f("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + jArr[this.g0 - 1]);
        } else {
            this.g0 = i + 1;
        }
        jArr[this.g0 - 1] = j2;
    }

    @Override // uh0
    public final fm6 k() {
        return this;
    }
}
