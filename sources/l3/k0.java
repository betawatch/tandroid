package l3;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import c2.a1;
import j$.util.Objects;
import j3.v1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k7.y7;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class k0 implements v {
    public static final Object g0 = new Object();
    public static ExecutorService h0;
    public static int i0;
    public h0 A;
    public v1 B;
    public boolean C;
    public ByteBuffer D;
    public int E;
    public long F;
    public long G;
    public long H;
    public long I;
    public int J;
    public boolean K;
    public boolean L;
    public long M;
    public float N;
    public ByteBuffer O;
    public int P;
    public ByteBuffer Q;
    public byte[] R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public z Y;
    public f0 Z;
    public final Context a;
    public boolean a0;
    public final af.d b;
    public long b0;
    public final boolean c;
    public long c0;
    public final b0 d;
    public boolean d0;
    public final w0 e;
    public boolean e0;
    public final s8.i0 f;
    public Looper f0;
    public final s8.i0 g;
    public final h5.c h;
    public final y i;
    public final ArrayDeque j;
    public final boolean k;
    public final int l;
    public j0 m;
    public final f2.c n;
    public final f2.c o;
    public final l0 p;
    public k3.k q;
    public t r;
    public g0 s;
    public g0 t;
    public k u;
    public AudioTrack v;
    public g w;
    public a1 x;
    public d y;
    public h0 z;

    public k0(com.google.firebase.messaging.r rVar) {
        Context context = (Context) rVar.a;
        this.a = context;
        this.w = context != null ? g.a(context) : (g) rVar.b;
        this.b = (af.d) rVar.c;
        int i10 = h5.d0.a;
        this.c = false;
        this.k = false;
        this.l = 0;
        this.p = (l0) rVar.d;
        h5.c cVar = new h5.c();
        this.h = cVar;
        cVar.c();
        this.i = new y(new androidx.biometric.e0(this, 16));
        b0 b0Var = new b0();
        this.d = b0Var;
        w0 w0Var = new w0();
        w0Var.m = h5.d0.f;
        this.e = w0Var;
        v0 v0Var = new v0();
        s8.t tVar = s8.v.b;
        Object[] objArr = {v0Var, b0Var, w0Var};
        s8.l.b(3, objArr);
        this.f = s8.v.s(3, objArr);
        this.g = s8.v.x(new u0());
        this.N = 1.0f;
        this.y = d.h;
        this.X = 0;
        this.Y = new z();
        v1 v1Var = v1.d;
        this.A = new h0(v1Var, 0L, 0L);
        this.B = v1Var;
        this.C = false;
        this.j = new ArrayDeque();
        this.n = new f2.c(3);
        this.o = new f2.c(3);
    }

    public static AudioFormat g(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static boolean p(AudioTrack audioTrack) {
        return h5.d0.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final boolean A(j3.n0 n0Var, d dVar) {
        int i10;
        int n10;
        int i11 = h5.d0.a;
        if (i11 >= 29 && (i10 = this.l) != 0) {
            String str = n0Var.C;
            str.getClass();
            int b10 = h5.o.b(str, n0Var.r);
            if (b10 == 0 || (n10 = h5.d0.n(n0Var.P)) == 0) {
                return false;
            }
            AudioFormat g10 = g(n0Var.Q, n10, b10);
            AudioAttributes audioAttributes = (AudioAttributes) dVar.a().b;
            int playbackOffloadSupport = i11 >= 31 ? AudioManager.getPlaybackOffloadSupport(g10, audioAttributes) : !AudioManager.isOffloadedPlaybackSupported(g10, audioAttributes) ? 0 : (i11 == 30 && h5.d0.d.startsWith("Pixel")) ? 2 : 1;
            if (playbackOffloadSupport != 0) {
                if (playbackOffloadSupport == 1) {
                    return ((n0Var.S != 0 || n0Var.T != 0) && (i10 == 1)) ? false : true;
                }
                if (playbackOffloadSupport == 2) {
                    return true;
                }
                throw new IllegalStateException();
            }
        }
        return false;
    }

    public final void B(ByteBuffer byteBuffer, long j10) {
        ByteBuffer byteBuffer2;
        int write;
        int write2;
        t tVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.Q;
            if (byteBuffer3 != null) {
                h5.a.f(byteBuffer3 == byteBuffer);
            } else {
                this.Q = byteBuffer;
                if (h5.d0.a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.R;
                    if (bArr == null || bArr.length < remaining) {
                        this.R = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.R, 0, remaining);
                    byteBuffer.position(position);
                    this.S = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i10 = h5.d0.a;
            if (i10 < 21) {
                long j11 = this.H;
                y yVar = this.i;
                int b10 = yVar.e - ((int) (j11 - (yVar.b() * yVar.d)));
                if (b10 > 0) {
                    write = this.v.write(this.R, this.S, Math.min(remaining2, b10));
                    if (write > 0) {
                        this.S += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
                byteBuffer2 = byteBuffer;
            } else if (this.a0) {
                h5.a.i(j10 != -9223372036854775807L);
                if (j10 == Long.MIN_VALUE) {
                    j10 = this.b0;
                } else {
                    this.b0 = j10;
                }
                AudioTrack audioTrack = this.v;
                if (i10 >= 26) {
                    byteBuffer2 = byteBuffer;
                    write2 = audioTrack.write(byteBuffer2, remaining2, 1, j10 * 1000);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.D == null) {
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        this.D = allocate;
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        this.D.putInt(1431633921);
                    }
                    if (this.E == 0) {
                        this.D.putInt(4, remaining2);
                        this.D.putLong(8, j10 * 1000);
                        this.D.position(0);
                        this.E = remaining2;
                    }
                    int remaining3 = this.D.remaining();
                    if (remaining3 > 0) {
                        write = audioTrack.write(this.D, remaining3, 1);
                        if (write < 0) {
                            this.E = 0;
                        } else if (write < remaining3) {
                            write = 0;
                        }
                    }
                    write2 = audioTrack.write(byteBuffer2, remaining2, 1);
                    if (write2 < 0) {
                        this.E = 0;
                    } else {
                        this.E -= write2;
                    }
                }
                write = write2;
            } else {
                byteBuffer2 = byteBuffer;
                write = this.v.write(byteBuffer2, remaining2, 1);
            }
            this.c0 = SystemClock.elapsedRealtime();
            f2.c cVar = this.o;
            if (write < 0) {
                u uVar = new u(write, this.t.a, ((i10 >= 24 && write == -6) || write == -32) && this.I > 0);
                t tVar2 = this.r;
                if (tVar2 != null) {
                    tVar2.u(uVar);
                }
                if (uVar.b) {
                    this.w = g.c;
                    throw uVar;
                }
                cVar.C(uVar);
                return;
            }
            cVar.c = null;
            if (p(this.v)) {
                if (this.I > 0) {
                    this.e0 = false;
                }
                if (this.V && (tVar = this.r) != null && write < remaining2 && !this.e0) {
                    tVar.e();
                }
            }
            int i11 = this.t.c;
            if (i11 == 0) {
                this.H += write;
            }
            if (write == remaining2) {
                if (i11 != 0) {
                    h5.a.i(byteBuffer2 == this.O);
                    this.I = (this.J * this.P) + this.I;
                }
                this.Q = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r0 != 4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r0 != 4) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j10) {
        v1 v1Var;
        boolean z4;
        t tVar;
        boolean z10 = z();
        boolean z11 = this.c;
        af.d dVar = this.b;
        if (z10) {
            v1Var = v1.d;
        } else {
            if (!this.a0) {
                g0 g0Var = this.t;
                if (g0Var.c == 0) {
                    int i10 = g0Var.a.R;
                    if (z11) {
                        int i11 = h5.d0.a;
                        if (i10 != 536870912) {
                            if (i10 != 805306368) {
                            }
                        }
                    }
                    v1Var = this.B;
                    s0 s0Var = (s0) dVar.d;
                    float f10 = v1Var.a;
                    if (s0Var.c != f10) {
                        s0Var.c = f10;
                        s0Var.i = true;
                    }
                    float f11 = v1Var.b;
                    if (s0Var.d != f11) {
                        s0Var.d = f11;
                        s0Var.i = true;
                    }
                    this.B = v1Var;
                }
            }
            v1Var = v1.d;
            this.B = v1Var;
        }
        v1 v1Var2 = v1Var;
        if (!this.a0) {
            g0 g0Var2 = this.t;
            if (g0Var2.c == 0) {
                int i12 = g0Var2.a.R;
                if (z11) {
                    int i13 = h5.d0.a;
                    if (i12 != 536870912) {
                        if (i12 != 805306368) {
                        }
                    }
                }
                z4 = this.C;
                ((q0) dVar.c).m = z4;
                this.C = z4;
                long max = Math.max(0L, j10);
                g0 g0Var3 = this.t;
                this.j.add(new h0(v1Var2, max, h5.d0.M(g0Var3.e, k())));
                k kVar = this.t.i;
                this.u = kVar;
                kVar.a();
                tVar = this.r;
                if (tVar == null) {
                    tVar.onSkipSilenceEnabledChanged(this.C);
                    return;
                }
                return;
            }
        }
        z4 = false;
        this.C = z4;
        long max2 = Math.max(0L, j10);
        g0 g0Var32 = this.t;
        this.j.add(new h0(v1Var2, max2, h5.d0.M(g0Var32.e, k())));
        k kVar2 = this.t.i;
        this.u = kVar2;
        kVar2.a();
        tVar = this.r;
        if (tVar == null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01bb, code lost:
    
        if (r9 > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01be, code lost:
    
        if (r13 > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c1, code lost:
    
        if (r13 < 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(j3.n0 n0Var, int[] iArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z4;
        int i14;
        k kVar;
        int i15;
        k kVar2;
        int i16;
        int h;
        int a2;
        int[] iArr2;
        String str = n0Var.C;
        int i17 = n0Var.Q;
        int i18 = n0Var.P;
        int i19 = n0Var.R;
        boolean equals = "audio/raw".equals(str);
        boolean z10 = this.k;
        if (equals) {
            h5.a.f(h5.d0.D(i19));
            int x10 = h5.d0.x(i19, i18);
            s8.s sVar = new s8.s();
            if (this.c && (i19 == 536870912 || i19 == 805306368 || i19 == 4)) {
                sVar.d(this.g);
            } else {
                sVar.d(this.f);
                n[] nVarArr = (n[]) this.b.b;
                int length = nVarArr.length;
                s8.l.b(length, nVarArr);
                sVar.h(sVar.a + length);
                System.arraycopy(nVarArr, 0, sVar.c, sVar.a, length);
                sVar.a += length;
            }
            k kVar3 = new k(sVar.i());
            if (kVar3.equals(this.u)) {
                kVar3 = this.u;
            }
            int i20 = n0Var.S;
            int i21 = n0Var.T;
            w0 w0Var = this.e;
            w0Var.i = i20;
            w0Var.j = i21;
            if (h5.d0.a < 21 && i18 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i22 = 0; i22 < 6; i22++) {
                    iArr2[i22] = i22;
                }
            } else {
                iArr2 = iArr;
            }
            this.d.i = iArr2;
            l lVar = new l(i17, i18, i19);
            try {
                s8.v vVar = kVar3.a;
                if (lVar.equals(l.e)) {
                    throw new m(lVar);
                }
                for (int i23 = 0; i23 < vVar.size(); i23++) {
                    n nVar = (n) vVar.get(i23);
                    l e = nVar.e(lVar);
                    if (nVar.isActive()) {
                        h5.a.i(!e.equals(l.e));
                        lVar = e;
                    }
                }
                int i24 = lVar.b;
                int i25 = lVar.c;
                int i26 = lVar.a;
                int n10 = h5.d0.n(i24);
                int x11 = h5.d0.x(i25, i24);
                i12 = x10;
                i10 = i25;
                k kVar4 = kVar3;
                i15 = x11;
                kVar = kVar4;
                i11 = n10;
                z4 = z10;
                i14 = i26;
                i13 = 0;
            } catch (m e6) {
                throw new r(e6, n0Var);
            }
        } else {
            s8.t tVar = s8.v.b;
            k kVar5 = new k(s8.i0.e);
            if (A(n0Var, this.y)) {
                String str2 = n0Var.C;
                str2.getClass();
                i10 = h5.o.b(str2, n0Var.r);
                i14 = i17;
                kVar = kVar5;
                i11 = h5.d0.n(i18);
                i12 = -1;
                i13 = 1;
                i15 = -1;
                z4 = true;
            } else {
                Pair c3 = f().c(n0Var);
                if (c3 == null) {
                    throw new r("Unable to configure passthrough for: " + n0Var, n0Var);
                }
                int intValue = ((Integer) c3.first).intValue();
                int intValue2 = ((Integer) c3.second).intValue();
                i10 = intValue;
                i11 = intValue2;
                i12 = -1;
                i13 = 2;
                z4 = z10;
                i14 = i17;
                kVar = kVar5;
                i15 = -1;
            }
        }
        if (i10 == 0) {
            throw new r("Invalid output encoding (mode=" + i13 + ") for: " + n0Var, n0Var);
        }
        if (i11 == 0) {
            throw new r("Invalid output channel config (mode=" + i13 + ") for: " + n0Var, n0Var);
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i14, i11, i10);
        h5.a.i(minBufferSize != -2);
        int i27 = i15 != -1 ? i15 : 1;
        int i28 = n0Var.n;
        double d = z4 ? 8.0d : 1.0d;
        this.p.getClass();
        if (i13 != 0) {
            if (i13 == 1) {
                kVar2 = kVar;
                h = y7.a((50000000 * l0.a(i10)) / 1000000);
            } else {
                if (i13 != 2) {
                    throw new IllegalArgumentException();
                }
                int i29 = i10 == 5 ? 500000 : 250000;
                if (i28 != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    roundingMode.getClass();
                    a2 = i28 / 8;
                    int i30 = i28 - (8 * a2);
                    if (i30 != 0) {
                        int i31 = ((i28 ^ 8) >> 31) | 1;
                        switch (t8.b.a[roundingMode.ordinal()]) {
                            case 1:
                                if (i30 != 0) {
                                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                a2 += i31;
                                break;
                            case 5:
                                break;
                            case 6:
                            case 7:
                            case 8:
                                int abs = Math.abs(i30);
                                int abs2 = abs - (Math.abs(8) - abs);
                                if (abs2 == 0) {
                                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                                    break;
                                }
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                } else {
                    a2 = l0.a(i10);
                }
                kVar2 = kVar;
                h = y7.a((i29 * a2) / 1000000);
            }
            i16 = i12;
        } else {
            kVar2 = kVar;
            i16 = i12;
            long j10 = i14;
            long j11 = 250000 * j10;
            long j12 = i27;
            h = h5.d0.h(minBufferSize * 4, y7.a((j11 * j12) / 1000000), y7.a(((MediaController.VIDEO_BITRATE_360 * j10) * j12) / 1000000));
        }
        this.d0 = false;
        g0 g0Var = new g0(n0Var, i16, i13, i15, i14, i11, i10, (((Math.max(minBufferSize, (int) (h * d)) + i27) - 1) / i27) * i27, kVar2, z4);
        if (o()) {
            this.s = g0Var;
        } else {
            this.t = g0Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0049 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        ByteBuffer byteBuffer;
        if (!this.u.d()) {
            ByteBuffer byteBuffer2 = this.Q;
            if (byteBuffer2 != null) {
                B(byteBuffer2, Long.MIN_VALUE);
                if (this.Q != null) {
                    return false;
                }
            }
            return true;
        }
        k kVar = this.u;
        if (kVar.d() && !kVar.d) {
            kVar.d = true;
            ((n) kVar.b.get(0)).c();
        }
        u(Long.MIN_VALUE);
        if (this.u.c() && ((byteBuffer = this.Q) == null || !byteBuffer.hasRemaining())) {
            return true;
        }
    }

    public final void d() {
        h5.a.i(h5.d0.a >= 21);
        h5.a.i(this.W);
        if (this.a0) {
            return;
        }
        this.a0 = true;
        e();
    }

    public final void e() {
        if (o()) {
            this.F = 0L;
            this.G = 0L;
            this.H = 0L;
            this.I = 0L;
            this.e0 = false;
            this.J = 0;
            this.A = new h0(this.B, 0L, 0L);
            this.M = 0L;
            this.z = null;
            this.j.clear();
            this.O = null;
            this.P = 0;
            this.Q = null;
            this.U = false;
            this.T = false;
            this.D = null;
            this.E = 0;
            this.e.o = 0L;
            k kVar = this.t.i;
            this.u = kVar;
            kVar.a();
            AudioTrack audioTrack = this.i.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.v.pause();
            }
            if (p(this.v)) {
                j0 j0Var = this.m;
                j0Var.getClass();
                j0Var.a(this.v);
            }
            if (h5.d0.a < 21 && !this.W) {
                this.X = 0;
            }
            g0 g0Var = this.s;
            if (g0Var != null) {
                this.t = g0Var;
                this.s = null;
            }
            y yVar = this.i;
            yVar.d();
            yVar.c = null;
            yVar.f = null;
            AudioTrack audioTrack2 = this.v;
            h5.c cVar = this.h;
            cVar.b();
            synchronized (g0) {
                try {
                    if (h0 == null) {
                        h0 = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a("ExoPlayer:AudioTrackReleaseThread", 1));
                    }
                    i0++;
                    h0.execute(new ff.c(26, audioTrack2, cVar));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.v = null;
        }
        this.o.c = null;
        this.n.c = null;
    }

    public final g f() {
        Context context;
        g b10;
        i iVar;
        if (this.x == null && (context = this.a) != null) {
            this.f0 = Looper.myLooper();
            a1 a1Var = new a1(context, new gg.f(this, 24));
            this.x = a1Var;
            androidx.mediarouter.app.h hVar = (androidx.mediarouter.app.h) a1Var.f;
            Handler handler = (Handler) a1Var.d;
            Context context2 = (Context) a1Var.b;
            if (a1Var.a) {
                b10 = (g) a1Var.h;
                b10.getClass();
            } else {
                a1Var.a = true;
                j jVar = (j) a1Var.g;
                if (jVar != null) {
                    jVar.a.registerContentObserver(jVar.b, false, jVar);
                }
                if (h5.d0.a >= 23 && (iVar = (i) a1Var.e) != null) {
                    h.a(context2, iVar, handler);
                }
                b10 = g.b(context2, hVar != null ? context2.registerReceiver(hVar, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler) : null);
                a1Var.h = b10;
            }
            this.w = b10;
        }
        return this.w;
    }

    public final long h(boolean z4) {
        ArrayDeque arrayDeque;
        long t6;
        long j10;
        if (!o() || this.L) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.i.a(z4), h5.d0.M(this.t.e, k()));
        while (true) {
            arrayDeque = this.j;
            if (arrayDeque.isEmpty() || min < ((h0) arrayDeque.getFirst()).c) {
                break;
            }
            this.A = (h0) arrayDeque.remove();
        }
        h0 h0Var = this.A;
        long j11 = min - h0Var.c;
        boolean equals = h0Var.a.equals(v1.d);
        af.d dVar = this.b;
        if (equals) {
            t6 = this.A.b + j11;
        } else if (arrayDeque.isEmpty()) {
            s0 s0Var = (s0) dVar.d;
            if (s0Var.o >= 1024) {
                long j12 = s0Var.n;
                s0Var.j.getClass();
                long j13 = j12 - ((r2.k * r2.b) * 2);
                int i10 = s0Var.h.a;
                int i11 = s0Var.g.a;
                j10 = i10 == i11 ? h5.d0.N(j11, j13, s0Var.o) : h5.d0.N(j11, j13 * i10, s0Var.o * i11);
            } else {
                j10 = (long) (s0Var.c * j11);
            }
            t6 = j10 + this.A.b;
        } else {
            h0 h0Var2 = (h0) arrayDeque.getFirst();
            t6 = h0Var2.b - h5.d0.t(h0Var2.c - min, this.A.a.a);
        }
        return h5.d0.M(this.t.e, ((q0) dVar.c).t) + t6;
    }

    public final int i(j3.n0 n0Var) {
        String str = n0Var.C;
        int i10 = n0Var.R;
        if ("audio/raw".equals(str)) {
            if (!h5.d0.D(i10)) {
                e2.c.q(i10, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i10 != 2 && (!this.c || i10 != 4)) {
                return 1;
            }
        } else if ((this.d0 || !A(n0Var, this.y)) && f().c(n0Var) == null) {
            return 0;
        }
        return 2;
    }

    public final long j() {
        return this.t.c == 0 ? this.F / r0.b : this.G;
    }

    public final long k() {
        return this.t.c == 0 ? this.H / r0.d : this.I;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x009c, code lost:
    
        if (n() == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f2, code lost:
    
        if (r5.b() == 0) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x032f, code lost:
    
        if (r13 != 0) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(ByteBuffer byteBuffer, long j10, int i10) {
        int i11;
        int i12;
        byte b10;
        int i13;
        byte b11;
        int i14;
        int i15;
        ByteBuffer byteBuffer2 = this.O;
        h5.a.f(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.s != null) {
            if (c()) {
                g0 g0Var = this.s;
                g0 g0Var2 = this.t;
                g0Var.getClass();
                if (g0Var2.c == g0Var.c && g0Var2.g == g0Var.g && g0Var2.e == g0Var.e && g0Var2.f == g0Var.f && g0Var2.d == g0Var.d && g0Var2.j == g0Var.j) {
                    this.t = this.s;
                    this.s = null;
                    if (p(this.v) && this.l != 3) {
                        if (this.v.getPlayState() == 3) {
                            this.v.setOffloadEndOfStream();
                        }
                        AudioTrack audioTrack = this.v;
                        j3.n0 n0Var = this.t.a;
                        audioTrack.setOffloadDelayPadding(n0Var.S, n0Var.T);
                        this.e0 = true;
                    }
                } else {
                    s();
                    if (!m()) {
                        e();
                    }
                }
                a(j10);
            }
            return false;
        }
        boolean o10 = o();
        f2.c cVar = this.n;
        if (!o10) {
            try {
            } catch (s e) {
                if (e.b) {
                    throw e;
                }
                cVar.C(e);
                return false;
            }
        }
        cVar.c = null;
        if (this.L) {
            this.M = Math.max(0L, j10);
            this.K = false;
            this.L = false;
            if (z()) {
                w();
            }
            a(j10);
            if (this.V) {
                r();
            }
        }
        long k10 = k();
        y yVar = this.i;
        AudioTrack audioTrack2 = yVar.c;
        audioTrack2.getClass();
        int playState = audioTrack2.getPlayState();
        if (yVar.h) {
            if (playState == 2) {
                yVar.p = false;
                return false;
            }
            if (playState == 1) {
            }
        }
        boolean z4 = yVar.p;
        boolean c3 = yVar.c(k10);
        yVar.p = c3;
        if (z4 && !c3 && playState != 1) {
            androidx.biometric.e0 e0Var = yVar.a;
            int i16 = yVar.e;
            long S = h5.d0.S(yVar.i);
            k0 k0Var = (k0) e0Var.b;
            if (k0Var.r != null) {
                k0Var.r.n(i16, S, SystemClock.elapsedRealtime() - k0Var.c0);
                if (this.O == null) {
                    h5.a.f(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                    if (byteBuffer.hasRemaining()) {
                        g0 g0Var3 = this.t;
                        if (g0Var3.c != 0 && this.J == 0) {
                            int i17 = g0Var3.g;
                            switch (i17) {
                                case 5:
                                case 6:
                                case 18:
                                    i11 = ((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10 ? a.c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256 : 1536;
                                    this.J = i11;
                                    break;
                                case 7:
                                case 8:
                                    if (byteBuffer.getInt(0) != -233094848 && byteBuffer.getInt(0) != -398277519) {
                                        if (byteBuffer.getInt(0) == 622876772) {
                                            i11 = 4096;
                                        } else {
                                            int position = byteBuffer.position();
                                            byte b12 = byteBuffer.get(position);
                                            if (b12 != -2) {
                                                if (b12 == -1) {
                                                    i12 = (byteBuffer.get(position + 4) & 7) << 4;
                                                    b11 = byteBuffer.get(position + 7);
                                                } else if (b12 != 31) {
                                                    i12 = (byteBuffer.get(position + 4) & 1) << 6;
                                                    b10 = byteBuffer.get(position + 5);
                                                } else {
                                                    i12 = (byteBuffer.get(position + 5) & 7) << 4;
                                                    b11 = byteBuffer.get(position + 6);
                                                }
                                                i13 = b11 & 60;
                                                i11 = (((i13 >> 2) | i12) + 1) * 32;
                                            } else {
                                                i12 = (byteBuffer.get(position + 5) & 1) << 6;
                                                b10 = byteBuffer.get(position + 4);
                                            }
                                            i13 = b10 & 252;
                                            i11 = (((i13 >> 2) | i12) + 1) * 32;
                                        }
                                        this.J = i11;
                                        break;
                                    }
                                    i11 = 1024;
                                    this.J = i11;
                                    break;
                                case 9:
                                    int i18 = byteBuffer.getInt(byteBuffer.position());
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i18 = Integer.reverseBytes(i18);
                                    }
                                    int i19 = a.i(i18);
                                    if (i19 == -1) {
                                        throw new IllegalArgumentException();
                                    }
                                    i11 = i19;
                                    this.J = i11;
                                    break;
                                case 10:
                                case 16:
                                    i11 = 1024;
                                    this.J = i11;
                                    break;
                                case 11:
                                case 12:
                                    i11 = 2048;
                                    this.J = i11;
                                    break;
                                case 13:
                                case 19:
                                default:
                                    throw new IllegalStateException(kf.k0.j(i17, "Unexpected audio encoding: "));
                                case 14:
                                    int position2 = byteBuffer.position();
                                    int limit = byteBuffer.limit() - 10;
                                    int i20 = position2;
                                    while (true) {
                                        if (i20 <= limit) {
                                            int i21 = byteBuffer.getInt(i20 + 4);
                                            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                i21 = Integer.reverseBytes(i21);
                                            }
                                            if ((i21 & (-2)) == -126718022) {
                                                i14 = i20 - position2;
                                            } else {
                                                i20++;
                                            }
                                        } else {
                                            i14 = -1;
                                        }
                                    }
                                    if (i14 == -1) {
                                        i11 = 0;
                                    } else {
                                        i11 = (40 << ((byteBuffer.get((byteBuffer.position() + i14) + ((byteBuffer.get((byteBuffer.position() + i14) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                    }
                                    this.J = i11;
                                    break;
                                case 15:
                                    i11 = 512;
                                    this.J = i11;
                                    break;
                                case 17:
                                    byte[] bArr = new byte[16];
                                    int position3 = byteBuffer.position();
                                    byteBuffer.get(bArr);
                                    byteBuffer.position(position3);
                                    i11 = a.g(new h5.v(bArr, 16)).c;
                                    this.J = i11;
                                    break;
                                case 20:
                                    if ((byteBuffer.get(5) & 2) == 0) {
                                        i15 = 0;
                                    } else {
                                        byte b13 = byteBuffer.get(26);
                                        int i22 = 28;
                                        int i23 = 28;
                                        for (int i24 = 0; i24 < b13; i24++) {
                                            i23 += byteBuffer.get(i24 + 27);
                                        }
                                        byte b14 = byteBuffer.get(i23 + 26);
                                        for (int i25 = 0; i25 < b14; i25++) {
                                            i22 += byteBuffer.get(i23 + 27 + i25);
                                        }
                                        i15 = i23 + i22;
                                    }
                                    int i26 = byteBuffer.get(i15 + 26) + 27 + i15;
                                    i11 = (int) ((a.e(byteBuffer.get(i26), byteBuffer.limit() - i26 > 1 ? byteBuffer.get(i26 + 1) : (byte) 0) * 48000) / 1000000);
                                    this.J = i11;
                                    break;
                            }
                        }
                        if (this.z != null) {
                            if (c()) {
                                a(j10);
                                this.z = null;
                            }
                            return false;
                        }
                        long M = h5.d0.M(this.t.a.Q, j() - this.e.o) + this.M;
                        if (!this.K && Math.abs(M - j10) > 200000) {
                            t tVar = this.r;
                            if (tVar != null) {
                                StringBuilder s6 = android.support.v4.media.a.s(M, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                s6.append(j10);
                                tVar.u(new b7.a(s6.toString()));
                            }
                            this.K = true;
                        }
                        if (this.K) {
                            if (c()) {
                                long j11 = j10 - M;
                                this.M += j11;
                                this.K = false;
                                a(j10);
                                t tVar2 = this.r;
                                if (tVar2 != null && j11 != 0) {
                                    tVar2.y();
                                }
                            }
                            return false;
                        }
                        if (this.t.c == 0) {
                            this.F += byteBuffer.remaining();
                        } else {
                            this.G = (this.J * i10) + this.G;
                        }
                        this.O = byteBuffer;
                        this.P = i10;
                    }
                    return true;
                }
                u(j10);
                if (this.O.hasRemaining()) {
                    this.O = null;
                    this.P = 0;
                    return true;
                }
                long k11 = k();
                if (yVar.z != -9223372036854775807L && k11 > 0 && SystemClock.elapsedRealtime() - yVar.z >= 200) {
                    h5.a.K("DefaultAudioSink", "Resetting stalled audio track");
                    e();
                    return true;
                }
                return false;
            }
        }
        if (this.O == null) {
        }
        u(j10);
        if (this.O.hasRemaining()) {
        }
    }

    public final boolean m() {
        return o() && this.i.c(k());
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n() {
        boolean z4;
        AudioTrack a2;
        k3.k kVar;
        h5.c cVar = this.h;
        synchronized (cVar) {
            z4 = cVar.a;
        }
        if (!z4) {
            return false;
        }
        try {
            g0 g0Var = this.t;
            g0Var.getClass();
            try {
                a2 = g0Var.a(this.a0, this.y, this.X);
            } catch (s e) {
                t tVar = this.r;
                if (tVar != null) {
                    tVar.u(e);
                }
                throw e;
            }
        } catch (s e6) {
            g0 g0Var2 = this.t;
            if (g0Var2.h > 1000000) {
                g0 g0Var3 = new g0(g0Var2.a, g0Var2.b, g0Var2.c, g0Var2.d, g0Var2.e, g0Var2.f, g0Var2.g, MediaController.VIDEO_BITRATE_480, g0Var2.i, g0Var2.j);
                try {
                    try {
                        a2 = g0Var3.a(this.a0, this.y, this.X);
                        this.t = g0Var3;
                    } catch (s e10) {
                        t tVar2 = this.r;
                        if (tVar2 != null) {
                            tVar2.u(e10);
                        }
                        throw e10;
                    }
                } catch (s e11) {
                    e6.addSuppressed(e11);
                    if (this.t.c == 1) {
                    }
                }
            }
            if (this.t.c == 1) {
                throw e6;
            }
            this.d0 = true;
            throw e6;
        }
        this.v = a2;
        if (p(a2)) {
            AudioTrack audioTrack = this.v;
            if (this.m == null) {
                this.m = new j0(this);
            }
            j0 j0Var = this.m;
            Handler handler = j0Var.a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new c2.f(handler, 0), j0Var.b);
            if (this.l != 3) {
                AudioTrack audioTrack2 = this.v;
                j3.n0 n0Var = this.t.a;
                audioTrack2.setOffloadDelayPadding(n0Var.S, n0Var.T);
            }
        }
        int i10 = h5.d0.a;
        if (i10 >= 31 && (kVar = this.q) != null) {
            e0.a(this.v, kVar);
        }
        this.X = this.v.getAudioSessionId();
        y yVar = this.i;
        AudioTrack audioTrack3 = this.v;
        g0 g0Var4 = this.t;
        boolean z10 = g0Var4.c == 2;
        int i11 = g0Var4.g;
        int i12 = g0Var4.d;
        int i13 = g0Var4.h;
        yVar.c = audioTrack3;
        yVar.d = i12;
        yVar.e = i13;
        yVar.f = new x(audioTrack3);
        yVar.g = audioTrack3.getSampleRate();
        yVar.h = z10 && i10 < 23 && (i11 == 5 || i11 == 6);
        boolean D = h5.d0.D(i11);
        yVar.q = D;
        yVar.i = D ? h5.d0.M(yVar.g, i13 / i12) : -9223372036854775807L;
        yVar.t = 0L;
        yVar.u = 0L;
        yVar.v = 0L;
        yVar.p = false;
        yVar.y = -9223372036854775807L;
        yVar.z = -9223372036854775807L;
        yVar.r = 0L;
        yVar.o = 0L;
        yVar.j = 1.0f;
        if (o()) {
            if (i10 >= 21) {
                this.v.setVolume(this.N);
            } else {
                AudioTrack audioTrack4 = this.v;
                float f10 = this.N;
                audioTrack4.setStereoVolume(f10, f10);
            }
        }
        this.Y.getClass();
        f0 f0Var = this.Z;
        if (f0Var != null && i10 >= 23) {
            d0.a(this.v, f0Var);
        }
        this.L = true;
        return true;
    }

    public final boolean o() {
        return this.v != null;
    }

    public final void q() {
        this.V = false;
        if (o()) {
            y yVar = this.i;
            yVar.d();
            if (yVar.y == -9223372036854775807L) {
                x xVar = yVar.f;
                xVar.getClass();
                xVar.a();
                this.v.pause();
            }
        }
    }

    public final void r() {
        this.V = true;
        if (o()) {
            x xVar = this.i.f;
            xVar.getClass();
            xVar.a();
            this.v.play();
        }
    }

    public final void s() {
        if (this.U) {
            return;
        }
        this.U = true;
        long k10 = k();
        y yVar = this.i;
        yVar.A = yVar.b();
        yVar.y = SystemClock.elapsedRealtime() * 1000;
        yVar.B = k10;
        this.v.stop();
        this.E = 0;
    }

    public final void t() {
        if (!this.T && o() && c()) {
            s();
            this.T = true;
        }
    }

    public final void u(long j10) {
        ByteBuffer byteBuffer;
        if (!this.u.d()) {
            ByteBuffer byteBuffer2 = this.O;
            if (byteBuffer2 == null) {
                byteBuffer2 = n.a;
            }
            B(byteBuffer2, j10);
            return;
        }
        while (!this.u.c()) {
            do {
                k kVar = this.u;
                if (kVar.d()) {
                    ByteBuffer byteBuffer3 = kVar.c[kVar.b()];
                    if (!byteBuffer3.hasRemaining()) {
                        kVar.e(n.a);
                    }
                    byteBuffer = byteBuffer3;
                } else {
                    byteBuffer = n.a;
                }
                if (byteBuffer.hasRemaining()) {
                    B(byteBuffer, j10);
                } else {
                    ByteBuffer byteBuffer4 = this.O;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    k kVar2 = this.u;
                    ByteBuffer byteBuffer5 = this.O;
                    if (kVar2.d() && !kVar2.d) {
                        kVar2.e(byteBuffer5);
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    public final void v() {
        e();
        s8.t listIterator = this.f.listIterator(0);
        while (listIterator.hasNext()) {
            ((n) listIterator.next()).reset();
        }
        s8.t listIterator2 = this.g.listIterator(0);
        while (listIterator2.hasNext()) {
            ((n) listIterator2.next()).reset();
        }
        k kVar = this.u;
        if (kVar != null) {
            s8.v vVar = kVar.a;
            for (int i10 = 0; i10 < vVar.size(); i10++) {
                n nVar = (n) vVar.get(i10);
                nVar.flush();
                nVar.reset();
            }
            kVar.c = new ByteBuffer[0];
            l lVar = l.e;
            kVar.d = false;
        }
        this.V = false;
        this.d0 = false;
    }

    public final void w() {
        if (o()) {
            try {
                this.v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.B.a).setPitch(this.B.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                h5.a.L("DefaultAudioSink", "Failed to set playback params", e);
            }
            v1 v1Var = new v1(this.v.getPlaybackParams().getSpeed(), this.v.getPlaybackParams().getPitch());
            this.B = v1Var;
            float f10 = v1Var.a;
            y yVar = this.i;
            yVar.j = f10;
            x xVar = yVar.f;
            if (xVar != null) {
                xVar.a();
            }
            yVar.d();
        }
    }

    public final void x(z zVar) {
        if (this.Y.equals(zVar)) {
            return;
        }
        zVar.getClass();
        if (this.v != null) {
            this.Y.getClass();
        }
        this.Y = zVar;
    }

    public final void y(v1 v1Var) {
        this.B = new v1(h5.d0.g(v1Var.a, 0.1f, 8.0f), h5.d0.g(v1Var.b, 0.1f, 8.0f));
        if (z()) {
            w();
            return;
        }
        h0 h0Var = new h0(v1Var, -9223372036854775807L, -9223372036854775807L);
        if (o()) {
            this.z = h0Var;
        } else {
            this.A = h0Var;
        }
    }

    public final boolean z() {
        g0 g0Var = this.t;
        return g0Var != null && g0Var.j && h5.d0.a >= 23;
    }
}
