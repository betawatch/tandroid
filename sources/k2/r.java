package k2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class r {
    public final q a;
    public final int b;
    public final a6.i c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public r(AudioTrack audioTrack, a6.i iVar) {
        this.a = new q(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = iVar;
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
