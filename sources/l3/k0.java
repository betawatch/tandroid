package l3;

import ag.o1;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import i7.p7;
import j$.util.Objects;
import j3.x1;
import j7.l1;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jh.w2;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k0 implements t {
    public static final Object d0 = new Object();
    public static ExecutorService e0;
    public static int f0;
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public j[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public x X;
    public e0 Y;
    public boolean Z;
    public final g a;
    public long a0;
    public final g0 b;
    public boolean b0;
    public final boolean c;
    public boolean c0;
    public final z d;
    public final v0 e;
    public final j[] f;
    public final j[] g;
    public final f5.c h;
    public final w i;
    public final ArrayDeque j;
    public final boolean k;
    public final int l;
    public j0 m;
    public final f2.c n;
    public final f2.c o;
    public final l0 p;
    public k3.k q;
    public r r;
    public f0 s;
    public f0 t;
    public AudioTrack u;
    public e v;
    public h0 w;
    public h0 x;
    public x1 y;
    public ByteBuffer z;

    public k0(androidx.biometric.e eVar) {
        this.a = (g) eVar.b;
        g0 g0Var = (g0) eVar.c;
        this.b = g0Var;
        int i10 = f5.d0.a;
        this.c = false;
        this.k = false;
        this.l = 0;
        this.p = (l0) eVar.d;
        f5.c cVar = new f5.c();
        this.h = cVar;
        cVar.c();
        this.i = new w(new o1(this, 20));
        z zVar = new z();
        this.d = zVar;
        v0 v0Var = new v0();
        v0Var.m = f5.d0.f;
        this.e = v0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new q0(), zVar, v0Var);
        Collections.addAll(arrayList, (j[]) g0Var.b);
        this.f = (j[]) arrayList.toArray(new j[0]);
        this.g = new j[]{new m0()};
        this.J = 1.0f;
        this.v = e.h;
        this.W = 0;
        this.X = new x();
        x1 x1Var = x1.d;
        this.x = new h0(x1Var, false, 0L, 0L);
        this.y = x1Var;
        this.R = -1;
        this.K = new j[0];
        this.L = new ByteBuffer[0];
        this.j = new ArrayDeque();
        this.n = new f2.c(4);
        this.o = new f2.c(4);
    }

    public static AudioFormat f(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static boolean p(AudioTrack audioTrack) {
        return f5.d0.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void A(x1 x1Var) {
        x1 x1Var2 = new x1(f5.d0.g(x1Var.a, 0.1f, 8.0f), f5.d0.g(x1Var.b, 0.1f, 8.0f));
        if (!this.k || f5.d0.a < 23) {
            x(x1Var2, i().b);
        } else {
            y(x1Var2);
        }
    }

    public final boolean B() {
        if (this.Z || !"audio/raw".equals(this.t.a.B)) {
            return false;
        }
        int i10 = this.t.a.Q;
        if (!this.c) {
            return true;
        }
        int i11 = f5.d0.a;
        return (i10 == 536870912 || i10 == 805306368 || i10 == 4) ? false : true;
    }

    public final boolean C(j3.t0 t0Var, e eVar) {
        int i10;
        int m10;
        int i11 = f5.d0.a;
        if (i11 >= 29 && (i10 = this.l) != 0) {
            String str = t0Var.B;
            str.getClass();
            int b10 = f5.o.b(str, t0Var.r);
            if (b10 == 0 || (m10 = f5.d0.m(t0Var.O)) == 0) {
                return false;
            }
            AudioFormat f9 = f(t0Var.P, m10, b10);
            AudioAttributes audioAttributes = (AudioAttributes) eVar.a().b;
            int playbackOffloadSupport = i11 >= 31 ? AudioManager.getPlaybackOffloadSupport(f9, audioAttributes) : !AudioManager.isOffloadedPlaybackSupported(f9, audioAttributes) ? 0 : (i11 == 30 && f5.d0.d.startsWith("Pixel")) ? 2 : 1;
            if (playbackOffloadSupport != 0) {
                if (playbackOffloadSupport == 1) {
                    return ((t0Var.R != 0 || t0Var.S != 0) && (i10 == 1)) ? false : true;
                }
                if (playbackOffloadSupport == 2) {
                    return true;
                }
                throw new IllegalStateException();
            }
        }
        return false;
    }

    public final void D(ByteBuffer byteBuffer, long j10) {
        ByteBuffer byteBuffer2;
        int write;
        int write2;
        r rVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.O;
            if (byteBuffer3 != null) {
                f5.a.f(byteBuffer3 == byteBuffer);
            } else {
                this.O = byteBuffer;
                if (f5.d0.a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.P;
                    if (bArr == null || bArr.length < remaining) {
                        this.P = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.P, 0, remaining);
                    byteBuffer.position(position);
                    this.Q = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i10 = f5.d0.a;
            if (i10 < 21) {
                long j11 = this.D;
                w wVar = this.i;
                int a2 = wVar.e - ((int) (j11 - (wVar.a() * wVar.d)));
                if (a2 > 0) {
                    write = this.u.write(this.P, this.Q, Math.min(remaining2, a2));
                    if (write > 0) {
                        this.Q += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
                byteBuffer2 = byteBuffer;
            } else if (this.Z) {
                f5.a.i(j10 != -9223372036854775807L);
                AudioTrack audioTrack = this.u;
                if (i10 >= 26) {
                    byteBuffer2 = byteBuffer;
                    write2 = audioTrack.write(byteBuffer2, remaining2, 1, j10 * 1000);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.z == null) {
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        this.z = allocate;
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        this.z.putInt(1431633921);
                    }
                    if (this.A == 0) {
                        this.z.putInt(4, remaining2);
                        this.z.putLong(8, j10 * 1000);
                        this.z.position(0);
                        this.A = remaining2;
                    }
                    int remaining3 = this.z.remaining();
                    if (remaining3 > 0) {
                        write = audioTrack.write(this.z, remaining3, 1);
                        if (write < 0) {
                            this.A = 0;
                        } else if (write < remaining3) {
                            write = 0;
                        }
                    }
                    write2 = audioTrack.write(byteBuffer2, remaining2, 1);
                    if (write2 < 0) {
                        this.A = 0;
                    } else {
                        this.A -= write2;
                    }
                }
                write = write2;
            } else {
                byteBuffer2 = byteBuffer;
                write = this.u.write(byteBuffer2, remaining2, 1);
            }
            this.a0 = SystemClock.elapsedRealtime();
            f2.c cVar = this.o;
            if (write < 0) {
                s sVar = new s(write, this.t.a, ((i10 >= 24 && write == -6) || write == -32) && this.E > 0);
                r rVar2 = this.r;
                if (rVar2 != null) {
                    rVar2.v(sVar);
                }
                if (sVar.b) {
                    throw sVar;
                }
                cVar.K(sVar);
                return;
            }
            cVar.c = null;
            if (p(this.u)) {
                if (this.E > 0) {
                    this.c0 = false;
                }
                if (this.U && (rVar = this.r) != null && write < remaining2 && !this.c0) {
                    rVar.f();
                }
            }
            int i11 = this.t.c;
            if (i11 == 0) {
                this.D += write;
            }
            if (write == remaining2) {
                if (i11 != 0) {
                    f5.a.i(byteBuffer2 == this.M);
                    this.E = (this.F * this.N) + this.E;
                }
                this.O = null;
            }
        }
    }

    public final void a(long j10) {
        x1 x1Var;
        boolean z10;
        boolean B = B();
        g0 g0Var = this.b;
        if (B) {
            x1Var = i().a;
            t0 t0Var = (t0) g0Var.d;
            float f9 = x1Var.a;
            if (t0Var.c != f9) {
                t0Var.c = f9;
                t0Var.i = true;
            }
            float f10 = x1Var.b;
            if (t0Var.d != f10) {
                t0Var.d = f10;
                t0Var.i = true;
            }
        } else {
            x1Var = x1.d;
        }
        x1 x1Var2 = x1Var;
        int i10 = 0;
        if (B()) {
            boolean z11 = i().b;
            ((r0) g0Var.c).m = z11;
            z10 = z11;
        } else {
            z10 = false;
        }
        this.j.add(new h0(x1Var2, z10, Math.max(0L, j10), (k() * 1000000) / this.t.e));
        j[] jVarArr = this.t.i;
        ArrayList arrayList = new ArrayList();
        for (j jVar : jVarArr) {
            if (jVar.isActive()) {
                arrayList.add(jVar);
            } else {
                jVar.flush();
            }
        }
        int size = arrayList.size();
        this.K = (j[]) arrayList.toArray(new j[size]);
        this.L = new ByteBuffer[size];
        while (true) {
            j[] jVarArr2 = this.K;
            if (i10 >= jVarArr2.length) {
                break;
            }
            j jVar2 = jVarArr2[i10];
            jVar2.flush();
            this.L[i10] = jVar2.a();
            i10++;
        }
        r rVar = this.r;
        if (rVar != null) {
            rVar.onSkipSilenceEnabledChanged(z10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0149, code lost:
    
        if (r6 > 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
    
        if (r13 > 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014f, code lost:
    
        if (r13 < 0) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(j3.t0 t0Var, int[] iArr) {
        j[] jVarArr;
        int intValue;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int h;
        int a2;
        int[] iArr2;
        String str = t0Var.B;
        int i17 = t0Var.P;
        int i18 = t0Var.O;
        int i19 = t0Var.Q;
        if ("audio/raw".equals(str)) {
            f5.a.f(f5.d0.D(i19));
            int w10 = f5.d0.w(i19, i18);
            jVarArr = (this.c && (i19 == 536870912 || i19 == 805306368 || i19 == 4)) ? this.g : this.f;
            int i20 = t0Var.R;
            int i21 = t0Var.S;
            v0 v0Var = this.e;
            v0Var.i = i20;
            v0Var.j = i21;
            if (f5.d0.a < 21 && i18 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i22 = 0; i22 < 6; i22++) {
                    iArr2[i22] = i22;
                }
            } else {
                iArr2 = iArr;
            }
            this.d.i = iArr2;
            h hVar = new h(i17, i18, i19);
            for (j jVar : jVarArr) {
                try {
                    h e10 = jVar.e(hVar);
                    if (jVar.isActive()) {
                        hVar = e10;
                    }
                } catch (i e11) {
                    throw new p(e11, t0Var);
                }
            }
            i11 = hVar.c;
            int i23 = hVar.b;
            int i24 = hVar.a;
            intValue = f5.d0.m(i23);
            int w11 = f5.d0.w(i11, i23);
            i13 = w10;
            i12 = w11;
            i10 = i24;
            i14 = 0;
        } else {
            jVarArr = new j[0];
            if (C(t0Var, this.v)) {
                String str2 = t0Var.B;
                str2.getClass();
                int b10 = f5.o.b(str2, t0Var.r);
                intValue = f5.d0.m(i18);
                i10 = i17;
                i13 = -1;
                i14 = 1;
                i11 = b10;
                i12 = -1;
                if (i11 != 0) {
                    throw new p("Invalid output encoding (mode=" + i14 + ") for: " + t0Var, t0Var);
                }
                if (intValue == 0) {
                    throw new p("Invalid output channel config (mode=" + i14 + ") for: " + t0Var, t0Var);
                }
                int minBufferSize = AudioTrack.getMinBufferSize(i10, intValue, i11);
                f5.a.i(minBufferSize != -2);
                int i25 = i12 != -1 ? i12 : 1;
                int i26 = t0Var.n;
                double d = this.k ? 8.0d : 1.0d;
                this.p.getClass();
                if (i14 != 0) {
                    if (i14 == 1) {
                        i15 = i10;
                        h = p7.a((50000000 * l0.a(i11)) / 1000000);
                    } else {
                        if (i14 != 2) {
                            throw new IllegalArgumentException();
                        }
                        int i27 = i11 == 5 ? 500000 : 250000;
                        if (i26 != -1) {
                            RoundingMode roundingMode = RoundingMode.CEILING;
                            roundingMode.getClass();
                            a2 = i26 / 8;
                            int i28 = i26 - (8 * a2);
                            if (i28 != 0) {
                                int i29 = ((i26 ^ 8) >> 31) | 1;
                                switch (r8.b.a[roundingMode.ordinal()]) {
                                    case 1:
                                        if (i28 != 0) {
                                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                        }
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        a2 += i29;
                                        break;
                                    case 5:
                                        break;
                                    case 6:
                                    case 7:
                                    case 8:
                                        int abs = Math.abs(i28);
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
                            a2 = l0.a(i11);
                        }
                        i15 = i10;
                        h = p7.a((i27 * a2) / 1000000);
                    }
                    i16 = i11;
                } else {
                    i15 = i10;
                    long j10 = i15;
                    i16 = i11;
                    long j11 = i25;
                    h = f5.d0.h(minBufferSize * 4, p7.a(((250000 * j10) * j11) / 1000000), p7.a(((MediaController.VIDEO_BITRATE_360 * j10) * j11) / 1000000));
                }
                this.b0 = false;
                f0 f0Var = new f0(t0Var, i13, i14, i12, i15, intValue, i16, (((Math.max(minBufferSize, (int) (h * d)) + i25) - 1) / i25) * i25, jVarArr);
                if (o()) {
                    this.s = f0Var;
                    return;
                } else {
                    this.t = f0Var;
                    return;
                }
            }
            Pair b11 = this.a.b(t0Var);
            if (b11 == null) {
                throw new p("Unable to configure passthrough for: " + t0Var, t0Var);
            }
            int intValue2 = ((Integer) b11.first).intValue();
            intValue = ((Integer) b11.second).intValue();
            i10 = i17;
            i11 = intValue2;
            i12 = -1;
            i13 = -1;
            i14 = 2;
        }
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r9.O != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        boolean z10;
        int i10;
        j[] jVarArr;
        if (this.R != -1) {
            z10 = false;
            i10 = this.R;
            jVarArr = this.K;
            if (i10 < jVarArr.length) {
            }
            return false;
        }
        this.R = 0;
        z10 = true;
        i10 = this.R;
        jVarArr = this.K;
        if (i10 < jVarArr.length) {
            j jVar = jVarArr[i10];
            if (z10) {
                jVar.c();
            }
            u(-9223372036854775807L);
            if (jVar.d()) {
                this.R++;
                z10 = true;
                i10 = this.R;
                jVarArr = this.K;
                if (i10 < jVarArr.length) {
                    ByteBuffer byteBuffer = this.O;
                    if (byteBuffer != null) {
                        D(byteBuffer, -9223372036854775807L);
                    }
                    this.R = -1;
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        f5.a.i(f5.d0.a >= 21);
        f5.a.i(this.V);
        if (this.Z) {
            return;
        }
        this.Z = true;
        e();
    }

    public final void e() {
        if (o()) {
            w();
            AudioTrack audioTrack = this.i.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.u.pause();
            }
            if (p(this.u)) {
                j0 j0Var = this.m;
                j0Var.getClass();
                j0Var.a(this.u);
            }
            if (f5.d0.a < 21 && !this.V) {
                this.W = 0;
            }
            f0 f0Var = this.s;
            if (f0Var != null) {
                this.t = f0Var;
                this.s = null;
            }
            w wVar = this.i;
            wVar.l = 0L;
            wVar.w = 0;
            wVar.v = 0;
            wVar.m = 0L;
            wVar.C = 0L;
            wVar.F = 0L;
            wVar.k = false;
            wVar.c = null;
            wVar.f = null;
            AudioTrack audioTrack2 = this.u;
            f5.c cVar = this.h;
            cVar.b();
            synchronized (d0) {
                try {
                    if (e0 == null) {
                        e0 = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a("ExoPlayer:AudioTrackReleaseThread", 1));
                    }
                    f0++;
                    e0.execute(new w2(21, audioTrack2, cVar));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.u = null;
        }
        this.o.c = null;
        this.n.c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0225 A[Catch: Exception -> 0x023b, TRY_LEAVE, TryCatch #0 {Exception -> 0x023b, blocks: (B:53:0x0200, B:55:0x0225), top: B:52:0x0200 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g(boolean z10) {
        long j10;
        long j11;
        boolean z11;
        long a2;
        long j12;
        ArrayDeque arrayDeque;
        boolean equals;
        long s10;
        long j13;
        long j14;
        boolean z12;
        long j15;
        long j16;
        String str;
        Method method;
        long max;
        AudioTimestamp audioTimestamp;
        if (!o() || this.H) {
            return Long.MIN_VALUE;
        }
        w wVar = this.i;
        k0 k0Var = (k0) wVar.a.b;
        AudioTrack audioTrack = wVar.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long[] jArr = wVar.b;
            long a10 = (wVar.a() * 1000000) / wVar.g;
            if (a10 != 0) {
                j11 = 1000;
                long nanoTime = System.nanoTime() / 1000;
                j10 = 1000000;
                if (nanoTime - wVar.m >= 30000) {
                    int i10 = wVar.v;
                    jArr[i10] = a10 - nanoTime;
                    wVar.v = (i10 + 1) % 10;
                    int i11 = wVar.w;
                    if (i11 < 10) {
                        wVar.w = i11 + 1;
                    }
                    wVar.m = nanoTime;
                    wVar.l = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = wVar.w;
                        if (i12 >= i13) {
                            break;
                        }
                        wVar.l = (jArr[i12] / i13) + wVar.l;
                        i12++;
                        a10 = a10;
                    }
                }
                long j17 = a10;
                if (!wVar.h) {
                    v vVar = wVar.f;
                    vVar.getClass();
                    u uVar = vVar.a;
                    if (uVar != null) {
                        AudioTimestamp audioTimestamp2 = uVar.b;
                        j14 = 500000;
                        if (nanoTime - vVar.e >= vVar.d) {
                            vVar.e = nanoTime;
                            z12 = uVar.a.getTimestamp(audioTimestamp2);
                            if (z12) {
                                long j18 = audioTimestamp2.framePosition;
                                audioTimestamp = audioTimestamp2;
                                if (uVar.d > j18) {
                                    uVar.c++;
                                }
                                uVar.d = j18;
                                uVar.e = j18 + (uVar.c << 32);
                            } else {
                                audioTimestamp = audioTimestamp2;
                            }
                            int i14 = vVar.b;
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    if (i14 != 2) {
                                        if (i14 != 3) {
                                            if (i14 != 4) {
                                                throw new IllegalStateException();
                                            }
                                        } else if (z12) {
                                            vVar.a();
                                        }
                                    } else if (!z12) {
                                        vVar.a();
                                    }
                                } else if (!z12) {
                                    vVar.a();
                                } else if (uVar.e > vVar.f) {
                                    vVar.b(2);
                                }
                            } else if (z12) {
                                if (audioTimestamp.nanoTime / 1000 >= vVar.c) {
                                    vVar.f = uVar.e;
                                    vVar.b(1);
                                }
                            } else if (nanoTime - vVar.c > 500000) {
                                vVar.b(3);
                            }
                            if (z12) {
                                str = "DefaultAudioSink";
                                j15 = 5000000;
                            } else {
                                if (uVar != null) {
                                    j15 = 5000000;
                                    j16 = uVar.b.nanoTime / 1000;
                                } else {
                                    j15 = 5000000;
                                    j16 = -9223372036854775807L;
                                }
                                long j19 = uVar != null ? uVar.e : -1L;
                                if (Math.abs(j16 - nanoTime) > j15) {
                                    StringBuilder r6 = a4.w.r(j19, "Spurious audio timestamp (system clock mismatch): ", ", ");
                                    r6.append(j16);
                                    r6.append(", ");
                                    r6.append(nanoTime);
                                    r6.append(", ");
                                    r6.append(j17);
                                    r6.append(", ");
                                    r6.append(k0Var.j());
                                    r6.append(", ");
                                    r6.append(k0Var.k());
                                    f5.a.K("DefaultAudioSink", r6.toString());
                                    vVar.b(4);
                                    str = "DefaultAudioSink";
                                } else {
                                    long j20 = j19;
                                    if (Math.abs(((j19 * 1000000) / wVar.g) - j17) > j15) {
                                        StringBuilder r9 = a4.w.r(j20, "Spurious audio timestamp (frame position mismatch): ", ", ");
                                        r9.append(j16);
                                        r9.append(", ");
                                        r9.append(nanoTime);
                                        r9.append(", ");
                                        r9.append(j17);
                                        r9.append(", ");
                                        r9.append(k0Var.j());
                                        r9.append(", ");
                                        r9.append(k0Var.k());
                                        str = "DefaultAudioSink";
                                        f5.a.K(str, r9.toString());
                                        vVar.b(4);
                                    } else {
                                        str = "DefaultAudioSink";
                                        if (vVar.b == 4) {
                                            vVar.a();
                                        }
                                    }
                                }
                            }
                            if (wVar.q && (method = wVar.n) != null && nanoTime - wVar.r >= j14) {
                                try {
                                    AudioTrack audioTrack2 = wVar.c;
                                    audioTrack2.getClass();
                                    Integer num = (Integer) method.invoke(audioTrack2, null);
                                    int i15 = f5.d0.a;
                                    long intValue = (num.intValue() * 1000) - wVar.i;
                                    wVar.o = intValue;
                                    max = Math.max(intValue, 0L);
                                    wVar.o = max;
                                    if (max > j15) {
                                        f5.a.K(str, "Ignoring impossibly large audio latency: " + max);
                                        wVar.o = 0L;
                                    }
                                } catch (Exception unused) {
                                    wVar.n = null;
                                }
                                wVar.r = nanoTime;
                            }
                        }
                    } else {
                        j14 = 500000;
                    }
                    z12 = false;
                    if (z12) {
                    }
                    if (wVar.q) {
                        AudioTrack audioTrack22 = wVar.c;
                        audioTrack22.getClass();
                        Integer num2 = (Integer) method.invoke(audioTrack22, null);
                        int i152 = f5.d0.a;
                        long intValue2 = (num2.intValue() * 1000) - wVar.i;
                        wVar.o = intValue2;
                        max = Math.max(intValue2, 0L);
                        wVar.o = max;
                        if (max > j15) {
                        }
                        wVar.r = nanoTime;
                    }
                }
                long nanoTime2 = System.nanoTime() / j11;
                v vVar2 = wVar.f;
                vVar2.getClass();
                z11 = vVar2.b == 2;
                if (z11) {
                    a2 = wVar.w == 0 ? (wVar.a() * j10) / wVar.g : wVar.l + nanoTime2;
                    if (!z10) {
                        a2 = Math.max(0L, a2 - wVar.o);
                    }
                } else {
                    u uVar2 = vVar2.a;
                    a2 = f5.d0.s(nanoTime2 - (uVar2 != null ? uVar2.b.nanoTime / j11 : -9223372036854775807L), wVar.j) + (((uVar2 != null ? uVar2.e : -1L) * j10) / wVar.g);
                }
                if (wVar.D != z11) {
                    wVar.F = wVar.C;
                    wVar.E = wVar.B;
                }
                j12 = nanoTime2 - wVar.F;
                if (j12 < j10) {
                    long s11 = f5.d0.s(j12, wVar.j) + wVar.E;
                    long j21 = (j12 * j11) / j10;
                    a2 = (((j11 - j21) * s11) + (a2 * j21)) / j11;
                }
                if (!wVar.k) {
                    long j22 = wVar.B;
                    if (a2 > j22) {
                        wVar.k = true;
                        long currentTimeMillis = System.currentTimeMillis() - f5.d0.S(f5.d0.x(f5.d0.S(a2 - j22), wVar.j));
                        r rVar = k0Var.r;
                        if (rVar != null) {
                            rVar.a(currentTimeMillis);
                        }
                    }
                }
                wVar.C = nanoTime2;
                wVar.B = a2;
                wVar.D = z11;
                long min = Math.min(a2, (k() * j10) / this.t.e);
                while (true) {
                    arrayDeque = this.j;
                    if (!!arrayDeque.isEmpty() || min < ((h0) arrayDeque.getFirst()).d) {
                        break;
                    }
                    this.x = (h0) arrayDeque.remove();
                }
                h0 h0Var = this.x;
                long j23 = min - h0Var.d;
                equals = h0Var.a.equals(x1.d);
                g0 g0Var = this.b;
                if (!equals) {
                    s10 = this.x.c + j23;
                } else if (arrayDeque.isEmpty()) {
                    t0 t0Var = (t0) g0Var.d;
                    if (t0Var.o >= 1024) {
                        long j24 = t0Var.n;
                        t0Var.j.getClass();
                        long j25 = j24 - ((r4.k * r4.b) * 2);
                        int i16 = t0Var.h.a;
                        int i17 = t0Var.g.a;
                        j13 = i16 == i17 ? f5.d0.O(j23, j25, t0Var.o) : f5.d0.O(j23, j25 * i16, t0Var.o * i17);
                    } else {
                        j13 = (long) (t0Var.c * j23);
                    }
                    s10 = j13 + this.x.c;
                } else {
                    h0 h0Var2 = (h0) arrayDeque.getFirst();
                    s10 = h0Var2.c - f5.d0.s(h0Var2.d - min, this.x.a.a);
                }
                return ((((r0) g0Var.c).t * j10) / this.t.e) + s10;
            }
        }
        j10 = 1000000;
        j11 = 1000;
        long nanoTime22 = System.nanoTime() / j11;
        v vVar22 = wVar.f;
        vVar22.getClass();
        if (vVar22.b == 2) {
        }
        if (z11) {
        }
        if (wVar.D != z11) {
        }
        j12 = nanoTime22 - wVar.F;
        if (j12 < j10) {
        }
        if (!wVar.k) {
        }
        wVar.C = nanoTime22;
        wVar.B = a2;
        wVar.D = z11;
        long min2 = Math.min(a2, (k() * j10) / this.t.e);
        while (true) {
            arrayDeque = this.j;
            if (!arrayDeque.isEmpty()) {
                break;
            }
            break;
            this.x = (h0) arrayDeque.remove();
        }
        h0 h0Var3 = this.x;
        long j232 = min2 - h0Var3.d;
        equals = h0Var3.a.equals(x1.d);
        g0 g0Var2 = this.b;
        if (!equals) {
        }
        return ((((r0) g0Var2.c).t * j10) / this.t.e) + s10;
    }

    public final int h(j3.t0 t0Var) {
        String str = t0Var.B;
        int i10 = t0Var.Q;
        if ("audio/raw".equals(str)) {
            if (!f5.d0.D(i10)) {
                com.google.android.recaptcha.internal.a.s(i10, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i10 != 2 && (!this.c || i10 != 4)) {
                return 1;
            }
        } else if ((this.b0 || !C(t0Var, this.v)) && this.a.b(t0Var) == null) {
            return 0;
        }
        return 2;
    }

    public final h0 i() {
        h0 h0Var = this.w;
        if (h0Var != null) {
            return h0Var;
        }
        ArrayDeque arrayDeque = this.j;
        return !arrayDeque.isEmpty() ? (h0) arrayDeque.getLast() : this.x;
    }

    public final long j() {
        return this.t.c == 0 ? this.B / r0.b : this.C;
    }

    public final long k() {
        return this.t.c == 0 ? this.D / r0.d : this.E;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02d0, code lost:
    
        if (r14 != 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0096, code lost:
    
        if (n() == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f2, code lost:
    
        if (r5.a() == 0) goto L196;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(long j10, int i10, ByteBuffer byteBuffer) {
        long j11;
        int i11;
        byte b10;
        int i12;
        byte b11;
        int i13;
        ByteBuffer byteBuffer2 = this.M;
        f5.a.f(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.s != null) {
            if (c()) {
                f0 f0Var = this.s;
                f0 f0Var2 = this.t;
                f0Var.getClass();
                if (f0Var2.c == f0Var.c && f0Var2.g == f0Var.g && f0Var2.e == f0Var.e && f0Var2.f == f0Var.f && f0Var2.d == f0Var.d) {
                    this.t = this.s;
                    this.s = null;
                    if (p(this.u) && this.l != 3) {
                        if (this.u.getPlayState() == 3) {
                            this.u.setOffloadEndOfStream();
                        }
                        AudioTrack audioTrack = this.u;
                        j3.t0 t0Var = this.t.a;
                        audioTrack.setOffloadDelayPadding(t0Var.R, t0Var.S);
                        this.c0 = true;
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
            } catch (q e10) {
                if (e10.b) {
                    throw e10;
                }
                cVar.K(e10);
                return false;
            }
        }
        cVar.c = null;
        if (this.H) {
            this.I = Math.max(0L, j10);
            this.G = false;
            this.H = false;
            if (this.k && f5.d0.a >= 23) {
                y(this.y);
            }
            a(j10);
            if (this.U) {
                r();
            }
        }
        long k9 = k();
        w wVar = this.i;
        AudioTrack audioTrack2 = wVar.c;
        audioTrack2.getClass();
        int playState = audioTrack2.getPlayState();
        if (wVar.h) {
            if (playState == 2) {
                wVar.p = false;
                return false;
            }
            if (playState == 1) {
            }
        }
        boolean z10 = wVar.p;
        boolean b12 = wVar.b(k9);
        wVar.p = b12;
        if (z10 && !b12 && playState != 1) {
            o1 o1Var = wVar.a;
            int i14 = wVar.e;
            long S = f5.d0.S(wVar.i);
            k0 k0Var = (k0) o1Var.b;
            if (k0Var.r != null) {
                k0Var.r.o(i14, S, SystemClock.elapsedRealtime() - k0Var.a0);
                if (this.M == null) {
                    f5.a.f(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                    if (byteBuffer.hasRemaining()) {
                        f0 f0Var3 = this.t;
                        if (f0Var3.c != 0 && this.F == 0) {
                            int i15 = f0Var3.g;
                            int i16 = 1024;
                            j11 = 1000000;
                            switch (i15) {
                                case 5:
                                case 6:
                                case 18:
                                    if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                        i16 = b.c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                    } else {
                                        i16 = 1536;
                                    }
                                    this.F = i16;
                                    break;
                                case 7:
                                case 8:
                                    int position = byteBuffer.position();
                                    byte b13 = byteBuffer.get(position);
                                    if (b13 != -2) {
                                        if (b13 == -1) {
                                            i11 = (byteBuffer.get(position + 4) & 7) << 4;
                                            b11 = byteBuffer.get(position + 7);
                                        } else if (b13 != 31) {
                                            i11 = (byteBuffer.get(position + 4) & 1) << 6;
                                            b10 = byteBuffer.get(position + 5);
                                        } else {
                                            i11 = (byteBuffer.get(position + 5) & 7) << 4;
                                            b11 = byteBuffer.get(position + 6);
                                        }
                                        i12 = b11 & 60;
                                        i16 = (((i12 >> 2) | i11) + 1) * 32;
                                        this.F = i16;
                                        break;
                                    } else {
                                        i11 = (byteBuffer.get(position + 5) & 1) << 6;
                                        b10 = byteBuffer.get(position + 4);
                                    }
                                    i12 = b10 & 252;
                                    i16 = (((i12 >> 2) | i11) + 1) * 32;
                                    this.F = i16;
                                case 9:
                                    int position2 = byteBuffer.position();
                                    int i17 = f5.d0.a;
                                    int i18 = byteBuffer.getInt(position2);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i18 = Integer.reverseBytes(i18);
                                    }
                                    i16 = b.i(i18);
                                    if (i16 == -1) {
                                        throw new IllegalArgumentException();
                                    }
                                    this.F = i16;
                                    break;
                                case 10:
                                case 16:
                                    this.F = i16;
                                    break;
                                case 11:
                                case 12:
                                    i16 = 2048;
                                    this.F = i16;
                                    break;
                                case 13:
                                case 19:
                                default:
                                    throw new IllegalStateException(l1.k(i15, "Unexpected audio encoding: "));
                                case 14:
                                    int position3 = byteBuffer.position();
                                    int limit = byteBuffer.limit() - 10;
                                    int i19 = position3;
                                    while (true) {
                                        if (i19 <= limit) {
                                            int i20 = f5.d0.a;
                                            int i21 = byteBuffer.getInt(i19 + 4);
                                            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                i21 = Integer.reverseBytes(i21);
                                            }
                                            if ((i21 & (-2)) == -126718022) {
                                                i13 = i19 - position3;
                                            } else {
                                                i19++;
                                            }
                                        } else {
                                            i13 = -1;
                                        }
                                    }
                                    if (i13 == -1) {
                                        i16 = 0;
                                    } else {
                                        i16 = (40 << ((byteBuffer.get((byteBuffer.position() + i13) + ((byteBuffer.get((byteBuffer.position() + i13) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                    }
                                    this.F = i16;
                                    break;
                                case 15:
                                    i16 = 512;
                                    this.F = i16;
                                    break;
                                case 17:
                                    byte[] bArr = new byte[16];
                                    int position4 = byteBuffer.position();
                                    byteBuffer.get(bArr);
                                    byteBuffer.position(position4);
                                    i16 = b.g(new f5.v(bArr, 16)).c;
                                    this.F = i16;
                                    break;
                                case 20:
                                    i16 = (int) ((b.e(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
                                    this.F = i16;
                                    break;
                            }
                        } else {
                            j11 = 1000000;
                        }
                        if (this.w != null) {
                            if (c()) {
                                a(j10);
                                this.w = null;
                            }
                            return false;
                        }
                        long j12 = (((j() - this.e.o) * j11) / this.t.a.P) + this.I;
                        if (!this.G && Math.abs(j12 - j10) > 200000) {
                            r rVar = this.r;
                            if (rVar != null) {
                                StringBuilder r6 = a4.w.r(j12, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                r6.append(j10);
                                rVar.v(new com.google.firebase.messaging.r(r6.toString()));
                            }
                            this.G = true;
                        }
                        if (this.G) {
                            if (c()) {
                                long j13 = j10 - j12;
                                this.I += j13;
                                this.G = false;
                                a(j10);
                                r rVar2 = this.r;
                                if (rVar2 != null && j13 != 0) {
                                    rVar2.w();
                                }
                            }
                            return false;
                        }
                        if (this.t.c == 0) {
                            this.B += byteBuffer.remaining();
                        } else {
                            this.C = (this.F * i10) + this.C;
                        }
                        this.M = byteBuffer;
                        this.N = i10;
                    }
                    return true;
                }
                u(j10);
                if (this.M.hasRemaining()) {
                    this.M = null;
                    this.N = 0;
                    return true;
                }
                long k10 = k();
                if (wVar.y != -9223372036854775807L && k10 > 0 && SystemClock.elapsedRealtime() - wVar.y >= 200) {
                    f5.a.K("DefaultAudioSink", "Resetting stalled audio track");
                    e();
                    return true;
                }
                return false;
            }
        }
        if (this.M == null) {
        }
        u(j10);
        if (this.M.hasRemaining()) {
        }
    }

    public final boolean m() {
        return o() && this.i.b(k());
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n() {
        boolean z10;
        AudioTrack a2;
        k3.k kVar;
        f5.c cVar = this.h;
        synchronized (cVar) {
            z10 = cVar.a;
        }
        if (!z10) {
            return false;
        }
        try {
            f0 f0Var = this.t;
            f0Var.getClass();
            try {
                a2 = f0Var.a(this.Z, this.v, this.W);
            } catch (q e10) {
                r rVar = this.r;
                if (rVar != null) {
                    rVar.v(e10);
                }
                throw e10;
            }
        } catch (q e11) {
            f0 f0Var2 = this.t;
            if (f0Var2.h > 1000000) {
                f0 f0Var3 = new f0(f0Var2.a, f0Var2.b, f0Var2.c, f0Var2.d, f0Var2.e, f0Var2.f, f0Var2.g, MediaController.VIDEO_BITRATE_480, f0Var2.i);
                try {
                    try {
                        a2 = f0Var3.a(this.Z, this.v, this.W);
                        this.t = f0Var3;
                    } catch (q e12) {
                        r rVar2 = this.r;
                        if (rVar2 != null) {
                            rVar2.v(e12);
                        }
                        throw e12;
                    }
                } catch (q e13) {
                    e11.addSuppressed(e13);
                    if (this.t.c == 1) {
                    }
                }
            }
            if (this.t.c == 1) {
                throw e11;
            }
            this.b0 = true;
            throw e11;
        }
        this.u = a2;
        if (p(a2)) {
            AudioTrack audioTrack = this.u;
            if (this.m == null) {
                this.m = new j0(this);
            }
            j0 j0Var = this.m;
            Handler handler = j0Var.a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new c2.f(handler, 0), j0Var.b);
            if (this.l != 3) {
                AudioTrack audioTrack2 = this.u;
                j3.t0 t0Var = this.t.a;
                audioTrack2.setOffloadDelayPadding(t0Var.R, t0Var.S);
            }
        }
        int i10 = f5.d0.a;
        if (i10 >= 31 && (kVar = this.q) != null) {
            d0.a(this.u, kVar);
        }
        this.W = this.u.getAudioSessionId();
        w wVar = this.i;
        AudioTrack audioTrack3 = this.u;
        f0 f0Var4 = this.t;
        wVar.c(audioTrack3, f0Var4.c == 2, f0Var4.g, f0Var4.d, f0Var4.h);
        if (o()) {
            if (i10 >= 21) {
                this.u.setVolume(this.J);
            } else {
                AudioTrack audioTrack4 = this.u;
                float f9 = this.J;
                audioTrack4.setStereoVolume(f9, f9);
            }
        }
        this.X.getClass();
        e0 e0Var = this.Y;
        if (e0Var != null && i10 >= 23) {
            c0.a(this.u, e0Var);
        }
        this.H = true;
        return true;
    }

    public final boolean o() {
        return this.u != null;
    }

    public final void q() {
        this.U = false;
        if (o()) {
            w wVar = this.i;
            wVar.l = 0L;
            wVar.w = 0;
            wVar.v = 0;
            wVar.m = 0L;
            wVar.C = 0L;
            wVar.F = 0L;
            wVar.k = false;
            if (wVar.x == -9223372036854775807L) {
                v vVar = wVar.f;
                vVar.getClass();
                vVar.a();
                this.u.pause();
            }
        }
    }

    public final void r() {
        this.U = true;
        if (o()) {
            v vVar = this.i.f;
            vVar.getClass();
            vVar.a();
            this.u.play();
        }
    }

    public final void s() {
        if (this.T) {
            return;
        }
        this.T = true;
        long k9 = k();
        w wVar = this.i;
        wVar.z = wVar.a();
        wVar.x = SystemClock.elapsedRealtime() * 1000;
        wVar.A = k9;
        this.u.stop();
        this.A = 0;
    }

    public final void t() {
        if (!this.S && o() && c()) {
            s();
            this.S = true;
        }
    }

    public final void u(long j10) {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.L[i10 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = j.a;
                }
            }
            if (i10 == length) {
                D(byteBuffer, j10);
            } else {
                j jVar = this.K[i10];
                if (i10 > this.R) {
                    jVar.b(byteBuffer);
                }
                ByteBuffer a2 = jVar.a();
                this.L[i10] = a2;
                if (a2.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    public final void v() {
        e();
        for (j jVar : this.f) {
            jVar.reset();
        }
        for (j jVar2 : this.g) {
            jVar2.reset();
        }
        this.U = false;
        this.b0 = false;
    }

    public final void w() {
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        int i10 = 0;
        this.c0 = false;
        this.F = 0;
        this.x = new h0(i().a, i().b, 0L, 0L);
        this.I = 0L;
        this.w = null;
        this.j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.z = null;
        this.A = 0;
        this.e.o = 0L;
        while (true) {
            j[] jVarArr = this.K;
            if (i10 >= jVarArr.length) {
                return;
            }
            j jVar = jVarArr[i10];
            jVar.flush();
            this.L[i10] = jVar.a();
            i10++;
        }
    }

    public final void x(x1 x1Var, boolean z10) {
        h0 i10 = i();
        if (x1Var.equals(i10.a) && z10 == i10.b) {
            return;
        }
        h0 h0Var = new h0(x1Var, z10, -9223372036854775807L, -9223372036854775807L);
        if (o()) {
            this.w = h0Var;
        } else {
            this.x = h0Var;
        }
    }

    public final void y(x1 x1Var) {
        if (o()) {
            try {
                this.u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(x1Var.a).setPitch(x1Var.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                f5.a.L("DefaultAudioSink", "Failed to set playback params", e10);
            }
            x1Var = new x1(this.u.getPlaybackParams().getSpeed(), this.u.getPlaybackParams().getPitch());
            float f9 = x1Var.a;
            w wVar = this.i;
            wVar.j = f9;
            v vVar = wVar.f;
            if (vVar != null) {
                vVar.a();
            }
        }
        this.y = x1Var;
    }

    public final void z(x xVar) {
        if (this.X.equals(xVar)) {
            return;
        }
        xVar.getClass();
        if (this.u != null) {
            this.X.getClass();
        }
        this.X = xVar;
    }
}
