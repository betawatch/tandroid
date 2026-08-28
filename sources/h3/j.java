package h3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public j(com.google.android.exoplayer2.upstream.r rVar, int i9, int i10) {
        a(i9, 0, "bufferForPlaybackMs", "0");
        a(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, i9, "minBufferMs", "bufferForPlaybackMs");
        a(50000, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = rVar;
        long j10 = 50000;
        this.b = d5.f0.H(j10);
        this.c = d5.f0.H(j10);
        this.d = d5.f0.H(i9);
        this.e = d5.f0.H(i10);
        this.f = -1;
        this.h = 13107200;
        this.g = d5.f0.H(0);
    }

    public static void a(int i9, int i10, String str, String str2) {
        d5.a.e(str + " cannot be less than " + str2, i9 >= i10);
    }

    public final void b(boolean z10) {
        int i9 = this.f;
        if (i9 == -1) {
            i9 = 13107200;
        }
        this.h = i9;
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

    public final boolean c(long j10, float f10) {
        int i9;
        long j11 = this.c;
        com.google.android.exoplayer2.upstream.r rVar = this.a;
        synchronized (rVar) {
            i9 = rVar.d * rVar.b;
        }
        boolean z10 = i9 >= this.h;
        long j12 = this.b;
        if (f10 > 1.0f) {
            j12 = Math.min(d5.f0.s(j12, f10), j11);
        }
        if (j10 < Math.max(j12, 500000L)) {
            this.i = !z10;
            if (z10 && j10 < 500000) {
                d5.a.K("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= j11 || z10) {
            this.i = false;
        }
        return this.i;
    }
}
