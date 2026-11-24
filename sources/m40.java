// default package

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class m40 {
    public boolean A;
    public long B;
    public final qx4 a;
    public final adb b;
    public final long[] c;
    public final AudioTrack d;
    public final int e;
    public final long f;
    public final boolean g;
    public final b40 h;
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

    public m40(qx4 qx4Var, adb adbVar, AudioTrack audioTrack, int i, int i2, int i3) {
        this.a = qx4Var;
        this.b = adbVar;
        this.d = audioTrack;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.c = new long[10];
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.h = new b40(audioTrack, qx4Var);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean N = g8c.N(i);
        this.g = N;
        this.f = N ? g8c.Z(sampleRate, i3 / i2) : -9223372036854775807L;
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
                long j = this.q;
                if (j > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j;
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

    public final long b(long j) {
        int i = this.t;
        int i2 = this.e;
        long max = Math.max(0L, (i == 0 ? this.u != -9223372036854775807L ? g8c.Z(i2, c()) : g8c.Z(i2, a()) : g8c.D(j + this.k, this.i)) - this.n);
        return this.u != -9223372036854775807L ? Math.min(g8c.Z(i2, this.x), max) : max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.w;
        }
        this.b.getClass();
        return this.w + g8c.b0(g8c.D(g8c.T(SystemClock.elapsedRealtime()) - this.u, this.i), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j) {
        long j2 = this.j;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long H = g8c.H(j - j2, this.i);
        this.b.getClass();
        long currentTimeMillis = System.currentTimeMillis() - g8c.i0(H);
        this.j = -9223372036854775807L;
        a66 a66Var = ((j40) this.a.a).i;
        a66Var.getClass();
        if (Thread.currentThread() == a66Var.a) {
            a66Var.e(-1, new f40(currentTimeMillis));
        }
    }

    public final void e() {
        this.k = 0L;
        this.t = 0;
        this.s = 0;
        this.l = 0L;
        this.y = -9223372036854775807L;
        this.z = -9223372036854775807L;
    }
}
