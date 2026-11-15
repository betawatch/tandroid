package n2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class z {
    public final y a;
    public final int b;
    public final gc.b c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public z(AudioTrack audioTrack, gc.b bVar) {
        this.a = new y(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = bVar;
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
