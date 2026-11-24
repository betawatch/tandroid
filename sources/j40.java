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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class j40 {
    public static final Object s = new Object();
    public static ScheduledExecutorService t;
    public static int u;
    public final AudioTrack a;
    public final r00 b;
    public final l69 c;
    public e40 d;
    public final m40 e;
    public final boolean f;
    public final int g;
    public final i40 h;
    public final a66 i = new a66(Thread.currentThread());
    public boolean j;
    public long k;
    public long l;
    public long m;
    public ByteBuffer n;
    public int o;
    public int p;
    public int q;
    public boolean r;

    public j40(AudioTrack audioTrack, r00 r00Var, l69 l69Var, adb adbVar) {
        int i;
        this.a = audioTrack;
        this.b = r00Var;
        this.c = l69Var;
        int i2 = r00Var.a;
        boolean N = g8c.N(i2);
        this.f = N;
        if (N) {
            i = g8c.u(i2) * Integer.bitCount(r00Var.c);
            this.g = i;
        } else {
            i = -1;
            this.g = -1;
        }
        this.e = new m40(new qx4(this), adbVar, audioTrack, r00Var.a, i, r00Var.f);
        if (Build.VERSION.SDK_INT >= 24 && l69Var != null) {
            this.d = new e40(audioTrack, l69Var);
        }
        this.h = c() ? new i40(this) : null;
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
        m40 m40Var;
        adb adbVar;
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
        a40 a40Var;
        a40 a40Var2;
        boolean timestamp;
        boolean z3;
        long j5;
        AudioTimestamp audioTimestamp;
        a40 a40Var3;
        byte b3;
        byte b4;
        Method method;
        Method method2;
        long intValue;
        long b5 = b();
        m40 m40Var2 = this.e;
        adb adbVar2 = m40Var2.b;
        int i2 = m40Var2.e;
        b40 b40Var = m40Var2.h;
        AudioTrack audioTrack2 = m40Var2.d;
        if (audioTrack2.getPlayState() == 3) {
            long[] jArr = m40Var2.c;
            adbVar2.getClass();
            j2 = 1000;
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - m40Var2.l >= 30000) {
                long Z2 = g8c.Z(i2, m40Var2.a());
                if (Z2 != 0) {
                    jArr[m40Var2.s] = g8c.H(Z2, m40Var2.i) - nanoTime;
                    m40Var2.s = (m40Var2.s + 1) % 10;
                    int i3 = m40Var2.t;
                    if (i3 < 10) {
                        m40Var2.t = i3 + 1;
                    }
                    m40Var2.l = nanoTime;
                    m40Var2.k = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = m40Var2.t;
                        if (i4 >= i5) {
                            break;
                        }
                        m40Var2.k = (jArr[i4] / i5) + m40Var2.k;
                        i4++;
                    }
                } else {
                    j = b5;
                    m40Var = m40Var2;
                    adbVar = adbVar2;
                    i = i2;
                    audioTrack = audioTrack2;
                }
            }
            long j6 = m40Var2.n;
            if (!m40Var2.g || (method = m40Var2.m) == null) {
                str = "AudioTrackAudioOutput";
                j4 = 500000;
            } else {
                j4 = 500000;
                if (nanoTime - m40Var2.o >= 500000) {
                    try {
                        Integer num = (Integer) method.invoke(audioTrack2, null);
                        String str2 = g8c.a;
                        try {
                            intValue = (num.intValue() * 1000) - m40Var2.f;
                            m40Var2.n = intValue;
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
                        m40Var2.n = max;
                        if (max > 10000000) {
                            lad.f(str, "Ignoring impossibly large audio latency: " + max);
                            m40Var2.n = 0L;
                        }
                    } catch (Exception unused3) {
                        method2 = null;
                        m40Var2.m = method2;
                        m40Var2.o = nanoTime;
                        if (j6 == m40Var2.n) {
                        }
                        float f = m40Var2.i;
                        long b6 = m40Var2.b(nanoTime);
                        a40Var = b40Var.a;
                        a40Var2 = b40Var.a;
                        adbVar = adbVar2;
                        int i6 = b40Var.b;
                        audioTrack = audioTrack2;
                        if (z2) {
                        }
                        b40Var.g = nanoTime;
                        AudioTrack audioTrack3 = a40Var.a;
                        AudioTimestamp audioTimestamp2 = a40Var.b;
                        timestamp = audioTrack3.getTimestamp(audioTimestamp2);
                        j = b5;
                        if (timestamp) {
                        }
                        if (z3) {
                        }
                        a40Var3 = a40Var2;
                        b3 = 4;
                        b4 = b40Var.d;
                        if (b4 == 0) {
                        }
                        adbVar.getClass();
                        long nanoTime2 = System.nanoTime() / j2;
                        if (b40Var.d != 2) {
                        }
                        m40 m40Var3 = m40Var;
                        if (z) {
                        }
                        j3 = b;
                        Z = g8c.Z(i, j);
                        if (j3 < Z) {
                        }
                    }
                    m40Var2.o = nanoTime;
                } else {
                    str = "AudioTrackAudioOutput";
                }
            }
            z2 = j6 == m40Var2.n;
            float f2 = m40Var2.i;
            long b62 = m40Var2.b(nanoTime);
            a40Var = b40Var.a;
            a40Var2 = b40Var.a;
            adbVar = adbVar2;
            int i62 = b40Var.b;
            audioTrack = audioTrack2;
            if (!z2 || nanoTime - b40Var.g >= b40Var.f) {
                b40Var.g = nanoTime;
                AudioTrack audioTrack32 = a40Var.a;
                AudioTimestamp audioTimestamp22 = a40Var.b;
                timestamp = audioTrack32.getTimestamp(audioTimestamp22);
                j = b5;
                if (timestamp) {
                    z3 = timestamp;
                    j5 = b62;
                } else {
                    long j7 = audioTimestamp22.framePosition;
                    j5 = b62;
                    long j8 = a40Var.d;
                    if (j8 > j7) {
                        z3 = timestamp;
                        if (a40Var.f) {
                            a40Var.g += j8;
                            a40Var.f = false;
                        } else {
                            a40Var.c++;
                        }
                    } else {
                        z3 = timestamp;
                    }
                    a40Var.d = j7;
                    a40Var.e = j7 + a40Var.g + (a40Var.c << 32);
                }
                if (z3) {
                    m40Var = m40Var2;
                    i = i2;
                    audioTimestamp = audioTimestamp22;
                } else {
                    qx4 qx4Var = b40Var.c;
                    long j9 = audioTimestamp22.nanoTime / 1000;
                    audioTimestamp = audioTimestamp22;
                    long Z3 = g8c.Z(i62, a40Var2.e) + g8c.D(nanoTime - (a40Var2.b.nanoTime / 1000), f2);
                    if (Math.abs(j9 - nanoTime) > 5000000) {
                        long j10 = a40Var.e;
                        qx4Var.getClass();
                        i = i2;
                        String str3 = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j9 + ", " + nanoTime + ", " + j5 + ", " + ((j40) qx4Var.a).b();
                        HashSet hashSet = cr6.a;
                        lad.f(str, str3);
                        b40Var.a(4);
                        m40Var = m40Var2;
                    } else {
                        long j11 = j5;
                        i = i2;
                        if (Math.abs(Z3 - j11) > 5000000) {
                            long j12 = a40Var.e;
                            qx4Var.getClass();
                            m40Var = m40Var2;
                            a40Var3 = a40Var2;
                            String str4 = "Spurious audio timestamp (frame position mismatch): " + j12 + ", " + j9 + ", " + nanoTime + ", " + j11 + ", " + ((j40) qx4Var.a).b();
                            HashSet hashSet2 = cr6.a;
                            lad.f(str, str4);
                            b3 = 4;
                            b40Var.a(4);
                        } else {
                            m40Var = m40Var2;
                            a40Var3 = a40Var2;
                            b3 = 4;
                            if (b40Var.d == 4) {
                                b40Var.a(0);
                            }
                        }
                        b4 = b40Var.d;
                        if (b4 == 0) {
                            AudioTimestamp audioTimestamp3 = audioTimestamp;
                            if (z3) {
                                long j13 = audioTimestamp3.nanoTime;
                                if (j13 / 1000 >= b40Var.e) {
                                    b40Var.h = a40Var.e;
                                    b40Var.i = j13 / 1000;
                                    b40Var.a(1);
                                }
                            } else if (nanoTime - b40Var.e > j4) {
                                b40Var.a(3);
                            }
                        } else if (b4 != 1) {
                            if (b4 != 2) {
                                if (b4 != 3) {
                                    if (b4 != b3) {
                                        sdb.a();
                                        return 0L;
                                    }
                                } else if (z3) {
                                    b40Var.a(0);
                                }
                            } else if (!z3) {
                                b40Var.a(0);
                            }
                        } else if (z3) {
                            long j14 = a40Var.e;
                            long j15 = b40Var.h;
                            if (j14 > j15) {
                                a40 a40Var4 = a40Var3;
                                if (Math.abs((g8c.D(nanoTime - (a40Var4.b.nanoTime / 1000), f2) + g8c.Z(i62, a40Var4.e)) - (g8c.D(nanoTime - b40Var.i, f2) + g8c.Z(i62, j15))) < 1000) {
                                    b40Var.a(2);
                                }
                            }
                            if (nanoTime - b40Var.e > 2000000) {
                                b40Var.a(3);
                            } else {
                                b40Var.h = a40Var.e;
                                b40Var.i = audioTimestamp.nanoTime / 1000;
                            }
                        } else {
                            b40Var.a(0);
                        }
                    }
                }
                a40Var3 = a40Var2;
                b3 = 4;
                b4 = b40Var.d;
                if (b4 == 0) {
                }
            } else {
                j = b5;
                m40Var = m40Var2;
                i = i2;
            }
        } else {
            j = b5;
            m40Var = m40Var2;
            adbVar = adbVar2;
            i = i2;
            audioTrack = audioTrack2;
            j2 = 1000;
        }
        adbVar.getClass();
        long nanoTime22 = System.nanoTime() / j2;
        z = b40Var.d != 2;
        m40 m40Var32 = m40Var;
        if (z) {
            b = m40Var32.b(nanoTime22);
        } else {
            float f3 = m40Var32.i;
            a40 a40Var5 = b40Var.a;
            b = g8c.D(nanoTime22 - (a40Var5.b.nanoTime / j2), f3) + g8c.Z(b40Var.b, a40Var5.e);
        }
        j3 = b;
        Z = g8c.Z(i, j);
        if (j3 < Z) {
            m40Var32.e();
            b40Var.a(0);
            return Z;
        }
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (z || ((b2 = b40Var.d) != 0 && b2 != 1)) {
                m40Var32.d(j3);
            }
            long j16 = m40Var32.z;
            if (j16 != -9223372036854775807L) {
                long j17 = j3 - m40Var32.y;
                long D = g8c.D(nanoTime22 - j16, m40Var32.i);
                long j18 = m40Var32.y + D;
                long abs = Math.abs(j18 - j3);
                if (j17 != 0 && abs < 1000000) {
                    long j19 = (D * 10) / 100;
                    j3 = g8c.j(j3, j18 - j19, j18 + j19);
                }
            }
            m40Var32.z = nanoTime22;
            m40Var32.y = j3;
        } else if (playState == 1) {
            m40Var32.d(j3);
        }
        return j3;
    }

    public final long b() {
        if (!this.f) {
            return this.l;
        }
        long j = this.k;
        long j2 = this.g;
        String str = g8c.a;
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
            m40 m40Var = this.e;
            m40Var.A = true;
            m40Var.h.a.f = true;
        }
    }

    public final void f(uc8 uc8Var) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a = uc8Var.a();
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
        l69 l69Var;
        l40 l40Var;
        uz uzVar;
        int i2;
        long j2 = j;
        r00 r00Var = this.b;
        boolean z2 = this.f;
        if (!z2 && this.p == 0) {
            this.p = q93.k(r00Var.a, byteBuffer);
        }
        a66 a66Var = this.i;
        a66Var.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = a66Var.a;
        AudioTrack audioTrack2 = this.a;
        if (currentThread == thread) {
            long b = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i2 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z3 = this.r;
                audioTrack = audioTrack2;
                boolean z4 = b > g8c.b0(a(), (long) audioTrack2.getSampleRate(), 1000000L, RoundingMode.UP);
                this.r = z4;
                i2 = (!z3 || z4 || audioTrack.getPlayState() == 1) ? this.q : this.q + 1;
            }
            boolean z5 = i2 > this.q;
            this.q = i2;
            if (z5) {
                a66Var.e(-1, new wz((byte) 2));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (r00Var.d) {
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
        if (z && (l69Var = this.c) != null && (uzVar = (l40Var = (l40) l69Var.b).h) != null) {
            rz rzVar = rz.f;
            l40Var.g = rzVar;
            uzVar.b(rzVar);
        }
        throw new l00(write, z);
    }
}
