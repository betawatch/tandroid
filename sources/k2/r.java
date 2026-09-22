package k2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class r {
    public final q a;
    public final int b;
    public final c0 c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public r(AudioTrack audioTrack, c0 c0Var) {
        this.a = new q(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = c0Var;
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
