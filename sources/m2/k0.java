package m2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import gi.v5;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k0 {
    public boolean A;
    public long B;
    public final v5 a;
    public final g2.h0 b;
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

    public k0(v5 v5Var, g2.h0 h0Var, AudioTrack audioTrack, int i3, int i10, int i11) {
        this.a = v5Var;
        this.b = h0Var;
        this.d = audioTrack;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.c = new long[10];
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.h = new b0(audioTrack, v5Var);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean M = g2.n0.M(i3);
        this.g = M;
        this.f = M ? g2.n0.Y(sampleRate, i11 / i10) : -9223372036854775807L;
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
        int i3 = this.t;
        int i10 = this.e;
        long max = Math.max(0L, (i3 == 0 ? this.u != -9223372036854775807L ? g2.n0.Y(i10, c()) : g2.n0.Y(i10, a()) : g2.n0.B(j10 + this.k, this.i)) - this.n);
        return this.u != -9223372036854775807L ? Math.min(g2.n0.Y(i10, this.x), max) : max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.w;
        }
        this.b.getClass();
        return this.w + g2.n0.a0(g2.n0.B(g2.n0.S(SystemClock.elapsedRealtime()) - this.u, this.i), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j10) {
        long j11 = this.j;
        if (j11 == -9223372036854775807L || j10 < j11) {
            return;
        }
        long F = g2.n0.F(j10 - j11, this.i);
        this.b.getClass();
        long currentTimeMillis = System.currentTimeMillis() - g2.n0.h0(F);
        this.j = -9223372036854775807L;
        g2.s sVar = ((h0) this.a.b).j;
        sVar.getClass();
        if (Thread.currentThread() == sVar.a) {
            sVar.e(-1, new e0(currentTimeMillis));
        }
    }
}
