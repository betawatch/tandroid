package l3;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class y {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;
    public final androidx.biometric.f0 a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public int e;
    public x f;
    public int g;
    public boolean h;
    public long i;
    public float j;
    public boolean k;
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
    public long v;
    public int w;
    public int x;
    public long y;
    public long z;

    public y(androidx.biometric.f0 f0Var) {
        this.a = f0Var;
        if (h5.d0.a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0201 A[Catch: Exception -> 0x0217, TRY_LEAVE, TryCatch #0 {Exception -> 0x0217, blocks: (B:48:0x01dc, B:50:0x0201), top: B:47:0x01dc }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(boolean z4) {
        long j10;
        boolean z10;
        long M;
        long j11;
        long j12;
        boolean z11;
        long j13;
        Method method;
        long max;
        k0 k0Var = (k0) this.a.b;
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        long j14 = 1000;
        if (audioTrack.getPlayState() == 3) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.m >= 30000) {
                long M2 = h5.d0.M(this.g, b());
                if (M2 != 0) {
                    int i10 = this.w;
                    long y10 = h5.d0.y(M2, this.j) - nanoTime;
                    long[] jArr = this.b;
                    jArr[i10] = y10;
                    this.w = (this.w + 1) % 10;
                    int i11 = this.x;
                    if (i11 < 10) {
                        this.x = i11 + 1;
                    }
                    this.m = nanoTime;
                    this.l = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = this.x;
                        if (i12 >= i13) {
                            break;
                        }
                        this.l = (jArr[i12] / i13) + this.l;
                        i12++;
                        j14 = j14;
                    }
                }
            }
            j10 = j14;
            if (!this.h) {
                x xVar = this.f;
                xVar.getClass();
                w wVar = xVar.a;
                if (wVar != null) {
                    AudioTimestamp audioTimestamp = wVar.b;
                    j12 = 500000;
                    if (nanoTime - xVar.e >= xVar.d) {
                        xVar.e = nanoTime;
                        z11 = wVar.a.getTimestamp(audioTimestamp);
                        if (z11) {
                            long j15 = audioTimestamp.framePosition;
                            if (wVar.d > j15) {
                                wVar.c++;
                            }
                            wVar.d = j15;
                            wVar.e = j15 + (wVar.c << 32);
                        }
                        int i14 = xVar.b;
                        if (i14 != 0) {
                            if (i14 != 1) {
                                if (i14 != 2) {
                                    if (i14 != 3) {
                                        if (i14 != 4) {
                                            throw new IllegalStateException();
                                        }
                                    } else if (z11) {
                                        xVar.a();
                                    }
                                } else if (!z11) {
                                    xVar.a();
                                }
                            } else if (!z11) {
                                xVar.a();
                            } else if (wVar.e > xVar.f) {
                                xVar.b(2);
                            }
                        } else if (z11) {
                            if (audioTimestamp.nanoTime / j10 >= xVar.c) {
                                xVar.f = wVar.e;
                                xVar.b(1);
                            }
                        } else if (nanoTime - xVar.c > 500000) {
                            xVar.b(3);
                        }
                        if (z11) {
                            j13 = 5000000;
                        } else {
                            long j16 = wVar != null ? wVar.b.nanoTime / j10 : -9223372036854775807L;
                            long j17 = wVar != null ? wVar.e : -1L;
                            long M3 = h5.d0.M(this.g, b());
                            if (Math.abs(j16 - nanoTime) > 5000000) {
                                j13 = 5000000;
                                StringBuilder s6 = android.support.v4.media.a.s(j17, "Spurious audio timestamp (system clock mismatch): ", ", ");
                                s6.append(j16);
                                s6.append(", ");
                                s6.append(nanoTime);
                                s6.append(", ");
                                s6.append(M3);
                                s6.append(", ");
                                s6.append(k0Var.j());
                                s6.append(", ");
                                s6.append(k0Var.k());
                                h5.a.K("DefaultAudioSink", s6.toString());
                                xVar.b(4);
                            } else {
                                j13 = 5000000;
                                if (Math.abs(h5.d0.M(this.g, j17) - M3) > 5000000) {
                                    StringBuilder s9 = android.support.v4.media.a.s(j17, "Spurious audio timestamp (frame position mismatch): ", ", ");
                                    s9.append(j16);
                                    s9.append(", ");
                                    s9.append(nanoTime);
                                    s9.append(", ");
                                    s9.append(M3);
                                    s9.append(", ");
                                    s9.append(k0Var.j());
                                    s9.append(", ");
                                    s9.append(k0Var.k());
                                    h5.a.K("DefaultAudioSink", s9.toString());
                                    xVar.b(4);
                                } else if (xVar.b == 4) {
                                    xVar.a();
                                }
                            }
                        }
                        if (this.q && (method = this.n) != null && nanoTime - this.r >= j12) {
                            try {
                                AudioTrack audioTrack2 = this.c;
                                audioTrack2.getClass();
                                Integer num = (Integer) method.invoke(audioTrack2, null);
                                int i15 = h5.d0.a;
                                long intValue = (num.intValue() * j10) - this.i;
                                this.o = intValue;
                                max = Math.max(intValue, 0L);
                                this.o = max;
                                if (max > j13) {
                                    h5.a.K("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                                    this.o = 0L;
                                }
                            } catch (Exception unused) {
                                this.n = null;
                            }
                            this.r = nanoTime;
                        }
                    }
                } else {
                    j12 = 500000;
                }
                z11 = false;
                if (z11) {
                }
                if (this.q) {
                    AudioTrack audioTrack22 = this.c;
                    audioTrack22.getClass();
                    Integer num2 = (Integer) method.invoke(audioTrack22, null);
                    int i152 = h5.d0.a;
                    long intValue2 = (num2.intValue() * j10) - this.i;
                    this.o = intValue2;
                    max = Math.max(intValue2, 0L);
                    this.o = max;
                    if (max > j13) {
                    }
                    this.r = nanoTime;
                }
            }
            long nanoTime2 = System.nanoTime() / j10;
            x xVar2 = this.f;
            xVar2.getClass();
            w wVar2 = xVar2.a;
            z10 = xVar2.b != 2;
            if (z10) {
                M = this.x == 0 ? h5.d0.M(this.g, b()) : h5.d0.t(this.l + nanoTime2, this.j);
                if (!z4) {
                    M = Math.max(0L, M - this.o);
                }
            } else {
                M = h5.d0.t(nanoTime2 - (wVar2 != null ? wVar2.b.nanoTime / j10 : -9223372036854775807L), this.j) + h5.d0.M(this.g, wVar2 != null ? wVar2.e : -1L);
            }
            if (this.E != z10) {
                this.G = this.D;
                this.F = this.C;
            }
            j11 = nanoTime2 - this.G;
            if (j11 < 1000000) {
                long t6 = h5.d0.t(j11, this.j) + this.F;
                long j18 = (j11 * j10) / 1000000;
                M = (((j10 - j18) * t6) + (M * j18)) / j10;
            }
            if (!this.k) {
                long j19 = this.C;
                if (M > j19) {
                    this.k = true;
                    long currentTimeMillis = System.currentTimeMillis() - h5.d0.S(h5.d0.y(h5.d0.S(M - j19), this.j));
                    t tVar = k0Var.r;
                    if (tVar != null) {
                        tVar.a(currentTimeMillis);
                    }
                }
            }
            this.D = nanoTime2;
            this.C = M;
            this.E = z10;
            return M;
        }
        j10 = 1000;
        long nanoTime22 = System.nanoTime() / j10;
        x xVar22 = this.f;
        xVar22.getClass();
        w wVar22 = xVar22.a;
        if (xVar22.b != 2) {
        }
        if (z10) {
        }
        if (this.E != z10) {
        }
        j11 = nanoTime22 - this.G;
        if (j11 < 1000000) {
        }
        if (!this.k) {
        }
        this.D = nanoTime22;
        this.C = M;
        this.E = z10;
        return M;
    }

    public final long b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.y;
        if (j10 != -9223372036854775807L) {
            return Math.min(this.B, this.A + (((h5.d0.t((elapsedRealtime * 1000) - j10, this.j) * this.g) + 999999) / 1000000));
        }
        if (elapsedRealtime - this.s >= 5) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.v = this.t;
                    }
                    playbackHeadPosition += this.v;
                }
                if (h5.d0.a <= 29) {
                    if (playbackHeadPosition != 0 || this.t <= 0 || playState != 3) {
                        this.z = -9223372036854775807L;
                    } else if (this.z == -9223372036854775807L) {
                        this.z = elapsedRealtime;
                    }
                }
                if (this.t > playbackHeadPosition) {
                    this.u++;
                }
                this.t = playbackHeadPosition;
            }
            this.s = elapsedRealtime;
        }
        return this.t + (this.u << 32);
    }

    public final boolean c(long j10) {
        long a2 = a(false);
        int i10 = this.g;
        int i11 = h5.d0.a;
        if (j10 > ((a2 * i10) + 999999) / 1000000) {
            return true;
        }
        if (this.h) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && b() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        this.l = 0L;
        this.x = 0;
        this.w = 0;
        this.m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.k = false;
    }
}
