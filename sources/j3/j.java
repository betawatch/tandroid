package j3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j {
    public final g5.q a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public int h;
    public boolean i;

    public j(g5.q qVar, int i10, int i11) {
        a(i10, 0, "bufferForPlaybackMs", "0");
        a(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        a(50000, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = qVar;
        long j10 = 50000;
        this.b = h5.d0.G(j10);
        this.c = h5.d0.G(j10);
        this.d = h5.d0.G(i10);
        this.e = h5.d0.G(i11);
        this.f = -1;
        this.h = 13107200;
        this.g = h5.d0.G(0);
    }

    public static void a(int i10, int i11, String str, String str2) {
        h5.a.e(str + " cannot be less than " + str2, i10 >= i11);
    }

    public final void b(boolean z4) {
        int i10 = this.f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.h = i10;
        this.i = false;
        if (z4) {
            g5.q qVar = this.a;
            synchronized (qVar) {
                if (qVar.a) {
                    qVar.a(0);
                }
            }
        }
    }

    public final boolean c(long j10, float f10) {
        int i10;
        long j11 = this.c;
        g5.q qVar = this.a;
        synchronized (qVar) {
            i10 = qVar.d * qVar.b;
        }
        boolean z4 = i10 >= this.h;
        long j12 = this.b;
        if (f10 > 1.0f) {
            j12 = Math.min(h5.d0.t(j12, f10), j11);
        }
        if (j10 < Math.max(j12, 500000L)) {
            this.i = !z4;
            if (z4 && j10 < 500000) {
                h5.a.K("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= j11 || z4) {
            this.i = false;
        }
        return this.i;
    }
}
