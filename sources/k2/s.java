package k2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class s {
    public final r a;
    public final int b;
    public final a4.m c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public s(AudioTrack audioTrack, a4.m mVar) {
        this.a = new r(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = mVar;
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
