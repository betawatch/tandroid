package k2;

import android.media.AudioTrack;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
