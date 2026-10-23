package k2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class l0 {
    public boolean A;
    public long B;
    public final ya.d a;
    public final e2.g0 b;
    public final long[] c;
    public final AudioTrack d;
    public final int e;
    public final long f;
    public final boolean g;
    public final b0 h;
    public float i;
    public long j;
    public long k;
    public long l;
    public Method m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public l0(ya.d dVar, e2.g0 g0Var, AudioTrack audioTrack, int i10, int i11, int i12) {
        this.a = dVar;
        this.b = g0Var;
        this.d = audioTrack;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.c = new long[10];
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.h = new b0(audioTrack, dVar);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean M = e2.m0.M(i10);
        this.g = M;
        this.f = M ? e2.m0.Y(sampleRate, i12 / i11) : -9223372036854775807L;
        this.q = 0L;
        this.r = 0L;
        this.A = false;
        this.B = 0L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.o = 0L;
        this.n = 0L;
        this.i = 1.0f;
        this.j = -9223372036854775807L;
    }

    public final long a() {
        if (this.u != -9223372036854775807L) {
            return Math.min(this.x, c());
        }
        this.b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = r4.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.q <= 0 || playState != 3) {
                        this.v = -9223372036854775807L;
                    } else if (this.v == -9223372036854775807L) {
                        this.v = elapsedRealtime;
                    }
                }
                long j10 = this.q;
                if (j10 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j10;
                        this.A = false;
                    } else {
                        this.r++;
                    }
                }
                this.q = playbackHeadPosition;
            }
            this.p = elapsedRealtime;
        }
        return this.q + this.B + (this.r << 32);
    }

    public final long b(long j10) {
        int i10 = this.t;
        int i11 = this.e;
        long max = Math.max(0L, (i10 == 0 ? this.u != -9223372036854775807L ? e2.m0.Y(i11, c()) : e2.m0.Y(i11, a()) : e2.m0.B(j10 + this.k, this.i)) - this.n);
        return this.u != -9223372036854775807L ? Math.min(e2.m0.Y(i11, this.x), max) : max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.w;
        }
        this.b.getClass();
        return this.w + e2.m0.a0(e2.m0.B(e2.m0.S(SystemClock.elapsedRealtime()) - this.u, this.i), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j10) {
        long j11 = this.j;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return;
        }
        long F = e2.m0.F(j10 - j11, this.i);
        this.b.getClass();
        long currentTimeMillis = System.currentTimeMillis() - e2.m0.h0(F);
        this.j = -9223372036854775807L;
        e2.r rVar = ((i0) this.a.b).j;
        rVar.getClass();
        if (Thread.currentThread() == rVar.a) {
            rVar.e(-1, new e0(currentTimeMillis));
        }
    }
}
