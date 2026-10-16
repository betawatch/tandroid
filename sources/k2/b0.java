package k2;

import android.media.AudioTrack;
import ji.w4;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class b0 {
    public final a0 a;
    public final int b;
    public final w4 c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public b0(AudioTrack audioTrack, w4 w4Var) {
        this.a = new a0(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = w4Var;
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
