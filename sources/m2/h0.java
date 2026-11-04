package m2;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import gi.v5;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h0 {
    public static final Object t = new Object();
    public static ScheduledExecutorService u;
    public static int v;
    public final AudioTrack a;
    public final n b;
    public final float c;
    public final hi.d d;
    public d0 e;
    public final k0 f;
    public final boolean g;
    public final int h;
    public final g0 i;
    public final g2.s j = new g2.s(Thread.currentThread());
    public boolean k;
    public long l;
    public long m;
    public long n;
    public ByteBuffer o;
    public int p;
    public int q;
    public int r;
    public boolean s;

    public h0(AudioTrack audioTrack, n nVar, hi.d dVar, float f10, g2.h0 h0Var) {
        this.a = audioTrack;
        this.b = nVar;
        this.c = f10;
        this.d = dVar;
        boolean M = g2.n0.M(nVar.a);
        this.g = M;
        if (M) {
            this.h = g2.n0.u(nVar.a) * Integer.bitCount(nVar.c);
        } else {
            this.h = -1;
        }
        this.f = new k0(new v5(this, 13), h0Var, audioTrack, nVar.a, this.h, nVar.f);
        if (Build.VERSION.SDK_INT >= 24 && dVar != null) {
            this.e = new d0(audioTrack, dVar);
        }
        this.i = c() ? new g0(this) : null;
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
        k0 k0Var;
        g2.h0 h0Var;
        b0 b0Var;
        AudioTrack audioTrack;
        long j10;
        boolean z10;
        boolean z11;
        k0 k0Var2;
        long b10;
        int playState;
        int i3;
        long j11;
        boolean z12;
        a0 a0Var;
        boolean timestamp;
        long j12;
        boolean z13;
        AudioTimestamp audioTimestamp;
        int i10;
        int i11;
        Method method;
        Method method2;
        Integer num;
        k0 k0Var3 = this.f;
        g2.h0 h0Var2 = k0Var3.b;
        b0 b0Var2 = k0Var3.h;
        AudioTrack audioTrack2 = k0Var3.d;
        if (audioTrack2.getPlayState() == 3) {
            long[] jArr = k0Var3.c;
            h0Var2.getClass();
            long nanoTime = System.nanoTime() / 1000;
            j10 = 1000;
            if (nanoTime - k0Var3.l >= 30000) {
                long Y = g2.n0.Y(k0Var3.e, k0Var3.a());
                if (Y != 0) {
                    jArr[k0Var3.s] = g2.n0.F(Y, k0Var3.i) - nanoTime;
                    k0Var3.s = (k0Var3.s + 1) % 10;
                    int i12 = k0Var3.t;
                    if (i12 < 10) {
                        k0Var3.t = i12 + 1;
                    }
                    k0Var3.l = nanoTime;
                    k0Var3.k = 0L;
                    int i13 = 0;
                    while (true) {
                        int i14 = k0Var3.t;
                        if (i13 >= i14) {
                            break;
                        }
                        k0Var3.k = (jArr[i13] / i14) + k0Var3.k;
                        i13++;
                    }
                }
                k0Var = k0Var3;
                h0Var = h0Var2;
                b0Var = b0Var2;
                audioTrack = audioTrack2;
            }
            long j13 = k0Var3.n;
            if (!k0Var3.g || (method = k0Var3.m) == null) {
                j11 = 500000;
            } else {
                j11 = 500000;
                if (nanoTime - k0Var3.o >= 500000) {
                    try {
                        num = (Integer) method.invoke(audioTrack2, null);
                        String str = g2.n0.a;
                    } catch (Exception unused) {
                        method2 = null;
                    }
                    try {
                        long intValue = (num.intValue() * 1000) - k0Var3.f;
                        k0Var3.n = intValue;
                        long max = Math.max(intValue, 0L);
                        k0Var3.n = max;
                        if (max > 10000000) {
                            g2.a.l("AudioTrackAudioOutput", "Ignoring impossibly large audio latency: " + max);
                            k0Var3.n = 0L;
                        }
                    } catch (Exception unused2) {
                        method2 = null;
                        k0Var3.m = method2;
                        k0Var3.o = nanoTime;
                        if (j13 == k0Var3.n) {
                        }
                        float f10 = k0Var3.i;
                        long b11 = k0Var3.b(nanoTime);
                        a0Var = b0Var2.a;
                        a0 a0Var2 = b0Var2.a;
                        int i15 = b0Var2.b;
                        if (!z12) {
                        }
                        b0Var2.g = nanoTime;
                        AudioTrack audioTrack3 = a0Var.a;
                        AudioTimestamp audioTimestamp2 = a0Var.b;
                        timestamp = audioTrack3.getTimestamp(audioTimestamp2);
                        if (timestamp) {
                        }
                        if (timestamp) {
                        }
                        i10 = 4;
                        i11 = b0Var.d;
                        if (i11 == 0) {
                        }
                        h0Var.getClass();
                        long nanoTime2 = System.nanoTime() / j10;
                        if (b0Var.d != 2) {
                        }
                        if (z11) {
                        }
                        long j14 = b10;
                        playState = audioTrack.getPlayState();
                        if (playState != 3) {
                        }
                        return j14;
                    }
                    k0Var3.o = nanoTime;
                }
            }
            z12 = j13 == k0Var3.n;
            float f102 = k0Var3.i;
            long b112 = k0Var3.b(nanoTime);
            a0Var = b0Var2.a;
            a0 a0Var22 = b0Var2.a;
            int i152 = b0Var2.b;
            if (!z12 || nanoTime - b0Var2.g >= b0Var2.f) {
                b0Var2.g = nanoTime;
                AudioTrack audioTrack32 = a0Var.a;
                AudioTimestamp audioTimestamp22 = a0Var.b;
                timestamp = audioTrack32.getTimestamp(audioTimestamp22);
                if (timestamp) {
                    k0Var = k0Var3;
                    h0Var = h0Var2;
                    j12 = b112;
                } else {
                    k0Var = k0Var3;
                    long j15 = audioTimestamp22.framePosition;
                    j12 = b112;
                    long j16 = a0Var.d;
                    if (j16 > j15) {
                        h0Var = h0Var2;
                        if (a0Var.f) {
                            a0Var.g += j16;
                            a0Var.f = false;
                        } else {
                            a0Var.c++;
                        }
                    } else {
                        h0Var = h0Var2;
                    }
                    a0Var.d = j15;
                    a0Var.e = j15 + a0Var.g + (a0Var.c << 32);
                }
                if (timestamp) {
                    b0Var = b0Var2;
                    audioTrack = audioTrack2;
                    z13 = timestamp;
                    audioTimestamp = audioTimestamp22;
                } else {
                    v5 v5Var = b0Var2.c;
                    long j17 = audioTimestamp22.nanoTime / 1000;
                    z13 = timestamp;
                    audioTimestamp = audioTimestamp22;
                    long B = g2.n0.B(nanoTime - (a0Var22.b.nanoTime / 1000), f102) + g2.n0.Y(i152, a0Var22.e);
                    if (Math.abs(j17 - nanoTime) <= 5000000) {
                        b0Var = b0Var2;
                        long j18 = j12;
                        if (Math.abs(B - j18) > 5000000) {
                            long j19 = a0Var.e;
                            v5Var.getClass();
                            audioTrack = audioTrack2;
                            g2.a.l("AudioTrackAudioOutput", "Spurious audio timestamp (frame position mismatch): " + j19 + ", " + j17 + ", " + nanoTime + ", " + j18 + ", " + ((h0) v5Var.b).b());
                            b0Var = b0Var;
                            i10 = 4;
                            b0Var.a(4);
                        } else {
                            audioTrack = audioTrack2;
                            i10 = 4;
                            if (b0Var.d == 4) {
                                b0Var.a(0);
                            }
                        }
                        i11 = b0Var.d;
                        if (i11 == 0) {
                            AudioTimestamp audioTimestamp3 = audioTimestamp;
                            z10 = false;
                            if (z13) {
                                long j20 = audioTimestamp3.nanoTime;
                                if (j20 / 1000 >= b0Var.e) {
                                    b0Var.h = a0Var.e;
                                    b0Var.i = j20 / 1000;
                                    b0Var.a(1);
                                }
                            } else if (nanoTime - b0Var.e > j11) {
                                b0Var.a(3);
                            }
                        } else if (i11 == 1) {
                            AudioTimestamp audioTimestamp4 = audioTimestamp;
                            if (z13) {
                                long j21 = a0Var.e;
                                long j22 = b0Var.h;
                                if (j21 > j22) {
                                    if (Math.abs((g2.n0.B(nanoTime - (a0Var22.b.nanoTime / 1000), f102) + g2.n0.Y(i152, a0Var22.e)) - (g2.n0.B(nanoTime - b0Var.i, f102) + g2.n0.Y(i152, j22))) < 1000) {
                                        b0Var.a(2);
                                    }
                                }
                                if (nanoTime - b0Var.e > 2000000) {
                                    b0Var.a(3);
                                } else {
                                    b0Var.h = a0Var.e;
                                    b0Var.i = audioTimestamp4.nanoTime / 1000;
                                }
                            } else {
                                z10 = false;
                                b0Var.a(0);
                            }
                        } else if (i11 == 2) {
                            z10 = false;
                            if (!z13) {
                                b0Var.a(0);
                            }
                        } else if (i11 != 3) {
                            if (i11 != i10) {
                                throw new IllegalStateException();
                            }
                        } else if (z13) {
                            z10 = false;
                            b0Var.a(0);
                        }
                        h0Var.getClass();
                        long nanoTime22 = System.nanoTime() / j10;
                        z11 = b0Var.d != 2 ? true : z10;
                        if (z11) {
                            k0Var2 = k0Var;
                            b10 = k0Var2.b(nanoTime22);
                        } else {
                            k0Var2 = k0Var;
                            float f11 = k0Var2.i;
                            a0 a0Var3 = b0Var.a;
                            b10 = g2.n0.B(nanoTime22 - (a0Var3.b.nanoTime / j10), f11) + g2.n0.Y(b0Var.b, a0Var3.e);
                        }
                        long j142 = b10;
                        playState = audioTrack.getPlayState();
                        if (playState != 3) {
                            if (z11 || ((i3 = b0Var.d) != 0 && i3 != 1)) {
                                k0Var2.d(j142);
                            }
                            long j23 = k0Var2.z;
                            if (j23 != -9223372036854775807L) {
                                long j24 = j142 - k0Var2.y;
                                long B2 = g2.n0.B(nanoTime22 - j23, k0Var2.i);
                                long j25 = k0Var2.y + B2;
                                long abs = Math.abs(j25 - j142);
                                if (j24 != 0 && abs < 1000000) {
                                    long j26 = (B2 * 10) / 100;
                                    j142 = g2.n0.j(j142, j25 - j26, j25 + j26);
                                }
                            }
                            k0Var2.z = nanoTime22;
                            k0Var2.y = j142;
                        } else if (playState == 1) {
                            k0Var2.d(j142);
                        }
                        return j142;
                    }
                    long j27 = a0Var.e;
                    v5Var.getClass();
                    g2.a.l("AudioTrackAudioOutput", "Spurious audio timestamp (system clock mismatch): " + j27 + ", " + j17 + ", " + nanoTime + ", " + j12 + ", " + ((h0) v5Var.b).b());
                    b0Var2.a(4);
                    b0Var = b0Var2;
                    audioTrack = audioTrack2;
                }
                i10 = 4;
                i11 = b0Var.d;
                if (i11 == 0) {
                }
                h0Var.getClass();
                long nanoTime222 = System.nanoTime() / j10;
                if (b0Var.d != 2) {
                }
                if (z11) {
                }
                long j1422 = b10;
                playState = audioTrack.getPlayState();
                if (playState != 3) {
                }
                return j1422;
            }
            k0Var = k0Var3;
            h0Var = h0Var2;
            b0Var = b0Var2;
            audioTrack = audioTrack2;
        } else {
            k0Var = k0Var3;
            h0Var = h0Var2;
            b0Var = b0Var2;
            audioTrack = audioTrack2;
            j10 = 1000;
        }
        z10 = false;
        h0Var.getClass();
        long nanoTime2222 = System.nanoTime() / j10;
        if (b0Var.d != 2) {
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
        String str = g2.n0.a;
        return ((j10 + j11) - 1) / j11;
    }

    public final boolean c() {
        return Build.VERSION.SDK_INT >= 29 && this.a.isOffloadedPlayback();
    }

    public final void d(int i3, int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.a.setOffloadDelayPadding(i3, i10);
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
        k0 k0Var = this.f;
        k0Var.A = true;
        k0Var.h.a.f = true;
    }

    public final void f(l2.k kVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId a10 = kVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a10.equals(logSessionId)) {
            return;
        }
        this.a.setLogSessionId(a10);
    }

    public final boolean g(long j10, int i3, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        boolean z10;
        hi.d dVar;
        j0 j0Var;
        e eVar;
        int i10;
        long j11 = j10;
        n nVar = this.b;
        boolean z11 = this.g;
        if (!z11 && this.q == 0) {
            this.q = s0.k(nVar.a, byteBuffer);
        }
        g2.s sVar = this.j;
        sVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = sVar.a;
        AudioTrack audioTrack2 = this.a;
        if (currentThread == thread) {
            long b10 = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i10 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z12 = this.s;
                long a10 = a();
                int sampleRate = audioTrack2.getSampleRate();
                String str = g2.n0.a;
                audioTrack = audioTrack2;
                boolean z13 = b10 > g2.n0.a0(a10, (long) sampleRate, 1000000L, RoundingMode.UP);
                this.s = z13;
                i10 = (!z12 || z13 || audioTrack.getPlayState() == 1) ? this.r : this.r + 1;
            }
            boolean z14 = i10 > this.r;
            this.r = i10;
            if (z14) {
                sVar.e(-1, new l2.d(18));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (nVar.d) {
            if (j11 == Long.MIN_VALUE) {
                j11 = this.n;
            } else {
                this.n = j11;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j11 * 1000);
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
                this.m = (this.q * i3) + this.m;
            }
            return z10;
        }
        z10 = (Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32;
        if (z10 && (dVar = this.d) != null && (eVar = (j0Var = (j0) dVar.b).i) != null) {
            b bVar = b.f;
            j0Var.h = bVar;
            eVar.b(bVar);
        }
        throw new g(write, z10);
    }
}
