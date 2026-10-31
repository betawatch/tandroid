package k2;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j0 {
    public static final Object t = new Object();
    public static ScheduledExecutorService u;
    public static int v;
    public final AudioTrack a;
    public final o b;
    public final float c;
    public final m0 d;
    public f0 e;
    public final o0 f;
    public final boolean g;
    public final int h;
    public final i0 i;
    public final e2.r j = new e2.r(Thread.currentThread());
    public boolean k;
    public long l;
    public long m;
    public long n;
    public ByteBuffer o;
    public int p;
    public int q;
    public int r;
    public boolean s;

    public j0(AudioTrack audioTrack, o oVar, m0 m0Var, float f7, e2.g0 g0Var) {
        this.a = audioTrack;
        this.b = oVar;
        this.c = f7;
        this.d = m0Var;
        boolean M = e2.l0.M(oVar.a);
        this.g = M;
        if (M) {
            this.h = e2.l0.u(oVar.a) * Integer.bitCount(oVar.c);
        } else {
            this.h = -1;
        }
        this.f = new o0(new a4.l(this, 23), g0Var, audioTrack, oVar.a, this.h, oVar.f);
        if (Build.VERSION.SDK_INT >= 24 && m0Var != null) {
            this.e = new f0(audioTrack, m0Var);
        }
        this.i = c() ? new i0(this) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a() {
        o0 o0Var;
        e2.g0 g0Var;
        d0 d0Var;
        AudioTrack audioTrack;
        long j10;
        boolean z10;
        boolean z11;
        o0 o0Var2;
        long b10;
        int playState;
        int i10;
        long j11;
        boolean z12;
        c0 c0Var;
        boolean timestamp;
        long j12;
        boolean z13;
        AudioTimestamp audioTimestamp;
        int i11;
        int i12;
        Method method;
        Method method2;
        Integer num;
        o0 o0Var3 = this.f;
        e2.g0 g0Var2 = o0Var3.b;
        d0 d0Var2 = o0Var3.h;
        AudioTrack audioTrack2 = o0Var3.d;
        if (audioTrack2.getPlayState() == 3) {
            long[] jArr = o0Var3.c;
            g0Var2.getClass();
            long nanoTime = System.nanoTime() / 1000;
            j10 = 1000;
            if (nanoTime - o0Var3.l >= 30000) {
                long Y = e2.l0.Y(o0Var3.e, o0Var3.a());
                if (Y != 0) {
                    jArr[o0Var3.s] = e2.l0.F(Y, o0Var3.i) - nanoTime;
                    o0Var3.s = (o0Var3.s + 1) % 10;
                    int i13 = o0Var3.t;
                    if (i13 < 10) {
                        o0Var3.t = i13 + 1;
                    }
                    o0Var3.l = nanoTime;
                    o0Var3.k = 0L;
                    int i14 = 0;
                    while (true) {
                        int i15 = o0Var3.t;
                        if (i14 >= i15) {
                            break;
                        }
                        o0Var3.k = (jArr[i14] / i15) + o0Var3.k;
                        i14++;
                    }
                }
                o0Var = o0Var3;
                g0Var = g0Var2;
                d0Var = d0Var2;
                audioTrack = audioTrack2;
            }
            long j13 = o0Var3.n;
            if (!o0Var3.g || (method = o0Var3.m) == null) {
                j11 = 500000;
            } else {
                j11 = 500000;
                if (nanoTime - o0Var3.o >= 500000) {
                    try {
                        num = (Integer) method.invoke(audioTrack2, null);
                        String str = e2.l0.a;
                    } catch (Exception unused) {
                        method2 = null;
                    }
                    try {
                        long intValue = (num.intValue() * 1000) - o0Var3.f;
                        o0Var3.n = intValue;
                        long max = Math.max(intValue, 0L);
                        o0Var3.n = max;
                        if (max > 10000000) {
                            e2.a.l("AudioTrackAudioOutput", "Ignoring impossibly large audio latency: " + max);
                            o0Var3.n = 0L;
                        }
                    } catch (Exception unused2) {
                        method2 = null;
                        o0Var3.m = method2;
                        o0Var3.o = nanoTime;
                        if (j13 == o0Var3.n) {
                        }
                        float f7 = o0Var3.i;
                        long b11 = o0Var3.b(nanoTime);
                        c0Var = d0Var2.a;
                        c0 c0Var2 = d0Var2.a;
                        int i16 = d0Var2.b;
                        if (!z12) {
                        }
                        d0Var2.g = nanoTime;
                        AudioTrack audioTrack3 = c0Var.a;
                        AudioTimestamp audioTimestamp2 = c0Var.b;
                        timestamp = audioTrack3.getTimestamp(audioTimestamp2);
                        if (timestamp) {
                        }
                        if (timestamp) {
                        }
                        i11 = 4;
                        i12 = d0Var.d;
                        if (i12 == 0) {
                        }
                        g0Var.getClass();
                        long nanoTime2 = System.nanoTime() / j10;
                        if (d0Var.d != 2) {
                        }
                        if (z11) {
                        }
                        long j14 = b10;
                        playState = audioTrack.getPlayState();
                        if (playState != 3) {
                        }
                        return j14;
                    }
                    o0Var3.o = nanoTime;
                }
            }
            z12 = j13 == o0Var3.n;
            float f72 = o0Var3.i;
            long b112 = o0Var3.b(nanoTime);
            c0Var = d0Var2.a;
            c0 c0Var22 = d0Var2.a;
            int i162 = d0Var2.b;
            if (!z12 || nanoTime - d0Var2.g >= d0Var2.f) {
                d0Var2.g = nanoTime;
                AudioTrack audioTrack32 = c0Var.a;
                AudioTimestamp audioTimestamp22 = c0Var.b;
                timestamp = audioTrack32.getTimestamp(audioTimestamp22);
                if (timestamp) {
                    o0Var = o0Var3;
                    g0Var = g0Var2;
                    j12 = b112;
                } else {
                    o0Var = o0Var3;
                    long j15 = audioTimestamp22.framePosition;
                    j12 = b112;
                    long j16 = c0Var.d;
                    if (j16 > j15) {
                        g0Var = g0Var2;
                        if (c0Var.f) {
                            c0Var.g += j16;
                            c0Var.f = false;
                        } else {
                            c0Var.c++;
                        }
                    } else {
                        g0Var = g0Var2;
                    }
                    c0Var.d = j15;
                    c0Var.e = j15 + c0Var.g + (c0Var.c << 32);
                }
                if (timestamp) {
                    d0Var = d0Var2;
                    audioTrack = audioTrack2;
                    z13 = timestamp;
                    audioTimestamp = audioTimestamp22;
                } else {
                    a4.l lVar = d0Var2.c;
                    long j17 = audioTimestamp22.nanoTime / 1000;
                    z13 = timestamp;
                    audioTimestamp = audioTimestamp22;
                    long B = e2.l0.B(nanoTime - (c0Var22.b.nanoTime / 1000), f72) + e2.l0.Y(i162, c0Var22.e);
                    if (Math.abs(j17 - nanoTime) <= 5000000) {
                        d0Var = d0Var2;
                        long j18 = j12;
                        if (Math.abs(B - j18) > 5000000) {
                            long j19 = c0Var.e;
                            lVar.getClass();
                            audioTrack = audioTrack2;
                            e2.a.l("AudioTrackAudioOutput", "Spurious audio timestamp (frame position mismatch): " + j19 + ", " + j17 + ", " + nanoTime + ", " + j18 + ", " + ((j0) lVar.b).b());
                            d0Var = d0Var;
                            i11 = 4;
                            d0Var.a(4);
                        } else {
                            audioTrack = audioTrack2;
                            i11 = 4;
                            if (d0Var.d == 4) {
                                d0Var.a(0);
                            }
                        }
                        i12 = d0Var.d;
                        if (i12 == 0) {
                            AudioTimestamp audioTimestamp3 = audioTimestamp;
                            z10 = false;
                            if (z13) {
                                long j20 = audioTimestamp3.nanoTime;
                                if (j20 / 1000 >= d0Var.e) {
                                    d0Var.h = c0Var.e;
                                    d0Var.i = j20 / 1000;
                                    d0Var.a(1);
                                }
                            } else if (nanoTime - d0Var.e > j11) {
                                d0Var.a(3);
                            }
                        } else if (i12 == 1) {
                            AudioTimestamp audioTimestamp4 = audioTimestamp;
                            if (z13) {
                                long j21 = c0Var.e;
                                long j22 = d0Var.h;
                                if (j21 > j22) {
                                    if (Math.abs((e2.l0.B(nanoTime - (c0Var22.b.nanoTime / 1000), f72) + e2.l0.Y(i162, c0Var22.e)) - (e2.l0.B(nanoTime - d0Var.i, f72) + e2.l0.Y(i162, j22))) < 1000) {
                                        d0Var.a(2);
                                    }
                                }
                                if (nanoTime - d0Var.e > 2000000) {
                                    d0Var.a(3);
                                } else {
                                    d0Var.h = c0Var.e;
                                    d0Var.i = audioTimestamp4.nanoTime / 1000;
                                }
                            } else {
                                z10 = false;
                                d0Var.a(0);
                            }
                        } else if (i12 == 2) {
                            z10 = false;
                            if (!z13) {
                                d0Var.a(0);
                            }
                        } else if (i12 != 3) {
                            if (i12 != i11) {
                                throw new IllegalStateException();
                            }
                        } else if (z13) {
                            z10 = false;
                            d0Var.a(0);
                        }
                        g0Var.getClass();
                        long nanoTime22 = System.nanoTime() / j10;
                        z11 = d0Var.d != 2 ? true : z10;
                        if (z11) {
                            o0Var2 = o0Var;
                            b10 = o0Var2.b(nanoTime22);
                        } else {
                            o0Var2 = o0Var;
                            float f10 = o0Var2.i;
                            c0 c0Var3 = d0Var.a;
                            b10 = e2.l0.B(nanoTime22 - (c0Var3.b.nanoTime / j10), f10) + e2.l0.Y(d0Var.b, c0Var3.e);
                        }
                        long j142 = b10;
                        playState = audioTrack.getPlayState();
                        if (playState != 3) {
                            if (z11 || ((i10 = d0Var.d) != 0 && i10 != 1)) {
                                o0Var2.d(j142);
                            }
                            long j23 = o0Var2.z;
                            if (j23 != -9223372036854775807L) {
                                long j24 = j142 - o0Var2.y;
                                long B2 = e2.l0.B(nanoTime22 - j23, o0Var2.i);
                                long j25 = o0Var2.y + B2;
                                long abs = Math.abs(j25 - j142);
                                if (j24 != 0 && abs < 1000000) {
                                    long j26 = (B2 * 10) / 100;
                                    j142 = e2.l0.j(j142, j25 - j26, j25 + j26);
                                }
                            }
                            o0Var2.z = nanoTime22;
                            o0Var2.y = j142;
                        } else if (playState == 1) {
                            o0Var2.d(j142);
                        }
                        return j142;
                    }
                    long j27 = c0Var.e;
                    lVar.getClass();
                    e2.a.l("AudioTrackAudioOutput", "Spurious audio timestamp (system clock mismatch): " + j27 + ", " + j17 + ", " + nanoTime + ", " + j12 + ", " + ((j0) lVar.b).b());
                    d0Var2.a(4);
                    d0Var = d0Var2;
                    audioTrack = audioTrack2;
                }
                i11 = 4;
                i12 = d0Var.d;
                if (i12 == 0) {
                }
                g0Var.getClass();
                long nanoTime222 = System.nanoTime() / j10;
                if (d0Var.d != 2) {
                }
                if (z11) {
                }
                long j1422 = b10;
                playState = audioTrack.getPlayState();
                if (playState != 3) {
                }
                return j1422;
            }
            o0Var = o0Var3;
            g0Var = g0Var2;
            d0Var = d0Var2;
            audioTrack = audioTrack2;
        } else {
            o0Var = o0Var3;
            g0Var = g0Var2;
            d0Var = d0Var2;
            audioTrack = audioTrack2;
            j10 = 1000;
        }
        z10 = false;
        g0Var.getClass();
        long nanoTime2222 = System.nanoTime() / j10;
        if (d0Var.d != 2) {
        }
        if (z11) {
        }
        long j14222 = b10;
        playState = audioTrack.getPlayState();
        if (playState != 3) {
        }
        return j14222;
    }

    public final long b() {
        if (!this.g) {
            return this.m;
        }
        long j10 = this.l;
        long j11 = this.h;
        String str = e2.l0.a;
        return ((j10 + j11) - 1) / j11;
    }

    public final boolean c() {
        return Build.VERSION.SDK_INT >= 29 && this.a.isOffloadedPlayback();
    }

    public final void d(int i10, int i11) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.a.setOffloadDelayPadding(i10, i11);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        AudioTrack audioTrack = this.a;
        if (audioTrack.getPlayState() != 3) {
            return;
        }
        audioTrack.setOffloadEndOfStream();
        o0 o0Var = this.f;
        o0Var.A = true;
        o0Var.h.a.f = true;
    }

    public final void f(j2.l lVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId a2 = lVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a2.equals(logSessionId)) {
            return;
        }
        this.a.setLogSessionId(a2);
    }

    public final boolean g(long j10, int i10, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        boolean z10;
        m0 m0Var;
        n0 n0Var;
        e eVar;
        int i11;
        long j11 = j10;
        o oVar = this.b;
        boolean z11 = this.g;
        if (!z11 && this.q == 0) {
            this.q = w0.k(oVar.a, byteBuffer);
        }
        e2.r rVar = this.j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.a;
        int i12 = 26;
        AudioTrack audioTrack2 = this.a;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i11 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z12 = this.s;
                long a2 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = e2.l0.a;
                audioTrack = audioTrack2;
                boolean z13 = b10 > e2.l0.a0(a2, (long) sampleRate, 1000000L, RoundingMode.UP);
                this.s = z13;
                i11 = (!z12 || z13 || audioTrack.getPlayState() == 1) ? this.r : this.r + 1;
            }
            boolean z14 = i11 > this.r;
            this.r = i11;
            if (z14) {
                rVar.e(-1, new j2.e(i12));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (oVar.d) {
            if (j11 == Long.MIN_VALUE) {
                j11 = this.n;
            } else {
                this.n = j11;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, 1000 * j11);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.o.putInt(1431633921);
                }
                if (this.p == 0) {
                    this.o.putInt(4, remaining2);
                    this.o.putLong(8, j11 * 1000);
                    this.o.position(0);
                    this.p = remaining2;
                }
                int remaining3 = this.o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.o, remaining3, 1);
                    if (write2 < 0) {
                        this.p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.p = 0;
                } else {
                    this.p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write >= 0) {
            z10 = write == remaining;
            if (z11) {
                this.l += write;
                return z10;
            }
            if (z10) {
                this.m = (this.q * i10) + this.m;
            }
            return z10;
        }
        z10 = (Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32;
        if (z10 && (m0Var = this.d) != null && (eVar = (n0Var = (n0) m0Var.a).i) != null) {
            b bVar = b.f;
            n0Var.h = bVar;
            eVar.b(bVar);
        }
        throw new h(write, z10);
    }
}
