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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class l40 {
    public static final Object s = new Object();
    public static ScheduledExecutorService t;
    public static int u;
    public final AudioTrack a;
    public final s00 b;
    public final ri6 c;
    public g40 d;
    public final o40 e;
    public final boolean f;
    public final int g;
    public final k40 h;
    public final e86 i = new e86(Thread.currentThread());
    public boolean j;
    public long k;
    public long l;
    public long m;
    public ByteBuffer n;
    public int o;
    public int p;
    public int q;
    public boolean r;

    public l40(AudioTrack audioTrack, s00 s00Var, ri6 ri6Var, vgb vgbVar) {
        int i;
        this.a = audioTrack;
        this.b = s00Var;
        this.c = ri6Var;
        int i2 = s00Var.a;
        boolean N = gcc.N(i2);
        this.f = N;
        if (N) {
            i = gcc.u(i2) * Integer.bitCount(s00Var.c);
            this.g = i;
        } else {
            i = -1;
            this.g = -1;
        }
        this.e = new o40(new wz4(this), vgbVar, audioTrack, s00Var.a, i, s00Var.f);
        if (Build.VERSION.SDK_INT >= 24 && ri6Var != null) {
            this.d = new g40(audioTrack, ri6Var);
        }
        this.h = c() ? new k40(this) : null;
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
        o40 o40Var;
        vgb vgbVar;
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
        b40 b40Var;
        b40 b40Var2;
        boolean timestamp;
        boolean z3;
        long j5;
        AudioTimestamp audioTimestamp;
        b40 b40Var3;
        byte b3;
        byte b4;
        Method method;
        Method method2;
        long intValue;
        long b5 = b();
        o40 o40Var2 = this.e;
        vgb vgbVar2 = o40Var2.b;
        int i2 = o40Var2.e;
        c40 c40Var = o40Var2.h;
        AudioTrack audioTrack2 = o40Var2.d;
        if (audioTrack2.getPlayState() == 3) {
            long[] jArr = o40Var2.c;
            vgbVar2.getClass();
            j2 = 1000;
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - o40Var2.l >= 30000) {
                long Z2 = gcc.Z(i2, o40Var2.a());
                if (Z2 != 0) {
                    jArr[o40Var2.s] = gcc.H(Z2, o40Var2.i) - nanoTime;
                    o40Var2.s = (o40Var2.s + 1) % 10;
                    int i3 = o40Var2.t;
                    if (i3 < 10) {
                        o40Var2.t = i3 + 1;
                    }
                    o40Var2.l = nanoTime;
                    o40Var2.k = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = o40Var2.t;
                        if (i4 >= i5) {
                            break;
                        }
                        o40Var2.k = (jArr[i4] / i5) + o40Var2.k;
                        i4++;
                    }
                } else {
                    j = b5;
                    o40Var = o40Var2;
                    vgbVar = vgbVar2;
                    i = i2;
                    audioTrack = audioTrack2;
                }
            }
            long j6 = o40Var2.n;
            if (!o40Var2.g || (method = o40Var2.m) == null) {
                str = "AudioTrackAudioOutput";
                j4 = 500000;
            } else {
                j4 = 500000;
                if (nanoTime - o40Var2.o >= 500000) {
                    try {
                        Integer num = (Integer) method.invoke(audioTrack2, null);
                        String str2 = gcc.a;
                        try {
                            intValue = (num.intValue() * 1000) - o40Var2.f;
                            o40Var2.n = intValue;
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
                        o40Var2.n = max;
                        if (max > 10000000) {
                            efd.f(str, "Ignoring impossibly large audio latency: " + max);
                            o40Var2.n = 0L;
                        }
                    } catch (Exception unused3) {
                        method2 = null;
                        o40Var2.m = method2;
                        o40Var2.o = nanoTime;
                        if (j6 == o40Var2.n) {
                        }
                        float f = o40Var2.i;
                        long b6 = o40Var2.b(nanoTime);
                        b40Var = c40Var.a;
                        b40Var2 = c40Var.a;
                        vgbVar = vgbVar2;
                        int i6 = c40Var.b;
                        audioTrack = audioTrack2;
                        if (z2) {
                        }
                        c40Var.g = nanoTime;
                        AudioTrack audioTrack3 = b40Var.a;
                        AudioTimestamp audioTimestamp2 = b40Var.b;
                        timestamp = audioTrack3.getTimestamp(audioTimestamp2);
                        j = b5;
                        if (timestamp) {
                        }
                        if (z3) {
                        }
                        b40Var3 = b40Var2;
                        b3 = 4;
                        b4 = c40Var.d;
                        if (b4 == 0) {
                        }
                        vgbVar.getClass();
                        long nanoTime2 = System.nanoTime() / j2;
                        if (c40Var.d != 2) {
                        }
                        o40 o40Var3 = o40Var;
                        if (z) {
                        }
                        j3 = b;
                        Z = gcc.Z(i, j);
                        if (j3 < Z) {
                        }
                    }
                    o40Var2.o = nanoTime;
                } else {
                    str = "AudioTrackAudioOutput";
                }
            }
            z2 = j6 == o40Var2.n;
            float f2 = o40Var2.i;
            long b62 = o40Var2.b(nanoTime);
            b40Var = c40Var.a;
            b40Var2 = c40Var.a;
            vgbVar = vgbVar2;
            int i62 = c40Var.b;
            audioTrack = audioTrack2;
            if (!z2 || nanoTime - c40Var.g >= c40Var.f) {
                c40Var.g = nanoTime;
                AudioTrack audioTrack32 = b40Var.a;
                AudioTimestamp audioTimestamp22 = b40Var.b;
                timestamp = audioTrack32.getTimestamp(audioTimestamp22);
                j = b5;
                if (timestamp) {
                    z3 = timestamp;
                    j5 = b62;
                } else {
                    long j7 = audioTimestamp22.framePosition;
                    j5 = b62;
                    long j8 = b40Var.d;
                    if (j8 > j7) {
                        z3 = timestamp;
                        if (b40Var.f) {
                            b40Var.g += j8;
                            b40Var.f = false;
                        } else {
                            b40Var.c++;
                        }
                    } else {
                        z3 = timestamp;
                    }
                    b40Var.d = j7;
                    b40Var.e = j7 + b40Var.g + (b40Var.c << 32);
                }
                if (z3) {
                    o40Var = o40Var2;
                    i = i2;
                    audioTimestamp = audioTimestamp22;
                } else {
                    wz4 wz4Var = c40Var.c;
                    long j9 = audioTimestamp22.nanoTime / 1000;
                    audioTimestamp = audioTimestamp22;
                    long Z3 = gcc.Z(i62, b40Var2.e) + gcc.D(nanoTime - (b40Var2.b.nanoTime / 1000), f2);
                    if (Math.abs(j9 - nanoTime) > 5000000) {
                        long j10 = b40Var.e;
                        wz4Var.getClass();
                        i = i2;
                        String str3 = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j9 + ", " + nanoTime + ", " + j5 + ", " + ((l40) wz4Var.a).b();
                        HashSet hashSet = gt6.a;
                        efd.f(str, str3);
                        c40Var.a(4);
                        o40Var = o40Var2;
                    } else {
                        long j11 = j5;
                        i = i2;
                        if (Math.abs(Z3 - j11) > 5000000) {
                            long j12 = b40Var.e;
                            wz4Var.getClass();
                            o40Var = o40Var2;
                            b40Var3 = b40Var2;
                            String str4 = "Spurious audio timestamp (frame position mismatch): " + j12 + ", " + j9 + ", " + nanoTime + ", " + j11 + ", " + ((l40) wz4Var.a).b();
                            HashSet hashSet2 = gt6.a;
                            efd.f(str, str4);
                            b3 = 4;
                            c40Var.a(4);
                        } else {
                            o40Var = o40Var2;
                            b40Var3 = b40Var2;
                            b3 = 4;
                            if (c40Var.d == 4) {
                                c40Var.a(0);
                            }
                        }
                        b4 = c40Var.d;
                        if (b4 == 0) {
                            AudioTimestamp audioTimestamp3 = audioTimestamp;
                            if (z3) {
                                long j13 = audioTimestamp3.nanoTime;
                                if (j13 / 1000 >= c40Var.e) {
                                    c40Var.h = b40Var.e;
                                    c40Var.i = j13 / 1000;
                                    c40Var.a(1);
                                }
                            } else if (nanoTime - c40Var.e > j4) {
                                c40Var.a(3);
                            }
                        } else if (b4 != 1) {
                            if (b4 != 2) {
                                if (b4 != 3) {
                                    if (b4 != b3) {
                                        grb.g();
                                        return 0L;
                                    }
                                } else if (z3) {
                                    c40Var.a(0);
                                }
                            } else if (!z3) {
                                c40Var.a(0);
                            }
                        } else if (z3) {
                            long j14 = b40Var.e;
                            long j15 = c40Var.h;
                            if (j14 > j15) {
                                b40 b40Var4 = b40Var3;
                                if (Math.abs((gcc.D(nanoTime - (b40Var4.b.nanoTime / 1000), f2) + gcc.Z(i62, b40Var4.e)) - (gcc.D(nanoTime - c40Var.i, f2) + gcc.Z(i62, j15))) < 1000) {
                                    c40Var.a(2);
                                }
                            }
                            if (nanoTime - c40Var.e > 2000000) {
                                c40Var.a(3);
                            } else {
                                c40Var.h = b40Var.e;
                                c40Var.i = audioTimestamp.nanoTime / 1000;
                            }
                        } else {
                            c40Var.a(0);
                        }
                    }
                }
                b40Var3 = b40Var2;
                b3 = 4;
                b4 = c40Var.d;
                if (b4 == 0) {
                }
            } else {
                j = b5;
                o40Var = o40Var2;
                i = i2;
            }
        } else {
            j = b5;
            o40Var = o40Var2;
            vgbVar = vgbVar2;
            i = i2;
            audioTrack = audioTrack2;
            j2 = 1000;
        }
        vgbVar.getClass();
        long nanoTime22 = System.nanoTime() / j2;
        z = c40Var.d != 2;
        o40 o40Var32 = o40Var;
        if (z) {
            b = o40Var32.b(nanoTime22);
        } else {
            float f3 = o40Var32.i;
            b40 b40Var5 = c40Var.a;
            b = gcc.D(nanoTime22 - (b40Var5.b.nanoTime / j2), f3) + gcc.Z(c40Var.b, b40Var5.e);
        }
        j3 = b;
        Z = gcc.Z(i, j);
        if (j3 < Z) {
            o40Var32.e();
            c40Var.a(0);
            return Z;
        }
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (z || ((b2 = c40Var.d) != 0 && b2 != 1)) {
                o40Var32.d(j3);
            }
            long j16 = o40Var32.z;
            if (j16 != -9223372036854775807L) {
                long j17 = j3 - o40Var32.y;
                long D = gcc.D(nanoTime22 - j16, o40Var32.i);
                long j18 = o40Var32.y + D;
                long abs = Math.abs(j18 - j3);
                if (j17 != 0 && abs < 1000000) {
                    long j19 = (D * 10) / 100;
                    j3 = gcc.j(j3, j18 - j19, j18 + j19);
                }
            }
            o40Var32.z = nanoTime22;
            o40Var32.y = j3;
        } else if (playState == 1) {
            o40Var32.d(j3);
        }
        return j3;
    }

    public final long b() {
        if (!this.f) {
            return this.l;
        }
        long j = this.k;
        long j2 = this.g;
        String str = gcc.a;
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
            o40 o40Var = this.e;
            o40Var.A = true;
            o40Var.h.a.f = true;
        }
    }

    public final void f(ig8 ig8Var) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a = ig8Var.a();
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
        ri6 ri6Var;
        n40 n40Var;
        vz vzVar;
        int i2;
        long j2 = j;
        s00 s00Var = this.b;
        boolean z2 = this.f;
        if (!z2 && this.p == 0) {
            this.p = ja3.k(s00Var.a, byteBuffer);
        }
        e86 e86Var = this.i;
        e86Var.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = e86Var.a;
        AudioTrack audioTrack2 = this.a;
        if (currentThread == thread) {
            long b = b();
            if (Build.VERSION.SDK_INT >= 24) {
                i2 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z3 = this.r;
                audioTrack = audioTrack2;
                boolean z4 = b > gcc.b0(a(), (long) audioTrack2.getSampleRate(), 1000000L, RoundingMode.UP);
                this.r = z4;
                i2 = (!z3 || z4 || audioTrack.getPlayState() == 1) ? this.q : this.q + 1;
            }
            boolean z5 = i2 > this.q;
            this.q = i2;
            if (z5) {
                e86Var.e(-1, new xz((byte) 2));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (s00Var.d) {
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
        if (z && (ri6Var = this.c) != null && (vzVar = (n40Var = (n40) ri6Var.b).h) != null) {
            sz szVar = sz.f;
            n40Var.g = szVar;
            vzVar.k(szVar);
        }
        throw new m00(write, z);
    }
}
