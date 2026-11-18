package n2;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import hi.u5;
import hi.w4;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class g0 {
    public static final Object t = new Object();
    public static ScheduledExecutorService u;
    public static int v;
    public final AudioTrack a;
    public final n b;
    public final float c;
    public final u5 d;
    public c0 e;
    public final j0 f;
    public final boolean g;
    public final int h;
    public final f0 i;
    public final h2.r j = new h2.r(Thread.currentThread());
    public boolean k;
    public long l;
    public long m;
    public long n;
    public ByteBuffer o;
    public int p;
    public int q;
    public int r;
    public boolean s;

    public g0(AudioTrack audioTrack, n nVar, u5 u5Var, float f10, h2.g0 g0Var) {
        this.a = audioTrack;
        this.b = nVar;
        this.c = f10;
        this.d = u5Var;
        boolean M = h2.l0.M(nVar.a);
        this.g = M;
        if (M) {
            this.h = h2.l0.u(nVar.a) * Integer.bitCount(nVar.c);
        } else {
            this.h = -1;
        }
        this.f = new j0(new w4(this, 14), g0Var, audioTrack, nVar.a, this.h, nVar.f);
        if (Build.VERSION.SDK_INT >= 24 && u5Var != null) {
            this.e = new c0(audioTrack, u5Var);
        }
        this.i = c() ? new f0(this) : null;
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
        j0 j0Var;
        h2.g0 g0Var;
        z zVar;
        AudioTrack audioTrack;
        long j3;
        boolean z10;
        boolean z11;
        j0 j0Var2;
        long b10;
        int playState;
        int i7;
        long j10;
        boolean z12;
        y yVar;
        boolean timestamp;
        long j11;
        boolean z13;
        AudioTimestamp audioTimestamp;
        int i10;
        int i11;
        Method method;
        Method method2;
        Integer num;
        j0 j0Var3 = this.f;
        h2.g0 g0Var2 = j0Var3.b;
        z zVar2 = j0Var3.h;
        AudioTrack audioTrack2 = j0Var3.d;
        if (audioTrack2.getPlayState() == 3) {
            long[] jArr = j0Var3.c;
            g0Var2.getClass();
            long nanoTime = System.nanoTime() / 1000;
            j3 = 1000;
            if (nanoTime - j0Var3.l >= 30000) {
                long Y = h2.l0.Y(j0Var3.e, j0Var3.a());
                if (Y != 0) {
                    jArr[j0Var3.s] = h2.l0.F(Y, j0Var3.i) - nanoTime;
                    j0Var3.s = (j0Var3.s + 1) % 10;
                    int i12 = j0Var3.t;
                    if (i12 < 10) {
                        j0Var3.t = i12 + 1;
                    }
                    j0Var3.l = nanoTime;
                    j0Var3.k = 0L;
                    int i13 = 0;
                    while (true) {
                        int i14 = j0Var3.t;
                        if (i13 >= i14) {
                            break;
                        }
                        j0Var3.k = (jArr[i13] / i14) + j0Var3.k;
                        i13++;
                    }
                }
                j0Var = j0Var3;
                g0Var = g0Var2;
                zVar = zVar2;
                audioTrack = audioTrack2;
            }
            long j12 = j0Var3.n;
            if (!j0Var3.g || (method = j0Var3.m) == null) {
                j10 = 500000;
            } else {
                j10 = 500000;
                if (nanoTime - j0Var3.o >= 500000) {
                    try {
                        num = (Integer) method.invoke(audioTrack2, null);
                        String str = h2.l0.a;
                    } catch (Exception unused) {
                        method2 = null;
                    }
                    try {
                        long intValue = (num.intValue() * 1000) - j0Var3.f;
                        j0Var3.n = intValue;
                        long max = Math.max(intValue, 0L);
                        j0Var3.n = max;
                        if (max > 10000000) {
                            h2.a.l("AudioTrackAudioOutput", "Ignoring impossibly large audio latency: " + max);
                            j0Var3.n = 0L;
                        }
                    } catch (Exception unused2) {
                        method2 = null;
                        j0Var3.m = method2;
                        j0Var3.o = nanoTime;
                        if (j12 == j0Var3.n) {
                        }
                        float f10 = j0Var3.i;
                        long b11 = j0Var3.b(nanoTime);
                        yVar = zVar2.a;
                        y yVar2 = zVar2.a;
                        int i15 = zVar2.b;
                        if (!z12) {
                        }
                        zVar2.g = nanoTime;
                        AudioTrack audioTrack3 = yVar.a;
                        AudioTimestamp audioTimestamp2 = yVar.b;
                        timestamp = audioTrack3.getTimestamp(audioTimestamp2);
                        if (timestamp) {
                        }
                        if (timestamp) {
                        }
                        i10 = 4;
                        i11 = zVar.d;
                        if (i11 == 0) {
                        }
                        g0Var.getClass();
                        long nanoTime2 = System.nanoTime() / j3;
                        if (zVar.d != 2) {
                        }
                        if (z11) {
                        }
                        long j13 = b10;
                        playState = audioTrack.getPlayState();
                        if (playState != 3) {
                        }
                        return j13;
                    }
                    j0Var3.o = nanoTime;
                }
            }
            z12 = j12 == j0Var3.n;
            float f102 = j0Var3.i;
            long b112 = j0Var3.b(nanoTime);
            yVar = zVar2.a;
            y yVar22 = zVar2.a;
            int i152 = zVar2.b;
            if (!z12 || nanoTime - zVar2.g >= zVar2.f) {
                zVar2.g = nanoTime;
                AudioTrack audioTrack32 = yVar.a;
                AudioTimestamp audioTimestamp22 = yVar.b;
                timestamp = audioTrack32.getTimestamp(audioTimestamp22);
                if (timestamp) {
                    j0Var = j0Var3;
                    g0Var = g0Var2;
                    j11 = b112;
                } else {
                    j0Var = j0Var3;
                    long j14 = audioTimestamp22.framePosition;
                    j11 = b112;
                    long j15 = yVar.d;
                    if (j15 > j14) {
                        g0Var = g0Var2;
                        if (yVar.f) {
                            yVar.g += j15;
                            yVar.f = false;
                        } else {
                            yVar.c++;
                        }
                    } else {
                        g0Var = g0Var2;
                    }
                    yVar.d = j14;
                    yVar.e = j14 + yVar.g + (yVar.c << 32);
                }
                if (timestamp) {
                    zVar = zVar2;
                    audioTrack = audioTrack2;
                    z13 = timestamp;
                    audioTimestamp = audioTimestamp22;
                } else {
                    w4 w4Var = zVar2.c;
                    long j16 = audioTimestamp22.nanoTime / 1000;
                    z13 = timestamp;
                    audioTimestamp = audioTimestamp22;
                    long B = h2.l0.B(nanoTime - (yVar22.b.nanoTime / 1000), f102) + h2.l0.Y(i152, yVar22.e);
                    if (Math.abs(j16 - nanoTime) <= 5000000) {
                        zVar = zVar2;
                        long j17 = j11;
                        if (Math.abs(B - j17) > 5000000) {
                            long j18 = yVar.e;
                            w4Var.getClass();
                            audioTrack = audioTrack2;
                            h2.a.l("AudioTrackAudioOutput", "Spurious audio timestamp (frame position mismatch): " + j18 + ", " + j16 + ", " + nanoTime + ", " + j17 + ", " + ((g0) w4Var.b).b());
                            zVar = zVar;
                            i10 = 4;
                            zVar.a(4);
                        } else {
                            audioTrack = audioTrack2;
                            i10 = 4;
                            if (zVar.d == 4) {
                                zVar.a(0);
                            }
                        }
                        i11 = zVar.d;
                        if (i11 == 0) {
                            AudioTimestamp audioTimestamp3 = audioTimestamp;
                            z10 = false;
                            if (z13) {
                                long j19 = audioTimestamp3.nanoTime;
                                if (j19 / 1000 >= zVar.e) {
                                    zVar.h = yVar.e;
                                    zVar.i = j19 / 1000;
                                    zVar.a(1);
                                }
                            } else if (nanoTime - zVar.e > j10) {
                                zVar.a(3);
                            }
                        } else if (i11 == 1) {
                            AudioTimestamp audioTimestamp4 = audioTimestamp;
                            if (z13) {
                                long j20 = yVar.e;
                                long j21 = zVar.h;
                                if (j20 > j21) {
                                    if (Math.abs((h2.l0.B(nanoTime - (yVar22.b.nanoTime / 1000), f102) + h2.l0.Y(i152, yVar22.e)) - (h2.l0.B(nanoTime - zVar.i, f102) + h2.l0.Y(i152, j21))) < 1000) {
                                        zVar.a(2);
                                    }
                                }
                                if (nanoTime - zVar.e > 2000000) {
                                    zVar.a(3);
                                } else {
                                    zVar.h = yVar.e;
                                    zVar.i = audioTimestamp4.nanoTime / 1000;
                                }
                            } else {
                                z10 = false;
                                zVar.a(0);
                            }
                        } else if (i11 == 2) {
                            z10 = false;
                            if (!z13) {
                                zVar.a(0);
                            }
                        } else if (i11 != 3) {
                            if (i11 != i10) {
                                throw new IllegalStateException();
                            }
                        } else if (z13) {
                            z10 = false;
                            zVar.a(0);
                        }
                        g0Var.getClass();
                        long nanoTime22 = System.nanoTime() / j3;
                        z11 = zVar.d != 2 ? true : z10;
                        if (z11) {
                            j0Var2 = j0Var;
                            b10 = j0Var2.b(nanoTime22);
                        } else {
                            j0Var2 = j0Var;
                            float f11 = j0Var2.i;
                            y yVar3 = zVar.a;
                            b10 = h2.l0.B(nanoTime22 - (yVar3.b.nanoTime / j3), f11) + h2.l0.Y(zVar.b, yVar3.e);
                        }
                        long j132 = b10;
                        playState = audioTrack.getPlayState();
                        if (playState != 3) {
                            if (z11 || ((i7 = zVar.d) != 0 && i7 != 1)) {
                                j0Var2.d(j132);
                            }
                            long j22 = j0Var2.z;
                            if (j22 != -9223372036854775807L) {
                                long j23 = j132 - j0Var2.y;
                                long B2 = h2.l0.B(nanoTime22 - j22, j0Var2.i);
                                long j24 = j0Var2.y + B2;
                                long abs = Math.abs(j24 - j132);
                                if (j23 != 0 && abs < 1000000) {
                                    long j25 = (B2 * 10) / 100;
                                    j132 = h2.l0.j(j132, j24 - j25, j24 + j25);
                                }
                            }
                            j0Var2.z = nanoTime22;
                            j0Var2.y = j132;
                        } else if (playState == 1) {
                            j0Var2.d(j132);
                        }
                        return j132;
                    }
                    long j26 = yVar.e;
                    w4Var.getClass();
                    h2.a.l("AudioTrackAudioOutput", "Spurious audio timestamp (system clock mismatch): " + j26 + ", " + j16 + ", " + nanoTime + ", " + j11 + ", " + ((g0) w4Var.b).b());
                    zVar2.a(4);
                    zVar = zVar2;
                    audioTrack = audioTrack2;
                }
                i10 = 4;
                i11 = zVar.d;
                if (i11 == 0) {
                }
                g0Var.getClass();
                long nanoTime222 = System.nanoTime() / j3;
                if (zVar.d != 2) {
                }
                if (z11) {
                }
                long j1322 = b10;
                playState = audioTrack.getPlayState();
                if (playState != 3) {
                }
                return j1322;
            }
            j0Var = j0Var3;
            g0Var = g0Var2;
            zVar = zVar2;
            audioTrack = audioTrack2;
        } else {
            j0Var = j0Var3;
            g0Var = g0Var2;
            zVar = zVar2;
            audioTrack = audioTrack2;
            j3 = 1000;
        }
        z10 = false;
        g0Var.getClass();
        long nanoTime2222 = System.nanoTime() / j3;
        if (zVar.d != 2) {
        }
        if (z11) {
        }
        long j13222 = b10;
        playState = audioTrack.getPlayState();
        if (playState != 3) {
        }
        return j13222;
    }

    public final long b() {
        if (!this.g) {
            return this.m;
        }
        long j3 = this.l;
        long j10 = this.h;
        String str = h2.l0.a;
        return ((j3 + j10) - 1) / j10;
    }

    public final boolean c() {
        return Build.VERSION.SDK_INT >= 29 && this.a.isOffloadedPlayback();
    }

    public final void d(int i7, int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.a.setOffloadDelayPadding(i7, i10);
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
        j0 j0Var = this.f;
        j0Var.A = true;
        j0Var.h.a.f = true;
    }

    public final void f(m2.i iVar) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId a10 = iVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a10.equals(logSessionId)) {
            return;
        }
        this.a.setLogSessionId(a10);
    }

    public final boolean g(long j3, int i7, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        boolean z10;
        u5 u5Var;
        i0 i0Var;
        e eVar;
        int i10;
        long j10 = j3;
        n nVar = this.b;
        boolean z11 = this.g;
        if (!z11 && this.q == 0) {
            this.q = r0.k(nVar.a, byteBuffer);
        }
        h2.r rVar = this.j;
        rVar.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rVar.a;
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
                String str = h2.l0.a;
                audioTrack = audioTrack2;
                boolean z13 = b10 > h2.l0.a0(a10, (long) sampleRate, 1000000L, RoundingMode.UP);
                this.s = z13;
                i10 = (!z12 || z13 || audioTrack.getPlayState() == 1) ? this.r : this.r + 1;
            }
            boolean z14 = i10 > this.r;
            this.r = i10;
            if (z14) {
                rVar.e(-1, new a0(0));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (nVar.d) {
            if (j10 == Long.MIN_VALUE) {
                j10 = this.n;
            } else {
                this.n = j10;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j10 * 1000);
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
                    this.o.putLong(8, j10 * 1000);
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
                this.m = (this.q * i7) + this.m;
            }
            return z10;
        }
        z10 = (Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32;
        if (z10 && (u5Var = this.d) != null && (eVar = (i0Var = (i0) u5Var.b).i) != null) {
            b bVar = b.f;
            i0Var.h = bVar;
            eVar.b(bVar);
        }
        throw new g(write, z10);
    }
}
