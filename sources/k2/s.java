package k2;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class s {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public boolean G;
    public long H;
    public e2.x I;
    public final xa.c a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public r e;
    public int f;
    public boolean g;
    public long h;
    public float i;
    public boolean j;
    public long k;
    public int l;
    public long m;
    public long n;
    public Method o;
    public long p;
    public boolean q;
    public boolean r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public int x;
    public int y;
    public long z;

    public s(xa.c cVar) {
        this.a = cVar;
        try {
            this.o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.F = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.I = e2.x.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a() {
        AudioTrack audioTrack;
        long j3;
        long j10;
        boolean z10;
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
            this.I.getClass();
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.n >= 30000) {
                long W = e2.d0.W(this.f, b());
                if (W != 0) {
                    int i14 = this.x;
                    long D = e2.d0.D(W, this.i) - nanoTime;
                    long[] jArr = this.b;
                    jArr[i14] = D;
                    this.x = (this.x + 1) % 10;
                    int i15 = this.y;
                    if (i15 < 10) {
                        this.y = i15 + 1;
                    }
                    this.n = nanoTime;
                    this.m = 0L;
                    int i16 = 0;
                    while (true) {
                        int i17 = this.y;
                        if (i16 >= i17) {
                            break;
                        }
                        this.m = (jArr[i16] / i17) + this.m;
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
            if (this.g) {
                audioTrack = audioTrack2;
                j10 = 0;
            } else {
                if (!this.r || (method = this.o) == null) {
                    j11 = 5000000;
                } else {
                    j11 = 5000000;
                    if (nanoTime - this.s >= 500000) {
                        try {
                            AudioTrack audioTrack3 = this.c;
                            audioTrack3.getClass();
                            Integer num = (Integer) method.invoke(audioTrack3, null);
                            String str = e2.d0.a;
                            long intValue = (num.intValue() * j3) - this.h;
                            this.p = intValue;
                            long max = Math.max(intValue, 0L);
                            this.p = max;
                            if (max > 5000000) {
                                e2.a.n("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                                this.p = 0L;
                            }
                        } catch (Exception unused) {
                            this.o = null;
                        }
                        this.s = nanoTime;
                    }
                }
                r rVar = this.e;
                rVar.getClass();
                int i18 = rVar.b;
                q qVar = rVar.a;
                float f10 = this.i;
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
                        xa.c cVar = rVar.c;
                        long j15 = audioTimestamp2.nanoTime / j3;
                        i12 = i11;
                        long z11 = e2.d0.z(nanoTime - (qVar.b.nanoTime / j3), f10) + e2.d0.W(i12, qVar.e);
                        if (Math.abs(j15 - nanoTime) > j11) {
                            long j16 = qVar.e;
                            cVar.getClass();
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
                            d0 d0Var = (d0) cVar.b;
                            sb2.append(d0Var.l());
                            sb2.append(", ");
                            sb2.append(d0Var.m());
                            e2.a.n("DefaultAudioSink", sb2.toString());
                            i13 = 4;
                            rVar.a(4);
                        } else {
                            audioTimestamp = audioTimestamp2;
                            f7 = f10;
                            if (Math.abs(z11 - c11) > j11) {
                                long j17 = qVar.e;
                                cVar.getClass();
                                StringBuilder sb3 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                                sb3.append(j17);
                                sb3.append(", ");
                                sb3.append(j15);
                                sb3.append(", ");
                                sb3.append(nanoTime);
                                sb3.append(", ");
                                sb3.append(c11);
                                sb3.append(", ");
                                d0 d0Var2 = (d0) cVar.b;
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
                        if (i19 != 2) {
                            if (i19 != 3) {
                                if (i19 != i13) {
                                    throw new IllegalStateException();
                                }
                            } else if (timestamp) {
                                rVar.a(0);
                            }
                        } else if (!timestamp) {
                            rVar.a(0);
                        }
                    } else if (timestamp) {
                        long j19 = qVar.e;
                        long j20 = rVar.h;
                        if (j19 > j20) {
                            float f11 = f7;
                            if (Math.abs((e2.d0.z(nanoTime - (qVar.b.nanoTime / j3), f11) + e2.d0.W(i12, qVar.e)) - (e2.d0.z(nanoTime - rVar.i, f11) + e2.d0.W(i12, j20))) < j3) {
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
                        rVar.a(0);
                    }
                    this.I.getClass();
                    long nanoTime2 = System.nanoTime() / j3;
                    r rVar2 = this.e;
                    rVar2.getClass();
                    z10 = rVar2.d != 2;
                    if (z10) {
                        c10 = c(nanoTime2);
                    } else {
                        float f12 = this.i;
                        q qVar2 = rVar2.a;
                        c10 = e2.d0.z(nanoTime2 - (qVar2.b.nanoTime / j3), f12) + e2.d0.W(rVar2.b, qVar2.e);
                    }
                    long j21 = c10;
                    playState = audioTrack.getPlayState();
                    if (playState != 3) {
                        if (z10 || ((i10 = rVar2.d) != 0 && i10 != 1)) {
                            f(j21);
                        }
                        long j22 = this.F;
                        if (j22 != -9223372036854775807L) {
                            long j23 = j21 - this.E;
                            long z12 = e2.d0.z(nanoTime2 - j22, this.i);
                            long j24 = this.E + z12;
                            long abs = Math.abs(j24 - j21);
                            if (j23 != j10 && abs < 1000000) {
                                long j25 = (z12 * 10) / 100;
                                j21 = e2.d0.i(j21, j24 - j25, j24 + j25);
                            }
                        }
                        if (!this.D && !this.j) {
                            long j26 = this.E;
                            if (j26 != -9223372036854775807L && j21 > j26) {
                                this.j = true;
                                long D2 = e2.d0.D(e2.d0.e0(j21 - j26), this.i);
                                this.I.getClass();
                                long currentTimeMillis = System.currentTimeMillis() - e2.d0.e0(D2);
                                n nVar = ((d0) this.a.b).t;
                                if (nVar != null) {
                                    nVar.b(currentTimeMillis);
                                }
                            }
                        }
                        this.F = nanoTime2;
                        this.E = j21;
                    } else if (playState == 1) {
                        f(j21);
                    }
                    return j21;
                }
                audioTrack = audioTrack2;
            }
        } else {
            audioTrack = audioTrack2;
            j3 = 1000;
            j10 = 0;
        }
        this.I.getClass();
        long nanoTime22 = System.nanoTime() / j3;
        r rVar22 = this.e;
        rVar22.getClass();
        if (rVar22.d != 2) {
        }
        if (z10) {
        }
        long j212 = c10;
        playState = audioTrack.getPlayState();
        if (playState != 3) {
        }
        return j212;
    }

    public final long b() {
        if (this.z != -9223372036854775807L) {
            return Math.min(this.C, d());
        }
        this.I.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.t >= 5) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.w = this.u;
                    }
                    playbackHeadPosition += this.w;
                }
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.u <= 0 || playState != 3) {
                        this.A = -9223372036854775807L;
                    } else if (this.A == -9223372036854775807L) {
                        this.A = elapsedRealtime;
                    }
                }
                long j3 = this.u;
                if (j3 > playbackHeadPosition) {
                    if (this.G) {
                        this.H += j3;
                        this.G = false;
                    } else {
                        this.v++;
                    }
                }
                this.u = playbackHeadPosition;
            }
            this.t = elapsedRealtime;
        }
        return this.u + this.H + (this.v << 32);
    }

    public final long c(long j3) {
        long z10;
        if (this.y != 0) {
            z10 = e2.d0.z(j3 + this.m, this.i);
        } else if (this.z != -9223372036854775807L) {
            z10 = e2.d0.W(this.f, d());
        } else {
            z10 = e2.d0.W(this.f, b());
        }
        long max = Math.max(0L, z10 - this.p);
        if (this.z == -9223372036854775807L) {
            return max;
        }
        return Math.min(e2.d0.W(this.f, this.C), max);
    }

    public final long d() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.B;
        }
        this.I.getClass();
        return this.B + e2.d0.Y(e2.d0.z(e2.d0.Q(SystemClock.elapsedRealtime()) - this.z, this.i), this.f, 1000000L, RoundingMode.UP);
    }

    public final boolean e(long j3) {
        long a2 = a();
        int i10 = this.f;
        String str = e2.d0.a;
        if (j3 > e2.d0.Y(a2, i10, 1000000L, RoundingMode.UP)) {
            return true;
        }
        if (!this.g) {
            return false;
        }
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && b() == 0;
    }

    public final void f(long j3) {
        if (this.D) {
            long j10 = this.k;
            if (j10 == -9223372036854775807L || j3 < j10) {
                return;
            }
            long D = e2.d0.D(j3 - j10, this.i);
            this.I.getClass();
            long currentTimeMillis = System.currentTimeMillis() - e2.d0.e0(D);
            this.k = -9223372036854775807L;
            n nVar = ((d0) this.a.b).t;
            if (nVar != null) {
                nVar.b(currentTimeMillis);
            }
        }
    }

    public final void g() {
        this.m = 0L;
        this.y = 0;
        this.x = 0;
        this.n = 0L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.j = false;
    }
}
