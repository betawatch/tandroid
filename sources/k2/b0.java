package k2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class b0 {
    public final a0 a;
    public final int b;
    public final ya.d c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public b0(AudioTrack audioTrack, ya.d dVar) {
        this.a = new a0(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = dVar;
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
