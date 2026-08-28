package j3;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import g7.r6;
import h3.x1;
import ih.j7;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i0 implements s {
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
    public w X;
    public d0 Y;
    public boolean Z;
    public final g a;
    public long a0;
    public final a5.m b;
    public boolean b0;
    public final boolean c;
    public boolean c0;
    public final y d;
    public final u0 e;
    public final j[] f;
    public final j[] g;
    public final d5.c h;
    public final v i;
    public final ArrayDeque j;
    public final boolean k;
    public final int l;
    public h0 m;
    public final f2.d n;
    public final f2.d o;
    public final j0 p;
    public i3.l q;
    public q r;
    public e0 s;
    public e0 t;
    public AudioTrack u;
    public e v;
    public f0 w;
    public f0 x;
    public x1 y;
    public ByteBuffer z;

    public i0(a5.m mVar) {
        this.a = (g) mVar.b;
        a5.m mVar2 = (a5.m) mVar.c;
        this.b = mVar2;
        int i9 = d5.f0.a;
        this.c = false;
        this.k = false;
        this.l = 0;
        this.p = (j0) mVar.d;
        d5.c cVar = new d5.c();
        this.h = cVar;
        cVar.c();
        this.i = new v(new fa.c(this, 23));
        y yVar = new y();
        this.d = yVar;
        u0 u0Var = new u0();
        u0Var.m = d5.f0.f;
        this.e = u0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new o0(), yVar, u0Var);
        Collections.addAll(arrayList, (j[]) mVar2.b);
        this.f = (j[]) arrayList.toArray(new j[0]);
        this.g = new j[]{new k0()};
        this.J = 1.0f;
        this.v = e.h;
        this.W = 0;
        this.X = new w();
        x1 x1Var = x1.d;
        this.x = new f0(x1Var, false, 0L, 0L);
        this.y = x1Var;
        this.R = -1;
        this.K = new j[0];
        this.L = new ByteBuffer[0];
        this.j = new ArrayDeque();
        this.n = new f2.d(4);
        this.o = new f2.d(4);
    }

    public static AudioFormat f(int i9, int i10, int i11) {
        return new AudioFormat.Builder().setSampleRate(i9).setChannelMask(i10).setEncoding(i11).build();
    }

    public static boolean p(AudioTrack audioTrack) {
        return d5.f0.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void A(x1 x1Var) {
        x1 x1Var2 = new x1(d5.f0.g(x1Var.a, 0.1f, 8.0f), d5.f0.g(x1Var.b, 0.1f, 8.0f));
        if (!this.k || d5.f0.a < 23) {
            x(x1Var2, i().b);
        } else {
            y(x1Var2);
        }
    }

    public final boolean B() {
        if (this.Z || !"audio/raw".equals(this.t.a.B)) {
            return false;
        }
        int i9 = this.t.a.Q;
        if (!this.c) {
            return true;
        }
        int i10 = d5.f0.a;
        return (i9 == 536870912 || i9 == 805306368 || i9 == 4) ? false : true;
    }

    public final boolean C(h3.t0 t0Var, e eVar) {
        int i9;
        int m10;
        int i10 = d5.f0.a;
        if (i10 >= 29 && (i9 = this.l) != 0) {
            String str = t0Var.B;
            str.getClass();
            int b10 = d5.q.b(str, t0Var.r);
            if (b10 == 0 || (m10 = d5.f0.m(t0Var.O)) == 0) {
                return false;
            }
            AudioFormat f10 = f(t0Var.P, m10, b10);
            AudioAttributes audioAttributes = (AudioAttributes) eVar.a().b;
            int playbackOffloadSupport = i10 >= 31 ? AudioManager.getPlaybackOffloadSupport(f10, audioAttributes) : !AudioManager.isOffloadedPlaybackSupported(f10, audioAttributes) ? 0 : (i10 == 30 && d5.f0.d.startsWith("Pixel")) ? 2 : 1;
            if (playbackOffloadSupport != 0) {
                if (playbackOffloadSupport == 1) {
                    return ((t0Var.R != 0 || t0Var.S != 0) && (i9 == 1)) ? false : true;
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
        q qVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.O;
            if (byteBuffer3 != null) {
                d5.a.f(byteBuffer3 == byteBuffer);
            } else {
                this.O = byteBuffer;
                if (d5.f0.a < 21) {
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
            int i9 = d5.f0.a;
            if (i9 < 21) {
                long j11 = this.D;
                v vVar = this.i;
                int a2 = vVar.e - ((int) (j11 - (vVar.a() * vVar.d)));
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
                d5.a.i(j10 != -9223372036854775807L);
                AudioTrack audioTrack = this.u;
                if (i9 >= 26) {
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
            f2.d dVar = this.o;
            if (write < 0) {
                r rVar = new r(write, this.t.a, ((i9 >= 24 && write == -6) || write == -32) && this.E > 0);
                q qVar2 = this.r;
                if (qVar2 != null) {
                    qVar2.w(rVar);
                }
                if (rVar.b) {
                    throw rVar;
                }
                dVar.N(rVar);
                return;
            }
            dVar.c = null;
            if (p(this.u)) {
                if (this.E > 0) {
                    this.c0 = false;
                }
                if (this.U && (qVar = this.r) != null && write < remaining2 && !this.c0) {
                    qVar.g();
                }
            }
            int i10 = this.t.c;
            if (i10 == 0) {
                this.D += write;
            }
            if (write == remaining2) {
                if (i10 != 0) {
                    d5.a.i(byteBuffer2 == this.M);
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
        a5.m mVar = this.b;
        if (B) {
            x1Var = i().a;
            s0 s0Var = (s0) mVar.d;
            float f10 = x1Var.a;
            if (s0Var.c != f10) {
                s0Var.c = f10;
                s0Var.i = true;
            }
            float f11 = x1Var.b;
            if (s0Var.d != f11) {
                s0Var.d = f11;
                s0Var.i = true;
            }
        } else {
            x1Var = x1.d;
        }
        x1 x1Var2 = x1Var;
        int i9 = 0;
        if (B()) {
            boolean z11 = i().b;
            ((p0) mVar.c).m = z11;
            z10 = z11;
        } else {
            z10 = false;
        }
        this.j.add(new f0(x1Var2, z10, Math.max(0L, j10), (k() * 1000000) / this.t.e));
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
            if (i9 >= jVarArr2.length) {
                break;
            }
            j jVar2 = jVarArr2[i9];
            jVar2.flush();
            this.L[i9] = jVar2.a();
            i9++;
        }
        q qVar = this.r;
        if (qVar != null) {
            qVar.onSkipSilenceEnabledChanged(z10);
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
    public final void b(h3.t0 t0Var, int[] iArr) {
        j[] jVarArr;
        int intValue;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int h;
        int a2;
        int[] iArr2;
        String str = t0Var.B;
        int i16 = t0Var.P;
        int i17 = t0Var.O;
        int i18 = t0Var.Q;
        if ("audio/raw".equals(str)) {
            d5.a.f(d5.f0.D(i18));
            int w8 = d5.f0.w(i18, i17);
            jVarArr = (this.c && (i18 == 536870912 || i18 == 805306368 || i18 == 4)) ? this.g : this.f;
            int i19 = t0Var.R;
            int i20 = t0Var.S;
            u0 u0Var = this.e;
            u0Var.i = i19;
            u0Var.j = i20;
            if (d5.f0.a < 21 && i17 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i21 = 0; i21 < 6; i21++) {
                    iArr2[i21] = i21;
                }
            } else {
                iArr2 = iArr;
            }
            this.d.i = iArr2;
            h hVar = new h(i16, i17, i18);
            for (j jVar : jVarArr) {
                try {
                    h e10 = jVar.e(hVar);
                    if (jVar.isActive()) {
                        hVar = e10;
                    }
                } catch (i e11) {
                    throw new o(e11, t0Var);
                }
            }
            i10 = hVar.c;
            int i22 = hVar.b;
            int i23 = hVar.a;
            intValue = d5.f0.m(i22);
            int w10 = d5.f0.w(i10, i22);
            i12 = w8;
            i11 = w10;
            i9 = i23;
            i13 = 0;
        } else {
            jVarArr = new j[0];
            if (C(t0Var, this.v)) {
                String str2 = t0Var.B;
                str2.getClass();
                int b10 = d5.q.b(str2, t0Var.r);
                intValue = d5.f0.m(i17);
                i9 = i16;
                i12 = -1;
                i13 = 1;
                i10 = b10;
                i11 = -1;
                if (i10 != 0) {
                    throw new o("Invalid output encoding (mode=" + i13 + ") for: " + t0Var, t0Var);
                }
                if (intValue == 0) {
                    throw new o("Invalid output channel config (mode=" + i13 + ") for: " + t0Var, t0Var);
                }
                int minBufferSize = AudioTrack.getMinBufferSize(i9, intValue, i10);
                d5.a.i(minBufferSize != -2);
                int i24 = i11 != -1 ? i11 : 1;
                int i25 = t0Var.n;
                double d = this.k ? 8.0d : 1.0d;
                this.p.getClass();
                if (i13 != 0) {
                    if (i13 == 1) {
                        i14 = i9;
                        h = r6.a((50000000 * j0.a(i10)) / 1000000);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalArgumentException();
                        }
                        int i26 = i10 == 5 ? 500000 : 250000;
                        if (i25 != -1) {
                            RoundingMode roundingMode = RoundingMode.CEILING;
                            roundingMode.getClass();
                            a2 = i25 / 8;
                            int i27 = i25 - (8 * a2);
                            if (i27 != 0) {
                                int i28 = ((i25 ^ 8) >> 31) | 1;
                                switch (p8.b.a[roundingMode.ordinal()]) {
                                    case 1:
                                        if (i27 != 0) {
                                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                        }
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        a2 += i28;
                                        break;
                                    case 5:
                                        break;
                                    case 6:
                                    case 7:
                                    case 8:
                                        int abs = Math.abs(i27);
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
                            a2 = j0.a(i10);
                        }
                        i14 = i9;
                        h = r6.a((i26 * a2) / 1000000);
                    }
                    i15 = i10;
                } else {
                    i14 = i9;
                    long j10 = i14;
                    i15 = i10;
                    long j11 = i24;
                    h = d5.f0.h(minBufferSize * 4, r6.a(((250000 * j10) * j11) / 1000000), r6.a(((MediaController.VIDEO_BITRATE_360 * j10) * j11) / 1000000));
                }
                this.b0 = false;
                e0 e0Var = new e0(t0Var, i12, i13, i11, i14, intValue, i15, (((Math.max(minBufferSize, (int) (h * d)) + i24) - 1) / i24) * i24, jVarArr);
                if (o()) {
                    this.s = e0Var;
                    return;
                } else {
                    this.t = e0Var;
                    return;
                }
            }
            Pair b11 = this.a.b(t0Var);
            if (b11 == null) {
                throw new o("Unable to configure passthrough for: " + t0Var, t0Var);
            }
            int intValue2 = ((Integer) b11.first).intValue();
            intValue = ((Integer) b11.second).intValue();
            i9 = i16;
            i10 = intValue2;
            i11 = -1;
            i12 = -1;
            i13 = 2;
        }
        if (i10 != 0) {
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
        int i9;
        j[] jVarArr;
        if (this.R != -1) {
            z10 = false;
            i9 = this.R;
            jVarArr = this.K;
            if (i9 < jVarArr.length) {
            }
            return false;
        }
        this.R = 0;
        z10 = true;
        i9 = this.R;
        jVarArr = this.K;
        if (i9 < jVarArr.length) {
            j jVar = jVarArr[i9];
            if (z10) {
                jVar.c();
            }
            u(-9223372036854775807L);
            if (jVar.d()) {
                this.R++;
                z10 = true;
                i9 = this.R;
                jVarArr = this.K;
                if (i9 < jVarArr.length) {
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
        d5.a.i(d5.f0.a >= 21);
        d5.a.i(this.V);
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
                h0 h0Var = this.m;
                h0Var.getClass();
                h0Var.a(this.u);
            }
            if (d5.f0.a < 21 && !this.V) {
                this.W = 0;
            }
            e0 e0Var = this.s;
            if (e0Var != null) {
                this.t = e0Var;
                this.s = null;
            }
            v vVar = this.i;
            vVar.l = 0L;
            vVar.w = 0;
            vVar.v = 0;
            vVar.m = 0L;
            vVar.C = 0L;
            vVar.F = 0L;
            vVar.k = false;
            vVar.c = null;
            vVar.f = null;
            AudioTrack audioTrack2 = this.u;
            d5.c cVar = this.h;
            cVar.b();
            synchronized (d0) {
                try {
                    if (e0 == null) {
                        e0 = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a("ExoPlayer:AudioTrackReleaseThread", 1));
                    }
                    f0++;
                    e0.execute(new j7(7, audioTrack2, cVar));
                } catch (Throwable th) {
                    throw th;
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
        v vVar = this.i;
        i0 i0Var = (i0) vVar.a.b;
        AudioTrack audioTrack = vVar.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long[] jArr = vVar.b;
            long a3 = (vVar.a() * 1000000) / vVar.g;
            if (a3 != 0) {
                j11 = 1000;
                long nanoTime = System.nanoTime() / 1000;
                j10 = 1000000;
                if (nanoTime - vVar.m >= 30000) {
                    int i9 = vVar.v;
                    jArr[i9] = a3 - nanoTime;
                    vVar.v = (i9 + 1) % 10;
                    int i10 = vVar.w;
                    if (i10 < 10) {
                        vVar.w = i10 + 1;
                    }
                    vVar.m = nanoTime;
                    vVar.l = 0L;
                    int i11 = 0;
                    while (true) {
                        int i12 = vVar.w;
                        if (i11 >= i12) {
                            break;
                        }
                        vVar.l = (jArr[i11] / i12) + vVar.l;
                        i11++;
                        a3 = a3;
                    }
                }
                long j17 = a3;
                if (!vVar.h) {
                    u uVar = vVar.f;
                    uVar.getClass();
                    t tVar = uVar.a;
                    if (tVar != null) {
                        AudioTimestamp audioTimestamp2 = tVar.b;
                        j14 = 500000;
                        if (nanoTime - uVar.e >= uVar.d) {
                            uVar.e = nanoTime;
                            z12 = tVar.a.getTimestamp(audioTimestamp2);
                            if (z12) {
                                long j18 = audioTimestamp2.framePosition;
                                audioTimestamp = audioTimestamp2;
                                if (tVar.d > j18) {
                                    tVar.c++;
                                }
                                tVar.d = j18;
                                tVar.e = j18 + (tVar.c << 32);
                            } else {
                                audioTimestamp = audioTimestamp2;
                            }
                            int i13 = uVar.b;
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                throw new IllegalStateException();
                                            }
                                        } else if (z12) {
                                            uVar.a();
                                        }
                                    } else if (!z12) {
                                        uVar.a();
                                    }
                                } else if (!z12) {
                                    uVar.a();
                                } else if (tVar.e > uVar.f) {
                                    uVar.b(2);
                                }
                            } else if (z12) {
                                if (audioTimestamp.nanoTime / 1000 >= uVar.c) {
                                    uVar.f = tVar.e;
                                    uVar.b(1);
                                }
                            } else if (nanoTime - uVar.c > 500000) {
                                uVar.b(3);
                            }
                            if (z12) {
                                str = "DefaultAudioSink";
                                j15 = 5000000;
                            } else {
                                if (tVar != null) {
                                    j15 = 5000000;
                                    j16 = tVar.b.nanoTime / 1000;
                                } else {
                                    j15 = 5000000;
                                    j16 = -9223372036854775807L;
                                }
                                long j19 = tVar != null ? tVar.e : -1L;
                                if (Math.abs(j16 - nanoTime) > j15) {
                                    StringBuilder s11 = aa.d.s(j19, "Spurious audio timestamp (system clock mismatch): ", ", ");
                                    s11.append(j16);
                                    s11.append(", ");
                                    s11.append(nanoTime);
                                    s11.append(", ");
                                    s11.append(j17);
                                    s11.append(", ");
                                    s11.append(i0Var.j());
                                    s11.append(", ");
                                    s11.append(i0Var.k());
                                    d5.a.K("DefaultAudioSink", s11.toString());
                                    uVar.b(4);
                                    str = "DefaultAudioSink";
                                } else {
                                    long j20 = j19;
                                    if (Math.abs(((j19 * 1000000) / vVar.g) - j17) > j15) {
                                        StringBuilder s12 = aa.d.s(j20, "Spurious audio timestamp (frame position mismatch): ", ", ");
                                        s12.append(j16);
                                        s12.append(", ");
                                        s12.append(nanoTime);
                                        s12.append(", ");
                                        s12.append(j17);
                                        s12.append(", ");
                                        s12.append(i0Var.j());
                                        s12.append(", ");
                                        s12.append(i0Var.k());
                                        str = "DefaultAudioSink";
                                        d5.a.K(str, s12.toString());
                                        uVar.b(4);
                                    } else {
                                        str = "DefaultAudioSink";
                                        if (uVar.b == 4) {
                                            uVar.a();
                                        }
                                    }
                                }
                            }
                            if (vVar.q && (method = vVar.n) != null && nanoTime - vVar.r >= j14) {
                                try {
                                    AudioTrack audioTrack2 = vVar.c;
                                    audioTrack2.getClass();
                                    Integer num = (Integer) method.invoke(audioTrack2, null);
                                    int i14 = d5.f0.a;
                                    long intValue = (num.intValue() * 1000) - vVar.i;
                                    vVar.o = intValue;
                                    max = Math.max(intValue, 0L);
                                    vVar.o = max;
                                    if (max > j15) {
                                        d5.a.K(str, "Ignoring impossibly large audio latency: " + max);
                                        vVar.o = 0L;
                                    }
                                } catch (Exception unused) {
                                    vVar.n = null;
                                }
                                vVar.r = nanoTime;
                            }
                        }
                    } else {
                        j14 = 500000;
                    }
                    z12 = false;
                    if (z12) {
                    }
                    if (vVar.q) {
                        AudioTrack audioTrack22 = vVar.c;
                        audioTrack22.getClass();
                        Integer num2 = (Integer) method.invoke(audioTrack22, null);
                        int i142 = d5.f0.a;
                        long intValue2 = (num2.intValue() * 1000) - vVar.i;
                        vVar.o = intValue2;
                        max = Math.max(intValue2, 0L);
                        vVar.o = max;
                        if (max > j15) {
                        }
                        vVar.r = nanoTime;
                    }
                }
                long nanoTime2 = System.nanoTime() / j11;
                u uVar2 = vVar.f;
                uVar2.getClass();
                z11 = uVar2.b == 2;
                if (z11) {
                    a2 = vVar.w == 0 ? (vVar.a() * j10) / vVar.g : vVar.l + nanoTime2;
                    if (!z10) {
                        a2 = Math.max(0L, a2 - vVar.o);
                    }
                } else {
                    t tVar2 = uVar2.a;
                    a2 = d5.f0.s(nanoTime2 - (tVar2 != null ? tVar2.b.nanoTime / j11 : -9223372036854775807L), vVar.j) + (((tVar2 != null ? tVar2.e : -1L) * j10) / vVar.g);
                }
                if (vVar.D != z11) {
                    vVar.F = vVar.C;
                    vVar.E = vVar.B;
                }
                j12 = nanoTime2 - vVar.F;
                if (j12 < j10) {
                    long s13 = d5.f0.s(j12, vVar.j) + vVar.E;
                    long j21 = (j12 * j11) / j10;
                    a2 = (((j11 - j21) * s13) + (a2 * j21)) / j11;
                }
                if (!vVar.k) {
                    long j22 = vVar.B;
                    if (a2 > j22) {
                        vVar.k = true;
                        long currentTimeMillis = System.currentTimeMillis() - d5.f0.S(d5.f0.x(d5.f0.S(a2 - j22), vVar.j));
                        q qVar = i0Var.r;
                        if (qVar != null) {
                            qVar.a(currentTimeMillis);
                        }
                    }
                }
                vVar.C = nanoTime2;
                vVar.B = a2;
                vVar.D = z11;
                long min = Math.min(a2, (k() * j10) / this.t.e);
                while (true) {
                    arrayDeque = this.j;
                    if (!!arrayDeque.isEmpty() || min < ((f0) arrayDeque.getFirst()).d) {
                        break;
                    }
                    this.x = (f0) arrayDeque.remove();
                }
                f0 f0Var = this.x;
                long j23 = min - f0Var.d;
                equals = f0Var.a.equals(x1.d);
                a5.m mVar = this.b;
                if (!equals) {
                    s10 = this.x.c + j23;
                } else if (arrayDeque.isEmpty()) {
                    s0 s0Var = (s0) mVar.d;
                    if (s0Var.o >= 1024) {
                        long j24 = s0Var.n;
                        s0Var.j.getClass();
                        long j25 = j24 - ((r4.k * r4.b) * 2);
                        int i15 = s0Var.h.a;
                        int i16 = s0Var.g.a;
                        j13 = i15 == i16 ? d5.f0.O(j23, j25, s0Var.o) : d5.f0.O(j23, j25 * i15, s0Var.o * i16);
                    } else {
                        j13 = (long) (s0Var.c * j23);
                    }
                    s10 = j13 + this.x.c;
                } else {
                    f0 f0Var2 = (f0) arrayDeque.getFirst();
                    s10 = f0Var2.c - d5.f0.s(f0Var2.d - min, this.x.a.a);
                }
                return ((((p0) mVar.c).t * j10) / this.t.e) + s10;
            }
        }
        j10 = 1000000;
        j11 = 1000;
        long nanoTime22 = System.nanoTime() / j11;
        u uVar22 = vVar.f;
        uVar22.getClass();
        if (uVar22.b == 2) {
        }
        if (z11) {
        }
        if (vVar.D != z11) {
        }
        j12 = nanoTime22 - vVar.F;
        if (j12 < j10) {
        }
        if (!vVar.k) {
        }
        vVar.C = nanoTime22;
        vVar.B = a2;
        vVar.D = z11;
        long min2 = Math.min(a2, (k() * j10) / this.t.e);
        while (true) {
            arrayDeque = this.j;
            if (!arrayDeque.isEmpty()) {
                break;
            }
            break;
            this.x = (f0) arrayDeque.remove();
        }
        f0 f0Var3 = this.x;
        long j232 = min2 - f0Var3.d;
        equals = f0Var3.a.equals(x1.d);
        a5.m mVar2 = this.b;
        if (!equals) {
        }
        return ((((p0) mVar2.c).t * j10) / this.t.e) + s10;
    }

    public final int h(h3.t0 t0Var) {
        String str = t0Var.B;
        int i9 = t0Var.Q;
        if ("audio/raw".equals(str)) {
            if (!d5.f0.D(i9)) {
                e2.c.t(i9, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i9 != 2 && (!this.c || i9 != 4)) {
                return 1;
            }
        } else if ((this.b0 || !C(t0Var, this.v)) && this.a.b(t0Var) == null) {
            return 0;
        }
        return 2;
    }

    public final f0 i() {
        f0 f0Var = this.w;
        if (f0Var != null) {
            return f0Var;
        }
        ArrayDeque arrayDeque = this.j;
        return !arrayDeque.isEmpty() ? (f0) arrayDeque.getLast() : this.x;
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
    public final boolean l(long j10, int i9, ByteBuffer byteBuffer) {
        long j11;
        int i10;
        byte b10;
        int i11;
        byte b11;
        int i12;
        ByteBuffer byteBuffer2 = this.M;
        d5.a.f(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.s != null) {
            if (c()) {
                e0 e0Var = this.s;
                e0 e0Var2 = this.t;
                e0Var.getClass();
                if (e0Var2.c == e0Var.c && e0Var2.g == e0Var.g && e0Var2.e == e0Var.e && e0Var2.f == e0Var.f && e0Var2.d == e0Var.d) {
                    this.t = this.s;
                    this.s = null;
                    if (p(this.u) && this.l != 3) {
                        if (this.u.getPlayState() == 3) {
                            this.u.setOffloadEndOfStream();
                        }
                        AudioTrack audioTrack = this.u;
                        h3.t0 t0Var = this.t.a;
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
        boolean o6 = o();
        f2.d dVar = this.n;
        if (!o6) {
            try {
            } catch (p e10) {
                if (e10.b) {
                    throw e10;
                }
                dVar.N(e10);
                return false;
            }
        }
        dVar.c = null;
        if (this.H) {
            this.I = Math.max(0L, j10);
            this.G = false;
            this.H = false;
            if (this.k && d5.f0.a >= 23) {
                y(this.y);
            }
            a(j10);
            if (this.U) {
                r();
            }
        }
        long k10 = k();
        v vVar = this.i;
        AudioTrack audioTrack2 = vVar.c;
        audioTrack2.getClass();
        int playState = audioTrack2.getPlayState();
        if (vVar.h) {
            if (playState == 2) {
                vVar.p = false;
                return false;
            }
            if (playState == 1) {
            }
        }
        boolean z10 = vVar.p;
        boolean b12 = vVar.b(k10);
        vVar.p = b12;
        if (z10 && !b12 && playState != 1) {
            fa.c cVar = vVar.a;
            int i13 = vVar.e;
            long S = d5.f0.S(vVar.i);
            i0 i0Var = (i0) cVar.b;
            if (i0Var.r != null) {
                i0Var.r.o(i13, S, SystemClock.elapsedRealtime() - i0Var.a0);
                if (this.M == null) {
                    d5.a.f(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                    if (byteBuffer.hasRemaining()) {
                        e0 e0Var3 = this.t;
                        if (e0Var3.c != 0 && this.F == 0) {
                            int i14 = e0Var3.g;
                            int i15 = 1024;
                            j11 = 1000000;
                            switch (i14) {
                                case 5:
                                case 6:
                                case 18:
                                    if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                        i15 = b.c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                    } else {
                                        i15 = 1536;
                                    }
                                    this.F = i15;
                                    break;
                                case 7:
                                case 8:
                                    int position = byteBuffer.position();
                                    byte b13 = byteBuffer.get(position);
                                    if (b13 != -2) {
                                        if (b13 == -1) {
                                            i10 = (byteBuffer.get(position + 4) & 7) << 4;
                                            b11 = byteBuffer.get(position + 7);
                                        } else if (b13 != 31) {
                                            i10 = (byteBuffer.get(position + 4) & 1) << 6;
                                            b10 = byteBuffer.get(position + 5);
                                        } else {
                                            i10 = (byteBuffer.get(position + 5) & 7) << 4;
                                            b11 = byteBuffer.get(position + 6);
                                        }
                                        i11 = b11 & 60;
                                        i15 = (((i11 >> 2) | i10) + 1) * 32;
                                        this.F = i15;
                                        break;
                                    } else {
                                        i10 = (byteBuffer.get(position + 5) & 1) << 6;
                                        b10 = byteBuffer.get(position + 4);
                                    }
                                    i11 = b10 & 252;
                                    i15 = (((i11 >> 2) | i10) + 1) * 32;
                                    this.F = i15;
                                case 9:
                                    int position2 = byteBuffer.position();
                                    int i16 = d5.f0.a;
                                    int i17 = byteBuffer.getInt(position2);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i17 = Integer.reverseBytes(i17);
                                    }
                                    i15 = b.i(i17);
                                    if (i15 == -1) {
                                        throw new IllegalArgumentException();
                                    }
                                    this.F = i15;
                                    break;
                                case 10:
                                case 16:
                                    this.F = i15;
                                    break;
                                case 11:
                                case 12:
                                    i15 = 2048;
                                    this.F = i15;
                                    break;
                                case 13:
                                case 19:
                                default:
                                    throw new IllegalStateException(r0.l(i14, "Unexpected audio encoding: "));
                                case 14:
                                    int position3 = byteBuffer.position();
                                    int limit = byteBuffer.limit() - 10;
                                    int i18 = position3;
                                    while (true) {
                                        if (i18 <= limit) {
                                            int i19 = d5.f0.a;
                                            int i20 = byteBuffer.getInt(i18 + 4);
                                            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                i20 = Integer.reverseBytes(i20);
                                            }
                                            if ((i20 & (-2)) == -126718022) {
                                                i12 = i18 - position3;
                                            } else {
                                                i18++;
                                            }
                                        } else {
                                            i12 = -1;
                                        }
                                    }
                                    if (i12 == -1) {
                                        i15 = 0;
                                    } else {
                                        i15 = (40 << ((byteBuffer.get((byteBuffer.position() + i12) + ((byteBuffer.get((byteBuffer.position() + i12) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                                    }
                                    this.F = i15;
                                    break;
                                case 15:
                                    i15 = 512;
                                    this.F = i15;
                                    break;
                                case 17:
                                    byte[] bArr = new byte[16];
                                    int position4 = byteBuffer.position();
                                    byteBuffer.get(bArr);
                                    byteBuffer.position(position4);
                                    i15 = b.g(new d5.x(bArr, 16)).c;
                                    this.F = i15;
                                    break;
                                case 20:
                                    i15 = (int) ((b.e(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
                                    this.F = i15;
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
                            q qVar = this.r;
                            if (qVar != null) {
                                StringBuilder s10 = aa.d.s(j12, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                                s10.append(j10);
                                qVar.w(new com.google.firebase.messaging.s(s10.toString()));
                            }
                            this.G = true;
                        }
                        if (this.G) {
                            if (c()) {
                                long j13 = j10 - j12;
                                this.I += j13;
                                this.G = false;
                                a(j10);
                                q qVar2 = this.r;
                                if (qVar2 != null && j13 != 0) {
                                    qVar2.x();
                                }
                            }
                            return false;
                        }
                        if (this.t.c == 0) {
                            this.B += byteBuffer.remaining();
                        } else {
                            this.C = (this.F * i9) + this.C;
                        }
                        this.M = byteBuffer;
                        this.N = i9;
                    }
                    return true;
                }
                u(j10);
                if (this.M.hasRemaining()) {
                    this.M = null;
                    this.N = 0;
                    return true;
                }
                long k11 = k();
                if (vVar.y != -9223372036854775807L && k11 > 0 && SystemClock.elapsedRealtime() - vVar.y >= 200) {
                    d5.a.K("DefaultAudioSink", "Resetting stalled audio track");
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
        i3.l lVar;
        e0 e0Var;
        d5.c cVar = this.h;
        synchronized (cVar) {
            z10 = cVar.a;
        }
        if (!z10) {
            return false;
        }
        try {
            e0Var = this.t;
            e0Var.getClass();
        } catch (p e10) {
            e0 e0Var2 = this.t;
            if (e0Var2.h > 1000000) {
                e0 e0Var3 = new e0(e0Var2.a, e0Var2.b, e0Var2.c, e0Var2.d, e0Var2.e, e0Var2.f, e0Var2.g, MediaController.VIDEO_BITRATE_480, e0Var2.i);
                try {
                    try {
                        a2 = e0Var3.a(this.Z, this.v, this.W);
                        this.t = e0Var3;
                    } catch (p e11) {
                        q qVar = this.r;
                        if (qVar != null) {
                            qVar.w(e11);
                        }
                        throw e11;
                    }
                } catch (p e12) {
                    e10.addSuppressed(e12);
                    if (this.t.c == 1) {
                    }
                }
            }
            if (this.t.c == 1) {
                throw e10;
            }
            this.b0 = true;
            throw e10;
        }
        try {
            a2 = e0Var.a(this.Z, this.v, this.W);
            this.u = a2;
            if (p(a2)) {
                AudioTrack audioTrack = this.u;
                if (this.m == null) {
                    this.m = new h0(this);
                }
                h0 h0Var = this.m;
                Handler handler = h0Var.a;
                Objects.requireNonNull(handler);
                audioTrack.registerStreamEventCallback(new c2.f(handler, 0), h0Var.b);
                if (this.l != 3) {
                    AudioTrack audioTrack2 = this.u;
                    h3.t0 t0Var = this.t.a;
                    audioTrack2.setOffloadDelayPadding(t0Var.R, t0Var.S);
                }
            }
            int i9 = d5.f0.a;
            if (i9 >= 31 && (lVar = this.q) != null) {
                c0.a(this.u, lVar);
            }
            this.W = this.u.getAudioSessionId();
            v vVar = this.i;
            AudioTrack audioTrack3 = this.u;
            e0 e0Var4 = this.t;
            vVar.c(audioTrack3, e0Var4.c == 2, e0Var4.g, e0Var4.d, e0Var4.h);
            if (o()) {
                if (i9 >= 21) {
                    this.u.setVolume(this.J);
                } else {
                    AudioTrack audioTrack4 = this.u;
                    float f10 = this.J;
                    audioTrack4.setStereoVolume(f10, f10);
                }
            }
            this.X.getClass();
            d0 d0Var = this.Y;
            if (d0Var != null && i9 >= 23) {
                b0.a(this.u, d0Var);
            }
            this.H = true;
            return true;
        } catch (p e13) {
            q qVar2 = this.r;
            if (qVar2 != null) {
                qVar2.w(e13);
            }
            throw e13;
        }
    }

    public final boolean o() {
        return this.u != null;
    }

    public final void q() {
        this.U = false;
        if (o()) {
            v vVar = this.i;
            vVar.l = 0L;
            vVar.w = 0;
            vVar.v = 0;
            vVar.m = 0L;
            vVar.C = 0L;
            vVar.F = 0L;
            vVar.k = false;
            if (vVar.x == -9223372036854775807L) {
                u uVar = vVar.f;
                uVar.getClass();
                uVar.a();
                this.u.pause();
            }
        }
    }

    public final void r() {
        this.U = true;
        if (o()) {
            u uVar = this.i.f;
            uVar.getClass();
            uVar.a();
            this.u.play();
        }
    }

    public final void s() {
        if (this.T) {
            return;
        }
        this.T = true;
        long k10 = k();
        v vVar = this.i;
        vVar.z = vVar.a();
        vVar.x = SystemClock.elapsedRealtime() * 1000;
        vVar.A = k10;
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
        int i9 = length;
        while (i9 >= 0) {
            if (i9 > 0) {
                byteBuffer = this.L[i9 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = j.a;
                }
            }
            if (i9 == length) {
                D(byteBuffer, j10);
            } else {
                j jVar = this.K[i9];
                if (i9 > this.R) {
                    jVar.b(byteBuffer);
                }
                ByteBuffer a2 = jVar.a();
                this.L[i9] = a2;
                if (a2.hasRemaining()) {
                    i9++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i9--;
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
        int i9 = 0;
        this.c0 = false;
        this.F = 0;
        this.x = new f0(i().a, i().b, 0L, 0L);
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
            if (i9 >= jVarArr.length) {
                return;
            }
            j jVar = jVarArr[i9];
            jVar.flush();
            this.L[i9] = jVar.a();
            i9++;
        }
    }

    public final void x(x1 x1Var, boolean z10) {
        f0 i9 = i();
        if (x1Var.equals(i9.a) && z10 == i9.b) {
            return;
        }
        f0 f0Var = new f0(x1Var, z10, -9223372036854775807L, -9223372036854775807L);
        if (o()) {
            this.w = f0Var;
        } else {
            this.x = f0Var;
        }
    }

    public final void y(x1 x1Var) {
        if (o()) {
            try {
                this.u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(x1Var.a).setPitch(x1Var.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                d5.a.L("DefaultAudioSink", "Failed to set playback params", e10);
            }
            x1Var = new x1(this.u.getPlaybackParams().getSpeed(), this.u.getPlaybackParams().getPitch());
            float f10 = x1Var.a;
            v vVar = this.i;
            vVar.j = f10;
            u uVar = vVar.f;
            if (uVar != null) {
                uVar.a();
            }
        }
        this.y = x1Var;
    }

    public final void z(w wVar) {
        if (this.X.equals(wVar)) {
            return;
        }
        wVar.getClass();
        if (this.u != null) {
            this.X.getClass();
        }
        this.X = wVar;
    }
}
