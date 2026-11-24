// default package

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j50 {
    public static final Object s = new Object();
    public static ScheduledExecutorService t;
    public static int u;
    public final AudioTrack a;
    public final r10 b;
    public final ni6 c;
    public e50 d;
    public final m50 e;
    public final boolean f;
    public final int g;
    public final i50 h;
    public final a86 i = new a86(Thread.currentThread());
    public boolean j;
    public long k;
    public long l;
    public long m;
    public ByteBuffer n;
    public int o;
    public int p;
    public int q;
    public boolean r;

    public j50(AudioTrack audioTrack, r10 r10Var, ni6 ni6Var, bfb bfbVar) {
        int i;
        this.a = audioTrack;
        this.b = r10Var;
        this.c = ni6Var;
        int i2 = r10Var.a;
        boolean N = hac.N(i2);
        this.f = N;
        if (N) {
            i = hac.u(i2) * Integer.bitCount(r10Var.c);
            this.g = i;
        } else {
            i = -1;
            this.g = -1;
        }
        this.e = new m50(new sz4(this), bfbVar, audioTrack, r10Var.a, i, r10Var.f);
        if (Build.VERSION.SDK_INT >= 24 && ni6Var != null) {
            this.d = new e50(audioTrack, ni6Var);
        }
        this.h = c() ? new i50(this) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a() {
        long j;
        m50 m50Var;
        bfb bfbVar;
        int i;
        AudioTrack audioTrack;
        long j2;
        boolean z;
        long b;
        long j3;
        long Z;
        byte b2;
        String str;
        long j4;
        boolean z2;
        a50 a50Var;
        a50 a50Var2;
        boolean timestamp;
        boolean z3;
        long j5;
        AudioTimestamp audioTimestamp;
        a50 a50Var3;
        byte b3;
        byte b4;
        Method method;
        Method method2;
        long intValue;
        long b5 = b();
        m50 m50Var2 = this.e;
        bfb bfbVar2 = m50Var2.b;
        int i2 = m50Var2.e;
        b50 b50Var = m50Var2.h;
        AudioTrack audioTrack2 = m50Var2.d;
        if (audioTrack2.getPlayState() == 3) {
            long[] jArr = m50Var2.c;
            bfbVar2.getClass();
            j2 = 1000;
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - m50Var2.l >= 30000) {
                long Z2 = hac.Z(i2, m50Var2.a());
                if (Z2 != 0) {
                    jArr[m50Var2.s] = hac.H(Z2, m50Var2.i) - nanoTime;
                    m50Var2.s = (m50Var2.s + 1) % 10;
                    int i3 = m50Var2.t;
                    if (i3 < 10) {
                        m50Var2.t = i3 + 1;
                    }
                    m50Var2.l = nanoTime;
                    m50Var2.k = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = m50Var2.t;
                        if (i4 >= i5) {
                            break;
                        }
                        m50Var2.k = (jArr[i4] / i5) + m50Var2.k;
                        i4++;
                    }
                } else {
                    j = b5;
                    m50Var = m50Var2;
                    bfbVar = bfbVar2;
                    i = i2;
                    audioTrack = audioTrack2;
                }
            }
            long j6 = m50Var2.n;
            if (!m50Var2.g || (method = m50Var2.m) == null) {
                str = "AudioTrackAudioOutput";
                j4 = 500000;
            } else {
                j4 = 500000;
                if (nanoTime - m50Var2.o >= 500000) {
                    try {
                        Integer num = (Integer) method.invoke(audioTrack2, null);
                        String str2 = hac.a;
                        try {
                            intValue = (num.intValue() * 1000) - m50Var2.f;
                            m50Var2.n = intValue;
                            str = "AudioTrackAudioOutput";
                        } catch (Exception unused) {
                            str = "AudioTrackAudioOutput";
                        }
                    } catch (Exception unused2) {
                        str = "AudioTrackAudioOutput";
                        method2 = null;
                    }
                    try {
                        long max = Math.max(intValue, 0L);
                        m50Var2.n = max;
                        if (max > 10000000) {
                            ncd.f(str, "Ignoring impossibly large audio latency: " + max);
                            m50Var2.n = 0L;
                        }
                    } catch (Exception unused3) {
                        method2 = null;
                        m50Var2.m = method2;
                        m50Var2.o = nanoTime;
                        if (j6 == m50Var2.n) {
                        }
                        float f = m50Var2.i;
                        long b6 = m50Var2.b(nanoTime);
                        a50Var = b50Var.a;
                        a50Var2 = b50Var.a;
                        bfbVar = bfbVar2;
                        int i6 = b50Var.b;
                        audioTrack = audioTrack2;
                        if (z2) {
                        }
                        b50Var.g = nanoTime;
                        AudioTrack audioTrack3 = a50Var.a;
                        AudioTimestamp audioTimestamp2 = a50Var.b;
                        timestamp = audioTrack3.getTimestamp(audioTimestamp2);
                        j = b5;
                        if (timestamp) {
                        }
                        if (z3) {
                        }
                        a50Var3 = a50Var2;
                        b3 = 4;
                        b4 = b50Var.d;
                        if (b4 == 0) {
                        }
                        bfbVar.getClass();
                        long nanoTime2 = System.nanoTime() / j2;
                        if (b50Var.d != 2) {
                        }
                        m50 m50Var3 = m50Var;
                        if (z) {
                        }
                        j3 = b;
                        Z = hac.Z(i, j);
                        if (j3 < Z) {
                        }
                    }
                    m50Var2.o = nanoTime;
                } else {
                    str = "AudioTrackAudioOutput";
                }
            }
            z2 = j6 == m50Var2.n;
            float f2 = m50Var2.i;
            long b62 = m50Var2.b(nanoTime);
            a50Var = b50Var.a;
            a50Var2 = b50Var.a;
            bfbVar = bfbVar2;
            int i62 = b50Var.b;
            audioTrack = audioTrack2;
            if (!z2 || nanoTime - b50Var.g >= b50Var.f) {
                b50Var.g = nanoTime;
                AudioTrack audioTrack32 = a50Var.a;
                AudioTimestamp audioTimestamp22 = a50Var.b;
                timestamp = audioTrack32.getTimestamp(audioTimestamp22);
                j = b5;
                if (timestamp) {
                    z3 = timestamp;
                    j5 = b62;
                } else {
                    long j7 = audioTimestamp22.framePosition;
                    j5 = b62;
                    long j8 = a50Var.d;
                    if (j8 > j7) {
                        z3 = timestamp;
                        if (a50Var.f) {
                            a50Var.g += j8;
                            a50Var.f = false;
                        } else {
                            a50Var.c++;
                        }
                    } else {
                        z3 = timestamp;
                    }
                    a50Var.d = j7;
                    a50Var.e = j7 + a50Var.g + (a50Var.c << 32);
                }
                if (z3) {
                    m50Var = m50Var2;
                    i = i2;
                    audioTimestamp = audioTimestamp22;
                } else {
                    sz4 sz4Var = b50Var.c;
                    long j9 = audioTimestamp22.nanoTime / 1000;
                    audioTimestamp = audioTimestamp22;
                    long Z3 = hac.Z(i62, a50Var2.e) + hac.D(nanoTime - (a50Var2.b.nanoTime / 1000), f2);
                    if (Math.abs(j9 - nanoTime) > 5000000) {
                        long j10 = a50Var.e;
                        sz4Var.getClass();
                        i = i2;
                        String str3 = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j9 + ", " + nanoTime + ", " + j5 + ", " + ((j50) sz4Var.a).b();
                        HashSet hashSet = ct6.a;
                        ncd.f(str, str3);
                        b50Var.a(4);
                        m50Var = m50Var2;
                    } else {
                        long j11 = j5;
                        i = i2;
                        if (Math.abs(Z3 - j11) > 5000000) {
                            long j12 = a50Var.e;
                            sz4Var.getClass();
                            m50Var = m50Var2;
                            a50Var3 = a50Var2;
                            String str4 = "Spurious audio timestamp (frame position mismatch): " + j12 + ", " + j9 + ", " + nanoTime + ", " + j11 + ", " + ((j50) sz4Var.a).b();
                            HashSet hashSet2 = ct6.a;
                            ncd.f(str, str4);
                            b3 = 4;
                            b50Var.a(4);
                        } else {
                            m50Var = m50Var2;
                            a50Var3 = a50Var2;
                            b3 = 4;
                            if (b50Var.d == 4) {
                                b50Var.a(0);
                            }
                        }
                        b4 = b50Var.d;
                        if (b4 == 0) {
                            AudioTimestamp audioTimestamp3 = audioTimestamp;
                            if (z3) {
                                long j13 = audioTimestamp3.nanoTime;
                                if (j13 / 1000 >= b50Var.e) {
                                    b50Var.h = a50Var.e;
                                    b50Var.i = j13 / 1000;
                                    b50Var.a(1);
                                }
                            } else if (nanoTime - b50Var.e > j4) {
                                b50Var.a(3);
                            }
                        } else if (b4 != 1) {
                            if (b4 != 2) {
                                if (b4 != 3) {
                                    if (b4 != b3) {
                                        rjb.h();
                                        return 0L;
                                    }
                                } else if (z3) {
                                    b50Var.a(0);
                                }
                            } else if (!z3) {
                                b50Var.a(0);
                            }
                        } else if (z3) {
                            long j14 = a50Var.e;
                            long j15 = b50Var.h;
                            if (j14 > j15) {
                                a50 a50Var4 = a50Var3;
                                if (Math.abs((hac.D(nanoTime - (a50Var4.b.nanoTime / 1000), f2) + hac.Z(i62, a50Var4.e)) - (hac.D(nanoTime - b50Var.i, f2) + hac.Z(i62, j15))) < 1000) {
                                    b50Var.a(2);
                                }
                            }
                            if (nanoTime - b50Var.e > 2000000) {
                                b50Var.a(3);
                            } else {
                                b50Var.h = a50Var.e;
                                b50Var.i = audioTimestamp.nanoTime / 1000;
                            }
                        } else {
                            b50Var.a(0);
                        }
                    }
                }
                a50Var3 = a50Var2;
                b3 = 4;
                b4 = b50Var.d;
                if (b4 == 0) {
                }
            } else {
                j = b5;
                m50Var = m50Var2;
                i = i2;
            }
        } else {
            j = b5;
            m50Var = m50Var2;
            bfbVar = bfbVar2;
            i = i2;
            audioTrack = audioTrack2;
            j2 = 1000;
        }
        bfbVar.getClass();
        long nanoTime22 = System.nanoTime() / j2;
        z = b50Var.d != 2;
        m50 m50Var32 = m50Var;
        if (z) {
            b = m50Var32.b(nanoTime22);
        } else {
            float f3 = m50Var32.i;
            a50 a50Var5 = b50Var.a;
            b = hac.D(nanoTime22 - (a50Var5.b.nanoTime / j2), f3) + hac.Z(b50Var.b, a50Var5.e);
        }
        j3 = b;
        Z = hac.Z(i, j);
        if (j3 < Z) {
            m50Var32.e();
            b50Var.a(0);
            return Z;
        }
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (z || ((b2 = b50Var.d) != 0 && b2 != 1)) {
                m50Var32.d(j3);
            }
            long j16 = m50Var32.z;
            if (j16 != -9223372036854775807L) {
                long j17 = j3 - m50Var32.y;
                long D = hac.D(nanoTime22 - j16, m50Var32.i);
                long j18 = m50Var32.y + D;
                long abs = Math.abs(j18 - j3);
                if (j17 != 0 && abs < 1000000) {
                    long j19 = (D * 10) / 100;
                    j3 = hac.j(j3, j18 - j19, j18 + j19);
                }
            }
            m50Var32.z = nanoTime22;
            m50Var32.y = j3;
        } else if (playState == 1) {
            m50Var32.d(j3);
        }
        return j3;
    }

    public final long b() {
        if (!this.f) {
            return this.l;
        }
        long j = this.k;
        long j2 = this.g;
        String str = hac.a;
        return ((j + j2) - 1) / j2;
    }

    public final boolean c() {
        return Build.VERSION.SDK_INT >= 29 && this.a.isOffloadedPlayback();
    }

    public final void d(int i, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.a.setOffloadDelayPadding(i, i2);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            m50 m50Var = this.e;
            m50Var.A = true;
            m50Var.h.a.f = true;
        }
    }

    public final void f(we8 we8Var) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a = we8Var.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (a.equals(logSessionId)) {
                return;
            }
            this.a.setLogSessionId(a);
        }
    }

    public final boolean g(long j, int i, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        boolean z;
        ni6 ni6Var;
        l50 l50Var;
        u00 u00Var;
        int i2;
        long j2 = j;
        r10 r10Var = this.b;
        boolean z2 = this.f;
        if (!z2 && this.p == 0) {
            this.p = cb3.k(r10Var.a, byteBuffer);
        }
        a86 a86Var = this.i;
        a86Var.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = a86Var.a;
        AudioTrack audioTrack2 = this.a;
        if (currentThread == thread) {
            long b = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i2 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z3 = this.r;
                audioTrack = audioTrack2;
                boolean z4 = b > hac.b0(a(), (long) audioTrack2.getSampleRate(), 1000000L, RoundingMode.UP);
                this.r = z4;
                i2 = (!z3 || z4 || audioTrack.getPlayState() == 1) ? this.q : this.q + 1;
            }
            boolean z5 = i2 > this.q;
            this.q = i2;
            if (z5) {
                a86Var.e(-1, new w00((byte) 2));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (r10Var.d) {
            if (j2 == Long.MIN_VALUE) {
                j2 = this.m;
            } else {
                this.m = j2;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j2 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.n == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.n = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.n.putInt(1431633921);
                }
                if (this.o == 0) {
                    this.n.putInt(4, remaining2);
                    this.n.putLong(8, j2 * 1000);
                    this.n.position(0);
                    this.o = remaining2;
                }
                int remaining3 = this.n.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.n, remaining3, 1);
                    if (write2 < 0) {
                        this.o = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.o = 0;
                } else {
                    this.o -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write >= 0) {
            z = write == remaining;
            if (z2) {
                this.k += write;
                return z;
            }
            if (z) {
                this.l = (this.p * i) + this.l;
            }
            return z;
        }
        z = (Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32;
        if (z && (ni6Var = this.c) != null && (u00Var = (l50Var = (l50) ni6Var.b).h) != null) {
            r00 r00Var = r00.f;
            l50Var.g = r00Var;
            u00Var.k(r00Var);
        }
        throw new l10(write, z);
    }
}
