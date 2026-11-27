package androidx.media3.decoder.ffmpeg;

import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class FfmpegAudioRenderer extends vg0 implements hm6, m93 {
    public final lh2 K;
    public final y30 L;
    public final s93 M;
    public p93 N;
    public ko4 O;
    public int P;
    public int Q;
    public boolean R;
    public FfmpegAudioDecoder S;
    public s93 T;
    public SimpleDecoderOutputBuffer U;
    public jr3 V;
    public jr3 W;
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
    public w64 p0;
    public i40 q0;

    public FfmpegAudioRenderer(Handler handler, p30 p30Var, y30 y30Var) {
        super(1);
        this.K = new lh2(handler, p30Var);
        this.L = y30Var;
        this.M = new s93(0, 0);
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

    @Override // vg0
    public final void B(long j, long j2) {
        if (this.d0) {
            try {
                ((ja3) this.L).t();
                this.m0 = this.l0;
                return;
            } catch (x30 e) {
                throw e(e, e.c, e.b, 5002);
            }
        }
        byte b = 0;
        if (this.O == null) {
            ym4 ym4Var = this.c;
            ym4Var.t();
            this.M.clear();
            int A = A(ym4Var, this.M, 2);
            if (A != -5) {
                if (A == -4) {
                    yve.p(this.M.isEndOfStream());
                    this.c0 = true;
                    try {
                        this.d0 = true;
                        ((ja3) this.L).t();
                        this.m0 = this.l0;
                        return;
                    } catch (x30 e2) {
                        throw e(e2, null, false, 5002);
                    }
                }
                return;
            }
            O(ym4Var);
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
            } catch (q93 e3) {
                efd.d("DecoderAudioRenderer", "Audio codec error", e3);
                lh2 lh2Var = this.K;
                Handler handler = (Handler) lh2Var.b;
                if (handler != null) {
                    handler.post(new k30(lh2Var, e3, b));
                }
                throw e(e3, this.O, false, 4003);
            } catch (t30 e4) {
                throw e(e4, e4.a, false, 5001);
            } catch (u30 e5) {
                throw e(e5, e5.b, e5.a, 5001);
            } catch (x30 e6) {
                throw e(e6, e6.c, e6.b, 5002);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (((ja3) r6).j(gcc.G(4, r2, r1)) != 0) goto L15;
     */
    @Override // vg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int G(ko4 ko4Var) {
        int i;
        String str = ko4Var.t;
        int i2 = ko4Var.P;
        int i3 = ko4Var.N;
        if (!eg7.i(str)) {
            return qu6.a(0, 0, 0, 0);
        }
        String str2 = ko4Var.t;
        str2.getClass();
        String str3 = FfmpegLibrary.a;
        if (eg7.i(str2)) {
            if (FfmpegLibrary.d(str2)) {
                ko4 G = gcc.G(2, i3, i2);
                y30 y30Var = this.L;
                i = 4;
                if (((ja3) y30Var).j(G) == 0) {
                }
                if (ko4Var.X != 0) {
                    i = 2;
                }
            }
            i = 1;
        } else {
            i = 0;
        }
        return i <= 2 ? qu6.a(i, 0, 0, 0) : i | jn7.x2;
    }

    @Override // vg0
    public final int H() {
        return 8;
    }

    public final n93 K(ko4 ko4Var) {
        Trace.beginSection("createFfmpegAudioDecoder");
        int i = ko4Var.u;
        int i2 = ko4Var.P;
        int i3 = ko4Var.N;
        if (i == -1) {
            i = 5760;
        }
        ko4 G = gcc.G(2, i3, i2);
        y30 y30Var = this.L;
        boolean z = true;
        if (((ja3) y30Var).j(G) != 0) {
            z = ((ja3) y30Var).j(gcc.G(4, i3, i2)) != 2 ? false : true ^ "audio/ac3".equals(ko4Var.t);
        }
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i, ko4Var, z);
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
                ((ja3) this.L).G = true;
            }
            if (simpleDecoderOutputBuffer.isFirstSample()) {
                long[] jArr = this.f0;
                ((ja3) this.L).G = true;
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
                ((ja3) this.L).t();
                this.m0 = this.l0;
                return false;
            } catch (x30 e) {
                throw e(e, e.c, e.b, 5002);
            }
        }
        this.m0 = -9223372036854775807L;
        if (this.Z) {
            FfmpegAudioDecoder ffmpegAudioDecoder = this.S;
            ffmpegAudioDecoder.getClass();
            jo4 jo4Var = new jo4();
            jo4Var.s = eg7.n("audio/raw");
            jo4Var.M = ffmpegAudioDecoder.x;
            jo4Var.O = ffmpegAudioDecoder.y;
            jo4Var.P = ffmpegAudioDecoder.t;
            jo4 a = new ko4(jo4Var).a();
            a.Q = this.P;
            a.R = this.Q;
            ko4 ko4Var = this.O;
            a.l = ko4Var.m;
            a.a = ko4Var.a;
            a.b = ko4Var.b;
            a.c = po5.q(ko4Var.c);
            ko4 ko4Var2 = this.O;
            a.d = ko4Var2.d;
            a.e = ko4Var2.e;
            a.f = ko4Var2.f;
            ko4 ko4Var3 = new ko4(a);
            y30 y30Var = this.L;
            u8a u8aVar = new u8a(ko4Var3);
            u8aVar.b = null;
            u8aVar.c = this.G;
            u8aVar.d = this.H;
            ((ja3) y30Var).c(u8aVar.h());
            this.Z = false;
        }
        y30 y30Var2 = this.L;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.U;
        if (!((ja3) y30Var2).m(simpleDecoderOutputBuffer2.timeUs, 1, simpleDecoderOutputBuffer2.b)) {
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
            s93 s93Var = this.T;
            if (s93Var == null) {
                s93Var = (s93) ffmpegAudioDecoder.d();
                this.T = s93Var;
            }
            if (this.X == 1) {
                s93Var.setFlags(4);
                FfmpegAudioDecoder ffmpegAudioDecoder2 = this.S;
                s93 s93Var2 = this.T;
                ffmpegAudioDecoder2.getClass();
                ffmpegAudioDecoder2.e(s93Var2);
                this.T = null;
                this.X = (byte) 2;
                return false;
            }
            ym4 ym4Var = this.c;
            ym4Var.t();
            int A = A(ym4Var, this.T, 0);
            if (A == -5) {
                O(ym4Var);
                return true;
            }
            if (A == -4) {
                if (this.T.isEndOfStream()) {
                    this.c0 = true;
                    this.l0 = this.k0;
                    FfmpegAudioDecoder ffmpegAudioDecoder3 = this.S;
                    s93 s93Var3 = this.T;
                    ffmpegAudioDecoder3.getClass();
                    ffmpegAudioDecoder3.e(s93Var3);
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
                s93 s93Var4 = this.T;
                s93Var4.a = this.O;
                FfmpegAudioDecoder ffmpegAudioDecoder4 = this.S;
                ffmpegAudioDecoder4.getClass();
                ffmpegAudioDecoder4.e(s93Var4);
                this.Y = true;
                this.N.c++;
                this.T = null;
                return true;
            }
            if (A != -3) {
                grb.g();
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
        lh2 lh2Var = this.K;
        if (this.S == null) {
            jr3 jr3Var = this.W;
            bs2.C(this.V, jr3Var);
            this.V = jr3Var;
            if (jr3Var != null && jr3Var.h() == null && this.V.g() == null) {
                return;
            }
            byte b = 0;
            try {
                if (this.q0 == null) {
                    this.q0 = new i40(new Handler(Looper.myLooper()), (byte) 0);
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Trace.beginSection("createAudioDecoder");
                n93 K = K(this.O);
                this.S = (FfmpegAudioDecoder) K;
                ((yla) K).a(this.x);
                this.S.p(this, this.q0);
                Trace.endSection();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                String name = this.S.getName();
                long j = elapsedRealtime2 - elapsedRealtime;
                Handler handler = (Handler) lh2Var.b;
                if (handler != null) {
                    handler.post(new o30((Object) lh2Var, (Object) name, elapsedRealtime2, j, (byte) 0));
                }
                this.N.a++;
            } catch (OutOfMemoryError e) {
                throw e(e, this.O, false, 4001);
            } catch (q93 e2) {
                efd.d("DecoderAudioRenderer", "Audio codec error", e2);
                Handler handler2 = (Handler) lh2Var.b;
                if (handler2 != null) {
                    handler2.post(new k30(lh2Var, e2, b));
                }
                throw e(e2, this.O, false, 4001);
            }
        }
    }

    public final void O(ym4 ym4Var) {
        ko4 ko4Var = (ko4) ym4Var.c;
        ko4Var.getClass();
        jr3 jr3Var = (jr3) ym4Var.b;
        bs2.C(this.W, jr3Var);
        this.W = jr3Var;
        ko4 ko4Var2 = this.O;
        this.O = ko4Var;
        this.P = ko4Var.R;
        this.Q = ko4Var.S;
        FfmpegAudioDecoder ffmpegAudioDecoder = this.S;
        lh2 lh2Var = this.K;
        if (ffmpegAudioDecoder == null) {
            N();
            ko4 ko4Var3 = this.O;
            Handler handler = (Handler) lh2Var.b;
            if (handler != null) {
                handler.post(new es6(lh2Var, ko4Var3, (Object) null, (byte) 13));
                return;
            }
            return;
        }
        w93 w93Var = jr3Var != this.V ? new w93(ffmpegAudioDecoder.getName(), ko4Var2, ko4Var, 0, 128) : new w93(ffmpegAudioDecoder.getName(), ko4Var2, ko4Var, 0, 1);
        if (w93Var.d == 0) {
            if (this.Y) {
                this.X = (byte) 1;
            } else {
                P();
                N();
                this.Z = true;
            }
        }
        ko4 ko4Var4 = this.O;
        Handler handler2 = (Handler) lh2Var.b;
        if (handler2 != null) {
            handler2.post(new es6(lh2Var, ko4Var4, w93Var, (byte) 13));
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
            lh2 lh2Var = this.K;
            Handler handler = (Handler) lh2Var.b;
            if (handler != null) {
                handler.post(new a30(lh2Var, name, b));
            }
            this.S = null;
        }
        bs2.C(this.V, null);
        this.V = null;
    }

    public final void Q(long j) {
        this.e0 = j;
        if (j != -9223372036854775807L) {
            ((ja3) this.L).J = j;
        }
    }

    public final void R() {
        n();
        long h = ((ja3) this.L).h();
        if (h != Long.MIN_VALUE) {
            if (!this.b0) {
                h = Math.max(this.a0, h);
            }
            this.a0 = h;
            this.b0 = false;
        }
    }

    @Override // m93
    public final void a() {
        w64 w64Var = this.p0;
        if (w64Var != null) {
            w64Var.a();
        }
    }

    @Override // m93
    public final void b() {
        w64 w64Var = this.p0;
        if (w64Var != null) {
            w64Var.a();
        }
    }

    @Override // hm6
    public final void c(of8 of8Var) {
        ((ja3) this.L).C(of8Var);
    }

    @Override // vg0, lg8
    public final void d(int i, Object obj) {
        y30 y30Var = this.L;
        if (i == 2) {
            float floatValue = ((Float) obj).floatValue();
            ja3 ja3Var = (ja3) y30Var;
            if (ja3Var.K != floatValue) {
                ja3Var.K = floatValue;
                if (ja3Var.p()) {
                    ja3Var.t.a.setVolume(ja3Var.K);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            oz ozVar = (oz) obj;
            ja3 ja3Var2 = (ja3) y30Var;
            if (ja3Var2.u.equals(ozVar)) {
                return;
            }
            ja3Var2.u = ozVar;
            if (ja3Var2.Y) {
                return;
            }
            ja3Var2.v();
            return;
        }
        if (i == 6) {
            ((ja3) y30Var).A((va0) obj);
            return;
        }
        if (i == 19) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            ja3 ja3Var3 = (ja3) y30Var;
            ja3Var3.getClass();
            if (intValue == 0 || intValue == -1) {
                intValue = -1;
            }
            if (ja3Var3.X != intValue) {
                ja3Var3.X = intValue;
                ja3Var3.v();
                return;
            }
            return;
        }
        if (i == 20) {
            obj.getClass();
            ((ja3) y30Var).y((t00) obj);
            return;
        }
        switch (i) {
            case 9:
                ja3 ja3Var4 = (ja3) y30Var;
                ja3Var4.y = ((Boolean) obj).booleanValue();
                ia3 ia3Var = new ia3(ja3Var4.E() ? of8.d : ja3Var4.x, -9223372036854775807L, -9223372036854775807L);
                if (!ja3Var4.p()) {
                    ja3Var4.w = ia3Var;
                    break;
                } else {
                    ja3Var4.v = ia3Var;
                    break;
                }
            case 10:
                ((ja3) y30Var).z(((Integer) obj).intValue());
                break;
            case 11:
                this.p0 = (w64) obj;
                break;
            case 12:
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                ja3 ja3Var5 = (ja3) y30Var;
                ja3Var5.W = audioDeviceInfo;
                l40 l40Var = ja3Var5.t;
                if (l40Var != null) {
                    l40Var.a.setPreferredDevice(audioDeviceInfo);
                    break;
                }
                break;
        }
    }

    @Override // hm6
    public final of8 f() {
        return ((ja3) this.L).x;
    }

    @Override // hm6
    public final long g() {
        if (this.n == 2) {
            R();
        }
        return this.a0;
    }

    @Override // hm6
    public final boolean h() {
        boolean z = this.h0;
        this.h0 = false;
        return z;
    }

    @Override // vg0
    public final long j(long j, long j2) {
        ja3 ja3Var = (ja3) this.L;
        boolean z = ja3Var.n() && this.m0 != -9223372036854775807L;
        if (this.j0) {
            long g = ja3Var.g();
            if (this.i0 && z && g != -9223372036854775807L) {
                return Math.max(10000L, (long) ((Math.min(g, this.m0 - j) / (f() != null ? f().a : 1.0f)) / 2.0f));
            }
        } else if (z || this.d0) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // vg0
    public final String l() {
        return "FfmpegAudioRenderer";
    }

    @Override // vg0
    public final boolean n() {
        if (!this.d0) {
            return false;
        }
        ja3 ja3Var = (ja3) this.L;
        if (ja3Var.p()) {
            return ja3Var.O && !ja3Var.n();
        }
        return true;
    }

    @Override // vg0
    public final boolean o() {
        if (((ja3) this.L).n()) {
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

    @Override // vg0
    public final void q() {
        lh2 lh2Var = this.K;
        this.O = null;
        this.Z = true;
        Q(-9223372036854775807L);
        this.h0 = false;
        this.i0 = false;
        this.m0 = -9223372036854775807L;
        try {
            bs2.C(this.W, null);
            this.W = null;
            P();
            ((ja3) this.L).w();
        } finally {
            lh2Var.l(this.N);
        }
    }

    @Override // vg0
    public final void r(boolean z, boolean z2) {
        p93 p93Var = new p93();
        this.N = p93Var;
        lh2 lh2Var = this.K;
        Handler handler = (Handler) lh2Var.b;
        byte b = 1;
        if (handler != null) {
            handler.post(new l30(lh2Var, p93Var, b));
        }
        qa9 qa9Var = this.d;
        qa9Var.getClass();
        boolean z3 = qa9Var.b;
        y30 y30Var = this.L;
        if (z3) {
            ja3 ja3Var = (ja3) y30Var;
            yve.p(ja3Var.S);
            if (!ja3Var.Y) {
                ja3Var.Y = true;
                ja3Var.v();
            }
        } else {
            ja3 ja3Var2 = (ja3) y30Var;
            if (ja3Var2.Y) {
                ja3Var2.Y = false;
                ja3Var2.v();
            }
        }
        ig8 ig8Var = this.f;
        ig8Var.getClass();
        ja3 ja3Var3 = (ja3) y30Var;
        ja3Var3.m = ig8Var;
        vgb vgbVar = this.h;
        vgbVar.getClass();
        ((n40) ja3Var3.r).f = vgbVar;
        ja3Var3.n = new zm9((Object) this, (byte) 25);
    }

    @Override // vg0
    public final void s(long j, boolean z, boolean z2) {
        ((ja3) this.L).f();
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

    @Override // vg0
    public final void w() {
        ((ja3) this.L).r();
        this.j0 = true;
    }

    @Override // vg0
    public final void x() {
        R();
        ((ja3) this.L).q();
        this.j0 = false;
        this.i0 = false;
        this.n0 = -9223372036854775807L;
        this.o0 = false;
    }

    @Override // vg0
    public final void y(ko4[] ko4VarArr, long j, long j2, vz6 vz6Var) {
        this.R = false;
        if (this.e0 == -9223372036854775807L) {
            Q(j2);
            return;
        }
        int i = this.g0;
        long[] jArr = this.f0;
        if (i == jArr.length) {
            efd.f("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + jArr[this.g0 - 1]);
        } else {
            this.g0 = i + 1;
        }
        jArr[this.g0 - 1] = j2;
    }

    @Override // vg0
    public final hm6 k() {
        return this;
    }
}
