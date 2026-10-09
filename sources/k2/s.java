package k2;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class s {
    public long A;
    public boolean B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public e2.x G;
    public final xa.d a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public r e;
    public int f;
    public long g;
    public float h;
    public boolean i;
    public long j;
    public int k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public int v;
    public int w;
    public long x;
    public long y;
    public long z;

    public s(xa.d dVar) {
        this.a = dVar;
        try {
            this.n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.D = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.G = e2.x.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a() {
        AudioTrack audioTrack;
        long j3;
        long j10;
        boolean z10;
        boolean z11;
        long c10;
        int playState;
        int i10;
        long j11;
        int i11;
        float f7;
        int i12;
        int i13;
        AudioTimestamp audioTimestamp;
        Method method;
        AudioTrack audioTrack2 = this.c;
        audioTrack2.getClass();
        long j12 = 1000;
        if (audioTrack2.getPlayState() == 3) {
            this.G.getClass();
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.m >= 30000) {
                long V = e2.d0.V(this.f, b());
                if (V != 0) {
                    int i14 = this.v;
                    long C = e2.d0.C(V, this.h) - nanoTime;
                    long[] jArr = this.b;
                    jArr[i14] = C;
                    this.v = (this.v + 1) % 10;
                    int i15 = this.w;
                    if (i15 < 10) {
                        this.w = i15 + 1;
                    }
                    this.m = nanoTime;
                    this.l = 0L;
                    int i16 = 0;
                    while (true) {
                        int i17 = this.w;
                        if (i16 >= i17) {
                            break;
                        }
                        this.l = (jArr[i16] / i17) + this.l;
                        i16++;
                        j12 = j12;
                    }
                } else {
                    audioTrack = audioTrack2;
                    j3 = 1000;
                    j10 = 0;
                }
            }
            j3 = j12;
            if (!this.q || (method = this.n) == null) {
                j11 = 5000000;
            } else {
                j11 = 5000000;
                if (nanoTime - this.r >= 500000) {
                    try {
                        AudioTrack audioTrack3 = this.c;
                        audioTrack3.getClass();
                        Integer num = (Integer) method.invoke(audioTrack3, null);
                        String str = e2.d0.a;
                        long intValue = (num.intValue() * j3) - this.g;
                        this.o = intValue;
                        long max = Math.max(intValue, 0L);
                        this.o = max;
                        if (max > 5000000) {
                            e2.a.n("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                            this.o = 0L;
                        }
                    } catch (Exception unused) {
                        this.n = null;
                    }
                    this.r = nanoTime;
                }
            }
            r rVar = this.e;
            rVar.getClass();
            int i18 = rVar.b;
            q qVar = rVar.a;
            float f10 = this.h;
            j10 = 0;
            long c11 = c(nanoTime);
            if (nanoTime - rVar.g >= rVar.f) {
                rVar.g = nanoTime;
                AudioTrack audioTrack4 = qVar.a;
                AudioTimestamp audioTimestamp2 = qVar.b;
                boolean timestamp = audioTrack4.getTimestamp(audioTimestamp2);
                if (timestamp) {
                    long j13 = audioTimestamp2.framePosition;
                    i11 = i18;
                    long j14 = qVar.d;
                    if (j14 <= j13) {
                        audioTrack = audioTrack2;
                    } else if (qVar.f) {
                        audioTrack = audioTrack2;
                        qVar.g += j14;
                        qVar.f = false;
                    } else {
                        audioTrack = audioTrack2;
                        qVar.c++;
                    }
                    qVar.d = j13;
                    qVar.e = j13 + qVar.g + (qVar.c << 32);
                } else {
                    audioTrack = audioTrack2;
                    i11 = i18;
                }
                if (timestamp) {
                    xa.d dVar = rVar.c;
                    long j15 = audioTimestamp2.nanoTime / j3;
                    i12 = i11;
                    long y3 = e2.d0.y(nanoTime - (qVar.b.nanoTime / j3), f10) + e2.d0.V(i12, qVar.e);
                    if (Math.abs(j15 - nanoTime) > j11) {
                        long j16 = qVar.e;
                        dVar.getClass();
                        audioTimestamp = audioTimestamp2;
                        f7 = f10;
                        StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                        sb2.append(j16);
                        sb2.append(", ");
                        sb2.append(j15);
                        sb2.append(", ");
                        sb2.append(nanoTime);
                        sb2.append(", ");
                        sb2.append(c11);
                        sb2.append(", ");
                        d0 d0Var = (d0) dVar.b;
                        sb2.append(d0Var.l());
                        sb2.append(", ");
                        sb2.append(d0Var.m());
                        e2.a.n("DefaultAudioSink", sb2.toString());
                        i13 = 4;
                        rVar.a(4);
                    } else {
                        audioTimestamp = audioTimestamp2;
                        f7 = f10;
                        if (Math.abs(y3 - c11) > j11) {
                            long j17 = qVar.e;
                            dVar.getClass();
                            StringBuilder sb3 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                            sb3.append(j17);
                            sb3.append(", ");
                            sb3.append(j15);
                            sb3.append(", ");
                            sb3.append(nanoTime);
                            sb3.append(", ");
                            sb3.append(c11);
                            sb3.append(", ");
                            d0 d0Var2 = (d0) dVar.b;
                            sb3.append(d0Var2.l());
                            sb3.append(", ");
                            sb3.append(d0Var2.m());
                            e2.a.n("DefaultAudioSink", sb3.toString());
                            i13 = 4;
                            rVar.a(4);
                        } else {
                            i13 = 4;
                            if (rVar.d == 4) {
                                rVar.a(0);
                            }
                        }
                    }
                } else {
                    f7 = f10;
                    i12 = i11;
                    i13 = 4;
                    audioTimestamp = audioTimestamp2;
                }
                int i19 = rVar.d;
                if (i19 == 0) {
                    AudioTimestamp audioTimestamp3 = audioTimestamp;
                    z10 = false;
                    if (timestamp) {
                        long j18 = audioTimestamp3.nanoTime;
                        if (j18 / j3 >= rVar.e) {
                            rVar.h = qVar.e;
                            rVar.i = j18 / j3;
                            rVar.a(1);
                        }
                    } else if (nanoTime - rVar.e > 500000) {
                        rVar.a(3);
                    }
                } else if (i19 != 1) {
                    if (i19 == 2) {
                        z10 = false;
                        if (!timestamp) {
                            rVar.a(0);
                        }
                    } else if (i19 != 3) {
                        if (i19 != i13) {
                            throw new IllegalStateException();
                        }
                    } else if (timestamp) {
                        z10 = false;
                        rVar.a(0);
                    }
                } else if (timestamp) {
                    long j19 = qVar.e;
                    long j20 = rVar.h;
                    if (j19 > j20) {
                        float f11 = f7;
                        if (Math.abs((e2.d0.y(nanoTime - (qVar.b.nanoTime / j3), f11) + e2.d0.V(i12, qVar.e)) - (e2.d0.y(nanoTime - rVar.i, f11) + e2.d0.V(i12, j20))) < j3) {
                            rVar.a(2);
                        }
                    }
                    if (nanoTime - rVar.e > 2000000) {
                        rVar.a(3);
                    } else {
                        rVar.h = qVar.e;
                        rVar.i = audioTimestamp.nanoTime / j3;
                    }
                } else {
                    z10 = false;
                    rVar.a(0);
                }
                this.G.getClass();
                long nanoTime2 = System.nanoTime() / j3;
                r rVar2 = this.e;
                rVar2.getClass();
                z11 = rVar2.d != 2 ? true : z10;
                if (z11) {
                    c10 = c(nanoTime2);
                } else {
                    float f12 = this.h;
                    q qVar2 = rVar2.a;
                    c10 = e2.d0.y(nanoTime2 - (qVar2.b.nanoTime / j3), f12) + e2.d0.V(rVar2.b, qVar2.e);
                }
                long j21 = c10;
                playState = audioTrack.getPlayState();
                if (playState != 3) {
                    if (z11 || ((i10 = rVar2.d) != 0 && i10 != 1)) {
                        e(j21);
                    }
                    long j22 = this.D;
                    if (j22 != -9223372036854775807L) {
                        long j23 = j21 - this.C;
                        long y10 = e2.d0.y(nanoTime2 - j22, this.h);
                        long j24 = this.C + y10;
                        long abs = Math.abs(j24 - j21);
                        if (j23 != j10 && abs < 1000000) {
                            long j25 = (y10 * 10) / 100;
                            j21 = e2.d0.i(j21, j24 - j25, j24 + j25);
                        }
                    }
                    if (!this.B && !this.i) {
                        long j26 = this.C;
                        if (j26 != -9223372036854775807L && j21 > j26) {
                            this.i = true;
                            long C2 = e2.d0.C(e2.d0.d0(j21 - j26), this.h);
                            this.G.getClass();
                            long currentTimeMillis = System.currentTimeMillis() - e2.d0.d0(C2);
                            n nVar = ((d0) this.a.b).s;
                            if (nVar != null) {
                                nVar.a(currentTimeMillis);
                            }
                        }
                    }
                    this.D = nanoTime2;
                    this.C = j21;
                } else if (playState == 1) {
                    e(j21);
                }
                return j21;
            }
            audioTrack = audioTrack2;
        } else {
            audioTrack = audioTrack2;
            j3 = 1000;
            j10 = 0;
        }
        z10 = false;
        this.G.getClass();
        long nanoTime22 = System.nanoTime() / j3;
        r rVar22 = this.e;
        rVar22.getClass();
        if (rVar22.d != 2) {
        }
        if (z11) {
        }
        long j212 = c10;
        playState = audioTrack.getPlayState();
        if (playState != 3) {
        }
        return j212;
    }

    public final long b() {
        if (this.x != -9223372036854775807L) {
            return Math.min(this.A, d());
        }
        this.G.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.s >= 5) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.t <= 0 || playState != 3) {
                        this.y = -9223372036854775807L;
                    } else if (this.y == -9223372036854775807L) {
                        this.y = elapsedRealtime;
                    }
                }
                long j3 = this.t;
                if (j3 > playbackHeadPosition) {
                    if (this.E) {
                        this.F += j3;
                        this.E = false;
                    } else {
                        this.u++;
                    }
                }
                this.t = playbackHeadPosition;
            }
            this.s = elapsedRealtime;
        }
        return this.t + this.F + (this.u << 32);
    }

    public final long c(long j3) {
        long y3;
        if (this.w != 0) {
            y3 = e2.d0.y(j3 + this.l, this.h);
        } else if (this.x != -9223372036854775807L) {
            y3 = e2.d0.V(this.f, d());
        } else {
            y3 = e2.d0.V(this.f, b());
        }
        long max = Math.max(0L, y3 - this.o);
        if (this.x == -9223372036854775807L) {
            return max;
        }
        return Math.min(e2.d0.V(this.f, this.A), max);
    }

    public final long d() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.z;
        }
        this.G.getClass();
        return this.z + e2.d0.X(e2.d0.y(e2.d0.P(SystemClock.elapsedRealtime()) - this.x, this.h), this.f, 1000000L, RoundingMode.UP);
    }

    public final void e(long j3) {
        if (this.B) {
            long j10 = this.j;
            if (j10 == -9223372036854775807L || j3 < j10) {
                return;
            }
            long C = e2.d0.C(j3 - j10, this.h);
            this.G.getClass();
            long currentTimeMillis = System.currentTimeMillis() - e2.d0.d0(C);
            this.j = -9223372036854775807L;
            n nVar = ((d0) this.a.b).s;
            if (nVar != null) {
                nVar.a(currentTimeMillis);
            }
        }
    }

    public final void f() {
        this.l = 0L;
        this.w = 0;
        this.v = 0;
        this.m = 0L;
        this.C = -9223372036854775807L;
        this.D = -9223372036854775807L;
        this.i = false;
    }
}
