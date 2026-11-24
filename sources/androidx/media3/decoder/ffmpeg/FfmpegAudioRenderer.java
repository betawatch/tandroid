package androidx.media3.decoder.ffmpeg;

import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class FfmpegAudioRenderer extends ug0 implements ck6, t83 {
    public final tg2 K;
    public final x30 L;
    public final z83 M;
    public w83 N;
    public fm4 O;
    public int P;
    public int Q;
    public boolean R;
    public FfmpegAudioDecoder S;
    public z83 T;
    public SimpleDecoderOutputBuffer U;
    public sq3 V;
    public sq3 W;
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
    public c64 p0;
    public g40 q0;

    public FfmpegAudioRenderer(Handler handler, o30 o30Var, x30 x30Var) {
        super(1);
        this.K = new tg2(handler, o30Var);
        this.L = x30Var;
        this.M = new z83(0, 0);
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

    @Override // ug0
    public final void B(long j, long j2) {
        if (this.d0) {
            try {
                ((q93) this.L).t();
                this.m0 = this.l0;
                return;
            } catch (w30 e) {
                throw e(e, e.c, e.b, 5002);
            }
        }
        byte b = 0;
        if (this.O == null) {
            sk4 sk4Var = this.c;
            sk4Var.m();
            this.M.clear();
            int A = A(sk4Var, this.M, 2);
            if (A != -5) {
                if (A == -4) {
                    gre.p(this.M.isEndOfStream());
                    this.c0 = true;
                    try {
                        this.d0 = true;
                        ((q93) this.L).t();
                        this.m0 = this.l0;
                        return;
                    } catch (w30 e2) {
                        throw e(e2, null, false, 5002);
                    }
                }
                return;
            }
            O(sk4Var);
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
            } catch (s30 e3) {
                throw e(e3, e3.a, false, 5001);
            } catch (t30 e4) {
                throw e(e4, e4.b, e4.a, 5001);
            } catch (w30 e5) {
                throw e(e5, e5.c, e5.b, 5002);
            } catch (x83 e6) {
                lad.d("DecoderAudioRenderer", "Audio codec error", e6);
                tg2 tg2Var = this.K;
                Handler handler = (Handler) tg2Var.b;
                if (handler != null) {
                    handler.post(new j30(tg2Var, e6, b));
                }
                throw e(e6, this.O, false, 4003);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (((q93) r6).j(g8c.G(4, r2, r1)) != 0) goto L15;
     */
    @Override // ug0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int G(fm4 fm4Var) {
        int i;
        String str = fm4Var.t;
        int i2 = fm4Var.P;
        int i3 = fm4Var.N;
        if (!ud7.i(str)) {
            return ls6.a(0, 0, 0, 0);
        }
        String str2 = fm4Var.t;
        str2.getClass();
        String str3 = FfmpegLibrary.a;
        if (ud7.i(str2)) {
            if (FfmpegLibrary.d(str2)) {
                fm4 G = g8c.G(2, i3, i2);
                x30 x30Var = this.L;
                i = 4;
                if (((q93) x30Var).j(G) == 0) {
                }
                if (fm4Var.X != 0) {
                    i = 2;
                }
            }
            i = 1;
        } else {
            i = 0;
        }
        return i <= 2 ? ls6.a(i, 0, 0, 0) : i | kk7.x2;
    }

    @Override // ug0
    public final int H() {
        return 8;
    }

    public final u83 K(fm4 fm4Var) {
        Trace.beginSection("createFfmpegAudioDecoder");
        int i = fm4Var.u;
        int i2 = fm4Var.P;
        int i3 = fm4Var.N;
        if (i == -1) {
            i = 5760;
        }
        fm4 G = g8c.G(2, i3, i2);
        x30 x30Var = this.L;
        boolean z = true;
        if (((q93) x30Var).j(G) != 0) {
            z = ((q93) x30Var).j(g8c.G(4, i3, i2)) != 2 ? false : true ^ "audio/ac3".equals(fm4Var.t);
        }
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i, fm4Var, z);
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
                ((q93) this.L).G = true;
            }
            if (simpleDecoderOutputBuffer.isFirstSample()) {
                long[] jArr = this.f0;
                ((q93) this.L).G = true;
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
                ((q93) this.L).t();
                this.m0 = this.l0;
                return false;
            } catch (w30 e) {
                throw e(e, e.c, e.b, 5002);
            }
        }
        this.m0 = -9223372036854775807L;
        if (this.Z) {
            FfmpegAudioDecoder ffmpegAudioDecoder = this.S;
            ffmpegAudioDecoder.getClass();
            em4 em4Var = new em4();
            em4Var.s = ud7.n("audio/raw");
            em4Var.M = ffmpegAudioDecoder.x;
            em4Var.O = ffmpegAudioDecoder.y;
            em4Var.P = ffmpegAudioDecoder.t;
            em4 a = new fm4(em4Var).a();
            a.Q = this.P;
            a.R = this.Q;
            fm4 fm4Var = this.O;
            a.l = fm4Var.m;
            a.a = fm4Var.a;
            a.b = fm4Var.b;
            a.c = mm5.q(fm4Var.c);
            fm4 fm4Var2 = this.O;
            a.d = fm4Var2.d;
            a.e = fm4Var2.e;
            a.f = fm4Var2.f;
            fm4 fm4Var3 = new fm4(a);
            x30 x30Var = this.L;
            c5a c5aVar = new c5a(fm4Var3);
            c5aVar.c = null;
            c5aVar.d = this.G;
            c5aVar.e = this.H;
            ((q93) x30Var).c(c5aVar.e());
            this.Z = false;
        }
        x30 x30Var2 = this.L;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.U;
        if (!((q93) x30Var2).m(simpleDecoderOutputBuffer2.timeUs, 1, simpleDecoderOutputBuffer2.b)) {
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
            z83 z83Var = this.T;
            if (z83Var == null) {
                z83Var = (z83) ffmpegAudioDecoder.d();
                this.T = z83Var;
            }
            if (this.X == 1) {
                z83Var.setFlags(4);
                FfmpegAudioDecoder ffmpegAudioDecoder2 = this.S;
                z83 z83Var2 = this.T;
                ffmpegAudioDecoder2.getClass();
                ffmpegAudioDecoder2.e(z83Var2);
                this.T = null;
                this.X = (byte) 2;
                return false;
            }
            sk4 sk4Var = this.c;
            sk4Var.m();
            int A = A(sk4Var, this.T, 0);
            if (A == -5) {
                O(sk4Var);
                return true;
            }
            if (A == -4) {
                if (this.T.isEndOfStream()) {
                    this.c0 = true;
                    this.l0 = this.k0;
                    FfmpegAudioDecoder ffmpegAudioDecoder3 = this.S;
                    z83 z83Var3 = this.T;
                    ffmpegAudioDecoder3.getClass();
                    ffmpegAudioDecoder3.e(z83Var3);
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
                z83 z83Var4 = this.T;
                z83Var4.a = this.O;
                FfmpegAudioDecoder ffmpegAudioDecoder4 = this.S;
                ffmpegAudioDecoder4.getClass();
                ffmpegAudioDecoder4.e(z83Var4);
                this.Y = true;
                this.N.c++;
                this.T = null;
                return true;
            }
            if (A != -3) {
                sdb.a();
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
        tg2 tg2Var = this.K;
        if (this.S == null) {
            sq3 sq3Var = this.W;
            ir2.C(this.V, sq3Var);
            this.V = sq3Var;
            if (sq3Var != null && sq3Var.h() == null && this.V.g() == null) {
                return;
            }
            byte b = 0;
            try {
                if (this.q0 == null) {
                    this.q0 = new g40(new Handler(Looper.myLooper()), (byte) 0);
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Trace.beginSection("createAudioDecoder");
                u83 K = K(this.O);
                this.S = (FfmpegAudioDecoder) K;
                ((dia) K).a(this.x);
                this.S.p(this, this.q0);
                Trace.endSection();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                String name = this.S.getName();
                long j = elapsedRealtime2 - elapsedRealtime;
                Handler handler = (Handler) tg2Var.b;
                if (handler != null) {
                    handler.post(new n30((Object) tg2Var, (Object) name, elapsedRealtime2, j, (byte) 0));
                }
                this.N.a++;
            } catch (OutOfMemoryError e) {
                throw e(e, this.O, false, 4001);
            } catch (x83 e2) {
                lad.d("DecoderAudioRenderer", "Audio codec error", e2);
                Handler handler2 = (Handler) tg2Var.b;
                if (handler2 != null) {
                    handler2.post(new j30(tg2Var, e2, b));
                }
                throw e(e2, this.O, false, 4001);
            }
        }
    }

    public final void O(sk4 sk4Var) {
        fm4 fm4Var = (fm4) sk4Var.c;
        fm4Var.getClass();
        sq3 sq3Var = (sq3) sk4Var.b;
        ir2.C(this.W, sq3Var);
        this.W = sq3Var;
        fm4 fm4Var2 = this.O;
        this.O = fm4Var;
        this.P = fm4Var.R;
        this.Q = fm4Var.S;
        FfmpegAudioDecoder ffmpegAudioDecoder = this.S;
        tg2 tg2Var = this.K;
        if (ffmpegAudioDecoder == null) {
            N();
            fm4 fm4Var3 = this.O;
            Handler handler = (Handler) tg2Var.b;
            if (handler != null) {
                handler.post(new nn6(tg2Var, fm4Var3, (Object) null, (byte) 13));
                return;
            }
            return;
        }
        d93 d93Var = sq3Var != this.V ? new d93(ffmpegAudioDecoder.getName(), fm4Var2, fm4Var, 0, 128) : new d93(ffmpegAudioDecoder.getName(), fm4Var2, fm4Var, 0, 1);
        if (d93Var.d == 0) {
            if (this.Y) {
                this.X = (byte) 1;
            } else {
                P();
                N();
                this.Z = true;
            }
        }
        fm4 fm4Var4 = this.O;
        Handler handler2 = (Handler) tg2Var.b;
        if (handler2 != null) {
            handler2.post(new nn6(tg2Var, fm4Var4, d93Var, (byte) 13));
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
            byte b = 1;
            this.N.b++;
            ffmpegAudioDecoder.release();
            String name = this.S.getName();
            tg2 tg2Var = this.K;
            Handler handler = (Handler) tg2Var.b;
            if (handler != null) {
                handler.post(new z20(tg2Var, name, b));
            }
            this.S = null;
        }
        ir2.C(this.V, null);
        this.V = null;
    }

    public final void Q(long j) {
        this.e0 = j;
        if (j != -9223372036854775807L) {
            ((q93) this.L).J = j;
        }
    }

    public final void R() {
        n();
        long h = ((q93) this.L).h();
        if (h != Long.MIN_VALUE) {
            if (!this.b0) {
                h = Math.max(this.a0, h);
            }
            this.a0 = h;
            this.b0 = false;
        }
    }

    @Override // t83
    public final void a() {
        c64 c64Var = this.p0;
        if (c64Var != null) {
            c64Var.a();
        }
    }

    @Override // ck6
    public final void b(zb8 zb8Var) {
        ((q93) this.L).C(zb8Var);
    }

    @Override // t83
    public final void c() {
        c64 c64Var = this.p0;
        if (c64Var != null) {
            c64Var.a();
        }
    }

    @Override // ug0, xc8
    public final void d(int i, Object obj) {
        x30 x30Var = this.L;
        if (i == 2) {
            float floatValue = ((Float) obj).floatValue();
            q93 q93Var = (q93) x30Var;
            if (q93Var.K != floatValue) {
                q93Var.K = floatValue;
                if (q93Var.p()) {
                    q93Var.t.a.setVolume(q93Var.K);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            nz nzVar = (nz) obj;
            q93 q93Var2 = (q93) x30Var;
            if (q93Var2.u.equals(nzVar)) {
                return;
            }
            q93Var2.u = nzVar;
            if (q93Var2.Y) {
                return;
            }
            q93Var2.v();
            return;
        }
        if (i == 6) {
            ((q93) x30Var).A((ta0) obj);
            return;
        }
        if (i == 19) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            q93 q93Var3 = (q93) x30Var;
            q93Var3.getClass();
            if (intValue == 0 || intValue == -1) {
                intValue = -1;
            }
            if (q93Var3.X != intValue) {
                q93Var3.X = intValue;
                q93Var3.v();
                return;
            }
            return;
        }
        if (i == 20) {
            obj.getClass();
            ((q93) x30Var).y((s00) obj);
            return;
        }
        switch (i) {
            case 9:
                q93 q93Var4 = (q93) x30Var;
                q93Var4.y = ((Boolean) obj).booleanValue();
                p93 p93Var = new p93(q93Var4.E() ? zb8.d : q93Var4.x, -9223372036854775807L, -9223372036854775807L);
                if (!q93Var4.p()) {
                    q93Var4.w = p93Var;
                    break;
                } else {
                    q93Var4.v = p93Var;
                    break;
                }
            case 10:
                ((q93) x30Var).z(((Integer) obj).intValue());
                break;
            case 11:
                this.p0 = (c64) obj;
                break;
            case 12:
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                q93 q93Var5 = (q93) x30Var;
                q93Var5.W = audioDeviceInfo;
                j40 j40Var = q93Var5.t;
                if (j40Var != null) {
                    j40Var.a.setPreferredDevice(audioDeviceInfo);
                    break;
                }
                break;
        }
    }

    @Override // ck6
    public final zb8 g() {
        return ((q93) this.L).x;
    }

    @Override // ck6
    public final long h() {
        if (this.n == 2) {
            R();
        }
        return this.a0;
    }

    @Override // ck6
    public final boolean i() {
        boolean z = this.h0;
        this.h0 = false;
        return z;
    }

    @Override // ug0
    public final long j(long j, long j2) {
        q93 q93Var = (q93) this.L;
        boolean z = q93Var.n() && this.m0 != -9223372036854775807L;
        if (this.j0) {
            long g = q93Var.g();
            if (this.i0 && z && g != -9223372036854775807L) {
                return Math.max(10000L, (long) ((Math.min(g, this.m0 - j) / (g() != null ? g().a : 1.0f)) / 2.0f));
            }
        } else if (z || this.d0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // ug0
    public final String l() {
        return "FfmpegAudioRenderer";
    }

    @Override // ug0
    public final boolean n() {
        if (!this.d0) {
            return false;
        }
        q93 q93Var = (q93) this.L;
        if (q93Var.p()) {
            return q93Var.O && !q93Var.n();
        }
        return true;
    }

    @Override // ug0
    public final boolean o() {
        if (((q93) this.L).n()) {
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

    @Override // ug0
    public final void q() {
        tg2 tg2Var = this.K;
        this.O = null;
        this.Z = true;
        Q(-9223372036854775807L);
        this.h0 = false;
        this.i0 = false;
        this.m0 = -9223372036854775807L;
        try {
            ir2.C(this.W, null);
            this.W = null;
            P();
            ((q93) this.L).w();
        } finally {
            tg2Var.u(this.N);
        }
    }

    @Override // ug0
    public final void r(boolean z, boolean z2) {
        w83 w83Var = new w83();
        this.N = w83Var;
        tg2 tg2Var = this.K;
        Handler handler = (Handler) tg2Var.b;
        byte b = 1;
        if (handler != null) {
            handler.post(new k30(tg2Var, w83Var, b));
        }
        d79 d79Var = this.d;
        d79Var.getClass();
        boolean z3 = d79Var.b;
        x30 x30Var = this.L;
        if (z3) {
            q93 q93Var = (q93) x30Var;
            gre.p(q93Var.S);
            if (!q93Var.Y) {
                q93Var.Y = true;
                q93Var.v();
            }
        } else {
            q93 q93Var2 = (q93) x30Var;
            if (q93Var2.Y) {
                q93Var2.Y = false;
                q93Var2.v();
            }
        }
        uc8 uc8Var = this.f;
        uc8Var.getClass();
        q93 q93Var3 = (q93) x30Var;
        q93Var3.m = uc8Var;
        adb adbVar = this.h;
        adbVar.getClass();
        ((l40) q93Var3.r).f = adbVar;
        q93Var3.n = new i4d(this);
    }

    @Override // ug0
    public final void s(long j, boolean z, boolean z2) {
        ((q93) this.L).f();
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

    @Override // ug0
    public final void w() {
        ((q93) this.L).r();
        this.j0 = true;
    }

    @Override // ug0
    public final void x() {
        R();
        ((q93) this.L).q();
        this.j0 = false;
        this.i0 = false;
        this.n0 = -9223372036854775807L;
        this.o0 = false;
    }

    @Override // ug0
    public final void y(fm4[] fm4VarArr, long j, long j2, rx6 rx6Var) {
        this.R = false;
        if (this.e0 == -9223372036854775807L) {
            Q(j2);
            return;
        }
        int i = this.g0;
        long[] jArr = this.f0;
        if (i == jArr.length) {
            lad.f("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + jArr[this.g0 - 1]);
        } else {
            this.g0 = i + 1;
        }
        jArr[this.g0 - 1] = j2;
    }

    @Override // ug0
    public final ck6 k() {
        return this;
    }
}
