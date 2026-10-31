package k2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d0 {
    public final c0 a;
    public final int b;
    public final a4.l c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public d0(AudioTrack audioTrack, a4.l lVar) {
        this.a = new c0(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = lVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
            this.f = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f = 500000L;
        }
    }
}
