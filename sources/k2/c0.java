package k2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c0 {
    public final b0 a;
    public final int b;
    public final jg.i c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public c0(AudioTrack audioTrack, jg.i iVar) {
        this.a = new b0(audioTrack);
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
