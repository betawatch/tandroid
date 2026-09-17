package k2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class r {
    public final q a;
    public final int b;
    public final xa.c c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public r(AudioTrack audioTrack, xa.c cVar) {
        this.a = new q(audioTrack);
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
