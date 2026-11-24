// default package

import android.media.AudioTrack;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class b40 {
    public final a40 a;
    public final int b;
    public final qx4 c;
    public byte d;
    public long e;
    public int f;
    public long g;
    public long h;
    public long i;

    public b40(AudioTrack audioTrack, qx4 qx4Var) {
        this.a = new a40(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = qx4Var;
        a(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i) {
        this.d = i;
        if (i == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
            this.f = 10000;
            return;
        }
        if (i == 1) {
            this.f = 10000;
            return;
        }
        if (i == 2 || i == 3) {
            this.f = 10000000;
        } else if (i == 4) {
            this.f = 500000;
        } else {
            sdb.a();
        }
    }
}
