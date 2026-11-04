package m2;

import android.media.AudioTrack;
import gi.v5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b0 {
    public final a0 a;
    public final int b;
    public final v5 c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public b0(AudioTrack audioTrack, v5 v5Var) {
        this.a = new a0(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = v5Var;
        a(0);
    }

    public final void a(int i3) {
        this.d = i3;
        if (i3 == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
            this.f = 10000L;
            return;
        }
        if (i3 == 1) {
            this.f = 10000L;
            return;
        }
        if (i3 == 2 || i3 == 3) {
            this.f = 10000000L;
        } else {
            if (i3 != 4) {
                throw new IllegalStateException();
            }
            this.f = 500000L;
        }
    }
}
