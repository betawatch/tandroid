package j3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j {
    public final com.google.android.exoplayer2.upstream.r a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public int h;
    public boolean i;

    public j(com.google.android.exoplayer2.upstream.r rVar, int i10, int i11) {
        a(i10, 0, "bufferForPlaybackMs", "0");
        a(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        a(50000, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = rVar;
        long j10 = 50000;
        this.b = f5.d0.H(j10);
        this.c = f5.d0.H(j10);
        this.d = f5.d0.H(i10);
        this.e = f5.d0.H(i11);
        this.f = -1;
        this.h = 13107200;
        this.g = f5.d0.H(0);
    }

    public static void a(int i10, int i11, String str, String str2) {
        f5.a.e(str + " cannot be less than " + str2, i10 >= i11);
    }

    public final void b(boolean z10) {
        int i10 = this.f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.h = i10;
        this.i = false;
        if (z10) {
            com.google.android.exoplayer2.upstream.r rVar = this.a;
            synchronized (rVar) {
                if (rVar.a) {
                    rVar.a(0);
                }
            }
        }
    }

    public final boolean c(long j10, float f9) {
        int i10;
        long j11 = this.c;
        com.google.android.exoplayer2.upstream.r rVar = this.a;
        synchronized (rVar) {
            i10 = rVar.d * rVar.b;
        }
        boolean z10 = i10 >= this.h;
        long j12 = this.b;
        if (f9 > 1.0f) {
            j12 = Math.min(f5.d0.s(j12, f9), j11);
        }
        if (j10 < Math.max(j12, 500000L)) {
            this.i = !z10;
            if (z10 && j10 < 500000) {
                f5.a.K("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= j11 || z10) {
            this.i = false;
        }
        return this.i;
    }
}
