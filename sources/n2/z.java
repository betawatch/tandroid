package n2;

import android.media.AudioTrack;
import hi.w4;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class z {
    public final y a;
    public final int b;
    public final w4 c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public z(AudioTrack audioTrack, w4 w4Var) {
        this.a = new y(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = w4Var;
        a(0);
    }

    public final void a(int i7) {
        this.d = i7;
        if (i7 == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
            this.f = 10000L;
            return;
        }
        if (i7 == 1) {
            this.f = 10000L;
            return;
        }
        if (i7 == 2 || i7 == 3) {
            this.f = 10000000L;
        } else {
            if (i7 != 4) {
                throw new IllegalStateException();
            }
            this.f = 500000L;
        }
    }
}
