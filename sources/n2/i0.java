package n2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class i0 {
    public boolean A;
    public long B;
    public final g6.d0 a;
    public final h2.g0 b;
    public final long[] c;
    public final AudioTrack d;
    public final int e;
    public final long f;
    public final boolean g;
    public final z h;
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

    public i0(g6.d0 d0Var, h2.g0 g0Var, AudioTrack audioTrack, int i7, int i10, int i11) {
        this.a = d0Var;
        this.b = g0Var;
        this.d = audioTrack;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.c = new long[10];
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.h = new z(audioTrack, d0Var);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean M = h2.m0.M(i7);
        this.g = M;
        this.f = M ? h2.m0.Y(sampleRate, i11 / i10) : -9223372036854775807L;
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
                long j3 = this.q;
                if (j3 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j3;
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

    public final long b(long j3) {
        int i7 = this.t;
        int i10 = this.e;
        long max = Math.max(0L, (i7 == 0 ? this.u != -9223372036854775807L ? h2.m0.Y(i10, c()) : h2.m0.Y(i10, a()) : h2.m0.B(j3 + this.k, this.i)) - this.n);
        return this.u != -9223372036854775807L ? Math.min(h2.m0.Y(i10, this.x), max) : max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.w;
        }
        this.b.getClass();
        return this.w + h2.m0.a0(h2.m0.B(h2.m0.S(SystemClock.elapsedRealtime()) - this.u, this.i), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j3) {
        long j10 = this.j;
        if (j10 == -9223372036854775807L || j3 < j10) {
            return;
        }
        long F = h2.m0.F(j3 - j10, this.i);
        this.b.getClass();
        long currentTimeMillis = System.currentTimeMillis() - h2.m0.h0(F);
        this.j = -9223372036854775807L;
        h2.r rVar = ((f0) this.a.b).j;
        rVar.getClass();
        if (Thread.currentThread() == rVar.a) {
            rVar.e(-1, new c0(currentTimeMillis));
        }
    }
}
