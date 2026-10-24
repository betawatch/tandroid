package k2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class c0 {
    public final b0 a;
    public final int b;
    public final ya.c c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public c0(AudioTrack audioTrack, ya.c cVar) {
        this.a = new b0(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = cVar;
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
